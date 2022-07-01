import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test501");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        org.junit.Assert.assertNotNull(gsonConverter1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.lang.Class<?> wildcardClass6 = null; // flaky: requestBuilder5.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        java.lang.String str7 = null; // flaky: requestBuilder6.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        java.lang.Object[] objArray2 = requestBuilder1.args;
        java.lang.Object[] objArray3 = requestBuilder1.args;
        retrofit.client.Request request4 = requestBuilder1.build();
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNull(objArray2);
        org.junit.Assert.assertNull(objArray3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "GET" + "'", str6, "GET");
        org.junit.Assert.assertNull(typedOutput7);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter9.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter9.deserializeObjectRequestBuilder17();
        java.lang.Object[] objArray15 = null; // flaky: requestBuilder14.getargs();
// flaky:         requestBuilder8.setargs(objArray15);
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(gsonConverter12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(objArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray15), "[pong, [quick, brown, fox], kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray15), "[pong, [quick, brown, fox], kat]");
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
// flaky:         requestBuilder5.apiUrl = "hi!";
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter12.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter12.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter17 = null; // flaky: requestBuilder16.converter;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
// flaky:         requestBuilder16.setheaders((java.util.List<retrofit.client.Header>) headerList21);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput28);
        retrofit.RequestBuilder requestBuilder30 = null; // flaky: requestBuilder5.headers((java.util.List<retrofit.client.Header>) headerList21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(gsonConverter15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(converter17);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
// flaky:         requestBuilder9.apiUrl = "";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.Converter converter5 = requestBuilder4.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.converter;
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
// flaky:         requestBuilder6.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        java.lang.Object[] objArray19 = new java.lang.Object[] { '4', 10.0d, 100.0d };
        retrofit.RequestBuilder requestBuilder20 = null; // flaky: requestBuilder6.args(objArray19);
        retrofit.RequestBuilder requestBuilder21 = requestBuilder4.args(objArray19);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter22.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter22.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter22.deserializeObjectRequestBuilder12();
        requestBuilder21.serializedObjectSupporter = serializedObjectSupporter22;
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter22.deserializeObjectRequestBuilder17();
        java.lang.String str30 = serializedObjectSupporter22.deserializeObjectString1();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[4, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[4, 10.0, 100.0]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com" + "'", str30, "http://example.com");
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.lang.Object[] objArray7 = null; // flaky: requestBuilder6.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(objArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder2();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter12 = null; // flaky: requestBuilder11.converter;
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
// flaky:         requestBuilder11.setheaders((java.util.List<retrofit.client.Header>) headerList16);
// flaky:         requestBuilder9.setheaders((java.util.List<retrofit.client.Header>) headerList16);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com", "hi!", (java.util.List<retrofit.client.Header>) headerList16, typedOutput22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter28.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter28.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter28.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter28.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter33 = null; // flaky: requestBuilder32.converter;
        retrofit.client.Header[] headerArray36 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList37 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList37, headerArray36);
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList37, typedOutput39);
// flaky:         requestBuilder32.setheaders((java.util.List<retrofit.client.Header>) headerList37);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList37, typedOutput42);
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter44.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder46 = serializedObjectSupporter44.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder47 = serializedObjectSupporter44.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput48 = null; // flaky: requestBuilder47.buildBody();
        retrofit.client.Request request49 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList37, typedOutput48);
        retrofit.client.Request request50 = new retrofit.client.Request("http://example.com/", "http://example.com/foo/bar/100/", (java.util.List<retrofit.client.Header>) headerList16, typedOutput48);
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder54 = serializedObjectSupporter53.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder55 = serializedObjectSupporter53.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder56 = serializedObjectSupporter53.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList57 = requestBuilder56.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder59 = serializedObjectSupporter58.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder60 = serializedObjectSupporter58.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder61 = serializedObjectSupporter58.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput62 = null; // flaky: requestBuilder61.buildBody();
        retrofit.client.Request request63 = new retrofit.client.Request("/foo/bar/pong/", "GET", headerList57, typedOutput62);
        retrofit.client.Request request64 = new retrofit.client.Request("/foo/bar/pong/kat/", "http://example.com/foo/bar/pong%26/?kit=kat%26", (java.util.List<retrofit.client.Header>) headerList16, typedOutput62);
        retrofit.mime.TypedOutput typedOutput65 = request64.getBody();
        java.lang.String str66 = request64.getUrl();
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(converter12);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(gsonConverter31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(converter33);
        org.junit.Assert.assertNotNull(headerArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(requestBuilder45);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder46);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder47);
// flaky:         org.junit.Assert.assertNotNull(typedOutput48);
        org.junit.Assert.assertNotNull(requestBuilder54);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder55);
        org.junit.Assert.assertNotNull(requestBuilder56);
        org.junit.Assert.assertNotNull(headerList57);
        org.junit.Assert.assertNotNull(requestBuilder59);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder60);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder61);
// flaky:         org.junit.Assert.assertNotNull(typedOutput62);
// flaky:         org.junit.Assert.assertNotNull(typedOutput65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "http://example.com/foo/bar/pong%26/?kit=kat%26" + "'", str66, "http://example.com/foo/bar/pong%26/?kit=kat%26");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.client.Request request4 = null; // flaky: requestBuilder3.build();
        java.lang.String str5 = null; // flaky: requestBuilder3.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(request4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter4.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter4.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder7.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter9.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput13 = null; // flaky: requestBuilder12.buildBody();
        retrofit.client.Request request14 = new retrofit.client.Request("/foo/bar/pong/", "GET", headerList8, typedOutput13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter17.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter17.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList21 = requestBuilder20.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter22.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter22.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput26 = null; // flaky: requestBuilder25.buildBody();
        retrofit.client.Request request27 = new retrofit.client.Request("/foo/bar/pong/", "GET", headerList21, typedOutput26);
        retrofit.client.Request request28 = new retrofit.client.Request("http://example.com/", "http://example.com", headerList8, typedOutput26);
        java.lang.String str29 = request28.getMethod();
        retrofit.mime.TypedOutput typedOutput30 = request28.getBody();
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(typedOutput13);
        org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(typedOutput26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "http://example.com/" + "'", str29, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(typedOutput30);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = null; // flaky: requestBuilder7.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = null; // flaky: requestBuilder3.apiUrl("http://example.com/foo/bar/?foo=bar&kit=kat");
        retrofit.client.Request request6 = null; // flaky: requestBuilder5.build();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.mime.TypedOutput typedOutput7 = null; // flaky: requestBuilder6.buildBody();
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder6.getconverter();
        retrofit.client.Request request9 = null; // flaky: requestBuilder6.build();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(typedOutput7);
// flaky:         org.junit.Assert.assertNotNull(converter8);
// flaky:         org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
// flaky:         requestBuilder4.apiUrl = "";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.client.Request request4 = null; // flaky: requestBuilder3.build();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder3.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter11 = null; // flaky: requestBuilder10.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter14 = null; // flaky: requestBuilder13.converter;
        retrofit.client.Header[] headerArray17 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList18 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList18, headerArray17);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList18, typedOutput20);
// flaky:         requestBuilder13.setheaders((java.util.List<retrofit.client.Header>) headerList18);
        java.lang.Object[] objArray26 = new java.lang.Object[] { '4', 10.0d, 100.0d };
        retrofit.RequestBuilder requestBuilder27 = null; // flaky: requestBuilder13.args(objArray26);
        java.lang.Object[] objArray29 = new java.lang.Object[] { objArray26, '4' };
// flaky:         requestBuilder10.args = objArray26;
        retrofit.RequestBuilder requestBuilder31 = null; // flaky: requestBuilder8.args(objArray26);
        retrofit.RequestBuilder requestBuilder32 = null; // flaky: requestBuilder3.args(objArray26);
        retrofit.client.Request request33 = null; // flaky: requestBuilder32.build();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(request4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(converter11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(converter14);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[4, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[4, 10.0, 100.0]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[[4, 10.0, 100.0], 4]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(request33);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder1();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter12 = null; // flaky: requestBuilder11.converter;
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
// flaky:         requestBuilder11.setheaders((java.util.List<retrofit.client.Header>) headerList16);
        requestBuilder6.headers = headerList16;
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter29.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter29.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter29.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList33 = requestBuilder32.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter34.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter34.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter34.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput38 = null; // flaky: requestBuilder37.buildBody();
        retrofit.client.Request request39 = new retrofit.client.Request("/foo/bar/pong/", "GET", headerList33, typedOutput38);
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter42.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter42.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter42.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList46 = requestBuilder45.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder48 = serializedObjectSupporter47.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder49 = serializedObjectSupporter47.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder50 = serializedObjectSupporter47.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput51 = null; // flaky: requestBuilder50.buildBody();
        retrofit.client.Request request52 = new retrofit.client.Request("/foo/bar/pong/", "GET", headerList46, typedOutput51);
        retrofit.client.Request request53 = new retrofit.client.Request("http://example.com/", "http://example.com", headerList33, typedOutput51);
        retrofit.client.Request request54 = new retrofit.client.Request("", "GET", headerList24, typedOutput51);
        retrofit.client.Request request55 = new retrofit.client.Request("", "http://example.com", (java.util.List<retrofit.client.Header>) headerList16, typedOutput51);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(converter12);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNotNull(requestBuilder35);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder37);
// flaky:         org.junit.Assert.assertNotNull(typedOutput38);
        org.junit.Assert.assertNotNull(requestBuilder43);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(requestBuilder45);
        org.junit.Assert.assertNotNull(headerList46);
        org.junit.Assert.assertNotNull(requestBuilder48);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder49);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder50);
// flaky:         org.junit.Assert.assertNotNull(typedOutput51);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.mime.TypedOutput typedOutput8 = null; // flaky: requestBuilder7.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNull(typedOutput8);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
// flaky:         requestBuilder12.setapiUrl("http://example.com/foo/bar/100/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder4.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.client.Request request3 = null; // flaky: requestBuilder2.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = null; // flaky: requestBuilder2.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(request3);
        org.junit.Assert.assertNull(serializedObjectSupporter4);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.mime.TypedOutput typedOutput6 = null; // flaky: requestBuilder5.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(typedOutput6);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.lang.String str6 = null; // flaky: requestBuilder5.apiUrl;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter13.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter13.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter13.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter18 = null; // flaky: requestBuilder17.converter;
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
// flaky:         requestBuilder17.setheaders((java.util.List<retrofit.client.Header>) headerList22);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList22, typedOutput27);
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter29.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter29.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter29.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput33 = null; // flaky: requestBuilder32.buildBody();
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList22, typedOutput33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter37.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter37.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter37.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter37.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter37.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter37.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter37.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter45 = serializedObjectSupporter37.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder46 = serializedObjectSupporter37.deserializeObjectRequestBuilder17();
// flaky:         requestBuilder46.apiUrl = "http://example.com/";
        java.util.List<retrofit.client.Header> headerList49 = null; // flaky: requestBuilder46.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder51 = serializedObjectSupporter50.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder52 = serializedObjectSupporter50.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter50.deserializeObjectRequestBuilder2();
        retrofit.SerializedObjectSupporter serializedObjectSupporter54 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder55 = serializedObjectSupporter54.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter56 = null; // flaky: requestBuilder55.converter;
        retrofit.client.Header[] headerArray59 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList60 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList60, headerArray59);
        retrofit.mime.TypedOutput typedOutput62 = null;
        retrofit.client.Request request63 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList60, typedOutput62);
// flaky:         requestBuilder55.setheaders((java.util.List<retrofit.client.Header>) headerList60);
// flaky:         requestBuilder53.setheaders((java.util.List<retrofit.client.Header>) headerList60);
        java.util.List<retrofit.client.Header> headerList66 = null; // flaky: requestBuilder53.headers;
