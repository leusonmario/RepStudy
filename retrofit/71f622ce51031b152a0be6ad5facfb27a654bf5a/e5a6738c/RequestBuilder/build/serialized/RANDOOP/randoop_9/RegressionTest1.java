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
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.mime.TypedOutput typedOutput10 = requestBuilder9.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNull(typedOutput10);
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
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder8.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(headerList9);
    }

    @Test
    public void test503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test503");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections4 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test504");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test505");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test506");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        java.lang.String str10 = requestBuilder9.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "/" + "'", str10, "/");
    }

    @Test
    public void test507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test507");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test508");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test509");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test510");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder3();
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        requestBuilder8.setheaders((java.util.List<retrofit.client.Header>) headerList10);
        retrofit.converter.Converter converter13 = requestBuilder8.converter;
        java.lang.Object[] objArray14 = requestBuilder8.getargs();
        retrofit.RequestBuilder requestBuilder15 = requestBuilder5.args(objArray14);
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = null;
        requestBuilder17.serializedObjectSupporter = serializedObjectSupporter18;
        java.lang.Object[] objArray20 = requestBuilder17.args;
        retrofit.client.Header[] headerArray25 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList26 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList26, headerArray25);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList26, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList26, typedOutput30);
        requestBuilder17.headers = headerList26;
        retrofit.converter.Converter converter35 = null;
        retrofit.RequestBuilder requestBuilder36 = new retrofit.RequestBuilder(converter35);
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = null;
        requestBuilder36.serializedObjectSupporter = serializedObjectSupporter37;
        java.lang.Object[] objArray39 = requestBuilder36.args;
        requestBuilder36.setapiUrl("");
        retrofit.client.Header[] headerArray44 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList45 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList45, headerArray44);
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList45, typedOutput47);
        requestBuilder36.headers = headerList45;
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList45, typedOutput50);
        requestBuilder17.setheaders((java.util.List<retrofit.client.Header>) headerList45);
        retrofit.RequestBuilder requestBuilder53 = requestBuilder5.headers((java.util.List<retrofit.client.Header>) headerList45);
        java.lang.Object[] objArray54 = requestBuilder53.args;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(converter13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(objArray39);
        org.junit.Assert.assertNotNull(headerArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(requestBuilder53);
        org.junit.Assert.assertNotNull(objArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray54), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray54), "[pong]");
    }

    @Test
    public void test511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test511");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test512");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test513");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test514");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test515");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList8 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
    }

    @Test
    public void test516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test516");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test517");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test518");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test519");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test520");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test521");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.lang.String str7 = requestBuilder6.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test522");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test523");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test524");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test525");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test526");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter29 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter29.deserializeObjectRequestBuilder5();
        java.util.List<retrofit.client.Header> headerList31 = requestBuilder30.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter32.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter32.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter32.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter36.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter36.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray39 = requestBuilder38.getargs();
        requestBuilder35.setargs(objArray39);
        requestBuilder30.setargs(objArray39);
        retrofit.RequestBuilder requestBuilder42 = requestBuilder5.args(objArray39);
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter43.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter43.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList46 = serializedObjectSupporter43.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter47 = serializedObjectSupporter43.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder48 = serializedObjectSupporter43.deserializeObjectRequestBuilder26();
        java.util.List<retrofit.client.Header> headerList49 = requestBuilder48.headers;
        retrofit.RequestBuilder requestBuilder50 = requestBuilder5.headers(headerList49);
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
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNotNull(requestBuilder33);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray39), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray39), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(requestBuilder45);
        org.junit.Assert.assertNotNull(arrayList46);
        org.junit.Assert.assertNotNull(gsonConverter47);
        org.junit.Assert.assertNotNull(requestBuilder48);
        org.junit.Assert.assertNotNull(headerList49);
        org.junit.Assert.assertNotNull(requestBuilder50);
    }

    @Test
    public void test527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test527");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter3);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNull(headerList6);
    }

    @Test
    public void test528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test528");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test529");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.lang.String str6 = null; // flaky: requestBuilder5.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/foo/bar/" + "'", str6, "/foo/bar/");
    }

    @Test
    public void test530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test530");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test531");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.client.Request request5 = null; // flaky: requestBuilder4.build();
        retrofit.mime.TypedOutput typedOutput6 = null; // flaky: request5.getBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(request5);
        org.junit.Assert.assertNull(typedOutput6);
    }

    @Test
    public void test532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test532");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test533");
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
    public void test534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test534");
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
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
    }

    @Test
    public void test535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test535");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.Class<?> wildcardClass8 = gsonConverter7.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test536");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
    }

    @Test
    public void test537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test537");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder5 = requestBuilder2.apiUrl("http://example.com");
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        requestBuilder2.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter10.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter10.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter10.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter10.deserializeObjectRequestBuilder30();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter16.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter16.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray19 = requestBuilder18.args;
        requestBuilder15.setargs(objArray19);
        requestBuilder2.args = objArray19;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[pong#, kat#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[pong#, kat#]");
    }

    @Test
    public void test538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test538");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test539");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.converter.Converter converter9 = requestBuilder8.converter;
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        requestBuilder8.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        requestBuilder6.headers = headerList11;
        java.lang.String str15 = requestBuilder6.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(converter9);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/" + "'", str15, "/");
    }

    @Test
    public void test540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test540");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test541");
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
        java.util.List<retrofit.client.Header> headerList14 = request10.getHeaders();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
    }

    @Test
    public void test542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test542");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.util.List<retrofit.client.Header> headerList9 = null; // flaky: requestBuilder8.getheaders();
        java.lang.Class<?> wildcardClass10 = null; // flaky: headerList9.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(headerList9);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test543");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test544");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test545");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        java.lang.String str7 = requestBuilder6.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
    }

    @Test
    public void test546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test546");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test547");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test548");
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
        java.lang.String str20 = request18.getUrl();
        retrofit.mime.TypedOutput typedOutput21 = request18.getBody();
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(typedOutput21);
    }

    @Test
    public void test549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test549");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test550");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test551");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com/" + "'", str4, "http://example.com/");
    }

    @Test
    public void test552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test552");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
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
    public void test553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test553");
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
        java.lang.String str38 = request37.getUrl();
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test554");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test555");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter6.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder10 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter9);
        retrofit.RequestBuilder requestBuilder11 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter9);
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
        requestBuilder11.setheaders((java.util.List<retrofit.client.Header>) headerList28);
// flaky:         requestBuilder5.headers = headerList28;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(gsonConverter14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNull(objArray22);
        org.junit.Assert.assertNotNull(headerArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test556");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test557");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.String str7 = requestBuilder6.buildRelativeUrl();
        java.lang.Class<?> wildcardClass8 = requestBuilder6.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/" + "'", str7, "/");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test558");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray7 = requestBuilder6.args;
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.RequestBuilder requestBuilder19 = requestBuilder6.headers((java.util.List<retrofit.client.Header>) headerList13);
        retrofit.converter.Converter converter20 = requestBuilder6.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[pong]");
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(converter20);
    }

    @Test
    public void test559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test559");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com" + "'", str6, "http://example.com");
    }

    @Test
    public void test560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test560");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.client.Request request4 = requestBuilder3.build();
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNull(typedOutput6);
    }

    @Test
    public void test561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test561");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        java.lang.String str5 = requestBuilder4.apiUrl;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test562");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test563");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test564");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
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
        requestBuilder4.headers = headerList17;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
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
    public void test565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test565");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.lang.String str7 = null; // flaky: requestBuilder6.getapiUrl();
        java.util.List<retrofit.client.Header> headerList8 = null; // flaky: requestBuilder6.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test566");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test567");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test568");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter3.deserializeObjectRequestBuilder23();
        requestBuilder4.setapiUrl("hi!");
        retrofit.converter.Converter converter7 = requestBuilder4.getconverter();
        java.lang.String str8 = requestBuilder4.apiUrl;
        retrofit.converter.Converter converter9 = requestBuilder4.converter;
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        java.lang.String str20 = request18.getMethod();
        java.util.List<retrofit.client.Header> headerList21 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", headerList21, typedOutput22);
        requestBuilder4.headers = headerList21;
        retrofit.RequestBuilder requestBuilder25 = null; // flaky: requestBuilder2.headers(headerList21);
        retrofit.converter.Converter converter26 = null; // flaky: requestBuilder25.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(converter9);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headerList21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
