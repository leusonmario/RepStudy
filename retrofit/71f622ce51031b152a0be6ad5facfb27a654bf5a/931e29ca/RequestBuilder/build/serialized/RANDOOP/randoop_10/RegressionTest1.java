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
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
// flaky:         requestBuilder3.apiUrl = "http://example.com";
        java.lang.String str6 = null; // flaky: requestBuilder3.getapiUrl();
        java.lang.String str7 = null; // flaky: requestBuilder3.buildRelativeUrl();
        java.util.List<retrofit.client.Header> headerList8 = null; // flaky: requestBuilder3.getheaders();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/foo/bar/" + "'", str7, "/foo/bar/");
// flaky:         org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test502");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
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
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
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
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
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
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        java.lang.String str5 = null; // flaky: requestBuilder4.buildRelativeUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/foo/bar/pong%26/" + "'", str5, "/foo/bar/pong%26/");
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
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
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
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
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder3.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = null; // flaky: requestBuilder3.getconverter();
        retrofit.mime.TypedOutput typedOutput7 = null; // flaky: requestBuilder3.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder8();
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.getHeaders();
// flaky:         requestBuilder10.setheaders(headerList22);
// flaky:         requestBuilder3.setheaders(headerList22);
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter27.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder28.setapiUrl("hi!");
        retrofit.converter.Converter converter31 = null; // flaky: requestBuilder28.getconverter();
        retrofit.mime.TypedOutput typedOutput32 = null; // flaky: requestBuilder28.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter33 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter33.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter33.deserializeObjectRequestBuilder8();
        retrofit.client.Header[] headerArray40 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList41 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList41, headerArray40);
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList41, typedOutput43);
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList41, typedOutput45);
        java.util.List<retrofit.client.Header> headerList47 = request46.getHeaders();