// flaky:         requestBuilder46.setheaders(headerList66);
        retrofit.SerializedObjectSupporter serializedObjectSupporter72 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder73 = serializedObjectSupporter72.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder74 = serializedObjectSupporter72.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder75 = serializedObjectSupporter72.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList76 = requestBuilder75.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter77 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder78 = serializedObjectSupporter77.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder79 = serializedObjectSupporter77.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder80 = serializedObjectSupporter77.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput81 = null; // flaky: requestBuilder80.buildBody();
        retrofit.client.Request request82 = new retrofit.client.Request("/foo/bar/pong/", "GET", headerList76, typedOutput81);
        retrofit.SerializedObjectSupporter serializedObjectSupporter85 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder86 = serializedObjectSupporter85.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder87 = serializedObjectSupporter85.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder88 = serializedObjectSupporter85.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList89 = requestBuilder88.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter90 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder91 = serializedObjectSupporter90.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder92 = serializedObjectSupporter90.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder93 = serializedObjectSupporter90.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput94 = null; // flaky: requestBuilder93.buildBody();
        retrofit.client.Request request95 = new retrofit.client.Request("/foo/bar/pong/", "GET", headerList89, typedOutput94);
        retrofit.client.Request request96 = new retrofit.client.Request("http://example.com/", "http://example.com", headerList76, typedOutput94);
        retrofit.client.Request request97 = new retrofit.client.Request("/foo/bar/", "hi!", headerList66, typedOutput94);
        retrofit.client.Request request98 = new retrofit.client.Request("/foo/bar/pong/kat/", "http://example.com/foo/bar/100/", (java.util.List<retrofit.client.Header>) headerList22, typedOutput94);
// flaky:         requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(gsonConverter16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(converter18);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(typedOutput33);
        org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(requestBuilder40);
        org.junit.Assert.assertNotNull(requestBuilder41);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(gsonConverter45);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder46);
// flaky:         org.junit.Assert.assertNotNull(headerList49);
        org.junit.Assert.assertNotNull(requestBuilder51);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder52);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder53);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder55);
// flaky:         org.junit.Assert.assertNotNull(converter56);
        org.junit.Assert.assertNotNull(headerArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
// flaky:         org.junit.Assert.assertNotNull(headerList66);
        org.junit.Assert.assertNotNull(requestBuilder73);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder74);
        org.junit.Assert.assertNotNull(requestBuilder75);
        org.junit.Assert.assertNotNull(headerList76);
        org.junit.Assert.assertNotNull(requestBuilder78);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder79);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder80);
// flaky:         org.junit.Assert.assertNotNull(typedOutput81);
        org.junit.Assert.assertNotNull(requestBuilder86);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder87);
        org.junit.Assert.assertNotNull(requestBuilder88);
        org.junit.Assert.assertNotNull(headerList89);
        org.junit.Assert.assertNotNull(requestBuilder91);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder92);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder93);
// flaky:         org.junit.Assert.assertNotNull(typedOutput94);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.client.Request request4 = null; // flaky: requestBuilder3.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter9.deserializeObjectRequestBuilder2();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter15 = null; // flaky: requestBuilder14.converter;
        retrofit.client.Header[] headerArray18 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList19 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList19, headerArray18);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList19, typedOutput21);
// flaky:         requestBuilder14.setheaders((java.util.List<retrofit.client.Header>) headerList19);
// flaky:         requestBuilder12.setheaders((java.util.List<retrofit.client.Header>) headerList19);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("http://example.com", "hi!", (java.util.List<retrofit.client.Header>) headerList19, typedOutput25);
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter31.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter31.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter31.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter31.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter36 = null; // flaky: requestBuilder35.converter;
        retrofit.client.Header[] headerArray39 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList40 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList40, headerArray39);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList40, typedOutput42);
// flaky:         requestBuilder35.setheaders((java.util.List<retrofit.client.Header>) headerList40);
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList40, typedOutput45);
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder48 = serializedObjectSupporter47.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder49 = serializedObjectSupporter47.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder50 = serializedObjectSupporter47.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput51 = null; // flaky: requestBuilder50.buildBody();
        retrofit.client.Request request52 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList40, typedOutput51);
        retrofit.client.Request request53 = new retrofit.client.Request("http://example.com/", "http://example.com/foo/bar/100/", (java.util.List<retrofit.client.Header>) headerList19, typedOutput51);
        retrofit.RequestBuilder requestBuilder54 = null; // flaky: requestBuilder3.headers((java.util.List<retrofit.client.Header>) headerList19);
// flaky:         requestBuilder3.apiUrl = "/foo/bar/pong/kat/";
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(converter15);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(gsonConverter34);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder35);
// flaky:         org.junit.Assert.assertNotNull(converter36);
        org.junit.Assert.assertNotNull(headerArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(requestBuilder48);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder49);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder50);
// flaky:         org.junit.Assert.assertNotNull(typedOutput51);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder54);
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder15();
        java.util.List<retrofit.client.Header> headerList7 = null; // flaky: requestBuilder6.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter14.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter14.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter14.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter14.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter19 = null; // flaky: requestBuilder18.converter;
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
// flaky:         requestBuilder18.setheaders((java.util.List<retrofit.client.Header>) headerList23);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput30);
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter34.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter36 = null; // flaky: requestBuilder35.converter;
        retrofit.client.Header[] headerArray39 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList40 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList40, headerArray39);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList40, typedOutput42);
// flaky:         requestBuilder35.setheaders((java.util.List<retrofit.client.Header>) headerList40);
        retrofit.SerializedObjectSupporter serializedObjectSupporter45 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder46 = serializedObjectSupporter45.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder47 = serializedObjectSupporter45.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder48 = serializedObjectSupporter45.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput49 = null; // flaky: requestBuilder48.buildBody();
        retrofit.client.Request request50 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList40, typedOutput49);
        retrofit.client.Request request51 = new retrofit.client.Request("", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList23, typedOutput49);
        retrofit.client.Request request52 = new retrofit.client.Request("http://example.com/foo/bar/100/", "hi!", headerList7, typedOutput49);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(gsonConverter17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(converter19);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder35);
// flaky:         org.junit.Assert.assertNotNull(converter36);
        org.junit.Assert.assertNotNull(headerArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(requestBuilder46);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder47);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder48);
// flaky:         org.junit.Assert.assertNotNull(typedOutput49);
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = requestBuilder4.apiUrl("http://example.com/foo/bar/pong%26/?kit=kat%26");
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter6.deserializeObjectConverter4();
        java.util.ArrayList arrayList10 = serializedObjectSupporter6.deserializeObjectList3();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter6.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter14 = null; // flaky: requestBuilder13.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertNotNull(gsonConverter12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(converter14);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.Converter converter8 = requestBuilder7.converter;
        retrofit.RequestBuilder requestBuilder9 = new retrofit.RequestBuilder(converter8);
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(converter8);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter10.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter10.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter10.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter10.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter10.deserializeObjectRequestBuilder25();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder17.getheaders();
        requestBuilder9.setheaders(headerList18);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(headerList18);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter5.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter5.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter5.deserializeObjectRequestBuilder1();
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter11.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter13 = null; // flaky: requestBuilder12.converter;
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
// flaky:         requestBuilder12.setheaders((java.util.List<retrofit.client.Header>) headerList17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter22.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter22.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput26 = null; // flaky: requestBuilder25.buildBody();
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList17, typedOutput26);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter30.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter30.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter30.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter30.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter35 = null; // flaky: requestBuilder34.converter;
        retrofit.client.Header[] headerArray38 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList39 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList39, headerArray38);
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList39, typedOutput41);
// flaky:         requestBuilder34.setheaders((java.util.List<retrofit.client.Header>) headerList39);
        retrofit.client.Header[] headerArray48 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList49 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList49, headerArray48);
        retrofit.mime.TypedOutput typedOutput51 = null;
        retrofit.client.Request request52 = new retrofit.client.Request("http://example.com", "GET", (java.util.List<retrofit.client.Header>) headerList49, typedOutput51);
        retrofit.client.Header[] headerArray57 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList58 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList58, headerArray57);
        retrofit.mime.TypedOutput typedOutput60 = null;
        retrofit.client.Request request61 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList58, typedOutput60);
        retrofit.SerializedObjectSupporter serializedObjectSupporter66 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder67 = serializedObjectSupporter66.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder68 = serializedObjectSupporter66.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter69 = serializedObjectSupporter66.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder70 = serializedObjectSupporter66.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter71 = null; // flaky: requestBuilder70.converter;
        retrofit.client.Header[] headerArray74 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList75 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList75, headerArray74);
        retrofit.mime.TypedOutput typedOutput77 = null;
        retrofit.client.Request request78 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList75, typedOutput77);
// flaky:         requestBuilder70.setheaders((java.util.List<retrofit.client.Header>) headerList75);
        retrofit.mime.TypedOutput typedOutput80 = null;
        retrofit.client.Request request81 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList75, typedOutput80);
        retrofit.SerializedObjectSupporter serializedObjectSupporter82 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder83 = serializedObjectSupporter82.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder84 = serializedObjectSupporter82.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder85 = serializedObjectSupporter82.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput86 = null; // flaky: requestBuilder85.buildBody();
        retrofit.client.Request request87 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList75, typedOutput86);
        retrofit.client.Request request88 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList58, typedOutput86);
        retrofit.client.Request request89 = new retrofit.client.Request("/foo/bar/pong/", "hi!", (java.util.List<retrofit.client.Header>) headerList49, typedOutput86);
        retrofit.client.Request request90 = new retrofit.client.Request("http://example.com/", "", (java.util.List<retrofit.client.Header>) headerList39, typedOutput86);
        retrofit.client.Request request91 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput86);
        retrofit.mime.TypedOutput typedOutput92 = request91.getBody();
        retrofit.client.Request request93 = new retrofit.client.Request("GET", "/foo/bar/pong/", headerList6, typedOutput92);
        retrofit.mime.TypedOutput typedOutput94 = request93.getBody();
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(converter13);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(typedOutput26);
        org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(gsonConverter33);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder34);
// flaky:         org.junit.Assert.assertNotNull(converter35);
        org.junit.Assert.assertNotNull(headerArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(headerArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(headerArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(requestBuilder67);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder68);
        org.junit.Assert.assertNotNull(gsonConverter69);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder70);
// flaky:         org.junit.Assert.assertNotNull(converter71);
        org.junit.Assert.assertNotNull(headerArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(requestBuilder83);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder84);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder85);