// flaky:         org.junit.Assert.assertNotNull(converter26);
    }

    @Test
    public void test569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test569");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test570");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test571");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test572");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        requestBuilder8.setapiUrl("hi!");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test573");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test574");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test575");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test576");
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
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
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
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test577");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com" + "'", str4, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test578");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test579");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.lang.String str5 = null; // flaky: requestBuilder4.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test580");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.lang.Class<?> wildcardClass9 = null; // flaky: requestBuilder8.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test581");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        java.lang.String str7 = requestBuilder6.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test582");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test583");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
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
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList13);
        retrofit.client.Request request19 = requestBuilder1.build();
        retrofit.mime.TypedOutput typedOutput20 = request19.getBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(headerList2);
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertNull(typedOutput20);
    }

    @Test
    public void test584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test584");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.client.Header[] headerArray3 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList4 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList4, headerArray3);
        requestBuilder2.setheaders((java.util.List<retrofit.client.Header>) headerList4);
        retrofit.converter.Converter converter7 = requestBuilder2.converter;
        java.lang.Object[] objArray8 = requestBuilder2.getargs();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = requestBuilder2.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(headerArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(converter7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[pong]");
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test585");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test586");
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
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request17 = requestBuilder16.build();
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
    public void test587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test587");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test588");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test589");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder5.apiUrl("http://example.com");
        java.lang.Object[] objArray8 = null;
// flaky:         requestBuilder5.setargs(objArray8);
        java.lang.Object[] objArray10 = null; // flaky: requestBuilder5.getargs();
        retrofit.converter.Converter converter11 = null; // flaky: requestBuilder5.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNull(objArray10);
// flaky:         org.junit.Assert.assertNotNull(converter11);
    }

    @Test
    public void test590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test590");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        java.util.List<retrofit.client.Header> headerList7 = requestBuilder6.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = requestBuilder6.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test591");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test592");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test593");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        java.util.List<retrofit.client.Header> headerList5 = requestBuilder4.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNull(headerList5);
    }

    @Test
    public void test594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test594");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.String str8 = requestBuilder7.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "/" + "'", str8, "/");
    }

    @Test
    public void test595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test595");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test596");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.mime.TypedOutput typedOutput3 = null; // flaky: requestBuilder2.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(typedOutput3);
    }

    @Test
    public void test597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test597");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = requestBuilder1.serializedObjectSupporter;
        retrofit.RequestBuilder requestBuilder18 = requestBuilder1.apiUrl("GET");
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(serializedObjectSupporter16);
        org.junit.Assert.assertNotNull(requestBuilder18);
    }

    @Test
    public void test598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test598");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test599");
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
        requestBuilder9.apiUrl = "POST";
        retrofit.converter.Converter converter12 = requestBuilder9.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(converter12);
    }

    @Test
    public void test600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test600");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = requestBuilder4.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
    }

    @Test
    public void test601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test601");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test602");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test603");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder5.apiUrl("http://example.com");
        java.lang.Object[] objArray8 = null;
// flaky:         requestBuilder5.setargs(objArray8);
        java.lang.Object[] objArray10 = null; // flaky: requestBuilder5.getargs();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter11.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter11.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter11.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter11.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter11.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter17.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter17.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter17.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter17.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter17.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray24 = requestBuilder23.args;
        requestBuilder16.args = objArray24;
// flaky:         requestBuilder5.setargs(objArray24);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(requestBuilder19);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(gsonConverter21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[pong]");
    }

    @Test
    public void test604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test604");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test605");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
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
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList13);
        retrofit.client.Request request19 = requestBuilder1.build();
        java.lang.String str20 = request19.getMethod();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(headerList2);
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(request19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GET" + "'", str20, "GET");
    }

    @Test
    public void test606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test606");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
    }

    @Test
    public void test607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test607");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test608");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test609");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder3();
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        requestBuilder8.setheaders((java.util.List<retrofit.client.Header>) headerList10);
        retrofit.converter.Converter converter13 = requestBuilder8.converter;
        java.lang.Object[] objArray14 = requestBuilder8.getargs();
        retrofit.RequestBuilder requestBuilder15 = requestBuilder5.args(objArray14);
        retrofit.converter.Converter converter16 = requestBuilder15.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(converter13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(converter16);
    }

    @Test
    public void test610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test610");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.Converter converter6 = requestBuilder5.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test611");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter5.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter5.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter5.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter5.deserializeObjectRequestBuilder30();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter13.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter13.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter13.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter13.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter13.deserializeObjectRequestBuilder3();
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder19.getheaders();
        requestBuilder12.setheaders(headerList20);
// flaky:         requestBuilder4.setheaders(headerList20);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(headerList20);
    }

    @Test
    public void test612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test612");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test613");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test614");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
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
    public void test615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test615");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        requestBuilder9.apiUrl = "/";
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test616");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter6.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder21();
        requestBuilder5.serializedObjectSupporter = serializedObjectSupporter6;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test617");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test618");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test619");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter5);
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder1();
        java.lang.String str12 = serializedObjectSupporter7.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter7.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter14.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter14.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter14.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter18.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter18.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray21 = requestBuilder20.getargs();
        requestBuilder17.setargs(objArray21);
        requestBuilder13.setargs(objArray21);
        requestBuilder6.args = objArray21;
        retrofit.converter.Converter converter25 = requestBuilder6.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com/" + "'", str12, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[pong]");
        org.junit.Assert.assertNotNull(converter25);
    }

    @Test
    public void test620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test620");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.lang.String str6 = requestBuilder5.buildRelativeUrl();
        java.util.List<retrofit.client.Header> headerList7 = requestBuilder5.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        java.lang.Object[] objArray14 = requestBuilder13.args;
        retrofit.RequestBuilder requestBuilder15 = requestBuilder5.args(objArray14);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "/" + "'", str6, "/");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[pong, kat, raff]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[pong, kat, raff]");
        org.junit.Assert.assertNotNull(requestBuilder15);
    }

    @Test
    public void test621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test621");
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
        java.lang.String str19 = request18.getUrl();
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "http://example.com" + "'", str19, "http://example.com");
    }

    @Test
    public void test622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test622");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.String str9 = requestBuilder8.buildRelativeUrl();
        java.lang.Object[] objArray10 = null;
        retrofit.RequestBuilder requestBuilder11 = requestBuilder8.args(objArray10);
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList14 = serializedObjectSupporter12.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter12.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter12.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter12.deserializeObjectRequestBuilder11();
        java.lang.String str18 = requestBuilder17.buildRelativeUrl();
        java.lang.Object[] objArray19 = requestBuilder17.getargs();
        requestBuilder11.setargs(objArray19);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/" + "'", str9, "/");
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(gsonConverter16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "/foo/bar/" + "'", str18, "/foo/bar/");
        org.junit.Assert.assertNotNull(objArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray19), "[[quick, brown, fox]]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray19), "[[quick, brown, fox]]");
    }

    @Test
    public void test623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test623");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test624");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder5.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter7.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter7.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter7.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter7.deserializeObjectRequestBuilder14();
        requestBuilder5.serializedObjectSupporter = serializedObjectSupporter7;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
    }

    @Test
    public void test625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test625");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test626");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test627");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test628");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test629");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test630");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.String str8 = requestBuilder7.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
    }

    @Test
    public void test631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test631");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder25();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder7();
// flaky:         requestBuilder7.serializedObjectSupporter = serializedObjectSupporter8;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(requestBuilder12);
    }

    @Test
    public void test632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test632");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test633");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test634");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test635");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder23();
        java.lang.Object[] objArray7 = requestBuilder6.args;
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder6.getheaders();
        java.util.List<retrofit.client.Header> headerList11 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter12.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter12.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter12.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter12.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter12.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput20 = requestBuilder19.buildBody();
        retrofit.client.Request request21 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList11, typedOutput20);
        retrofit.client.Request request22 = new retrofit.client.Request("", "http://example.com", headerList8, typedOutput20);
        retrofit.client.Request request23 = new retrofit.client.Request("http://example.com", "", headerList2, typedOutput20);
        java.lang.String str24 = request23.getUrl();
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(gsonConverter16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(typedOutput20);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test636");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        requestBuilder3.apiUrl = "http://example.com";
        retrofit.mime.TypedOutput typedOutput6 = requestBuilder3.buildBody();
        java.lang.String str7 = requestBuilder3.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "/foo/bar/pong%3F/" + "'", str7, "/foo/bar/pong%3F/");
    }

    @Test
    public void test637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test637");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder10 = requestBuilder8.apiUrl("http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test638");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.util.List<retrofit.client.Header> headerList6 = null; // flaky: requestBuilder5.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test639");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test640");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter1();
        requestBuilder6.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.String str11 = serializedObjectSupporter7.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com/" + "'", str11, "http://example.com/");
    }

    @Test
    public void test641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test641");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.client.Request request6 = requestBuilder5.build();
        retrofit.RequestBuilder requestBuilder8 = requestBuilder5.apiUrl("/foo/bar/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test642");
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
        requestBuilder1.setapiUrl("http://example.com/");
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(objArray29);
        org.junit.Assert.assertNotNull(headerArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test643");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray3 = requestBuilder2.args;
        retrofit.converter.Converter converter4 = requestBuilder2.converter;
        java.lang.Object[] objArray5 = requestBuilder2.getargs();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[pong#, kat#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[pong#, kat#]");
        org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertNotNull(objArray5);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray5), "[pong#, kat#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray5), "[pong#, kat#]");
    }

    @Test
    public void test644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test644");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test645");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
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
    public void test646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test646");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.lang.String str7 = null; // flaky: requestBuilder6.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        requestBuilder10.setheaders((java.util.List<retrofit.client.Header>) headerList12);
        retrofit.converter.Converter converter15 = requestBuilder10.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter16.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter16.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = requestBuilder18.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter20.deserializeObjectRequestBuilder5();
        java.util.List<retrofit.client.Header> headerList22 = requestBuilder21.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter23.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter23.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter23.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter27 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter27.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter27.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray30 = requestBuilder29.getargs();
        requestBuilder26.setargs(objArray30);
        requestBuilder21.setargs(objArray30);
        requestBuilder18.setargs(objArray30);
        requestBuilder10.setargs(objArray30);