// flaky:         requestBuilder35.setheaders(headerList47);
// flaky:         requestBuilder28.setheaders(headerList47);
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder51 = serializedObjectSupporter50.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder52 = serializedObjectSupporter50.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter50.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder54 = serializedObjectSupporter50.deserializeObjectRequestBuilder2();
        java.lang.String str55 = serializedObjectSupporter50.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder56 = serializedObjectSupporter50.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder57 = serializedObjectSupporter50.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput58 = requestBuilder57.buildBody();
        retrofit.client.Request request59 = new retrofit.client.Request("http://example.com/", "http://example.com/", headerList47, typedOutput58);
        retrofit.mime.TypedOutput typedOutput60 = request59.getBody();
        retrofit.client.Request request61 = new retrofit.client.Request("", "/foo/bar/", headerList22, typedOutput60);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(converter6);
        org.junit.Assert.assertNull(typedOutput7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
// flaky:         org.junit.Assert.assertNotNull(converter31);
        org.junit.Assert.assertNull(typedOutput32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder34);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(headerArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(headerList47);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder51);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder52);
        org.junit.Assert.assertNotNull(requestBuilder53);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "http://example.com" + "'", str55, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder56);
        org.junit.Assert.assertNotNull(requestBuilder57);
        org.junit.Assert.assertNotNull(typedOutput58);
        org.junit.Assert.assertNotNull(typedOutput60);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
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
        java.lang.String str15 = request10.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        requestBuilder6.setapiUrl("/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter19.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter19.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter19.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter19.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter19.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter25.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter25.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter25.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter25.deserializeObjectRequestBuilder12();
        java.lang.Object[] objArray31 = null; // flaky: requestBuilder30.getargs();
        retrofit.RequestBuilder requestBuilder32 = null; // flaky: requestBuilder24.args(objArray31);
        requestBuilder18.args = objArray31;
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
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(gsonConverter23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(gsonConverter27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(gsonConverter29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(objArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[pong&, kat&]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[pong&, kat&]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         requestBuilder6.setapiUrl("http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com" + "'", str4, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        requestBuilder4.apiUrl = "/foo/bar/";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections9 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
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
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
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
        retrofit.mime.TypedOutput typedOutput16 = request10.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(typedOutput16);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder15();
        retrofit.client.Request request10 = null; // flaky: requestBuilder9.build();
// flaky:         requestBuilder9.apiUrl = "http://example.com/";
        java.lang.Object[] objArray13 = null; // flaky: requestBuilder9.getargs();
// flaky:         requestBuilder6.setargs(objArray13);
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
// flaky:         requestBuilder6.setheaders(headerList36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(request10);
// flaky:         org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[pong]");
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
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = null;
        requestBuilder3.serializedObjectSupporter = serializedObjectSupporter4;
        java.lang.Object[] objArray6 = requestBuilder3.args;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput16);
        requestBuilder3.headers = headerList12;
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "/foo/bar/", (java.util.List<retrofit.client.Header>) headerList12, typedOutput19);
        java.lang.String str21 = request20.getUrl();
        retrofit.mime.TypedOutput typedOutput22 = request20.getBody();
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "/foo/bar/" + "'", str21, "/foo/bar/");
        org.junit.Assert.assertNull(typedOutput22);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        java.lang.Object[] objArray5 = null; // flaky: requestBuilder4.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(objArray5);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[bar, null, kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[bar, null, kat]");
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder1();
        retrofit.client.Request request11 = requestBuilder10.build();
        java.util.List<retrofit.client.Header> headerList12 = requestBuilder10.headers;
        retrofit.RequestBuilder requestBuilder13 = requestBuilder5.headers(headerList12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(request11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(requestBuilder13);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = null; // flaky: requestBuilder2.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter4.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray7 = null; // flaky: requestBuilder6.getargs();
// flaky:         requestBuilder2.setargs(objArray7);
        java.lang.Class<?> wildcardClass9 = null; // flaky: requestBuilder2.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com" + "'", str3, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(objArray7);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = null;
        requestBuilder3.serializedObjectSupporter = serializedObjectSupporter4;
        java.lang.String str6 = requestBuilder3.apiUrl;
        java.lang.String str7 = requestBuilder3.buildRelativeUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str4 = null; // flaky: requestBuilder3.buildRelativeUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = null; // flaky: requestBuilder3.serializedObjectSupporter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass6 = serializedObjectSupporter5.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/foo/bar/" + "'", str4, "/foo/bar/");
        org.junit.Assert.assertNull(serializedObjectSupporter5);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.mime.TypedOutput typedOutput7 = requestBuilder6.buildBody();
        java.lang.String str8 = requestBuilder6.buildRelativeUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder4.converter;
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
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
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter0.deserializeObjectConverter2();
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
        org.junit.Assert.assertNotNull(gsonConverter11);
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = requestBuilder3.apiUrl("");
        java.lang.Class<?> wildcardClass6 = requestBuilder5.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.List<retrofit.client.Header> headerList6 = null; // flaky: requestBuilder5.getheaders();
        java.lang.String str7 = null; // flaky: requestBuilder5.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(headerList6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com" + "'", str9, "http://example.com");
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.client.Request request7 = requestBuilder6.build();
        retrofit.mime.TypedOutput typedOutput8 = request7.getBody();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNull(typedOutput8);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.lang.String str9 = null; // flaky: requestBuilder8.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com" + "'", str9, "http://example.com");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList4 = null; // flaky: requestBuilder3.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder1();
        java.util.List<retrofit.client.Header> headerList11 = requestBuilder10.getheaders();
// flaky:         requestBuilder3.headers = headerList11;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(headerList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput8 = requestBuilder7.buildBody();
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder7.getheaders();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder4.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
// flaky:         requestBuilder5.setapiUrl("POST");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder21();
// flaky:         requestBuilder5.apiUrl = "http://example.com";
        retrofit.mime.TypedOutput typedOutput8 = null; // flaky: requestBuilder5.buildBody();
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList14, typedOutput18);
// flaky:         requestBuilder5.headers = headerList14;
        java.util.List<retrofit.client.Header> headerList21 = null; // flaky: requestBuilder5.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter24.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter24.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList27 = serializedObjectSupporter24.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter24.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter24.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter24.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter24.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList32 = null; // flaky: requestBuilder31.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter35.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder36.setapiUrl("hi!");
        retrofit.converter.Converter converter39 = null; // flaky: requestBuilder36.getconverter();
        retrofit.mime.TypedOutput typedOutput40 = null; // flaky: requestBuilder36.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter41 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter41.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter41.deserializeObjectRequestBuilder8();
        retrofit.client.Header[] headerArray48 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList49 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList49, headerArray48);
        retrofit.mime.TypedOutput typedOutput51 = null;
        retrofit.client.Request request52 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList49, typedOutput51);
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList49, typedOutput53);
        java.util.List<retrofit.client.Header> headerList55 = request54.getHeaders();
// flaky:         requestBuilder43.setheaders(headerList55);
// flaky:         requestBuilder36.setheaders(headerList55);
        retrofit.SerializedObjectSupporter serializedObjectSupporter58 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder59 = serializedObjectSupporter58.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder60 = serializedObjectSupporter58.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder61 = serializedObjectSupporter58.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder62 = serializedObjectSupporter58.deserializeObjectRequestBuilder2();
        java.lang.String str63 = serializedObjectSupporter58.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder64 = serializedObjectSupporter58.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder65 = serializedObjectSupporter58.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput66 = requestBuilder65.buildBody();
        retrofit.client.Request request67 = new retrofit.client.Request("http://example.com/", "http://example.com/", headerList55, typedOutput66);
        retrofit.client.Request request68 = new retrofit.client.Request("/", "GET", headerList32, typedOutput66);
        retrofit.client.Request request69 = new retrofit.client.Request("/foo/bar/pong%26/", "", headerList21, typedOutput66);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertNotNull(headerList21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(arrayList27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(headerList32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
// flaky:         org.junit.Assert.assertNotNull(converter39);
        org.junit.Assert.assertNull(typedOutput40);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder42);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNotNull(headerArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(headerList55);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder59);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder60);
        org.junit.Assert.assertNotNull(requestBuilder61);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "http://example.com" + "'", str63, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder64);
        org.junit.Assert.assertNotNull(requestBuilder65);
        org.junit.Assert.assertNotNull(typedOutput66);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
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
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
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
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
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
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        java.lang.String str13 = request10.getUrl();
        java.lang.String str14 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        java.lang.String str16 = request10.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
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
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder21();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.Class<?> wildcardClass5 = null; // flaky: requestBuilder4.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.String str6 = null; // flaky: requestBuilder5.buildRelativeUrl();
        java.lang.String str7 = null; // flaky: requestBuilder5.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/foo/bar/" + "'", str6, "/foo/bar/");
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
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
        retrofit.mime.TypedOutput typedOutput15 = request10.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(typedOutput15);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
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
        retrofit.converter.Converter converter16 = null; // flaky: requestBuilder6.getconverter();
        retrofit.converter.Converter converter17 = null; // flaky: requestBuilder6.getconverter();
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
// flaky:         org.junit.Assert.assertNotNull(converter16);
// flaky:         org.junit.Assert.assertNotNull(converter17);
    }

    @Test
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.util.List<retrofit.client.Header> headerList7 = null;
// flaky:         requestBuilder6.headers = headerList7;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = null; // flaky: requestBuilder6.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = null; // flaky: requestBuilder6.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNull(serializedObjectSupporter10);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder5.apiUrl("GET");
        java.util.List<retrofit.client.Header> headerList8 = null; // flaky: requestBuilder5.getheaders();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections10 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
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
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder16();
        java.lang.String str12 = serializedObjectSupporter6.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter0.deserializeObjectConverter8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
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
        retrofit.mime.TypedOutput typedOutput12 = request10.getBody();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertNotNull(headerArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.Object[] objArray6 = null; // flaky: requestBuilder5.getargs();
        retrofit.RequestBuilder requestBuilder8 = null; // flaky: requestBuilder5.apiUrl("hi!");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(objArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
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
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder16();
// flaky:         requestBuilder11.setapiUrl("POST");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.lang.Object[] objArray2 = null; // flaky: requestBuilder1.args;
        java.lang.Object[] objArray3 = null; // flaky: requestBuilder1.args;
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder1.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(objArray2);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray2), "[kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray2), "[kat]");
// flaky:         org.junit.Assert.assertNotNull(objArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[kat]");
// flaky:         org.junit.Assert.assertNotNull(converter4);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str8 = requestBuilder7.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = requestBuilder7.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = null; // flaky: requestBuilder3.apiUrl("/foo/bar/pong/");
        retrofit.client.Request request6 = null; // flaky: requestBuilder5.build();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList10 = serializedObjectSupporter7.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter12 = null;
        retrofit.RequestBuilder requestBuilder13 = new retrofit.RequestBuilder(converter12);
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = null;
        requestBuilder13.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.Object[] objArray16 = requestBuilder13.args;
        retrofit.converter.Converter converter17 = requestBuilder13.getconverter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder13.args = objArray21;
        retrofit.RequestBuilder requestBuilder23 = null; // flaky: requestBuilder11.args(objArray21);
// flaky:         requestBuilder5.setargs(objArray21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(request6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(arrayList10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNull(objArray16);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100.0, 10, 4]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
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
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter5.deserializeObjectRequestBuilder23();
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
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList9 = serializedObjectSupporter6.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList11 = null; // flaky: requestBuilder10.getheaders();
        retrofit.RequestBuilder requestBuilder12 = requestBuilder5.headers(headerList11);
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter13.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter13.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter13.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter13.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter13.deserializeObjectRequestBuilder17();
        requestBuilder5.serializedObjectSupporter = serializedObjectSupporter13;
        retrofit.converter.Converter converter21 = requestBuilder5.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(converter21);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        requestBuilder7.apiUrl = "http://example.com";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter5.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter5.deserializeObjectConverter7();
        java.lang.String str10 = serializedObjectSupporter5.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder23();
// flaky:         requestBuilder4.serializedObjectSupporter = serializedObjectSupporter5;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com" + "'", str10, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
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
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
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
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
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
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter18.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter18.deserializeObjectConverter1();
        java.util.ArrayList arrayList21 = serializedObjectSupporter18.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter18.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList23 = serializedObjectSupporter18.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter18.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter18.deserializeObjectRequestBuilder6();