// flaky:         org.junit.Assert.assertNotNull(typedOutput86);
// flaky:         org.junit.Assert.assertNotNull(typedOutput92);
// flaky:         org.junit.Assert.assertNotNull(typedOutput94);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder7.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter9.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter9.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter9.deserializeObjectRequestBuilder19();
        retrofit.mime.TypedOutput typedOutput16 = null; // flaky: requestBuilder15.buildBody();
        retrofit.client.Request request17 = new retrofit.client.Request("/foo/bar/pong/", "http://example.com", headerList8, typedOutput16);
        retrofit.client.Request request18 = new retrofit.client.Request("GET", "GET", headerList2, typedOutput16);
        java.lang.String str19 = request18.getMethod();
        java.lang.String str20 = request18.getUrl();
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GET" + "'", str19, "GET");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GET" + "'", str20, "GET");
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = null; // flaky: requestBuilder2.serializedObjectSupporter;
        java.lang.String str4 = null; // flaky: requestBuilder2.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/foo/bar/" + "'", str4, "/foo/bar/");
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.util.List<retrofit.client.Header> headerList7 = null; // flaky: requestBuilder6.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter6.deserializeObjectConverter4();
        java.util.ArrayList arrayList10 = serializedObjectSupporter6.deserializeObjectList3();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter6.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder11();
        java.lang.String str14 = serializedObjectSupporter6.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(arrayList10);
        org.junit.Assert.assertNotNull(gsonConverter12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com/" + "'", str14, "http://example.com/");
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.List<retrofit.client.Header> headerList6 = null; // flaky: requestBuilder5.headers;
        retrofit.RequestBuilder requestBuilder8 = null; // flaky: requestBuilder5.apiUrl("");
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(headerList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
// flaky:         requestBuilder7.setapiUrl("http://example.com/foo/bar/pong%26/?kit=kat%26");
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.client.Request request4 = null; // flaky: requestBuilder3.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList9 = serializedObjectSupporter5.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter11.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter11.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter11.deserializeObjectRequestBuilder18();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter17.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter17.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter17.deserializeObjectRequestBuilder20();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder11();
        java.util.ArrayList arrayList24 = serializedObjectSupporter22.deserializeObjectList2();
        java.lang.Object[] objArray25 = new java.lang.Object[] { requestBuilder15, (short) -1, requestBuilder21, serializedObjectSupporter22 };
        retrofit.RequestBuilder requestBuilder26 = null; // flaky: requestBuilder10.args(objArray25);
// flaky:         requestBuilder3.setargs(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(gsonConverter14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(gsonConverter19);
        org.junit.Assert.assertNotNull(gsonConverter20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertNotNull(objArray25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter6.deserializeObjectConverter4();
        java.util.ArrayList arrayList10 = serializedObjectSupporter6.deserializeObjectList3();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter6.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter6.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter6.deserializeObjectRequestBuilder28();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(arrayList10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter6.deserializeObjectConverter4();
        java.util.ArrayList arrayList10 = serializedObjectSupporter6.deserializeObjectList3();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter6.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter6.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter6.deserializeObjectRequestBuilder26();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(arrayList10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder8.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter14 = null; // flaky: requestBuilder13.converter;
        retrofit.client.Header[] headerArray17 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList18 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList18, headerArray17);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList18, typedOutput20);
// flaky:         requestBuilder13.setheaders((java.util.List<retrofit.client.Header>) headerList18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter23.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter23.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter23.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput27 = null; // flaky: requestBuilder26.buildBody();
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList18, typedOutput27);
        retrofit.client.Request request29 = new retrofit.client.Request("http://example.com/foo/bar/?foo=bar&kit=kat", "http://example.com/foo/bar/?foo=bar&kit=kat", headerList9, typedOutput27);
        retrofit.client.Request request30 = new retrofit.client.Request("http://example.com", "http://example.com/foo/bar/pong%26/?kit=kat%26", headerList2, typedOutput27);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(headerList9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(converter14);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(typedOutput27);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.Object[] objArray4 = requestBuilder3.args;
        retrofit.RequestBuilder requestBuilder6 = requestBuilder3.apiUrl("http://example.com/");
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter9.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter14 = null; // flaky: requestBuilder13.converter;
        retrofit.client.Header[] headerArray17 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList18 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList18, headerArray17);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList18, typedOutput20);
// flaky:         requestBuilder13.setheaders((java.util.List<retrofit.client.Header>) headerList18);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList18, typedOutput23);
        requestBuilder6.headers = headerList18;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(converter14);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.mime.TypedOutput typedOutput7 = null; // flaky: requestBuilder6.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder15();
        java.util.List<retrofit.client.Header> headerList13 = null; // flaky: requestBuilder12.getheaders();
        retrofit.RequestBuilder requestBuilder14 = null; // flaky: requestBuilder6.headers(headerList13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter15.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList19 = serializedObjectSupporter15.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter15.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter21.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter21.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter21.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter21.deserializeObjectRequestBuilder18();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter27.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter27.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter30 = serializedObjectSupporter27.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter27.deserializeObjectRequestBuilder20();
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter32.deserializeObjectRequestBuilder11();
        java.util.ArrayList arrayList34 = serializedObjectSupporter32.deserializeObjectList2();
        java.lang.Object[] objArray35 = new java.lang.Object[] { requestBuilder25, (short) -1, requestBuilder31, serializedObjectSupporter32 };
        retrofit.RequestBuilder requestBuilder36 = null; // flaky: requestBuilder20.args(objArray35);
        retrofit.client.Request request37 = null; // flaky: requestBuilder36.build();
        java.lang.Object[] objArray38 = null; // flaky: requestBuilder36.getargs();
// flaky:         requestBuilder6.args = objArray38;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(typedOutput7);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(headerList13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(arrayList19);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(gsonConverter24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(gsonConverter29);
        org.junit.Assert.assertNotNull(gsonConverter30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(arrayList34);
        org.junit.Assert.assertNotNull(objArray35);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
// flaky:         org.junit.Assert.assertNotNull(request37);
// flaky:         org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.converter;
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
// flaky:         requestBuilder6.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        retrofit.RequestBuilder requestBuilder16 = null; // flaky: requestBuilder4.headers((java.util.List<retrofit.client.Header>) headerList11);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.client.Request request4 = null; // flaky: requestBuilder3.build();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder3.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter11 = null; // flaky: requestBuilder10.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter14 = null; // flaky: requestBuilder13.converter;
        retrofit.client.Header[] headerArray17 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList18 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList18, headerArray17);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList18, typedOutput20);
// flaky:         requestBuilder13.setheaders((java.util.List<retrofit.client.Header>) headerList18);
        java.lang.Object[] objArray26 = new java.lang.Object[] { '4', 10.0d, 100.0d };
        retrofit.RequestBuilder requestBuilder27 = null; // flaky: requestBuilder13.args(objArray26);
        java.lang.Object[] objArray29 = new java.lang.Object[] { objArray26, '4' };
// flaky:         requestBuilder10.args = objArray26;
        retrofit.RequestBuilder requestBuilder31 = null; // flaky: requestBuilder8.args(objArray26);
        retrofit.RequestBuilder requestBuilder32 = null; // flaky: requestBuilder3.args(objArray26);
// flaky:         requestBuilder3.setapiUrl("/foo/bar/pong/");
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(request4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(converter11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(converter14);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[4, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[4, 10.0, 100.0]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray29), "[[4, 10.0, 100.0], 4]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter4 = requestBuilder1.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(converter4);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter10 = null; // flaky: requestBuilder9.converter;
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
// flaky:         requestBuilder9.setheaders((java.util.List<retrofit.client.Header>) headerList14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter19.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter19.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter19.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput23 = null; // flaky: requestBuilder22.buildBody();
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList14, typedOutput23);
// flaky:         requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList14);
// flaky:         requestBuilder5.setapiUrl("");
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(converter10);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(typedOutput23);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.Object[] objArray4 = null; // flaky: requestBuilder3.getargs();
        java.util.List<retrofit.client.Header> headerList5 = null; // flaky: requestBuilder3.headers;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(objArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[pong]");
// flaky:         org.junit.Assert.assertNotNull(headerList5);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder8();
        retrofit.converter.Converter converter11 = null; // flaky: requestBuilder10.getconverter();
        retrofit.client.Request request12 = null; // flaky: requestBuilder10.build();
        java.util.List<retrofit.client.Header> headerList13 = null; // flaky: request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null; // flaky: request12.getBody();
        java.util.List<retrofit.client.Header> headerList15 = null; // flaky: request12.getHeaders();
        requestBuilder4.setheaders(headerList15);
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(converter11);
// flaky:         org.junit.Assert.assertNotNull(request12);
// flaky:         org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput14);
// flaky:         org.junit.Assert.assertNotNull(headerList15);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.converter;
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
// flaky:         requestBuilder6.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        java.lang.Object[] objArray19 = new java.lang.Object[] { '4', 10.0d, 100.0d };
        retrofit.RequestBuilder requestBuilder20 = null; // flaky: requestBuilder6.args(objArray19);
        retrofit.RequestBuilder requestBuilder21 = requestBuilder4.args(objArray19);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter22.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter22.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter22.deserializeObjectRequestBuilder12();
        requestBuilder21.serializedObjectSupporter = serializedObjectSupporter22;
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter22.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter22.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[4, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[4, 10.0, 100.0]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.converter;
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
// flaky:         requestBuilder6.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        java.lang.Object[] objArray19 = new java.lang.Object[] { '4', 10.0d, 100.0d };
        retrofit.RequestBuilder requestBuilder20 = null; // flaky: requestBuilder6.args(objArray19);
        retrofit.RequestBuilder requestBuilder21 = requestBuilder4.args(objArray19);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter22.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter22.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter22.deserializeObjectRequestBuilder12();
        requestBuilder21.serializedObjectSupporter = serializedObjectSupporter22;
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter22.deserializeObjectRequestBuilder17();
        java.lang.String str30 = serializedObjectSupporter22.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter22.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter22.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[4, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[4, 10.0, 100.0]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com/" + "'", str30, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList6 = serializedObjectSupporter2.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter2.deserializeObjectRequestBuilder10();
        retrofit.client.Request request8 = null; // flaky: requestBuilder7.build();
        java.util.List<retrofit.client.Header> headerList9 = null; // flaky: requestBuilder7.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter12.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter12.deserializeObjectRequestBuilder30();
        java.lang.String str16 = requestBuilder15.getapiUrl();
        requestBuilder15.apiUrl = "hi!";
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder15.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter22.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter22.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList26 = requestBuilder25.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter29.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter31 = null; // flaky: requestBuilder30.converter;
        retrofit.client.Header[] headerArray34 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList35 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList35, headerArray34);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList35, typedOutput37);
// flaky:         requestBuilder30.setheaders((java.util.List<retrofit.client.Header>) headerList35);
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter40.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter40.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter40.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput44 = null; // flaky: requestBuilder43.buildBody();
        retrofit.client.Request request45 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList35, typedOutput44);
        retrofit.client.Request request46 = new retrofit.client.Request("http://example.com/foo/bar/?foo=bar&kit=kat", "http://example.com/foo/bar/?foo=bar&kit=kat", headerList26, typedOutput44);
        retrofit.client.Request request47 = new retrofit.client.Request("/foo/bar/pong/", "/foo/bar/pong/", headerList19, typedOutput44);
        retrofit.client.Request request48 = new retrofit.client.Request("/", "/", headerList9, typedOutput44);
        java.lang.String str49 = request48.getUrl();
        java.util.List<retrofit.client.Header> headerList50 = request48.getHeaders();
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(request8);
// flaky:         org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com" + "'", str16, "http://example.com");
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(headerList26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(converter31);
        org.junit.Assert.assertNotNull(headerArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(requestBuilder41);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder42);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder43);
// flaky:         org.junit.Assert.assertNotNull(typedOutput44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "/" + "'", str49, "/");
        org.junit.Assert.assertNotNull(headerList50);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter8.deserializeObjectRequestBuilder7();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter15.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter15.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter20.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter22 = null; // flaky: requestBuilder21.converter;
        retrofit.client.Header[] headerArray25 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList26 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList26, headerArray25);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList26, typedOutput28);
// flaky:         requestBuilder21.setheaders((java.util.List<retrofit.client.Header>) headerList26);
        java.lang.Object[] objArray34 = new java.lang.Object[] { '4', 10.0d, 100.0d };
        retrofit.RequestBuilder requestBuilder35 = null; // flaky: requestBuilder21.args(objArray34);
        retrofit.RequestBuilder requestBuilder36 = requestBuilder19.args(objArray34);
        java.lang.Object[] objArray37 = requestBuilder36.getargs();
        retrofit.RequestBuilder requestBuilder38 = null; // flaky: requestBuilder14.args(objArray37);
        java.lang.Object[] objArray39 = null; // flaky: requestBuilder38.args;