// flaky:         requestBuilder6.args = objArray30;
        retrofit.SerializedObjectSupporter serializedObjectSupporter36 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter36.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter36.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder39 = serializedObjectSupporter36.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter40 = serializedObjectSupporter36.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter36.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder42 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter41);
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter43.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter43.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder46 = serializedObjectSupporter43.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder47 = serializedObjectSupporter43.deserializeObjectRequestBuilder1();
        java.lang.String str48 = serializedObjectSupporter43.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder49 = serializedObjectSupporter43.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter50 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder51 = serializedObjectSupporter50.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter52 = serializedObjectSupporter50.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter50.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter54 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder55 = serializedObjectSupporter54.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder56 = serializedObjectSupporter54.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray57 = requestBuilder56.getargs();
        requestBuilder53.setargs(objArray57);
        requestBuilder49.setargs(objArray57);
        requestBuilder42.args = objArray57;
// flaky:         requestBuilder6.setargs(objArray57);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(converter15);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNull(serializedObjectSupporter19);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(requestBuilder38);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder39);
        org.junit.Assert.assertNotNull(gsonConverter40);
        org.junit.Assert.assertNotNull(gsonConverter41);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(requestBuilder45);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(requestBuilder47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "http://example.com/" + "'", str48, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder49);
        org.junit.Assert.assertNotNull(requestBuilder51);
        org.junit.Assert.assertNotNull(gsonConverter52);
        org.junit.Assert.assertNotNull(requestBuilder53);
        org.junit.Assert.assertNotNull(requestBuilder55);
        org.junit.Assert.assertNotNull(requestBuilder56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[pong]");
    }

    @Test
    public void test647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test647");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
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
    public void test648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test648");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter5);
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test649");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter2.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder7 = requestBuilder5.apiUrl("");
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder7.headers;
        java.util.List<retrofit.client.Header> headerList11 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter12.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter16 = serializedObjectSupporter12.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter12.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter12.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter12.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput20 = requestBuilder19.buildBody();
        retrofit.client.Request request21 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList11, typedOutput20);
        retrofit.client.Request request22 = new retrofit.client.Request("http://example.com", "/", headerList8, typedOutput20);
        java.lang.String str23 = request22.getMethod();
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(gsonConverter16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(typedOutput20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "http://example.com" + "'", str23, "http://example.com");
    }

    @Test
    public void test650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test650");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.Converter converter6 = null; // flaky: requestBuilder5.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test651");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test652");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder5.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter7.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter7.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter7.deserializeObjectRequestBuilder23();
        requestBuilder5.serializedObjectSupporter = serializedObjectSupporter7;
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter16.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter16.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList19 = serializedObjectSupporter16.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter16.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter16.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter22 = serializedObjectSupporter16.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter16.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter16.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter16.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter26 = serializedObjectSupporter16.deserializeObjectConverter4();
        requestBuilder5.serializedObjectSupporter = serializedObjectSupporter16;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(arrayList19);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(gsonConverter22);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(gsonConverter25);
        org.junit.Assert.assertNotNull(gsonConverter26);
    }

    @Test
    public void test653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test653");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.Class<?> wildcardClass5 = requestBuilder4.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test654");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        java.util.List<retrofit.client.Header> headerList12 = requestBuilder11.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter13.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter13.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter17.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray20 = requestBuilder19.getargs();
        requestBuilder16.setargs(objArray20);
        requestBuilder11.setargs(objArray20);
        requestBuilder9.args = objArray20;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray20), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray20), "[pong]");
    }

    @Test
    public void test655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test655");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.Converter converter7 = null;
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = null;
        requestBuilder8.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.Object[] objArray11 = requestBuilder8.args;
        requestBuilder8.setapiUrl("");
        retrofit.converter.Converter converter14 = requestBuilder8.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter15.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = requestBuilder17.serializedObjectSupporter;
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder17.headers;
        requestBuilder8.setheaders(headerList19);
        retrofit.RequestBuilder requestBuilder21 = requestBuilder6.headers(headerList19);
        retrofit.converter.Converter converter22 = requestBuilder21.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNull(serializedObjectSupporter18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(converter22);
    }

    @Test
    public void test656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test656");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder5.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter7.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder24();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder3();
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        requestBuilder14.setheaders((java.util.List<retrofit.client.Header>) headerList16);
        retrofit.RequestBuilder requestBuilder19 = requestBuilder11.headers((java.util.List<retrofit.client.Header>) headerList16);
        requestBuilder5.headers = headerList16;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(requestBuilder19);
    }

    @Test
    public void test657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test657");
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
        retrofit.converter.Converter converter43 = requestBuilder4.converter;
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
        org.junit.Assert.assertNotNull(converter43);
    }

    @Test
    public void test658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test658");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.client.Request request8 = null; // flaky: requestBuilder7.build();
        java.lang.String str9 = null; // flaky: request8.getUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(request8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/foo/bar/" + "'", str9, "http://example.com/foo/bar/");
    }

    @Test
    public void test659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test659");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = request17.getBody();
        retrofit.mime.TypedOutput typedOutput19 = request17.getBody();
        java.util.List<retrofit.client.Header> headerList20 = request17.getHeaders();
        retrofit.RequestBuilder requestBuilder21 = null; // flaky: requestBuilder6.headers(headerList20);
        java.util.List<retrofit.client.Header> headerList22 = null; // flaky: requestBuilder21.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNotNull(headerList20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(headerList22);
    }

    @Test
    public void test660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test660");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test661");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test662");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.Converter converter9 = null;
        retrofit.RequestBuilder requestBuilder10 = new retrofit.RequestBuilder(converter9);
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = null;
        requestBuilder10.serializedObjectSupporter = serializedObjectSupporter11;
        java.lang.Object[] objArray13 = requestBuilder10.args;
        requestBuilder10.setapiUrl("");
        retrofit.client.Header[] headerArray18 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList19 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList19, headerArray18);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList19, typedOutput21);
        requestBuilder10.headers = headerList19;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList19, typedOutput24);
// flaky:         requestBuilder6.headers = headerList19;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test663");
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
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter5.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(gsonConverter12);
    }

    @Test
    public void test664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test664");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test665");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test666");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter12.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter12.deserializeObjectRequestBuilder30();
        requestBuilder16.setapiUrl("http://example.com/");
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder16.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter22.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter22.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter22.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter22.deserializeObjectRequestBuilder3();
        requestBuilder27.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter30.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter30.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter30.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter34.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter34.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter34.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter34.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder39 = serializedObjectSupporter34.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList40 = null; // flaky: requestBuilder39.headers;
        requestBuilder33.headers = headerList40;
        java.util.List<retrofit.client.Header> headerList42 = requestBuilder33.getheaders();
        requestBuilder27.headers = headerList42;
        java.util.List<retrofit.client.Header> headerList46 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter47 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder48 = serializedObjectSupporter47.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder49 = serializedObjectSupporter47.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder50 = serializedObjectSupporter47.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter51 = serializedObjectSupporter47.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder52 = serializedObjectSupporter47.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder53 = serializedObjectSupporter47.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder54 = serializedObjectSupporter47.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput55 = requestBuilder54.buildBody();
        retrofit.client.Request request56 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList46, typedOutput55);
        retrofit.client.Request request57 = new retrofit.client.Request("/", "hi!", headerList42, typedOutput55);
        retrofit.client.Request request58 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList19, typedOutput55);
        retrofit.RequestBuilder requestBuilder59 = requestBuilder3.headers(headerList19);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(requestBuilder27);
        org.junit.Assert.assertNotNull(requestBuilder31);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(requestBuilder36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(gsonConverter38);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder39);