// flaky:         requestBuilder16.serializedObjectSupporter = serializedObjectSupporter18;
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
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(gsonConverter20);
        org.junit.Assert.assertNotNull(arrayList21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(arrayList23);
        org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.Object[] objArray2 = requestBuilder1.getargs();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter3.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter3.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter3.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter3.deserializeObjectRequestBuilder1();
        java.lang.Object[] objArray8 = requestBuilder7.args;
        requestBuilder1.setargs(objArray8);
        org.junit.Assert.assertNull(objArray2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[[quick, brown, fox]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[[quick, brown, fox]]");
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
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
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
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
        org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder4.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder1();
// flaky:         requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        retrofit.converter.Converter converter13 = null; // flaky: requestBuilder6.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(converter13);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.List<retrofit.client.Header> headerList5 = null; // flaky: requestBuilder4.getheaders();
        retrofit.converter.Converter converter6 = null; // flaky: requestBuilder4.converter;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(headerList5);
// flaky:         org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder1();
        java.util.List<retrofit.client.Header> headerList12 = requestBuilder11.getheaders();
// flaky:         requestBuilder5.setheaders(headerList12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(headerList12);
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList15 = serializedObjectSupporter12.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter12.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = null;
        requestBuilder18.serializedObjectSupporter = serializedObjectSupporter19;
        java.lang.Object[] objArray21 = requestBuilder18.args;
        retrofit.converter.Converter converter22 = requestBuilder18.getconverter();
        java.lang.Object[] objArray26 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder18.args = objArray26;
        retrofit.RequestBuilder requestBuilder28 = null; // flaky: requestBuilder16.args(objArray26);
        retrofit.RequestBuilder requestBuilder29 = null; // flaky: requestBuilder6.args(objArray26);
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter30.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter32 = serializedObjectSupporter30.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter30.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter34 = serializedObjectSupporter30.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter30.deserializeObjectRequestBuilder31();
// flaky:         requestBuilder6.serializedObjectSupporter = serializedObjectSupporter30;
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
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(arrayList15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNull(objArray21);
        org.junit.Assert.assertNull(converter22);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[100.0, 10, 4]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNotNull(gsonConverter32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(gsonConverter34);
        org.junit.Assert.assertNotNull(requestBuilder35);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.client.Header[] headerArray3 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList4 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList4, headerArray3);
        requestBuilder2.setheaders((java.util.List<retrofit.client.Header>) headerList4);
        retrofit.converter.Converter converter7 = requestBuilder2.getconverter();
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder2();
        java.lang.String str12 = null; // flaky: requestBuilder11.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter13.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray16 = null; // flaky: requestBuilder15.getargs();
// flaky:         requestBuilder11.setargs(objArray16);
        java.lang.Object[] objArray18 = null; // flaky: requestBuilder11.args;
        requestBuilder8.setargs(objArray18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(converter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com" + "'", str12, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(objArray16);
// flaky:         org.junit.Assert.assertNotNull(objArray18);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList5 = null; // flaky: requestBuilder4.headers;
        retrofit.converter.Converter converter6 = null; // flaky: requestBuilder4.getconverter();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder4.converter;
        retrofit.RequestBuilder requestBuilder9 = null; // flaky: requestBuilder4.apiUrl("/foo");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(headerList5);
// flaky:         org.junit.Assert.assertNotNull(converter6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         requestBuilder7.setapiUrl("http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter6.deserializeObjectRequestBuilder9();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter13.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray16 = null; // flaky: requestBuilder15.args;
        retrofit.RequestBuilder requestBuilder17 = null; // flaky: requestBuilder12.args(objArray16);
// flaky:         requestBuilder5.setargs(objArray16);
        requestBuilder1.setargs(objArray16);
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(objArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(gsonConverter1);
        org.junit.Assert.assertNotNull(requestBuilder2);
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        java.lang.String str7 = null; // flaky: requestBuilder6.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = null;
// flaky:         requestBuilder2.serializedObjectSupporter = serializedObjectSupporter13;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder20();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder2();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter7.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter7.deserializeObjectRequestBuilder32();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter17.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList20 = serializedObjectSupporter17.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter17.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter17.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter17.deserializeObjectRequestBuilder18();
        java.util.List<retrofit.client.Header> headerList24 = null; // flaky: requestBuilder23.headers;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("/foo/bar/", "hi!", headerList24, typedOutput25);
        retrofit.RequestBuilder requestBuilder27 = requestBuilder14.headers(headerList24);
// flaky:         requestBuilder6.headers = headerList24;
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter31.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter31.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter31.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter31.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter31.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter31.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter31.deserializeObjectRequestBuilder21();
        java.util.List<retrofit.client.Header> headerList39 = null; // flaky: requestBuilder38.getheaders();
        retrofit.converter.Converter converter44 = null;
        retrofit.RequestBuilder requestBuilder45 = new retrofit.RequestBuilder(converter44);
        retrofit.SerializedObjectSupporter serializedObjectSupporter46 = null;
        requestBuilder45.serializedObjectSupporter = serializedObjectSupporter46;
        java.lang.Object[] objArray48 = requestBuilder45.args;
        retrofit.client.Header[] headerArray53 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList54 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList54, headerArray53);
        retrofit.mime.TypedOutput typedOutput56 = null;
        retrofit.client.Request request57 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList54, typedOutput56);
        retrofit.mime.TypedOutput typedOutput58 = null;
        retrofit.client.Request request59 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList54, typedOutput58);
        requestBuilder45.headers = headerList54;
        retrofit.mime.TypedOutput typedOutput61 = null;
        retrofit.client.Request request62 = new retrofit.client.Request("", "/foo/bar/", (java.util.List<retrofit.client.Header>) headerList54, typedOutput61);
        retrofit.SerializedObjectSupporter serializedObjectSupporter65 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder66 = serializedObjectSupporter65.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder67 = serializedObjectSupporter65.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder68 = serializedObjectSupporter65.deserializeObjectRequestBuilder15();
        retrofit.client.Header[] headerArray73 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList74 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList74, headerArray73);
        retrofit.mime.TypedOutput typedOutput76 = null;
        retrofit.client.Request request77 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList74, typedOutput76);
        retrofit.mime.TypedOutput typedOutput78 = null;
        retrofit.client.Request request79 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList74, typedOutput78);
// flaky:         requestBuilder68.setheaders((java.util.List<retrofit.client.Header>) headerList74);
        java.util.List<retrofit.client.Header> headerList81 = null; // flaky: requestBuilder68.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter82 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder83 = serializedObjectSupporter82.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder84 = serializedObjectSupporter82.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder85 = serializedObjectSupporter82.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder86 = serializedObjectSupporter82.deserializeObjectRequestBuilder2();
        java.lang.String str87 = serializedObjectSupporter82.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder88 = serializedObjectSupporter82.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder89 = serializedObjectSupporter82.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput90 = requestBuilder89.buildBody();
        retrofit.client.Request request91 = new retrofit.client.Request("GET", "http://example.com", headerList81, typedOutput90);
        retrofit.client.Request request92 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList54, typedOutput90);
        retrofit.client.Request request93 = new retrofit.client.Request("http://example.com", "/foo/bar/pong/", headerList39, typedOutput90);
        retrofit.client.Request request94 = new retrofit.client.Request("/foo/bar/", "/foo", headerList24, typedOutput90);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com" + "'", str12, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(arrayList20);
        org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder33);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(gsonConverter35);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder37);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder38);