// flaky:         requestBuilder7.args = objArray39;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(gsonConverter18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(converter22);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray34), "[4, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray34), "[4, 10.0, 100.0]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(requestBuilder36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[4, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[4, 10.0, 100.0]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder38);
// flaky:         org.junit.Assert.assertNotNull(objArray39);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[4, 10.0, 100.0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[4, 10.0, 100.0]");
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com" + "'", str3, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder8 = null; // flaky: requestBuilder6.apiUrl("http://example.com/");
        // The following exception was thrown during execution in test generation
        try {
            retrofit.mime.TypedOutput typedOutput9 = null; // flaky: requestBuilder6.buildBody();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Multipart part must not be null: ping.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections9 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.converter;
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
// flaky:         requestBuilder6.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        java.lang.Object[] objArray19 = new java.lang.Object[] { '4', 10.0d, 100.0d };
        retrofit.RequestBuilder requestBuilder20 = null; // flaky: requestBuilder6.args(objArray19);
        retrofit.RequestBuilder requestBuilder21 = requestBuilder4.args(objArray19);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter22.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter22.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter22.deserializeObjectRequestBuilder12();
        requestBuilder21.serializedObjectSupporter = serializedObjectSupporter22;
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter22.deserializeObjectRequestBuilder15();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter30.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter30.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter33 = serializedObjectSupporter30.deserializeObjectConverter7();
        java.lang.String str34 = serializedObjectSupporter30.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter30.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter30.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter30.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter30.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter30.deserializeObjectConverter8();
// flaky:         requestBuilder29.serializedObjectSupporter = serializedObjectSupporter30;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[4, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[4, 10.0, 100.0]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNotNull(gsonConverter32);
        org.junit.Assert.assertNotNull(gsonConverter33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "http://example.com/" + "'", str34, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(gsonConverter36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(gsonConverter38);
        org.junit.Assert.assertNotNull(gsonConverter39);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder7.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(converter8);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("http://example.com", "GET", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("http://example.com", "GET", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter31.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter31.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter31.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter31.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter36 = null; // flaky: requestBuilder35.converter;
        retrofit.client.Header[] headerArray39 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList40 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList40, headerArray39);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList40, typedOutput42);
// flaky:         requestBuilder35.setheaders((java.util.List<retrofit.client.Header>) headerList40);
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList40, typedOutput45);
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder48 = serializedObjectSupporter47.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder49 = serializedObjectSupporter47.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder50 = serializedObjectSupporter47.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput51 = null; // flaky: requestBuilder50.buildBody();
        retrofit.client.Request request52 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList40, typedOutput51);
        retrofit.client.Request request53 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput51);
        retrofit.client.Request request54 = new retrofit.client.Request("/foo/bar/pong/", "hi!", (java.util.List<retrofit.client.Header>) headerList14, typedOutput51);
        retrofit.client.Request request55 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput51);
        java.lang.String str56 = request55.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(gsonConverter34);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder35);
// flaky:         org.junit.Assert.assertNotNull(converter36);
        org.junit.Assert.assertNotNull(headerArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(requestBuilder48);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder49);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder50);
// flaky:         org.junit.Assert.assertNotNull(typedOutput51);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
// flaky:         requestBuilder9.apiUrl = "http://example.com/";
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter12.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter12.deserializeObjectRequestBuilder18();
        retrofit.client.Header[] headerArray19 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList20 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList20, headerArray19);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList20, typedOutput22);
// flaky:         requestBuilder16.headers = headerList20;
        java.util.List<retrofit.client.Header> headerList25 = null; // flaky: requestBuilder16.getheaders();
// flaky:         requestBuilder9.headers = headerList25;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(gsonConverter15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertNotNull(headerList25);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
// flaky:         requestBuilder7.setapiUrl("http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder30();
        java.lang.String str6 = serializedObjectSupporter4.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter4.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter4.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder3.serializedObjectSupporter = serializedObjectSupporter4;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter15 = null; // flaky: requestBuilder14.converter;
        retrofit.client.Header[] headerArray18 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList19 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList19, headerArray18);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList19, typedOutput21);
// flaky:         requestBuilder14.setheaders((java.util.List<retrofit.client.Header>) headerList19);
        retrofit.RequestBuilder requestBuilder24 = requestBuilder12.headers((java.util.List<retrofit.client.Header>) headerList19);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter25.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter25.deserializeObjectRequestBuilder4();
        java.lang.Object[] objArray28 = null; // flaky: requestBuilder27.args;
        retrofit.RequestBuilder requestBuilder29 = requestBuilder24.args(objArray28);
        retrofit.RequestBuilder requestBuilder30 = null; // flaky: requestBuilder3.args(objArray28);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(converter15);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(objArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray28), "[pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray28), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder9.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter15 = null; // flaky: requestBuilder14.converter;
        retrofit.client.Header[] headerArray18 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList19 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList19, headerArray18);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList19, typedOutput21);
// flaky:         requestBuilder14.setheaders((java.util.List<retrofit.client.Header>) headerList19);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter24.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter24.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter24.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput28 = null; // flaky: requestBuilder27.buildBody();
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList19, typedOutput28);
        retrofit.client.Request request30 = new retrofit.client.Request("http://example.com/foo/bar/?foo=bar&kit=kat", "http://example.com/foo/bar/?foo=bar&kit=kat", headerList10, typedOutput28);
        retrofit.client.Header[] headerArray33 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList34 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList34, headerArray33);
        retrofit.client.Header[] headerArray40 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList41 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList41, headerArray40);
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList41, typedOutput43);
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder50 = serializedObjectSupporter49.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder51 = serializedObjectSupporter49.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter49.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter49.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter54 = null; // flaky: requestBuilder53.converter;
        retrofit.client.Header[] headerArray57 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList58 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList58, headerArray57);
        retrofit.mime.TypedOutput typedOutput60 = null;
        retrofit.client.Request request61 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList58, typedOutput60);
// flaky:         requestBuilder53.setheaders((java.util.List<retrofit.client.Header>) headerList58);
        retrofit.mime.TypedOutput typedOutput63 = null;
        retrofit.client.Request request64 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList58, typedOutput63);
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder66 = serializedObjectSupporter65.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder67 = serializedObjectSupporter65.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder68 = serializedObjectSupporter65.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput69 = null; // flaky: requestBuilder68.buildBody();
        retrofit.client.Request request70 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList58, typedOutput69);
        retrofit.client.Request request71 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList41, typedOutput69);
        retrofit.client.Request request72 = new retrofit.client.Request("http://example.com/", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList34, typedOutput69);
        retrofit.client.Request request73 = new retrofit.client.Request("hi!", "hi!", headerList10, typedOutput69);
        retrofit.SerializedObjectSupporter serializedObjectSupporter74 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder75 = serializedObjectSupporter74.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder76 = serializedObjectSupporter74.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter77 = serializedObjectSupporter74.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder78 = serializedObjectSupporter74.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder79 = serializedObjectSupporter74.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder80 = serializedObjectSupporter74.deserializeObjectRequestBuilder19();
        retrofit.mime.TypedOutput typedOutput81 = null; // flaky: requestBuilder80.buildBody();
        retrofit.client.Request request82 = null; // flaky: requestBuilder80.build();
        retrofit.mime.TypedOutput typedOutput83 = null; // flaky: request82.getBody();
        retrofit.client.Request request84 = new retrofit.client.Request("/foo/bar/", "/foo/bar/", headerList10, typedOutput83);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(headerList10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(converter15);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(typedOutput28);
        org.junit.Assert.assertNotNull(headerArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(headerArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(requestBuilder50);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder51);
        org.junit.Assert.assertNotNull(gsonConverter52);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder53);
// flaky:         org.junit.Assert.assertNotNull(converter54);
        org.junit.Assert.assertNotNull(headerArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(requestBuilder66);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder67);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder68);
// flaky:         org.junit.Assert.assertNotNull(typedOutput69);
        org.junit.Assert.assertNotNull(requestBuilder75);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder76);
        org.junit.Assert.assertNotNull(gsonConverter77);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder78);
        org.junit.Assert.assertNotNull(requestBuilder79);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder80);
// flaky:         org.junit.Assert.assertNotNull(typedOutput81);
// flaky:         org.junit.Assert.assertNotNull(request82);
// flaky:         org.junit.Assert.assertNotNull(typedOutput83);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter7();
        java.lang.String str9 = serializedObjectSupporter5.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder29();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter5.deserializeObjectRequestBuilder23();
        java.lang.String str14 = serializedObjectSupporter5.deserializeObjectString1();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "http://example.com" + "'", str14, "http://example.com");
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str5 = null; // flaky: requestBuilder4.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList10 = serializedObjectSupporter6.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder10();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter6.deserializeObjectRequestBuilder22();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(arrayList10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        requestBuilder7.apiUrl = "http://example.com";
        retrofit.mime.TypedOutput typedOutput10 = requestBuilder7.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNull(typedOutput10);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter13.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter13.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter13.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter18 = null; // flaky: requestBuilder17.converter;
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
// flaky:         requestBuilder17.setheaders((java.util.List<retrofit.client.Header>) headerList22);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList22, typedOutput27);
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter29.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter29.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter29.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput33 = null; // flaky: requestBuilder32.buildBody();
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList22, typedOutput33);
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter37.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter39 = serializedObjectSupporter37.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter37.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter37.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter37.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter37.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter37.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter45 = serializedObjectSupporter37.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder46 = serializedObjectSupporter37.deserializeObjectRequestBuilder17();
// flaky:         requestBuilder46.apiUrl = "http://example.com/";
        java.util.List<retrofit.client.Header> headerList49 = null; // flaky: requestBuilder46.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder51 = serializedObjectSupporter50.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder52 = serializedObjectSupporter50.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter50.deserializeObjectRequestBuilder2();
        retrofit.SerializedObjectSupporter serializedObjectSupporter54 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder55 = serializedObjectSupporter54.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter56 = null; // flaky: requestBuilder55.converter;
        retrofit.client.Header[] headerArray59 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList60 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList60, headerArray59);
        retrofit.mime.TypedOutput typedOutput62 = null;
        retrofit.client.Request request63 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList60, typedOutput62);
// flaky:         requestBuilder55.setheaders((java.util.List<retrofit.client.Header>) headerList60);
// flaky:         requestBuilder53.setheaders((java.util.List<retrofit.client.Header>) headerList60);
        java.util.List<retrofit.client.Header> headerList66 = null; // flaky: requestBuilder53.headers;
// flaky:         requestBuilder46.setheaders(headerList66);
        retrofit.SerializedObjectSupporter serializedObjectSupporter72 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder73 = serializedObjectSupporter72.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder74 = serializedObjectSupporter72.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder75 = serializedObjectSupporter72.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList76 = requestBuilder75.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter77 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder78 = serializedObjectSupporter77.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder79 = serializedObjectSupporter77.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder80 = serializedObjectSupporter77.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput81 = null; // flaky: requestBuilder80.buildBody();
        retrofit.client.Request request82 = new retrofit.client.Request("/foo/bar/pong/", "GET", headerList76, typedOutput81);
        retrofit.SerializedObjectSupporter serializedObjectSupporter85 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder86 = serializedObjectSupporter85.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder87 = serializedObjectSupporter85.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder88 = serializedObjectSupporter85.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList89 = requestBuilder88.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter90 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder91 = serializedObjectSupporter90.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder92 = serializedObjectSupporter90.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder93 = serializedObjectSupporter90.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput94 = null; // flaky: requestBuilder93.buildBody();
        retrofit.client.Request request95 = new retrofit.client.Request("/foo/bar/pong/", "GET", headerList89, typedOutput94);
        retrofit.client.Request request96 = new retrofit.client.Request("http://example.com/", "http://example.com", headerList76, typedOutput94);
        retrofit.client.Request request97 = new retrofit.client.Request("/foo/bar/", "hi!", headerList66, typedOutput94);
        retrofit.client.Request request98 = new retrofit.client.Request("/foo/bar/pong/kat/", "http://example.com/foo/bar/100/", (java.util.List<retrofit.client.Header>) headerList22, typedOutput94);
// flaky:         requestBuilder6.headers = headerList22;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(gsonConverter16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(converter18);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(typedOutput33);
        org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNotNull(gsonConverter39);
        org.junit.Assert.assertNotNull(requestBuilder40);
        org.junit.Assert.assertNotNull(requestBuilder41);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(gsonConverter45);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder46);
// flaky:         org.junit.Assert.assertNotNull(headerList49);
        org.junit.Assert.assertNotNull(requestBuilder51);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder52);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder53);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder55);
// flaky:         org.junit.Assert.assertNotNull(converter56);
        org.junit.Assert.assertNotNull(headerArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
// flaky:         org.junit.Assert.assertNotNull(headerList66);
        org.junit.Assert.assertNotNull(requestBuilder73);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder74);
        org.junit.Assert.assertNotNull(requestBuilder75);
        org.junit.Assert.assertNotNull(headerList76);
        org.junit.Assert.assertNotNull(requestBuilder78);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder79);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder80);
