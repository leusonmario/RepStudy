import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.url;
        java.lang.String str6 = request4.url;
        java.lang.String str7 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request4.body;
        java.lang.String str9 = request4.method;
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = request4.body;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.method;
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.url;
        retrofit.mime.TypedOutput typedOutput9 = request4.body;
        java.lang.String str10 = request4.method;
        java.lang.String str11 = request4.url;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.converter.Converter converter18 = requestBuilder17.getconverter();
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder17.headers;
        requestBuilder17.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder17, request26 };
        requestBuilder4.setargs(objArray28);
        java.lang.Object[] objArray30 = requestBuilder4.getargs();
        retrofit.RequestBuilder requestBuilder31 = requestBuilder1.args(objArray30);
        java.lang.String str32 = requestBuilder1.getapiUrl();
        java.lang.String str33 = requestBuilder1.apiUrl;
        retrofit.RequestBuilder requestBuilder35 = requestBuilder1.apiUrl("");
        retrofit.RequestBuilder requestBuilder37 = requestBuilder1.apiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList38 = requestBuilder37.getheaders();
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNull(headerList38);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.converter.Converter converter18 = requestBuilder17.getconverter();
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder17.headers;
        requestBuilder17.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder17, request26 };
        requestBuilder4.setargs(objArray28);
        java.lang.Object[] objArray30 = requestBuilder4.getargs();
        retrofit.RequestBuilder requestBuilder31 = requestBuilder1.args(objArray30);
        java.lang.String str32 = requestBuilder1.getapiUrl();
        java.lang.String str33 = requestBuilder1.apiUrl;
        retrofit.RequestBuilder requestBuilder35 = requestBuilder1.apiUrl("");
        java.util.List<retrofit.client.Header> headerList36 = null;
        retrofit.RequestBuilder requestBuilder37 = requestBuilder35.headers(headerList36);
        java.lang.String str38 = requestBuilder35.getapiUrl();
        java.lang.String str39 = requestBuilder35.getapiUrl();
        java.lang.Object[] objArray40 = requestBuilder35.args;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = requestBuilder1.converter;
        retrofit.RequestBuilder requestBuilder8 = requestBuilder1.apiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder8.getheaders();
        retrofit.RequestBuilder requestBuilder11 = requestBuilder8.apiUrl("");
        java.lang.String str12 = requestBuilder11.getapiUrl();
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        java.util.List<retrofit.client.Header> headerList17 = null;
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = request19.getBody();
        retrofit.mime.TypedOutput typedOutput21 = request19.getBody();
        java.util.List<retrofit.client.Header> headerList22 = request19.headers;
        requestBuilder14.setheaders(headerList22);
        retrofit.converter.Converter converter24 = null;
        retrofit.RequestBuilder requestBuilder25 = new retrofit.RequestBuilder(converter24);
        retrofit.converter.Converter converter26 = requestBuilder25.getconverter();
        java.util.List<retrofit.client.Header> headerList27 = requestBuilder25.headers;
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        retrofit.client.Header[] headerArray35 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList36 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList36, headerArray35);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList36, typedOutput38);
        requestBuilder32.setheaders((java.util.List<retrofit.client.Header>) headerList36);
        java.util.List<retrofit.client.Header> headerList43 = null;
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("", "", headerList43, typedOutput44);
        java.lang.String str46 = request45.getUrl();
        retrofit.mime.TypedOutput typedOutput47 = request45.body;
        java.lang.Object[] objArray48 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder32, typedOutput47 };
        requestBuilder25.setargs(objArray48);
        retrofit.RequestBuilder requestBuilder50 = requestBuilder14.args(objArray48);
        retrofit.converter.Converter converter51 = null;
        retrofit.RequestBuilder requestBuilder52 = new retrofit.RequestBuilder(converter51);
        retrofit.converter.Converter converter53 = requestBuilder52.getconverter();
        retrofit.converter.Converter converter54 = null;
        retrofit.RequestBuilder requestBuilder55 = new retrofit.RequestBuilder(converter54);
        retrofit.client.Header[] headerArray58 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList59 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList59, headerArray58);
        retrofit.mime.TypedOutput typedOutput61 = null;
        retrofit.client.Request request62 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList59, typedOutput61);
        requestBuilder55.setheaders((java.util.List<retrofit.client.Header>) headerList59);
        retrofit.converter.Converter converter67 = null;
        retrofit.RequestBuilder requestBuilder68 = new retrofit.RequestBuilder(converter67);
        retrofit.converter.Converter converter69 = requestBuilder68.getconverter();
        java.util.List<retrofit.client.Header> headerList70 = requestBuilder68.headers;
        requestBuilder68.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList75 = null;
        retrofit.mime.TypedOutput typedOutput76 = null;
        retrofit.client.Request request77 = new retrofit.client.Request("", "", headerList75, typedOutput76);
        java.lang.String str78 = request77.getUrl();
        java.lang.Object[] objArray79 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder68, request77 };
        requestBuilder55.setargs(objArray79);
        java.lang.Object[] objArray81 = requestBuilder55.getargs();
        retrofit.RequestBuilder requestBuilder82 = requestBuilder52.args(objArray81);
        retrofit.RequestBuilder requestBuilder83 = requestBuilder50.args(objArray81);
        retrofit.converter.Converter converter84 = requestBuilder83.getconverter();
        java.lang.Object[] objArray85 = requestBuilder83.getargs();
        requestBuilder11.args = objArray85;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(headerList9);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNull(converter26);
        org.junit.Assert.assertNull(headerList27);
        org.junit.Assert.assertNotNull(headerArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(typedOutput47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(requestBuilder50);
        org.junit.Assert.assertNull(converter53);
        org.junit.Assert.assertNotNull(headerArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(converter69);
        org.junit.Assert.assertNull(headerList70);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(requestBuilder82);
        org.junit.Assert.assertNotNull(requestBuilder83);
        org.junit.Assert.assertNull(converter84);
        org.junit.Assert.assertNotNull(objArray85);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        java.lang.String str27 = requestBuilder1.getapiUrl();
        java.util.List<retrofit.client.Header> headerList28 = requestBuilder1.getheaders();
        retrofit.converter.Converter converter29 = requestBuilder1.getconverter();
        java.lang.String str30 = requestBuilder1.apiUrl;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNull(converter29);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.String str2 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.converter.Converter converter5 = requestBuilder4.getconverter();
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        requestBuilder7.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        retrofit.converter.Converter converter19 = null;
        retrofit.RequestBuilder requestBuilder20 = new retrofit.RequestBuilder(converter19);
        retrofit.converter.Converter converter21 = requestBuilder20.getconverter();
        java.util.List<retrofit.client.Header> headerList22 = requestBuilder20.headers;
        requestBuilder20.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList27 = null;
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", headerList27, typedOutput28);
        java.lang.String str30 = request29.getUrl();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder20, request29 };
        requestBuilder7.setargs(objArray31);
        java.lang.Object[] objArray33 = requestBuilder7.getargs();
        retrofit.RequestBuilder requestBuilder34 = requestBuilder4.args(objArray33);
        requestBuilder1.setargs(objArray33);
        retrofit.converter.Converter converter36 = null;
        retrofit.RequestBuilder requestBuilder37 = new retrofit.RequestBuilder(converter36);
        java.lang.String str38 = requestBuilder37.apiUrl;
        retrofit.converter.Converter converter39 = null;
        retrofit.RequestBuilder requestBuilder40 = new retrofit.RequestBuilder(converter39);
        retrofit.converter.Converter converter41 = requestBuilder40.getconverter();
        retrofit.converter.Converter converter42 = null;
        retrofit.RequestBuilder requestBuilder43 = new retrofit.RequestBuilder(converter42);
        retrofit.client.Header[] headerArray46 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList47 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList47, headerArray46);
        retrofit.mime.TypedOutput typedOutput49 = null;
        retrofit.client.Request request50 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList47, typedOutput49);
        requestBuilder43.setheaders((java.util.List<retrofit.client.Header>) headerList47);
        retrofit.converter.Converter converter55 = null;
        retrofit.RequestBuilder requestBuilder56 = new retrofit.RequestBuilder(converter55);
        retrofit.converter.Converter converter57 = requestBuilder56.getconverter();
        java.util.List<retrofit.client.Header> headerList58 = requestBuilder56.headers;
        requestBuilder56.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList63 = null;
        retrofit.mime.TypedOutput typedOutput64 = null;
        retrofit.client.Request request65 = new retrofit.client.Request("", "", headerList63, typedOutput64);
        java.lang.String str66 = request65.getUrl();
        java.lang.Object[] objArray67 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder56, request65 };
        requestBuilder43.setargs(objArray67);
        java.lang.Object[] objArray69 = requestBuilder43.getargs();
        retrofit.RequestBuilder requestBuilder70 = requestBuilder40.args(objArray69);
        requestBuilder37.setargs(objArray69);
        retrofit.RequestBuilder requestBuilder72 = requestBuilder1.args(objArray69);
        retrofit.converter.Converter converter73 = requestBuilder1.getconverter();
        java.lang.Object[] objArray74 = requestBuilder1.getargs();
        java.lang.String str75 = requestBuilder1.getapiUrl();
        requestBuilder1.setapiUrl("");
        java.util.List<retrofit.client.Header> headerList80 = null;
        retrofit.mime.TypedOutput typedOutput81 = null;
        retrofit.client.Request request82 = new retrofit.client.Request("", "", headerList80, typedOutput81);
        java.lang.String str83 = request82.getUrl();
        retrofit.mime.TypedOutput typedOutput84 = request82.body;
        java.lang.String str85 = request82.getUrl();
        java.lang.String str86 = request82.url;
        java.lang.String str87 = request82.getUrl();
        java.util.List<retrofit.client.Header> headerList88 = request82.headers;
        java.util.List<retrofit.client.Header> headerList89 = request82.getHeaders();
        requestBuilder1.setheaders(headerList89);
        java.util.List<retrofit.client.Header> headerList91 = requestBuilder1.headers;
        retrofit.converter.Converter converter92 = requestBuilder1.getconverter();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNull(headerList22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(converter41);
        org.junit.Assert.assertNotNull(headerArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNull(converter57);
        org.junit.Assert.assertNull(headerList58);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNotNull(requestBuilder70);
        org.junit.Assert.assertNotNull(requestBuilder72);
        org.junit.Assert.assertNull(converter73);
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNull(typedOutput84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(headerList88);
        org.junit.Assert.assertNotNull(headerList89);
        org.junit.Assert.assertNotNull(headerList91);
        org.junit.Assert.assertNull(converter92);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = requestBuilder1.converter;
        java.lang.String str7 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter8 = requestBuilder1.converter;
        retrofit.RequestBuilder requestBuilder10 = requestBuilder1.apiUrl("hi!");
        java.lang.Object[] objArray11 = requestBuilder1.getargs();
        java.lang.String str12 = requestBuilder1.getapiUrl();
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.client.Header[] headerArray17 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList18 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList18, headerArray17);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList18, typedOutput20);
        requestBuilder14.setheaders((java.util.List<retrofit.client.Header>) headerList18);
        retrofit.converter.Converter converter26 = null;
        retrofit.RequestBuilder requestBuilder27 = new retrofit.RequestBuilder(converter26);
        retrofit.converter.Converter converter28 = requestBuilder27.getconverter();
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder27.headers;
        requestBuilder27.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList34 = null;
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "", headerList34, typedOutput35);
        java.lang.String str37 = request36.getUrl();
        java.lang.Object[] objArray38 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder27, request36 };
        requestBuilder14.setargs(objArray38);
        java.lang.Object[] objArray40 = requestBuilder14.getargs();
        java.util.List<retrofit.client.Header> headerList41 = null;
        requestBuilder14.headers = headerList41;
        retrofit.converter.Converter converter43 = requestBuilder14.getconverter();
        retrofit.converter.Converter converter44 = requestBuilder14.converter;
        java.lang.Object[] objArray45 = requestBuilder14.getargs();
        retrofit.converter.Converter converter46 = null;
        retrofit.RequestBuilder requestBuilder47 = new retrofit.RequestBuilder(converter46);
        retrofit.converter.Converter converter48 = requestBuilder47.getconverter();
        retrofit.converter.Converter converter49 = null;
        retrofit.RequestBuilder requestBuilder50 = new retrofit.RequestBuilder(converter49);
        retrofit.client.Header[] headerArray53 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList54 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList54, headerArray53);
        retrofit.mime.TypedOutput typedOutput56 = null;
        retrofit.client.Request request57 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList54, typedOutput56);
        requestBuilder50.setheaders((java.util.List<retrofit.client.Header>) headerList54);
        retrofit.converter.Converter converter62 = null;
        retrofit.RequestBuilder requestBuilder63 = new retrofit.RequestBuilder(converter62);
        retrofit.converter.Converter converter64 = requestBuilder63.getconverter();
        java.util.List<retrofit.client.Header> headerList65 = requestBuilder63.headers;
        requestBuilder63.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList70 = null;
        retrofit.mime.TypedOutput typedOutput71 = null;
        retrofit.client.Request request72 = new retrofit.client.Request("", "", headerList70, typedOutput71);
        java.lang.String str73 = request72.getUrl();
        java.lang.Object[] objArray74 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder63, request72 };
        requestBuilder50.setargs(objArray74);
        java.lang.Object[] objArray76 = requestBuilder50.getargs();
        retrofit.RequestBuilder requestBuilder77 = requestBuilder47.args(objArray76);
        retrofit.converter.Converter converter78 = requestBuilder47.getconverter();
        retrofit.converter.Converter converter79 = requestBuilder47.converter;
        java.lang.Object[] objArray80 = requestBuilder47.args;
        retrofit.RequestBuilder requestBuilder81 = requestBuilder14.args(objArray80);
        retrofit.RequestBuilder requestBuilder82 = requestBuilder1.args(objArray80);
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(converter8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNull(objArray11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(converter28);
        org.junit.Assert.assertNull(headerList29);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNull(converter43);
        org.junit.Assert.assertNull(converter44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNull(converter48);
        org.junit.Assert.assertNotNull(headerArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(converter64);
        org.junit.Assert.assertNull(headerList65);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(objArray74);
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(requestBuilder77);
        org.junit.Assert.assertNull(converter78);
        org.junit.Assert.assertNull(converter79);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(requestBuilder81);
        org.junit.Assert.assertNotNull(requestBuilder82);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput7 = request4.body;
        java.lang.String str8 = request4.getUrl();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.String str2 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.converter.Converter converter5 = requestBuilder4.getconverter();
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        requestBuilder7.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        retrofit.converter.Converter converter19 = null;
        retrofit.RequestBuilder requestBuilder20 = new retrofit.RequestBuilder(converter19);
        retrofit.converter.Converter converter21 = requestBuilder20.getconverter();
        java.util.List<retrofit.client.Header> headerList22 = requestBuilder20.headers;
        requestBuilder20.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList27 = null;
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", headerList27, typedOutput28);
        java.lang.String str30 = request29.getUrl();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder20, request29 };
        requestBuilder7.setargs(objArray31);
        java.lang.Object[] objArray33 = requestBuilder7.getargs();
        retrofit.RequestBuilder requestBuilder34 = requestBuilder4.args(objArray33);
        requestBuilder1.setargs(objArray33);
        retrofit.converter.Converter converter38 = null;
        retrofit.RequestBuilder requestBuilder39 = new retrofit.RequestBuilder(converter38);
        retrofit.client.Header[] headerArray42 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList43 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList43, headerArray42);
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList43, typedOutput45);
        requestBuilder39.setheaders((java.util.List<retrofit.client.Header>) headerList43);
        retrofit.converter.Converter converter51 = null;
        retrofit.RequestBuilder requestBuilder52 = new retrofit.RequestBuilder(converter51);
        retrofit.converter.Converter converter53 = requestBuilder52.getconverter();
        java.util.List<retrofit.client.Header> headerList54 = requestBuilder52.headers;
        requestBuilder52.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList59 = null;
        retrofit.mime.TypedOutput typedOutput60 = null;
        retrofit.client.Request request61 = new retrofit.client.Request("", "", headerList59, typedOutput60);
        java.lang.String str62 = request61.getUrl();
        java.lang.Object[] objArray63 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder52, request61 };
        requestBuilder39.setargs(objArray63);
        requestBuilder39.apiUrl = "";
        retrofit.RequestBuilder requestBuilder68 = requestBuilder39.apiUrl("hi!");
        retrofit.converter.Converter converter69 = null;
        retrofit.RequestBuilder requestBuilder70 = new retrofit.RequestBuilder(converter69);
        java.util.List<retrofit.client.Header> headerList73 = null;
        retrofit.mime.TypedOutput typedOutput74 = null;
        retrofit.client.Request request75 = new retrofit.client.Request("", "", headerList73, typedOutput74);
        retrofit.mime.TypedOutput typedOutput76 = request75.getBody();
        retrofit.mime.TypedOutput typedOutput77 = request75.getBody();
        java.util.List<retrofit.client.Header> headerList78 = request75.headers;
        requestBuilder70.setheaders(headerList78);
        retrofit.RequestBuilder requestBuilder80 = requestBuilder39.headers(headerList78);
        retrofit.mime.TypedOutput typedOutput81 = null;
        retrofit.client.Request request82 = new retrofit.client.Request("hi!", "", headerList78, typedOutput81);
        requestBuilder1.headers = headerList78;
        java.lang.String str84 = requestBuilder1.apiUrl;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request85 = requestBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNull(headerList22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(headerArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(converter53);
        org.junit.Assert.assertNull(headerList54);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(requestBuilder68);
        org.junit.Assert.assertNull(typedOutput76);
        org.junit.Assert.assertNull(typedOutput77);
        org.junit.Assert.assertNotNull(headerList78);
        org.junit.Assert.assertNotNull(requestBuilder80);
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList7 = request4.headers;
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.lang.String str9 = request4.method;
        java.lang.String str10 = request4.url;
        java.lang.String str11 = request4.url;
        java.util.List<retrofit.client.Header> headerList12 = request4.getHeaders();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.url;
        java.util.List<retrofit.client.Header> headerList6 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.lang.String str9 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        java.lang.String str11 = request4.url;
        java.util.List<retrofit.client.Header> headerList12 = request4.getHeaders();
        java.lang.String str13 = request4.method;
        java.lang.String str14 = request4.url;
        java.lang.String str15 = request4.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.url;
        java.lang.String str8 = request6.url;
        java.lang.String str9 = request6.getUrl();
        java.lang.String str10 = request6.url;
        java.lang.String str11 = request6.url;
        java.lang.String str12 = request6.url;
        java.util.List<retrofit.client.Header> headerList13 = request6.headers;
        java.util.List<retrofit.client.Header> headerList14 = request6.headers;
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "hi!", headerList14, typedOutput15);
        java.lang.String str17 = request16.url;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        requestBuilder1.setheaders(headerList9);
        requestBuilder1.setapiUrl("");
        java.util.List<retrofit.client.Header> headerList13 = null;
        requestBuilder1.headers = headerList13;
        java.lang.String str15 = requestBuilder1.apiUrl;
        requestBuilder1.setapiUrl("");
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.converter.Converter converter19 = requestBuilder18.getconverter();
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder18.headers;
        requestBuilder18.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList25 = null;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder18, request27 };
        requestBuilder5.setargs(objArray29);
        requestBuilder5.apiUrl = "";
        retrofit.RequestBuilder requestBuilder34 = requestBuilder5.apiUrl("hi!");
        retrofit.converter.Converter converter35 = null;
        retrofit.RequestBuilder requestBuilder36 = new retrofit.RequestBuilder(converter35);
        java.util.List<retrofit.client.Header> headerList39 = null;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = request41.getBody();
        retrofit.mime.TypedOutput typedOutput43 = request41.getBody();
        java.util.List<retrofit.client.Header> headerList44 = request41.headers;
        requestBuilder36.setheaders(headerList44);
        retrofit.RequestBuilder requestBuilder46 = requestBuilder5.headers(headerList44);
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("hi!", "", headerList44, typedOutput47);
        retrofit.mime.TypedOutput typedOutput49 = null;
        retrofit.client.Request request50 = new retrofit.client.Request("hi!", "", headerList44, typedOutput49);
        java.lang.String str51 = request50.url;
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(headerList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNull(typedOutput42);
        org.junit.Assert.assertNull(typedOutput43);
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        retrofit.converter.Converter converter7 = null;
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        requestBuilder8.setheaders((java.util.List<retrofit.client.Header>) headerList12);
        java.util.List<retrofit.client.Header> headerList19 = null;
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList19, typedOutput20);
        java.lang.String str22 = request21.getUrl();
        retrofit.mime.TypedOutput typedOutput23 = request21.body;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder8, typedOutput23 };
        requestBuilder1.setargs(objArray24);
        retrofit.converter.Converter converter28 = null;
        retrofit.RequestBuilder requestBuilder29 = new retrofit.RequestBuilder(converter28);
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
        requestBuilder29.setheaders((java.util.List<retrofit.client.Header>) headerList33);
        retrofit.converter.Converter converter41 = null;
        retrofit.RequestBuilder requestBuilder42 = new retrofit.RequestBuilder(converter41);
        retrofit.converter.Converter converter43 = requestBuilder42.getconverter();
        java.util.List<retrofit.client.Header> headerList44 = requestBuilder42.headers;
        requestBuilder42.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList49 = null;
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("", "", headerList49, typedOutput50);
        java.lang.String str52 = request51.getUrl();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder42, request51 };
        requestBuilder29.setargs(objArray53);
        retrofit.RequestBuilder requestBuilder56 = requestBuilder29.apiUrl("");
        java.util.List<retrofit.client.Header> headerList57 = requestBuilder29.headers;
        retrofit.mime.TypedOutput typedOutput58 = null;
        retrofit.client.Request request59 = new retrofit.client.Request("", "", headerList57, typedOutput58);
        retrofit.RequestBuilder requestBuilder60 = requestBuilder1.headers(headerList57);
        java.util.List<retrofit.client.Header> headerList61 = requestBuilder1.headers;
        java.lang.Object[] objArray62 = requestBuilder1.getargs();
        java.util.List<retrofit.client.Header> headerList69 = null;
        retrofit.mime.TypedOutput typedOutput70 = null;
        retrofit.client.Request request71 = new retrofit.client.Request("", "", headerList69, typedOutput70);
        java.lang.String str72 = request71.url;
        java.lang.String str73 = request71.url;
        java.lang.String str74 = request71.getUrl();
        java.lang.String str75 = request71.url;
        java.lang.String str76 = request71.url;
        java.lang.String str77 = request71.url;
        java.util.List<retrofit.client.Header> headerList78 = request71.headers;
        java.util.List<retrofit.client.Header> headerList79 = request71.headers;
        retrofit.mime.TypedOutput typedOutput80 = null;
        retrofit.client.Request request81 = new retrofit.client.Request("", "hi!", headerList79, typedOutput80);
        retrofit.mime.TypedOutput typedOutput82 = null;
        retrofit.client.Request request83 = new retrofit.client.Request("hi!", "hi!", headerList79, typedOutput82);
        requestBuilder1.headers = headerList79;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(converter43);
        org.junit.Assert.assertNull(headerList44);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(requestBuilder56);
        org.junit.Assert.assertNotNull(headerList57);
        org.junit.Assert.assertNotNull(requestBuilder60);
        org.junit.Assert.assertNotNull(headerList61);
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(headerList78);
        org.junit.Assert.assertNotNull(headerList79);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        requestBuilder1.apiUrl = "";
        retrofit.RequestBuilder requestBuilder30 = requestBuilder1.apiUrl("hi!");
        java.lang.Object[] objArray31 = requestBuilder1.getargs();
        java.lang.String str32 = requestBuilder1.getapiUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        java.lang.String str7 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request4.body;
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.String str10 = request4.method;
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.converter.Converter converter19 = requestBuilder18.getconverter();
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder18.headers;
        requestBuilder18.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList25 = null;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder18, request27 };
        requestBuilder5.setargs(objArray29);
        requestBuilder5.apiUrl = "";
        retrofit.RequestBuilder requestBuilder34 = requestBuilder5.apiUrl("hi!");
        retrofit.converter.Converter converter35 = null;
        retrofit.RequestBuilder requestBuilder36 = new retrofit.RequestBuilder(converter35);
        java.util.List<retrofit.client.Header> headerList39 = null;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = request41.getBody();
        retrofit.mime.TypedOutput typedOutput43 = request41.getBody();
        java.util.List<retrofit.client.Header> headerList44 = request41.headers;
        requestBuilder36.setheaders(headerList44);
        retrofit.RequestBuilder requestBuilder46 = requestBuilder5.headers(headerList44);
        java.lang.Object[] objArray47 = requestBuilder5.getargs();
        retrofit.RequestBuilder requestBuilder49 = requestBuilder5.apiUrl("hi!");
        retrofit.converter.Converter converter50 = null;
        retrofit.RequestBuilder requestBuilder51 = new retrofit.RequestBuilder(converter50);
        retrofit.client.Header[] headerArray54 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList55 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList55, headerArray54);
        retrofit.mime.TypedOutput typedOutput57 = null;
        retrofit.client.Request request58 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList55, typedOutput57);
        requestBuilder51.setheaders((java.util.List<retrofit.client.Header>) headerList55);
        retrofit.converter.Converter converter63 = null;
        retrofit.RequestBuilder requestBuilder64 = new retrofit.RequestBuilder(converter63);
        retrofit.converter.Converter converter65 = requestBuilder64.getconverter();
        java.util.List<retrofit.client.Header> headerList66 = requestBuilder64.headers;
        requestBuilder64.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList71 = null;
        retrofit.mime.TypedOutput typedOutput72 = null;
        retrofit.client.Request request73 = new retrofit.client.Request("", "", headerList71, typedOutput72);
        java.lang.String str74 = request73.getUrl();
        java.lang.Object[] objArray75 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder64, request73 };
        requestBuilder51.setargs(objArray75);
        retrofit.RequestBuilder requestBuilder78 = requestBuilder51.apiUrl("");
        java.util.List<retrofit.client.Header> headerList79 = requestBuilder51.headers;
        requestBuilder5.headers = headerList79;
        retrofit.mime.TypedOutput typedOutput81 = null;
        retrofit.client.Request request82 = new retrofit.client.Request("", "hi!", headerList79, typedOutput81);
        java.util.List<retrofit.client.Header> headerList83 = request82.getHeaders();
        java.util.List<retrofit.client.Header> headerList84 = request82.getHeaders();
        java.util.List<retrofit.client.Header> headerList85 = request82.headers;
        retrofit.mime.TypedOutput typedOutput86 = null;
        retrofit.client.Request request87 = new retrofit.client.Request("hi!", "", headerList85, typedOutput86);
        java.util.List<retrofit.client.Header> headerList88 = request87.getHeaders();
        java.util.List<retrofit.client.Header> headerList89 = request87.getHeaders();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(headerList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNull(typedOutput42);
        org.junit.Assert.assertNull(typedOutput43);
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(requestBuilder49);
        org.junit.Assert.assertNotNull(headerArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNull(converter65);
        org.junit.Assert.assertNull(headerList66);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertNotNull(requestBuilder78);
        org.junit.Assert.assertNotNull(headerList79);
        org.junit.Assert.assertNotNull(headerList83);
        org.junit.Assert.assertNotNull(headerList84);
        org.junit.Assert.assertNotNull(headerList85);
        org.junit.Assert.assertNotNull(headerList88);
        org.junit.Assert.assertNotNull(headerList89);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.String str2 = requestBuilder1.apiUrl;
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        java.lang.Object[] objArray4 = requestBuilder1.getargs();
        requestBuilder1.apiUrl = "hi!";
        retrofit.converter.Converter converter7 = requestBuilder1.converter;
        java.lang.Object[] objArray8 = requestBuilder1.args;
        retrofit.converter.Converter converter9 = null;
        retrofit.RequestBuilder requestBuilder10 = new retrofit.RequestBuilder(converter9);
        java.util.List<retrofit.client.Header> headerList13 = null;
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = request15.getBody();
        retrofit.mime.TypedOutput typedOutput17 = request15.getBody();
        java.util.List<retrofit.client.Header> headerList18 = request15.headers;
        requestBuilder10.setheaders(headerList18);
        retrofit.converter.Converter converter20 = null;
        retrofit.RequestBuilder requestBuilder21 = new retrofit.RequestBuilder(converter20);
        java.lang.String str22 = requestBuilder21.apiUrl;
        retrofit.converter.Converter converter23 = null;
        retrofit.RequestBuilder requestBuilder24 = new retrofit.RequestBuilder(converter23);
        retrofit.converter.Converter converter25 = requestBuilder24.getconverter();
        retrofit.converter.Converter converter26 = null;
        retrofit.RequestBuilder requestBuilder27 = new retrofit.RequestBuilder(converter26);
        retrofit.client.Header[] headerArray30 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList31 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList31, headerArray30);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList31, typedOutput33);
        requestBuilder27.setheaders((java.util.List<retrofit.client.Header>) headerList31);
        retrofit.converter.Converter converter39 = null;
        retrofit.RequestBuilder requestBuilder40 = new retrofit.RequestBuilder(converter39);
        retrofit.converter.Converter converter41 = requestBuilder40.getconverter();
        java.util.List<retrofit.client.Header> headerList42 = requestBuilder40.headers;
        requestBuilder40.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList47 = null;
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "", headerList47, typedOutput48);
        java.lang.String str50 = request49.getUrl();
        java.lang.Object[] objArray51 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder40, request49 };
        requestBuilder27.setargs(objArray51);
        java.lang.Object[] objArray53 = requestBuilder27.getargs();
        retrofit.RequestBuilder requestBuilder54 = requestBuilder24.args(objArray53);
        requestBuilder21.setargs(objArray53);
        retrofit.converter.Converter converter56 = null;
        retrofit.RequestBuilder requestBuilder57 = new retrofit.RequestBuilder(converter56);
        java.lang.String str58 = requestBuilder57.apiUrl;
        retrofit.converter.Converter converter59 = null;
        retrofit.RequestBuilder requestBuilder60 = new retrofit.RequestBuilder(converter59);
        retrofit.converter.Converter converter61 = requestBuilder60.getconverter();
        retrofit.converter.Converter converter62 = null;
        retrofit.RequestBuilder requestBuilder63 = new retrofit.RequestBuilder(converter62);
        retrofit.client.Header[] headerArray66 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList67 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList67, headerArray66);
        retrofit.mime.TypedOutput typedOutput69 = null;
        retrofit.client.Request request70 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList67, typedOutput69);
        requestBuilder63.setheaders((java.util.List<retrofit.client.Header>) headerList67);
        retrofit.converter.Converter converter75 = null;
        retrofit.RequestBuilder requestBuilder76 = new retrofit.RequestBuilder(converter75);
        retrofit.converter.Converter converter77 = requestBuilder76.getconverter();
        java.util.List<retrofit.client.Header> headerList78 = requestBuilder76.headers;
        requestBuilder76.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList83 = null;
        retrofit.mime.TypedOutput typedOutput84 = null;
        retrofit.client.Request request85 = new retrofit.client.Request("", "", headerList83, typedOutput84);
        java.lang.String str86 = request85.getUrl();
        java.lang.Object[] objArray87 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder76, request85 };
        requestBuilder63.setargs(objArray87);
        java.lang.Object[] objArray89 = requestBuilder63.getargs();
        retrofit.RequestBuilder requestBuilder90 = requestBuilder60.args(objArray89);
        requestBuilder57.setargs(objArray89);
        retrofit.RequestBuilder requestBuilder92 = requestBuilder21.args(objArray89);
        retrofit.RequestBuilder requestBuilder93 = requestBuilder10.args(objArray89);
        requestBuilder10.apiUrl = "";
        java.lang.Object[] objArray96 = requestBuilder10.getargs();
        requestBuilder1.args = objArray96;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(converter25);
        org.junit.Assert.assertNotNull(headerArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(converter41);
        org.junit.Assert.assertNull(headerList42);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(requestBuilder54);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNull(converter61);
        org.junit.Assert.assertNotNull(headerArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNull(converter77);
        org.junit.Assert.assertNull(headerList78);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(objArray87);
        org.junit.Assert.assertNotNull(objArray89);
        org.junit.Assert.assertNotNull(requestBuilder90);
        org.junit.Assert.assertNotNull(requestBuilder92);
        org.junit.Assert.assertNotNull(requestBuilder93);
        org.junit.Assert.assertNotNull(objArray96);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.converter.Converter converter6 = requestBuilder5.getconverter();
        retrofit.converter.Converter converter7 = null;
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        requestBuilder8.setheaders((java.util.List<retrofit.client.Header>) headerList12);
        retrofit.converter.Converter converter20 = null;
        retrofit.RequestBuilder requestBuilder21 = new retrofit.RequestBuilder(converter20);
        retrofit.converter.Converter converter22 = requestBuilder21.getconverter();
        java.util.List<retrofit.client.Header> headerList23 = requestBuilder21.headers;
        requestBuilder21.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList28 = null;
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", headerList28, typedOutput29);
        java.lang.String str31 = request30.getUrl();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder21, request30 };
        requestBuilder8.setargs(objArray32);
        java.lang.Object[] objArray34 = requestBuilder8.getargs();
        retrofit.RequestBuilder requestBuilder35 = requestBuilder5.args(objArray34);
        retrofit.converter.Converter converter36 = requestBuilder5.getconverter();
        java.util.List<retrofit.client.Header> headerList39 = null;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = request41.getBody();
        java.util.List<retrofit.client.Header> headerList43 = request41.headers;
        requestBuilder5.setheaders(headerList43);
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("", "", headerList43, typedOutput45);
        java.util.List<retrofit.client.Header> headerList47 = request46.headers;
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "", headerList47, typedOutput48);
        retrofit.mime.TypedOutput typedOutput50 = request49.getBody();
        java.lang.String str51 = request49.getUrl();
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(converter22);
        org.junit.Assert.assertNull(headerList23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNull(converter36);
        org.junit.Assert.assertNull(typedOutput42);
        org.junit.Assert.assertNotNull(headerList43);
        org.junit.Assert.assertNotNull(headerList47);
        org.junit.Assert.assertNull(typedOutput50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList6 = request4.headers;
        java.util.List<retrofit.client.Header> headerList7 = request4.headers;
        java.lang.String str8 = request4.url;
        java.lang.String str9 = request4.getUrl();
        java.lang.String str10 = request4.method;
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(typedOutput11);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.String str2 = requestBuilder1.apiUrl;
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        retrofit.RequestBuilder requestBuilder5 = requestBuilder1.apiUrl("");
        requestBuilder5.apiUrl = "";
        retrofit.converter.Converter converter8 = requestBuilder5.getconverter();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(converter8);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.body;
        java.lang.String str14 = request12.url;
        java.lang.String str15 = request12.getMethod();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        java.lang.String str6 = requestBuilder1.apiUrl;
        java.util.List<retrofit.client.Header> headerList7 = requestBuilder1.headers;
        java.lang.String str8 = requestBuilder1.getapiUrl();
        java.lang.String str9 = requestBuilder1.apiUrl;
        java.lang.String str10 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter11 = null;
        retrofit.RequestBuilder requestBuilder12 = new retrofit.RequestBuilder(converter11);
        java.lang.String str13 = requestBuilder12.apiUrl;
        retrofit.converter.Converter converter14 = null;
        retrofit.RequestBuilder requestBuilder15 = new retrofit.RequestBuilder(converter14);
        retrofit.converter.Converter converter16 = requestBuilder15.getconverter();
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        requestBuilder18.setheaders((java.util.List<retrofit.client.Header>) headerList22);
        retrofit.converter.Converter converter30 = null;
        retrofit.RequestBuilder requestBuilder31 = new retrofit.RequestBuilder(converter30);
        retrofit.converter.Converter converter32 = requestBuilder31.getconverter();
        java.util.List<retrofit.client.Header> headerList33 = requestBuilder31.headers;
        requestBuilder31.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList38 = null;
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "", headerList38, typedOutput39);
        java.lang.String str41 = request40.getUrl();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder31, request40 };
        requestBuilder18.setargs(objArray42);
        java.lang.Object[] objArray44 = requestBuilder18.getargs();
        retrofit.RequestBuilder requestBuilder45 = requestBuilder15.args(objArray44);
        requestBuilder12.setargs(objArray44);
        retrofit.converter.Converter converter47 = null;
        retrofit.RequestBuilder requestBuilder48 = new retrofit.RequestBuilder(converter47);
        java.lang.String str49 = requestBuilder48.apiUrl;
        retrofit.converter.Converter converter50 = null;
        retrofit.RequestBuilder requestBuilder51 = new retrofit.RequestBuilder(converter50);
        retrofit.converter.Converter converter52 = requestBuilder51.getconverter();
        retrofit.converter.Converter converter53 = null;
        retrofit.RequestBuilder requestBuilder54 = new retrofit.RequestBuilder(converter53);
        retrofit.client.Header[] headerArray57 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList58 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList58, headerArray57);
        retrofit.mime.TypedOutput typedOutput60 = null;
        retrofit.client.Request request61 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList58, typedOutput60);
        requestBuilder54.setheaders((java.util.List<retrofit.client.Header>) headerList58);
        retrofit.converter.Converter converter66 = null;
        retrofit.RequestBuilder requestBuilder67 = new retrofit.RequestBuilder(converter66);
        retrofit.converter.Converter converter68 = requestBuilder67.getconverter();
        java.util.List<retrofit.client.Header> headerList69 = requestBuilder67.headers;
        requestBuilder67.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList74 = null;
        retrofit.mime.TypedOutput typedOutput75 = null;
        retrofit.client.Request request76 = new retrofit.client.Request("", "", headerList74, typedOutput75);
        java.lang.String str77 = request76.getUrl();
        java.lang.Object[] objArray78 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder67, request76 };
        requestBuilder54.setargs(objArray78);
        java.lang.Object[] objArray80 = requestBuilder54.getargs();
        retrofit.RequestBuilder requestBuilder81 = requestBuilder51.args(objArray80);
        requestBuilder48.setargs(objArray80);
        retrofit.RequestBuilder requestBuilder83 = requestBuilder12.args(objArray80);
        retrofit.RequestBuilder requestBuilder84 = requestBuilder1.args(objArray80);
        java.lang.Object[] objArray85 = requestBuilder84.getargs();
        retrofit.RequestBuilder requestBuilder87 = requestBuilder84.apiUrl("hi!");
        java.lang.Object[] objArray88 = requestBuilder84.getargs();
        java.lang.Object[] objArray89 = requestBuilder84.args;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(converter32);
        org.junit.Assert.assertNull(headerList33);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(requestBuilder45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(converter52);
        org.junit.Assert.assertNotNull(headerArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(converter68);
        org.junit.Assert.assertNull(headerList69);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(requestBuilder81);
        org.junit.Assert.assertNotNull(requestBuilder83);
        org.junit.Assert.assertNotNull(requestBuilder84);
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNotNull(requestBuilder87);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNotNull(objArray89);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", headerList9, typedOutput10);
        java.lang.String str12 = request11.method;
        retrofit.mime.TypedOutput typedOutput13 = request11.getBody();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        retrofit.RequestBuilder requestBuilder28 = requestBuilder1.apiUrl("");
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder1.headers;
        java.lang.Object[] objArray30 = requestBuilder1.args;
        requestBuilder1.setapiUrl("hi!");
        java.lang.String str33 = requestBuilder1.getapiUrl();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = requestBuilder1.buildRelativeUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = requestBuilder1.converter;
        retrofit.RequestBuilder requestBuilder8 = requestBuilder1.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder10 = requestBuilder8.apiUrl("hi!");
        java.lang.Object[] objArray11 = null;
        requestBuilder10.setargs(objArray11);
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder1.getheaders();
        java.lang.String str11 = requestBuilder1.apiUrl;
        java.util.List<retrofit.client.Header> headerList12 = requestBuilder1.getheaders();
        retrofit.RequestBuilder requestBuilder14 = requestBuilder1.apiUrl("");
        java.util.List<retrofit.client.Header> headerList15 = null;
        requestBuilder1.setheaders(headerList15);
        java.lang.Object[] objArray17 = requestBuilder1.args;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNull(objArray17);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.url;
        retrofit.mime.TypedOutput typedOutput9 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList10 = request6.headers;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.body;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNotNull(headerList14);
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        requestBuilder3.apiUrl = "";
        retrofit.RequestBuilder requestBuilder32 = requestBuilder3.apiUrl("hi!");
        retrofit.converter.Converter converter33 = null;
        retrofit.RequestBuilder requestBuilder34 = new retrofit.RequestBuilder(converter33);
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.getBody();
        retrofit.mime.TypedOutput typedOutput41 = request39.getBody();
        java.util.List<retrofit.client.Header> headerList42 = request39.headers;
        requestBuilder34.setheaders(headerList42);
        retrofit.RequestBuilder requestBuilder44 = requestBuilder3.headers(headerList42);
        java.lang.Object[] objArray45 = requestBuilder3.getargs();
        java.lang.Object[] objArray46 = requestBuilder3.getargs();
        java.util.List<retrofit.client.Header> headerList49 = null;
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("", "", headerList49, typedOutput50);
        retrofit.mime.TypedOutput typedOutput52 = request51.getBody();
        java.util.List<retrofit.client.Header> headerList53 = request51.headers;
        java.util.List<retrofit.client.Header> headerList54 = request51.headers;
        requestBuilder3.headers = headerList54;
        requestBuilder3.apiUrl = "";
        java.util.List<retrofit.client.Header> headerList58 = requestBuilder3.getheaders();
        retrofit.RequestBuilder requestBuilder60 = requestBuilder3.apiUrl("");
        java.lang.String str61 = requestBuilder3.getapiUrl();
        java.util.List<retrofit.client.Header> headerList62 = requestBuilder3.getheaders();
        retrofit.mime.TypedOutput typedOutput63 = null;
        retrofit.client.Request request64 = new retrofit.client.Request("hi!", "", headerList62, typedOutput63);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNull(typedOutput41);
        org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNull(typedOutput52);
        org.junit.Assert.assertNotNull(headerList53);
        org.junit.Assert.assertNotNull(headerList54);
        org.junit.Assert.assertNotNull(headerList58);
        org.junit.Assert.assertNotNull(requestBuilder60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(headerList62);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        java.lang.Object[] objArray27 = requestBuilder1.getargs();
        requestBuilder1.apiUrl = "";
        requestBuilder1.apiUrl = "hi!";
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        java.lang.String str10 = request8.url;
        java.lang.String str11 = request8.url;
        java.lang.String str12 = request8.method;
        retrofit.mime.TypedOutput typedOutput13 = request8.getBody();
        java.lang.String str14 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList15 = request8.headers;
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "", headerList15, typedOutput16);
        java.lang.String str18 = request17.url;
        java.util.List<retrofit.client.Header> headerList19 = request17.headers;
        retrofit.mime.TypedOutput typedOutput20 = request17.body;
        retrofit.mime.TypedOutput typedOutput21 = request17.getBody();
        java.lang.String str22 = request17.getUrl();
        retrofit.mime.TypedOutput typedOutput23 = request17.getBody();
        java.util.List<retrofit.client.Header> headerList24 = request17.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = request17.body;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNull(typedOutput25);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList6 = request4.getHeaders();
        java.lang.String str7 = request4.url;
        java.lang.String str8 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request4.headers;
        java.lang.String str10 = request4.getUrl();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.converter.Converter converter19 = requestBuilder18.getconverter();
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder18.headers;
        requestBuilder18.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList25 = null;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder18, request27 };
        requestBuilder5.setargs(objArray29);
        requestBuilder5.apiUrl = "";
        retrofit.RequestBuilder requestBuilder34 = requestBuilder5.apiUrl("hi!");
        retrofit.converter.Converter converter35 = null;
        retrofit.RequestBuilder requestBuilder36 = new retrofit.RequestBuilder(converter35);
        java.util.List<retrofit.client.Header> headerList39 = null;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = request41.getBody();
        retrofit.mime.TypedOutput typedOutput43 = request41.getBody();
        java.util.List<retrofit.client.Header> headerList44 = request41.headers;
        requestBuilder36.setheaders(headerList44);
        retrofit.RequestBuilder requestBuilder46 = requestBuilder5.headers(headerList44);
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("hi!", "", headerList44, typedOutput47);
        retrofit.mime.TypedOutput typedOutput49 = null;
        retrofit.client.Request request50 = new retrofit.client.Request("hi!", "", headerList44, typedOutput49);
        java.util.List<retrofit.client.Header> headerList51 = request50.getHeaders();
        java.lang.String str52 = request50.url;
        java.lang.String str53 = request50.url;
        retrofit.mime.TypedOutput typedOutput54 = request50.body;
        retrofit.mime.TypedOutput typedOutput55 = request50.getBody();
        java.util.List<retrofit.client.Header> headerList56 = request50.headers;
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(headerList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNull(typedOutput42);
        org.junit.Assert.assertNull(typedOutput43);
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(headerList51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNull(typedOutput54);
        org.junit.Assert.assertNull(typedOutput55);
        org.junit.Assert.assertNotNull(headerList56);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request6.body;
        java.lang.String str9 = request6.getUrl();
        java.lang.String str10 = request6.url;
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "", headerList11, typedOutput12);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        java.lang.Object[] objArray29 = requestBuilder3.getargs();
        java.util.List<retrofit.client.Header> headerList30 = null;
        requestBuilder3.headers = headerList30;
        retrofit.converter.Converter converter32 = requestBuilder3.getconverter();
        java.lang.Object[] objArray33 = requestBuilder3.args;
        java.lang.String str34 = requestBuilder3.apiUrl;
        java.util.List<retrofit.client.Header> headerList35 = requestBuilder3.getheaders();
        java.util.List<retrofit.client.Header> headerList38 = null;
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "", headerList38, typedOutput39);
        retrofit.mime.TypedOutput typedOutput41 = request40.getBody();
        retrofit.mime.TypedOutput typedOutput42 = request40.getBody();
        java.lang.String str43 = request40.getUrl();
        java.util.List<retrofit.client.Header> headerList44 = request40.headers;
        requestBuilder3.setheaders(headerList44);
        java.util.List<retrofit.client.Header> headerList46 = requestBuilder3.headers;
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("", "hi!", headerList46, typedOutput47);
        retrofit.mime.TypedOutput typedOutput49 = request48.body;
        retrofit.mime.TypedOutput typedOutput50 = request48.getBody();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNull(converter32);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(headerList35);
        org.junit.Assert.assertNull(typedOutput41);
        org.junit.Assert.assertNull(typedOutput42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertNotNull(headerList46);
        org.junit.Assert.assertNull(typedOutput49);
        org.junit.Assert.assertNull(typedOutput50);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        retrofit.converter.Converter converter7 = null;
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        requestBuilder8.setheaders((java.util.List<retrofit.client.Header>) headerList12);
        java.util.List<retrofit.client.Header> headerList19 = null;
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList19, typedOutput20);
        java.lang.String str22 = request21.getUrl();
        retrofit.mime.TypedOutput typedOutput23 = request21.body;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder8, typedOutput23 };
        requestBuilder1.setargs(objArray24);
        java.util.List<retrofit.client.Header> headerList26 = requestBuilder1.headers;
        retrofit.converter.Converter converter27 = null;
        retrofit.RequestBuilder requestBuilder28 = new retrofit.RequestBuilder(converter27);
        retrofit.converter.Converter converter29 = requestBuilder28.getconverter();
        retrofit.converter.Converter converter30 = null;
        retrofit.RequestBuilder requestBuilder31 = new retrofit.RequestBuilder(converter30);
        retrofit.client.Header[] headerArray34 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList35 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList35, headerArray34);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList35, typedOutput37);
        requestBuilder31.setheaders((java.util.List<retrofit.client.Header>) headerList35);
        retrofit.converter.Converter converter43 = null;
        retrofit.RequestBuilder requestBuilder44 = new retrofit.RequestBuilder(converter43);
        retrofit.converter.Converter converter45 = requestBuilder44.getconverter();
        java.util.List<retrofit.client.Header> headerList46 = requestBuilder44.headers;
        requestBuilder44.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList51 = null;
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("", "", headerList51, typedOutput52);
        java.lang.String str54 = request53.getUrl();
        java.lang.Object[] objArray55 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder44, request53 };
        requestBuilder31.setargs(objArray55);
        java.lang.Object[] objArray57 = requestBuilder31.getargs();
        retrofit.RequestBuilder requestBuilder58 = requestBuilder28.args(objArray57);
        java.lang.String str59 = requestBuilder28.getapiUrl();
        java.lang.String str60 = requestBuilder28.apiUrl;
        retrofit.RequestBuilder requestBuilder62 = requestBuilder28.apiUrl("");
        java.lang.Object[] objArray63 = new java.lang.Object[] {};
        requestBuilder28.setargs(objArray63);
        java.util.List<retrofit.client.Header> headerList67 = null;
        retrofit.mime.TypedOutput typedOutput68 = null;
        retrofit.client.Request request69 = new retrofit.client.Request("", "", headerList67, typedOutput68);
        java.lang.String str70 = request69.getUrl();
        retrofit.mime.TypedOutput typedOutput71 = request69.body;
        java.util.List<retrofit.client.Header> headerList72 = request69.getHeaders();
        java.util.List<retrofit.client.Header> headerList73 = request69.getHeaders();
        requestBuilder28.setheaders(headerList73);
        java.lang.Object[] objArray75 = requestBuilder28.getargs();
        requestBuilder1.setargs(objArray75);
        java.lang.String str77 = requestBuilder1.apiUrl;
        java.lang.String str78 = requestBuilder1.apiUrl;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(headerList26);
        org.junit.Assert.assertNull(converter29);
        org.junit.Assert.assertNotNull(headerArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(converter45);
        org.junit.Assert.assertNull(headerList46);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertNotNull(requestBuilder58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(requestBuilder62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray63), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray63), "[]");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNull(typedOutput71);
        org.junit.Assert.assertNotNull(headerList72);
        org.junit.Assert.assertNotNull(headerList73);
        org.junit.Assert.assertNotNull(objArray75);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray75), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray75), "[]");
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(str78);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder1.getheaders();
        java.lang.String str11 = requestBuilder1.getapiUrl();
        retrofit.RequestBuilder requestBuilder13 = requestBuilder1.apiUrl("");
        retrofit.converter.Converter converter14 = requestBuilder13.getconverter();
        java.util.List<retrofit.client.Header> headerList17 = null;
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = request19.getBody();
        retrofit.mime.TypedOutput typedOutput21 = request19.getBody();
        java.lang.String str22 = request19.getMethod();
        retrofit.mime.TypedOutput typedOutput23 = request19.body;
        java.util.List<retrofit.client.Header> headerList24 = request19.headers;
        retrofit.RequestBuilder requestBuilder25 = requestBuilder13.headers(headerList24);
        java.lang.Object[] objArray26 = requestBuilder25.getargs();
        java.lang.String str27 = requestBuilder25.apiUrl;
        java.util.List<retrofit.client.Header> headerList28 = requestBuilder25.getheaders();
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder25.headers;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request30 = requestBuilder25.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNull(objArray26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(headerList29);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request6.body;
        java.lang.String str9 = request6.method;
        retrofit.mime.TypedOutput typedOutput10 = request6.body;
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(typedOutput10);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        requestBuilder1.setapiUrl("hi!");
        java.lang.String str8 = requestBuilder1.apiUrl;
        java.lang.String str9 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter10 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter11 = requestBuilder1.converter;
        retrofit.converter.Converter converter12 = requestBuilder1.getconverter();
        requestBuilder1.apiUrl = "";
        java.lang.Object[] objArray15 = requestBuilder1.getargs();
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(converter10);
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(objArray15);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList7 = request4.headers;
        java.lang.String str8 = request4.getUrl();
        java.lang.String str9 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        java.lang.String str11 = request4.getUrl();
        java.lang.String str12 = request4.getUrl();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        requestBuilder1.setheaders(headerList9);
        retrofit.converter.Converter converter11 = null;
        retrofit.RequestBuilder requestBuilder12 = new retrofit.RequestBuilder(converter11);
        retrofit.converter.Converter converter13 = requestBuilder12.getconverter();
        java.util.List<retrofit.client.Header> headerList14 = requestBuilder12.headers;
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        requestBuilder19.setheaders((java.util.List<retrofit.client.Header>) headerList23);
        java.util.List<retrofit.client.Header> headerList30 = null;
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", headerList30, typedOutput31);
        java.lang.String str33 = request32.getUrl();
        retrofit.mime.TypedOutput typedOutput34 = request32.body;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder19, typedOutput34 };
        requestBuilder12.setargs(objArray35);
        retrofit.RequestBuilder requestBuilder37 = requestBuilder1.args(objArray35);
        requestBuilder1.apiUrl = "hi!";
        java.lang.Object[] objArray40 = requestBuilder1.args;
        requestBuilder1.setapiUrl("hi!");
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(headerList14);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(typedOutput34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = requestBuilder1.converter;
        retrofit.RequestBuilder requestBuilder8 = requestBuilder1.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder10 = requestBuilder8.apiUrl("hi!");
        retrofit.converter.Converter converter11 = null;
        retrofit.RequestBuilder requestBuilder12 = new retrofit.RequestBuilder(converter11);
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        requestBuilder12.setheaders((java.util.List<retrofit.client.Header>) headerList16);
        java.util.List<retrofit.client.Header> headerList21 = requestBuilder12.getheaders();
        java.lang.String str22 = requestBuilder12.getapiUrl();
        retrofit.converter.Converter converter23 = null;
        retrofit.RequestBuilder requestBuilder24 = new retrofit.RequestBuilder(converter23);
        retrofit.client.Header[] headerArray27 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList28 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList28, headerArray27);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList28, typedOutput30);
        requestBuilder24.setheaders((java.util.List<retrofit.client.Header>) headerList28);
        retrofit.converter.Converter converter36 = null;
        retrofit.RequestBuilder requestBuilder37 = new retrofit.RequestBuilder(converter36);
        retrofit.converter.Converter converter38 = requestBuilder37.getconverter();
        java.util.List<retrofit.client.Header> headerList39 = requestBuilder37.headers;
        requestBuilder37.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList44 = null;
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("", "", headerList44, typedOutput45);
        java.lang.String str47 = request46.getUrl();
        java.lang.Object[] objArray48 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder37, request46 };
        requestBuilder24.setargs(objArray48);
        requestBuilder24.apiUrl = "";
        retrofit.RequestBuilder requestBuilder53 = requestBuilder24.apiUrl("hi!");
        retrofit.converter.Converter converter54 = null;
        retrofit.RequestBuilder requestBuilder55 = new retrofit.RequestBuilder(converter54);
        java.util.List<retrofit.client.Header> headerList58 = null;
        retrofit.mime.TypedOutput typedOutput59 = null;
        retrofit.client.Request request60 = new retrofit.client.Request("", "", headerList58, typedOutput59);
        retrofit.mime.TypedOutput typedOutput61 = request60.getBody();
        retrofit.mime.TypedOutput typedOutput62 = request60.getBody();
        java.util.List<retrofit.client.Header> headerList63 = request60.headers;
        requestBuilder55.setheaders(headerList63);
        retrofit.RequestBuilder requestBuilder65 = requestBuilder24.headers(headerList63);
        requestBuilder12.headers = headerList63;
        java.util.List<retrofit.client.Header> headerList69 = null;
        retrofit.mime.TypedOutput typedOutput70 = null;
        retrofit.client.Request request71 = new retrofit.client.Request("", "", headerList69, typedOutput70);
        java.lang.String str72 = request71.url;
        java.util.List<retrofit.client.Header> headerList73 = request71.getHeaders();
        requestBuilder12.headers = headerList73;
        retrofit.RequestBuilder requestBuilder75 = requestBuilder8.headers(headerList73);
        retrofit.converter.Converter converter76 = requestBuilder8.getconverter();
        retrofit.converter.Converter converter77 = requestBuilder8.getconverter();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str78 = requestBuilder8.buildRelativeUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(headerArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(converter38);
        org.junit.Assert.assertNull(headerList39);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNotNull(requestBuilder53);
        org.junit.Assert.assertNull(typedOutput61);
        org.junit.Assert.assertNull(typedOutput62);
        org.junit.Assert.assertNotNull(headerList63);
        org.junit.Assert.assertNotNull(requestBuilder65);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(headerList73);
        org.junit.Assert.assertNotNull(requestBuilder75);
        org.junit.Assert.assertNull(converter76);
        org.junit.Assert.assertNull(converter77);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder1.getheaders();
        java.lang.String str11 = requestBuilder1.apiUrl;
        java.util.List<retrofit.client.Header> headerList12 = requestBuilder1.getheaders();
        requestBuilder1.setapiUrl("hi!");
        java.lang.String str15 = requestBuilder1.apiUrl;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request16 = requestBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.lang.String str7 = request4.getMethod();
        java.lang.String str8 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.String str10 = request4.method;
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        java.lang.String str12 = request4.url;
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList7 = request4.headers;
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.String str10 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request4.headers;
        java.util.List<retrofit.client.Header> headerList12 = request4.headers;
        java.lang.String str13 = request4.url;
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        requestBuilder1.apiUrl = "";
        retrofit.converter.Converter converter29 = null;
        retrofit.RequestBuilder requestBuilder30 = new retrofit.RequestBuilder(converter29);
        java.util.List<retrofit.client.Header> headerList33 = null;
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "", headerList33, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = request35.getBody();
        retrofit.mime.TypedOutput typedOutput37 = request35.getBody();
        java.util.List<retrofit.client.Header> headerList38 = request35.headers;
        requestBuilder30.setheaders(headerList38);
        requestBuilder1.setheaders(headerList38);
        requestBuilder1.apiUrl = "";
        java.lang.Object[] objArray43 = requestBuilder1.args;
        java.util.List<retrofit.client.Header> headerList44 = requestBuilder1.getheaders();
        java.lang.String str45 = requestBuilder1.getapiUrl();
        retrofit.RequestBuilder requestBuilder47 = requestBuilder1.apiUrl("hi!");
        java.lang.Object[] objArray48 = requestBuilder47.getargs();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(typedOutput36);
        org.junit.Assert.assertNull(typedOutput37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(requestBuilder47);
        org.junit.Assert.assertNotNull(objArray48);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.headers;
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", headerList12, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.headers;
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "", headerList15, typedOutput16);
        java.util.List<retrofit.client.Header> headerList18 = request17.headers;
        retrofit.mime.TypedOutput typedOutput19 = request17.getBody();
        java.lang.String str20 = request17.getUrl();
        java.util.List<retrofit.client.Header> headerList21 = request17.headers;
        java.util.List<retrofit.client.Header> headerList22 = request17.getHeaders();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(headerList22);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        requestBuilder3.apiUrl = "";
        retrofit.RequestBuilder requestBuilder32 = requestBuilder3.apiUrl("hi!");
        retrofit.converter.Converter converter33 = null;
        retrofit.RequestBuilder requestBuilder34 = new retrofit.RequestBuilder(converter33);
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.getBody();
        retrofit.mime.TypedOutput typedOutput41 = request39.getBody();
        java.util.List<retrofit.client.Header> headerList42 = request39.headers;
        requestBuilder34.setheaders(headerList42);
        retrofit.RequestBuilder requestBuilder44 = requestBuilder3.headers(headerList42);
        java.lang.Object[] objArray45 = requestBuilder3.getargs();
        java.lang.Object[] objArray46 = requestBuilder3.getargs();
        java.util.List<retrofit.client.Header> headerList49 = null;
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("", "", headerList49, typedOutput50);
        retrofit.mime.TypedOutput typedOutput52 = request51.getBody();
        java.util.List<retrofit.client.Header> headerList53 = request51.headers;
        java.util.List<retrofit.client.Header> headerList54 = request51.headers;
        requestBuilder3.headers = headerList54;
        requestBuilder3.apiUrl = "";
        java.util.List<retrofit.client.Header> headerList58 = requestBuilder3.getheaders();
        retrofit.mime.TypedOutput typedOutput59 = null;
        retrofit.client.Request request60 = new retrofit.client.Request("", "hi!", headerList58, typedOutput59);
        java.lang.String str61 = request60.getMethod();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNull(typedOutput41);
        org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNull(typedOutput52);
        org.junit.Assert.assertNotNull(headerList53);
        org.junit.Assert.assertNotNull(headerList54);
        org.junit.Assert.assertNotNull(headerList58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.headers;
        requestBuilder3.setheaders(headerList11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList11, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.headers;
        java.lang.String str16 = request14.getMethod();
        retrofit.mime.TypedOutput typedOutput17 = request14.getBody();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(typedOutput17);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        java.lang.Object[] objArray27 = requestBuilder1.getargs();
        java.lang.String str28 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter29 = requestBuilder1.converter;
        retrofit.RequestBuilder requestBuilder31 = requestBuilder1.apiUrl("");
        java.lang.Object[] objArray32 = requestBuilder1.getargs();
        requestBuilder1.setapiUrl("hi!");
        java.lang.Object[] objArray35 = null;
        retrofit.RequestBuilder requestBuilder36 = requestBuilder1.args(objArray35);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(converter29);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(requestBuilder36);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.converter.Converter converter18 = requestBuilder17.getconverter();
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder17.headers;
        requestBuilder17.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder17, request26 };
        requestBuilder4.setargs(objArray28);
        java.lang.Object[] objArray30 = requestBuilder4.getargs();
        retrofit.RequestBuilder requestBuilder31 = requestBuilder1.args(objArray30);
        java.util.List<retrofit.client.Header> headerList32 = requestBuilder1.getheaders();
        java.lang.String str33 = requestBuilder1.apiUrl;
        java.lang.Object[] objArray34 = requestBuilder1.getargs();
        retrofit.converter.Converter converter37 = null;
        retrofit.RequestBuilder requestBuilder38 = new retrofit.RequestBuilder(converter37);
        retrofit.client.Header[] headerArray41 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList42 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList42, headerArray41);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList42, typedOutput44);
        requestBuilder38.setheaders((java.util.List<retrofit.client.Header>) headerList42);
        retrofit.converter.Converter converter50 = null;
        retrofit.RequestBuilder requestBuilder51 = new retrofit.RequestBuilder(converter50);
        retrofit.converter.Converter converter52 = requestBuilder51.getconverter();
        java.util.List<retrofit.client.Header> headerList53 = requestBuilder51.headers;
        requestBuilder51.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList58 = null;
        retrofit.mime.TypedOutput typedOutput59 = null;
        retrofit.client.Request request60 = new retrofit.client.Request("", "", headerList58, typedOutput59);
        java.lang.String str61 = request60.getUrl();
        java.lang.Object[] objArray62 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder51, request60 };
        requestBuilder38.setargs(objArray62);
        java.lang.Object[] objArray64 = requestBuilder38.getargs();
        java.util.List<retrofit.client.Header> headerList65 = null;
        requestBuilder38.headers = headerList65;
        retrofit.converter.Converter converter67 = requestBuilder38.getconverter();
        java.lang.Object[] objArray68 = requestBuilder38.args;
        java.lang.String str69 = requestBuilder38.apiUrl;
        java.util.List<retrofit.client.Header> headerList70 = requestBuilder38.getheaders();
        java.util.List<retrofit.client.Header> headerList73 = null;
        retrofit.mime.TypedOutput typedOutput74 = null;
        retrofit.client.Request request75 = new retrofit.client.Request("", "", headerList73, typedOutput74);
        retrofit.mime.TypedOutput typedOutput76 = request75.getBody();
        retrofit.mime.TypedOutput typedOutput77 = request75.getBody();
        java.lang.String str78 = request75.getUrl();
        java.util.List<retrofit.client.Header> headerList79 = request75.headers;
        requestBuilder38.setheaders(headerList79);
        java.lang.String str81 = requestBuilder38.apiUrl;
        requestBuilder38.setapiUrl("hi!");
        java.lang.Object[] objArray84 = requestBuilder38.args;
        java.util.List<retrofit.client.Header> headerList85 = requestBuilder38.getheaders();
        retrofit.mime.TypedOutput typedOutput86 = null;
        retrofit.client.Request request87 = new retrofit.client.Request("hi!", "", headerList85, typedOutput86);
        requestBuilder1.headers = headerList85;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(headerList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(headerArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(converter52);
        org.junit.Assert.assertNull(headerList53);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(objArray62);
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNull(converter67);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNull(headerList70);
        org.junit.Assert.assertNull(typedOutput76);
        org.junit.Assert.assertNull(typedOutput77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(headerList79);
        org.junit.Assert.assertNull(str81);
        org.junit.Assert.assertNotNull(objArray84);
        org.junit.Assert.assertNotNull(headerList85);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        requestBuilder1.apiUrl = "";
        retrofit.RequestBuilder requestBuilder30 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        java.util.List<retrofit.client.Header> headerList35 = null;
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", headerList35, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.getBody();
        retrofit.mime.TypedOutput typedOutput39 = request37.getBody();
        java.util.List<retrofit.client.Header> headerList40 = request37.headers;
        requestBuilder32.setheaders(headerList40);
        retrofit.RequestBuilder requestBuilder42 = requestBuilder1.headers(headerList40);
        java.lang.Object[] objArray43 = requestBuilder1.getargs();
        java.lang.Object[] objArray44 = requestBuilder1.getargs();
        java.util.List<retrofit.client.Header> headerList47 = null;
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "", headerList47, typedOutput48);
        retrofit.mime.TypedOutput typedOutput50 = request49.getBody();
        java.util.List<retrofit.client.Header> headerList51 = request49.headers;
        java.util.List<retrofit.client.Header> headerList52 = request49.headers;
        requestBuilder1.headers = headerList52;
        requestBuilder1.apiUrl = "";
        java.util.List<retrofit.client.Header> headerList56 = requestBuilder1.getheaders();
        retrofit.RequestBuilder requestBuilder58 = requestBuilder1.apiUrl("");
        java.lang.String str59 = requestBuilder1.getapiUrl();
        java.util.List<retrofit.client.Header> headerList60 = requestBuilder1.getheaders();
        retrofit.RequestBuilder requestBuilder62 = requestBuilder1.apiUrl("");
        requestBuilder1.setapiUrl("hi!");
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNull(typedOutput39);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNull(typedOutput50);
        org.junit.Assert.assertNotNull(headerList51);
        org.junit.Assert.assertNotNull(headerList52);
        org.junit.Assert.assertNotNull(headerList56);
        org.junit.Assert.assertNotNull(requestBuilder58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(headerList60);
        org.junit.Assert.assertNotNull(requestBuilder62);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.url;
        java.lang.String str9 = request4.url;
        java.util.List<retrofit.client.Header> headerList10 = request4.headers;
        java.lang.String str11 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request4.headers;
        java.lang.String str13 = request4.method;
        java.lang.String str14 = request4.method;
        java.lang.String str15 = request4.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.url;
        java.lang.String str9 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList10 = request4.headers;
        java.lang.String str11 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput12 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request4.headers;
        java.lang.String str14 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput15 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request4.body;
        java.lang.String str17 = request4.getMethod();
        java.lang.String str18 = request4.getMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request8.body;
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = request15.body;
        java.util.List<retrofit.client.Header> headerList17 = request15.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = request15.getBody();
        java.lang.String str19 = request15.getMethod();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.converter.Converter converter4 = requestBuilder3.getconverter();
        retrofit.converter.Converter converter5 = null;
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        requestBuilder6.setheaders((java.util.List<retrofit.client.Header>) headerList10);
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        retrofit.converter.Converter converter20 = requestBuilder19.getconverter();
        java.util.List<retrofit.client.Header> headerList21 = requestBuilder19.headers;
        requestBuilder19.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList26 = null;
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", headerList26, typedOutput27);
        java.lang.String str29 = request28.getUrl();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder19, request28 };
        requestBuilder6.setargs(objArray30);
        java.lang.Object[] objArray32 = requestBuilder6.getargs();
        retrofit.RequestBuilder requestBuilder33 = requestBuilder3.args(objArray32);
        retrofit.converter.Converter converter34 = requestBuilder3.getconverter();
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.getBody();
        java.util.List<retrofit.client.Header> headerList41 = request39.headers;
        requestBuilder3.setheaders(headerList41);
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("", "", headerList41, typedOutput43);
        java.util.List<retrofit.client.Header> headerList45 = request44.getHeaders();
        java.lang.String str46 = request44.method;
        retrofit.mime.TypedOutput typedOutput47 = request44.body;
        java.lang.String str48 = request44.method;
        retrofit.mime.TypedOutput typedOutput49 = request44.getBody();
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(headerList21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNull(converter34);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNotNull(headerList41);
        org.junit.Assert.assertNotNull(headerList45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(typedOutput47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNull(typedOutput49);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.url;
        java.lang.String str9 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        java.lang.String str11 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput12 = request4.body;
        retrofit.mime.TypedOutput typedOutput13 = request4.body;
        java.lang.String str14 = request4.method;
        java.lang.String str15 = request4.url;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        retrofit.RequestBuilder requestBuilder28 = requestBuilder1.apiUrl("");
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder1.headers;
        java.lang.Object[] objArray30 = requestBuilder1.getargs();
        java.lang.Object[] objArray31 = requestBuilder1.args;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.mime.TypedOutput typedOutput32 = requestBuilder1.buildBody();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray31);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.headers;
        requestBuilder3.setheaders(headerList11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", headerList11, typedOutput13);
        java.lang.String str15 = request14.method;
        java.lang.String str16 = request14.method;
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = requestBuilder1.converter;
        retrofit.RequestBuilder requestBuilder8 = requestBuilder1.apiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder8.getheaders();
        requestBuilder8.setapiUrl("");
        retrofit.converter.Converter converter12 = null;
        retrofit.RequestBuilder requestBuilder13 = new retrofit.RequestBuilder(converter12);
        retrofit.converter.Converter converter14 = requestBuilder13.getconverter();
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.client.Header[] headerArray19 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList20 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList20, headerArray19);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList20, typedOutput22);
        requestBuilder16.setheaders((java.util.List<retrofit.client.Header>) headerList20);
        retrofit.converter.Converter converter28 = null;
        retrofit.RequestBuilder requestBuilder29 = new retrofit.RequestBuilder(converter28);
        retrofit.converter.Converter converter30 = requestBuilder29.getconverter();
        java.util.List<retrofit.client.Header> headerList31 = requestBuilder29.headers;
        requestBuilder29.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList36 = null;
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("", "", headerList36, typedOutput37);
        java.lang.String str39 = request38.getUrl();
        java.lang.Object[] objArray40 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder29, request38 };
        requestBuilder16.setargs(objArray40);
        java.lang.Object[] objArray42 = requestBuilder16.getargs();
        retrofit.RequestBuilder requestBuilder43 = requestBuilder13.args(objArray42);
        java.util.List<retrofit.client.Header> headerList44 = requestBuilder13.getheaders();
        java.util.List<retrofit.client.Header> headerList45 = null;
        retrofit.RequestBuilder requestBuilder46 = requestBuilder13.headers(headerList45);
        java.lang.Object[] objArray47 = requestBuilder13.getargs();
        requestBuilder8.args = objArray47;
        java.util.List<retrofit.client.Header> headerList49 = requestBuilder8.headers;
        java.lang.Object[] objArray50 = requestBuilder8.args;
        requestBuilder8.setapiUrl("");
        java.lang.String str53 = requestBuilder8.apiUrl;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(headerList9);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(converter30);
        org.junit.Assert.assertNull(headerList31);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNull(headerList44);
        org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNull(headerList49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        java.lang.String str10 = requestBuilder1.getapiUrl();
        retrofit.RequestBuilder requestBuilder12 = requestBuilder1.apiUrl("");
        java.lang.Object[] objArray13 = requestBuilder1.getargs();
        retrofit.converter.Converter converter14 = requestBuilder1.getconverter();
        java.lang.Object[] objArray15 = requestBuilder1.getargs();
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        requestBuilder17.setheaders((java.util.List<retrofit.client.Header>) headerList21);
        retrofit.converter.Converter converter29 = null;
        retrofit.RequestBuilder requestBuilder30 = new retrofit.RequestBuilder(converter29);
        retrofit.converter.Converter converter31 = requestBuilder30.getconverter();
        java.util.List<retrofit.client.Header> headerList32 = requestBuilder30.headers;
        requestBuilder30.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        java.lang.String str40 = request39.getUrl();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder30, request39 };
        requestBuilder17.setargs(objArray41);
        retrofit.RequestBuilder requestBuilder44 = requestBuilder17.apiUrl("");
        java.util.List<retrofit.client.Header> headerList45 = requestBuilder17.headers;
        java.lang.Object[] objArray46 = requestBuilder17.args;
        retrofit.converter.Converter converter47 = null;
        retrofit.RequestBuilder requestBuilder48 = new retrofit.RequestBuilder(converter47);
        retrofit.client.Header[] headerArray51 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList52 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList52, headerArray51);
        retrofit.mime.TypedOutput typedOutput54 = null;
        retrofit.client.Request request55 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList52, typedOutput54);
        requestBuilder48.setheaders((java.util.List<retrofit.client.Header>) headerList52);
        retrofit.converter.Converter converter60 = null;
        retrofit.RequestBuilder requestBuilder61 = new retrofit.RequestBuilder(converter60);
        retrofit.converter.Converter converter62 = requestBuilder61.getconverter();
        java.util.List<retrofit.client.Header> headerList63 = requestBuilder61.headers;
        requestBuilder61.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList68 = null;
        retrofit.mime.TypedOutput typedOutput69 = null;
        retrofit.client.Request request70 = new retrofit.client.Request("", "", headerList68, typedOutput69);
        java.lang.String str71 = request70.getUrl();
        java.lang.Object[] objArray72 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder61, request70 };
        requestBuilder48.setargs(objArray72);
        requestBuilder17.setargs(objArray72);
        requestBuilder17.apiUrl = "";
        retrofit.RequestBuilder requestBuilder78 = requestBuilder17.apiUrl("hi!");
        java.lang.Object[] objArray79 = requestBuilder17.getargs();
        java.lang.Object[] objArray80 = requestBuilder17.getargs();
        retrofit.RequestBuilder requestBuilder81 = requestBuilder1.args(objArray80);
        java.util.List<retrofit.client.Header> headerList82 = requestBuilder81.getheaders();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertNull(objArray15);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(converter31);
        org.junit.Assert.assertNull(headerList32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(headerList45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNotNull(headerArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(converter62);
        org.junit.Assert.assertNull(headerList63);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(objArray72);
        org.junit.Assert.assertNotNull(requestBuilder78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(requestBuilder81);
        org.junit.Assert.assertNotNull(headerList82);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.lang.String str7 = request4.getMethod();
        java.lang.String str8 = request4.getUrl();
        java.lang.String str9 = request4.getUrl();
        java.lang.String str10 = request4.getMethod();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.converter.Converter converter18 = requestBuilder17.getconverter();
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder17.headers;
        requestBuilder17.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder17, request26 };
        requestBuilder4.setargs(objArray28);
        java.lang.Object[] objArray30 = requestBuilder4.getargs();
        retrofit.RequestBuilder requestBuilder31 = requestBuilder1.args(objArray30);
        java.lang.String str32 = requestBuilder1.getapiUrl();
        java.lang.String str33 = requestBuilder1.apiUrl;
        retrofit.RequestBuilder requestBuilder35 = requestBuilder1.apiUrl("");
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        requestBuilder1.setargs(objArray36);
        java.util.List<retrofit.client.Header> headerList40 = null;
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("", "", headerList40, typedOutput41);
        java.lang.String str43 = request42.getUrl();
        retrofit.mime.TypedOutput typedOutput44 = request42.body;
        java.util.List<retrofit.client.Header> headerList45 = request42.getHeaders();
        java.util.List<retrofit.client.Header> headerList46 = request42.getHeaders();
        requestBuilder1.setheaders(headerList46);
        java.util.List<retrofit.client.Header> headerList48 = requestBuilder1.getheaders();
        java.lang.Object[] objArray49 = requestBuilder1.getargs();
        java.lang.Object[] objArray50 = requestBuilder1.getargs();
        java.lang.Object[] objArray51 = requestBuilder1.args;
        java.lang.String str52 = requestBuilder1.apiUrl;
        java.util.List<retrofit.client.Header> headerList53 = requestBuilder1.headers;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(typedOutput44);
        org.junit.Assert.assertNotNull(headerList45);
        org.junit.Assert.assertNotNull(headerList46);
        org.junit.Assert.assertNotNull(headerList48);
        org.junit.Assert.assertNotNull(objArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray49), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray49), "[]");
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[]");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(headerList53);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        requestBuilder1.apiUrl = "";
        retrofit.RequestBuilder requestBuilder30 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        java.util.List<retrofit.client.Header> headerList35 = null;
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", headerList35, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.getBody();
        retrofit.mime.TypedOutput typedOutput39 = request37.getBody();
        java.util.List<retrofit.client.Header> headerList40 = request37.headers;
        requestBuilder32.setheaders(headerList40);
        retrofit.RequestBuilder requestBuilder42 = requestBuilder1.headers(headerList40);
        retrofit.converter.Converter converter43 = requestBuilder1.converter;
        requestBuilder1.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList46 = requestBuilder1.headers;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.mime.TypedOutput typedOutput47 = requestBuilder1.buildBody();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNull(typedOutput39);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNull(converter43);
        org.junit.Assert.assertNotNull(headerList46);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.headers;
        requestBuilder3.setheaders(headerList11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput13);
        java.lang.String str15 = request14.url;
        retrofit.mime.TypedOutput typedOutput16 = request14.body;
        java.lang.String str17 = request14.method;
        java.util.List<retrofit.client.Header> headerList18 = request14.headers;
        java.lang.Class<?> wildcardClass19 = request14.getClass();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        java.lang.String str12 = requestBuilder3.getapiUrl();
        retrofit.RequestBuilder requestBuilder14 = requestBuilder3.apiUrl("");
        java.lang.Object[] objArray15 = requestBuilder3.getargs();
        java.util.List<retrofit.client.Header> headerList20 = null;
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", headerList20, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        java.lang.String str25 = request22.getMethod();
        java.lang.String str26 = request22.method;
        java.lang.String str27 = request22.method;
        java.util.List<retrofit.client.Header> headerList28 = request22.headers;
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "hi!", headerList28, typedOutput29);
        requestBuilder3.setheaders(headerList28);
        java.util.List<retrofit.client.Header> headerList32 = requestBuilder3.getheaders();
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "", headerList32, typedOutput33);
        java.util.List<retrofit.client.Header> headerList35 = request34.headers;
        java.util.List<retrofit.client.Header> headerList36 = request34.getHeaders();
        retrofit.mime.TypedOutput typedOutput37 = request34.body;
        java.util.List<retrofit.client.Header> headerList38 = request34.getHeaders();
        java.util.List<retrofit.client.Header> headerList39 = request34.getHeaders();
        retrofit.mime.TypedOutput typedOutput40 = request34.getBody();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNull(objArray15);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNotNull(headerList36);
        org.junit.Assert.assertNull(typedOutput37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNull(typedOutput40);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        requestBuilder3.apiUrl = "";
        retrofit.RequestBuilder requestBuilder32 = requestBuilder3.apiUrl("hi!");
        retrofit.converter.Converter converter33 = null;
        retrofit.RequestBuilder requestBuilder34 = new retrofit.RequestBuilder(converter33);
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.getBody();
        retrofit.mime.TypedOutput typedOutput41 = request39.getBody();
        java.util.List<retrofit.client.Header> headerList42 = request39.headers;
        requestBuilder34.setheaders(headerList42);
        retrofit.RequestBuilder requestBuilder44 = requestBuilder3.headers(headerList42);
        java.lang.Object[] objArray45 = requestBuilder3.getargs();
        retrofit.RequestBuilder requestBuilder47 = requestBuilder3.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder49 = requestBuilder3.apiUrl("");
        retrofit.RequestBuilder requestBuilder51 = requestBuilder49.apiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList52 = requestBuilder51.getheaders();
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("hi!", "", headerList52, typedOutput53);
        java.lang.String str55 = request54.getMethod();
        java.lang.String str56 = request54.method;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNull(typedOutput41);
        org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(requestBuilder47);
        org.junit.Assert.assertNotNull(requestBuilder49);
        org.junit.Assert.assertNotNull(requestBuilder51);
        org.junit.Assert.assertNotNull(headerList52);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.lang.String str7 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request4.body;
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.lang.String str10 = request4.getMethod();
        java.lang.String str11 = request4.url;
        java.util.List<retrofit.client.Header> headerList12 = request4.getHeaders();
        java.lang.String str13 = request4.getMethod();
        java.lang.String str14 = request4.getMethod();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        retrofit.RequestBuilder requestBuilder30 = requestBuilder3.apiUrl("");
        java.util.List<retrofit.client.Header> headerList31 = requestBuilder3.headers;
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "hi!", headerList31, typedOutput32);
        java.lang.String str34 = request33.getMethod();
        java.lang.String str35 = request33.getUrl();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.url;
        java.lang.String str9 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList10 = request4.headers;
        java.lang.String str11 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput12 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request4.headers;
        java.lang.String str14 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput15 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request4.body;
        java.lang.String str17 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput18 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList19 = request4.getHeaders();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.converter.Converter converter19 = requestBuilder18.getconverter();
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder18.headers;
        requestBuilder18.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList25 = null;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder18, request27 };
        requestBuilder5.setargs(objArray29);
        requestBuilder5.apiUrl = "";
        retrofit.RequestBuilder requestBuilder34 = requestBuilder5.apiUrl("hi!");
        retrofit.converter.Converter converter35 = null;
        retrofit.RequestBuilder requestBuilder36 = new retrofit.RequestBuilder(converter35);
        java.util.List<retrofit.client.Header> headerList39 = null;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = request41.getBody();
        retrofit.mime.TypedOutput typedOutput43 = request41.getBody();
        java.util.List<retrofit.client.Header> headerList44 = request41.headers;
        requestBuilder36.setheaders(headerList44);
        retrofit.RequestBuilder requestBuilder46 = requestBuilder5.headers(headerList44);
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("hi!", "", headerList44, typedOutput47);
        retrofit.mime.TypedOutput typedOutput49 = null;
        retrofit.client.Request request50 = new retrofit.client.Request("hi!", "", headerList44, typedOutput49);
        java.util.List<retrofit.client.Header> headerList51 = request50.getHeaders();
        java.util.List<retrofit.client.Header> headerList52 = request50.headers;
        java.util.List<retrofit.client.Header> headerList53 = request50.getHeaders();
        java.lang.String str54 = request50.url;
        retrofit.mime.TypedOutput typedOutput55 = request50.body;
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(headerList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNull(typedOutput42);
        org.junit.Assert.assertNull(typedOutput43);
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(headerList51);
        org.junit.Assert.assertNotNull(headerList52);
        org.junit.Assert.assertNotNull(headerList53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(typedOutput55);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        java.lang.String str10 = requestBuilder1.getapiUrl();
        retrofit.RequestBuilder requestBuilder12 = requestBuilder1.apiUrl("");
        java.util.List<retrofit.client.Header> headerList15 = null;
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", headerList15, typedOutput16);
        java.lang.String str18 = request17.url;
        java.util.List<retrofit.client.Header> headerList19 = request17.getHeaders();
        java.util.List<retrofit.client.Header> headerList20 = request17.getHeaders();
        requestBuilder1.headers = headerList20;
        retrofit.RequestBuilder requestBuilder23 = requestBuilder1.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder25 = requestBuilder23.apiUrl("");
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNotNull(requestBuilder25);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        requestBuilder3.apiUrl = "";
        retrofit.RequestBuilder requestBuilder32 = requestBuilder3.apiUrl("hi!");
        retrofit.converter.Converter converter33 = null;
        retrofit.RequestBuilder requestBuilder34 = new retrofit.RequestBuilder(converter33);
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.getBody();
        retrofit.mime.TypedOutput typedOutput41 = request39.getBody();
        java.util.List<retrofit.client.Header> headerList42 = request39.headers;
        requestBuilder34.setheaders(headerList42);
        retrofit.RequestBuilder requestBuilder44 = requestBuilder3.headers(headerList42);
        java.lang.Object[] objArray45 = requestBuilder3.getargs();
        java.lang.Object[] objArray46 = requestBuilder3.getargs();
        java.util.List<retrofit.client.Header> headerList49 = null;
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("", "", headerList49, typedOutput50);
        retrofit.mime.TypedOutput typedOutput52 = request51.getBody();
        java.util.List<retrofit.client.Header> headerList53 = request51.headers;
        java.util.List<retrofit.client.Header> headerList54 = request51.headers;
        requestBuilder3.headers = headerList54;
        requestBuilder3.apiUrl = "";
        java.util.List<retrofit.client.Header> headerList58 = requestBuilder3.getheaders();
        retrofit.mime.TypedOutput typedOutput59 = null;
        retrofit.client.Request request60 = new retrofit.client.Request("", "hi!", headerList58, typedOutput59);
        java.lang.String str61 = request60.url;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNull(typedOutput41);
        org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray46);
        org.junit.Assert.assertNull(typedOutput52);
        org.junit.Assert.assertNotNull(headerList53);
        org.junit.Assert.assertNotNull(headerList54);
        org.junit.Assert.assertNotNull(headerList58);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.String str2 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.converter.Converter converter5 = requestBuilder4.getconverter();
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        requestBuilder7.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        retrofit.converter.Converter converter19 = null;
        retrofit.RequestBuilder requestBuilder20 = new retrofit.RequestBuilder(converter19);
        retrofit.converter.Converter converter21 = requestBuilder20.getconverter();
        java.util.List<retrofit.client.Header> headerList22 = requestBuilder20.headers;
        requestBuilder20.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList27 = null;
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", headerList27, typedOutput28);
        java.lang.String str30 = request29.getUrl();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder20, request29 };
        requestBuilder7.setargs(objArray31);
        java.lang.Object[] objArray33 = requestBuilder7.getargs();
        retrofit.RequestBuilder requestBuilder34 = requestBuilder4.args(objArray33);
        requestBuilder1.setargs(objArray33);
        java.lang.String str36 = requestBuilder1.getapiUrl();
        java.lang.String str37 = requestBuilder1.getapiUrl();
        retrofit.converter.Converter converter40 = null;
        retrofit.RequestBuilder requestBuilder41 = new retrofit.RequestBuilder(converter40);
        retrofit.client.Header[] headerArray44 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList45 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList45, headerArray44);
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList45, typedOutput47);
        requestBuilder41.setheaders((java.util.List<retrofit.client.Header>) headerList45);
        java.lang.String str50 = requestBuilder41.getapiUrl();
        retrofit.RequestBuilder requestBuilder52 = requestBuilder41.apiUrl("");
        java.util.List<retrofit.client.Header> headerList55 = null;
        retrofit.mime.TypedOutput typedOutput56 = null;
        retrofit.client.Request request57 = new retrofit.client.Request("", "", headerList55, typedOutput56);
        java.lang.String str58 = request57.url;
        java.util.List<retrofit.client.Header> headerList59 = request57.getHeaders();
        java.util.List<retrofit.client.Header> headerList60 = request57.getHeaders();
        requestBuilder41.headers = headerList60;
        retrofit.mime.TypedOutput typedOutput62 = null;
        retrofit.client.Request request63 = new retrofit.client.Request("", "", headerList60, typedOutput62);
        requestBuilder1.setheaders(headerList60);
        java.util.List<retrofit.client.Header> headerList65 = requestBuilder1.getheaders();
        requestBuilder1.setapiUrl("");
        java.util.List<retrofit.client.Header> headerList68 = requestBuilder1.headers;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNull(headerList22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(headerArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(requestBuilder52);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertNotNull(headerList59);
        org.junit.Assert.assertNotNull(headerList60);
        org.junit.Assert.assertNotNull(headerList65);
        org.junit.Assert.assertNotNull(headerList68);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        retrofit.RequestBuilder requestBuilder28 = requestBuilder1.apiUrl("");
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder1.headers;
        java.lang.String str30 = requestBuilder1.getapiUrl();
        java.lang.Object[] objArray31 = requestBuilder1.getargs();
        retrofit.RequestBuilder requestBuilder33 = requestBuilder1.apiUrl("");
        java.util.List<retrofit.client.Header> headerList34 = requestBuilder33.headers;
        retrofit.converter.Converter converter35 = requestBuilder33.getconverter();
        java.lang.String str36 = requestBuilder33.apiUrl;
        java.util.List<retrofit.client.Header> headerList37 = requestBuilder33.getheaders();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNull(converter35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(headerList37);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        java.lang.String str10 = request8.url;
        java.lang.String str11 = request8.url;
        java.lang.String str12 = request8.method;
        retrofit.mime.TypedOutput typedOutput13 = request8.getBody();
        java.lang.String str14 = request8.getMethod();
        retrofit.mime.TypedOutput typedOutput15 = request8.body;
        java.lang.String str16 = request8.url;
        java.util.List<retrofit.client.Header> headerList17 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "", headerList17, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.getHeaders();
        java.lang.String str21 = request19.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", headerList10, typedOutput11);
        java.lang.String str13 = request12.url;
        java.lang.String str14 = request12.getUrl();
        java.util.List<retrofit.client.Header> headerList15 = request12.getHeaders();
        java.lang.String str16 = request12.url;
        java.lang.Class<?> wildcardClass17 = request12.getClass();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = requestBuilder1.converter;
        java.lang.String str7 = requestBuilder1.apiUrl;
        java.lang.String str8 = requestBuilder1.getapiUrl();
        requestBuilder1.apiUrl = "";
        retrofit.RequestBuilder requestBuilder12 = requestBuilder1.apiUrl("");
        java.util.List<retrofit.client.Header> headerList13 = requestBuilder1.headers;
        java.lang.Object[] objArray14 = requestBuilder1.getargs();
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNull(headerList13);
        org.junit.Assert.assertNull(objArray14);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.url;
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList10 = request4.headers;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNotNull(headerList10);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        requestBuilder1.apiUrl = "";
        retrofit.RequestBuilder requestBuilder30 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        java.util.List<retrofit.client.Header> headerList35 = null;
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", headerList35, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.getBody();
        retrofit.mime.TypedOutput typedOutput39 = request37.getBody();
        java.util.List<retrofit.client.Header> headerList40 = request37.headers;
        requestBuilder32.setheaders(headerList40);
        retrofit.RequestBuilder requestBuilder42 = requestBuilder1.headers(headerList40);
        java.lang.Object[] objArray43 = requestBuilder1.getargs();
        java.lang.Object[] objArray44 = requestBuilder1.getargs();
        java.util.List<retrofit.client.Header> headerList47 = null;
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "", headerList47, typedOutput48);
        retrofit.mime.TypedOutput typedOutput50 = request49.getBody();
        java.util.List<retrofit.client.Header> headerList51 = request49.headers;
        java.util.List<retrofit.client.Header> headerList52 = request49.headers;
        requestBuilder1.headers = headerList52;
        requestBuilder1.apiUrl = "";
        java.util.List<retrofit.client.Header> headerList56 = requestBuilder1.getheaders();
        requestBuilder1.setapiUrl("hi!");
        retrofit.RequestBuilder requestBuilder60 = requestBuilder1.apiUrl("");
        java.lang.Object[] objArray61 = requestBuilder60.getargs();
        retrofit.RequestBuilder requestBuilder63 = requestBuilder60.apiUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str64 = requestBuilder60.buildRelativeUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNull(typedOutput39);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNull(typedOutput50);
        org.junit.Assert.assertNotNull(headerList51);
        org.junit.Assert.assertNotNull(headerList52);
        org.junit.Assert.assertNotNull(headerList56);
        org.junit.Assert.assertNotNull(requestBuilder60);
        org.junit.Assert.assertNotNull(objArray61);
        org.junit.Assert.assertNotNull(requestBuilder63);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.body;
        java.util.List<retrofit.client.Header> headerList6 = request4.headers;
        java.lang.String str7 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.converter.Converter converter4 = requestBuilder3.getconverter();
        retrofit.converter.Converter converter5 = null;
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        requestBuilder6.setheaders((java.util.List<retrofit.client.Header>) headerList10);
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        retrofit.converter.Converter converter20 = requestBuilder19.getconverter();
        java.util.List<retrofit.client.Header> headerList21 = requestBuilder19.headers;
        requestBuilder19.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList26 = null;
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", headerList26, typedOutput27);
        java.lang.String str29 = request28.getUrl();
        java.lang.Object[] objArray30 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder19, request28 };
        requestBuilder6.setargs(objArray30);
        java.lang.Object[] objArray32 = requestBuilder6.getargs();
        retrofit.RequestBuilder requestBuilder33 = requestBuilder3.args(objArray32);
        retrofit.converter.Converter converter34 = requestBuilder3.getconverter();
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.getBody();
        java.util.List<retrofit.client.Header> headerList41 = request39.headers;
        requestBuilder3.setheaders(headerList41);
        java.lang.Object[] objArray43 = requestBuilder3.getargs();
        java.lang.String str44 = requestBuilder3.getapiUrl();
        retrofit.converter.Converter converter47 = null;
        retrofit.RequestBuilder requestBuilder48 = new retrofit.RequestBuilder(converter47);
        retrofit.client.Header[] headerArray51 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList52 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList52, headerArray51);
        retrofit.mime.TypedOutput typedOutput54 = null;
        retrofit.client.Request request55 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList52, typedOutput54);
        requestBuilder48.setheaders((java.util.List<retrofit.client.Header>) headerList52);
        java.lang.String str57 = requestBuilder48.getapiUrl();
        java.util.List<retrofit.client.Header> headerList58 = requestBuilder48.getheaders();
        java.util.List<retrofit.client.Header> headerList59 = requestBuilder48.headers;
        java.util.List<retrofit.client.Header> headerList60 = requestBuilder48.getheaders();
        retrofit.mime.TypedOutput typedOutput61 = null;
        retrofit.client.Request request62 = new retrofit.client.Request("hi!", "hi!", headerList60, typedOutput61);
        requestBuilder3.headers = headerList60;
        retrofit.mime.TypedOutput typedOutput64 = null;
        retrofit.client.Request request65 = new retrofit.client.Request("", "", headerList60, typedOutput64);
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(headerList21);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertNull(converter34);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNotNull(headerList41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(headerArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(headerList58);
        org.junit.Assert.assertNotNull(headerList59);
        org.junit.Assert.assertNotNull(headerList60);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        requestBuilder3.apiUrl = "";
        retrofit.RequestBuilder requestBuilder32 = requestBuilder3.apiUrl("hi!");
        retrofit.converter.Converter converter33 = null;
        retrofit.RequestBuilder requestBuilder34 = new retrofit.RequestBuilder(converter33);
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.getBody();
        retrofit.mime.TypedOutput typedOutput41 = request39.getBody();
        java.util.List<retrofit.client.Header> headerList42 = request39.headers;
        requestBuilder34.setheaders(headerList42);
        retrofit.RequestBuilder requestBuilder44 = requestBuilder3.headers(headerList42);
        java.lang.Object[] objArray45 = requestBuilder3.getargs();
        retrofit.RequestBuilder requestBuilder47 = requestBuilder3.apiUrl("hi!");
        retrofit.client.Header[] headerArray50 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList51 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList51, headerArray50);
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList51, typedOutput53);
        java.util.List<retrofit.client.Header> headerList55 = request54.getHeaders();
        requestBuilder47.setheaders(headerList55);
        java.lang.String str57 = requestBuilder47.apiUrl;
        java.util.List<retrofit.client.Header> headerList58 = requestBuilder47.headers;
        retrofit.mime.TypedOutput typedOutput59 = null;
        retrofit.client.Request request60 = new retrofit.client.Request("hi!", "hi!", headerList58, typedOutput59);
        retrofit.mime.TypedOutput typedOutput61 = request60.getBody();
        retrofit.mime.TypedOutput typedOutput62 = request60.body;
        java.lang.String str63 = request60.getUrl();
        retrofit.mime.TypedOutput typedOutput64 = request60.body;
        java.util.List<retrofit.client.Header> headerList65 = request60.getHeaders();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNull(typedOutput41);
        org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(requestBuilder47);
        org.junit.Assert.assertNotNull(headerArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(headerList55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertNotNull(headerList58);
        org.junit.Assert.assertNull(typedOutput61);
        org.junit.Assert.assertNull(typedOutput62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNull(typedOutput64);
        org.junit.Assert.assertNotNull(headerList65);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", headerList4, typedOutput5);
        java.lang.String str7 = request6.url;
        java.lang.String str8 = request6.method;
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "hi!", headerList9, typedOutput10);
        java.lang.String str12 = request11.getUrl();
        java.util.List<retrofit.client.Header> headerList13 = request11.getHeaders();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        requestBuilder3.apiUrl = "";
        retrofit.RequestBuilder requestBuilder32 = requestBuilder3.apiUrl("hi!");
        retrofit.converter.Converter converter33 = null;
        retrofit.RequestBuilder requestBuilder34 = new retrofit.RequestBuilder(converter33);
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.getBody();
        retrofit.mime.TypedOutput typedOutput41 = request39.getBody();
        java.util.List<retrofit.client.Header> headerList42 = request39.headers;
        requestBuilder34.setheaders(headerList42);
        retrofit.RequestBuilder requestBuilder44 = requestBuilder3.headers(headerList42);
        java.lang.Object[] objArray45 = requestBuilder3.getargs();
        retrofit.RequestBuilder requestBuilder47 = requestBuilder3.apiUrl("hi!");
        retrofit.converter.Converter converter48 = null;
        retrofit.RequestBuilder requestBuilder49 = new retrofit.RequestBuilder(converter48);
        retrofit.client.Header[] headerArray52 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList53 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList53, headerArray52);
        retrofit.mime.TypedOutput typedOutput55 = null;
        retrofit.client.Request request56 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList53, typedOutput55);
        requestBuilder49.setheaders((java.util.List<retrofit.client.Header>) headerList53);
        retrofit.converter.Converter converter61 = null;
        retrofit.RequestBuilder requestBuilder62 = new retrofit.RequestBuilder(converter61);
        retrofit.converter.Converter converter63 = requestBuilder62.getconverter();
        java.util.List<retrofit.client.Header> headerList64 = requestBuilder62.headers;
        requestBuilder62.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList69 = null;
        retrofit.mime.TypedOutput typedOutput70 = null;
        retrofit.client.Request request71 = new retrofit.client.Request("", "", headerList69, typedOutput70);
        java.lang.String str72 = request71.getUrl();
        java.lang.Object[] objArray73 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder62, request71 };
        requestBuilder49.setargs(objArray73);
        retrofit.RequestBuilder requestBuilder76 = requestBuilder49.apiUrl("");
        java.util.List<retrofit.client.Header> headerList77 = requestBuilder49.headers;
        requestBuilder3.headers = headerList77;
        retrofit.mime.TypedOutput typedOutput79 = null;
        retrofit.client.Request request80 = new retrofit.client.Request("", "hi!", headerList77, typedOutput79);
        java.util.List<retrofit.client.Header> headerList81 = request80.headers;
        java.util.List<retrofit.client.Header> headerList82 = request80.getHeaders();
        retrofit.mime.TypedOutput typedOutput83 = request80.getBody();
        java.lang.String str84 = request80.method;
        java.util.List<retrofit.client.Header> headerList85 = request80.headers;
        java.lang.String str86 = request80.method;
        java.util.List<retrofit.client.Header> headerList87 = request80.getHeaders();
        java.lang.String str88 = request80.getMethod();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNull(typedOutput41);
        org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(requestBuilder47);
        org.junit.Assert.assertNotNull(headerArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(converter63);
        org.junit.Assert.assertNull(headerList64);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(requestBuilder76);
        org.junit.Assert.assertNotNull(headerList77);
        org.junit.Assert.assertNotNull(headerList81);
        org.junit.Assert.assertNotNull(headerList82);
        org.junit.Assert.assertNull(typedOutput83);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(headerList85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(headerList87);
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.lang.Object[] objArray4 = requestBuilder3.args;
        retrofit.converter.Converter converter5 = null;
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        retrofit.converter.Converter converter7 = requestBuilder6.getconverter();
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder6.headers;
        requestBuilder6.setapiUrl("hi!");
        retrofit.converter.Converter converter11 = requestBuilder6.converter;
        retrofit.RequestBuilder requestBuilder13 = requestBuilder6.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder15 = requestBuilder13.apiUrl("hi!");
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        requestBuilder17.setheaders((java.util.List<retrofit.client.Header>) headerList21);
        java.util.List<retrofit.client.Header> headerList26 = requestBuilder17.getheaders();
        java.lang.String str27 = requestBuilder17.getapiUrl();
        retrofit.converter.Converter converter28 = null;
        retrofit.RequestBuilder requestBuilder29 = new retrofit.RequestBuilder(converter28);
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
        requestBuilder29.setheaders((java.util.List<retrofit.client.Header>) headerList33);
        retrofit.converter.Converter converter41 = null;
        retrofit.RequestBuilder requestBuilder42 = new retrofit.RequestBuilder(converter41);
        retrofit.converter.Converter converter43 = requestBuilder42.getconverter();
        java.util.List<retrofit.client.Header> headerList44 = requestBuilder42.headers;
        requestBuilder42.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList49 = null;
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("", "", headerList49, typedOutput50);
        java.lang.String str52 = request51.getUrl();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder42, request51 };
        requestBuilder29.setargs(objArray53);
        requestBuilder29.apiUrl = "";
        retrofit.RequestBuilder requestBuilder58 = requestBuilder29.apiUrl("hi!");
        retrofit.converter.Converter converter59 = null;
        retrofit.RequestBuilder requestBuilder60 = new retrofit.RequestBuilder(converter59);
        java.util.List<retrofit.client.Header> headerList63 = null;
        retrofit.mime.TypedOutput typedOutput64 = null;
        retrofit.client.Request request65 = new retrofit.client.Request("", "", headerList63, typedOutput64);
        retrofit.mime.TypedOutput typedOutput66 = request65.getBody();
        retrofit.mime.TypedOutput typedOutput67 = request65.getBody();
        java.util.List<retrofit.client.Header> headerList68 = request65.headers;
        requestBuilder60.setheaders(headerList68);
        retrofit.RequestBuilder requestBuilder70 = requestBuilder29.headers(headerList68);
        requestBuilder17.headers = headerList68;
        java.util.List<retrofit.client.Header> headerList74 = null;
        retrofit.mime.TypedOutput typedOutput75 = null;
        retrofit.client.Request request76 = new retrofit.client.Request("", "", headerList74, typedOutput75);
        java.lang.String str77 = request76.url;
        java.util.List<retrofit.client.Header> headerList78 = request76.getHeaders();
        requestBuilder17.headers = headerList78;
        retrofit.RequestBuilder requestBuilder80 = requestBuilder13.headers(headerList78);
        requestBuilder3.headers = headerList78;
        retrofit.mime.TypedOutput typedOutput82 = null;
        retrofit.client.Request request83 = new retrofit.client.Request("", "", headerList78, typedOutput82);
        java.lang.String str84 = request83.getUrl();
        java.lang.String str85 = request83.method;
        java.lang.String str86 = request83.getUrl();
        java.lang.String str87 = request83.getMethod();
        java.util.List<retrofit.client.Header> headerList88 = request83.headers;
        retrofit.mime.TypedOutput typedOutput89 = request83.body;
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(headerList8);
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(converter43);
        org.junit.Assert.assertNull(headerList44);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(requestBuilder58);
        org.junit.Assert.assertNull(typedOutput66);
        org.junit.Assert.assertNull(typedOutput67);
        org.junit.Assert.assertNotNull(headerList68);
        org.junit.Assert.assertNotNull(requestBuilder70);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(headerList78);
        org.junit.Assert.assertNotNull(requestBuilder80);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNotNull(headerList88);
        org.junit.Assert.assertNull(typedOutput89);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList7 = request4.headers;
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.url;
        java.lang.String str10 = request4.url;
        java.lang.String str11 = request4.getMethod();
        java.lang.String str12 = request4.url;
        java.lang.String str13 = request4.getMethod();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        java.lang.String str14 = requestBuilder5.getapiUrl();
        retrofit.RequestBuilder requestBuilder16 = requestBuilder5.apiUrl("");
        java.util.List<retrofit.client.Header> headerList19 = null;
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList19, typedOutput20);
        java.lang.String str22 = request21.url;
        java.util.List<retrofit.client.Header> headerList23 = request21.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request21.getHeaders();
        requestBuilder5.headers = headerList24;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList24, typedOutput26);
        java.lang.String str28 = request27.getMethod();
        retrofit.mime.TypedOutput typedOutput29 = request27.getBody();
        java.util.List<retrofit.client.Header> headerList30 = request27.getHeaders();
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "hi!", headerList30, typedOutput31);
        java.util.List<retrofit.client.Header> headerList33 = request32.getHeaders();
        java.lang.String str34 = request32.url;
        retrofit.mime.TypedOutput typedOutput35 = request32.body;
        retrofit.mime.TypedOutput typedOutput36 = request32.body;
        retrofit.mime.TypedOutput typedOutput37 = request32.body;
        retrofit.mime.TypedOutput typedOutput38 = request32.body;
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(typedOutput29);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNull(typedOutput35);
        org.junit.Assert.assertNull(typedOutput36);
        org.junit.Assert.assertNull(typedOutput37);
        org.junit.Assert.assertNull(typedOutput38);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.url;
        java.lang.String str6 = request4.url;
        java.lang.String str7 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request4.body;
        java.util.List<retrofit.client.Header> headerList9 = request4.headers;
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        java.lang.String str11 = request4.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        requestBuilder3.apiUrl = "";
        retrofit.RequestBuilder requestBuilder32 = requestBuilder3.apiUrl("hi!");
        retrofit.converter.Converter converter33 = null;
        retrofit.RequestBuilder requestBuilder34 = new retrofit.RequestBuilder(converter33);
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.getBody();
        retrofit.mime.TypedOutput typedOutput41 = request39.getBody();
        java.util.List<retrofit.client.Header> headerList42 = request39.headers;
        requestBuilder34.setheaders(headerList42);
        retrofit.RequestBuilder requestBuilder44 = requestBuilder3.headers(headerList42);
        java.lang.Object[] objArray45 = requestBuilder3.getargs();
        retrofit.RequestBuilder requestBuilder47 = requestBuilder3.apiUrl("hi!");
        retrofit.converter.Converter converter48 = null;
        retrofit.RequestBuilder requestBuilder49 = new retrofit.RequestBuilder(converter48);
        retrofit.client.Header[] headerArray52 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList53 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList53, headerArray52);
        retrofit.mime.TypedOutput typedOutput55 = null;
        retrofit.client.Request request56 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList53, typedOutput55);
        requestBuilder49.setheaders((java.util.List<retrofit.client.Header>) headerList53);
        retrofit.converter.Converter converter61 = null;
        retrofit.RequestBuilder requestBuilder62 = new retrofit.RequestBuilder(converter61);
        retrofit.converter.Converter converter63 = requestBuilder62.getconverter();
        java.util.List<retrofit.client.Header> headerList64 = requestBuilder62.headers;
        requestBuilder62.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList69 = null;
        retrofit.mime.TypedOutput typedOutput70 = null;
        retrofit.client.Request request71 = new retrofit.client.Request("", "", headerList69, typedOutput70);
        java.lang.String str72 = request71.getUrl();
        java.lang.Object[] objArray73 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder62, request71 };
        requestBuilder49.setargs(objArray73);
        retrofit.RequestBuilder requestBuilder76 = requestBuilder49.apiUrl("");
        java.util.List<retrofit.client.Header> headerList77 = requestBuilder49.headers;
        requestBuilder3.headers = headerList77;
        retrofit.mime.TypedOutput typedOutput79 = null;
        retrofit.client.Request request80 = new retrofit.client.Request("", "hi!", headerList77, typedOutput79);
        java.util.List<retrofit.client.Header> headerList81 = request80.headers;
        java.lang.String str82 = request80.getMethod();
        java.util.List<retrofit.client.Header> headerList83 = request80.headers;
        java.util.List<retrofit.client.Header> headerList84 = request80.getHeaders();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNull(typedOutput41);
        org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(requestBuilder47);
        org.junit.Assert.assertNotNull(headerArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(converter63);
        org.junit.Assert.assertNull(headerList64);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(requestBuilder76);
        org.junit.Assert.assertNotNull(headerList77);
        org.junit.Assert.assertNotNull(headerList81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(headerList83);
        org.junit.Assert.assertNotNull(headerList84);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        retrofit.RequestBuilder requestBuilder30 = requestBuilder3.apiUrl("");
        java.util.List<retrofit.client.Header> headerList31 = requestBuilder3.headers;
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "hi!", headerList31, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = request33.body;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNull(typedOutput34);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        requestBuilder3.apiUrl = "";
        retrofit.RequestBuilder requestBuilder32 = requestBuilder3.apiUrl("hi!");
        retrofit.converter.Converter converter33 = null;
        retrofit.RequestBuilder requestBuilder34 = new retrofit.RequestBuilder(converter33);
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.getBody();
        retrofit.mime.TypedOutput typedOutput41 = request39.getBody();
        java.util.List<retrofit.client.Header> headerList42 = request39.headers;
        requestBuilder34.setheaders(headerList42);
        retrofit.RequestBuilder requestBuilder44 = requestBuilder3.headers(headerList42);
        java.lang.Object[] objArray45 = requestBuilder3.getargs();
        java.util.List<retrofit.client.Header> headerList46 = requestBuilder3.headers;
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("hi!", "hi!", headerList46, typedOutput47);
        retrofit.mime.TypedOutput typedOutput49 = request48.body;
        retrofit.mime.TypedOutput typedOutput50 = request48.getBody();
        java.lang.String str51 = request48.url;
        java.util.List<retrofit.client.Header> headerList52 = request48.headers;
        java.util.List<retrofit.client.Header> headerList53 = request48.getHeaders();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNull(typedOutput41);
        org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(headerList46);
        org.junit.Assert.assertNull(typedOutput49);
        org.junit.Assert.assertNull(typedOutput50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(headerList52);
        org.junit.Assert.assertNotNull(headerList53);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.converter.Converter converter19 = requestBuilder18.getconverter();
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder18.headers;
        requestBuilder18.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList25 = null;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder18, request27 };
        requestBuilder5.setargs(objArray29);
        retrofit.RequestBuilder requestBuilder32 = requestBuilder5.apiUrl("");
        java.util.List<retrofit.client.Header> headerList33 = requestBuilder5.headers;
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "hi!", headerList33, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "hi!", headerList33, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.body;
        retrofit.mime.TypedOutput typedOutput39 = request37.getBody();
        java.lang.String str40 = request37.url;
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(headerList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNull(typedOutput39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.converter.Converter converter18 = requestBuilder17.getconverter();
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder17.headers;
        requestBuilder17.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder17, request26 };
        requestBuilder4.setargs(objArray28);
        java.lang.Object[] objArray30 = requestBuilder4.getargs();
        retrofit.RequestBuilder requestBuilder31 = requestBuilder1.args(objArray30);
        requestBuilder31.setapiUrl("");
        retrofit.converter.Converter converter34 = requestBuilder31.getconverter();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.mime.TypedOutput typedOutput35 = requestBuilder31.buildBody();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(converter34);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.util.List<retrofit.client.Header> headerList5 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList6 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(headerList7);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        requestBuilder1.apiUrl = "";
        retrofit.RequestBuilder requestBuilder30 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        retrofit.client.Header[] headerArray35 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList36 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList36, headerArray35);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList36, typedOutput38);
        requestBuilder32.setheaders((java.util.List<retrofit.client.Header>) headerList36);
        retrofit.converter.Converter converter44 = null;
        retrofit.RequestBuilder requestBuilder45 = new retrofit.RequestBuilder(converter44);
        retrofit.converter.Converter converter46 = requestBuilder45.getconverter();
        java.util.List<retrofit.client.Header> headerList47 = requestBuilder45.headers;
        requestBuilder45.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList52 = null;
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("", "", headerList52, typedOutput53);
        java.lang.String str55 = request54.getUrl();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder45, request54 };
        requestBuilder32.setargs(objArray56);
        retrofit.RequestBuilder requestBuilder59 = requestBuilder32.apiUrl("");
        java.lang.Object[] objArray60 = requestBuilder59.getargs();
        requestBuilder30.args = objArray60;
        java.lang.String str62 = requestBuilder30.apiUrl;
        java.lang.Object[] objArray63 = requestBuilder30.getargs();
        java.lang.Object[] objArray64 = requestBuilder30.args;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(headerArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(converter46);
        org.junit.Assert.assertNull(headerList47);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(requestBuilder59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray64);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        java.lang.String str6 = requestBuilder1.apiUrl;
        java.util.List<retrofit.client.Header> headerList7 = requestBuilder1.headers;
        java.lang.String str8 = requestBuilder1.getapiUrl();
        java.lang.String str9 = requestBuilder1.apiUrl;
        retrofit.RequestBuilder requestBuilder11 = requestBuilder1.apiUrl("hi!");
        java.lang.Object[] objArray12 = requestBuilder11.getargs();
        requestBuilder11.apiUrl = "hi!";
        retrofit.converter.Converter converter15 = requestBuilder11.converter;
        java.lang.Object[] objArray16 = requestBuilder11.args;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNull(objArray12);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(objArray16);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.converter.Converter converter19 = requestBuilder18.getconverter();
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder18.headers;
        requestBuilder18.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList25 = null;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder18, request27 };
        requestBuilder5.setargs(objArray29);
        retrofit.RequestBuilder requestBuilder32 = requestBuilder5.apiUrl("");
        java.util.List<retrofit.client.Header> headerList33 = requestBuilder5.headers;
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "hi!", headerList33, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "hi!", headerList33, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.getBody();
        java.util.List<retrofit.client.Header> headerList39 = request37.getHeaders();
        retrofit.mime.TypedOutput typedOutput40 = request37.body;
        java.lang.String str41 = request37.url;
        java.lang.String str42 = request37.method;
        retrofit.mime.TypedOutput typedOutput43 = request37.getBody();
        java.lang.String str44 = request37.method;
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(headerList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNull(typedOutput43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        java.lang.Object[] objArray29 = requestBuilder3.getargs();
        java.lang.String str30 = requestBuilder3.apiUrl;
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        java.util.List<retrofit.client.Header> headerList35 = null;
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", headerList35, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.getBody();
        retrofit.mime.TypedOutput typedOutput39 = request37.getBody();
        java.util.List<retrofit.client.Header> headerList40 = request37.headers;
        requestBuilder32.setheaders(headerList40);
        retrofit.converter.Converter converter42 = null;
        retrofit.RequestBuilder requestBuilder43 = new retrofit.RequestBuilder(converter42);
        retrofit.converter.Converter converter44 = requestBuilder43.getconverter();
        java.util.List<retrofit.client.Header> headerList45 = requestBuilder43.headers;
        retrofit.converter.Converter converter49 = null;
        retrofit.RequestBuilder requestBuilder50 = new retrofit.RequestBuilder(converter49);
        retrofit.client.Header[] headerArray53 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList54 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList54, headerArray53);
        retrofit.mime.TypedOutput typedOutput56 = null;
        retrofit.client.Request request57 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList54, typedOutput56);
        requestBuilder50.setheaders((java.util.List<retrofit.client.Header>) headerList54);
        java.util.List<retrofit.client.Header> headerList61 = null;
        retrofit.mime.TypedOutput typedOutput62 = null;
        retrofit.client.Request request63 = new retrofit.client.Request("", "", headerList61, typedOutput62);
        java.lang.String str64 = request63.getUrl();
        retrofit.mime.TypedOutput typedOutput65 = request63.body;
        java.lang.Object[] objArray66 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder50, typedOutput65 };
        requestBuilder43.setargs(objArray66);
        retrofit.RequestBuilder requestBuilder68 = requestBuilder32.args(objArray66);
        java.util.List<retrofit.client.Header> headerList69 = requestBuilder68.headers;
        requestBuilder3.headers = headerList69;
        retrofit.mime.TypedOutput typedOutput71 = null;
        retrofit.client.Request request72 = new retrofit.client.Request("hi!", "", headerList69, typedOutput71);
        java.lang.String str73 = request72.url;
        java.util.List<retrofit.client.Header> headerList74 = request72.getHeaders();
        java.util.List<retrofit.client.Header> headerList75 = request72.getHeaders();
        java.lang.String str76 = request72.getMethod();
        java.lang.Class<?> wildcardClass77 = request72.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNull(typedOutput39);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNull(converter44);
        org.junit.Assert.assertNull(headerList45);
        org.junit.Assert.assertNotNull(headerArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNull(typedOutput65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(requestBuilder68);
        org.junit.Assert.assertNotNull(headerList69);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(headerList74);
        org.junit.Assert.assertNotNull(headerList75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass77);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.url;
        java.util.List<retrofit.client.Header> headerList6 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request4.headers;
        java.util.List<retrofit.client.Header> headerList9 = request4.headers;
        java.lang.String str10 = request4.method;
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput12 = request4.body;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.String str2 = requestBuilder1.apiUrl;
        java.lang.Object[] objArray3 = requestBuilder1.args;
        retrofit.RequestBuilder requestBuilder5 = requestBuilder1.apiUrl("");
        requestBuilder1.setapiUrl("");
        retrofit.converter.Converter converter8 = null;
        retrofit.RequestBuilder requestBuilder9 = new retrofit.RequestBuilder(converter8);
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        requestBuilder9.setheaders((java.util.List<retrofit.client.Header>) headerList13);
        retrofit.converter.Converter converter21 = null;
        retrofit.RequestBuilder requestBuilder22 = new retrofit.RequestBuilder(converter21);
        retrofit.converter.Converter converter23 = requestBuilder22.getconverter();
        java.util.List<retrofit.client.Header> headerList24 = requestBuilder22.headers;
        requestBuilder22.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList29 = null;
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", headerList29, typedOutput30);
        java.lang.String str32 = request31.getUrl();
        java.lang.Object[] objArray33 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder22, request31 };
        requestBuilder9.setargs(objArray33);
        requestBuilder9.apiUrl = "";
        retrofit.RequestBuilder requestBuilder38 = requestBuilder9.apiUrl("hi!");
        retrofit.converter.Converter converter39 = null;
        retrofit.RequestBuilder requestBuilder40 = new retrofit.RequestBuilder(converter39);
        java.util.List<retrofit.client.Header> headerList43 = null;
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("", "", headerList43, typedOutput44);
        retrofit.mime.TypedOutput typedOutput46 = request45.getBody();
        retrofit.mime.TypedOutput typedOutput47 = request45.getBody();
        java.util.List<retrofit.client.Header> headerList48 = request45.headers;
        requestBuilder40.setheaders(headerList48);
        retrofit.RequestBuilder requestBuilder50 = requestBuilder9.headers(headerList48);
        java.lang.String str51 = requestBuilder9.getapiUrl();
        retrofit.converter.Converter converter54 = null;
        retrofit.RequestBuilder requestBuilder55 = new retrofit.RequestBuilder(converter54);
        retrofit.client.Header[] headerArray58 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList59 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList59, headerArray58);
        retrofit.mime.TypedOutput typedOutput61 = null;
        retrofit.client.Request request62 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList59, typedOutput61);
        requestBuilder55.setheaders((java.util.List<retrofit.client.Header>) headerList59);
        retrofit.converter.Converter converter67 = null;
        retrofit.RequestBuilder requestBuilder68 = new retrofit.RequestBuilder(converter67);
        retrofit.converter.Converter converter69 = requestBuilder68.getconverter();
        java.util.List<retrofit.client.Header> headerList70 = requestBuilder68.headers;
        requestBuilder68.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList75 = null;
        retrofit.mime.TypedOutput typedOutput76 = null;
        retrofit.client.Request request77 = new retrofit.client.Request("", "", headerList75, typedOutput76);
        java.lang.String str78 = request77.getUrl();
        java.lang.Object[] objArray79 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder68, request77 };
        requestBuilder55.setargs(objArray79);
        retrofit.RequestBuilder requestBuilder82 = requestBuilder55.apiUrl("");
        java.util.List<retrofit.client.Header> headerList83 = requestBuilder55.headers;
        retrofit.mime.TypedOutput typedOutput84 = null;
        retrofit.client.Request request85 = new retrofit.client.Request("hi!", "hi!", headerList83, typedOutput84);
        java.lang.String str86 = request85.url;
        java.util.List<retrofit.client.Header> headerList87 = request85.headers;
        java.util.List<retrofit.client.Header> headerList88 = request85.headers;
        requestBuilder9.headers = headerList88;
        java.lang.Object[] objArray90 = requestBuilder9.getargs();
        retrofit.RequestBuilder requestBuilder91 = requestBuilder1.args(objArray90);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(objArray3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(converter23);
        org.junit.Assert.assertNull(headerList24);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNull(typedOutput46);
        org.junit.Assert.assertNull(typedOutput47);
        org.junit.Assert.assertNotNull(headerList48);
        org.junit.Assert.assertNotNull(requestBuilder50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(headerArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNull(converter69);
        org.junit.Assert.assertNull(headerList70);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(requestBuilder82);
        org.junit.Assert.assertNotNull(headerList83);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertNotNull(headerList87);
        org.junit.Assert.assertNotNull(headerList88);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(requestBuilder91);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.url;
        java.util.List<retrofit.client.Header> headerList6 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.lang.String str9 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        java.lang.String str11 = request4.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        requestBuilder3.apiUrl = "";
        retrofit.RequestBuilder requestBuilder32 = requestBuilder3.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder34 = requestBuilder3.apiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList35 = requestBuilder3.getheaders();
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "hi!", headerList35, typedOutput36);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(headerList35);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        requestBuilder1.setheaders(headerList9);
        retrofit.converter.Converter converter11 = null;
        retrofit.RequestBuilder requestBuilder12 = new retrofit.RequestBuilder(converter11);
        java.lang.String str13 = requestBuilder12.apiUrl;
        retrofit.converter.Converter converter14 = null;
        retrofit.RequestBuilder requestBuilder15 = new retrofit.RequestBuilder(converter14);
        retrofit.converter.Converter converter16 = requestBuilder15.getconverter();
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        requestBuilder18.setheaders((java.util.List<retrofit.client.Header>) headerList22);
        retrofit.converter.Converter converter30 = null;
        retrofit.RequestBuilder requestBuilder31 = new retrofit.RequestBuilder(converter30);
        retrofit.converter.Converter converter32 = requestBuilder31.getconverter();
        java.util.List<retrofit.client.Header> headerList33 = requestBuilder31.headers;
        requestBuilder31.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList38 = null;
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "", headerList38, typedOutput39);
        java.lang.String str41 = request40.getUrl();
        java.lang.Object[] objArray42 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder31, request40 };
        requestBuilder18.setargs(objArray42);
        java.lang.Object[] objArray44 = requestBuilder18.getargs();
        retrofit.RequestBuilder requestBuilder45 = requestBuilder15.args(objArray44);
        requestBuilder12.setargs(objArray44);
        retrofit.converter.Converter converter47 = null;
        retrofit.RequestBuilder requestBuilder48 = new retrofit.RequestBuilder(converter47);
        java.lang.String str49 = requestBuilder48.apiUrl;
        retrofit.converter.Converter converter50 = null;
        retrofit.RequestBuilder requestBuilder51 = new retrofit.RequestBuilder(converter50);
        retrofit.converter.Converter converter52 = requestBuilder51.getconverter();
        retrofit.converter.Converter converter53 = null;
        retrofit.RequestBuilder requestBuilder54 = new retrofit.RequestBuilder(converter53);
        retrofit.client.Header[] headerArray57 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList58 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList58, headerArray57);
        retrofit.mime.TypedOutput typedOutput60 = null;
        retrofit.client.Request request61 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList58, typedOutput60);
        requestBuilder54.setheaders((java.util.List<retrofit.client.Header>) headerList58);
        retrofit.converter.Converter converter66 = null;
        retrofit.RequestBuilder requestBuilder67 = new retrofit.RequestBuilder(converter66);
        retrofit.converter.Converter converter68 = requestBuilder67.getconverter();
        java.util.List<retrofit.client.Header> headerList69 = requestBuilder67.headers;
        requestBuilder67.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList74 = null;
        retrofit.mime.TypedOutput typedOutput75 = null;
        retrofit.client.Request request76 = new retrofit.client.Request("", "", headerList74, typedOutput75);
        java.lang.String str77 = request76.getUrl();
        java.lang.Object[] objArray78 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder67, request76 };
        requestBuilder54.setargs(objArray78);
        java.lang.Object[] objArray80 = requestBuilder54.getargs();
        retrofit.RequestBuilder requestBuilder81 = requestBuilder51.args(objArray80);
        requestBuilder48.setargs(objArray80);
        retrofit.RequestBuilder requestBuilder83 = requestBuilder12.args(objArray80);
        retrofit.RequestBuilder requestBuilder84 = requestBuilder1.args(objArray80);
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter87 = requestBuilder1.getconverter();
        java.lang.Object[] objArray88 = requestBuilder1.getargs();
        retrofit.converter.Converter converter89 = requestBuilder1.getconverter();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(converter32);
        org.junit.Assert.assertNull(headerList33);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(objArray42);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(requestBuilder45);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(converter52);
        org.junit.Assert.assertNotNull(headerArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNull(converter68);
        org.junit.Assert.assertNull(headerList69);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(requestBuilder81);
        org.junit.Assert.assertNotNull(requestBuilder83);
        org.junit.Assert.assertNotNull(requestBuilder84);
        org.junit.Assert.assertNull(converter87);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNull(converter89);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.getUrl();
        java.lang.String str9 = request4.getMethod();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.url;
        java.lang.String str6 = request4.url;
        java.lang.String str7 = request4.getMethod();
        java.lang.String str8 = request4.url;
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.String str10 = request4.getUrl();
        java.lang.String str11 = request4.getUrl();
        java.lang.String str12 = request4.url;
        java.util.List<retrofit.client.Header> headerList13 = request4.getHeaders();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        requestBuilder1.apiUrl = "";
        retrofit.RequestBuilder requestBuilder30 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        java.util.List<retrofit.client.Header> headerList35 = null;
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", headerList35, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.getBody();
        retrofit.mime.TypedOutput typedOutput39 = request37.getBody();
        java.util.List<retrofit.client.Header> headerList40 = request37.headers;
        requestBuilder32.setheaders(headerList40);
        retrofit.RequestBuilder requestBuilder42 = requestBuilder1.headers(headerList40);
        java.lang.Object[] objArray43 = requestBuilder1.getargs();
        java.util.List<retrofit.client.Header> headerList44 = requestBuilder1.headers;
        java.lang.String str45 = requestBuilder1.apiUrl;
        requestBuilder1.apiUrl = "hi!";
        retrofit.converter.Converter converter48 = requestBuilder1.getconverter();
        requestBuilder1.apiUrl = "hi!";
        retrofit.converter.Converter converter51 = null;
        retrofit.RequestBuilder requestBuilder52 = new retrofit.RequestBuilder(converter51);
        retrofit.client.Header[] headerArray55 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList56 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList56, headerArray55);
        retrofit.mime.TypedOutput typedOutput58 = null;
        retrofit.client.Request request59 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList56, typedOutput58);
        requestBuilder52.setheaders((java.util.List<retrofit.client.Header>) headerList56);
        retrofit.converter.Converter converter64 = null;
        retrofit.RequestBuilder requestBuilder65 = new retrofit.RequestBuilder(converter64);
        retrofit.converter.Converter converter66 = requestBuilder65.getconverter();
        java.util.List<retrofit.client.Header> headerList67 = requestBuilder65.headers;
        requestBuilder65.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList72 = null;
        retrofit.mime.TypedOutput typedOutput73 = null;
        retrofit.client.Request request74 = new retrofit.client.Request("", "", headerList72, typedOutput73);
        java.lang.String str75 = request74.getUrl();
        java.lang.Object[] objArray76 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder65, request74 };
        requestBuilder52.setargs(objArray76);
        java.lang.Object[] objArray78 = requestBuilder52.getargs();
        java.lang.Object[] objArray79 = requestBuilder52.getargs();
        retrofit.RequestBuilder requestBuilder80 = requestBuilder1.args(objArray79);
        java.lang.Object[] objArray81 = requestBuilder80.getargs();
        retrofit.RequestBuilder requestBuilder83 = requestBuilder80.apiUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            retrofit.mime.TypedOutput typedOutput84 = requestBuilder83.buildBody();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNull(typedOutput39);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNull(converter48);
        org.junit.Assert.assertNotNull(headerArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(converter66);
        org.junit.Assert.assertNull(headerList67);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(objArray76);
        org.junit.Assert.assertNotNull(objArray78);
        org.junit.Assert.assertNotNull(objArray79);
        org.junit.Assert.assertNotNull(requestBuilder80);
        org.junit.Assert.assertNotNull(objArray81);
        org.junit.Assert.assertNotNull(requestBuilder83);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", headerList10, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.headers;
        java.lang.String str14 = request12.url;
        java.lang.String str15 = request12.getMethod();
        retrofit.mime.TypedOutput typedOutput16 = request12.body;
        java.util.List<retrofit.client.Header> headerList17 = request12.headers;
        retrofit.mime.TypedOutput typedOutput18 = request12.getBody();
        java.lang.String str19 = request12.method;
        java.lang.String str20 = request12.getMethod();
        java.util.List<retrofit.client.Header> headerList21 = request12.headers;
        retrofit.mime.TypedOutput typedOutput22 = request12.body;
        retrofit.mime.TypedOutput typedOutput23 = request12.getBody();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertNull(typedOutput23);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.url;
        java.lang.String str9 = request4.url;
        retrofit.mime.TypedOutput typedOutput10 = request4.body;
        java.lang.String str11 = request4.method;
        java.lang.String str12 = request4.getMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        retrofit.RequestBuilder requestBuilder30 = requestBuilder3.apiUrl("");
        java.util.List<retrofit.client.Header> headerList31 = requestBuilder3.headers;
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "", headerList31, typedOutput32);
        java.lang.String str34 = request33.url;
        java.lang.String str35 = request33.method;
        java.lang.String str36 = request33.getMethod();
        java.util.List<retrofit.client.Header> headerList37 = request33.getHeaders();
        retrofit.mime.TypedOutput typedOutput38 = request33.body;
        java.util.List<retrofit.client.Header> headerList39 = request33.getHeaders();
        java.lang.Class<?> wildcardClass40 = request33.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNotNull(wildcardClass40);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        requestBuilder1.setheaders(headerList9);
        retrofit.converter.Converter converter11 = null;
        retrofit.RequestBuilder requestBuilder12 = new retrofit.RequestBuilder(converter11);
        retrofit.converter.Converter converter13 = requestBuilder12.getconverter();
        java.util.List<retrofit.client.Header> headerList14 = requestBuilder12.headers;
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        requestBuilder19.setheaders((java.util.List<retrofit.client.Header>) headerList23);
        java.util.List<retrofit.client.Header> headerList30 = null;
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", headerList30, typedOutput31);
        java.lang.String str33 = request32.getUrl();
        retrofit.mime.TypedOutput typedOutput34 = request32.body;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder19, typedOutput34 };
        requestBuilder12.setargs(objArray35);
        retrofit.RequestBuilder requestBuilder37 = requestBuilder1.args(objArray35);
        requestBuilder1.apiUrl = "hi!";
        retrofit.converter.Converter converter40 = requestBuilder1.converter;
        java.lang.Object[] objArray41 = requestBuilder1.args;
        java.util.List<retrofit.client.Header> headerList42 = requestBuilder1.headers;
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(headerList14);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(typedOutput34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNull(converter40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(headerList42);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        requestBuilder1.apiUrl = "";
        retrofit.RequestBuilder requestBuilder30 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        java.util.List<retrofit.client.Header> headerList35 = null;
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", headerList35, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.getBody();
        retrofit.mime.TypedOutput typedOutput39 = request37.getBody();
        java.util.List<retrofit.client.Header> headerList40 = request37.headers;
        requestBuilder32.setheaders(headerList40);
        retrofit.RequestBuilder requestBuilder42 = requestBuilder1.headers(headerList40);
        java.lang.Object[] objArray43 = requestBuilder1.getargs();
        java.lang.Object[] objArray44 = requestBuilder1.getargs();
        retrofit.converter.Converter converter45 = null;
        retrofit.RequestBuilder requestBuilder46 = new retrofit.RequestBuilder(converter45);
        retrofit.client.Header[] headerArray49 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList50 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList50, headerArray49);
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList50, typedOutput52);
        requestBuilder46.setheaders((java.util.List<retrofit.client.Header>) headerList50);
        retrofit.converter.Converter converter58 = null;
        retrofit.RequestBuilder requestBuilder59 = new retrofit.RequestBuilder(converter58);
        retrofit.converter.Converter converter60 = requestBuilder59.getconverter();
        java.util.List<retrofit.client.Header> headerList61 = requestBuilder59.headers;
        requestBuilder59.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList66 = null;
        retrofit.mime.TypedOutput typedOutput67 = null;
        retrofit.client.Request request68 = new retrofit.client.Request("", "", headerList66, typedOutput67);
        java.lang.String str69 = request68.getUrl();
        java.lang.Object[] objArray70 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder59, request68 };
        requestBuilder46.setargs(objArray70);
        requestBuilder46.apiUrl = "";
        retrofit.RequestBuilder requestBuilder75 = requestBuilder46.apiUrl("hi!");
        retrofit.converter.Converter converter76 = null;
        retrofit.RequestBuilder requestBuilder77 = new retrofit.RequestBuilder(converter76);
        java.util.List<retrofit.client.Header> headerList80 = null;
        retrofit.mime.TypedOutput typedOutput81 = null;
        retrofit.client.Request request82 = new retrofit.client.Request("", "", headerList80, typedOutput81);
        retrofit.mime.TypedOutput typedOutput83 = request82.getBody();
        retrofit.mime.TypedOutput typedOutput84 = request82.getBody();
        java.util.List<retrofit.client.Header> headerList85 = request82.headers;
        requestBuilder77.setheaders(headerList85);
        retrofit.RequestBuilder requestBuilder87 = requestBuilder46.headers(headerList85);
        retrofit.RequestBuilder requestBuilder88 = requestBuilder1.headers(headerList85);
        java.lang.Object[] objArray89 = null;
        retrofit.RequestBuilder requestBuilder90 = requestBuilder88.args(objArray89);
        java.lang.Object[] objArray91 = requestBuilder88.getargs();
        requestBuilder88.apiUrl = "";
        retrofit.RequestBuilder requestBuilder95 = requestBuilder88.apiUrl("");
        retrofit.RequestBuilder requestBuilder97 = requestBuilder88.apiUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request98 = requestBuilder97.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNull(typedOutput39);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNotNull(headerArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(converter60);
        org.junit.Assert.assertNull(headerList61);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(requestBuilder75);
        org.junit.Assert.assertNull(typedOutput83);
        org.junit.Assert.assertNull(typedOutput84);
        org.junit.Assert.assertNotNull(headerList85);
        org.junit.Assert.assertNotNull(requestBuilder87);
        org.junit.Assert.assertNotNull(requestBuilder88);
        org.junit.Assert.assertNotNull(requestBuilder90);
        org.junit.Assert.assertNull(objArray91);
        org.junit.Assert.assertNotNull(requestBuilder95);
        org.junit.Assert.assertNotNull(requestBuilder97);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.lang.Object[] objArray4 = requestBuilder3.args;
        retrofit.converter.Converter converter5 = null;
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        retrofit.converter.Converter converter7 = requestBuilder6.getconverter();
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder6.headers;
        requestBuilder6.setapiUrl("hi!");
        retrofit.converter.Converter converter11 = requestBuilder6.converter;
        retrofit.RequestBuilder requestBuilder13 = requestBuilder6.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder15 = requestBuilder13.apiUrl("hi!");
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        requestBuilder17.setheaders((java.util.List<retrofit.client.Header>) headerList21);
        java.util.List<retrofit.client.Header> headerList26 = requestBuilder17.getheaders();
        java.lang.String str27 = requestBuilder17.getapiUrl();
        retrofit.converter.Converter converter28 = null;
        retrofit.RequestBuilder requestBuilder29 = new retrofit.RequestBuilder(converter28);
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
        requestBuilder29.setheaders((java.util.List<retrofit.client.Header>) headerList33);
        retrofit.converter.Converter converter41 = null;
        retrofit.RequestBuilder requestBuilder42 = new retrofit.RequestBuilder(converter41);
        retrofit.converter.Converter converter43 = requestBuilder42.getconverter();
        java.util.List<retrofit.client.Header> headerList44 = requestBuilder42.headers;
        requestBuilder42.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList49 = null;
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("", "", headerList49, typedOutput50);
        java.lang.String str52 = request51.getUrl();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder42, request51 };
        requestBuilder29.setargs(objArray53);
        requestBuilder29.apiUrl = "";
        retrofit.RequestBuilder requestBuilder58 = requestBuilder29.apiUrl("hi!");
        retrofit.converter.Converter converter59 = null;
        retrofit.RequestBuilder requestBuilder60 = new retrofit.RequestBuilder(converter59);
        java.util.List<retrofit.client.Header> headerList63 = null;
        retrofit.mime.TypedOutput typedOutput64 = null;
        retrofit.client.Request request65 = new retrofit.client.Request("", "", headerList63, typedOutput64);
        retrofit.mime.TypedOutput typedOutput66 = request65.getBody();
        retrofit.mime.TypedOutput typedOutput67 = request65.getBody();
        java.util.List<retrofit.client.Header> headerList68 = request65.headers;
        requestBuilder60.setheaders(headerList68);
        retrofit.RequestBuilder requestBuilder70 = requestBuilder29.headers(headerList68);
        requestBuilder17.headers = headerList68;
        java.util.List<retrofit.client.Header> headerList74 = null;
        retrofit.mime.TypedOutput typedOutput75 = null;
        retrofit.client.Request request76 = new retrofit.client.Request("", "", headerList74, typedOutput75);
        java.lang.String str77 = request76.url;
        java.util.List<retrofit.client.Header> headerList78 = request76.getHeaders();
        requestBuilder17.headers = headerList78;
        retrofit.RequestBuilder requestBuilder80 = requestBuilder13.headers(headerList78);
        requestBuilder3.headers = headerList78;
        retrofit.mime.TypedOutput typedOutput82 = null;
        retrofit.client.Request request83 = new retrofit.client.Request("", "", headerList78, typedOutput82);
        java.lang.String str84 = request83.getUrl();
        java.lang.String str85 = request83.method;
        java.lang.String str86 = request83.getUrl();
        java.lang.String str87 = request83.getMethod();
        java.lang.String str88 = request83.getUrl();
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(headerList8);
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(converter43);
        org.junit.Assert.assertNull(headerList44);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(requestBuilder58);
        org.junit.Assert.assertNull(typedOutput66);
        org.junit.Assert.assertNull(typedOutput67);
        org.junit.Assert.assertNotNull(headerList68);
        org.junit.Assert.assertNotNull(requestBuilder70);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(headerList78);
        org.junit.Assert.assertNotNull(requestBuilder80);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.lang.Object[] objArray4 = requestBuilder3.args;
        retrofit.converter.Converter converter5 = null;
        retrofit.RequestBuilder requestBuilder6 = new retrofit.RequestBuilder(converter5);
        retrofit.converter.Converter converter7 = requestBuilder6.getconverter();
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder6.headers;
        requestBuilder6.setapiUrl("hi!");
        retrofit.converter.Converter converter11 = requestBuilder6.converter;
        retrofit.RequestBuilder requestBuilder13 = requestBuilder6.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder15 = requestBuilder13.apiUrl("hi!");
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        requestBuilder17.setheaders((java.util.List<retrofit.client.Header>) headerList21);
        java.util.List<retrofit.client.Header> headerList26 = requestBuilder17.getheaders();
        java.lang.String str27 = requestBuilder17.getapiUrl();
        retrofit.converter.Converter converter28 = null;
        retrofit.RequestBuilder requestBuilder29 = new retrofit.RequestBuilder(converter28);
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
        requestBuilder29.setheaders((java.util.List<retrofit.client.Header>) headerList33);
        retrofit.converter.Converter converter41 = null;
        retrofit.RequestBuilder requestBuilder42 = new retrofit.RequestBuilder(converter41);
        retrofit.converter.Converter converter43 = requestBuilder42.getconverter();
        java.util.List<retrofit.client.Header> headerList44 = requestBuilder42.headers;
        requestBuilder42.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList49 = null;
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("", "", headerList49, typedOutput50);
        java.lang.String str52 = request51.getUrl();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder42, request51 };
        requestBuilder29.setargs(objArray53);
        requestBuilder29.apiUrl = "";
        retrofit.RequestBuilder requestBuilder58 = requestBuilder29.apiUrl("hi!");
        retrofit.converter.Converter converter59 = null;
        retrofit.RequestBuilder requestBuilder60 = new retrofit.RequestBuilder(converter59);
        java.util.List<retrofit.client.Header> headerList63 = null;
        retrofit.mime.TypedOutput typedOutput64 = null;
        retrofit.client.Request request65 = new retrofit.client.Request("", "", headerList63, typedOutput64);
        retrofit.mime.TypedOutput typedOutput66 = request65.getBody();
        retrofit.mime.TypedOutput typedOutput67 = request65.getBody();
        java.util.List<retrofit.client.Header> headerList68 = request65.headers;
        requestBuilder60.setheaders(headerList68);
        retrofit.RequestBuilder requestBuilder70 = requestBuilder29.headers(headerList68);
        requestBuilder17.headers = headerList68;
        java.util.List<retrofit.client.Header> headerList74 = null;
        retrofit.mime.TypedOutput typedOutput75 = null;
        retrofit.client.Request request76 = new retrofit.client.Request("", "", headerList74, typedOutput75);
        java.lang.String str77 = request76.url;
        java.util.List<retrofit.client.Header> headerList78 = request76.getHeaders();
        requestBuilder17.headers = headerList78;
        retrofit.RequestBuilder requestBuilder80 = requestBuilder13.headers(headerList78);
        requestBuilder3.headers = headerList78;
        retrofit.mime.TypedOutput typedOutput82 = null;
        retrofit.client.Request request83 = new retrofit.client.Request("", "", headerList78, typedOutput82);
        java.lang.String str84 = request83.getUrl();
        java.util.List<retrofit.client.Header> headerList85 = request83.headers;
        java.lang.String str86 = request83.url;
        java.lang.String str87 = request83.method;
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(headerList8);
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(converter43);
        org.junit.Assert.assertNull(headerList44);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(requestBuilder58);
        org.junit.Assert.assertNull(typedOutput66);
        org.junit.Assert.assertNull(typedOutput67);
        org.junit.Assert.assertNotNull(headerList68);
        org.junit.Assert.assertNotNull(requestBuilder70);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(headerList78);
        org.junit.Assert.assertNotNull(requestBuilder80);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(headerList85);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        retrofit.RequestBuilder requestBuilder30 = requestBuilder3.apiUrl("");
        java.util.List<retrofit.client.Header> headerList31 = requestBuilder3.headers;
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "hi!", headerList31, typedOutput32);
        java.lang.String str34 = request33.url;
        retrofit.mime.TypedOutput typedOutput35 = request33.body;
        java.lang.String str36 = request33.url;
        retrofit.mime.TypedOutput typedOutput37 = request33.getBody();
        java.util.List<retrofit.client.Header> headerList38 = request33.getHeaders();
        java.lang.String str39 = request33.method;
        java.lang.String str40 = request33.method;
        java.lang.String str41 = request33.method;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNull(typedOutput35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(typedOutput37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.url;
        java.lang.String str8 = request6.url;
        java.lang.String str9 = request6.getUrl();
        java.lang.String str10 = request6.url;
        java.lang.String str11 = request6.url;
        java.util.List<retrofit.client.Header> headerList12 = request6.headers;
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", headerList12, typedOutput13);
        java.lang.String str15 = request14.getUrl();
        retrofit.mime.TypedOutput typedOutput16 = request14.getBody();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(typedOutput16);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.String str2 = requestBuilder1.apiUrl;
        java.lang.String str3 = requestBuilder1.getapiUrl();
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        requestBuilder7.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        retrofit.converter.Converter converter19 = null;
        retrofit.RequestBuilder requestBuilder20 = new retrofit.RequestBuilder(converter19);
        retrofit.converter.Converter converter21 = requestBuilder20.getconverter();
        java.util.List<retrofit.client.Header> headerList22 = requestBuilder20.headers;
        requestBuilder20.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList27 = null;
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", headerList27, typedOutput28);
        java.lang.String str30 = request29.getUrl();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder20, request29 };
        requestBuilder7.setargs(objArray31);
        retrofit.RequestBuilder requestBuilder34 = requestBuilder7.apiUrl("");
        java.util.List<retrofit.client.Header> headerList35 = requestBuilder7.headers;
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "hi!", headerList35, typedOutput36);
        java.lang.String str38 = request37.url;
        java.lang.String str39 = request37.getMethod();
        java.lang.String str40 = request37.method;
        java.lang.String str41 = request37.method;
        java.util.List<retrofit.client.Header> headerList42 = request37.headers;
        requestBuilder1.headers = headerList42;
        retrofit.RequestBuilder requestBuilder45 = requestBuilder1.apiUrl("");
        java.lang.String str46 = requestBuilder45.apiUrl;
        retrofit.converter.Converter converter47 = requestBuilder45.converter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.mime.TypedOutput typedOutput48 = requestBuilder45.buildBody();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNull(headerList22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertNotNull(requestBuilder45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNull(converter47);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.headers;
        requestBuilder3.setheaders(headerList11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput13);
        java.lang.String str15 = request14.url;
        retrofit.mime.TypedOutput typedOutput16 = request14.body;
        java.lang.String str17 = request14.method;
        retrofit.mime.TypedOutput typedOutput18 = request14.getBody();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(typedOutput18);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.url;
        java.lang.String str6 = request4.url;
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.url;
        java.lang.String str9 = request4.url;
        java.lang.String str10 = request4.getMethod();
        java.lang.String str11 = request4.url;
        java.lang.String str12 = request4.method;
        java.util.List<retrofit.client.Header> headerList13 = request4.headers;
        java.lang.String str14 = request4.method;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.lang.Object[] objArray6 = requestBuilder5.args;
        retrofit.converter.Converter converter7 = null;
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        retrofit.converter.Converter converter9 = requestBuilder8.getconverter();
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder8.headers;
        requestBuilder8.setapiUrl("hi!");
        retrofit.converter.Converter converter13 = requestBuilder8.converter;
        retrofit.RequestBuilder requestBuilder15 = requestBuilder8.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder17 = requestBuilder15.apiUrl("hi!");
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        requestBuilder19.setheaders((java.util.List<retrofit.client.Header>) headerList23);
        java.util.List<retrofit.client.Header> headerList28 = requestBuilder19.getheaders();
        java.lang.String str29 = requestBuilder19.getapiUrl();
        retrofit.converter.Converter converter30 = null;
        retrofit.RequestBuilder requestBuilder31 = new retrofit.RequestBuilder(converter30);
        retrofit.client.Header[] headerArray34 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList35 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList35, headerArray34);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList35, typedOutput37);
        requestBuilder31.setheaders((java.util.List<retrofit.client.Header>) headerList35);
        retrofit.converter.Converter converter43 = null;
        retrofit.RequestBuilder requestBuilder44 = new retrofit.RequestBuilder(converter43);
        retrofit.converter.Converter converter45 = requestBuilder44.getconverter();
        java.util.List<retrofit.client.Header> headerList46 = requestBuilder44.headers;
        requestBuilder44.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList51 = null;
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("", "", headerList51, typedOutput52);
        java.lang.String str54 = request53.getUrl();
        java.lang.Object[] objArray55 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder44, request53 };
        requestBuilder31.setargs(objArray55);
        requestBuilder31.apiUrl = "";
        retrofit.RequestBuilder requestBuilder60 = requestBuilder31.apiUrl("hi!");
        retrofit.converter.Converter converter61 = null;
        retrofit.RequestBuilder requestBuilder62 = new retrofit.RequestBuilder(converter61);
        java.util.List<retrofit.client.Header> headerList65 = null;
        retrofit.mime.TypedOutput typedOutput66 = null;
        retrofit.client.Request request67 = new retrofit.client.Request("", "", headerList65, typedOutput66);
        retrofit.mime.TypedOutput typedOutput68 = request67.getBody();
        retrofit.mime.TypedOutput typedOutput69 = request67.getBody();
        java.util.List<retrofit.client.Header> headerList70 = request67.headers;
        requestBuilder62.setheaders(headerList70);
        retrofit.RequestBuilder requestBuilder72 = requestBuilder31.headers(headerList70);
        requestBuilder19.headers = headerList70;
        java.util.List<retrofit.client.Header> headerList76 = null;
        retrofit.mime.TypedOutput typedOutput77 = null;
        retrofit.client.Request request78 = new retrofit.client.Request("", "", headerList76, typedOutput77);
        java.lang.String str79 = request78.url;
        java.util.List<retrofit.client.Header> headerList80 = request78.getHeaders();
        requestBuilder19.headers = headerList80;
        retrofit.RequestBuilder requestBuilder82 = requestBuilder15.headers(headerList80);
        requestBuilder5.headers = headerList80;
        retrofit.mime.TypedOutput typedOutput84 = null;
        retrofit.client.Request request85 = new retrofit.client.Request("", "", headerList80, typedOutput84);
        java.lang.String str86 = request85.getUrl();
        java.util.List<retrofit.client.Header> headerList87 = request85.headers;
        java.util.List<retrofit.client.Header> headerList88 = request85.getHeaders();
        retrofit.mime.TypedOutput typedOutput89 = null;
        retrofit.client.Request request90 = new retrofit.client.Request("", "hi!", headerList88, typedOutput89);
        java.lang.String str91 = request90.method;
        java.lang.String str92 = request90.url;
        retrofit.mime.TypedOutput typedOutput93 = request90.body;
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNull(converter9);
        org.junit.Assert.assertNull(headerList10);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNotNull(requestBuilder15);
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(headerArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(converter45);
        org.junit.Assert.assertNull(headerList46);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(requestBuilder60);
        org.junit.Assert.assertNull(typedOutput68);
        org.junit.Assert.assertNull(typedOutput69);
        org.junit.Assert.assertNotNull(headerList70);
        org.junit.Assert.assertNotNull(requestBuilder72);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(headerList80);
        org.junit.Assert.assertNotNull(requestBuilder82);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(headerList87);
        org.junit.Assert.assertNotNull(headerList88);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "" + "'", str91, "");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertNull(typedOutput93);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        retrofit.RequestBuilder requestBuilder28 = requestBuilder1.apiUrl("");
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder1.headers;
        java.lang.String str30 = requestBuilder1.getapiUrl();
        java.lang.Object[] objArray31 = requestBuilder1.getargs();
        retrofit.RequestBuilder requestBuilder33 = requestBuilder1.apiUrl("");
        java.lang.String str34 = requestBuilder33.apiUrl;
        retrofit.converter.Converter converter35 = requestBuilder33.getconverter();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(converter35);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.converter.Converter converter18 = requestBuilder17.getconverter();
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder17.headers;
        requestBuilder17.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder17, request26 };
        requestBuilder4.setargs(objArray28);
        java.lang.Object[] objArray30 = requestBuilder4.getargs();
        retrofit.RequestBuilder requestBuilder31 = requestBuilder1.args(objArray30);
        java.util.List<retrofit.client.Header> headerList32 = requestBuilder1.getheaders();
        java.lang.String str33 = requestBuilder1.apiUrl;
        java.lang.String str34 = requestBuilder1.getapiUrl();
        requestBuilder1.setapiUrl("");
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(headerList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.converter.Converter converter19 = requestBuilder18.getconverter();
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder18.headers;
        requestBuilder18.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList25 = null;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder18, request27 };
        requestBuilder5.setargs(objArray29);
        retrofit.RequestBuilder requestBuilder32 = requestBuilder5.apiUrl("");
        java.util.List<retrofit.client.Header> headerList33 = requestBuilder5.headers;
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "hi!", headerList33, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("hi!", "hi!", headerList33, typedOutput36);
        java.util.List<retrofit.client.Header> headerList38 = request37.getHeaders();
        java.lang.String str39 = request37.method;
        java.lang.String str40 = request37.url;
        java.util.List<retrofit.client.Header> headerList41 = request37.getHeaders();
        java.lang.String str42 = request37.getUrl();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(headerList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(headerList41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        java.lang.Object[] objArray27 = requestBuilder1.getargs();
        java.lang.String str28 = requestBuilder1.apiUrl;
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder1.headers;
        retrofit.converter.Converter converter30 = null;
        retrofit.RequestBuilder requestBuilder31 = new retrofit.RequestBuilder(converter30);
        retrofit.client.Header[] headerArray34 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList35 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList35, headerArray34);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList35, typedOutput37);
        requestBuilder31.setheaders((java.util.List<retrofit.client.Header>) headerList35);
        retrofit.converter.Converter converter43 = null;
        retrofit.RequestBuilder requestBuilder44 = new retrofit.RequestBuilder(converter43);
        retrofit.converter.Converter converter45 = requestBuilder44.getconverter();
        java.util.List<retrofit.client.Header> headerList46 = requestBuilder44.headers;
        requestBuilder44.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList51 = null;
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("", "", headerList51, typedOutput52);
        java.lang.String str54 = request53.getUrl();
        java.lang.Object[] objArray55 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder44, request53 };
        requestBuilder31.setargs(objArray55);
        retrofit.RequestBuilder requestBuilder58 = requestBuilder31.apiUrl("");
        java.util.List<retrofit.client.Header> headerList59 = requestBuilder31.headers;
        java.lang.Object[] objArray60 = requestBuilder31.args;
        requestBuilder1.args = objArray60;
        retrofit.converter.Converter converter62 = requestBuilder1.converter;
        requestBuilder1.apiUrl = "";
        retrofit.converter.Converter converter65 = requestBuilder1.getconverter();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(headerArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(converter45);
        org.junit.Assert.assertNull(headerList46);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNotNull(requestBuilder58);
        org.junit.Assert.assertNotNull(headerList59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNull(converter62);
        org.junit.Assert.assertNull(converter65);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.String str2 = requestBuilder1.apiUrl;
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        java.lang.Object[] objArray4 = requestBuilder1.getargs();
        requestBuilder1.setapiUrl("hi!");
        requestBuilder1.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder1.getheaders();
        java.lang.String str10 = requestBuilder1.apiUrl;
        requestBuilder1.setapiUrl("");
        retrofit.converter.Converter converter13 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter14 = null;
        retrofit.RequestBuilder requestBuilder15 = new retrofit.RequestBuilder(converter14);
        java.lang.String str16 = requestBuilder15.apiUrl;
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.converter.Converter converter19 = requestBuilder18.getconverter();
        retrofit.converter.Converter converter20 = null;
        retrofit.RequestBuilder requestBuilder21 = new retrofit.RequestBuilder(converter20);
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        requestBuilder21.setheaders((java.util.List<retrofit.client.Header>) headerList25);
        retrofit.converter.Converter converter33 = null;
        retrofit.RequestBuilder requestBuilder34 = new retrofit.RequestBuilder(converter33);
        retrofit.converter.Converter converter35 = requestBuilder34.getconverter();
        java.util.List<retrofit.client.Header> headerList36 = requestBuilder34.headers;
        requestBuilder34.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList41 = null;
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("", "", headerList41, typedOutput42);
        java.lang.String str44 = request43.getUrl();
        java.lang.Object[] objArray45 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder34, request43 };
        requestBuilder21.setargs(objArray45);
        java.lang.Object[] objArray47 = requestBuilder21.getargs();
        retrofit.RequestBuilder requestBuilder48 = requestBuilder18.args(objArray47);
        requestBuilder15.setargs(objArray47);
        java.lang.String str50 = requestBuilder15.getapiUrl();
        java.lang.String str51 = requestBuilder15.apiUrl;
        java.lang.Object[] objArray52 = requestBuilder15.getargs();
        requestBuilder1.setargs(objArray52);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(converter35);
        org.junit.Assert.assertNull(headerList36);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(requestBuilder48);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(objArray52);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        retrofit.converter.Converter converter7 = null;
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        requestBuilder8.setheaders((java.util.List<retrofit.client.Header>) headerList12);
        java.util.List<retrofit.client.Header> headerList19 = null;
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList19, typedOutput20);
        java.lang.String str22 = request21.getUrl();
        retrofit.mime.TypedOutput typedOutput23 = request21.body;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder8, typedOutput23 };
        requestBuilder1.setargs(objArray24);
        java.util.List<retrofit.client.Header> headerList28 = null;
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", headerList28, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = request30.getBody();
        retrofit.mime.TypedOutput typedOutput32 = request30.getBody();
        java.lang.String str33 = request30.getUrl();
        java.util.List<retrofit.client.Header> headerList34 = request30.headers;
        retrofit.RequestBuilder requestBuilder35 = requestBuilder1.headers(headerList34);
        java.lang.Object[] objArray36 = requestBuilder35.args;
        java.util.List<retrofit.client.Header> headerList37 = requestBuilder35.getheaders();
        java.lang.Object[] objArray38 = requestBuilder35.args;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(typedOutput31);
        org.junit.Assert.assertNull(typedOutput32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        requestBuilder1.setheaders(headerList9);
        retrofit.converter.Converter converter11 = null;
        retrofit.RequestBuilder requestBuilder12 = new retrofit.RequestBuilder(converter11);
        retrofit.converter.Converter converter13 = requestBuilder12.getconverter();
        java.util.List<retrofit.client.Header> headerList14 = requestBuilder12.headers;
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        requestBuilder19.setheaders((java.util.List<retrofit.client.Header>) headerList23);
        java.util.List<retrofit.client.Header> headerList30 = null;
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", headerList30, typedOutput31);
        java.lang.String str33 = request32.getUrl();
        retrofit.mime.TypedOutput typedOutput34 = request32.body;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder19, typedOutput34 };
        requestBuilder12.setargs(objArray35);
        retrofit.RequestBuilder requestBuilder37 = requestBuilder1.args(objArray35);
        requestBuilder1.apiUrl = "hi!";
        retrofit.converter.Converter converter40 = requestBuilder1.converter;
        java.lang.Object[] objArray41 = requestBuilder1.args;
        java.util.List<retrofit.client.Header> headerList44 = null;
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("hi!", "", headerList44, typedOutput45);
        java.lang.String str47 = request46.getMethod();
        java.lang.String str48 = request46.getUrl();
        java.util.List<retrofit.client.Header> headerList49 = request46.getHeaders();
        java.util.List<retrofit.client.Header> headerList50 = request46.headers;
        requestBuilder1.setheaders(headerList50);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(headerList14);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(typedOutput34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNull(converter40);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(headerList49);
        org.junit.Assert.assertNotNull(headerList50);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        java.lang.String str12 = requestBuilder3.getapiUrl();
        retrofit.RequestBuilder requestBuilder14 = requestBuilder3.apiUrl("");
        java.lang.Object[] objArray15 = requestBuilder3.getargs();
        retrofit.converter.Converter converter16 = requestBuilder3.getconverter();
        java.lang.Object[] objArray17 = requestBuilder3.getargs();
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        requestBuilder19.setheaders((java.util.List<retrofit.client.Header>) headerList23);
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        retrofit.converter.Converter converter33 = requestBuilder32.getconverter();
        java.util.List<retrofit.client.Header> headerList34 = requestBuilder32.headers;
        requestBuilder32.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList39 = null;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        java.lang.String str42 = request41.getUrl();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder32, request41 };
        requestBuilder19.setargs(objArray43);
        requestBuilder19.apiUrl = "";
        retrofit.RequestBuilder requestBuilder48 = requestBuilder19.apiUrl("hi!");
        retrofit.converter.Converter converter49 = null;
        retrofit.RequestBuilder requestBuilder50 = new retrofit.RequestBuilder(converter49);
        java.util.List<retrofit.client.Header> headerList53 = null;
        retrofit.mime.TypedOutput typedOutput54 = null;
        retrofit.client.Request request55 = new retrofit.client.Request("", "", headerList53, typedOutput54);
        retrofit.mime.TypedOutput typedOutput56 = request55.getBody();
        retrofit.mime.TypedOutput typedOutput57 = request55.getBody();
        java.util.List<retrofit.client.Header> headerList58 = request55.headers;
        requestBuilder50.setheaders(headerList58);
        retrofit.RequestBuilder requestBuilder60 = requestBuilder19.headers(headerList58);
        retrofit.RequestBuilder requestBuilder61 = requestBuilder3.headers(headerList58);
        retrofit.mime.TypedOutput typedOutput62 = null;
        retrofit.client.Request request63 = new retrofit.client.Request("", "hi!", headerList58, typedOutput62);
        java.lang.String str64 = request63.url;
        java.lang.String str65 = request63.getUrl();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNull(objArray15);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(objArray17);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(converter33);
        org.junit.Assert.assertNull(headerList34);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(requestBuilder48);
        org.junit.Assert.assertNull(typedOutput56);
        org.junit.Assert.assertNull(typedOutput57);
        org.junit.Assert.assertNotNull(headerList58);
        org.junit.Assert.assertNotNull(requestBuilder60);
        org.junit.Assert.assertNotNull(requestBuilder61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        java.lang.String str7 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList8 = request4.headers;
        java.lang.String str9 = request4.getUrl();
        java.lang.String str10 = request4.url;
        java.lang.String str11 = request4.method;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        retrofit.RequestBuilder requestBuilder28 = requestBuilder1.apiUrl("");
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder1.headers;
        java.lang.Object[] objArray30 = requestBuilder1.args;
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        retrofit.client.Header[] headerArray35 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList36 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList36, headerArray35);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList36, typedOutput38);
        requestBuilder32.setheaders((java.util.List<retrofit.client.Header>) headerList36);
        retrofit.converter.Converter converter44 = null;
        retrofit.RequestBuilder requestBuilder45 = new retrofit.RequestBuilder(converter44);
        retrofit.converter.Converter converter46 = requestBuilder45.getconverter();
        java.util.List<retrofit.client.Header> headerList47 = requestBuilder45.headers;
        requestBuilder45.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList52 = null;
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("", "", headerList52, typedOutput53);
        java.lang.String str55 = request54.getUrl();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder45, request54 };
        requestBuilder32.setargs(objArray56);
        requestBuilder1.setargs(objArray56);
        requestBuilder1.apiUrl = "";
        retrofit.RequestBuilder requestBuilder62 = requestBuilder1.apiUrl("hi!");
        java.lang.Object[] objArray63 = requestBuilder1.getargs();
        retrofit.RequestBuilder requestBuilder65 = requestBuilder1.apiUrl("");
        retrofit.converter.Converter converter66 = requestBuilder1.getconverter();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(headerArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(converter46);
        org.junit.Assert.assertNull(headerList47);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(requestBuilder62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(requestBuilder65);
        org.junit.Assert.assertNull(converter66);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request6.body;
        retrofit.mime.TypedOutput typedOutput9 = request6.body;
        java.lang.String str10 = request6.url;
        java.lang.String str11 = request6.getMethod();
        java.lang.String str12 = request6.getUrl();
        java.lang.String str13 = request6.url;
        java.lang.String str14 = request6.method;
        java.lang.String str15 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList16 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", headerList16, typedOutput17);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.lang.String str10 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request4.headers;
        java.util.List<retrofit.client.Header> headerList12 = request4.getHeaders();
        java.lang.String str13 = request4.getMethod();
        java.lang.String str14 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList15 = request4.getHeaders();
        java.lang.String str16 = request4.method;
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder1.getheaders();
        java.lang.String str11 = requestBuilder1.getapiUrl();
        retrofit.RequestBuilder requestBuilder13 = requestBuilder1.apiUrl("");
        retrofit.converter.Converter converter14 = requestBuilder13.getconverter();
        java.util.List<retrofit.client.Header> headerList17 = null;
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        java.lang.String str20 = request19.url;
        java.lang.String str21 = request19.url;
        java.lang.String str22 = request19.getUrl();
        retrofit.mime.TypedOutput typedOutput23 = request19.body;
        java.util.List<retrofit.client.Header> headerList24 = request19.headers;
        retrofit.RequestBuilder requestBuilder25 = requestBuilder13.headers(headerList24);
        java.util.List<retrofit.client.Header> headerList26 = requestBuilder25.getheaders();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNull(converter14);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNotNull(headerList26);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        retrofit.RequestBuilder requestBuilder30 = requestBuilder3.apiUrl("");
        java.util.List<retrofit.client.Header> headerList31 = requestBuilder3.headers;
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "hi!", headerList31, typedOutput32);
        java.lang.String str34 = request33.getUrl();
        java.lang.String str35 = request33.getUrl();
        retrofit.mime.TypedOutput typedOutput36 = request33.body;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(typedOutput36);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.converter.Converter converter19 = requestBuilder18.getconverter();
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder18.headers;
        requestBuilder18.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList25 = null;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder18, request27 };
        requestBuilder5.setargs(objArray29);
        retrofit.RequestBuilder requestBuilder32 = requestBuilder5.apiUrl("");
        java.util.List<retrofit.client.Header> headerList33 = requestBuilder5.headers;
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "hi!", headerList33, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "hi!", headerList33, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.body;
        java.lang.String str39 = request37.getUrl();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(headerList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.converter.Converter converter18 = requestBuilder17.getconverter();
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder17.headers;
        requestBuilder17.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder17, request26 };
        requestBuilder4.setargs(objArray28);
        java.lang.Object[] objArray30 = requestBuilder4.getargs();
        retrofit.RequestBuilder requestBuilder31 = requestBuilder1.args(objArray30);
        requestBuilder31.setapiUrl("");
        retrofit.converter.Converter converter34 = requestBuilder31.getconverter();
        java.util.List<retrofit.client.Header> headerList35 = requestBuilder31.getheaders();
        retrofit.RequestBuilder requestBuilder37 = requestBuilder31.apiUrl("");
        java.util.List<retrofit.client.Header> headerList38 = requestBuilder31.headers;
        requestBuilder31.setapiUrl("hi!");
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(converter34);
        org.junit.Assert.assertNull(headerList35);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNull(headerList38);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = requestBuilder1.converter;
        retrofit.RequestBuilder requestBuilder8 = requestBuilder1.apiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder8.getheaders();
        java.lang.Object[] objArray10 = requestBuilder8.args;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(headerList9);
        org.junit.Assert.assertNull(objArray10);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = requestBuilder1.converter;
        retrofit.RequestBuilder requestBuilder8 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter9 = requestBuilder1.converter;
        retrofit.RequestBuilder requestBuilder11 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter12 = null;
        retrofit.RequestBuilder requestBuilder13 = new retrofit.RequestBuilder(converter12);
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        requestBuilder13.setheaders((java.util.List<retrofit.client.Header>) headerList17);
        retrofit.converter.Converter converter25 = null;
        retrofit.RequestBuilder requestBuilder26 = new retrofit.RequestBuilder(converter25);
        retrofit.converter.Converter converter27 = requestBuilder26.getconverter();
        java.util.List<retrofit.client.Header> headerList28 = requestBuilder26.headers;
        requestBuilder26.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList33 = null;
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "", headerList33, typedOutput34);
        java.lang.String str36 = request35.getUrl();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder26, request35 };
        requestBuilder13.setargs(objArray37);
        requestBuilder13.apiUrl = "";
        retrofit.RequestBuilder requestBuilder42 = requestBuilder13.apiUrl("hi!");
        retrofit.converter.Converter converter43 = null;
        retrofit.RequestBuilder requestBuilder44 = new retrofit.RequestBuilder(converter43);
        java.util.List<retrofit.client.Header> headerList47 = null;
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "", headerList47, typedOutput48);
        retrofit.mime.TypedOutput typedOutput50 = request49.getBody();
        retrofit.mime.TypedOutput typedOutput51 = request49.getBody();
        java.util.List<retrofit.client.Header> headerList52 = request49.headers;
        requestBuilder44.setheaders(headerList52);
        retrofit.RequestBuilder requestBuilder54 = requestBuilder13.headers(headerList52);
        java.util.List<retrofit.client.Header> headerList55 = requestBuilder13.getheaders();
        requestBuilder1.headers = headerList55;
        retrofit.RequestBuilder requestBuilder58 = requestBuilder1.apiUrl("");
        retrofit.converter.Converter converter59 = requestBuilder58.converter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.mime.TypedOutput typedOutput60 = requestBuilder58.buildBody();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(converter9);
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(converter27);
        org.junit.Assert.assertNull(headerList28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNull(typedOutput50);
        org.junit.Assert.assertNull(typedOutput51);
        org.junit.Assert.assertNotNull(headerList52);
        org.junit.Assert.assertNotNull(requestBuilder54);
        org.junit.Assert.assertNotNull(headerList55);
        org.junit.Assert.assertNotNull(requestBuilder58);
        org.junit.Assert.assertNull(converter59);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        retrofit.RequestBuilder requestBuilder28 = requestBuilder1.apiUrl("");
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder28.getheaders();
        java.lang.Class<?> wildcardClass30 = headerList29.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        requestBuilder1.setheaders(headerList9);
        retrofit.converter.Converter converter11 = null;
        retrofit.RequestBuilder requestBuilder12 = new retrofit.RequestBuilder(converter11);
        retrofit.converter.Converter converter13 = requestBuilder12.getconverter();
        java.util.List<retrofit.client.Header> headerList14 = requestBuilder12.headers;
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        requestBuilder19.setheaders((java.util.List<retrofit.client.Header>) headerList23);
        java.util.List<retrofit.client.Header> headerList30 = null;
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", headerList30, typedOutput31);
        java.lang.String str33 = request32.getUrl();
        retrofit.mime.TypedOutput typedOutput34 = request32.body;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder19, typedOutput34 };
        requestBuilder12.setargs(objArray35);
        retrofit.RequestBuilder requestBuilder37 = requestBuilder1.args(objArray35);
        retrofit.converter.Converter converter38 = null;
        retrofit.RequestBuilder requestBuilder39 = new retrofit.RequestBuilder(converter38);
        retrofit.converter.Converter converter40 = requestBuilder39.getconverter();
        retrofit.converter.Converter converter41 = null;
        retrofit.RequestBuilder requestBuilder42 = new retrofit.RequestBuilder(converter41);
        retrofit.client.Header[] headerArray45 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList46 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList46, headerArray45);
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList46, typedOutput48);
        requestBuilder42.setheaders((java.util.List<retrofit.client.Header>) headerList46);
        retrofit.converter.Converter converter54 = null;
        retrofit.RequestBuilder requestBuilder55 = new retrofit.RequestBuilder(converter54);
        retrofit.converter.Converter converter56 = requestBuilder55.getconverter();
        java.util.List<retrofit.client.Header> headerList57 = requestBuilder55.headers;
        requestBuilder55.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList62 = null;
        retrofit.mime.TypedOutput typedOutput63 = null;
        retrofit.client.Request request64 = new retrofit.client.Request("", "", headerList62, typedOutput63);
        java.lang.String str65 = request64.getUrl();
        java.lang.Object[] objArray66 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder55, request64 };
        requestBuilder42.setargs(objArray66);
        java.lang.Object[] objArray68 = requestBuilder42.getargs();
        retrofit.RequestBuilder requestBuilder69 = requestBuilder39.args(objArray68);
        retrofit.RequestBuilder requestBuilder70 = requestBuilder37.args(objArray68);
        java.util.List<retrofit.client.Header> headerList71 = requestBuilder37.headers;
        retrofit.RequestBuilder requestBuilder73 = requestBuilder37.apiUrl("hi!");
        requestBuilder73.setapiUrl("hi!");
        retrofit.converter.Converter converter76 = requestBuilder73.getconverter();
        java.lang.String str77 = requestBuilder73.apiUrl;
        java.lang.Object[] objArray78 = requestBuilder73.getargs();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(headerList14);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(typedOutput34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNull(converter40);
        org.junit.Assert.assertNotNull(headerArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(converter56);
        org.junit.Assert.assertNull(headerList57);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(requestBuilder69);
        org.junit.Assert.assertNotNull(requestBuilder70);
        org.junit.Assert.assertNotNull(headerList71);
        org.junit.Assert.assertNotNull(requestBuilder73);
        org.junit.Assert.assertNull(converter76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(objArray78);
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request6.body;
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = request6.body;
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput15);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.url;
        java.lang.String str7 = request4.url;
        java.lang.String str8 = request4.url;
        java.lang.String str9 = request4.url;
        java.lang.String str10 = request4.url;
        java.lang.String str11 = request4.getUrl();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = requestBuilder1.converter;
        java.lang.String str7 = requestBuilder1.apiUrl;
        java.lang.String str8 = requestBuilder1.getapiUrl();
        retrofit.converter.Converter converter9 = requestBuilder1.converter;
        java.lang.Object[] objArray10 = requestBuilder1.getargs();
        java.lang.String str11 = requestBuilder1.apiUrl;
        java.lang.Object[] objArray12 = null;
        retrofit.RequestBuilder requestBuilder13 = requestBuilder1.args(objArray12);
        java.lang.String str14 = requestBuilder13.apiUrl;
        requestBuilder13.apiUrl = "";
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(converter9);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.url;
        java.lang.String str6 = request4.url;
        java.lang.String str7 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request4.body;
        java.lang.String str9 = request4.method;
        java.lang.String str10 = request4.getUrl();
        java.lang.String str11 = request4.method;
        java.lang.String str12 = request4.method;
        retrofit.mime.TypedOutput typedOutput13 = request4.body;
        retrofit.mime.TypedOutput typedOutput14 = request4.body;
        java.lang.String str15 = request4.url;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        java.lang.String str6 = requestBuilder1.apiUrl;
        java.util.List<retrofit.client.Header> headerList7 = requestBuilder1.headers;
        java.lang.String str8 = requestBuilder1.getapiUrl();
        java.lang.String str9 = requestBuilder1.apiUrl;
        retrofit.RequestBuilder requestBuilder11 = requestBuilder1.apiUrl("");
        java.lang.Object[] objArray12 = null;
        requestBuilder11.setargs(objArray12);
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(requestBuilder11);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.url;
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = request6.body;
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = request13.body;
        retrofit.mime.TypedOutput typedOutput15 = request13.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request13.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request13.getHeaders();
        java.util.List<retrofit.client.Header> headerList18 = request13.headers;
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList18);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.converter.Converter converter4 = requestBuilder3.getconverter();
        java.util.List<retrofit.client.Header> headerList5 = requestBuilder3.headers;
        requestBuilder3.setapiUrl("hi!");
        java.lang.String str8 = requestBuilder3.apiUrl;
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder3.headers;
        java.lang.String str10 = requestBuilder3.getapiUrl();
        java.lang.String str11 = requestBuilder3.apiUrl;
        retrofit.RequestBuilder requestBuilder13 = requestBuilder3.apiUrl("hi!");
        retrofit.converter.Converter converter14 = null;
        retrofit.RequestBuilder requestBuilder15 = new retrofit.RequestBuilder(converter14);
        retrofit.converter.Converter converter16 = requestBuilder15.getconverter();
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder15.headers;
        retrofit.converter.Converter converter21 = null;
        retrofit.RequestBuilder requestBuilder22 = new retrofit.RequestBuilder(converter21);
        retrofit.client.Header[] headerArray25 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList26 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList26, headerArray25);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList26, typedOutput28);
        requestBuilder22.setheaders((java.util.List<retrofit.client.Header>) headerList26);
        java.util.List<retrofit.client.Header> headerList33 = null;
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "", headerList33, typedOutput34);
        java.lang.String str36 = request35.getUrl();
        retrofit.mime.TypedOutput typedOutput37 = request35.body;
        java.lang.Object[] objArray38 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder22, typedOutput37 };
        requestBuilder15.setargs(objArray38);
        java.util.List<retrofit.client.Header> headerList42 = null;
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("", "", headerList42, typedOutput43);
        retrofit.mime.TypedOutput typedOutput45 = request44.getBody();
        retrofit.mime.TypedOutput typedOutput46 = request44.getBody();
        java.lang.String str47 = request44.getUrl();
        java.util.List<retrofit.client.Header> headerList48 = request44.headers;
        retrofit.RequestBuilder requestBuilder49 = requestBuilder15.headers(headerList48);
        retrofit.RequestBuilder requestBuilder50 = requestBuilder3.headers(headerList48);
        java.util.List<retrofit.client.Header> headerList53 = null;
        retrofit.mime.TypedOutput typedOutput54 = null;
        retrofit.client.Request request55 = new retrofit.client.Request("", "", headerList53, typedOutput54);
        java.lang.String str56 = request55.url;
        java.lang.String str57 = request55.url;
        java.util.List<retrofit.client.Header> headerList58 = request55.getHeaders();
        requestBuilder50.setheaders(headerList58);
        retrofit.mime.TypedOutput typedOutput60 = null;
        retrofit.client.Request request61 = new retrofit.client.Request("hi!", "", headerList58, typedOutput60);
        java.util.List<retrofit.client.Header> headerList62 = request61.getHeaders();
        java.lang.String str63 = request61.getMethod();
        org.junit.Assert.assertNull(converter4);
        org.junit.Assert.assertNull(headerList5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(requestBuilder13);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(headerList17);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(typedOutput37);
        org.junit.Assert.assertNotNull(objArray38);
        org.junit.Assert.assertNull(typedOutput45);
        org.junit.Assert.assertNull(typedOutput46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(headerList48);
        org.junit.Assert.assertNotNull(requestBuilder49);
        org.junit.Assert.assertNotNull(requestBuilder50);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(headerList58);
        org.junit.Assert.assertNotNull(headerList62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        java.lang.String str6 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter7 = requestBuilder1.getconverter();
        java.lang.String str8 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter9 = null;
        retrofit.RequestBuilder requestBuilder10 = new retrofit.RequestBuilder(converter9);
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        requestBuilder10.setheaders((java.util.List<retrofit.client.Header>) headerList14);
        retrofit.converter.Converter converter22 = null;
        retrofit.RequestBuilder requestBuilder23 = new retrofit.RequestBuilder(converter22);
        retrofit.converter.Converter converter24 = requestBuilder23.getconverter();
        java.util.List<retrofit.client.Header> headerList25 = requestBuilder23.headers;
        requestBuilder23.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList30 = null;
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", headerList30, typedOutput31);
        java.lang.String str33 = request32.getUrl();
        java.lang.Object[] objArray34 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder23, request32 };
        requestBuilder10.setargs(objArray34);
        java.lang.Object[] objArray36 = requestBuilder10.getargs();
        java.lang.String str37 = requestBuilder10.apiUrl;
        java.util.List<retrofit.client.Header> headerList38 = requestBuilder10.headers;
        retrofit.converter.Converter converter39 = null;
        retrofit.RequestBuilder requestBuilder40 = new retrofit.RequestBuilder(converter39);
        retrofit.client.Header[] headerArray43 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList44 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList44, headerArray43);
        retrofit.mime.TypedOutput typedOutput46 = null;
        retrofit.client.Request request47 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList44, typedOutput46);
        requestBuilder40.setheaders((java.util.List<retrofit.client.Header>) headerList44);
        retrofit.converter.Converter converter52 = null;
        retrofit.RequestBuilder requestBuilder53 = new retrofit.RequestBuilder(converter52);
        retrofit.converter.Converter converter54 = requestBuilder53.getconverter();
        java.util.List<retrofit.client.Header> headerList55 = requestBuilder53.headers;
        requestBuilder53.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList60 = null;
        retrofit.mime.TypedOutput typedOutput61 = null;
        retrofit.client.Request request62 = new retrofit.client.Request("", "", headerList60, typedOutput61);
        java.lang.String str63 = request62.getUrl();
        java.lang.Object[] objArray64 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder53, request62 };
        requestBuilder40.setargs(objArray64);
        retrofit.RequestBuilder requestBuilder67 = requestBuilder40.apiUrl("");
        java.util.List<retrofit.client.Header> headerList68 = requestBuilder40.headers;
        java.lang.Object[] objArray69 = requestBuilder40.args;
        requestBuilder10.args = objArray69;
        requestBuilder1.args = objArray69;
        java.util.List<retrofit.client.Header> headerList72 = requestBuilder1.getheaders();
        java.util.List<retrofit.client.Header> headerList73 = requestBuilder1.getheaders();
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(converter24);
        org.junit.Assert.assertNull(headerList25);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNotNull(headerArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(converter54);
        org.junit.Assert.assertNull(headerList55);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(objArray64);
        org.junit.Assert.assertNotNull(requestBuilder67);
        org.junit.Assert.assertNotNull(headerList68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNull(headerList72);
        org.junit.Assert.assertNull(headerList73);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList7 = request4.headers;
        java.lang.String str8 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.String str10 = request4.url;
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        java.lang.String str12 = request4.method;
        retrofit.mime.TypedOutput typedOutput13 = request4.getBody();
        java.lang.String str14 = request4.method;
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.url;
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.lang.String str10 = request4.method;
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.converter.Converter converter18 = requestBuilder17.getconverter();
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder17.headers;
        requestBuilder17.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder17, request26 };
        requestBuilder4.setargs(objArray28);
        java.lang.Object[] objArray30 = requestBuilder4.getargs();
        retrofit.RequestBuilder requestBuilder31 = requestBuilder1.args(objArray30);
        java.lang.String str32 = requestBuilder1.getapiUrl();
        java.lang.String str33 = requestBuilder1.apiUrl;
        retrofit.RequestBuilder requestBuilder35 = requestBuilder1.apiUrl("");
        java.lang.Object[] objArray36 = new java.lang.Object[] {};
        requestBuilder1.setargs(objArray36);
        java.util.List<retrofit.client.Header> headerList40 = null;
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("", "", headerList40, typedOutput41);
        java.lang.String str43 = request42.getUrl();
        retrofit.mime.TypedOutput typedOutput44 = request42.body;
        java.util.List<retrofit.client.Header> headerList45 = request42.getHeaders();
        java.util.List<retrofit.client.Header> headerList46 = request42.getHeaders();
        requestBuilder1.setheaders(headerList46);
        java.lang.Object[] objArray48 = requestBuilder1.getargs();
        requestBuilder1.apiUrl = "";
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNull(typedOutput44);
        org.junit.Assert.assertNotNull(headerList45);
        org.junit.Assert.assertNotNull(headerList46);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray48), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray48), "[]");
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = requestBuilder1.converter;
        retrofit.RequestBuilder requestBuilder8 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter9 = requestBuilder1.converter;
        retrofit.converter.Converter converter10 = null;
        retrofit.RequestBuilder requestBuilder11 = new retrofit.RequestBuilder(converter10);
        java.lang.String str12 = requestBuilder11.apiUrl;
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        requestBuilder17.setheaders((java.util.List<retrofit.client.Header>) headerList21);
        retrofit.converter.Converter converter29 = null;
        retrofit.RequestBuilder requestBuilder30 = new retrofit.RequestBuilder(converter29);
        retrofit.converter.Converter converter31 = requestBuilder30.getconverter();
        java.util.List<retrofit.client.Header> headerList32 = requestBuilder30.headers;
        requestBuilder30.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        java.lang.String str40 = request39.getUrl();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder30, request39 };
        requestBuilder17.setargs(objArray41);
        java.lang.Object[] objArray43 = requestBuilder17.getargs();
        retrofit.RequestBuilder requestBuilder44 = requestBuilder14.args(objArray43);
        requestBuilder11.setargs(objArray43);
        requestBuilder1.setargs(objArray43);
        java.lang.Object[] objArray47 = requestBuilder1.getargs();
        requestBuilder1.apiUrl = "hi!";
        retrofit.converter.Converter converter50 = requestBuilder1.converter;
        retrofit.converter.Converter converter55 = null;
        retrofit.RequestBuilder requestBuilder56 = new retrofit.RequestBuilder(converter55);
        retrofit.client.Header[] headerArray59 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList60 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList60, headerArray59);
        retrofit.mime.TypedOutput typedOutput62 = null;
        retrofit.client.Request request63 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList60, typedOutput62);
        requestBuilder56.setheaders((java.util.List<retrofit.client.Header>) headerList60);
        retrofit.converter.Converter converter68 = null;
        retrofit.RequestBuilder requestBuilder69 = new retrofit.RequestBuilder(converter68);
        retrofit.converter.Converter converter70 = requestBuilder69.getconverter();
        java.util.List<retrofit.client.Header> headerList71 = requestBuilder69.headers;
        requestBuilder69.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList76 = null;
        retrofit.mime.TypedOutput typedOutput77 = null;
        retrofit.client.Request request78 = new retrofit.client.Request("", "", headerList76, typedOutput77);
        java.lang.String str79 = request78.getUrl();
        java.lang.Object[] objArray80 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder69, request78 };
        requestBuilder56.setargs(objArray80);
        retrofit.RequestBuilder requestBuilder83 = requestBuilder56.apiUrl("");
        java.util.List<retrofit.client.Header> headerList84 = requestBuilder56.headers;
        retrofit.mime.TypedOutput typedOutput85 = null;
        retrofit.client.Request request86 = new retrofit.client.Request("", "hi!", headerList84, typedOutput85);
        retrofit.mime.TypedOutput typedOutput87 = null;
        retrofit.client.Request request88 = new retrofit.client.Request("hi!", "hi!", headerList84, typedOutput87);
        requestBuilder1.setheaders(headerList84);
        java.lang.Object[] objArray90 = requestBuilder1.args;
        java.lang.Object[] objArray91 = requestBuilder1.getargs();
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(converter9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(converter31);
        org.junit.Assert.assertNull(headerList32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNull(converter50);
        org.junit.Assert.assertNotNull(headerArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(converter70);
        org.junit.Assert.assertNull(headerList71);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(requestBuilder83);
        org.junit.Assert.assertNotNull(headerList84);
        org.junit.Assert.assertNotNull(objArray90);
        org.junit.Assert.assertNotNull(objArray91);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.url;
        java.lang.String str9 = request4.getUrl();
        java.lang.String str10 = request4.getUrl();
        java.lang.String str11 = request4.method;
        java.util.List<retrofit.client.Header> headerList12 = request4.headers;
        java.lang.Class<?> wildcardClass13 = headerList12.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.url;
        java.util.List<retrofit.client.Header> headerList6 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.lang.String str9 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request4.headers;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        retrofit.converter.Converter converter7 = null;
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        requestBuilder8.setheaders((java.util.List<retrofit.client.Header>) headerList12);
        java.util.List<retrofit.client.Header> headerList19 = null;
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList19, typedOutput20);
        java.lang.String str22 = request21.getUrl();
        retrofit.mime.TypedOutput typedOutput23 = request21.body;
        java.lang.Object[] objArray24 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder8, typedOutput23 };
        requestBuilder1.setargs(objArray24);
        java.lang.String str26 = requestBuilder1.apiUrl;
        java.lang.String str27 = requestBuilder1.getapiUrl();
        java.lang.String str28 = requestBuilder1.getapiUrl();
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder1.headers;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(headerList29);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        java.lang.Object[] objArray27 = requestBuilder1.args;
        retrofit.converter.Converter converter28 = null;
        retrofit.RequestBuilder requestBuilder29 = new retrofit.RequestBuilder(converter28);
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
        requestBuilder29.setheaders((java.util.List<retrofit.client.Header>) headerList33);
        retrofit.converter.Converter converter41 = null;
        retrofit.RequestBuilder requestBuilder42 = new retrofit.RequestBuilder(converter41);
        retrofit.converter.Converter converter43 = requestBuilder42.getconverter();
        java.util.List<retrofit.client.Header> headerList44 = requestBuilder42.headers;
        requestBuilder42.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList49 = null;
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("", "", headerList49, typedOutput50);
        java.lang.String str52 = request51.getUrl();
        java.lang.Object[] objArray53 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder42, request51 };
        requestBuilder29.setargs(objArray53);
        java.lang.Object[] objArray55 = requestBuilder29.getargs();
        java.util.List<retrofit.client.Header> headerList56 = null;
        requestBuilder29.headers = headerList56;
        retrofit.converter.Converter converter58 = null;
        retrofit.RequestBuilder requestBuilder59 = new retrofit.RequestBuilder(converter58);
        retrofit.converter.Converter converter60 = requestBuilder59.getconverter();
        retrofit.converter.Converter converter61 = null;
        retrofit.RequestBuilder requestBuilder62 = new retrofit.RequestBuilder(converter61);
        retrofit.client.Header[] headerArray65 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList66 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList66, headerArray65);
        retrofit.mime.TypedOutput typedOutput68 = null;
        retrofit.client.Request request69 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList66, typedOutput68);
        requestBuilder62.setheaders((java.util.List<retrofit.client.Header>) headerList66);
        retrofit.converter.Converter converter74 = null;
        retrofit.RequestBuilder requestBuilder75 = new retrofit.RequestBuilder(converter74);
        retrofit.converter.Converter converter76 = requestBuilder75.getconverter();
        java.util.List<retrofit.client.Header> headerList77 = requestBuilder75.headers;
        requestBuilder75.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList82 = null;
        retrofit.mime.TypedOutput typedOutput83 = null;
        retrofit.client.Request request84 = new retrofit.client.Request("", "", headerList82, typedOutput83);
        java.lang.String str85 = request84.getUrl();
        java.lang.Object[] objArray86 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder75, request84 };
        requestBuilder62.setargs(objArray86);
        java.lang.Object[] objArray88 = requestBuilder62.getargs();
        retrofit.RequestBuilder requestBuilder89 = requestBuilder59.args(objArray88);
        requestBuilder89.setapiUrl("");
        retrofit.converter.Converter converter92 = requestBuilder89.getconverter();
        java.util.List<retrofit.client.Header> headerList93 = requestBuilder89.getheaders();
        java.lang.String str94 = requestBuilder89.apiUrl;
        java.lang.Object[] objArray95 = requestBuilder89.getargs();
        requestBuilder29.setargs(objArray95);
        requestBuilder1.args = objArray95;
        retrofit.converter.Converter converter98 = requestBuilder1.getconverter();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(converter43);
        org.junit.Assert.assertNull(headerList44);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(objArray53);
        org.junit.Assert.assertNotNull(objArray55);
        org.junit.Assert.assertNull(converter60);
        org.junit.Assert.assertNotNull(headerArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNull(converter76);
        org.junit.Assert.assertNull(headerList77);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertNotNull(objArray86);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNotNull(requestBuilder89);
        org.junit.Assert.assertNull(converter92);
        org.junit.Assert.assertNull(headerList93);
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertNotNull(objArray95);
        org.junit.Assert.assertNull(converter98);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = requestBuilder1.converter;
        retrofit.RequestBuilder requestBuilder8 = requestBuilder1.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder10 = requestBuilder8.apiUrl("hi!");
        retrofit.converter.Converter converter11 = null;
        retrofit.RequestBuilder requestBuilder12 = new retrofit.RequestBuilder(converter11);
        retrofit.converter.Converter converter13 = requestBuilder12.getconverter();
        retrofit.converter.Converter converter14 = null;
        retrofit.RequestBuilder requestBuilder15 = new retrofit.RequestBuilder(converter14);
        retrofit.client.Header[] headerArray18 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList19 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList19, headerArray18);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList19, typedOutput21);
        requestBuilder15.setheaders((java.util.List<retrofit.client.Header>) headerList19);
        retrofit.converter.Converter converter27 = null;
        retrofit.RequestBuilder requestBuilder28 = new retrofit.RequestBuilder(converter27);
        retrofit.converter.Converter converter29 = requestBuilder28.getconverter();
        java.util.List<retrofit.client.Header> headerList30 = requestBuilder28.headers;
        requestBuilder28.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList35 = null;
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", headerList35, typedOutput36);
        java.lang.String str38 = request37.getUrl();
        java.lang.Object[] objArray39 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder28, request37 };
        requestBuilder15.setargs(objArray39);
        java.lang.Object[] objArray41 = requestBuilder15.getargs();
        retrofit.RequestBuilder requestBuilder42 = requestBuilder12.args(objArray41);
        java.lang.String str43 = requestBuilder12.getapiUrl();
        java.lang.String str44 = requestBuilder12.apiUrl;
        retrofit.RequestBuilder requestBuilder46 = requestBuilder12.apiUrl("");
        java.lang.Object[] objArray47 = new java.lang.Object[] {};
        requestBuilder12.setargs(objArray47);
        java.util.List<retrofit.client.Header> headerList51 = null;
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("", "", headerList51, typedOutput52);
        java.lang.String str54 = request53.getUrl();
        retrofit.mime.TypedOutput typedOutput55 = request53.body;
        java.util.List<retrofit.client.Header> headerList56 = request53.getHeaders();
        java.util.List<retrofit.client.Header> headerList57 = request53.getHeaders();
        requestBuilder12.setheaders(headerList57);
        requestBuilder8.headers = headerList57;
        retrofit.converter.Converter converter60 = null;
        retrofit.RequestBuilder requestBuilder61 = new retrofit.RequestBuilder(converter60);
        retrofit.client.Header[] headerArray64 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList65 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList65, headerArray64);
        retrofit.mime.TypedOutput typedOutput67 = null;
        retrofit.client.Request request68 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList65, typedOutput67);
        requestBuilder61.setheaders((java.util.List<retrofit.client.Header>) headerList65);
        retrofit.converter.Converter converter73 = null;
        retrofit.RequestBuilder requestBuilder74 = new retrofit.RequestBuilder(converter73);
        retrofit.converter.Converter converter75 = requestBuilder74.getconverter();
        java.util.List<retrofit.client.Header> headerList76 = requestBuilder74.headers;
        requestBuilder74.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList81 = null;
        retrofit.mime.TypedOutput typedOutput82 = null;
        retrofit.client.Request request83 = new retrofit.client.Request("", "", headerList81, typedOutput82);
        java.lang.String str84 = request83.getUrl();
        java.lang.Object[] objArray85 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder74, request83 };
        requestBuilder61.setargs(objArray85);
        java.lang.String str87 = requestBuilder61.getapiUrl();
        java.lang.Object[] objArray88 = requestBuilder61.args;
        retrofit.RequestBuilder requestBuilder89 = requestBuilder8.args(objArray88);
        requestBuilder89.setapiUrl("");
        java.util.List<retrofit.client.Header> headerList92 = requestBuilder89.headers;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(converter29);
        org.junit.Assert.assertNull(headerList30);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray47), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray47), "[]");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNull(typedOutput55);
        org.junit.Assert.assertNotNull(headerList56);
        org.junit.Assert.assertNotNull(headerList57);
        org.junit.Assert.assertNotNull(headerArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(converter75);
        org.junit.Assert.assertNull(headerList76);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(objArray85);
        org.junit.Assert.assertNull(str87);
        org.junit.Assert.assertNotNull(objArray88);
        org.junit.Assert.assertNotNull(requestBuilder89);
        org.junit.Assert.assertNotNull(headerList92);
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.url;
        java.lang.String str6 = request4.url;
        retrofit.mime.TypedOutput typedOutput7 = request4.body;
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request4.headers;
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        java.lang.Class<?> wildcardClass12 = headerList11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.converter.Converter converter6 = requestBuilder5.getconverter();
        retrofit.converter.Converter converter7 = null;
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        requestBuilder8.setheaders((java.util.List<retrofit.client.Header>) headerList12);
        retrofit.converter.Converter converter20 = null;
        retrofit.RequestBuilder requestBuilder21 = new retrofit.RequestBuilder(converter20);
        retrofit.converter.Converter converter22 = requestBuilder21.getconverter();
        java.util.List<retrofit.client.Header> headerList23 = requestBuilder21.headers;
        requestBuilder21.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList28 = null;
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", headerList28, typedOutput29);
        java.lang.String str31 = request30.getUrl();
        java.lang.Object[] objArray32 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder21, request30 };
        requestBuilder8.setargs(objArray32);
        java.lang.Object[] objArray34 = requestBuilder8.getargs();
        retrofit.RequestBuilder requestBuilder35 = requestBuilder5.args(objArray34);
        retrofit.converter.Converter converter36 = requestBuilder5.getconverter();
        java.util.List<retrofit.client.Header> headerList39 = null;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = request41.getBody();
        java.util.List<retrofit.client.Header> headerList43 = request41.headers;
        requestBuilder5.setheaders(headerList43);
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("", "", headerList43, typedOutput45);
        java.util.List<retrofit.client.Header> headerList47 = request46.getHeaders();
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("hi!", "hi!", headerList47, typedOutput48);
        retrofit.mime.TypedOutput typedOutput50 = request49.body;
        java.util.List<retrofit.client.Header> headerList51 = request49.headers;
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(converter22);
        org.junit.Assert.assertNull(headerList23);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNotNull(objArray34);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNull(converter36);
        org.junit.Assert.assertNull(typedOutput42);
        org.junit.Assert.assertNotNull(headerList43);
        org.junit.Assert.assertNotNull(headerList47);
        org.junit.Assert.assertNull(typedOutput50);
        org.junit.Assert.assertNotNull(headerList51);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        java.lang.String str10 = requestBuilder1.getapiUrl();
        retrofit.RequestBuilder requestBuilder12 = requestBuilder1.apiUrl("");
        java.lang.Object[] objArray13 = requestBuilder1.getargs();
        java.util.List<retrofit.client.Header> headerList18 = null;
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", headerList18, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        retrofit.mime.TypedOutput typedOutput22 = request20.getBody();
        java.lang.String str23 = request20.getMethod();
        java.lang.String str24 = request20.method;
        java.lang.String str25 = request20.method;
        java.util.List<retrofit.client.Header> headerList26 = request20.headers;
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "hi!", headerList26, typedOutput27);
        requestBuilder1.setheaders(headerList26);
        java.util.List<retrofit.client.Header> headerList30 = requestBuilder1.headers;
        requestBuilder1.apiUrl = "";
        java.lang.String str33 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter34 = null;
        retrofit.RequestBuilder requestBuilder35 = new retrofit.RequestBuilder(converter34);
        java.util.List<retrofit.client.Header> headerList38 = null;
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "", headerList38, typedOutput39);
        retrofit.mime.TypedOutput typedOutput41 = request40.getBody();
        retrofit.mime.TypedOutput typedOutput42 = request40.getBody();
        java.util.List<retrofit.client.Header> headerList43 = request40.headers;
        requestBuilder35.setheaders(headerList43);
        retrofit.converter.Converter converter45 = null;
        retrofit.RequestBuilder requestBuilder46 = new retrofit.RequestBuilder(converter45);
        retrofit.client.Header[] headerArray49 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList50 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList50, headerArray49);
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList50, typedOutput52);
        requestBuilder46.setheaders((java.util.List<retrofit.client.Header>) headerList50);
        retrofit.converter.Converter converter58 = null;
        retrofit.RequestBuilder requestBuilder59 = new retrofit.RequestBuilder(converter58);
        retrofit.converter.Converter converter60 = requestBuilder59.getconverter();
        java.util.List<retrofit.client.Header> headerList61 = requestBuilder59.headers;
        requestBuilder59.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList66 = null;
        retrofit.mime.TypedOutput typedOutput67 = null;
        retrofit.client.Request request68 = new retrofit.client.Request("", "", headerList66, typedOutput67);
        java.lang.String str69 = request68.getUrl();
        java.lang.Object[] objArray70 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder59, request68 };
        requestBuilder46.setargs(objArray70);
        requestBuilder35.args = objArray70;
        retrofit.RequestBuilder requestBuilder73 = requestBuilder1.args(objArray70);
        java.util.List<retrofit.client.Header> headerList74 = requestBuilder73.getheaders();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(requestBuilder12);
        org.junit.Assert.assertNull(objArray13);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(typedOutput41);
        org.junit.Assert.assertNull(typedOutput42);
        org.junit.Assert.assertNotNull(headerList43);
        org.junit.Assert.assertNotNull(headerArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(converter60);
        org.junit.Assert.assertNull(headerList61);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(requestBuilder73);
        org.junit.Assert.assertNotNull(headerList74);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        retrofit.mime.TypedOutput typedOutput7 = request4.body;
        retrofit.mime.TypedOutput typedOutput8 = request4.body;
        java.util.List<retrofit.client.Header> headerList9 = request4.headers;
        java.lang.String str10 = request4.url;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.converter.Converter converter18 = requestBuilder17.getconverter();
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder17.headers;
        requestBuilder17.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder17, request26 };
        requestBuilder4.setargs(objArray28);
        java.lang.Object[] objArray30 = requestBuilder4.getargs();
        retrofit.RequestBuilder requestBuilder31 = requestBuilder1.args(objArray30);
        java.util.List<retrofit.client.Header> headerList32 = requestBuilder1.getheaders();
        java.util.List<retrofit.client.Header> headerList33 = null;
        retrofit.RequestBuilder requestBuilder34 = requestBuilder1.headers(headerList33);
        java.lang.Object[] objArray35 = requestBuilder1.getargs();
        java.lang.String str36 = requestBuilder1.apiUrl;
        java.lang.String str37 = requestBuilder1.apiUrl;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(headerList32);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.String str2 = requestBuilder1.apiUrl;
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.converter.Converter converter19 = requestBuilder18.getconverter();
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder18.headers;
        requestBuilder18.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList25 = null;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder18, request27 };
        requestBuilder5.setargs(objArray29);
        requestBuilder5.apiUrl = "";
        retrofit.RequestBuilder requestBuilder34 = requestBuilder5.apiUrl("hi!");
        retrofit.converter.Converter converter35 = null;
        retrofit.RequestBuilder requestBuilder36 = new retrofit.RequestBuilder(converter35);
        java.util.List<retrofit.client.Header> headerList39 = null;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = request41.getBody();
        retrofit.mime.TypedOutput typedOutput43 = request41.getBody();
        java.util.List<retrofit.client.Header> headerList44 = request41.headers;
        requestBuilder36.setheaders(headerList44);
        retrofit.RequestBuilder requestBuilder46 = requestBuilder5.headers(headerList44);
        java.lang.Object[] objArray47 = requestBuilder5.getargs();
        retrofit.RequestBuilder requestBuilder49 = requestBuilder5.apiUrl("hi!");
        java.lang.Object[] objArray50 = new java.lang.Object[] {};
        requestBuilder5.args = objArray50;
        retrofit.RequestBuilder requestBuilder52 = requestBuilder1.args(objArray50);
        retrofit.RequestBuilder requestBuilder54 = requestBuilder52.apiUrl("");
        retrofit.RequestBuilder requestBuilder56 = requestBuilder52.apiUrl("hi!");
        requestBuilder52.setapiUrl("");
        retrofit.RequestBuilder requestBuilder60 = requestBuilder52.apiUrl("hi!");
        retrofit.converter.Converter converter61 = requestBuilder60.getconverter();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(headerList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNull(typedOutput42);
        org.junit.Assert.assertNull(typedOutput43);
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(requestBuilder49);
        org.junit.Assert.assertNotNull(objArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray50), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray50), "[]");
        org.junit.Assert.assertNotNull(requestBuilder52);
        org.junit.Assert.assertNotNull(requestBuilder54);
        org.junit.Assert.assertNotNull(requestBuilder56);
        org.junit.Assert.assertNotNull(requestBuilder60);
        org.junit.Assert.assertNull(converter61);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.headers;
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", headerList12, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "hi!", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = request17.body;
        java.lang.String str19 = request17.getUrl();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        java.lang.String str14 = requestBuilder5.getapiUrl();
        retrofit.RequestBuilder requestBuilder16 = requestBuilder5.apiUrl("");
        java.util.List<retrofit.client.Header> headerList19 = null;
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList19, typedOutput20);
        java.lang.String str22 = request21.url;
        java.util.List<retrofit.client.Header> headerList23 = request21.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request21.getHeaders();
        requestBuilder5.headers = headerList24;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList24, typedOutput26);
        java.lang.String str28 = request27.getMethod();
        retrofit.mime.TypedOutput typedOutput29 = request27.getBody();
        java.util.List<retrofit.client.Header> headerList30 = request27.getHeaders();
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "hi!", headerList30, typedOutput31);
        java.util.List<retrofit.client.Header> headerList33 = request32.getHeaders();
        java.lang.String str34 = request32.url;
        retrofit.mime.TypedOutput typedOutput35 = request32.body;
        java.util.List<retrofit.client.Header> headerList36 = request32.headers;
        java.util.List<retrofit.client.Header> headerList37 = request32.headers;
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(typedOutput29);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNull(typedOutput35);
        org.junit.Assert.assertNotNull(headerList36);
        org.junit.Assert.assertNotNull(headerList37);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        requestBuilder1.setapiUrl("hi!");
        java.lang.String str8 = requestBuilder1.apiUrl;
        java.lang.String str9 = requestBuilder1.apiUrl;
        retrofit.RequestBuilder requestBuilder11 = requestBuilder1.apiUrl("");
        retrofit.converter.Converter converter12 = requestBuilder11.getconverter();
        java.lang.Object[] objArray13 = requestBuilder11.getargs();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = objArray13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(requestBuilder11);
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(objArray13);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList6 = request4.getHeaders();
        java.lang.String str7 = request4.url;
        java.lang.String str8 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request4.headers;
        java.lang.String str10 = request4.getUrl();
        java.lang.String str11 = request4.method;
        retrofit.mime.TypedOutput typedOutput12 = request4.getBody();
        java.lang.String str13 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput14 = request4.body;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(typedOutput14);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        java.lang.String str7 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request4.body;
        retrofit.mime.TypedOutput typedOutput9 = request4.body;
        java.lang.String str10 = request4.method;
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request4.headers;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput9 = request6.body;
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = request6.body;
        retrofit.mime.TypedOutput typedOutput12 = request6.getBody();
        java.lang.String str13 = request6.url;
        java.lang.String str14 = request6.url;
        java.util.List<retrofit.client.Header> headerList15 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = request6.getBody();
        java.lang.String str17 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList18 = request6.headers;
        java.util.List<retrofit.client.Header> headerList19 = request6.headers;
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        requestBuilder1.apiUrl = "";
        retrofit.RequestBuilder requestBuilder30 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        retrofit.client.Header[] headerArray35 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList36 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList36, headerArray35);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList36, typedOutput38);
        requestBuilder32.setheaders((java.util.List<retrofit.client.Header>) headerList36);
        retrofit.converter.Converter converter44 = null;
        retrofit.RequestBuilder requestBuilder45 = new retrofit.RequestBuilder(converter44);
        retrofit.converter.Converter converter46 = requestBuilder45.getconverter();
        java.util.List<retrofit.client.Header> headerList47 = requestBuilder45.headers;
        requestBuilder45.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList52 = null;
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("", "", headerList52, typedOutput53);
        java.lang.String str55 = request54.getUrl();
        java.lang.Object[] objArray56 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder45, request54 };
        requestBuilder32.setargs(objArray56);
        java.lang.String str58 = requestBuilder32.getapiUrl();
        java.lang.Object[] objArray59 = requestBuilder32.args;
        retrofit.RequestBuilder requestBuilder60 = requestBuilder30.args(objArray59);
        retrofit.RequestBuilder requestBuilder62 = requestBuilder30.apiUrl("hi!");
        java.lang.String str63 = requestBuilder30.apiUrl;
        java.util.List<retrofit.client.Header> headerList64 = requestBuilder30.getheaders();
        java.util.List<retrofit.client.Header> headerList65 = requestBuilder30.headers;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(headerArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNull(converter46);
        org.junit.Assert.assertNull(headerList47);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(requestBuilder60);
        org.junit.Assert.assertNotNull(requestBuilder62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertNotNull(headerList64);
        org.junit.Assert.assertNotNull(headerList65);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        java.lang.String str27 = requestBuilder1.getapiUrl();
        retrofit.RequestBuilder requestBuilder29 = requestBuilder1.apiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList30 = requestBuilder1.headers;
        retrofit.RequestBuilder requestBuilder32 = requestBuilder1.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder34 = requestBuilder32.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder36 = requestBuilder32.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder38 = requestBuilder32.apiUrl("hi!");
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(requestBuilder36);
        org.junit.Assert.assertNotNull(requestBuilder38);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        requestBuilder1.setheaders(headerList9);
        requestBuilder1.setapiUrl("");
        retrofit.RequestBuilder requestBuilder14 = requestBuilder1.apiUrl("");
        requestBuilder1.setapiUrl("");
        retrofit.converter.Converter converter17 = requestBuilder1.converter;
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        requestBuilder19.setheaders((java.util.List<retrofit.client.Header>) headerList23);
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        retrofit.converter.Converter converter33 = requestBuilder32.getconverter();
        java.util.List<retrofit.client.Header> headerList34 = requestBuilder32.headers;
        requestBuilder32.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList39 = null;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        java.lang.String str42 = request41.getUrl();
        java.lang.Object[] objArray43 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder32, request41 };
        requestBuilder19.setargs(objArray43);
        requestBuilder19.apiUrl = "";
        java.util.List<retrofit.client.Header> headerList47 = requestBuilder19.headers;
        java.util.List<retrofit.client.Header> headerList48 = requestBuilder19.headers;
        retrofit.converter.Converter converter49 = requestBuilder19.getconverter();
        retrofit.RequestBuilder requestBuilder51 = requestBuilder19.apiUrl("hi!");
        requestBuilder51.setapiUrl("hi!");
        retrofit.RequestBuilder requestBuilder55 = requestBuilder51.apiUrl("hi!");
        java.lang.Object[] objArray56 = requestBuilder55.getargs();
        retrofit.RequestBuilder requestBuilder57 = requestBuilder1.args(objArray56);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(requestBuilder14);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(converter33);
        org.junit.Assert.assertNull(headerList34);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(headerList47);
        org.junit.Assert.assertNotNull(headerList48);
        org.junit.Assert.assertNull(converter49);
        org.junit.Assert.assertNotNull(requestBuilder51);
        org.junit.Assert.assertNotNull(requestBuilder55);
        org.junit.Assert.assertNotNull(objArray56);
        org.junit.Assert.assertNotNull(requestBuilder57);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.url;
        java.util.List<retrofit.client.Header> headerList9 = request4.headers;
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput11 = request4.body;
        java.lang.String str12 = request4.getUrl();
        java.lang.String str13 = request4.getMethod();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        requestBuilder1.apiUrl = "";
        retrofit.RequestBuilder requestBuilder30 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        java.util.List<retrofit.client.Header> headerList35 = null;
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", headerList35, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.getBody();
        retrofit.mime.TypedOutput typedOutput39 = request37.getBody();
        java.util.List<retrofit.client.Header> headerList40 = request37.headers;
        requestBuilder32.setheaders(headerList40);
        retrofit.RequestBuilder requestBuilder42 = requestBuilder1.headers(headerList40);
        java.lang.Object[] objArray43 = requestBuilder1.getargs();
        retrofit.RequestBuilder requestBuilder45 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter46 = requestBuilder1.converter;
        java.lang.Object[] objArray47 = requestBuilder1.args;
        java.lang.String str48 = requestBuilder1.apiUrl;
        requestBuilder1.apiUrl = "";
        java.util.List<retrofit.client.Header> headerList51 = requestBuilder1.getheaders();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNull(typedOutput39);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(requestBuilder45);
        org.junit.Assert.assertNull(converter46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(headerList51);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.url;
        java.lang.String str6 = request4.url;
        java.util.List<retrofit.client.Header> headerList7 = request4.headers;
        java.lang.String str8 = request4.method;
        retrofit.mime.TypedOutput typedOutput9 = request4.body;
        java.lang.String str10 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput11 = request4.body;
        retrofit.mime.TypedOutput typedOutput12 = request4.getBody();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.RequestBuilder requestBuilder3 = requestBuilder1.apiUrl("hi!");
        requestBuilder3.apiUrl = "";
        requestBuilder3.setapiUrl("hi!");
        java.lang.Object[] objArray8 = requestBuilder3.getargs();
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(objArray8);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = requestBuilder1.converter;
        retrofit.RequestBuilder requestBuilder8 = requestBuilder1.apiUrl("hi!");
        retrofit.RequestBuilder requestBuilder10 = requestBuilder8.apiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList17 = null;
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        java.lang.String str20 = request19.getUrl();
        retrofit.mime.TypedOutput typedOutput21 = request19.body;
        java.lang.String str22 = request19.getUrl();
        java.lang.String str23 = request19.url;
        java.lang.String str24 = request19.getUrl();
        java.util.List<retrofit.client.Header> headerList25 = request19.headers;
        java.util.List<retrofit.client.Header> headerList26 = request19.getHeaders();
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "", headerList26, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "", headerList26, typedOutput29);
        retrofit.RequestBuilder requestBuilder31 = requestBuilder8.headers(headerList26);
        java.lang.Object[] objArray32 = requestBuilder31.args;
        java.lang.Object[] objArray33 = requestBuilder31.getargs();
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNotNull(requestBuilder10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(objArray32);
        org.junit.Assert.assertNull(objArray33);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        java.lang.String str27 = requestBuilder1.getapiUrl();
        java.lang.Object[] objArray28 = requestBuilder1.args;
        java.lang.String str29 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter30 = requestBuilder1.converter;
        // The following exception was thrown during execution in test generation
        try {
            retrofit.mime.TypedOutput typedOutput31 = requestBuilder1.buildBody();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(converter30);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.url;
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request4.headers;
        retrofit.mime.TypedOutput typedOutput9 = request4.body;
        java.lang.String str10 = request4.getMethod();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.String str2 = requestBuilder1.apiUrl;
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        java.lang.Object[] objArray4 = requestBuilder1.getargs();
        requestBuilder1.setapiUrl("hi!");
        requestBuilder1.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder1.getheaders();
        java.lang.String str10 = requestBuilder1.apiUrl;
        requestBuilder1.setapiUrl("");
        retrofit.converter.Converter converter13 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList14 = requestBuilder1.headers;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(headerList14);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.String str2 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.converter.Converter converter5 = requestBuilder4.getconverter();
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        requestBuilder7.setheaders((java.util.List<retrofit.client.Header>) headerList11);
        retrofit.converter.Converter converter19 = null;
        retrofit.RequestBuilder requestBuilder20 = new retrofit.RequestBuilder(converter19);
        retrofit.converter.Converter converter21 = requestBuilder20.getconverter();
        java.util.List<retrofit.client.Header> headerList22 = requestBuilder20.headers;
        requestBuilder20.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList27 = null;
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", headerList27, typedOutput28);
        java.lang.String str30 = request29.getUrl();
        java.lang.Object[] objArray31 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder20, request29 };
        requestBuilder7.setargs(objArray31);
        java.lang.Object[] objArray33 = requestBuilder7.getargs();
        retrofit.RequestBuilder requestBuilder34 = requestBuilder4.args(objArray33);
        requestBuilder1.setargs(objArray33);
        java.lang.String str36 = requestBuilder1.getapiUrl();
        java.lang.String str37 = requestBuilder1.getapiUrl();
        java.lang.Object[] objArray38 = requestBuilder1.getargs();
        requestBuilder1.setapiUrl("hi!");
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request41 = requestBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNull(headerList22);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(objArray38);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.converter.Converter converter19 = requestBuilder18.getconverter();
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder18.headers;
        requestBuilder18.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList25 = null;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder18, request27 };
        requestBuilder5.setargs(objArray29);
        retrofit.RequestBuilder requestBuilder32 = requestBuilder5.apiUrl("");
        java.util.List<retrofit.client.Header> headerList33 = requestBuilder5.headers;
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("hi!", "hi!", headerList33, typedOutput34);
        java.lang.String str36 = request35.url;
        java.util.List<retrofit.client.Header> headerList37 = request35.headers;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.getBody();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(headerList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNull(typedOutput40);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        requestBuilder1.apiUrl = "";
        retrofit.RequestBuilder requestBuilder30 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        java.util.List<retrofit.client.Header> headerList35 = null;
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", headerList35, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.getBody();
        retrofit.mime.TypedOutput typedOutput39 = request37.getBody();
        java.util.List<retrofit.client.Header> headerList40 = request37.headers;
        requestBuilder32.setheaders(headerList40);
        retrofit.RequestBuilder requestBuilder42 = requestBuilder1.headers(headerList40);
        java.lang.Object[] objArray43 = requestBuilder1.getargs();
        java.lang.Object[] objArray44 = requestBuilder1.getargs();
        java.util.List<retrofit.client.Header> headerList47 = null;
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "", headerList47, typedOutput48);
        retrofit.mime.TypedOutput typedOutput50 = request49.getBody();
        java.util.List<retrofit.client.Header> headerList51 = request49.headers;
        java.util.List<retrofit.client.Header> headerList52 = request49.headers;
        requestBuilder1.headers = headerList52;
        requestBuilder1.apiUrl = "";
        requestBuilder1.setapiUrl("");
        requestBuilder1.apiUrl = "hi!";
        java.lang.Object[] objArray60 = requestBuilder1.getargs();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNull(typedOutput39);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(objArray44);
        org.junit.Assert.assertNull(typedOutput50);
        org.junit.Assert.assertNotNull(headerList51);
        org.junit.Assert.assertNotNull(headerList52);
        org.junit.Assert.assertNotNull(objArray60);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        retrofit.RequestBuilder requestBuilder28 = requestBuilder1.apiUrl("");
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder1.headers;
        java.lang.String str30 = requestBuilder1.getapiUrl();
        retrofit.converter.Converter converter31 = requestBuilder1.converter;
        requestBuilder1.setapiUrl("hi!");
        java.lang.Object[] objArray34 = null;
        requestBuilder1.args = objArray34;
        retrofit.converter.Converter converter38 = null;
        retrofit.RequestBuilder requestBuilder39 = new retrofit.RequestBuilder(converter38);
        retrofit.client.Header[] headerArray42 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList43 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList43, headerArray42);
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList43, typedOutput45);
        requestBuilder39.setheaders((java.util.List<retrofit.client.Header>) headerList43);
        retrofit.converter.Converter converter51 = null;
        retrofit.RequestBuilder requestBuilder52 = new retrofit.RequestBuilder(converter51);
        retrofit.converter.Converter converter53 = requestBuilder52.getconverter();
        java.util.List<retrofit.client.Header> headerList54 = requestBuilder52.headers;
        requestBuilder52.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList59 = null;
        retrofit.mime.TypedOutput typedOutput60 = null;
        retrofit.client.Request request61 = new retrofit.client.Request("", "", headerList59, typedOutput60);
        java.lang.String str62 = request61.getUrl();
        java.lang.Object[] objArray63 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder52, request61 };
        requestBuilder39.setargs(objArray63);
        java.lang.Object[] objArray65 = requestBuilder39.getargs();
        java.util.List<retrofit.client.Header> headerList66 = null;
        requestBuilder39.headers = headerList66;
        retrofit.converter.Converter converter68 = requestBuilder39.getconverter();
        java.lang.Object[] objArray69 = requestBuilder39.args;
        java.lang.String str70 = requestBuilder39.apiUrl;
        java.util.List<retrofit.client.Header> headerList71 = requestBuilder39.getheaders();
        java.util.List<retrofit.client.Header> headerList74 = null;
        retrofit.mime.TypedOutput typedOutput75 = null;
        retrofit.client.Request request76 = new retrofit.client.Request("", "", headerList74, typedOutput75);
        retrofit.mime.TypedOutput typedOutput77 = request76.getBody();
        retrofit.mime.TypedOutput typedOutput78 = request76.getBody();
        java.lang.String str79 = request76.getUrl();
        java.util.List<retrofit.client.Header> headerList80 = request76.headers;
        requestBuilder39.setheaders(headerList80);
        java.lang.String str82 = requestBuilder39.apiUrl;
        java.util.List<retrofit.client.Header> headerList83 = requestBuilder39.getheaders();
        retrofit.mime.TypedOutput typedOutput84 = null;
        retrofit.client.Request request85 = new retrofit.client.Request("", "", headerList83, typedOutput84);
        retrofit.RequestBuilder requestBuilder86 = requestBuilder1.headers(headerList83);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(converter31);
        org.junit.Assert.assertNotNull(headerArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(converter53);
        org.junit.Assert.assertNull(headerList54);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(objArray65);
        org.junit.Assert.assertNull(converter68);
        org.junit.Assert.assertNotNull(objArray69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNull(headerList71);
        org.junit.Assert.assertNull(typedOutput77);
        org.junit.Assert.assertNull(typedOutput78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(headerList80);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(headerList83);
        org.junit.Assert.assertNotNull(requestBuilder86);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.converter.Converter converter18 = requestBuilder17.getconverter();
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder17.headers;
        requestBuilder17.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder17, request26 };
        requestBuilder4.setargs(objArray28);
        java.lang.Object[] objArray30 = requestBuilder4.getargs();
        retrofit.RequestBuilder requestBuilder31 = requestBuilder1.args(objArray30);
        java.lang.String str32 = requestBuilder1.getapiUrl();
        java.lang.String str33 = requestBuilder1.apiUrl;
        retrofit.RequestBuilder requestBuilder35 = requestBuilder1.apiUrl("");
        java.util.List<retrofit.client.Header> headerList36 = null;
        retrofit.RequestBuilder requestBuilder37 = requestBuilder35.headers(headerList36);
        retrofit.RequestBuilder requestBuilder39 = requestBuilder35.apiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList40 = requestBuilder35.getheaders();
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(requestBuilder39);
        org.junit.Assert.assertNull(headerList40);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList7 = request4.headers;
        java.lang.String str8 = request4.getUrl();
        java.lang.String str9 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList10 = request4.headers;
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput12 = request4.getBody();
        java.lang.String str13 = request4.method;
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList3 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter6 = requestBuilder1.converter;
        java.util.List<retrofit.client.Header> headerList7 = requestBuilder1.getheaders();
        retrofit.RequestBuilder requestBuilder9 = requestBuilder1.apiUrl("");
        java.lang.String str10 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter11 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList14 = null;
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", headerList14, typedOutput15);
        java.lang.String str17 = request16.getUrl();
        retrofit.mime.TypedOutput typedOutput18 = request16.getBody();
        java.util.List<retrofit.client.Header> headerList19 = request16.headers;
        java.lang.String str20 = request16.getUrl();
        java.lang.String str21 = request16.getMethod();
        java.lang.String str22 = request16.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request16.headers;
        retrofit.RequestBuilder requestBuilder24 = requestBuilder1.headers(headerList23);
        retrofit.converter.Converter converter25 = requestBuilder24.converter;
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(headerList3);
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNull(headerList7);
        org.junit.Assert.assertNotNull(requestBuilder9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(converter11);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNull(converter25);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        java.lang.Object[] objArray29 = requestBuilder3.getargs();
        java.lang.String str30 = requestBuilder3.apiUrl;
        java.util.List<retrofit.client.Header> headerList33 = null;
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "", headerList33, typedOutput34);
        java.lang.String str36 = request35.getUrl();
        retrofit.mime.TypedOutput typedOutput37 = request35.body;
        java.util.List<retrofit.client.Header> headerList38 = request35.getHeaders();
        requestBuilder3.setheaders(headerList38);
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "hi!", headerList38, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = request41.body;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(typedOutput37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNull(typedOutput42);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        requestBuilder1.setheaders(headerList9);
        retrofit.converter.Converter converter11 = null;
        retrofit.RequestBuilder requestBuilder12 = new retrofit.RequestBuilder(converter11);
        retrofit.converter.Converter converter13 = requestBuilder12.getconverter();
        java.util.List<retrofit.client.Header> headerList14 = requestBuilder12.headers;
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        requestBuilder19.setheaders((java.util.List<retrofit.client.Header>) headerList23);
        java.util.List<retrofit.client.Header> headerList30 = null;
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", headerList30, typedOutput31);
        java.lang.String str33 = request32.getUrl();
        retrofit.mime.TypedOutput typedOutput34 = request32.body;
        java.lang.Object[] objArray35 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder19, typedOutput34 };
        requestBuilder12.setargs(objArray35);
        retrofit.RequestBuilder requestBuilder37 = requestBuilder1.args(objArray35);
        java.util.List<retrofit.client.Header> headerList38 = requestBuilder37.headers;
        retrofit.converter.Converter converter39 = requestBuilder37.getconverter();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(converter13);
        org.junit.Assert.assertNull(headerList14);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNull(typedOutput34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNull(converter39);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        java.lang.Object[] objArray29 = requestBuilder3.getargs();
        java.lang.String str30 = requestBuilder3.apiUrl;
        retrofit.converter.Converter converter31 = null;
        retrofit.RequestBuilder requestBuilder32 = new retrofit.RequestBuilder(converter31);
        java.util.List<retrofit.client.Header> headerList35 = null;
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", headerList35, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.getBody();
        retrofit.mime.TypedOutput typedOutput39 = request37.getBody();
        java.util.List<retrofit.client.Header> headerList40 = request37.headers;
        requestBuilder32.setheaders(headerList40);
        retrofit.converter.Converter converter42 = null;
        retrofit.RequestBuilder requestBuilder43 = new retrofit.RequestBuilder(converter42);
        retrofit.converter.Converter converter44 = requestBuilder43.getconverter();
        java.util.List<retrofit.client.Header> headerList45 = requestBuilder43.headers;
        retrofit.converter.Converter converter49 = null;
        retrofit.RequestBuilder requestBuilder50 = new retrofit.RequestBuilder(converter49);
        retrofit.client.Header[] headerArray53 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList54 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList54, headerArray53);
        retrofit.mime.TypedOutput typedOutput56 = null;
        retrofit.client.Request request57 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList54, typedOutput56);
        requestBuilder50.setheaders((java.util.List<retrofit.client.Header>) headerList54);
        java.util.List<retrofit.client.Header> headerList61 = null;
        retrofit.mime.TypedOutput typedOutput62 = null;
        retrofit.client.Request request63 = new retrofit.client.Request("", "", headerList61, typedOutput62);
        java.lang.String str64 = request63.getUrl();
        retrofit.mime.TypedOutput typedOutput65 = request63.body;
        java.lang.Object[] objArray66 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder50, typedOutput65 };
        requestBuilder43.setargs(objArray66);
        retrofit.RequestBuilder requestBuilder68 = requestBuilder32.args(objArray66);
        java.util.List<retrofit.client.Header> headerList69 = requestBuilder68.headers;
        requestBuilder3.headers = headerList69;
        retrofit.mime.TypedOutput typedOutput71 = null;
        retrofit.client.Request request72 = new retrofit.client.Request("hi!", "", headerList69, typedOutput71);
        java.lang.String str73 = request72.url;
        java.util.List<retrofit.client.Header> headerList74 = request72.getHeaders();
        java.util.List<retrofit.client.Header> headerList75 = request72.getHeaders();
        java.lang.String str76 = request72.getMethod();
        java.lang.String str77 = request72.getUrl();
        retrofit.mime.TypedOutput typedOutput78 = request72.getBody();
        java.lang.String str79 = request72.getMethod();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNull(typedOutput39);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNull(converter44);
        org.junit.Assert.assertNull(headerList45);
        org.junit.Assert.assertNotNull(headerArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNull(typedOutput65);
        org.junit.Assert.assertNotNull(objArray66);
        org.junit.Assert.assertNotNull(requestBuilder68);
        org.junit.Assert.assertNotNull(headerList69);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(headerList74);
        org.junit.Assert.assertNotNull(headerList75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNull(typedOutput78);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        java.lang.Object[] objArray27 = requestBuilder1.getargs();
        java.util.List<retrofit.client.Header> headerList28 = null;
        requestBuilder1.headers = headerList28;
        retrofit.converter.Converter converter30 = null;
        retrofit.RequestBuilder requestBuilder31 = new retrofit.RequestBuilder(converter30);
        retrofit.converter.Converter converter32 = requestBuilder31.getconverter();
        retrofit.converter.Converter converter33 = null;
        retrofit.RequestBuilder requestBuilder34 = new retrofit.RequestBuilder(converter33);
        retrofit.client.Header[] headerArray37 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList38 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList38, headerArray37);
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList38, typedOutput40);
        requestBuilder34.setheaders((java.util.List<retrofit.client.Header>) headerList38);
        retrofit.converter.Converter converter46 = null;
        retrofit.RequestBuilder requestBuilder47 = new retrofit.RequestBuilder(converter46);
        retrofit.converter.Converter converter48 = requestBuilder47.getconverter();
        java.util.List<retrofit.client.Header> headerList49 = requestBuilder47.headers;
        requestBuilder47.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList54 = null;
        retrofit.mime.TypedOutput typedOutput55 = null;
        retrofit.client.Request request56 = new retrofit.client.Request("", "", headerList54, typedOutput55);
        java.lang.String str57 = request56.getUrl();
        java.lang.Object[] objArray58 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder47, request56 };
        requestBuilder34.setargs(objArray58);
        java.lang.Object[] objArray60 = requestBuilder34.getargs();
        retrofit.RequestBuilder requestBuilder61 = requestBuilder31.args(objArray60);
        requestBuilder61.setapiUrl("");
        retrofit.converter.Converter converter64 = requestBuilder61.getconverter();
        java.util.List<retrofit.client.Header> headerList65 = requestBuilder61.getheaders();
        java.lang.String str66 = requestBuilder61.apiUrl;
        java.lang.Object[] objArray67 = requestBuilder61.getargs();
        requestBuilder1.setargs(objArray67);
        java.util.List<retrofit.client.Header> headerList71 = null;
        retrofit.mime.TypedOutput typedOutput72 = null;
        retrofit.client.Request request73 = new retrofit.client.Request("", "", headerList71, typedOutput72);
        java.lang.String str74 = request73.getUrl();
        retrofit.mime.TypedOutput typedOutput75 = request73.body;
        java.lang.String str76 = request73.getMethod();
        java.util.List<retrofit.client.Header> headerList77 = request73.headers;
        requestBuilder1.headers = headerList77;
        java.util.List<retrofit.client.Header> headerList81 = null;
        retrofit.mime.TypedOutput typedOutput82 = null;
        retrofit.client.Request request83 = new retrofit.client.Request("", "", headerList81, typedOutput82);
        retrofit.mime.TypedOutput typedOutput84 = request83.getBody();
        java.lang.String str85 = request83.getMethod();
        java.lang.String str86 = request83.getMethod();
        java.lang.String str87 = request83.getMethod();
        retrofit.mime.TypedOutput typedOutput88 = request83.getBody();
        java.util.List<retrofit.client.Header> headerList89 = request83.headers;
        java.util.List<retrofit.client.Header> headerList90 = request83.getHeaders();
        retrofit.RequestBuilder requestBuilder91 = requestBuilder1.headers(headerList90);
        java.util.List<retrofit.client.Header> headerList92 = requestBuilder91.getheaders();
        requestBuilder91.apiUrl = "hi!";
        java.lang.Class<?> wildcardClass95 = requestBuilder91.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNull(converter32);
        org.junit.Assert.assertNotNull(headerArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(converter48);
        org.junit.Assert.assertNull(headerList49);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(objArray58);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(requestBuilder61);
        org.junit.Assert.assertNull(converter64);
        org.junit.Assert.assertNull(headerList65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(objArray67);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertNull(typedOutput75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertNotNull(headerList77);
        org.junit.Assert.assertNull(typedOutput84);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "" + "'", str87, "");
        org.junit.Assert.assertNull(typedOutput88);
        org.junit.Assert.assertNotNull(headerList89);
        org.junit.Assert.assertNotNull(headerList90);
        org.junit.Assert.assertNotNull(requestBuilder91);
        org.junit.Assert.assertNotNull(headerList92);
        org.junit.Assert.assertNotNull(wildcardClass95);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        retrofit.RequestBuilder requestBuilder30 = requestBuilder3.apiUrl("");
        java.util.List<retrofit.client.Header> headerList31 = requestBuilder3.headers;
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "", headerList31, typedOutput32);
        java.lang.String str34 = request33.url;
        java.lang.String str35 = request33.method;
        java.lang.String str36 = request33.getUrl();
        java.util.List<retrofit.client.Header> headerList37 = request33.getHeaders();
        java.util.List<retrofit.client.Header> headerList38 = request33.headers;
        java.util.List<retrofit.client.Header> headerList39 = request33.headers;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNotNull(headerList39);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder1.getheaders();
        java.lang.String str11 = requestBuilder1.getapiUrl();
        retrofit.converter.Converter converter12 = null;
        retrofit.RequestBuilder requestBuilder13 = new retrofit.RequestBuilder(converter12);
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        requestBuilder13.setheaders((java.util.List<retrofit.client.Header>) headerList17);
        retrofit.converter.Converter converter25 = null;
        retrofit.RequestBuilder requestBuilder26 = new retrofit.RequestBuilder(converter25);
        retrofit.converter.Converter converter27 = requestBuilder26.getconverter();
        java.util.List<retrofit.client.Header> headerList28 = requestBuilder26.headers;
        requestBuilder26.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList33 = null;
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "", headerList33, typedOutput34);
        java.lang.String str36 = request35.getUrl();
        java.lang.Object[] objArray37 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder26, request35 };
        requestBuilder13.setargs(objArray37);
        requestBuilder13.apiUrl = "";
        retrofit.RequestBuilder requestBuilder42 = requestBuilder13.apiUrl("hi!");
        retrofit.converter.Converter converter43 = null;
        retrofit.RequestBuilder requestBuilder44 = new retrofit.RequestBuilder(converter43);
        java.util.List<retrofit.client.Header> headerList47 = null;
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "", headerList47, typedOutput48);
        retrofit.mime.TypedOutput typedOutput50 = request49.getBody();
        retrofit.mime.TypedOutput typedOutput51 = request49.getBody();
        java.util.List<retrofit.client.Header> headerList52 = request49.headers;
        requestBuilder44.setheaders(headerList52);
        retrofit.RequestBuilder requestBuilder54 = requestBuilder13.headers(headerList52);
        requestBuilder1.headers = headerList52;
        java.util.List<retrofit.client.Header> headerList58 = null;
        retrofit.mime.TypedOutput typedOutput59 = null;
        retrofit.client.Request request60 = new retrofit.client.Request("", "", headerList58, typedOutput59);
        java.lang.String str61 = request60.url;
        java.util.List<retrofit.client.Header> headerList62 = request60.getHeaders();
        requestBuilder1.headers = headerList62;
        java.util.List<retrofit.client.Header> headerList64 = requestBuilder1.headers;
        requestBuilder1.setapiUrl("");
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(converter27);
        org.junit.Assert.assertNull(headerList28);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNull(typedOutput50);
        org.junit.Assert.assertNull(typedOutput51);
        org.junit.Assert.assertNotNull(headerList52);
        org.junit.Assert.assertNotNull(requestBuilder54);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(headerList62);
        org.junit.Assert.assertNotNull(headerList64);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.headers;
        requestBuilder3.setheaders(headerList11);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        retrofit.converter.Converter converter20 = null;
        retrofit.RequestBuilder requestBuilder21 = new retrofit.RequestBuilder(converter20);
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        requestBuilder21.setheaders((java.util.List<retrofit.client.Header>) headerList25);
        java.util.List<retrofit.client.Header> headerList32 = null;
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "", headerList32, typedOutput33);
        java.lang.String str35 = request34.getUrl();
        retrofit.mime.TypedOutput typedOutput36 = request34.body;
        java.lang.Object[] objArray37 = new java.lang.Object[] { (-1), (-1.0f), true, requestBuilder21, typedOutput36 };
        requestBuilder14.setargs(objArray37);
        retrofit.RequestBuilder requestBuilder39 = requestBuilder3.args(objArray37);
        retrofit.converter.Converter converter40 = null;
        retrofit.RequestBuilder requestBuilder41 = new retrofit.RequestBuilder(converter40);
        retrofit.converter.Converter converter42 = requestBuilder41.getconverter();
        retrofit.converter.Converter converter43 = null;
        retrofit.RequestBuilder requestBuilder44 = new retrofit.RequestBuilder(converter43);
        retrofit.client.Header[] headerArray47 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList48 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList48, headerArray47);
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList48, typedOutput50);
        requestBuilder44.setheaders((java.util.List<retrofit.client.Header>) headerList48);
        retrofit.converter.Converter converter56 = null;
        retrofit.RequestBuilder requestBuilder57 = new retrofit.RequestBuilder(converter56);
        retrofit.converter.Converter converter58 = requestBuilder57.getconverter();
        java.util.List<retrofit.client.Header> headerList59 = requestBuilder57.headers;
        requestBuilder57.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList64 = null;
        retrofit.mime.TypedOutput typedOutput65 = null;
        retrofit.client.Request request66 = new retrofit.client.Request("", "", headerList64, typedOutput65);
        java.lang.String str67 = request66.getUrl();
        java.lang.Object[] objArray68 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder57, request66 };
        requestBuilder44.setargs(objArray68);
        java.lang.Object[] objArray70 = requestBuilder44.getargs();
        retrofit.RequestBuilder requestBuilder71 = requestBuilder41.args(objArray70);
        retrofit.RequestBuilder requestBuilder72 = requestBuilder39.args(objArray70);
        java.util.List<retrofit.client.Header> headerList73 = requestBuilder39.headers;
        java.util.List<retrofit.client.Header> headerList74 = requestBuilder39.headers;
        retrofit.mime.TypedOutput typedOutput75 = null;
        retrofit.client.Request request76 = new retrofit.client.Request("hi!", "hi!", headerList74, typedOutput75);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNull(typedOutput36);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(requestBuilder39);
        org.junit.Assert.assertNull(converter42);
        org.junit.Assert.assertNotNull(headerArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(converter58);
        org.junit.Assert.assertNull(headerList59);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(objArray68);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertNotNull(requestBuilder71);
        org.junit.Assert.assertNotNull(requestBuilder72);
        org.junit.Assert.assertNotNull(headerList73);
        org.junit.Assert.assertNotNull(headerList74);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.url;
        java.lang.String str6 = request4.url;
        retrofit.mime.TypedOutput typedOutput7 = request4.body;
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request4.headers;
        java.lang.String str10 = request4.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", headerList8, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.headers;
        retrofit.mime.TypedOutput typedOutput12 = request10.getBody();
        java.lang.String str13 = request10.getUrl();
        java.lang.String str14 = request10.getMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder4.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.converter.Converter converter18 = requestBuilder17.getconverter();
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder17.headers;
        requestBuilder17.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList24 = null;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.lang.Object[] objArray28 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder17, request26 };
        requestBuilder4.setargs(objArray28);
        java.lang.Object[] objArray30 = requestBuilder4.getargs();
        retrofit.RequestBuilder requestBuilder31 = requestBuilder1.args(objArray30);
        retrofit.converter.Converter converter32 = requestBuilder1.converter;
        java.util.List<retrofit.client.Header> headerList33 = requestBuilder1.headers;
        requestBuilder1.apiUrl = "hi!";
        java.util.List<retrofit.client.Header> headerList36 = requestBuilder1.getheaders();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.mime.TypedOutput typedOutput37 = requestBuilder1.buildBody();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(converter32);
        org.junit.Assert.assertNull(headerList33);
        org.junit.Assert.assertNull(headerList36);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.lang.String str7 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request4.body;
        java.util.List<retrofit.client.Header> headerList9 = request4.headers;
        java.util.List<retrofit.client.Header> headerList10 = request4.headers;
        java.lang.String str11 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput12 = request4.body;
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList7 = request4.headers;
        java.lang.String str8 = request4.getUrl();
        java.lang.String str9 = request4.url;
        retrofit.mime.TypedOutput typedOutput10 = request4.body;
        java.lang.String str11 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList12 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request4.getHeaders();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        java.lang.String str14 = requestBuilder5.getapiUrl();
        retrofit.RequestBuilder requestBuilder16 = requestBuilder5.apiUrl("");
        java.util.List<retrofit.client.Header> headerList19 = null;
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList19, typedOutput20);
        java.lang.String str22 = request21.url;
        java.util.List<retrofit.client.Header> headerList23 = request21.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request21.getHeaders();
        requestBuilder5.headers = headerList24;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList24, typedOutput26);
        java.lang.String str28 = request27.getMethod();
        retrofit.mime.TypedOutput typedOutput29 = request27.getBody();
        java.util.List<retrofit.client.Header> headerList30 = request27.getHeaders();
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "hi!", headerList30, typedOutput31);
        java.util.List<retrofit.client.Header> headerList33 = request32.getHeaders();
        java.lang.String str34 = request32.url;
        retrofit.mime.TypedOutput typedOutput35 = request32.body;
        retrofit.mime.TypedOutput typedOutput36 = request32.body;
        java.util.List<retrofit.client.Header> headerList37 = request32.headers;
        java.util.List<retrofit.client.Header> headerList38 = request32.headers;
        java.lang.String str39 = request32.getMethod();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(requestBuilder16);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(typedOutput29);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNull(typedOutput35);
        org.junit.Assert.assertNull(typedOutput36);
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        retrofit.mime.TypedOutput typedOutput7 = request4.body;
        java.lang.String str8 = request4.url;
        java.util.List<retrofit.client.Header> headerList9 = request4.headers;
        java.util.List<retrofit.client.Header> headerList10 = request4.headers;
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        java.lang.String str12 = request4.url;
        java.util.List<retrofit.client.Header> headerList13 = request4.getHeaders();
        java.lang.String str14 = request4.method;
        java.lang.String str15 = request4.url;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.RequestBuilder requestBuilder3 = requestBuilder1.apiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        retrofit.mime.TypedOutput typedOutput14 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request12.headers;
        java.util.List<retrofit.client.Header> headerList16 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", headerList16, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.headers;
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList19, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.headers;
        retrofit.RequestBuilder requestBuilder23 = requestBuilder1.headers(headerList22);
        retrofit.converter.Converter converter24 = requestBuilder23.converter;
        requestBuilder23.apiUrl = "hi!";
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNull(converter24);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        retrofit.converter.Converter converter19 = requestBuilder18.getconverter();
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder18.headers;
        requestBuilder18.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList25 = null;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        java.lang.Object[] objArray29 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder18, request27 };
        requestBuilder5.setargs(objArray29);
        requestBuilder5.apiUrl = "";
        retrofit.RequestBuilder requestBuilder34 = requestBuilder5.apiUrl("hi!");
        retrofit.converter.Converter converter35 = null;
        retrofit.RequestBuilder requestBuilder36 = new retrofit.RequestBuilder(converter35);
        java.util.List<retrofit.client.Header> headerList39 = null;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = request41.getBody();
        retrofit.mime.TypedOutput typedOutput43 = request41.getBody();
        java.util.List<retrofit.client.Header> headerList44 = request41.headers;
        requestBuilder36.setheaders(headerList44);
        retrofit.RequestBuilder requestBuilder46 = requestBuilder5.headers(headerList44);
        java.lang.Object[] objArray47 = requestBuilder5.getargs();
        java.lang.Object[] objArray48 = requestBuilder5.getargs();
        java.util.List<retrofit.client.Header> headerList51 = null;
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("", "", headerList51, typedOutput52);
        retrofit.mime.TypedOutput typedOutput54 = request53.getBody();
        java.util.List<retrofit.client.Header> headerList55 = request53.headers;
        java.util.List<retrofit.client.Header> headerList56 = request53.headers;
        requestBuilder5.headers = headerList56;
        requestBuilder5.apiUrl = "";
        java.util.List<retrofit.client.Header> headerList60 = requestBuilder5.getheaders();
        retrofit.RequestBuilder requestBuilder62 = requestBuilder5.apiUrl("");
        java.util.List<retrofit.client.Header> headerList63 = requestBuilder62.headers;
        retrofit.mime.TypedOutput typedOutput64 = null;
        retrofit.client.Request request65 = new retrofit.client.Request("", "hi!", headerList63, typedOutput64);
        java.lang.String str66 = request65.getMethod();
        java.util.List<retrofit.client.Header> headerList67 = request65.headers;
        retrofit.mime.TypedOutput typedOutput68 = null;
        retrofit.client.Request request69 = new retrofit.client.Request("", "", headerList67, typedOutput68);
        java.lang.String str70 = request69.url;
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(converter19);
        org.junit.Assert.assertNull(headerList20);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(objArray29);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNull(typedOutput42);
        org.junit.Assert.assertNull(typedOutput43);
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNotNull(objArray47);
        org.junit.Assert.assertNotNull(objArray48);
        org.junit.Assert.assertNull(typedOutput54);
        org.junit.Assert.assertNotNull(headerList55);
        org.junit.Assert.assertNotNull(headerList56);
        org.junit.Assert.assertNotNull(headerList60);
        org.junit.Assert.assertNotNull(requestBuilder62);
        org.junit.Assert.assertNotNull(headerList63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(headerList67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList5);
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        retrofit.converter.Converter converter15 = requestBuilder14.getconverter();
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder14.headers;
        requestBuilder14.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList21 = null;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getUrl();
        java.lang.Object[] objArray25 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder14, request23 };
        requestBuilder1.setargs(objArray25);
        java.lang.Object[] objArray27 = requestBuilder1.getargs();
        java.lang.String str28 = requestBuilder1.apiUrl;
        java.util.List<retrofit.client.Header> headerList31 = null;
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "", headerList31, typedOutput32);
        java.lang.String str34 = request33.getUrl();
        retrofit.mime.TypedOutput typedOutput35 = request33.body;
        java.util.List<retrofit.client.Header> headerList36 = request33.getHeaders();
        requestBuilder1.setheaders(headerList36);
        java.lang.String str38 = requestBuilder1.getapiUrl();
        java.lang.String str39 = requestBuilder1.getapiUrl();
        java.lang.Object[] objArray40 = null;
        requestBuilder1.setargs(objArray40);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(converter15);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(typedOutput35);
        org.junit.Assert.assertNotNull(headerList36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.url;
        retrofit.mime.TypedOutput typedOutput11 = request8.getBody();
        java.lang.String str12 = request8.getUrl();
        java.lang.String str13 = request8.method;
        java.util.List<retrofit.client.Header> headerList14 = request8.getHeaders();
        java.lang.String str15 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList16 = request8.headers;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", headerList16, typedOutput17);
        java.lang.String str19 = request18.getUrl();
        java.lang.String str20 = request18.url;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        requestBuilder3.apiUrl = "";
        retrofit.RequestBuilder requestBuilder32 = requestBuilder3.apiUrl("hi!");
        retrofit.converter.Converter converter33 = null;
        retrofit.RequestBuilder requestBuilder34 = new retrofit.RequestBuilder(converter33);
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.getBody();
        retrofit.mime.TypedOutput typedOutput41 = request39.getBody();
        java.util.List<retrofit.client.Header> headerList42 = request39.headers;
        requestBuilder34.setheaders(headerList42);
        retrofit.RequestBuilder requestBuilder44 = requestBuilder3.headers(headerList42);
        java.lang.Object[] objArray45 = requestBuilder3.getargs();
        retrofit.RequestBuilder requestBuilder47 = requestBuilder3.apiUrl("hi!");
        retrofit.converter.Converter converter48 = null;
        retrofit.RequestBuilder requestBuilder49 = new retrofit.RequestBuilder(converter48);
        retrofit.client.Header[] headerArray52 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList53 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList53, headerArray52);
        retrofit.mime.TypedOutput typedOutput55 = null;
        retrofit.client.Request request56 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList53, typedOutput55);
        requestBuilder49.setheaders((java.util.List<retrofit.client.Header>) headerList53);
        retrofit.converter.Converter converter61 = null;
        retrofit.RequestBuilder requestBuilder62 = new retrofit.RequestBuilder(converter61);
        retrofit.converter.Converter converter63 = requestBuilder62.getconverter();
        java.util.List<retrofit.client.Header> headerList64 = requestBuilder62.headers;
        requestBuilder62.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList69 = null;
        retrofit.mime.TypedOutput typedOutput70 = null;
        retrofit.client.Request request71 = new retrofit.client.Request("", "", headerList69, typedOutput70);
        java.lang.String str72 = request71.getUrl();
        java.lang.Object[] objArray73 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder62, request71 };
        requestBuilder49.setargs(objArray73);
        retrofit.RequestBuilder requestBuilder76 = requestBuilder49.apiUrl("");
        java.util.List<retrofit.client.Header> headerList77 = requestBuilder49.headers;
        requestBuilder3.headers = headerList77;
        retrofit.mime.TypedOutput typedOutput79 = null;
        retrofit.client.Request request80 = new retrofit.client.Request("", "hi!", headerList77, typedOutput79);
        java.util.List<retrofit.client.Header> headerList81 = request80.getHeaders();
        java.util.List<retrofit.client.Header> headerList82 = request80.getHeaders();
        java.util.List<retrofit.client.Header> headerList83 = request80.headers;
        java.util.List<retrofit.client.Header> headerList84 = request80.getHeaders();
        java.util.List<retrofit.client.Header> headerList85 = request80.getHeaders();
        java.util.List<retrofit.client.Header> headerList86 = request80.getHeaders();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNull(typedOutput41);
        org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNotNull(objArray45);
        org.junit.Assert.assertNotNull(requestBuilder47);
        org.junit.Assert.assertNotNull(headerArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNull(converter63);
        org.junit.Assert.assertNull(headerList64);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertNotNull(objArray73);
        org.junit.Assert.assertNotNull(requestBuilder76);
        org.junit.Assert.assertNotNull(headerList77);
        org.junit.Assert.assertNotNull(headerList81);
        org.junit.Assert.assertNotNull(headerList82);
        org.junit.Assert.assertNotNull(headerList83);
        org.junit.Assert.assertNotNull(headerList84);
        org.junit.Assert.assertNotNull(headerList85);
        org.junit.Assert.assertNotNull(headerList86);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        requestBuilder3.setheaders((java.util.List<retrofit.client.Header>) headerList7);
        retrofit.converter.Converter converter15 = null;
        retrofit.RequestBuilder requestBuilder16 = new retrofit.RequestBuilder(converter15);
        retrofit.converter.Converter converter17 = requestBuilder16.getconverter();
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder16.headers;
        requestBuilder16.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList23 = null;
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Object[] objArray27 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder16, request25 };
        requestBuilder3.setargs(objArray27);
        retrofit.RequestBuilder requestBuilder30 = requestBuilder3.apiUrl("");
        java.util.List<retrofit.client.Header> headerList31 = requestBuilder3.headers;
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "", headerList31, typedOutput32);
        java.util.List<retrofit.client.Header> headerList34 = request33.headers;
        retrofit.mime.TypedOutput typedOutput35 = request33.getBody();
        java.util.List<retrofit.client.Header> headerList36 = request33.getHeaders();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(converter17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNull(typedOutput35);
        org.junit.Assert.assertNotNull(headerList36);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.RequestBuilder requestBuilder3 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList9);
        java.util.List<retrofit.client.Header> headerList14 = requestBuilder5.getheaders();
        java.lang.String str15 = requestBuilder5.getapiUrl();
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        requestBuilder17.setheaders((java.util.List<retrofit.client.Header>) headerList21);
        retrofit.converter.Converter converter29 = null;
        retrofit.RequestBuilder requestBuilder30 = new retrofit.RequestBuilder(converter29);
        retrofit.converter.Converter converter31 = requestBuilder30.getconverter();
        java.util.List<retrofit.client.Header> headerList32 = requestBuilder30.headers;
        requestBuilder30.setapiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList37 = null;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", headerList37, typedOutput38);
        java.lang.String str40 = request39.getUrl();
        java.lang.Object[] objArray41 = new java.lang.Object[] { 0, 1, (-1.0f), requestBuilder30, request39 };
        requestBuilder17.setargs(objArray41);
        requestBuilder17.apiUrl = "";
        retrofit.RequestBuilder requestBuilder46 = requestBuilder17.apiUrl("hi!");
        retrofit.converter.Converter converter47 = null;
        retrofit.RequestBuilder requestBuilder48 = new retrofit.RequestBuilder(converter47);
        java.util.List<retrofit.client.Header> headerList51 = null;
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("", "", headerList51, typedOutput52);
        retrofit.mime.TypedOutput typedOutput54 = request53.getBody();
        retrofit.mime.TypedOutput typedOutput55 = request53.getBody();
        java.util.List<retrofit.client.Header> headerList56 = request53.headers;
        requestBuilder48.setheaders(headerList56);
        retrofit.RequestBuilder requestBuilder58 = requestBuilder17.headers(headerList56);
        requestBuilder5.headers = headerList56;
        java.util.List<retrofit.client.Header> headerList62 = null;
        retrofit.mime.TypedOutput typedOutput63 = null;
        retrofit.client.Request request64 = new retrofit.client.Request("", "", headerList62, typedOutput63);
        java.lang.String str65 = request64.url;
        java.util.List<retrofit.client.Header> headerList66 = request64.getHeaders();
        requestBuilder5.headers = headerList66;
        java.util.List<retrofit.client.Header> headerList68 = requestBuilder5.headers;
        retrofit.RequestBuilder requestBuilder69 = requestBuilder3.headers(headerList68);
        requestBuilder3.apiUrl = "";
        requestBuilder3.apiUrl = "";
        org.junit.Assert.assertNotNull(requestBuilder3);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(converter31);
        org.junit.Assert.assertNull(headerList32);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(objArray41);
        org.junit.Assert.assertNotNull(requestBuilder46);
        org.junit.Assert.assertNull(typedOutput54);
        org.junit.Assert.assertNull(typedOutput55);
        org.junit.Assert.assertNotNull(headerList56);
        org.junit.Assert.assertNotNull(requestBuilder58);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertNotNull(headerList66);
        org.junit.Assert.assertNotNull(headerList68);
        org.junit.Assert.assertNotNull(requestBuilder69);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput6 = request4.body;
        java.lang.String str7 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList8 = request4.headers;
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.lang.String str10 = request4.method;
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        java.lang.String str12 = request4.method;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }
}