// flaky:         org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNull(objArray48);
        org.junit.Assert.assertNotNull(headerArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder66);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder67);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder68);
        org.junit.Assert.assertNotNull(headerArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
// flaky:         org.junit.Assert.assertNotNull(headerList81);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder83);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder84);
        org.junit.Assert.assertNotNull(requestBuilder85);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder86);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "http://example.com" + "'", str87, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder88);
        org.junit.Assert.assertNotNull(requestBuilder89);
        org.junit.Assert.assertNotNull(typedOutput90);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder7.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(converter8);
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.lang.String str3 = requestBuilder2.getapiUrl();
        retrofit.mime.TypedOutput typedOutput4 = requestBuilder2.buildBody();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com" + "'", str3, "http://example.com");
        org.junit.Assert.assertNull(typedOutput4);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.getheaders();
        retrofit.converter.Converter converter7 = requestBuilder5.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
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
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter0.deserializeObjectConverter8();
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
        org.junit.Assert.assertNotNull(gsonConverter11);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter12.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList16 = null; // flaky: requestBuilder15.headers;
        retrofit.converter.Converter converter21 = null;
        retrofit.RequestBuilder requestBuilder22 = new retrofit.RequestBuilder(converter21);
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = null;
        requestBuilder22.serializedObjectSupporter = serializedObjectSupporter23;
        java.lang.Object[] objArray25 = requestBuilder22.args;
        retrofit.client.Header[] headerArray30 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList31 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList31, headerArray30);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList31, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList31, typedOutput35);
        requestBuilder22.headers = headerList31;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "/foo/bar/", (java.util.List<retrofit.client.Header>) headerList31, typedOutput38);
        retrofit.SerializedObjectSupporter serializedObjectSupporter42 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter42.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter42.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter42.deserializeObjectRequestBuilder15();
        retrofit.client.Header[] headerArray50 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList51 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList51, headerArray50);
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList51, typedOutput53);
        retrofit.mime.TypedOutput typedOutput55 = null;
        retrofit.client.Request request56 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList51, typedOutput55);
// flaky:         requestBuilder45.setheaders((java.util.List<retrofit.client.Header>) headerList51);
        java.util.List<retrofit.client.Header> headerList58 = null; // flaky: requestBuilder45.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter59 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder60 = serializedObjectSupporter59.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder61 = serializedObjectSupporter59.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder62 = serializedObjectSupporter59.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder63 = serializedObjectSupporter59.deserializeObjectRequestBuilder2();
        java.lang.String str64 = serializedObjectSupporter59.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder65 = serializedObjectSupporter59.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder66 = serializedObjectSupporter59.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput67 = requestBuilder66.buildBody();
        retrofit.client.Request request68 = new retrofit.client.Request("GET", "http://example.com", headerList58, typedOutput67);
        retrofit.client.Request request69 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList31, typedOutput67);
        retrofit.client.Request request70 = new retrofit.client.Request("/foo", "/foo", headerList16, typedOutput67);
// flaky:         requestBuilder9.headers = headerList16;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(objArray25);
        org.junit.Assert.assertNotNull(headerArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder43);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder44);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder45);
        org.junit.Assert.assertNotNull(headerArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
// flaky:         org.junit.Assert.assertNotNull(headerList58);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder60);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder61);
        org.junit.Assert.assertNotNull(requestBuilder62);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "http://example.com" + "'", str64, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder65);
        org.junit.Assert.assertNotNull(requestBuilder66);
        org.junit.Assert.assertNotNull(typedOutput67);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder15();
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
// flaky:         requestBuilder9.setheaders((java.util.List<retrofit.client.Header>) headerList15);
        java.util.List<retrofit.client.Header> headerList22 = null; // flaky: requestBuilder9.headers;
        retrofit.RequestBuilder requestBuilder23 = null; // flaky: requestBuilder5.headers(headerList22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
// flaky:         org.junit.Assert.assertNotNull(headerList22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.util.ArrayList arrayList10 = serializedObjectSupporter0.deserializeObjectList1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(arrayList10);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
// flaky:         requestBuilder3.apiUrl = "/foo/bar/";
        java.lang.Object[] objArray6 = null; // flaky: requestBuilder3.getargs();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter7.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter7.deserializeObjectRequestBuilder8();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter15.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter15.deserializeObjectRequestBuilder7();
// flaky:         requestBuilder14.serializedObjectSupporter = serializedObjectSupporter15;
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter15.deserializeObjectConverter4();
// flaky:         requestBuilder3.serializedObjectSupporter = serializedObjectSupporter15;
        java.lang.String str22 = null; // flaky: requestBuilder3.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(objArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[bar, null, kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[bar, null, kat]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(gsonConverter17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(gsonConverter20);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "/foo/bar/" + "'", str22, "/foo/bar/");
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter0.deserializeObjectConverter8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
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
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder16.headers;
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
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
        java.lang.String str47 = request46.getMethod();
        java.util.List<retrofit.client.Header> headerList48 = request46.getHeaders();
        java.util.List<retrofit.client.Header> headerList49 = request46.getHeaders();
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
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "/" + "'", str47, "/");
        org.junit.Assert.assertNotNull(headerList48);
        org.junit.Assert.assertNotNull(headerList49);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = null;
        requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        java.lang.Object[] objArray8 = requestBuilder5.args;
        requestBuilder5.setapiUrl("");
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        requestBuilder5.headers = headerList14;
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList14, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("http://example.com/", "", (java.util.List<retrofit.client.Header>) headerList14, typedOutput21);
        java.lang.String str23 = request22.getMethod();
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com/" + "'", str23, "http://example.com/");
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
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
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        requestBuilder1.apiUrl = "/foo/bar/";
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = null; // flaky: requestBuilder3.apiUrl("/foo/bar/pong/");
        retrofit.client.Request request6 = null; // flaky: requestBuilder5.build();
        java.lang.String str7 = null; // flaky: request6.getMethod();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(request6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "POST" + "'", str7, "POST");
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter7.deserializeObjectConverter6();
// flaky:         requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        java.util.ArrayList arrayList13 = serializedObjectSupporter7.deserializeObjectList3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(arrayList13);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
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
        requestBuilder16.apiUrl = "/foo/bar/";
        retrofit.converter.Converter converter19 = requestBuilder16.getconverter();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNull(converter19);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
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
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request7 = null; // flaky: requestBuilder6.build();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Path parameters must not be null: ping.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
// flaky:         requestBuilder4.apiUrl = "/foo/bar/pong%26/";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList4 = null; // flaky: requestBuilder3.headers;
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder3.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(headerList4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        java.lang.String str8 = request6.getMethod();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = requestBuilder2.serializedObjectSupporter;
        requestBuilder2.setapiUrl("http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.Converter converter5 = null;
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = null;
        requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.Object[] objArray9 = requestBuilder6.args;
        requestBuilder6.setapiUrl("");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        requestBuilder6.headers = headerList15;
        retrofit.RequestBuilder requestBuilder21 = requestBuilder6.apiUrl("hi!");
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter22.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter22.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter22.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter22.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter22.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter22.deserializeObjectRequestBuilder4();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter30.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter30.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList33 = serializedObjectSupporter30.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter30.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter35 = null;
        retrofit.RequestBuilder requestBuilder36 = new retrofit.RequestBuilder(converter35);
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = null;
        requestBuilder36.serializedObjectSupporter = serializedObjectSupporter37;
        java.lang.Object[] objArray39 = requestBuilder36.args;
        retrofit.converter.Converter converter40 = requestBuilder36.getconverter();
        java.lang.Object[] objArray44 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder36.args = objArray44;
        retrofit.RequestBuilder requestBuilder46 = null; // flaky: requestBuilder34.args(objArray44);
// flaky:         requestBuilder29.args = objArray44;
        requestBuilder6.setargs(objArray44);
        retrofit.RequestBuilder requestBuilder49 = requestBuilder4.args(objArray44);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNull(objArray9);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(gsonConverter25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(gsonConverter27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(arrayList33);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNull(objArray39);
        org.junit.Assert.assertNull(converter40);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray44), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray44), "[100.0, 10, 4]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(requestBuilder49);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter10();
// flaky:         requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        java.util.List<retrofit.client.Header> headerList12 = null; // flaky: requestBuilder6.headers;
        retrofit.client.Header[] headerArray17 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList18 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList18, headerArray17);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList18, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter25.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter27 = serializedObjectSupporter25.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter25.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter25.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter25.deserializeObjectRequestBuilder24();
        java.util.List<retrofit.client.Header> headerList31 = null; // flaky: requestBuilder30.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter34.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder35.setapiUrl("hi!");
        retrofit.converter.Converter converter38 = null; // flaky: requestBuilder35.getconverter();
        retrofit.mime.TypedOutput typedOutput39 = null; // flaky: requestBuilder35.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter40 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter40.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter40.deserializeObjectRequestBuilder8();
        retrofit.client.Header[] headerArray47 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList48 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList48, headerArray47);
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList48, typedOutput50);
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList48, typedOutput52);
        java.util.List<retrofit.client.Header> headerList54 = request53.getHeaders();