// flaky:         org.junit.Assert.assertNotNull(typedOutput81);
        org.junit.Assert.assertNotNull(requestBuilder86);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder87);
        org.junit.Assert.assertNotNull(requestBuilder88);
        org.junit.Assert.assertNotNull(headerList89);
        org.junit.Assert.assertNotNull(requestBuilder91);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder92);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder93);
// flaky:         org.junit.Assert.assertNotNull(typedOutput94);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter8.deserializeObjectConverter7();
        java.lang.String str12 = serializedObjectSupporter8.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter8.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter8.deserializeObjectRequestBuilder7();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter16.deserializeObjectRequestBuilder31();
        java.lang.Object[] objArray18 = requestBuilder17.args;
        java.lang.Object[] objArray19 = requestBuilder17.args;
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter33.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter33.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter33.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter33.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter38 = null; // flaky: requestBuilder37.converter;
        retrofit.client.Header[] headerArray41 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList42 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList42, headerArray41);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList42, typedOutput44);
// flaky:         requestBuilder37.setheaders((java.util.List<retrofit.client.Header>) headerList42);
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList42, typedOutput47);
        retrofit.SerializedObjectSupporter serializedObjectSupporter49 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder50 = serializedObjectSupporter49.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder51 = serializedObjectSupporter49.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder52 = serializedObjectSupporter49.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput53 = null; // flaky: requestBuilder52.buildBody();
        retrofit.client.Request request54 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList42, typedOutput53);
        retrofit.client.Request request55 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList25, typedOutput53);
        java.util.List<retrofit.client.Header> headerList56 = request55.getHeaders();
        requestBuilder17.headers = headerList56;
// flaky:         requestBuilder15.setheaders(headerList56);
// flaky:         requestBuilder7.setheaders(headerList56);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(gsonConverter14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNull(objArray18);
        org.junit.Assert.assertNull(objArray19);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(requestBuilder34);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(gsonConverter36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder37);
// flaky:         org.junit.Assert.assertNotNull(converter38);
        org.junit.Assert.assertNotNull(headerArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(requestBuilder50);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder51);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder52);
// flaky:         org.junit.Assert.assertNotNull(typedOutput53);
        org.junit.Assert.assertNotNull(headerList56);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.lang.Object[] objArray7 = requestBuilder6.getargs();
        retrofit.mime.TypedOutput typedOutput8 = requestBuilder6.buildBody();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertNull(typedOutput8);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(gsonConverter1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter8.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter8.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter16.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter18 = null; // flaky: requestBuilder17.converter;
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
// flaky:         requestBuilder17.setheaders((java.util.List<retrofit.client.Header>) headerList22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter27.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter27.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter27.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList31 = requestBuilder30.getheaders();
        java.lang.Object[] objArray32 = requestBuilder30.args;
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter33.deserializeObjectRequestBuilder30();
        java.lang.String str35 = serializedObjectSupporter33.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter33.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter37 = serializedObjectSupporter33.deserializeObjectConverter4();
        java.lang.Object[] objArray38 = new java.lang.Object[] { requestBuilder30, serializedObjectSupporter33 };
// flaky:         requestBuilder17.setargs(objArray38);
        retrofit.RequestBuilder requestBuilder40 = null; // flaky: requestBuilder15.args(objArray38);
// flaky:         requestBuilder7.setargs(objArray38);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(gsonConverter13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(converter18);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(requestBuilder28);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNull(objArray32);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "http://example.com/" + "'", str35, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
        org.junit.Assert.assertNotNull(gsonConverter37);
        org.junit.Assert.assertNotNull(objArray38);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder40);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter10 = null; // flaky: requestBuilder9.converter;
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
// flaky:         requestBuilder9.setheaders((java.util.List<retrofit.client.Header>) headerList14);
        retrofit.RequestBuilder requestBuilder19 = requestBuilder7.headers((java.util.List<retrofit.client.Header>) headerList14);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter20.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter20.deserializeObjectRequestBuilder4();
        java.lang.Object[] objArray23 = null; // flaky: requestBuilder22.args;
        retrofit.RequestBuilder requestBuilder24 = requestBuilder19.args(objArray23);
        retrofit.RequestBuilder requestBuilder25 = null; // flaky: requestBuilder4.args(objArray23);
        retrofit.client.Header[] headerArray28 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList29 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList29, headerArray28);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("http://example.com", "GET", (java.util.List<retrofit.client.Header>) headerList29, typedOutput31);
// flaky:         requestBuilder25.setheaders((java.util.List<retrofit.client.Header>) headerList29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(converter10);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(objArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = null; // flaky: requestBuilder2.getapiUrl();
        retrofit.client.Request request4 = null; // flaky: requestBuilder2.build();
        org.junit.Assert.assertNotNull(gsonConverter1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com" + "'", str3, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(request4);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder22();
        java.lang.Object[] objArray13 = null; // flaky: requestBuilder12.args;
        requestBuilder6.args = objArray13;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[kat]");
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        java.lang.String str6 = requestBuilder5.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.lang.String str8 = null; // flaky: requestBuilder7.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.client.Request request9 = null; // flaky: requestBuilder8.build();
        java.lang.String str10 = null; // flaky: requestBuilder8.buildRelativeUrl();
// flaky:         requestBuilder8.setapiUrl("");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(request9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/foo/bar/" + "'", str10, "/foo/bar/");
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("http://example.com", "GET", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter22.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter22.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter22.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter27 = null; // flaky: requestBuilder26.converter;
        retrofit.client.Header[] headerArray30 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList31 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList31, headerArray30);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList31, typedOutput33);
// flaky:         requestBuilder26.setheaders((java.util.List<retrofit.client.Header>) headerList31);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList31, typedOutput36);
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder39 = serializedObjectSupporter38.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter38.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter38.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput42 = null; // flaky: requestBuilder41.buildBody();
        retrofit.client.Request request43 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList31, typedOutput42);
        retrofit.client.Request request44 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList14, typedOutput42);
        retrofit.client.Request request45 = new retrofit.client.Request("/foo/bar/pong/", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput42);
        retrofit.mime.TypedOutput typedOutput46 = request45.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(gsonConverter25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(converter27);
        org.junit.Assert.assertNotNull(headerArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(requestBuilder39);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder40);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder41);
// flaky:         org.junit.Assert.assertNotNull(typedOutput42);
// flaky:         org.junit.Assert.assertNotNull(typedOutput46);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder30();
        java.lang.String str4 = serializedObjectSupporter2.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder10();
        java.lang.String str6 = null; // flaky: requestBuilder5.buildRelativeUrl();
        java.util.List<retrofit.client.Header> headerList7 = null; // flaky: requestBuilder5.getheaders();
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter21.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter21.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter21.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter21.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter26 = null; // flaky: requestBuilder25.converter;
        retrofit.client.Header[] headerArray29 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList30 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList30, headerArray29);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList30, typedOutput32);
// flaky:         requestBuilder25.setheaders((java.util.List<retrofit.client.Header>) headerList30);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList30, typedOutput35);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList30, typedOutput37);
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter41.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter43 = null; // flaky: requestBuilder42.converter;
        retrofit.client.Header[] headerArray46 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList47 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList47, headerArray46);
        retrofit.mime.TypedOutput typedOutput49 = null;
        retrofit.client.Request request50 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList47, typedOutput49);
// flaky:         requestBuilder42.setheaders((java.util.List<retrofit.client.Header>) headerList47);
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter52.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder54 = serializedObjectSupporter52.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder55 = serializedObjectSupporter52.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput56 = null; // flaky: requestBuilder55.buildBody();
        retrofit.client.Request request57 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList47, typedOutput56);
        retrofit.client.Request request58 = new retrofit.client.Request("", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList30, typedOutput56);
        java.util.List<retrofit.client.Header> headerList61 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter62 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder63 = serializedObjectSupporter62.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder64 = serializedObjectSupporter62.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder65 = serializedObjectSupporter62.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput66 = null; // flaky: requestBuilder65.buildBody();
        retrofit.client.Request request67 = new retrofit.client.Request("hi!", "/foo/bar/pong/", headerList61, typedOutput66);
        retrofit.client.Request request68 = new retrofit.client.Request("http://example.com", "http://example.com/foo/bar/?foo=bar&kit=kat", (java.util.List<retrofit.client.Header>) headerList30, typedOutput66);
        retrofit.client.Request request69 = new retrofit.client.Request("", "/foo/bar/", (java.util.List<retrofit.client.Header>) headerList11, typedOutput66);
        retrofit.client.Request request70 = new retrofit.client.Request("hi!", "", headerList7, typedOutput66);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/foo/bar/" + "'", str6, "/foo/bar/");
// flaky:         org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(gsonConverter24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(converter26);
        org.junit.Assert.assertNotNull(headerArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder42);
// flaky:         org.junit.Assert.assertNotNull(converter43);
        org.junit.Assert.assertNotNull(headerArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(requestBuilder53);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder54);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder55);
// flaky:         org.junit.Assert.assertNotNull(typedOutput56);
        org.junit.Assert.assertNotNull(requestBuilder63);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder64);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder65);
// flaky:         org.junit.Assert.assertNotNull(typedOutput66);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter10.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList14 = requestBuilder13.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter19 = null; // flaky: requestBuilder18.converter;
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
// flaky:         requestBuilder18.setheaders((java.util.List<retrofit.client.Header>) headerList23);
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter28.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter28.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter28.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput32 = null; // flaky: requestBuilder31.buildBody();
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList23, typedOutput32);
        retrofit.client.Request request34 = new retrofit.client.Request("http://example.com/foo/bar/?foo=bar&kit=kat", "http://example.com/foo/bar/?foo=bar&kit=kat", headerList14, typedOutput32);
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.client.Header[] headerArray44 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList45 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList45, headerArray44);
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList45, typedOutput47);
        retrofit.SerializedObjectSupporter serializedObjectSupporter53 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder54 = serializedObjectSupporter53.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder55 = serializedObjectSupporter53.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter56 = serializedObjectSupporter53.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder57 = serializedObjectSupporter53.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter58 = null; // flaky: requestBuilder57.converter;
        retrofit.client.Header[] headerArray61 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList62 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList62, headerArray61);
        retrofit.mime.TypedOutput typedOutput64 = null;
        retrofit.client.Request request65 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList62, typedOutput64);
// flaky:         requestBuilder57.setheaders((java.util.List<retrofit.client.Header>) headerList62);
        retrofit.mime.TypedOutput typedOutput67 = null;
        retrofit.client.Request request68 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList62, typedOutput67);
        retrofit.SerializedObjectSupporter serializedObjectSupporter69 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder70 = serializedObjectSupporter69.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder71 = serializedObjectSupporter69.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder72 = serializedObjectSupporter69.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput73 = null; // flaky: requestBuilder72.buildBody();
        retrofit.client.Request request74 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList62, typedOutput73);
        retrofit.client.Request request75 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList45, typedOutput73);
        java.util.List<retrofit.client.Header> headerList76 = request75.getHeaders();
        java.util.List<retrofit.client.Header> headerList79 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter82 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder83 = serializedObjectSupporter82.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder84 = serializedObjectSupporter82.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList85 = requestBuilder84.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter86 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder87 = serializedObjectSupporter86.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder88 = serializedObjectSupporter86.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter89 = serializedObjectSupporter86.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder90 = serializedObjectSupporter86.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder91 = serializedObjectSupporter86.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder92 = serializedObjectSupporter86.deserializeObjectRequestBuilder19();
        retrofit.mime.TypedOutput typedOutput93 = null; // flaky: requestBuilder92.buildBody();
        retrofit.client.Request request94 = new retrofit.client.Request("/foo/bar/pong/", "http://example.com", headerList85, typedOutput93);
        retrofit.client.Request request95 = new retrofit.client.Request("GET", "GET", headerList79, typedOutput93);
        retrofit.client.Request request96 = new retrofit.client.Request("", "/foo/bar/pong/kat/", headerList76, typedOutput93);
        retrofit.client.Request request97 = new retrofit.client.Request("/foo/bar/", "hi!", headerList37, typedOutput93);
        retrofit.client.Request request98 = new retrofit.client.Request("/foo/bar/", "http://example.com/", headerList14, typedOutput93);