// flaky:         org.junit.Assert.assertNotNull(headerList40);
// flaky:         org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertNotNull(requestBuilder48);
        org.junit.Assert.assertNotNull(requestBuilder49);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder50);
        org.junit.Assert.assertNotNull(gsonConverter51);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder52);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder53);
        org.junit.Assert.assertNotNull(requestBuilder54);
        org.junit.Assert.assertNotNull(typedOutput55);
        org.junit.Assert.assertNotNull(requestBuilder59);
    }

    @Test
    public void test667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test667");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test668");
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
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
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
    public void test669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test669");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter3);
        requestBuilder5.setapiUrl("/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
    }

    @Test
    public void test670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test670");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
    }

    @Test
    public void test671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test671");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test672");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        java.lang.String str9 = null; // flaky: requestBuilder8.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
    }

    @Test
    public void test673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test673");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test674");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test675");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test676");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test677");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
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
    public void test678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test678");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(headerList4);
    }

    @Test
    public void test679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test679");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter7.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter7.deserializeObjectRequestBuilder33();
        java.util.List<retrofit.client.Header> headerList14 = requestBuilder13.getheaders();
        requestBuilder6.setheaders(headerList14);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(headerList14);
    }

    @Test
    public void test680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test680");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test681");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test682");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test683");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter2.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter2.deserializeObjectRequestBuilder30();
        requestBuilder6.setapiUrl("http://example.com/");
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder6.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter12.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter12.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter12.deserializeObjectRequestBuilder3();
        requestBuilder17.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter20 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter20.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter20.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter20.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter24.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter24.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter24.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter24.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter24.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList30 = null; // flaky: requestBuilder29.headers;
        requestBuilder23.headers = headerList30;
        java.util.List<retrofit.client.Header> headerList32 = requestBuilder23.getheaders();
        requestBuilder17.headers = headerList32;
        java.util.List<retrofit.client.Header> headerList36 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter37 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder38 = serializedObjectSupporter37.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder39 = serializedObjectSupporter37.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter37.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter41 = serializedObjectSupporter37.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter37.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder43 = serializedObjectSupporter37.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter37.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput45 = requestBuilder44.buildBody();
        retrofit.client.Request request46 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList36, typedOutput45);
        retrofit.client.Request request47 = new retrofit.client.Request("/", "hi!", headerList32, typedOutput45);
        retrofit.client.Request request48 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList9, typedOutput45);
        java.util.List<retrofit.client.Header> headerList49 = request48.getHeaders();
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
        org.junit.Assert.assertNotNull(gsonConverter28);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(headerList30);
// flaky:         org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNotNull(requestBuilder39);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder40);
        org.junit.Assert.assertNotNull(gsonConverter41);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder42);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(typedOutput45);
        org.junit.Assert.assertNotNull(headerList49);
    }

    @Test
    public void test684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test684");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList11 = serializedObjectSupporter8.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter15.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter18 = serializedObjectSupporter15.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter15.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter15.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter15.deserializeObjectRequestBuilder30();
        retrofit.SerializedObjectSupporter serializedObjectSupporter22 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter22.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter22.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter22.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter22.deserializeObjectRequestBuilder4();
        java.lang.Object[] objArray27 = new java.lang.Object[] { serializedObjectSupporter8, requestBuilder21, requestBuilder26 };
        requestBuilder7.args = objArray27;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(gsonConverter18);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test685");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter5();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test686");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList6 = null; // flaky: requestBuilder5.headers;
// flaky:         requestBuilder5.apiUrl = "GET";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test687");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test688");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.util.ArrayList arrayList2 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.Class<?> wildcardClass5 = serializedObjectSupporter0.getClass();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(arrayList2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test689");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.Converter converter9 = requestBuilder8.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(converter9);
    }

    @Test
    public void test690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test690");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test691");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test692");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test693");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.client.Request request6 = requestBuilder5.build();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(request6);
    }

    @Test
    public void test694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test694");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        requestBuilder9.apiUrl = "http://example.com/foo/bar/";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test695");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter8.deserializeObjectConverter9();
        requestBuilder7.serializedObjectSupporter = serializedObjectSupporter8;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
    }

    @Test
    public void test696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test696");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.converter.Converter converter6 = requestBuilder5.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test697");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter9.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter9.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter9.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter9.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter9.deserializeObjectRequestBuilder3();
        requestBuilder14.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter17.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter17.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter21.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter21.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter21.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter25 = serializedObjectSupporter21.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter21.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList27 = null; // flaky: requestBuilder26.headers;
        requestBuilder20.headers = headerList27;
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder20.getheaders();
        requestBuilder14.headers = headerList29;
        java.util.List<retrofit.client.Header> headerList33 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter34 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter34.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter34.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder37 = serializedObjectSupporter34.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter38 = serializedObjectSupporter34.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder39 = serializedObjectSupporter34.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter34.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter34.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput42 = requestBuilder41.buildBody();
        retrofit.client.Request request43 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList33, typedOutput42);
        retrofit.client.Request request44 = new retrofit.client.Request("/", "hi!", headerList29, typedOutput42);
        requestBuilder6.headers = headerList29;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(requestBuilder23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(gsonConverter25);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(headerList27);
// flaky:         org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(requestBuilder36);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(gsonConverter38);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder39);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder40);
        org.junit.Assert.assertNotNull(requestBuilder41);
        org.junit.Assert.assertNotNull(typedOutput42);
    }

    @Test
    public void test698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test698");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test699");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com" + "'", str4, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test700");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test701");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter7.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter7.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        java.lang.Object[] objArray13 = requestBuilder12.args;
        retrofit.RequestBuilder requestBuilder14 = null; // flaky: requestBuilder6.args(objArray13);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[pong, kat, raff]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[pong, kat, raff]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test702");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter4.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter4.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter4.deserializeObjectRequestBuilder1();
        java.lang.String str9 = serializedObjectSupporter4.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter4.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter11.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter11.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter15.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray18 = requestBuilder17.getargs();
        requestBuilder14.setargs(objArray18);
        requestBuilder10.setargs(objArray18);
        retrofit.RequestBuilder requestBuilder21 = requestBuilder3.args(objArray18);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder21);
    }

    @Test
    public void test703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test703");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = requestBuilder5.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter7.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter7.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter7.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter7.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter7.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter7.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter7.deserializeObjectRequestBuilder23();
        requestBuilder5.serializedObjectSupporter = serializedObjectSupporter7;
        java.lang.String str16 = serializedObjectSupporter7.deserializeObjectString1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(serializedObjectSupporter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(gsonConverter11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "http://example.com" + "'", str16, "http://example.com");
    }

    @Test
    public void test704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test704");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test705");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test706");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test707");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test708");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        java.lang.Object[] objArray8 = requestBuilder7.args;
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = requestBuilder7.serializedObjectSupporter;
        retrofit.converter.Converter converter10 = requestBuilder7.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
        org.junit.Assert.assertNotNull(converter10);
    }

    @Test
    public void test709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test709");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test710");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test711");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test712");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.mime.TypedOutput typedOutput4 = null; // flaky: requestBuilder3.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(typedOutput4);
    }

    @Test
    public void test713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test713");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.Converter converter7 = null;
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = null;
        requestBuilder8.serializedObjectSupporter = serializedObjectSupporter9;
        java.lang.Object[] objArray11 = requestBuilder8.args;
        retrofit.converter.Converter converter12 = requestBuilder8.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter13.deserializeObjectRequestBuilder7();
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder16.headers;
        requestBuilder8.setheaders(headerList17);