// flaky:         requestBuilder42.setheaders(headerList54);
// flaky:         requestBuilder35.setheaders(headerList54);
        retrofit.SerializedObjectSupporter serializedObjectSupporter57 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder58 = serializedObjectSupporter57.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder59 = serializedObjectSupporter57.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder60 = serializedObjectSupporter57.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder61 = serializedObjectSupporter57.deserializeObjectRequestBuilder2();
        java.lang.String str62 = serializedObjectSupporter57.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder63 = serializedObjectSupporter57.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder64 = serializedObjectSupporter57.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput65 = requestBuilder64.buildBody();
        retrofit.client.Request request66 = new retrofit.client.Request("http://example.com/", "http://example.com/", headerList54, typedOutput65);
        retrofit.client.Request request67 = new retrofit.client.Request("http://example.com", "GET", headerList31, typedOutput65);
        retrofit.client.Request request68 = new retrofit.client.Request("/foo", "/foo/bar/pong/", headerList22, typedOutput65);
        retrofit.client.Request request69 = new retrofit.client.Request("GET", "/foo", headerList12, typedOutput65);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(headerList22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(gsonConverter27);
        org.junit.Assert.assertNotNull(gsonConverter28);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(headerList31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder35);
// flaky:         org.junit.Assert.assertNotNull(converter38);
        org.junit.Assert.assertNull(typedOutput39);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder41);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(headerArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(headerList54);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder58);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder59);
        org.junit.Assert.assertNotNull(requestBuilder60);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "http://example.com" + "'", str62, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder63);
        org.junit.Assert.assertNotNull(requestBuilder64);
        org.junit.Assert.assertNotNull(typedOutput65);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.Converter converter8 = null; // flaky: requestBuilder7.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(converter8);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter10.deserializeObjectRequestBuilder20();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter15.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter15.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter15.deserializeObjectRequestBuilder2();
        java.lang.String str20 = serializedObjectSupporter15.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter15.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter15.deserializeObjectRequestBuilder32();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter25.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter25.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList28 = serializedObjectSupporter25.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter25.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter25.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter25.deserializeObjectRequestBuilder18();
        java.util.List<retrofit.client.Header> headerList32 = null; // flaky: requestBuilder31.headers;
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("/foo/bar/", "hi!", headerList32, typedOutput33);
        retrofit.RequestBuilder requestBuilder35 = requestBuilder22.headers(headerList32);
// flaky:         requestBuilder14.headers = headerList32;
        requestBuilder9.setheaders(headerList32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "http://example.com" + "'", str20, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter21);
        org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
        org.junit.Assert.assertNotNull(arrayList28);
        org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNotNull(requestBuilder35);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        requestBuilder7.apiUrl = "http://example.com/";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("/foo/bar/", "/foo/bar/pong/", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "/foo/bar/pong/" + "'", str5, "/foo/bar/pong/");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/foo/bar/pong/" + "'", str6, "/foo/bar/pong/");
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder5 = null; // flaky: requestBuilder3.apiUrl("http://example.com/");
        retrofit.converter.Converter converter6 = null; // flaky: requestBuilder3.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
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
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder28();
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
        org.junit.Assert.assertNotNull(requestBuilder13);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter6.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter5();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str7 = requestBuilder6.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.lang.Object[] objArray3 = null; // flaky: requestBuilder2.getargs();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(objArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[pong#, kat#]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[pong#, kat#]");
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
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
        java.lang.String str15 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList16 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = request10.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedOutput17);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.client.Request request3 = null; // flaky: requestBuilder2.build();
// flaky:         requestBuilder2.apiUrl = "http://example.com/";
// flaky:         requestBuilder2.apiUrl = "http://example.com/";
        java.util.List<retrofit.client.Header> headerList8 = null; // flaky: requestBuilder2.getheaders();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(request3);