// flaky:         requestBuilder5.headers = headerList14;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(headerList14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(converter19);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(typedOutput32);
        org.junit.Assert.assertNotNull(headerArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(requestBuilder54);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder55);
        org.junit.Assert.assertNotNull(gsonConverter56);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder57);
// flaky:         org.junit.Assert.assertNotNull(converter58);
        org.junit.Assert.assertNotNull(headerArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(requestBuilder70);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder71);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder72);
// flaky:         org.junit.Assert.assertNotNull(typedOutput73);
        org.junit.Assert.assertNotNull(headerList76);
        org.junit.Assert.assertNotNull(requestBuilder83);
        org.junit.Assert.assertNotNull(requestBuilder84);
        org.junit.Assert.assertNotNull(headerList85);
        org.junit.Assert.assertNotNull(requestBuilder87);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder88);
        org.junit.Assert.assertNotNull(gsonConverter89);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder90);
        org.junit.Assert.assertNotNull(requestBuilder91);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder92);
// flaky:         org.junit.Assert.assertNotNull(typedOutput93);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder7.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(converter8);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.converter;
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
// flaky:         requestBuilder6.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        java.lang.Object[] objArray19 = new java.lang.Object[] { '4', 10.0d, 100.0d };
        retrofit.RequestBuilder requestBuilder20 = null; // flaky: requestBuilder6.args(objArray19);
        retrofit.RequestBuilder requestBuilder21 = requestBuilder4.args(objArray19);
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter22.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter22.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter22.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter22.deserializeObjectRequestBuilder12();
        requestBuilder21.serializedObjectSupporter = serializedObjectSupporter22;
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter22.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList30 = null;
// flaky:         requestBuilder29.setheaders(headerList30);
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[4, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[4, 10.0, 100.0]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(gsonConverter24);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str5 = null; // flaky: requestBuilder4.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList10 = serializedObjectSupporter6.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder10();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter14.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter14.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter14.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter14.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter14.deserializeObjectRequestBuilder7();
// flaky:         requestBuilder13.serializedObjectSupporter = serializedObjectSupporter14;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(arrayList10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(arrayList9);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter2.deserializeObjectRequestBuilder8();
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder7.getconverter();
        retrofit.client.Request request9 = null; // flaky: requestBuilder7.build();
        java.util.List<retrofit.client.Header> headerList10 = null; // flaky: request9.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null; // flaky: request9.getBody();
        java.util.List<retrofit.client.Header> headerList12 = null; // flaky: request9.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter19.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter19.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter19.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter19.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter24 = null; // flaky: requestBuilder23.converter;
        retrofit.client.Header[] headerArray27 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList28 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList28, headerArray27);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList28, typedOutput30);
// flaky:         requestBuilder23.setheaders((java.util.List<retrofit.client.Header>) headerList28);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList28, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList28, typedOutput35);
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter39.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter41 = null; // flaky: requestBuilder40.converter;
        retrofit.client.Header[] headerArray44 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList45 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList45, headerArray44);
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList45, typedOutput47);
// flaky:         requestBuilder40.setheaders((java.util.List<retrofit.client.Header>) headerList45);
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder51 = serializedObjectSupporter50.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder52 = serializedObjectSupporter50.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter50.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput54 = null; // flaky: requestBuilder53.buildBody();
        retrofit.client.Request request55 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList45, typedOutput54);
        retrofit.client.Request request56 = new retrofit.client.Request("", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList28, typedOutput54);
        retrofit.client.Request request57 = new retrofit.client.Request("http://example.com/foo/bar/pong%26/?kit=kat%26", "/foo/bar/pong/kat/", headerList12, typedOutput54);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(converter8);
// flaky:         org.junit.Assert.assertNotNull(request9);
// flaky:         org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
// flaky:         org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(gsonConverter22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(converter24);
        org.junit.Assert.assertNotNull(headerArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder40);
// flaky:         org.junit.Assert.assertNotNull(converter41);
        org.junit.Assert.assertNotNull(headerArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(requestBuilder51);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder52);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder53);
// flaky:         org.junit.Assert.assertNotNull(typedOutput54);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.Converter converter5 = requestBuilder4.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder4.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(converter5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.client.Request request4 = null; // flaky: requestBuilder3.build();
        retrofit.RequestBuilder requestBuilder6 = null; // flaky: requestBuilder3.apiUrl("");
        java.lang.String str7 = null; // flaky: requestBuilder6.buildRelativeUrl();
        retrofit.RequestBuilder requestBuilder9 = null; // flaky: requestBuilder6.apiUrl("GET");
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(request4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/foo/bar/" + "'", str7, "/foo/bar/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.List<retrofit.client.Header> headerList8 = null; // flaky: requestBuilder7.headers;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("http://example.com", "GET", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter3.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder4.converter;
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
// flaky:         requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.RequestBuilder requestBuilder14 = requestBuilder2.headers((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter15.deserializeObjectRequestBuilder4();
        java.lang.Object[] objArray18 = null; // flaky: requestBuilder17.args;
        retrofit.RequestBuilder requestBuilder19 = requestBuilder14.args(objArray18);
        retrofit.client.Request request20 = requestBuilder14.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter21.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter21.deserializeObjectRequestBuilder17();
        java.lang.Object[] objArray24 = null; // flaky: requestBuilder23.args;
        requestBuilder14.args = objArray24;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(objArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(request20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(objArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[pong, [quick, brown, fox], kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[pong, [quick, brown, fox], kat]");
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        java.lang.Object[] objArray7 = null; // flaky: requestBuilder6.args;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(objArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[pong&, kat&]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[pong&, kat&]");
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.util.List<retrofit.client.Header> headerList8 = null; // flaky: requestBuilder7.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("http://example.com", "GET", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter2();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections4 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        java.util.List<retrofit.client.Header> headerList8 = null; // flaky: requestBuilder7.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter2.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter2.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter2.deserializeObjectRequestBuilder20();
        java.util.List<retrofit.client.Header> headerList10 = null; // flaky: requestBuilder9.headers;
        java.util.List<retrofit.client.Header> headerList13 = null;
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.client.Header[] headerArray23 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList24 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList24, headerArray23);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList24, typedOutput26);
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter32.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter32.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter32.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter32.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter37 = null; // flaky: requestBuilder36.converter;
        retrofit.client.Header[] headerArray40 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList41 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList41, headerArray40);
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList41, typedOutput43);
// flaky:         requestBuilder36.setheaders((java.util.List<retrofit.client.Header>) headerList41);
        retrofit.mime.TypedOutput typedOutput46 = null;
        retrofit.client.Request request47 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList41, typedOutput46);
        retrofit.SerializedObjectSupporter serializedObjectSupporter48 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder49 = serializedObjectSupporter48.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder50 = serializedObjectSupporter48.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder51 = serializedObjectSupporter48.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput52 = null; // flaky: requestBuilder51.buildBody();
        retrofit.client.Request request53 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList41, typedOutput52);
        retrofit.client.Request request54 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList24, typedOutput52);
        retrofit.client.Request request55 = new retrofit.client.Request("http://example.com/", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList17, typedOutput52);
        retrofit.client.Request request56 = new retrofit.client.Request("/foo/bar/pong/", "/foo/bar/", headerList13, typedOutput52);
        retrofit.client.Request request57 = new retrofit.client.Request("http://example.com/foo/bar/pong%26/?kit=kat%26", "/foo/bar/pong/", headerList10, typedOutput52);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(requestBuilder33);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(gsonConverter35);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
// flaky:         org.junit.Assert.assertNotNull(converter37);
        org.junit.Assert.assertNotNull(headerArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(requestBuilder49);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder50);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder51);
// flaky:         org.junit.Assert.assertNotNull(typedOutput52);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter2.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter2.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter9.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter9.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter9.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter9.deserializeObjectRequestBuilder13();
        java.util.List<retrofit.client.Header> headerList15 = null; // flaky: requestBuilder14.headers;
        requestBuilder8.headers = headerList15;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter23.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter23.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter23.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter23.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter28 = null; // flaky: requestBuilder27.converter;
        retrofit.client.Header[] headerArray31 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList32 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList32, headerArray31);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList32, typedOutput34);
// flaky:         requestBuilder27.setheaders((java.util.List<retrofit.client.Header>) headerList32);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList32, typedOutput37);
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList32, typedOutput39);
        retrofit.client.Header[] headerArray43 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList44 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList44, headerArray43);
        retrofit.client.Header[] headerArray50 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList51 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList51, headerArray50);
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList51, typedOutput53);
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder60 = serializedObjectSupporter59.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder61 = serializedObjectSupporter59.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter62 = serializedObjectSupporter59.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder63 = serializedObjectSupporter59.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter64 = null; // flaky: requestBuilder63.converter;
        retrofit.client.Header[] headerArray67 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList68 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList68, headerArray67);
        retrofit.mime.TypedOutput typedOutput70 = null;
        retrofit.client.Request request71 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList68, typedOutput70);
// flaky:         requestBuilder63.setheaders((java.util.List<retrofit.client.Header>) headerList68);
        retrofit.mime.TypedOutput typedOutput73 = null;
        retrofit.client.Request request74 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList68, typedOutput73);
        retrofit.SerializedObjectSupporter serializedObjectSupporter75 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder76 = serializedObjectSupporter75.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder77 = serializedObjectSupporter75.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder78 = serializedObjectSupporter75.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput79 = null; // flaky: requestBuilder78.buildBody();
        retrofit.client.Request request80 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList68, typedOutput79);
        retrofit.client.Request request81 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList51, typedOutput79);
        retrofit.client.Request request82 = new retrofit.client.Request("http://example.com/", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList44, typedOutput79);
        retrofit.client.Request request83 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList32, typedOutput79);
        retrofit.client.Request request84 = new retrofit.client.Request("http://example.com/foo/bar/pong%26/?kit=kat%26", "/", headerList15, typedOutput79);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(gsonConverter26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(converter28);
        org.junit.Assert.assertNotNull(headerArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(headerArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(headerArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(requestBuilder60);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder61);
        org.junit.Assert.assertNotNull(gsonConverter62);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder63);
// flaky:         org.junit.Assert.assertNotNull(converter64);
        org.junit.Assert.assertNotNull(headerArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(requestBuilder76);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder77);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder78);
// flaky:         org.junit.Assert.assertNotNull(typedOutput79);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter14.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter16 = null; // flaky: requestBuilder15.converter;
        retrofit.client.Header[] headerArray19 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList20 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList20, headerArray19);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList20, typedOutput22);
// flaky:         requestBuilder15.setheaders((java.util.List<retrofit.client.Header>) headerList20);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter25.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter25.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter25.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput29 = null; // flaky: requestBuilder28.buildBody();
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList20, typedOutput29);
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter33.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter33.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter36 = serializedObjectSupporter33.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter33.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter38 = null; // flaky: requestBuilder37.converter;
        retrofit.client.Header[] headerArray41 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList42 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList42, headerArray41);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList42, typedOutput44);
// flaky:         requestBuilder37.setheaders((java.util.List<retrofit.client.Header>) headerList42);
        retrofit.client.Header[] headerArray51 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList52 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList52, headerArray51);
        retrofit.mime.TypedOutput typedOutput54 = null;
        retrofit.client.Request request55 = new retrofit.client.Request("http://example.com", "GET", (java.util.List<retrofit.client.Header>) headerList52, typedOutput54);
        retrofit.client.Header[] headerArray60 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList61 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList61, headerArray60);
        retrofit.mime.TypedOutput typedOutput63 = null;
        retrofit.client.Request request64 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList61, typedOutput63);
        retrofit.SerializedObjectSupporter serializedObjectSupporter69 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder70 = serializedObjectSupporter69.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder71 = serializedObjectSupporter69.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter72 = serializedObjectSupporter69.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder73 = serializedObjectSupporter69.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter74 = null; // flaky: requestBuilder73.converter;
        retrofit.client.Header[] headerArray77 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList78 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean79 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList78, headerArray77);
        retrofit.mime.TypedOutput typedOutput80 = null;
        retrofit.client.Request request81 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList78, typedOutput80);