// flaky:         requestBuilder6.headers = headerList17;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test714");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.String str11 = request10.getUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test715");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerList6);
    }

    @Test
    public void test716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test716");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        java.lang.Object[] objArray2 = requestBuilder1.args;
        java.lang.String str3 = requestBuilder1.getapiUrl();
        retrofit.converter.Converter converter4 = requestBuilder1.getconverter();
        requestBuilder1.setapiUrl("/");
        retrofit.converter.Converter converter7 = requestBuilder1.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNull(objArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com" + "'", str3, "http://example.com");
        org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertNotNull(converter7);
    }

    @Test
    public void test717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test717");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test718");
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
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter5.deserializeObjectRequestBuilder10();
        java.util.ArrayList arrayList12 = serializedObjectSupporter5.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(arrayList12);
    }

    @Test
    public void test719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test719");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.lang.String str7 = null; // flaky: requestBuilder6.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test720");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(arrayList9);
    }

    @Test
    public void test721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test721");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        requestBuilder7.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = requestBuilder12.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter14.deserializeObjectRequestBuilder5();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder15.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter17.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter17.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter21.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter21.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray24 = requestBuilder23.getargs();
        requestBuilder20.setargs(objArray24);
        requestBuilder15.setargs(objArray24);
        requestBuilder12.setargs(objArray24);
        retrofit.RequestBuilder requestBuilder28 = requestBuilder7.args(objArray24);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNull(serializedObjectSupporter13);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder28);
    }

    @Test
    public void test722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test722");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test723");
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
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter5.deserializeObjectRequestBuilder23();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter13.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter13.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter13.deserializeObjectRequestBuilder1();
        java.lang.String str18 = serializedObjectSupporter13.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter13.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter13.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter21 = serializedObjectSupporter13.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter13.deserializeObjectRequestBuilder17();
        requestBuilder12.serializedObjectSupporter = serializedObjectSupporter13;
        requestBuilder12.apiUrl = "/foo/bar/pong%26/";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(gsonConverter21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
    }

    @Test
    public void test724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test724");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(arrayList7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test725");
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
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter0.deserializeObjectConverter1();
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
        org.junit.Assert.assertNotNull(gsonConverter12);
    }

    @Test
    public void test726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test726");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com" + "'", str4, "http://example.com");
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test727");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test728");
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
        retrofit.SerializedObjectSupporter serializedObjectSupporter11 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter11.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter11.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter11.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter11.deserializeObjectRequestBuilder12();
        retrofit.SerializedObjectSupporter serializedObjectSupporter16 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter16.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter16.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter16.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter20 = serializedObjectSupporter16.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter16.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter16.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter16.deserializeObjectRequestBuilder8();
        retrofit.SerializedObjectSupporter serializedObjectSupporter24 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter24.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter24.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter24.deserializeObjectRequestBuilder15();
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList33, typedOutput37);
// flaky:         requestBuilder27.setheaders((java.util.List<retrofit.client.Header>) headerList33);
        requestBuilder23.setheaders((java.util.List<retrofit.client.Header>) headerList33);
// flaky:         requestBuilder15.setheaders((java.util.List<retrofit.client.Header>) headerList33);
        retrofit.RequestBuilder requestBuilder42 = null; // flaky: requestBuilder10.headers((java.util.List<retrofit.client.Header>) headerList33);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder18);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(gsonConverter20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder27);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder42);
    }

    @Test
    public void test729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test729");
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
        retrofit.mime.TypedOutput typedOutput26 = requestBuilder25.buildBody();
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
        org.junit.Assert.assertNotNull(typedOutput26);
    }

    @Test
    public void test730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test730");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test731");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test732");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.Converter converter2 = requestBuilder1.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter3 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter3.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter3.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter3.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter3.deserializeObjectRequestBuilder15();
        requestBuilder1.serializedObjectSupporter = serializedObjectSupporter3;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(converter2);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test733");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test734");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test735");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray3 = requestBuilder2.args;
        retrofit.converter.Converter converter4 = requestBuilder2.converter;
        java.lang.String str5 = requestBuilder2.apiUrl;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(objArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray3), "[pong#, kat#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray3), "[pong#, kat#]");
        org.junit.Assert.assertNotNull(converter4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
    }

    @Test
    public void test736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test736");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test737");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test738");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        java.lang.Object[] objArray9 = null; // flaky: requestBuilder8.getargs();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(arrayList7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(objArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[]");
    }

    @Test
    public void test739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test739");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.client.Request request6 = requestBuilder5.build();
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com/" + "'", str9, "http://example.com/");
        org.junit.Assert.assertNull(typedOutput10);
    }

    @Test
    public void test740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test740");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder9.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(headerList10);
    }

    @Test
    public void test741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test741");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.lang.String str10 = serializedObjectSupporter0.deserializeObjectString2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com/" + "'", str10, "http://example.com/");
    }

    @Test
    public void test742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test742");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        java.lang.Object[] objArray6 = requestBuilder5.getargs();
        retrofit.SerializedObjectSupporter serializedObjectSupporter7 = requestBuilder5.serializedObjectSupporter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter8.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter8.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter8.deserializeObjectRequestBuilder32();
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder16.headers;
        requestBuilder5.headers = headerList17;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNull(serializedObjectSupporter7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test743");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test744");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
    }

    @Test
    public void test745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test745");
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
        retrofit.client.Request request35 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList29, typedOutput34);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList29);
        retrofit.client.Header[] headerArray41 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList42 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList42, headerArray41);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList42, typedOutput44);
        java.util.List<retrofit.client.Header> headerList46 = request45.getHeaders();
        java.lang.String str47 = request45.getMethod();
        java.util.List<retrofit.client.Header> headerList48 = request45.getHeaders();
        retrofit.mime.TypedOutput typedOutput49 = null;
        retrofit.client.Request request50 = new retrofit.client.Request("", "hi!", headerList48, typedOutput49);
        java.lang.String str51 = request50.getUrl();
        java.util.List<retrofit.client.Header> headerList52 = request50.getHeaders();
        requestBuilder1.setheaders(headerList52);
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(objArray23);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(headerArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(headerList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNotNull(headerList48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(headerList52);
    }

    @Test
    public void test746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test746");
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
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        requestBuilder12.apiUrl = "/foo/bar/";
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
        org.junit.Assert.assertNotNull(requestBuilder12);
    }

    @Test
    public void test747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test747");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.SerializedObjectSupporter serializedObjectSupporter9 = requestBuilder8.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(serializedObjectSupporter9);
    }

    @Test
    public void test748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test748");
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
        java.lang.String str39 = request37.getMethod();
        java.lang.String str40 = request37.getUrl();
        java.lang.String str41 = request37.getMethod();
        java.lang.String str42 = request37.getMethod();
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
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "/" + "'", str39, "/");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "/" + "'", str41, "/");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "/" + "'", str42, "/");
    }

    @Test
    public void test749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test749");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test750");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test751");
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
        java.lang.Object[] objArray24 = requestBuilder1.args;
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
    public void test752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test752");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.SerializedObjectSupporter serializedObjectSupporter4 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter4.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter4.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter4.deserializeObjectRequestBuilder1();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter4.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter4.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter4.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter4.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter4.deserializeObjectRequestBuilder16();
        retrofit.SerializedObjectSupporter serializedObjectSupporter13 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter13.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter15 = serializedObjectSupporter13.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter13.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter13.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter13.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter19.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter19.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray22 = requestBuilder21.getargs();
        requestBuilder18.setargs(objArray22);
        java.lang.Object[] objArray24 = requestBuilder18.args;