// flaky:         org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.Converter converter5 = requestBuilder4.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList9 = serializedObjectSupporter6.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter6.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList14 = null; // flaky: requestBuilder13.getheaders();
        requestBuilder4.setheaders(headerList14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(converter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(headerList14);
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder5.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = null; // flaky: requestBuilder2.serializedObjectSupporter;
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder2.converter;
// flaky:         requestBuilder2.apiUrl = "GET";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNull(serializedObjectSupporter3);
// flaky:         org.junit.Assert.assertNotNull(converter4);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = null; // flaky: requestBuilder5.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = null;
        requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        java.lang.Object[] objArray8 = requestBuilder5.args;
        requestBuilder5.setapiUrl("");
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        requestBuilder5.headers = headerList14;
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList14, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter22.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter22.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter22.deserializeObjectRequestBuilder2();
        java.lang.String str27 = serializedObjectSupporter22.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter22.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter22.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput30 = requestBuilder29.buildBody();
        retrofit.client.Request request31 = new retrofit.client.Request("GET", "GET", headerList21, typedOutput30);
        java.lang.String str32 = request31.getMethod();
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(headerList21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "http://example.com" + "'", str27, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertNotNull(typedOutput30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "GET" + "'", str32, "GET");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.lang.String str7 = requestBuilder6.buildRelativeUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        java.lang.Class<?> wildcardClass4 = serializedObjectSupporter0.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
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
        java.util.List<retrofit.client.Header> headerList48 = request46.getHeaders();
        java.lang.String str49 = request46.getUrl();
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
        org.junit.Assert.assertNotNull(headerList48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "GET" + "'", str49, "GET");
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("/foo/bar/", "/foo/bar/pong/", headerList2, typedOutput3);
        java.util.List<retrofit.client.Header> headerList5 = request4.getHeaders();
        java.lang.String str6 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/foo/bar/pong/" + "'", str6, "/foo/bar/pong/");
        org.junit.Assert.assertNull(typedOutput7);
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
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
        retrofit.converter.GsonConverter gsonConverter17 = serializedObjectSupporter7.deserializeObjectConverter5();
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
        org.junit.Assert.assertNotNull(gsonConverter17);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.Object[] objArray2 = requestBuilder1.getargs();
        retrofit.converter.Converter converter3 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder1.getheaders();
        org.junit.Assert.assertNull(objArray2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNull(headerList4);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         requestBuilder4.apiUrl = "hi!";
        java.lang.String str7 = null; // flaky: requestBuilder4.getapiUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.Converter converter9 = null; // flaky: requestBuilder8.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(converter9);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.lang.Object[] objArray3 = null; // flaky: requestBuilder2.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(objArray3);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[pong]");
    }

    @Test
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        java.lang.String str10 = request6.getMethod();
        java.lang.String str11 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput12 = request6.getBody();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(typedOutput12);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         requestBuilder3.apiUrl = "hi!";
        retrofit.mime.TypedOutput typedOutput6 = null; // flaky: requestBuilder3.buildBody();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(typedOutput6);
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
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
        java.util.ArrayList arrayList11 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
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
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter5.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder17();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter12.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter12.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter12.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter12.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray19 = null; // flaky: requestBuilder18.args;
// flaky:         requestBuilder11.setargs(objArray19);
        retrofit.RequestBuilder requestBuilder21 = null; // flaky: requestBuilder4.args(objArray19);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(gsonConverter16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(objArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter4.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter4.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter4.deserializeObjectRequestBuilder2();
        java.lang.String str9 = serializedObjectSupporter4.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter4.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter4.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter4.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter4.deserializeObjectRequestBuilder6();
        java.util.List<retrofit.client.Header> headerList14 = null; // flaky: requestBuilder13.getheaders();
// flaky:         requestBuilder3.setheaders(headerList14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com" + "'", str9, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(headerList14);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        requestBuilder6.apiUrl = "/foo/bar/";
        retrofit.converter.Converter converter9 = requestBuilder6.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(converter9);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.converter.GsonConverter gsonConverter1 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        org.junit.Assert.assertNotNull(gsonConverter1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder8();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter10.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter10.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter10.deserializeObjectRequestBuilder29();
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = null;
        requestBuilder17.serializedObjectSupporter = serializedObjectSupporter18;
        java.lang.Object[] objArray20 = requestBuilder17.args;
        retrofit.converter.Converter converter21 = requestBuilder17.getconverter();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder17.args = objArray25;
        retrofit.RequestBuilder requestBuilder27 = requestBuilder15.args(objArray25);
// flaky:         requestBuilder9.setargs(objArray25);
// flaky:         requestBuilder6.args = objArray25;
        retrofit.client.Request request30 = null; // flaky: requestBuilder6.build();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray25), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray25), "[100.0, 10, 4]");
        org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(request30);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
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
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput11 = request6.getBody();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNull(typedOutput11);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
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
        java.lang.Object[] objArray13 = null; // flaky: requestBuilder7.args;
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
// flaky:         org.junit.Assert.assertNotNull(objArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[pong, kat, raff]");
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder1();
        retrofit.client.Request request7 = requestBuilder6.build();
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder6.headers;
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
        retrofit.client.Request request29 = new retrofit.client.Request("http://example.com", "http://example.com", (java.util.List<retrofit.client.Header>) headerList23, typedOutput28);
        java.util.List<retrofit.client.Header> headerList30 = request29.getHeaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter31.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter31.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter31.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter31.deserializeObjectRequestBuilder2();
        java.lang.String str36 = serializedObjectSupporter31.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter31.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter31.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput39 = requestBuilder38.buildBody();
        retrofit.client.Request request40 = new retrofit.client.Request("GET", "GET", headerList30, typedOutput39);
        retrofit.client.Request request41 = new retrofit.client.Request("hi!", "POST", headerList8, typedOutput39);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(request7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(objArray17);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(headerList30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(requestBuilder34);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "http://example.com" + "'", str36, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNotNull(typedOutput39);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
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
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter5.deserializeObjectConverter1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(gsonConverter11);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
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
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test796");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList12 = serializedObjectSupporter9.deserializeObjectList2();
        java.util.ArrayList arrayList13 = serializedObjectSupporter9.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter9.deserializeObjectRequestBuilder23();
// flaky:         requestBuilder14.setapiUrl("http://example.com/");
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter17.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter17.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter17.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter17.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter17.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter17.deserializeObjectRequestBuilder4();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter25.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter25.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList28 = serializedObjectSupporter25.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter25.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter30 = null;
        retrofit.RequestBuilder requestBuilder31 = new retrofit.RequestBuilder(converter30);
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = null;
        requestBuilder31.serializedObjectSupporter = serializedObjectSupporter32;
        java.lang.Object[] objArray34 = requestBuilder31.args;
        retrofit.converter.Converter converter35 = requestBuilder31.getconverter();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder31.args = objArray39;
        retrofit.RequestBuilder requestBuilder41 = null; // flaky: requestBuilder29.args(objArray39);
// flaky:         requestBuilder24.args = objArray39;
// flaky:         requestBuilder14.setargs(objArray39);
// flaky:         requestBuilder8.setargs(objArray39);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(arrayList13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(gsonConverter20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(gsonConverter22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
        org.junit.Assert.assertNotNull(arrayList28);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertNull(objArray34);
        org.junit.Assert.assertNull(converter35);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[100.0, 10, 4]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder41);
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
    }

    @Test
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter5.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter12 = null;
        retrofit.RequestBuilder requestBuilder13 = new retrofit.RequestBuilder(converter12);
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = null;
        requestBuilder13.serializedObjectSupporter = serializedObjectSupporter14;
        java.lang.Object[] objArray16 = requestBuilder13.args;
        retrofit.converter.Converter converter17 = requestBuilder13.getconverter();
        java.lang.Object[] objArray21 = new java.lang.Object[] { 100.0d, (byte) 10, '4' };
        requestBuilder13.args = objArray21;
        retrofit.RequestBuilder requestBuilder23 = null; // flaky: requestBuilder11.args(objArray21);
// flaky:         requestBuilder4.setargs(objArray21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNull(objArray16);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[100.0, 10, 4]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[100.0, 10, 4]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = requestBuilder6.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.util.List<retrofit.client.Header> headerList7 = requestBuilder6.headers;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com" + "'", str9, "http://example.com");
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        java.lang.String str8 = null; // flaky: requestBuilder7.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter9.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter9.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter9.deserializeObjectRequestBuilder32();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder22();
        java.lang.Object[] objArray17 = null; // flaky: requestBuilder16.args;
        requestBuilder14.args = objArray17;
// flaky:         requestBuilder7.args = objArray17;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(objArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[kat]");
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder8 = null; // flaky: requestBuilder6.apiUrl("http://example.com/");
        retrofit.mime.TypedOutput typedOutput9 = null; // flaky: requestBuilder8.buildBody();
        java.lang.Object[] objArray10 = null; // flaky: requestBuilder8.args;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(typedOutput9);
// flaky:         org.junit.Assert.assertNotNull(objArray10);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray10), "[pong#, kat#]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray10), "[pong#, kat#]");
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.Object[] objArray8 = null; // flaky: requestBuilder7.getargs();
        retrofit.mime.TypedOutput typedOutput9 = null; // flaky: requestBuilder7.buildBody();
        java.util.List<retrofit.client.Header> headerList10 = null; // flaky: requestBuilder7.getheaders();
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
        org.junit.Assert.assertNull(typedOutput9);
// flaky:         org.junit.Assert.assertNotNull(headerList10);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput13 = request10.getBody();
        java.lang.String str14 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headerList15);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
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
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections10 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.util.List<retrofit.client.Header> headerList6 = null; // flaky: requestBuilder5.headers;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        requestBuilder6.apiUrl = "/foo/bar/";
        retrofit.converter.Converter converter9 = requestBuilder6.converter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(converter9);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
// flaky:         requestBuilder6.setapiUrl("");
        java.lang.Class<?> wildcardClass9 = null; // flaky: requestBuilder6.getClass();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
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
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter5.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
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
        retrofit.converter.Converter converter31 = null; // flaky: requestBuilder7.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter32.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter32.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter35 = serializedObjectSupporter32.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter32.deserializeObjectRequestBuilder23();
        retrofit.client.Request request37 = null; // flaky: requestBuilder36.build();
        java.lang.Object[] objArray38 = null; // flaky: requestBuilder36.args;
// flaky:         requestBuilder7.setargs(objArray38);
        retrofit.RequestBuilder requestBuilder41 = null; // flaky: requestBuilder7.apiUrl("hi!");
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
// flaky:         org.junit.Assert.assertNotNull(converter31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder33);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(gsonConverter35);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
// flaky:         org.junit.Assert.assertNotNull(request37);
// flaky:         org.junit.Assert.assertNotNull(objArray38);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray38), "[kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray38), "[kat]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder41);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
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
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter7.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter7.deserializeObjectRequestBuilder13();
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter20.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter20.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter20.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter20.deserializeObjectRequestBuilder20();
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter25.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter25.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter25.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter25.deserializeObjectRequestBuilder2();
        java.lang.String str30 = serializedObjectSupporter25.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter31 = serializedObjectSupporter25.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter25.deserializeObjectRequestBuilder32();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter35.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter35.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList38 = serializedObjectSupporter35.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder39 = serializedObjectSupporter35.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter35.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter35.deserializeObjectRequestBuilder18();
        java.util.List<retrofit.client.Header> headerList42 = null; // flaky: requestBuilder41.headers;
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("/foo/bar/", "hi!", headerList42, typedOutput43);
        retrofit.RequestBuilder requestBuilder45 = requestBuilder32.headers(headerList42);
// flaky:         requestBuilder24.headers = headerList42;
        retrofit.RequestBuilder requestBuilder47 = null; // flaky: requestBuilder19.headers(headerList42);
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
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
        org.junit.Assert.assertNotNull(requestBuilder28);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "http://example.com" + "'", str30, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter31);
        org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(arrayList38);
        org.junit.Assert.assertNotNull(requestBuilder39);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder40);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder41);