// flaky:         requestBuilder73.setheaders((java.util.List<retrofit.client.Header>) headerList78);
        retrofit.mime.TypedOutput typedOutput83 = null;
        retrofit.client.Request request84 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList78, typedOutput83);
        retrofit.SerializedObjectSupporter serializedObjectSupporter85 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder86 = serializedObjectSupporter85.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder87 = serializedObjectSupporter85.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder88 = serializedObjectSupporter85.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput89 = null; // flaky: requestBuilder88.buildBody();
        retrofit.client.Request request90 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList78, typedOutput89);
        retrofit.client.Request request91 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList61, typedOutput89);
        retrofit.client.Request request92 = new retrofit.client.Request("/foo/bar/pong/", "hi!", (java.util.List<retrofit.client.Header>) headerList52, typedOutput89);
        retrofit.client.Request request93 = new retrofit.client.Request("http://example.com/", "", (java.util.List<retrofit.client.Header>) headerList42, typedOutput89);
        retrofit.client.Request request94 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList20, typedOutput89);
// flaky:         requestBuilder9.headers = headerList20;
        retrofit.converter.Converter converter96 = null; // flaky: requestBuilder9.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(converter16);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
// flaky:         org.junit.Assert.assertNotNull(typedOutput29);
        org.junit.Assert.assertNotNull(requestBuilder34);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(gsonConverter36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder37);
// flaky:         org.junit.Assert.assertNotNull(converter38);
        org.junit.Assert.assertNotNull(headerArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(headerArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(headerArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(requestBuilder70);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder71);
        org.junit.Assert.assertNotNull(gsonConverter72);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder73);
// flaky:         org.junit.Assert.assertNotNull(converter74);
        org.junit.Assert.assertNotNull(headerArray77);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertNotNull(requestBuilder86);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder87);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder88);
// flaky:         org.junit.Assert.assertNotNull(typedOutput89);
// flaky:         org.junit.Assert.assertNotNull(converter96);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter7();
        java.lang.String str9 = serializedObjectSupporter5.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder29();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        java.util.ArrayList arrayList13 = serializedObjectSupporter5.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(arrayList13);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str5 = null; // flaky: requestBuilder4.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList10 = serializedObjectSupporter6.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder10();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter6.deserializeObjectRequestBuilder11();
        java.util.ArrayList arrayList15 = serializedObjectSupporter6.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(arrayList10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(arrayList15);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter11.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter11.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter11.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter11.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter16 = null; // flaky: requestBuilder15.converter;
        retrofit.client.Header[] headerArray19 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList20 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList20, headerArray19);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList20, typedOutput22);
// flaky:         requestBuilder15.setheaders((java.util.List<retrofit.client.Header>) headerList20);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList20, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList20, typedOutput27);
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter31.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter33 = null; // flaky: requestBuilder32.converter;
        retrofit.client.Header[] headerArray36 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList37 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList37, headerArray36);
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList37, typedOutput39);
// flaky:         requestBuilder32.setheaders((java.util.List<retrofit.client.Header>) headerList37);
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter42.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter42.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter42.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput46 = null; // flaky: requestBuilder45.buildBody();
        retrofit.client.Request request47 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList37, typedOutput46);
        retrofit.client.Request request48 = new retrofit.client.Request("", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList20, typedOutput46);
        retrofit.RequestBuilder requestBuilder49 = null; // flaky: requestBuilder4.headers((java.util.List<retrofit.client.Header>) headerList20);
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(gsonConverter14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(converter16);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(converter33);
        org.junit.Assert.assertNotNull(headerArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(requestBuilder43);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder44);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder45);
// flaky:         org.junit.Assert.assertNotNull(typedOutput46);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder49);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("http://example.com", "GET", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter24.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter24.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter24.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter24.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter29 = null; // flaky: requestBuilder28.converter;
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
// flaky:         requestBuilder28.setheaders((java.util.List<retrofit.client.Header>) headerList33);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList33, typedOutput38);
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter40.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter40.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter40.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput44 = null; // flaky: requestBuilder43.buildBody();
        retrofit.client.Request request45 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList33, typedOutput44);
        retrofit.client.Request request46 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList16, typedOutput44);
        retrofit.client.Request request47 = new retrofit.client.Request("/foo/bar/pong/", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput44);
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder51 = serializedObjectSupporter50.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter50.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter50.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder54 = serializedObjectSupporter50.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder55 = serializedObjectSupporter50.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder56 = serializedObjectSupporter50.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder57 = serializedObjectSupporter50.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter58 = serializedObjectSupporter50.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder59 = serializedObjectSupporter50.deserializeObjectRequestBuilder17();
// flaky:         requestBuilder59.apiUrl = "http://example.com/";
        java.util.List<retrofit.client.Header> headerList62 = null; // flaky: requestBuilder59.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter67 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder68 = serializedObjectSupporter67.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder69 = serializedObjectSupporter67.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder70 = serializedObjectSupporter67.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList71 = requestBuilder70.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter72 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder73 = serializedObjectSupporter72.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder74 = serializedObjectSupporter72.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder75 = serializedObjectSupporter72.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput76 = null; // flaky: requestBuilder75.buildBody();
        retrofit.client.Request request77 = new retrofit.client.Request("/foo/bar/pong/", "GET", headerList71, typedOutput76);
        retrofit.SerializedObjectSupporter serializedObjectSupporter80 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder81 = serializedObjectSupporter80.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder82 = serializedObjectSupporter80.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder83 = serializedObjectSupporter80.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList84 = requestBuilder83.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter85 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder86 = serializedObjectSupporter85.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder87 = serializedObjectSupporter85.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder88 = serializedObjectSupporter85.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput89 = null; // flaky: requestBuilder88.buildBody();
        retrofit.client.Request request90 = new retrofit.client.Request("/foo/bar/pong/", "GET", headerList84, typedOutput89);
        retrofit.client.Request request91 = new retrofit.client.Request("http://example.com/", "http://example.com", headerList71, typedOutput89);
        retrofit.client.Request request92 = new retrofit.client.Request("/foo/bar/pong/", "http://example.com/foo/bar/?foo=bar&kit=kat", headerList62, typedOutput89);
        retrofit.client.Request request93 = new retrofit.client.Request("/foo/bar/pong/kat/", "/foo/bar/pong/kat/", (java.util.List<retrofit.client.Header>) headerList7, typedOutput89);
        retrofit.mime.TypedOutput typedOutput94 = request93.getBody();
        retrofit.mime.TypedOutput typedOutput95 = request93.getBody();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(gsonConverter27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
// flaky:         org.junit.Assert.assertNotNull(converter29);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(requestBuilder41);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder42);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder43);
// flaky:         org.junit.Assert.assertNotNull(typedOutput44);
        org.junit.Assert.assertNotNull(requestBuilder51);
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertNotNull(requestBuilder53);
        org.junit.Assert.assertNotNull(requestBuilder54);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder55);
        org.junit.Assert.assertNotNull(requestBuilder56);
        org.junit.Assert.assertNotNull(requestBuilder57);
        org.junit.Assert.assertNotNull(gsonConverter58);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder59);
// flaky:         org.junit.Assert.assertNotNull(headerList62);
        org.junit.Assert.assertNotNull(requestBuilder68);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder69);
        org.junit.Assert.assertNotNull(requestBuilder70);
        org.junit.Assert.assertNotNull(headerList71);
        org.junit.Assert.assertNotNull(requestBuilder73);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder74);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder75);
// flaky:         org.junit.Assert.assertNotNull(typedOutput76);
        org.junit.Assert.assertNotNull(requestBuilder81);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder82);
        org.junit.Assert.assertNotNull(requestBuilder83);
        org.junit.Assert.assertNotNull(headerList84);
        org.junit.Assert.assertNotNull(requestBuilder86);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder87);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder88);
// flaky:         org.junit.Assert.assertNotNull(typedOutput89);
// flaky:         org.junit.Assert.assertNotNull(typedOutput94);
// flaky:         org.junit.Assert.assertNotNull(typedOutput95);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter2 = null; // flaky: requestBuilder1.converter;
        java.lang.String str3 = null; // flaky: requestBuilder1.buildRelativeUrl();
        retrofit.client.Request request4 = null; // flaky: requestBuilder1.build();
        retrofit.client.Request request5 = null; // flaky: requestBuilder1.build();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(converter2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/foo/bar/pong/" + "'", str3, "/foo/bar/pong/");
// flaky:         org.junit.Assert.assertNotNull(request4);
// flaky:         org.junit.Assert.assertNotNull(request5);
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(gsonConverter1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        requestBuilder5.setapiUrl("http://example.com/foo/bar/pong%26/?kit=kat%26");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList10 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(arrayList10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.mime.TypedOutput typedOutput7 = null; // flaky: requestBuilder6.buildBody();
        java.lang.Object[] objArray8 = null; // flaky: requestBuilder6.getargs();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(typedOutput7);
// flaky:         org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[bar, pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[bar, pong]");
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.lang.Object[] objArray7 = null; // flaky: requestBuilder6.getargs();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(objArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[null]");
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.client.Request request10 = null; // flaky: requestBuilder9.build();
        java.lang.String str11 = null; // flaky: requestBuilder9.apiUrl;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(request10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com" + "'", str11, "http://example.com");
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter5.deserializeObjectConverter7();
        java.lang.String str9 = serializedObjectSupporter5.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder29();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = null; // flaky: requestBuilder4.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(serializedObjectSupporter13);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str5 = null; // flaky: requestBuilder4.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList10 = serializedObjectSupporter6.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder10();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter6.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter6.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter6.deserializeObjectRequestBuilder30();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(arrayList10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter4.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter4.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter4.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter4.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter4.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter4.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter4.deserializeObjectRequestBuilder17();
// flaky:         requestBuilder13.apiUrl = "http://example.com/";
        java.util.List<retrofit.client.Header> headerList16 = null; // flaky: requestBuilder13.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter17.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter17.deserializeObjectRequestBuilder2();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter21.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter23 = null; // flaky: requestBuilder22.converter;
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
// flaky:         requestBuilder22.setheaders((java.util.List<retrofit.client.Header>) headerList27);
// flaky:         requestBuilder20.setheaders((java.util.List<retrofit.client.Header>) headerList27);
        java.util.List<retrofit.client.Header> headerList33 = null; // flaky: requestBuilder20.headers;
// flaky:         requestBuilder13.setheaders(headerList33);
        retrofit.RequestBuilder requestBuilder35 = null; // flaky: requestBuilder3.headers(headerList33);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(converter23);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
// flaky:         org.junit.Assert.assertNotNull(headerList33);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder35);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.client.Request request6 = requestBuilder5.build();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str9 = null; // flaky: requestBuilder8.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/foo/bar/" + "'", str9, "/foo/bar/");
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.mime.TypedOutput typedOutput4 = requestBuilder3.buildBody();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(typedOutput4);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter9 = null; // flaky: requestBuilder8.converter;
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
// flaky:         requestBuilder8.setheaders((java.util.List<retrofit.client.Header>) headerList13);
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter20.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter20.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter20.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter20.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter25 = null; // flaky: requestBuilder24.converter;
        retrofit.client.Header[] headerArray28 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList29 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList29, headerArray28);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList29, typedOutput31);
// flaky:         requestBuilder24.setheaders((java.util.List<retrofit.client.Header>) headerList29);
        retrofit.client.Header[] headerArray38 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList39 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList39, headerArray38);
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("http://example.com", "GET", (java.util.List<retrofit.client.Header>) headerList39, typedOutput41);
        retrofit.client.Header[] headerArray47 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList48 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList48, headerArray47);
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList48, typedOutput50);
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder57 = serializedObjectSupporter56.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder58 = serializedObjectSupporter56.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter59 = serializedObjectSupporter56.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder60 = serializedObjectSupporter56.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter61 = null; // flaky: requestBuilder60.converter;
        retrofit.client.Header[] headerArray64 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList65 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList65, headerArray64);
        retrofit.mime.TypedOutput typedOutput67 = null;
        retrofit.client.Request request68 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList65, typedOutput67);