// flaky:         requestBuilder12.setargs(objArray24);
        requestBuilder3.args = objArray24;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(gsonConverter15);
        org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[pong]");
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray24), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray24), "[pong]");
    }

    @Test
    public void test753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test753");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test754");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test755");
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
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter5.deserializeObjectRequestBuilder31();
        java.lang.String str11 = requestBuilder10.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(arrayList8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com" + "'", str11, "http://example.com");
    }

    @Test
    public void test756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test756");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter5);
        java.lang.String str7 = requestBuilder6.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test757");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test758");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        requestBuilder4.setapiUrl("/foo/bar/pong%26/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test759");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.client.Request request4 = requestBuilder3.build();
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList6 = request4.getHeaders();
        java.lang.String str7 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(request4);
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com/" + "'", str7, "http://example.com/");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNull(typedOutput9);
    }

    @Test
    public void test760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test760");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test761");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test762");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test763");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test764");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
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
    public void test765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test765");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        java.lang.String str4 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "http://example.com" + "'", str4, "http://example.com");
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test766");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder26();
        retrofit.SerializedObjectSupporter serializedObjectSupporter12 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter12.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter12.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter12.deserializeObjectRequestBuilder9();
        retrofit.SerializedObjectSupporter serializedObjectSupporter17 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter17.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter17.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter17.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter17.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter17.deserializeObjectRequestBuilder30();
        retrofit.SerializedObjectSupporter serializedObjectSupporter23 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter23.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter23.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter23.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter23.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter28 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter28.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter28.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter28.deserializeObjectRequestBuilder15();
        retrofit.SerializedObjectSupporter serializedObjectSupporter32 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter32.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter32.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray35 = requestBuilder34.getargs();
        retrofit.RequestBuilder requestBuilder36 = null; // flaky: requestBuilder31.args(objArray35);
        requestBuilder27.setargs(objArray35);
        retrofit.RequestBuilder requestBuilder38 = requestBuilder22.args(objArray35);
        requestBuilder16.args = objArray35;
        requestBuilder11.setargs(objArray35);
        requestBuilder5.setargs(objArray35);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(requestBuilder27);
        org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[pong]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder36);
        org.junit.Assert.assertNotNull(requestBuilder38);
    }

    @Test
    public void test767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test767");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test768");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.converter.Converter converter5 = null; // flaky: requestBuilder4.getconverter();
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(converter5);
    }

    @Test
    public void test769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test769");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        requestBuilder10.setheaders((java.util.List<retrofit.client.Header>) headerList12);
        retrofit.converter.Converter converter15 = requestBuilder10.converter;
        java.lang.Object[] objArray16 = requestBuilder10.getargs();
        java.lang.Object[] objArray17 = requestBuilder10.getargs();
        requestBuilder7.args = objArray17;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(converter15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[pong]");
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[pong]");
    }

    @Test
    public void test770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test770");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter6.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter6.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray13 = requestBuilder12.args;
        requestBuilder5.args = objArray13;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter15.deserializeObjectRequestBuilder2();
        java.lang.String str18 = serializedObjectSupporter15.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter15.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter15.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter15.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList22 = null; // flaky: requestBuilder21.headers;
        requestBuilder5.headers = headerList22;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(objArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray13), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray13), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "http://example.com/" + "'", str18, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(headerList22);
    }

    @Test
    public void test771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test771");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test772");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test773");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = requestBuilder7.serializedObjectSupporter;
        retrofit.converter.Converter converter9 = requestBuilder7.getconverter();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(converter9);
    }

    @Test
    public void test774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test774");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test775");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test776");
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
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter5.deserializeObjectRequestBuilder20();
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
        org.junit.Assert.assertNotNull(requestBuilder15);
    }

    @Test
    public void test777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test777");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test778");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
    }

    @Test
    public void test779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test779");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test780");
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
        retrofit.mime.TypedOutput typedOutput17 = request13.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(typedOutput17);
    }

    @Test
    public void test781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test781");
        retrofit.SerializedObjectSupporter serializedObjectSupporter2 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter2.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter2.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList5 = serializedObjectSupporter2.deserializeObjectList2();
        java.util.ArrayList arrayList6 = serializedObjectSupporter2.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter2.deserializeObjectRequestBuilder29();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = requestBuilder7.serializedObjectSupporter;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.getHeaders();
        requestBuilder7.headers = headerList16;
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder7.headers;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter21.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter21.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter21.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter21.deserializeObjectRequestBuilder30();
        requestBuilder25.setapiUrl("http://example.com/");
        java.util.List<retrofit.client.Header> headerList28 = requestBuilder25.getheaders();
        retrofit.SerializedObjectSupporter serializedObjectSupporter31 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter31.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder33 = serializedObjectSupporter31.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder34 = serializedObjectSupporter31.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder35 = serializedObjectSupporter31.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder36 = serializedObjectSupporter31.deserializeObjectRequestBuilder3();
        requestBuilder36.apiUrl = "http://example.com";
        retrofit.SerializedObjectSupporter serializedObjectSupporter39 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder40 = serializedObjectSupporter39.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder41 = serializedObjectSupporter39.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder42 = serializedObjectSupporter39.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter43 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder44 = serializedObjectSupporter43.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder45 = serializedObjectSupporter43.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder46 = serializedObjectSupporter43.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter47 = serializedObjectSupporter43.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder48 = serializedObjectSupporter43.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList49 = null; // flaky: requestBuilder48.headers;
        requestBuilder42.headers = headerList49;
        java.util.List<retrofit.client.Header> headerList51 = requestBuilder42.getheaders();
        requestBuilder36.headers = headerList51;
        java.util.List<retrofit.client.Header> headerList55 = null;
        retrofit.SerializedObjectSupporter serializedObjectSupporter56 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder57 = serializedObjectSupporter56.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder58 = serializedObjectSupporter56.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder59 = serializedObjectSupporter56.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter60 = serializedObjectSupporter56.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder61 = serializedObjectSupporter56.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder62 = serializedObjectSupporter56.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder63 = serializedObjectSupporter56.deserializeObjectRequestBuilder1();
        retrofit.mime.TypedOutput typedOutput64 = requestBuilder63.buildBody();
        retrofit.client.Request request65 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList55, typedOutput64);
        retrofit.client.Request request66 = new retrofit.client.Request("/", "hi!", headerList51, typedOutput64);
        retrofit.client.Request request67 = new retrofit.client.Request("http://example.com", "http://example.com/", headerList28, typedOutput64);
        retrofit.client.Request request68 = new retrofit.client.Request("GET", "/foo/bar/", headerList18, typedOutput64);
        retrofit.mime.TypedOutput typedOutput69 = request68.getBody();
        java.util.List<retrofit.client.Header> headerList70 = request68.getHeaders();
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(requestBuilder36);
        org.junit.Assert.assertNotNull(requestBuilder40);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder41);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(requestBuilder45);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(gsonConverter47);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder48);
// flaky:         org.junit.Assert.assertNotNull(headerList49);
// flaky:         org.junit.Assert.assertNotNull(headerList51);
        org.junit.Assert.assertNotNull(requestBuilder57);
        org.junit.Assert.assertNotNull(requestBuilder58);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder59);
        org.junit.Assert.assertNotNull(gsonConverter60);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder61);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder62);
        org.junit.Assert.assertNotNull(requestBuilder63);
        org.junit.Assert.assertNotNull(typedOutput64);
        org.junit.Assert.assertNotNull(typedOutput69);
        org.junit.Assert.assertNotNull(headerList70);
    }

    @Test
    public void test782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test782");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        java.lang.String str9 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "http://example.com" + "'", str9, "http://example.com");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
    }

    @Test
    public void test783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test783");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test784");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test785");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections13 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
    }

    @Test
    public void test786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test786");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test787");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        retrofit.RequestBuilder requestBuilder9 = requestBuilder7.apiUrl("");
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter10.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter10.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        java.lang.Object[] objArray16 = requestBuilder15.args;
        requestBuilder7.args = objArray16;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray16), "[pong, kat, raff]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray16), "[pong, kat, raff]");
    }

    @Test
    public void test788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test788");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList3();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test789");
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
        java.lang.String str11 = requestBuilder10.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "http://example.com" + "'", str11, "http://example.com");
    }

    @Test
    public void test790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test790");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test791");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder7 = requestBuilder5.apiUrl("/foo/bar/");
        retrofit.RequestBuilder requestBuilder9 = requestBuilder7.apiUrl("http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test792");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test793");
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
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter8.deserializeObjectRequestBuilder12();
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
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test794");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test795");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
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
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter8.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter8.deserializeObjectConverter8();
// flaky:         requestBuilder7.serializedObjectSupporter = serializedObjectSupporter8;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(gsonConverter13);
        org.junit.Assert.assertNotNull(gsonConverter14);
    }

    @Test
    public void test797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test797");
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
        retrofit.RequestBuilder requestBuilder11 = new retrofit.RequestBuilder((retrofit.converter.Converter) gsonConverter10);
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
    }

    @Test
    public void test798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test798");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test799");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
    }

    @Test
    public void test800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test800");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
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
    public void test801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test801");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder3();
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        requestBuilder8.setheaders((java.util.List<retrofit.client.Header>) headerList10);
        retrofit.converter.Converter converter13 = requestBuilder8.converter;
        java.lang.Object[] objArray14 = requestBuilder8.getargs();
        retrofit.RequestBuilder requestBuilder15 = requestBuilder5.args(objArray14);
        retrofit.RequestBuilder requestBuilder17 = requestBuilder15.apiUrl("/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(converter13);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[pong]");
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder17);
    }

    @Test
    public void test802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test802");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = requestBuilder7.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNull(serializedObjectSupporter8);
    }

    @Test
    public void test803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test803");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.client.Request request7 = null; // flaky: requestBuilder6.build();
        java.lang.String str8 = null; // flaky: request7.getMethod();
        java.lang.String str9 = null; // flaky: request7.getMethod();
        java.lang.String str10 = null; // flaky: request7.getMethod();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(request7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "POST" + "'", str8, "POST");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "POST" + "'", str9, "POST");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "POST" + "'", str10, "POST");
    }

    @Test
    public void test804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test804");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
    }

    @Test
    public void test805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test805");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter10.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter10.deserializeObjectRequestBuilder17();
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter15.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray18 = requestBuilder17.args;
// flaky:         requestBuilder14.args = objArray18;
        requestBuilder9.args = objArray18;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray18), "[pong#, kat#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray18), "[pong#, kat#]");
    }

    @Test
    public void test806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test806");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.Object[] objArray4 = requestBuilder3.args;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(objArray4);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray4), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray4), "[]");
    }

    @Test
    public void test807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test807");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test808");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        java.lang.String str7 = serializedObjectSupporter0.deserializeObjectString1();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http://example.com" + "'", str7, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test809");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test810");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        java.lang.String str8 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.ArrayList arrayList9 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        requestBuilder10.setapiUrl("http://example.com");
        java.util.List<retrofit.client.Header> headerList13 = requestBuilder10.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertNotNull(arrayList9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test811");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test812");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test813");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
    }

    @Test
    public void test814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test814");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections8 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test815");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList5 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(arrayList5);
    }

    @Test
    public void test816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test816");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test817");
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
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter5.deserializeObjectConverter1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(gsonConverter12);
    }

    @Test
    public void test818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test818");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.util.List<retrofit.client.Header> headerList5 = requestBuilder4.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(headerList5);
    }

    @Test
    public void test819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test819");
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
        java.util.List<retrofit.client.Header> headerList10 = null; // flaky: requestBuilder9.headers;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(headerList10);
    }

    @Test
    public void test820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test820");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter5.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter5.deserializeObjectRequestBuilder3();
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        requestBuilder7.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.RequestBuilder requestBuilder12 = requestBuilder4.headers((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.converter.Converter converter13 = requestBuilder4.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(converter13);
    }

    @Test
    public void test821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test821");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter3();
// flaky:         org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
    }

    @Test
    public void test822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test822");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        java.util.ArrayList arrayList10 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(arrayList10);
    }

    @Test
    public void test823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test823");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test824");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test825");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.client.Request request5 = null; // flaky: requestBuilder4.build();