// flaky:         org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertNotNull(requestBuilder45);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder47);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString1();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
// flaky:         requestBuilder6.setapiUrl("http://example.com/");
        java.util.List<retrofit.client.Header> headerList9 = null;
        retrofit.RequestBuilder requestBuilder10 = null; // flaky: requestBuilder6.headers(headerList9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
// flaky:         requestBuilder4.apiUrl = "hi!";
        retrofit.RequestBuilder requestBuilder8 = null; // flaky: requestBuilder4.apiUrl("hi!");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = null;
        requestBuilder3.serializedObjectSupporter = serializedObjectSupporter4;
        requestBuilder3.setapiUrl("/foo/bar/pong/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.lang.Object[] objArray4 = null; // flaky: requestBuilder3.getargs();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(objArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[pong]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[pong]");
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        java.util.List<retrofit.client.Header> headerList7 = null; // flaky: requestBuilder6.headers;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        java.lang.Object[] objArray6 = null; // flaky: requestBuilder5.getargs();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(objArray6);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[bar, null, kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[bar, null, kat]");
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.List<retrofit.client.Header> headerList5 = null; // flaky: requestBuilder4.headers;
        java.lang.String str6 = null; // flaky: requestBuilder4.apiUrl;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(headerList5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = null; // flaky: requestBuilder6.serializedObjectSupporter;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter16.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter16.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList19 = serializedObjectSupporter16.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter16.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter16.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter16.deserializeObjectRequestBuilder18();
        java.util.List<retrofit.client.Header> headerList23 = null; // flaky: requestBuilder22.headers;
// flaky:         requestBuilder6.setheaders(headerList23);
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
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(arrayList19);
        org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(headerList23);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder29();
        java.util.List<retrofit.client.Header> headerList14 = requestBuilder13.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter17.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter17.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList21 = null; // flaky: requestBuilder20.headers;
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter27.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter27.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList30 = serializedObjectSupporter27.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter27.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter27.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter27.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter27.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList35 = null; // flaky: requestBuilder34.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter38 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder39 = serializedObjectSupporter38.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder39.setapiUrl("hi!");
        retrofit.converter.Converter converter42 = null; // flaky: requestBuilder39.getconverter();
        retrofit.mime.TypedOutput typedOutput43 = null; // flaky: requestBuilder39.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter44 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter44.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder46 = serializedObjectSupporter44.deserializeObjectRequestBuilder8();
        retrofit.client.Header[] headerArray51 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList52 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList52, headerArray51);
        retrofit.mime.TypedOutput typedOutput54 = null;
        retrofit.client.Request request55 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList52, typedOutput54);
        retrofit.mime.TypedOutput typedOutput56 = null;
        retrofit.client.Request request57 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList52, typedOutput56);
        java.util.List<retrofit.client.Header> headerList58 = request57.getHeaders();
// flaky:         requestBuilder46.setheaders(headerList58);
// flaky:         requestBuilder39.setheaders(headerList58);
        retrofit.SerializedObjectSupporter serializedObjectSupporter61 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder62 = serializedObjectSupporter61.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder63 = serializedObjectSupporter61.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder64 = serializedObjectSupporter61.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder65 = serializedObjectSupporter61.deserializeObjectRequestBuilder2();
        java.lang.String str66 = serializedObjectSupporter61.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder67 = serializedObjectSupporter61.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder68 = serializedObjectSupporter61.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput69 = requestBuilder68.buildBody();
        retrofit.client.Request request70 = new retrofit.client.Request("http://example.com/", "http://example.com/", headerList58, typedOutput69);
        retrofit.client.Request request71 = new retrofit.client.Request("/", "GET", headerList35, typedOutput69);
        retrofit.client.Request request72 = new retrofit.client.Request("http://example.com", "/foo/bar/", headerList24, typedOutput69);
        retrofit.client.Request request73 = new retrofit.client.Request("POST", "", headerList21, typedOutput69);
        retrofit.client.Request request74 = new retrofit.client.Request("hi!", "/foo/bar/pong%26/", headerList14, typedOutput69);
        retrofit.RequestBuilder requestBuilder75 = null; // flaky: requestBuilder5.headers(headerList14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(headerList14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(headerList21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertNotNull(arrayList30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNotNull(requestBuilder32);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder33);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder34);