// flaky:         requestBuilder60.setheaders((java.util.List<retrofit.client.Header>) headerList65);
        retrofit.mime.TypedOutput typedOutput70 = null;
        retrofit.client.Request request71 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList65, typedOutput70);
        retrofit.SerializedObjectSupporter serializedObjectSupporter72 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder73 = serializedObjectSupporter72.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder74 = serializedObjectSupporter72.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder75 = serializedObjectSupporter72.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput76 = null; // flaky: requestBuilder75.buildBody();
        retrofit.client.Request request77 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList65, typedOutput76);
        retrofit.client.Request request78 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList48, typedOutput76);
        retrofit.client.Request request79 = new retrofit.client.Request("/foo/bar/pong/", "hi!", (java.util.List<retrofit.client.Header>) headerList39, typedOutput76);
        retrofit.client.Request request80 = new retrofit.client.Request("http://example.com/", "", (java.util.List<retrofit.client.Header>) headerList29, typedOutput76);
        retrofit.client.Request request81 = new retrofit.client.Request("/foo/bar/pong/", "http://example.com", (java.util.List<retrofit.client.Header>) headerList13, typedOutput76);
// flaky:         requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList13);
        java.lang.Object[] objArray83 = null;
// flaky:         requestBuilder4.args = objArray83;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(converter9);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(gsonConverter23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(converter25);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(headerArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(headerArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(requestBuilder57);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder58);
        org.junit.Assert.assertNotNull(gsonConverter59);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder60);
// flaky:         org.junit.Assert.assertNotNull(converter61);
        org.junit.Assert.assertNotNull(headerArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(requestBuilder73);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder74);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder75);
// flaky:         org.junit.Assert.assertNotNull(typedOutput76);
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter5.deserializeObjectRequestBuilder18();
        java.lang.Object[] objArray13 = null; // flaky: requestBuilder12.args;
        retrofit.RequestBuilder requestBuilder14 = requestBuilder4.args(objArray13);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[null]");
        org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.client.Request request7 = requestBuilder6.build();
        java.lang.String str8 = requestBuilder6.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.client.Request request6 = requestBuilder5.build();
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter25.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter25.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter25.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter25.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter30 = null; // flaky: requestBuilder29.converter;
        retrofit.client.Header[] headerArray33 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList34 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList34, headerArray33);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList34, typedOutput36);
// flaky:         requestBuilder29.setheaders((java.util.List<retrofit.client.Header>) headerList34);
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("http://example.com", "", (java.util.List<retrofit.client.Header>) headerList34, typedOutput39);
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter41.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter41.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter41.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput45 = null; // flaky: requestBuilder44.buildBody();
        retrofit.client.Request request46 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList34, typedOutput45);
        retrofit.client.Request request47 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList17, typedOutput45);
        retrofit.client.Request request48 = new retrofit.client.Request("http://example.com/", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList10, typedOutput45);
        requestBuilder5.headers = headerList10;
        retrofit.converter.Converter converter50 = requestBuilder5.converter;
        java.lang.String str51 = requestBuilder5.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
        org.junit.Assert.assertNotNull(gsonConverter28);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(converter30);
        org.junit.Assert.assertNotNull(headerArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(requestBuilder42);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder43);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder44);
// flaky:         org.junit.Assert.assertNotNull(typedOutput45);
        org.junit.Assert.assertNotNull(converter50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://example.com" + "'", str51, "http://example.com");
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder7.setapiUrl("/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder3.getconverter();
        java.util.List<retrofit.client.Header> headerList5 = null; // flaky: requestBuilder3.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(converter4);
// flaky:         org.junit.Assert.assertNotNull(headerList5);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request7 = null; // flaky: requestBuilder6.build();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Body must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections7 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter4.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter4.deserializeObjectRequestBuilder23();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter9.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList13 = requestBuilder12.getheaders();
// flaky:         requestBuilder8.setheaders(headerList13);
        requestBuilder3.headers = headerList13;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter2.deserializeObjectRequestBuilder13();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter8.deserializeObjectConverter4();
        java.util.ArrayList arrayList12 = serializedObjectSupporter8.deserializeObjectList3();
// flaky:         requestBuilder7.serializedObjectSupporter = serializedObjectSupporter8;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter14.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter14.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter14.deserializeObjectRequestBuilder6();
        retrofit.client.Request request18 = null; // flaky: requestBuilder17.build();
        retrofit.RequestBuilder requestBuilder20 = null; // flaky: requestBuilder17.apiUrl("");
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter21.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter21.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter24 = serializedObjectSupporter21.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter21.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter26 = null; // flaky: requestBuilder25.converter;
        retrofit.client.Header[] headerArray29 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList30 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList30, headerArray29);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList30, typedOutput32);
// flaky:         requestBuilder25.setheaders((java.util.List<retrofit.client.Header>) headerList30);
        retrofit.RequestBuilder requestBuilder35 = null; // flaky: requestBuilder20.headers((java.util.List<retrofit.client.Header>) headerList30);
        retrofit.RequestBuilder requestBuilder36 = null; // flaky: requestBuilder7.headers((java.util.List<retrofit.client.Header>) headerList30);
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter39.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter39.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter39.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter43 = serializedObjectSupporter39.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter39.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter45 = serializedObjectSupporter39.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder46 = serializedObjectSupporter39.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder48 = serializedObjectSupporter47.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter49 = serializedObjectSupporter47.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter50 = serializedObjectSupporter47.deserializeObjectConverter7();
        java.lang.String str51 = serializedObjectSupporter47.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder52 = serializedObjectSupporter47.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter47.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder54 = serializedObjectSupporter47.deserializeObjectRequestBuilder12();
        retrofit.client.Header[] headerArray55 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList56 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList56, headerArray55);
// flaky:         requestBuilder54.headers = headerList56;
// flaky:         requestBuilder46.setheaders((java.util.List<retrofit.client.Header>) headerList56);
        retrofit.SerializedObjectSupporter serializedObjectSupporter62 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder63 = serializedObjectSupporter62.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter64 = null; // flaky: requestBuilder63.converter;
        retrofit.client.Header[] headerArray67 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList68 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList68, headerArray67);
        retrofit.mime.TypedOutput typedOutput70 = null;
        retrofit.client.Request request71 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList68, typedOutput70);
// flaky:         requestBuilder63.setheaders((java.util.List<retrofit.client.Header>) headerList68);
        retrofit.SerializedObjectSupporter serializedObjectSupporter73 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder74 = serializedObjectSupporter73.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder75 = serializedObjectSupporter73.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder76 = serializedObjectSupporter73.deserializeObjectRequestBuilder2();
        retrofit.mime.TypedOutput typedOutput77 = null; // flaky: requestBuilder76.buildBody();
        retrofit.client.Request request78 = new retrofit.client.Request("hi!", "/foo/bar/pong/", (java.util.List<retrofit.client.Header>) headerList68, typedOutput77);
        retrofit.client.Request request79 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList56, typedOutput77);
        retrofit.client.Request request80 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList30, typedOutput77);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(request18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(gsonConverter24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(converter26);
        org.junit.Assert.assertNotNull(headerArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder35);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
        org.junit.Assert.assertNotNull(requestBuilder40);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder41);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(gsonConverter43);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(gsonConverter45);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder46);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder48);
        org.junit.Assert.assertNotNull(gsonConverter49);
        org.junit.Assert.assertNotNull(gsonConverter50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "http://example.com/" + "'", str51, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder52);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder53);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder54);
        org.junit.Assert.assertNotNull(headerArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder63);
// flaky:         org.junit.Assert.assertNotNull(converter64);
        org.junit.Assert.assertNotNull(headerArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(requestBuilder74);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder75);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder76);
// flaky:         org.junit.Assert.assertNotNull(typedOutput77);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder7.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter9.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter9.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter9.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter9.deserializeObjectRequestBuilder19();
        retrofit.mime.TypedOutput typedOutput16 = null; // flaky: requestBuilder15.buildBody();
        retrofit.client.Request request17 = new retrofit.client.Request("/foo/bar/pong/", "http://example.com", headerList8, typedOutput16);
        retrofit.client.Request request18 = new retrofit.client.Request("GET", "GET", headerList2, typedOutput16);
        java.lang.String str19 = request18.getMethod();
        java.util.List<retrofit.client.Header> headerList20 = request18.getHeaders();
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GET" + "'", str19, "GET");
        org.junit.Assert.assertNotNull(headerList20);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = requestBuilder6.apiUrl("GET");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.Object[] objArray4 = null;
        retrofit.RequestBuilder requestBuilder5 = requestBuilder3.args(objArray4);
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter10.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter10.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter10.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter10.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter10.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter10.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter19 = serializedObjectSupporter10.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder20 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter19);
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter21.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter21.deserializeObjectRequestBuilder17();
        java.lang.Object[] objArray24 = null; // flaky: requestBuilder23.args;
        requestBuilder20.args = objArray24;
// flaky:         requestBuilder9.args = objArray24;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(gsonConverter17);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(gsonConverter19);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(objArray24);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[pong, [quick, brown, fox], kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[pong, [quick, brown, fox], kat]");
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder10 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter9);
        java.lang.Object[] objArray11 = requestBuilder10.getargs();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter14.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter14.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter19 = null; // flaky: requestBuilder18.converter;
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
// flaky:         requestBuilder18.setheaders((java.util.List<retrofit.client.Header>) headerList23);
        retrofit.RequestBuilder requestBuilder28 = requestBuilder16.headers((java.util.List<retrofit.client.Header>) headerList23);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("http://example.com", "http://example.com/", (java.util.List<retrofit.client.Header>) headerList23, typedOutput29);
        requestBuilder10.headers = headerList23;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(converter19);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(requestBuilder28);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder3.getconverter();
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertNull(headerList6);
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.lang.String str4 = null; // flaky: requestBuilder3.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com" + "'", str4, "http://example.com");
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter3.deserializeObjectRequestBuilder11();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder4.converter;
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
// flaky:         requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        java.lang.Object[] objArray17 = new java.lang.Object[] { '4', 10.0d, 100.0d };
        retrofit.RequestBuilder requestBuilder18 = null; // flaky: requestBuilder4.args(objArray17);
        java.lang.Object[] objArray20 = new java.lang.Object[] { (short) 100, requestBuilder4, false };
        retrofit.RequestBuilder requestBuilder21 = null; // flaky: requestBuilder1.args(objArray20);
// flaky:         requestBuilder21.apiUrl = "hi!";
        java.lang.String str24 = null; // flaky: requestBuilder21.getapiUrl();
        java.util.List<retrofit.client.Header> headerList25 = null; // flaky: requestBuilder21.getheaders();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[4, 10.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[4, 10.0, 100.0]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(objArray20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
// flaky:         org.junit.Assert.assertNotNull(headerList25);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.lang.Object[] objArray6 = null; // flaky: requestBuilder5.args;
// flaky:         requestBuilder5.setapiUrl("http://example.com/foo/bar/pong%26/?kit=kat%26");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(objArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[kat]");
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str2 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://example.com/" + "'", str2, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter2.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter2.deserializeObjectRequestBuilder4();
        java.util.List<retrofit.client.Header> headerList9 = null; // flaky: requestBuilder8.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter10.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter10.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter10.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter10.deserializeObjectRequestBuilder20();
        retrofit.client.Request request17 = null; // flaky: requestBuilder16.build();
        retrofit.mime.TypedOutput typedOutput18 = null; // flaky: requestBuilder16.buildBody();
        retrofit.client.Request request19 = new retrofit.client.Request("GET", "/foo/bar/pong/kat/", headerList9, typedOutput18);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(request17);
// flaky:         org.junit.Assert.assertNotNull(typedOutput18);
    }
}