// flaky:         requestBuilder4.apiUrl = "http://example.com/";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(request5);
    }

    @Test
    public void test826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test826");
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
        requestBuilder3.apiUrl = "/";
        java.lang.String str15 = requestBuilder3.buildRelativeUrl();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "/foo/bar/pong/" + "'", str15, "/foo/bar/pong/");
    }

    @Test
    public void test827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test827");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.String str12 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput13 = request10.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
    }

    @Test
    public void test828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test828");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.Converter converter3 = requestBuilder2.converter;
        retrofit.RequestBuilder requestBuilder5 = requestBuilder2.apiUrl("http://example.com");
        retrofit.converter.Converter converter6 = requestBuilder2.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(converter6);
    }

    @Test
    public void test829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test829");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.client.Request request6 = requestBuilder5.build();
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(request6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com/" + "'", str8, "http://example.com/");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "GET" + "'", str9, "GET");
        org.junit.Assert.assertNotNull(headerList10);
    }

    @Test
    public void test830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test830");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test831");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test832");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test833");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
    }

    @Test
    public void test834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test834");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList11 = serializedObjectSupporter8.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder1();
        retrofit.converter.Converter converter14 = requestBuilder13.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter15 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter15.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter15.deserializeObjectRequestBuilder5();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter19.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter19.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter19.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter23 = serializedObjectSupporter19.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter19.deserializeObjectRequestBuilder17();
        java.util.List<retrofit.client.Header> headerList25 = null; // flaky: requestBuilder24.headers;
        requestBuilder18.headers = headerList25;
        java.util.List<retrofit.client.Header> headerList27 = requestBuilder18.getheaders();
        requestBuilder13.headers = headerList27;
        retrofit.RequestBuilder requestBuilder29 = null; // flaky: requestBuilder7.headers(headerList27);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(converter14);
        org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(gsonConverter23);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder24);
// flaky:         org.junit.Assert.assertNotNull(headerList25);
// flaky:         org.junit.Assert.assertNotNull(headerList27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
    }

    @Test
    public void test835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test835");
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
        retrofit.converter.GsonConverter gsonConverter11 = serializedObjectSupporter0.deserializeObjectConverter2();
        java.lang.String str12 = serializedObjectSupporter0.deserializeObjectString1();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "http://example.com" + "'", str12, "http://example.com");
    }

    @Test
    public void test836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test836");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test837");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter6();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test838");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder11();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test839");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
    }

    @Test
    public void test840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test840");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test841");
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
// flaky:         requestBuilder12.setapiUrl("/foo/bar/");
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
    public void test842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test842");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test843");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test844");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        requestBuilder6.apiUrl = "/foo/bar/pong%3F/";
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test845");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = requestBuilder4.serializedObjectSupporter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
    }

    @Test
    public void test846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test846");
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
        java.util.List<retrofit.client.Header> headerList16 = null;
        retrofit.RequestBuilder requestBuilder17 = null; // flaky: requestBuilder3.headers(headerList16);
        retrofit.SerializedObjectSupporter serializedObjectSupporter18 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder19 = serializedObjectSupporter18.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter18.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter18.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter18.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter18.deserializeObjectRequestBuilder25();
        java.util.List<retrofit.client.Header> headerList24 = requestBuilder23.headers;
// flaky:         requestBuilder3.setheaders(headerList24);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(headerList24);
    }

    @Test
    public void test847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test847");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        java.lang.String str5 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder14();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        java.util.ArrayList arrayList12 = serializedObjectSupporter0.deserializeObjectList1();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com/" + "'", str5, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(arrayList12);
    }

    @Test
    public void test848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test848");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        java.util.ArrayList arrayList7 = serializedObjectSupporter0.deserializeObjectList2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(arrayList7);
    }

    @Test
    public void test849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test849");
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
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.converter.GsonConverter gsonConverter12 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter0.deserializeObjectConverter10();
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
        org.junit.Assert.assertNotNull(gsonConverter12);
        org.junit.Assert.assertNotNull(gsonConverter13);
    }

    @Test
    public void test850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test850");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.String str4 = requestBuilder3.buildRelativeUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/" + "'", str4, "/");
    }

    @Test
    public void test851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test851");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.mime.TypedOutput typedOutput7 = requestBuilder6.buildBody();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNull(typedOutput7);
    }

    @Test
    public void test852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test852");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter6();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
    }

    @Test
    public void test853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test853");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections4 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
    }

    @Test
    public void test854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test854");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test855");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test856");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request11.getHeaders();
        requestBuilder3.headers = headerList13;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(headerList4);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test857");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test858");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder6();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test859");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray7 = requestBuilder6.args;
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.RequestBuilder requestBuilder19 = requestBuilder6.headers((java.util.List<retrofit.client.Header>) headerList13);
        retrofit.converter.Converter converter20 = requestBuilder19.converter;
        retrofit.SerializedObjectSupporter serializedObjectSupporter21 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder22 = serializedObjectSupporter21.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder23 = serializedObjectSupporter21.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder24 = serializedObjectSupporter21.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder25 = serializedObjectSupporter21.deserializeObjectRequestBuilder3();
        retrofit.SerializedObjectSupporter serializedObjectSupporter26 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter26.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder28 = serializedObjectSupporter26.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter26.deserializeObjectRequestBuilder15();
        retrofit.SerializedObjectSupporter serializedObjectSupporter30 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder31 = serializedObjectSupporter30.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder32 = serializedObjectSupporter30.deserializeObjectRequestBuilder2();
        java.lang.Object[] objArray33 = requestBuilder32.getargs();
        retrofit.RequestBuilder requestBuilder34 = null; // flaky: requestBuilder29.args(objArray33);
        requestBuilder25.setargs(objArray33);
        retrofit.RequestBuilder requestBuilder36 = requestBuilder19.args(objArray33);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[pong]");
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNotNull(converter20);
        org.junit.Assert.assertNotNull(requestBuilder22);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(requestBuilder27);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder28);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray33), "[pong]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray33), "[pong]");
// flaky:         org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(requestBuilder36);
    }

    @Test
    public void test860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test860");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder25();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
        org.junit.Assert.assertNotNull(gsonConverter9);
    }

    @Test
    public void test861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test861");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test862");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList11 = serializedObjectSupporter8.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder9();
        retrofit.SerializedObjectSupporter serializedObjectSupporter14 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter14.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter14.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter14.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder18 = serializedObjectSupporter14.deserializeObjectRequestBuilder17();
        retrofit.SerializedObjectSupporter serializedObjectSupporter19 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder20 = serializedObjectSupporter19.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder21 = serializedObjectSupporter19.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray22 = requestBuilder21.args;
// flaky:         requestBuilder18.args = objArray22;
        requestBuilder13.args = objArray22;
        retrofit.SerializedObjectSupporter serializedObjectSupporter25 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder26 = serializedObjectSupporter25.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder27 = serializedObjectSupporter25.deserializeObjectRequestBuilder3();
        retrofit.converter.GsonConverter gsonConverter28 = serializedObjectSupporter25.deserializeObjectConverter10();
        retrofit.RequestBuilder requestBuilder29 = serializedObjectSupporter25.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder30 = serializedObjectSupporter25.deserializeObjectRequestBuilder16();
        java.lang.Object[] objArray31 = null; // flaky: requestBuilder30.args;
        requestBuilder13.args = objArray31;
        requestBuilder7.setargs(objArray31);
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder18);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(requestBuilder21);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray22), "[pong#, kat#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray22), "[pong#, kat#]");
        org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(requestBuilder27);
        org.junit.Assert.assertNotNull(gsonConverter28);
        org.junit.Assert.assertNotNull(requestBuilder29);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder30);