// flaky:         org.junit.Assert.assertNotNull(headerList35);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder39);
// flaky:         org.junit.Assert.assertNotNull(converter42);
        org.junit.Assert.assertNull(typedOutput43);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder45);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(headerArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(headerList58);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder62);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder63);
        org.junit.Assert.assertNotNull(requestBuilder64);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "http://example.com" + "'", str66, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder67);
        org.junit.Assert.assertNotNull(requestBuilder68);
        org.junit.Assert.assertNotNull(typedOutput69);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder75);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
// flaky:         requestBuilder3.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList12 = null; // flaky: requestBuilder11.headers;
        java.util.List<retrofit.client.Header> headerList15 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter18.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter18.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList21 = serializedObjectSupporter18.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter18.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter18.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter18.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter18.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList26 = null; // flaky: requestBuilder25.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter29.deserializeObjectRequestBuilder22();
// flaky:         requestBuilder30.setapiUrl("hi!");
        retrofit.converter.Converter converter33 = null; // flaky: requestBuilder30.getconverter();
        retrofit.mime.TypedOutput typedOutput34 = null; // flaky: requestBuilder30.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter35 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter35.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter35.deserializeObjectRequestBuilder8();
        retrofit.client.Header[] headerArray42 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList43 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList43, headerArray42);
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList43, typedOutput45);
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList43, typedOutput47);
        java.util.List<retrofit.client.Header> headerList49 = request48.getHeaders();
// flaky:         requestBuilder37.setheaders(headerList49);
// flaky:         requestBuilder30.setheaders(headerList49);
        retrofit.SerializedObjectSupporter serializedObjectSupporter52 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter52.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder54 = serializedObjectSupporter52.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder55 = serializedObjectSupporter52.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder56 = serializedObjectSupporter52.deserializeObjectRequestBuilder2();
        java.lang.String str57 = serializedObjectSupporter52.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder58 = serializedObjectSupporter52.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder59 = serializedObjectSupporter52.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput60 = requestBuilder59.buildBody();
        retrofit.client.Request request61 = new retrofit.client.Request("http://example.com/", "http://example.com/", headerList49, typedOutput60);
        retrofit.client.Request request62 = new retrofit.client.Request("/", "GET", headerList26, typedOutput60);
        retrofit.client.Request request63 = new retrofit.client.Request("http://example.com", "/foo/bar/", headerList15, typedOutput60);
        retrofit.client.Request request64 = new retrofit.client.Request("POST", "", headerList12, typedOutput60);
// flaky:         requestBuilder3.headers = headerList12;
        retrofit.client.Request request66 = null; // flaky: requestBuilder3.build();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(headerList12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(arrayList21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(headerList26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(converter33);
        org.junit.Assert.assertNull(typedOutput34);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(headerArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(headerList49);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder53);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder54);
        org.junit.Assert.assertNotNull(requestBuilder55);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder56);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "http://example.com" + "'", str57, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder58);
        org.junit.Assert.assertNotNull(requestBuilder59);
        org.junit.Assert.assertNotNull(typedOutput60);
// flaky:         org.junit.Assert.assertNotNull(request66);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.client.Request request3 = null; // flaky: requestBuilder2.build();
// flaky:         requestBuilder2.apiUrl = "http://example.com/";
// flaky:         requestBuilder2.apiUrl = "http://example.com/";
        java.lang.String str8 = null; // flaky: requestBuilder2.buildRelativeUrl();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(request3);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/foo/bar/pong/" + "'", str8, "/foo/bar/pong/");
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.mime.TypedOutput typedOutput9 = null; // flaky: requestBuilder8.buildBody();
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Body must not be null.");
        } catch (java.lang.IllegalArgumentException e) {
        // Expected exception.
        }
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter6.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter6.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter6.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder4();
        java.util.List<retrofit.client.Header> headerList14 = null; // flaky: requestBuilder13.headers;
// flaky:         requestBuilder5.setheaders(headerList14);
        retrofit.client.Header[] headerArray18 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList19 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList19, headerArray18);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList19, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList24 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
// flaky:         requestBuilder5.headers = headerList25;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(headerList25);
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.client.Request request9 = null; // flaky: requestBuilder8.build();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(request9);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
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
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList5 = serializedObjectSupporter2.deserializeObjectList2();
        java.util.ArrayList arrayList6 = serializedObjectSupporter2.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter2.deserializeObjectRequestBuilder28();
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.RequestBuilder requestBuilder20 = requestBuilder7.headers(headerList19);
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter21.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter21.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList24 = serializedObjectSupporter21.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter21.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter21.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter21.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter21.deserializeObjectRequestBuilder19();
        java.util.List<retrofit.client.Header> headerList29 = null; // flaky: requestBuilder28.getheaders();
        retrofit.mime.TypedOutput typedOutput30 = null; // flaky: requestBuilder28.buildBody();
        retrofit.client.Request request31 = new retrofit.client.Request("/foo/bar/pong%26/", "GET", headerList19, typedOutput30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(arrayList24);
        org.junit.Assert.assertNotNull(gsonConverter25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
// flaky:         org.junit.Assert.assertNotNull(headerList29);
// flaky:         org.junit.Assert.assertNotNull(typedOutput30);
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.List<retrofit.client.Header> headerList7 = null; // flaky: requestBuilder6.getheaders();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
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
// flaky:         requestBuilder8.args = objArray26;
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
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
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList9 = serializedObjectSupporter6.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList15 = serializedObjectSupporter12.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter12.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList17 = null; // flaky: requestBuilder16.getheaders();
        retrofit.RequestBuilder requestBuilder18 = requestBuilder11.headers(headerList17);
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter19.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter19.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter19.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter19.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter19.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter19.deserializeObjectRequestBuilder17();
        requestBuilder11.serializedObjectSupporter = serializedObjectSupporter19;
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter19.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter19.deserializeObjectRequestBuilder18();
        retrofit.converter.GsonConverter gsonConverter29 = serializedObjectSupporter19.deserializeObjectConverter5();
// flaky:         requestBuilder5.serializedObjectSupporter = serializedObjectSupporter19;
// flaky:         requestBuilder5.apiUrl = "";
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(arrayList15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(gsonConverter29);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.Converter converter7 = null; // flaky: requestBuilder6.getconverter();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList11 = serializedObjectSupporter8.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter8.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter14.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter14.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList17 = serializedObjectSupporter14.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter14.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList19 = null; // flaky: requestBuilder18.getheaders();
        retrofit.RequestBuilder requestBuilder20 = requestBuilder13.headers(headerList19);
        retrofit.RequestBuilder requestBuilder21 = null; // flaky: requestBuilder7.headers(headerList19);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(arrayList17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder22();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.Converter converter4 = null; // flaky: requestBuilder3.converter;
// flaky:         requestBuilder3.apiUrl = "/foo/bar/pong/";
        java.lang.Object[] objArray7 = null; // flaky: requestBuilder3.getargs();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(converter4);
// flaky:         org.junit.Assert.assertNotNull(objArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test884");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder28();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test885");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter0.deserializeObjectConverter4();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
    }

    @Test
    public void test886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test886");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test887");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter10();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test888");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test889");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }
}