// flaky:         org.junit.Assert.assertNotNull(objArray31);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray31), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray31), "[]");
    }

    @Test
    public void test863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test863");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
    }

    @Test
    public void test864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test864");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.client.Request request9 = null; // flaky: requestBuilder8.build();
        java.lang.String str10 = null; // flaky: requestBuilder8.getapiUrl();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(request9);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://example.com" + "'", str10, "http://example.com");
    }

    @Test
    public void test865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test865");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder9();
        requestBuilder6.setapiUrl("/foo/bar/pong%3F/");
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test866");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.converter.Converter converter5 = requestBuilder4.getconverter();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder8();
        java.lang.Object[] objArray9 = requestBuilder8.getargs();
        retrofit.RequestBuilder requestBuilder10 = requestBuilder4.args(objArray9);
        java.util.List<retrofit.client.Header> headerList11 = requestBuilder10.getheaders();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(converter5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(objArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray9), "[pong#, kat#]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray9), "[pong#, kat#]");
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test867");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        java.lang.Object[] objArray6 = requestBuilder5.args;
        retrofit.mime.TypedOutput typedOutput7 = requestBuilder5.buildBody();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter8.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList11 = serializedObjectSupporter8.deserializeObjectList2();
        java.util.ArrayList arrayList12 = serializedObjectSupporter8.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList14 = serializedObjectSupporter8.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter8.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter8.deserializeObjectRequestBuilder16();
        retrofit.RequestBuilder requestBuilder17 = serializedObjectSupporter8.deserializeObjectRequestBuilder1();
        requestBuilder5.serializedObjectSupporter = serializedObjectSupporter8;
        org.junit.Assert.assertNotNull(requestBuilder1);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(arrayList12);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(arrayList14);
        org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertNotNull(requestBuilder17);
    }

    @Test
    public void test868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test868");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder4();
        java.lang.String str5 = requestBuilder4.getapiUrl();
        retrofit.SerializedObjectSupporter serializedObjectSupporter6 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter6.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter6.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter6.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter6.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter6.deserializeObjectRequestBuilder14();
        requestBuilder4.serializedObjectSupporter = serializedObjectSupporter6;
        retrofit.converter.GsonConverter gsonConverter13 = serializedObjectSupporter6.deserializeObjectConverter5();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter6.deserializeObjectRequestBuilder17();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://example.com" + "'", str5, "http://example.com");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(gsonConverter13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
    }

    @Test
    public void test869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test869");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.util.ArrayList arrayList6 = serializedObjectSupporter0.deserializeObjectList1();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder31();
        retrofit.converter.GsonConverter gsonConverter9 = serializedObjectSupporter0.deserializeObjectConverter4();
        retrofit.RequestBuilder requestBuilder10 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter0.deserializeObjectRequestBuilder12();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(arrayList6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(gsonConverter9);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder10);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
    }

    @Test
    public void test870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test870");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder15();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test871");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        java.util.ArrayList arrayList4 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = request17.getBody();
        retrofit.mime.TypedOutput typedOutput19 = request17.getBody();
        java.util.List<retrofit.client.Header> headerList20 = request17.getHeaders();
        retrofit.RequestBuilder requestBuilder21 = null; // flaky: requestBuilder6.headers(headerList20);
        retrofit.converter.Converter converter22 = null; // flaky: requestBuilder6.converter;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(arrayList4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNotNull(headerList20);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder21);
// flaky:         org.junit.Assert.assertNotNull(converter22);
    }

    @Test
    public void test872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test872");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.SerializedObjectSupporter serializedObjectSupporter5 = null; // flaky: requestBuilder4.serializedObjectSupporter;
        retrofit.RequestBuilder requestBuilder7 = null; // flaky: requestBuilder4.apiUrl("/foo/bar/");
        java.lang.Object[] objArray8 = null; // flaky: requestBuilder7.getargs();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNull(serializedObjectSupporter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
// flaky:         org.junit.Assert.assertNotNull(objArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[kat]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[kat]");
    }

    @Test
    public void test873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test873");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter2 = serializedObjectSupporter0.deserializeObjectConverter1();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter10();
        retrofit.converter.GsonConverter gsonConverter7 = serializedObjectSupporter0.deserializeObjectConverter3();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Collections collections9 = serializedObjectSupporter0.deserializeObjectList4();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.util.Collections$EmptyList cannot be cast to java.util.Collections");
        } catch (java.lang.ClassCastException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
        org.junit.Assert.assertNotNull(gsonConverter7);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder8);
    }

    @Test
    public void test874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test874");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder13();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.SerializedObjectSupporter serializedObjectSupporter8 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter8.deserializeObjectRequestBuilder5();
        retrofit.converter.GsonConverter gsonConverter10 = serializedObjectSupporter8.deserializeObjectConverter9();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter8.deserializeObjectRequestBuilder21();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter8.deserializeObjectRequestBuilder12();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter8.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder14 = serializedObjectSupporter8.deserializeObjectRequestBuilder14();
        java.util.List<retrofit.client.Header> headerList15 = null; // flaky: requestBuilder14.getheaders();
        requestBuilder7.headers = headerList15;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
        org.junit.Assert.assertNotNull(gsonConverter5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(gsonConverter10);
        org.junit.Assert.assertNotNull(requestBuilder11);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder14);
// flaky:         org.junit.Assert.assertNotNull(headerList15);
    }

    @Test
    public void test875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test875");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter4 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter10();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(gsonConverter4);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test876");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        retrofit.converter.GsonConverter gsonConverter3 = serializedObjectSupporter0.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        java.lang.String str6 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder30();
        retrofit.converter.GsonConverter gsonConverter8 = serializedObjectSupporter0.deserializeObjectConverter2();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "http://example.com/" + "'", str6, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(gsonConverter8);
    }

    @Test
    public void test877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test877");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList3();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder20();
        retrofit.converter.GsonConverter gsonConverter6 = serializedObjectSupporter0.deserializeObjectConverter8();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(gsonConverter6);
    }

    @Test
    public void test878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test878");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        java.util.ArrayList arrayList3 = serializedObjectSupporter0.deserializeObjectList2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder24();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder1();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder3();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder27();
        java.lang.String str8 = requestBuilder7.apiUrl;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(arrayList3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "http://example.com" + "'", str8, "http://example.com");
    }

    @Test
    public void test879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test879");
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
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter5.deserializeObjectRequestBuilder29();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter5.deserializeObjectRequestBuilder19();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(gsonConverter2);
        org.junit.Assert.assertNotNull(gsonConverter3);
        org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(gsonConverter7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(arrayList11);
        org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
    }

    @Test
    public void test880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test880");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder2();
        java.lang.String str3 = serializedObjectSupporter0.deserializeObjectString2();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder33();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.RequestBuilder requestBuilder8 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder9 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.SerializedObjectSupporter serializedObjectSupporter10 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter10.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder12 = serializedObjectSupporter10.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder13 = serializedObjectSupporter10.deserializeObjectRequestBuilder16();
        retrofit.converter.GsonConverter gsonConverter14 = serializedObjectSupporter10.deserializeObjectConverter1();
        retrofit.RequestBuilder requestBuilder15 = serializedObjectSupporter10.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder16 = serializedObjectSupporter10.deserializeObjectRequestBuilder19();
        java.lang.Object[] objArray17 = null; // flaky: requestBuilder16.args;
        requestBuilder9.args = objArray17;
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "http://example.com/" + "'", str3, "http://example.com/");
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder6);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(requestBuilder12);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(gsonConverter14);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder15);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder16);
// flaky:         org.junit.Assert.assertNotNull(objArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray17), "[]");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray17), "[]");
    }

    @Test
    public void test881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test881");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder7();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder23();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder17();
        retrofit.RequestBuilder requestBuilder5 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder32();
        retrofit.RequestBuilder requestBuilder7 = serializedObjectSupporter0.deserializeObjectRequestBuilder19();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
        org.junit.Assert.assertNotNull(requestBuilder3);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(requestBuilder6);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test882");
        retrofit.SerializedObjectSupporter serializedObjectSupporter0 = new retrofit.SerializedObjectSupporter();
        retrofit.RequestBuilder requestBuilder1 = serializedObjectSupporter0.deserializeObjectRequestBuilder5();
        retrofit.RequestBuilder requestBuilder2 = serializedObjectSupporter0.deserializeObjectRequestBuilder8();
        retrofit.RequestBuilder requestBuilder3 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
        retrofit.RequestBuilder requestBuilder4 = serializedObjectSupporter0.deserializeObjectRequestBuilder10();
        retrofit.converter.GsonConverter gsonConverter5 = serializedObjectSupporter0.deserializeObjectConverter2();
        retrofit.RequestBuilder requestBuilder6 = serializedObjectSupporter0.deserializeObjectRequestBuilder26();
        org.junit.Assert.assertNotNull(requestBuilder1);
        org.junit.Assert.assertNotNull(requestBuilder2);
// flaky:         org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(requestBuilder4);
        org.junit.Assert.assertNotNull(gsonConverter5);
        org.junit.Assert.assertNotNull(requestBuilder6);
    }

    @Test
    public void test883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test883");
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
        retrofit.RequestBuilder requestBuilder11 = serializedObjectSupporter0.deserializeObjectRequestBuilder18();
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
// flaky:         org.junit.Assert.assertNotNull(requestBuilder11);
    }
}
