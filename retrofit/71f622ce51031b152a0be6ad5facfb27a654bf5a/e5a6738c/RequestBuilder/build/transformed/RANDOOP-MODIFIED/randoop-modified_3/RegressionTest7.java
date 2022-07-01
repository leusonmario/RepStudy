import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.headers;
        java.lang.Object[] objArray16 = new java.lang.Object[] { true, (short) 1, request13, 0 };
        requestBuilder3.args = objArray16;
        retrofit.converter.Converter converter18 = requestBuilder3.converter;
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder3.headers;
        requestBuilder3.apiUrl = "hi!";
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        java.lang.String str31 = request30.url;
        java.util.List<retrofit.client.Header> headerList32 = request30.headers;
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "", headerList32, typedOutput33);
        retrofit.RequestBuilder requestBuilder35 = requestBuilder3.headers(headerList32);
        java.lang.Object[] objArray36 = requestBuilder3.getargs();
        java.util.List<retrofit.client.Header> headerList37 = requestBuilder3.getheaders();
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("hi!", "", headerList37, typedOutput38);
        java.util.List<retrofit.client.Header> headerList40 = request39.getHeaders();
        java.lang.String str41 = request39.getUrl();
        java.lang.String str42 = request39.getUrl();
        org.junit.Assert.assertNull(headerList4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.args;
        java.lang.Object[] objArray18 = null;
        retrofit.RequestBuilder requestBuilder19 = requestBuilder1.args(objArray18);
        java.lang.String str20 = requestBuilder19.getapiUrl();
        retrofit.client.Header[] headerArray23 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList24 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList24, headerArray23);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList24, typedOutput26);
        java.lang.String str28 = request27.url;
        java.util.List<retrofit.client.Header> headerList29 = request27.headers;
        retrofit.mime.TypedOutput typedOutput30 = request27.body;
        retrofit.mime.TypedOutput typedOutput31 = request27.body;
        java.util.List<retrofit.client.Header> headerList32 = request27.headers;
        java.lang.String str33 = request27.url;
        java.lang.String str34 = request27.getUrl();
        java.util.List<retrofit.client.Header> headerList35 = request27.headers;
        java.util.List<retrofit.client.Header> headerList36 = request27.headers;
        java.util.List<retrofit.client.Header> headerList37 = request27.headers;
        retrofit.RequestBuilder requestBuilder38 = requestBuilder19.headers(headerList37);
        retrofit.converter.Converter converter39 = requestBuilder19.converter;
        java.lang.Object[] objArray40 = requestBuilder19.args;
        requestBuilder19.apiUrl = "hi!";
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(headerArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNull(typedOutput30);
        org.junit.Assert.assertNull(typedOutput31);
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNotNull(headerList36);
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNull(converter39);
        org.junit.Assert.assertNull(objArray40);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.converter.Converter converter3 = null;
        retrofit.RequestBuilder requestBuilder4 = new retrofit.RequestBuilder(converter3);
        java.util.List<retrofit.client.Header> headerList5 = requestBuilder4.headers;
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.headers;
        java.lang.Object[] objArray17 = new java.lang.Object[] { true, (short) 1, request14, 0 };
        requestBuilder4.args = objArray17;
        requestBuilder1.setargs(objArray17);
        retrofit.converter.Converter converter20 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList21 = requestBuilder1.headers;
        retrofit.converter.Converter converter22 = requestBuilder1.getconverter();
        requestBuilder1.setapiUrl("");
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNull(headerList5);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(headerList21);
        org.junit.Assert.assertNull(converter22);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        java.lang.String str31 = request30.url;
        java.util.List<retrofit.client.Header> headerList32 = request30.headers;
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "", headerList32, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = request34.body;
        java.util.List<retrofit.client.Header> headerList36 = request34.headers;
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("hi!", "", headerList36, typedOutput37);
        requestBuilder5.headers = headerList36;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "hi!", headerList36, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("", "hi!", headerList36, typedOutput42);
        java.util.List<retrofit.client.Header> headerList44 = request43.getHeaders();
        retrofit.mime.TypedOutput typedOutput45 = request43.body;
        java.lang.String str46 = request43.getUrl();
        java.lang.String str47 = request43.getMethod();
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNull(typedOutput35);
        org.junit.Assert.assertNotNull(headerList36);
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertNull(typedOutput45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.lang.String str10 = request8.method;
        java.util.List<retrofit.client.Header> headerList11 = request8.headers;
        java.lang.String str12 = request8.method;
        java.util.List<retrofit.client.Header> headerList13 = request8.headers;
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        java.lang.String str17 = request16.url;
        java.util.List<retrofit.client.Header> headerList18 = request16.headers;
        retrofit.mime.TypedOutput typedOutput19 = request16.body;
        retrofit.mime.TypedOutput typedOutput20 = request16.body;
        java.util.List<retrofit.client.Header> headerList21 = request16.headers;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "hi!", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "", headerList21, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = request25.body;
        java.util.List<retrofit.client.Header> headerList27 = request25.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "hi!", headerList27, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", headerList27, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "", headerList27, typedOutput32);
        java.lang.String str34 = request33.getUrl();
        retrofit.mime.TypedOutput typedOutput35 = request33.body;
        java.util.List<retrofit.client.Header> headerList36 = request33.headers;
        retrofit.mime.TypedOutput typedOutput37 = request33.body;
        java.lang.String str38 = request33.getMethod();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNull(typedOutput35);
        org.junit.Assert.assertNotNull(headerList36);
        org.junit.Assert.assertNull(typedOutput37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.lang.String str13 = request12.url;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        retrofit.mime.TypedOutput typedOutput15 = request12.body;
        retrofit.mime.TypedOutput typedOutput16 = request12.body;
        java.util.List<retrofit.client.Header> headerList17 = request12.headers;
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = request19.body;
        java.util.List<retrofit.client.Header> headerList21 = request19.headers;
        retrofit.mime.TypedOutput typedOutput22 = request19.getBody();
        java.lang.String str23 = request19.getUrl();
        java.util.List<retrofit.client.Header> headerList24 = request19.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", headerList24, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "", headerList24, typedOutput27);
        java.lang.String str29 = request28.method;
        retrofit.mime.TypedOutput typedOutput30 = request28.getBody();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(typedOutput30);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = request8.body;
        retrofit.mime.TypedOutput typedOutput12 = request8.body;
        java.util.List<retrofit.client.Header> headerList13 = request8.headers;
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        java.lang.String str16 = request15.url;
        java.lang.String str17 = request15.getMethod();
        retrofit.mime.TypedOutput typedOutput18 = request15.body;
        retrofit.mime.TypedOutput typedOutput19 = request15.getBody();
        java.lang.String str20 = request15.getMethod();
        retrofit.mime.TypedOutput typedOutput21 = request15.body;
        retrofit.mime.TypedOutput typedOutput22 = request15.body;
        java.lang.String str23 = request15.method;
        java.lang.String str24 = request15.url;
        retrofit.mime.TypedOutput typedOutput25 = request15.getBody();
        java.lang.String str26 = request15.method;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = request8.body;
        retrofit.mime.TypedOutput typedOutput12 = request8.body;
        java.util.List<retrofit.client.Header> headerList13 = request8.headers;
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        java.lang.String str16 = request15.url;
        java.lang.String str17 = request15.getMethod();
        retrofit.mime.TypedOutput typedOutput18 = request15.body;
        retrofit.mime.TypedOutput typedOutput19 = request15.getBody();
        java.lang.String str20 = request15.getMethod();
        retrofit.mime.TypedOutput typedOutput21 = request15.body;
        retrofit.mime.TypedOutput typedOutput22 = request15.body;
        java.lang.String str23 = request15.method;
        retrofit.mime.TypedOutput typedOutput24 = request15.body;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(typedOutput24);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = request10.body;
        retrofit.mime.TypedOutput typedOutput14 = request10.body;
        java.util.List<retrofit.client.Header> headerList15 = request10.headers;
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput16);
        java.lang.String str18 = request17.url;
        java.lang.String str19 = request17.getMethod();
        retrofit.mime.TypedOutput typedOutput20 = request17.body;
        java.util.List<retrofit.client.Header> headerList21 = request17.headers;
        retrofit.mime.TypedOutput typedOutput22 = request17.getBody();
        java.lang.String str23 = request17.getMethod();
        java.lang.String str24 = request17.url;
        java.util.List<retrofit.client.Header> headerList25 = request17.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "", headerList25, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.headers;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList28);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        java.lang.String str15 = request14.url;
        java.util.List<retrofit.client.Header> headerList16 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", headerList16, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", headerList16, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", headerList16, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", headerList16, typedOutput23);
        java.lang.String str25 = request24.method;
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.body;
        java.util.List<retrofit.client.Header> headerList16 = request14.headers;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", headerList16, typedOutput17);
        java.lang.String str19 = request18.getUrl();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        requestBuilder1.setapiUrl("");
        java.lang.String str4 = requestBuilder1.getapiUrl();
        requestBuilder1.setapiUrl("hi!");
        retrofit.RequestBuilder requestBuilder8 = requestBuilder1.apiUrl("");
        retrofit.converter.Converter converter9 = null;
        retrofit.RequestBuilder requestBuilder10 = new retrofit.RequestBuilder(converter9);
        java.util.List<retrofit.client.Header> headerList11 = requestBuilder10.headers;
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.headers;
        java.lang.Object[] objArray23 = new java.lang.Object[] { true, (short) 1, request20, 0 };
        requestBuilder10.args = objArray23;
        retrofit.converter.Converter converter25 = requestBuilder10.converter;
        java.lang.Object[] objArray26 = requestBuilder10.args;
        java.lang.Object[] objArray27 = null;
        retrofit.RequestBuilder requestBuilder28 = requestBuilder10.args(objArray27);
        retrofit.converter.Converter converter29 = null;
        retrofit.RequestBuilder requestBuilder30 = new retrofit.RequestBuilder(converter29);
        java.util.List<retrofit.client.Header> headerList31 = requestBuilder30.headers;
        retrofit.converter.Converter converter32 = requestBuilder30.getconverter();
        java.lang.Object[] objArray35 = new java.lang.Object[] { 0.0f, 100.0d };
        retrofit.RequestBuilder requestBuilder36 = requestBuilder30.args(objArray35);
        requestBuilder28.args = objArray35;
        requestBuilder1.setargs(objArray35);
        java.lang.String str39 = requestBuilder1.getapiUrl();
        requestBuilder1.apiUrl = "hi!";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(requestBuilder8);
        org.junit.Assert.assertNull(headerList11);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNull(converter25);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertNotNull(requestBuilder28);
        org.junit.Assert.assertNull(headerList31);
        org.junit.Assert.assertNull(converter32);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray35), "[0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray35), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(requestBuilder36);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.method;
        java.lang.String str8 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        java.lang.String str10 = request6.url;
        java.util.List<retrofit.client.Header> headerList11 = request6.headers;
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.body;
        retrofit.mime.TypedOutput typedOutput14 = request12.getBody();
        retrofit.mime.TypedOutput typedOutput15 = request12.body;
        java.lang.String str16 = request12.url;
        retrofit.mime.TypedOutput typedOutput17 = request12.getBody();
        java.lang.String str18 = request12.method;
        java.lang.String str19 = request12.url;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", headerList12, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.util.List<retrofit.client.Header> headerList16 = request14.headers;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", headerList16, typedOutput17);
        java.lang.String str19 = request18.method;
        retrofit.mime.TypedOutput typedOutput20 = request18.getBody();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(typedOutput20);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.lang.String str13 = request12.url;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        retrofit.mime.TypedOutput typedOutput15 = request12.body;
        retrofit.mime.TypedOutput typedOutput16 = request12.body;
        java.util.List<retrofit.client.Header> headerList17 = request12.headers;
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = request21.body;
        java.lang.String str23 = request21.getUrl();
        java.util.List<retrofit.client.Header> headerList24 = request21.headers;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", headerList24, typedOutput25);
        java.lang.Class<?> wildcardClass27 = request26.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder7.headers;
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        java.util.List<retrofit.client.Header> headerList18 = request17.headers;
        java.lang.Object[] objArray20 = new java.lang.Object[] { true, (short) 1, request17, 0 };
        requestBuilder7.args = objArray20;
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.headers;
        requestBuilder7.setheaders(headerList29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "hi!", headerList29, typedOutput31);
        java.util.List<retrofit.client.Header> headerList33 = request32.getHeaders();
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("hi!", "", headerList33, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("hi!", "", headerList33, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.body;
        java.lang.String str39 = request37.method;
        org.junit.Assert.assertNull(headerList8);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.lang.String str10 = request8.method;
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = request13.body;
        java.lang.String str15 = request13.method;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.converter.Converter converter20 = requestBuilder5.converter;
        java.lang.Object[] objArray21 = requestBuilder5.args;
        java.lang.Object[] objArray22 = null;
        retrofit.RequestBuilder requestBuilder23 = requestBuilder5.args(objArray22);
        retrofit.converter.Converter converter24 = requestBuilder23.getconverter();
        retrofit.RequestBuilder requestBuilder26 = requestBuilder23.apiUrl("");
        retrofit.client.Header[] headerArray33 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList34 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList34, headerArray33);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList34, typedOutput36);
        java.lang.String str38 = request37.url;
        java.util.List<retrofit.client.Header> headerList39 = request37.headers;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = request41.body;
        java.util.List<retrofit.client.Header> headerList43 = request41.headers;
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("hi!", "", headerList43, typedOutput44);
        requestBuilder26.setheaders(headerList43);
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("hi!", "", headerList43, typedOutput47);
        retrofit.mime.TypedOutput typedOutput49 = null;
        retrofit.client.Request request50 = new retrofit.client.Request("", "hi!", headerList43, typedOutput49);
        java.lang.String str51 = request50.method;
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNull(converter24);
        org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(headerArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNull(typedOutput42);
        org.junit.Assert.assertNotNull(headerList43);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.lang.String str9 = request6.getUrl();
        java.lang.String str10 = request6.url;
        retrofit.mime.TypedOutput typedOutput11 = request6.getBody();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(typedOutput11);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        requestBuilder1.setapiUrl("");
        java.lang.String str4 = requestBuilder1.getapiUrl();
        java.lang.String str5 = requestBuilder1.apiUrl;
        retrofit.converter.Converter converter6 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter7 = requestBuilder1.getconverter();
        java.lang.Object[] objArray8 = requestBuilder1.args;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(converter6);
        org.junit.Assert.assertNull(converter7);
        org.junit.Assert.assertNull(objArray8);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.lang.String str13 = request12.url;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", headerList14, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = request16.body;
        java.util.List<retrofit.client.Header> headerList18 = request16.headers;
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", headerList18, typedOutput19);
        requestBuilder1.headers = headerList18;
        retrofit.client.Header[] headerArray28 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList29 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList29, headerArray28);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList29, typedOutput31);
        java.lang.String str33 = request32.url;
        java.util.List<retrofit.client.Header> headerList34 = request32.headers;
        retrofit.mime.TypedOutput typedOutput35 = request32.body;
        retrofit.mime.TypedOutput typedOutput36 = request32.body;
        java.util.List<retrofit.client.Header> headerList37 = request32.headers;
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("hi!", "hi!", headerList37, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.body;
        java.util.List<retrofit.client.Header> headerList41 = request39.headers;
        retrofit.mime.TypedOutput typedOutput42 = request39.getBody();
        java.lang.String str43 = request39.getUrl();
        java.util.List<retrofit.client.Header> headerList44 = request39.getHeaders();
        retrofit.mime.TypedOutput typedOutput45 = request39.body;
        java.util.List<retrofit.client.Header> headerList46 = request39.headers;
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("", "", headerList46, typedOutput47);
        retrofit.RequestBuilder requestBuilder49 = requestBuilder1.headers(headerList46);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNull(typedOutput35);
        org.junit.Assert.assertNull(typedOutput36);
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNotNull(headerList41);
        org.junit.Assert.assertNull(typedOutput42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertNull(typedOutput45);
        org.junit.Assert.assertNotNull(headerList46);
        org.junit.Assert.assertNotNull(requestBuilder49);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        java.lang.Object[] objArray16 = requestBuilder1.args;
        retrofit.converter.Converter converter21 = null;
        retrofit.RequestBuilder requestBuilder22 = new retrofit.RequestBuilder(converter21);
        retrofit.client.Header[] headerArray29 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList30 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList30, headerArray29);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList30, typedOutput32);
        java.lang.String str34 = request33.url;
        java.util.List<retrofit.client.Header> headerList35 = request33.headers;
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", headerList35, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.body;
        java.util.List<retrofit.client.Header> headerList39 = request37.headers;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("hi!", "", headerList39, typedOutput40);
        requestBuilder22.headers = headerList39;
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("", "", headerList39, typedOutput43);
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("hi!", "hi!", headerList39, typedOutput45);
        java.util.List<retrofit.client.Header> headerList47 = request46.headers;
        requestBuilder1.headers = headerList47;
        retrofit.converter.Converter converter49 = requestBuilder1.getconverter();
        java.lang.String str50 = requestBuilder1.getapiUrl();
        retrofit.client.Header[] headerArray67 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList68 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList68, headerArray67);
        retrofit.mime.TypedOutput typedOutput70 = null;
        retrofit.client.Request request71 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList68, typedOutput70);
        retrofit.mime.TypedOutput typedOutput72 = null;
        retrofit.client.Request request73 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList68, typedOutput72);
        retrofit.mime.TypedOutput typedOutput74 = null;
        retrofit.client.Request request75 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList68, typedOutput74);
        retrofit.mime.TypedOutput typedOutput76 = null;
        retrofit.client.Request request77 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList68, typedOutput76);
        java.lang.String str78 = request77.getUrl();
        java.util.List<retrofit.client.Header> headerList79 = request77.getHeaders();
        retrofit.mime.TypedOutput typedOutput80 = null;
        retrofit.client.Request request81 = new retrofit.client.Request("hi!", "", headerList79, typedOutput80);
        retrofit.mime.TypedOutput typedOutput82 = null;
        retrofit.client.Request request83 = new retrofit.client.Request("hi!", "hi!", headerList79, typedOutput82);
        retrofit.mime.TypedOutput typedOutput84 = null;
        retrofit.client.Request request85 = new retrofit.client.Request("", "hi!", headerList79, typedOutput84);
        retrofit.mime.TypedOutput typedOutput86 = null;
        retrofit.client.Request request87 = new retrofit.client.Request("hi!", "", headerList79, typedOutput86);
        requestBuilder1.headers = headerList79;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = requestBuilder1.buildRelativeUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(headerArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNotNull(headerList47);
        org.junit.Assert.assertNull(converter49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNotNull(headerArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(headerList79);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.lang.String str13 = request12.url;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        retrofit.mime.TypedOutput typedOutput15 = request12.body;
        retrofit.mime.TypedOutput typedOutput16 = request12.body;
        java.util.List<retrofit.client.Header> headerList17 = request12.headers;
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList17, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.getHeaders();
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", headerList22, typedOutput23);
        java.lang.String str25 = request24.method;
        java.lang.String str26 = request24.method;
        retrofit.mime.TypedOutput typedOutput27 = request24.body;
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(typedOutput27);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.lang.String str13 = request12.url;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", headerList14, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = request16.body;
        java.util.List<retrofit.client.Header> headerList18 = request16.headers;
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", headerList18, typedOutput19);
        requestBuilder1.headers = headerList18;
        retrofit.client.Header[] headerArray28 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList29 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList29, headerArray28);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList29, typedOutput31);
        java.lang.String str33 = request32.url;
        java.util.List<retrofit.client.Header> headerList34 = request32.headers;
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "", headerList34, typedOutput35);
        retrofit.mime.TypedOutput typedOutput37 = request36.body;
        retrofit.mime.TypedOutput typedOutput38 = request36.getBody();
        java.util.List<retrofit.client.Header> headerList39 = request36.getHeaders();
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        requestBuilder1.headers = headerList39;
        retrofit.RequestBuilder requestBuilder44 = requestBuilder1.apiUrl("");
        retrofit.converter.Converter converter45 = requestBuilder1.getconverter();
        java.lang.Object[] objArray46 = requestBuilder1.args;
        java.lang.Object[] objArray47 = requestBuilder1.args;
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNull(typedOutput37);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNotNull(requestBuilder44);
        org.junit.Assert.assertNull(converter45);
        org.junit.Assert.assertNull(objArray46);
        org.junit.Assert.assertNull(objArray47);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        java.lang.String str25 = request24.getMethod();
        java.util.List<retrofit.client.Header> headerList26 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "", headerList26, typedOutput27);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(headerList26);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        requestBuilder1.setapiUrl("");
        java.lang.String str4 = requestBuilder1.getapiUrl();
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        java.util.List<retrofit.client.Header> headerList13 = requestBuilder1.headers;
        requestBuilder1.apiUrl = "";
        retrofit.converter.Converter converter16 = requestBuilder1.getconverter();
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder1.headers;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.headers;
        retrofit.mime.TypedOutput typedOutput8 = request6.body;
        java.lang.String str9 = request6.url;
        retrofit.mime.TypedOutput typedOutput10 = request6.body;
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.headers;
        retrofit.mime.TypedOutput typedOutput10 = request8.body;
        java.util.List<retrofit.client.Header> headerList11 = request8.headers;
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        java.lang.String str14 = request13.url;
        java.lang.String str15 = request13.getMethod();
        java.lang.String str16 = request13.getUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        retrofit.converter.Converter converter8 = null;
        retrofit.RequestBuilder requestBuilder9 = new retrofit.RequestBuilder(converter8);
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder9.headers;
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.headers;
        java.lang.Object[] objArray22 = new java.lang.Object[] { true, (short) 1, request19, 0 };
        requestBuilder9.args = objArray22;
        retrofit.converter.Converter converter24 = requestBuilder9.converter;
        java.util.List<retrofit.client.Header> headerList25 = requestBuilder9.headers;
        requestBuilder9.apiUrl = "hi!";
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
        java.lang.String str37 = request36.url;
        java.util.List<retrofit.client.Header> headerList38 = request36.headers;
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "", headerList38, typedOutput39);
        retrofit.RequestBuilder requestBuilder41 = requestBuilder9.headers(headerList38);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("", "hi!", headerList38, typedOutput42);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("hi!", "", headerList38, typedOutput44);
        retrofit.mime.TypedOutput typedOutput46 = null;
        retrofit.client.Request request47 = new retrofit.client.Request("", "hi!", headerList38, typedOutput46);
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "", headerList38, typedOutput48);
        java.lang.String str50 = request49.method;
        org.junit.Assert.assertNull(headerList10);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(converter24);
        org.junit.Assert.assertNull(headerList25);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNotNull(requestBuilder41);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        requestBuilder1.setapiUrl("");
        java.lang.String str4 = requestBuilder1.getapiUrl();
        java.lang.String str5 = requestBuilder1.apiUrl;
        retrofit.RequestBuilder requestBuilder7 = requestBuilder1.apiUrl("hi!");
        requestBuilder1.setapiUrl("");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(requestBuilder7);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder1.headers;
        java.lang.String str18 = requestBuilder1.getapiUrl();
        retrofit.RequestBuilder requestBuilder20 = requestBuilder1.apiUrl("");
        retrofit.converter.Converter converter21 = requestBuilder1.converter;
        requestBuilder1.setapiUrl("hi!");
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(headerList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNull(converter21);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.method;
        java.lang.String str16 = request14.url;
        java.lang.String str17 = request14.method;
        java.lang.String str18 = request14.getUrl();
        java.util.List<retrofit.client.Header> headerList19 = request14.getHeaders();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.lang.Object[] objArray4 = requestBuilder3.getargs();
        retrofit.converter.Converter converter5 = requestBuilder3.getconverter();
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder7.headers;
        retrofit.converter.Converter converter9 = null;
        retrofit.RequestBuilder requestBuilder10 = new retrofit.RequestBuilder(converter9);
        java.util.List<retrofit.client.Header> headerList11 = requestBuilder10.headers;
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.headers;
        java.lang.Object[] objArray23 = new java.lang.Object[] { true, (short) 1, request20, 0 };
        requestBuilder10.args = objArray23;
        requestBuilder7.setargs(objArray23);
        retrofit.RequestBuilder requestBuilder26 = requestBuilder3.args(objArray23);
        retrofit.client.Header[] headerArray37 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList38 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList38, headerArray37);
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList38, typedOutput40);
        java.lang.String str42 = request41.url;
        java.util.List<retrofit.client.Header> headerList43 = request41.headers;
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("", "", headerList43, typedOutput44);
        retrofit.mime.TypedOutput typedOutput46 = request45.body;
        java.util.List<retrofit.client.Header> headerList47 = request45.headers;
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("hi!", "", headerList47, typedOutput48);
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("", "hi!", headerList47, typedOutput50);
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("", "hi!", headerList47, typedOutput52);
        java.util.List<retrofit.client.Header> headerList54 = request53.headers;
        requestBuilder3.headers = headerList54;
        retrofit.mime.TypedOutput typedOutput56 = null;
        retrofit.client.Request request57 = new retrofit.client.Request("", "hi!", headerList54, typedOutput56);
        org.junit.Assert.assertNull(objArray4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNull(headerList8);
        org.junit.Assert.assertNull(headerList11);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNotNull(headerArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(headerList43);
        org.junit.Assert.assertNull(typedOutput46);
        org.junit.Assert.assertNotNull(headerList47);
        org.junit.Assert.assertNotNull(headerList54);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder7.headers;
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        java.util.List<retrofit.client.Header> headerList18 = request17.headers;
        java.lang.Object[] objArray20 = new java.lang.Object[] { true, (short) 1, request17, 0 };
        requestBuilder7.args = objArray20;
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.headers;
        requestBuilder7.setheaders(headerList29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("hi!", "hi!", headerList29, typedOutput31);
        java.util.List<retrofit.client.Header> headerList33 = request32.headers;
        java.util.List<retrofit.client.Header> headerList34 = request32.headers;
        retrofit.mime.TypedOutput typedOutput35 = request32.getBody();
        java.util.List<retrofit.client.Header> headerList36 = request32.headers;
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("", "hi!", headerList36, typedOutput37);
        java.util.List<retrofit.client.Header> headerList39 = request38.headers;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        java.lang.Class<?> wildcardClass42 = request41.getClass();
        org.junit.Assert.assertNull(headerList8);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNull(typedOutput35);
        org.junit.Assert.assertNotNull(headerList36);
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.converter.Converter converter20 = requestBuilder5.converter;
        java.lang.Object[] objArray21 = requestBuilder5.args;
        retrofit.converter.Converter converter22 = null;
        retrofit.RequestBuilder requestBuilder23 = new retrofit.RequestBuilder(converter22);
        java.util.List<retrofit.client.Header> headerList24 = requestBuilder23.headers;
        retrofit.client.Header[] headerArray29 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList30 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList30, headerArray29);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList30, typedOutput32);
        java.util.List<retrofit.client.Header> headerList34 = request33.headers;
        java.lang.Object[] objArray36 = new java.lang.Object[] { true, (short) 1, request33, 0 };
        requestBuilder23.args = objArray36;
        retrofit.converter.Converter converter38 = requestBuilder23.converter;
        java.lang.Object[] objArray39 = requestBuilder23.args;
        requestBuilder5.setargs(objArray39);
        retrofit.client.Header[] headerArray45 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList46 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList46, headerArray45);
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList46, typedOutput48);
        java.lang.String str50 = request49.url;
        java.util.List<retrofit.client.Header> headerList51 = request49.headers;
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("", "", headerList51, typedOutput52);
        retrofit.mime.TypedOutput typedOutput54 = request53.body;
        java.util.List<retrofit.client.Header> headerList55 = request53.headers;
        java.util.List<retrofit.client.Header> headerList56 = request53.getHeaders();
        retrofit.RequestBuilder requestBuilder57 = requestBuilder5.headers(headerList56);
        retrofit.mime.TypedOutput typedOutput58 = null;
        retrofit.client.Request request59 = new retrofit.client.Request("", "hi!", headerList56, typedOutput58);
        java.lang.String str60 = request59.method;
        java.util.List<retrofit.client.Header> headerList61 = request59.getHeaders();
        retrofit.mime.TypedOutput typedOutput62 = null;
        retrofit.client.Request request63 = new retrofit.client.Request("hi!", "hi!", headerList61, typedOutput62);
        retrofit.mime.TypedOutput typedOutput64 = request63.body;
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNull(headerList24);
        org.junit.Assert.assertNotNull(headerArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNull(converter38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(headerArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(headerList51);
        org.junit.Assert.assertNull(typedOutput54);
        org.junit.Assert.assertNotNull(headerList55);
        org.junit.Assert.assertNotNull(headerList56);
        org.junit.Assert.assertNotNull(requestBuilder57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(headerList61);
        org.junit.Assert.assertNull(typedOutput64);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.lang.String str13 = request12.url;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", headerList14, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = request16.body;
        java.util.List<retrofit.client.Header> headerList18 = request16.headers;
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", headerList18, typedOutput19);
        requestBuilder1.headers = headerList18;
        retrofit.client.Header[] headerArray28 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList29 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList29, headerArray28);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList29, typedOutput31);
        java.lang.String str33 = request32.url;
        java.util.List<retrofit.client.Header> headerList34 = request32.headers;
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "", headerList34, typedOutput35);
        retrofit.mime.TypedOutput typedOutput37 = request36.body;
        retrofit.mime.TypedOutput typedOutput38 = request36.getBody();
        java.util.List<retrofit.client.Header> headerList39 = request36.getHeaders();
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "", headerList39, typedOutput40);
        requestBuilder1.headers = headerList39;
        java.util.List<retrofit.client.Header> headerList43 = requestBuilder1.getheaders();
        retrofit.converter.Converter converter44 = requestBuilder1.getconverter();
        java.lang.String str45 = requestBuilder1.apiUrl;
        java.lang.Object[] objArray46 = requestBuilder1.getargs();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNull(typedOutput37);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNotNull(headerList43);
        org.junit.Assert.assertNull(converter44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(objArray46);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.url;
        java.util.List<retrofit.client.Header> headerList8 = request6.headers;
        retrofit.mime.TypedOutput typedOutput9 = request6.body;
        retrofit.mime.TypedOutput typedOutput10 = request6.body;
        retrofit.mime.TypedOutput typedOutput11 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput12 = request6.body;
        retrofit.mime.TypedOutput typedOutput13 = request6.getBody();
        java.lang.String str14 = request6.url;
        java.lang.String str15 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput16 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request6.headers;
        java.lang.String str18 = request6.getMethod();
        java.lang.String str19 = request6.url;
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = request8.body;
        retrofit.mime.TypedOutput typedOutput12 = request8.body;
        java.util.List<retrofit.client.Header> headerList13 = request8.headers;
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        java.lang.String str16 = request15.url;
        java.lang.String str17 = request15.getMethod();
        retrofit.mime.TypedOutput typedOutput18 = request15.body;
        retrofit.mime.TypedOutput typedOutput19 = request15.getBody();
        java.lang.String str20 = request15.getMethod();
        retrofit.mime.TypedOutput typedOutput21 = request15.body;
        java.lang.String str22 = request15.getUrl();
        retrofit.mime.TypedOutput typedOutput23 = request15.getBody();
        java.util.List<retrofit.client.Header> headerList24 = request15.headers;
        java.lang.String str25 = request15.method;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.converter.Converter converter20 = requestBuilder5.converter;
        java.lang.Object[] objArray21 = requestBuilder5.args;
        java.lang.Object[] objArray22 = null;
        retrofit.RequestBuilder requestBuilder23 = requestBuilder5.args(objArray22);
        java.lang.Object[] objArray24 = requestBuilder5.getargs();
        retrofit.client.Header[] headerArray29 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList30 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList30, headerArray29);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList30, typedOutput32);
        java.lang.String str34 = request33.url;
        java.util.List<retrofit.client.Header> headerList35 = request33.headers;
        retrofit.mime.TypedOutput typedOutput36 = request33.body;
        retrofit.mime.TypedOutput typedOutput37 = request33.body;
        java.util.List<retrofit.client.Header> headerList38 = request33.headers;
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "hi!", headerList38, typedOutput39);
        java.util.List<retrofit.client.Header> headerList41 = request40.getHeaders();
        retrofit.RequestBuilder requestBuilder42 = requestBuilder5.headers(headerList41);
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("", "", headerList41, typedOutput43);
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("hi!", "hi!", headerList41, typedOutput45);
        java.lang.String str47 = request46.method;
        retrofit.mime.TypedOutput typedOutput48 = request46.getBody();
        java.lang.String str49 = request46.url;
        java.util.List<retrofit.client.Header> headerList50 = request46.headers;
        java.lang.String str51 = request46.url;
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(requestBuilder23);
        org.junit.Assert.assertNull(objArray24);
        org.junit.Assert.assertNotNull(headerArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNull(typedOutput36);
        org.junit.Assert.assertNull(typedOutput37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNotNull(headerList41);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertNull(typedOutput48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(headerList50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        java.lang.String str15 = request14.url;
        java.util.List<retrofit.client.Header> headerList16 = request14.headers;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", headerList16, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.body;
        java.util.List<retrofit.client.Header> headerList20 = request18.headers;
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", headerList20, typedOutput21);
        java.lang.String str23 = request22.getUrl();
        java.util.List<retrofit.client.Header> headerList24 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", headerList24, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", headerList24, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.headers;
        java.lang.String str30 = request28.getUrl();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.converter.Converter converter3 = requestBuilder1.getconverter();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, 100.0d };
        retrofit.RequestBuilder requestBuilder7 = requestBuilder1.args(objArray6);
        requestBuilder7.setapiUrl("hi!");
        requestBuilder7.setapiUrl("hi!");
        requestBuilder7.setapiUrl("hi!");
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.lang.String str25 = request24.url;
        java.util.List<retrofit.client.Header> headerList26 = request24.headers;
        retrofit.mime.TypedOutput typedOutput27 = request24.body;
        retrofit.mime.TypedOutput typedOutput28 = request24.body;
        java.util.List<retrofit.client.Header> headerList29 = request24.headers;
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("hi!", "hi!", headerList29, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = request31.body;
        java.util.List<retrofit.client.Header> headerList33 = request31.getHeaders();
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "hi!", headerList33, typedOutput34);
        requestBuilder7.setheaders(headerList33);
        java.lang.Object[] objArray37 = requestBuilder7.getargs();
        retrofit.client.Header[] headerArray40 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList41 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList41, headerArray40);
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList41, typedOutput43);
        java.util.List<retrofit.client.Header> headerList45 = request44.headers;
        retrofit.mime.TypedOutput typedOutput46 = request44.body;
        java.lang.String str47 = request44.getUrl();
        java.lang.String str48 = request44.getMethod();
        java.util.List<retrofit.client.Header> headerList49 = request44.getHeaders();
        requestBuilder7.headers = headerList49;
        java.lang.Object[] objArray51 = requestBuilder7.args;
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNull(typedOutput32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(headerArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(headerList45);
        org.junit.Assert.assertNull(typedOutput46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(headerList49);
        org.junit.Assert.assertNotNull(objArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray51), "[0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray51), "[0.0, 100.0]");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.body;
        java.util.List<retrofit.client.Header> headerList16 = request14.headers;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", headerList16, typedOutput17);
        java.lang.String str19 = request18.getUrl();
        java.util.List<retrofit.client.Header> headerList20 = request18.getHeaders();
        java.util.List<retrofit.client.Header> headerList21 = request18.headers;
        java.util.List<retrofit.client.Header> headerList22 = request18.getHeaders();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(headerList22);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = request10.body;
        retrofit.mime.TypedOutput typedOutput14 = request10.body;
        java.util.List<retrofit.client.Header> headerList15 = request10.headers;
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "", headerList15, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = request19.body;
        java.lang.String str21 = request19.method;
        retrofit.mime.TypedOutput typedOutput22 = request19.body;
        java.lang.String str23 = request19.getUrl();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.lang.String str16 = request14.getUrl();
        retrofit.mime.TypedOutput typedOutput17 = request14.getBody();
        java.util.List<retrofit.client.Header> headerList18 = request14.headers;
        java.lang.String str19 = request14.url;
        java.lang.String str20 = request14.method;
        java.util.List<retrofit.client.Header> headerList21 = request14.getHeaders();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(headerList21);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = request10.body;
        retrofit.mime.TypedOutput typedOutput14 = request10.body;
        java.util.List<retrofit.client.Header> headerList15 = request10.headers;
        java.lang.String str16 = request10.url;
        java.util.List<retrofit.client.Header> headerList17 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList17, typedOutput20);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        requestBuilder1.setapiUrl("");
        java.lang.String str4 = requestBuilder1.getapiUrl();
        java.lang.String str5 = requestBuilder1.apiUrl;
        java.lang.String str6 = requestBuilder1.apiUrl;
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        java.lang.String str18 = request17.url;
        java.util.List<retrofit.client.Header> headerList19 = request17.headers;
        retrofit.mime.TypedOutput typedOutput20 = request17.body;
        retrofit.mime.TypedOutput typedOutput21 = request17.body;
        java.util.List<retrofit.client.Header> headerList22 = request17.headers;
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", headerList22, typedOutput23);
        java.lang.String str25 = request24.getMethod();
        java.util.List<retrofit.client.Header> headerList26 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "hi!", headerList26, typedOutput27);
        retrofit.RequestBuilder requestBuilder29 = requestBuilder1.headers(headerList26);
        java.lang.Object[] objArray30 = requestBuilder1.args;
        java.lang.Object[] objArray31 = requestBuilder1.args;
        retrofit.RequestBuilder requestBuilder33 = requestBuilder1.apiUrl("hi!");
        requestBuilder1.apiUrl = "hi!";
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str36 = requestBuilder1.buildRelativeUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(requestBuilder29);
        org.junit.Assert.assertNull(objArray30);
        org.junit.Assert.assertNull(objArray31);
        org.junit.Assert.assertNotNull(requestBuilder33);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        requestBuilder5.setapiUrl("");
        java.lang.String str8 = requestBuilder5.getapiUrl();
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        requestBuilder5.setheaders((java.util.List<retrofit.client.Header>) headerList12);
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder5.headers;
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList17, typedOutput20);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.body;
        java.util.List<retrofit.client.Header> headerList16 = request14.headers;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", headerList16, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.body;
        java.lang.String str20 = request18.url;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        retrofit.converter.Converter converter8 = null;
        retrofit.RequestBuilder requestBuilder9 = new retrofit.RequestBuilder(converter8);
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder9.headers;
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.headers;
        java.lang.Object[] objArray22 = new java.lang.Object[] { true, (short) 1, request19, 0 };
        requestBuilder9.args = objArray22;
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.headers;
        requestBuilder9.setheaders(headerList31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "hi!", headerList31, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "", headerList31, typedOutput35);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("", "hi!", headerList31, typedOutput37);
        retrofit.mime.TypedOutput typedOutput39 = request38.getBody();
        java.util.List<retrofit.client.Header> headerList40 = request38.headers;
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("hi!", "hi!", headerList40, typedOutput41);
        java.lang.String str43 = request42.method;
        org.junit.Assert.assertNull(headerList10);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNull(typedOutput39);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        retrofit.converter.Converter converter8 = null;
        retrofit.RequestBuilder requestBuilder9 = new retrofit.RequestBuilder(converter8);
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder9.headers;
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.headers;
        java.lang.Object[] objArray22 = new java.lang.Object[] { true, (short) 1, request19, 0 };
        requestBuilder9.args = objArray22;
        retrofit.converter.Converter converter24 = requestBuilder9.converter;
        java.lang.Object[] objArray25 = requestBuilder9.args;
        retrofit.client.Header[] headerArray28 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList29 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList29, headerArray28);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList29, typedOutput31);
        java.lang.String str33 = request32.url;
        java.util.List<retrofit.client.Header> headerList34 = request32.headers;
        retrofit.mime.TypedOutput typedOutput35 = request32.body;
        retrofit.mime.TypedOutput typedOutput36 = request32.body;
        java.util.List<retrofit.client.Header> headerList37 = request32.headers;
        requestBuilder9.setheaders(headerList37);
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("hi!", "hi!", headerList37, typedOutput39);
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("", "", headerList37, typedOutput41);
        java.util.List<retrofit.client.Header> headerList43 = request42.getHeaders();
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("", "hi!", headerList43, typedOutput44);
        retrofit.mime.TypedOutput typedOutput46 = null;
        retrofit.client.Request request47 = new retrofit.client.Request("hi!", "", headerList43, typedOutput46);
        java.lang.String str48 = request47.getMethod();
        retrofit.mime.TypedOutput typedOutput49 = request47.body;
        org.junit.Assert.assertNull(headerList10);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(converter24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNull(typedOutput35);
        org.junit.Assert.assertNull(typedOutput36);
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNotNull(headerList43);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNull(typedOutput49);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = request8.body;
        retrofit.mime.TypedOutput typedOutput12 = request8.body;
        java.util.List<retrofit.client.Header> headerList13 = request8.headers;
        java.lang.String str14 = request8.url;
        java.util.List<retrofit.client.Header> headerList15 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = request17.body;
        java.lang.String str19 = request17.url;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        java.lang.String str27 = request26.url;
        java.util.List<retrofit.client.Header> headerList28 = request26.headers;
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", headerList28, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = request30.body;
        java.util.List<retrofit.client.Header> headerList32 = request30.headers;
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "", headerList32, typedOutput33);
        requestBuilder1.headers = headerList32;
        java.util.List<retrofit.client.Header> headerList36 = requestBuilder1.getheaders();
        requestBuilder1.apiUrl = "";
        java.util.List<retrofit.client.Header> headerList39 = requestBuilder1.getheaders();
        java.lang.Object[] objArray40 = requestBuilder1.getargs();
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNull(typedOutput31);
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNotNull(headerList36);
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNotNull(objArray40);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList17, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.util.List<retrofit.client.Header> headerList28 = request26.getHeaders();
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", headerList28, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("hi!", "", headerList28, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "hi!", headerList28, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "", headerList28, typedOutput35);
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(headerList28);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.headers;
        retrofit.mime.TypedOutput typedOutput16 = request14.body;
        java.util.List<retrofit.client.Header> headerList17 = request14.headers;
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "hi!", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList17, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput24);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        retrofit.converter.Converter converter8 = null;
        retrofit.RequestBuilder requestBuilder9 = new retrofit.RequestBuilder(converter8);
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder9.headers;
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.headers;
        java.lang.Object[] objArray22 = new java.lang.Object[] { true, (short) 1, request19, 0 };
        requestBuilder9.args = objArray22;
        retrofit.converter.Converter converter24 = requestBuilder9.converter;
        java.util.List<retrofit.client.Header> headerList25 = requestBuilder9.headers;
        requestBuilder9.apiUrl = "hi!";
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
        java.lang.String str37 = request36.url;
        java.util.List<retrofit.client.Header> headerList38 = request36.headers;
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "", headerList38, typedOutput39);
        retrofit.RequestBuilder requestBuilder41 = requestBuilder9.headers(headerList38);
        java.util.List<retrofit.client.Header> headerList42 = requestBuilder9.headers;
        java.util.List<retrofit.client.Header> headerList43 = requestBuilder9.headers;
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("", "", headerList43, typedOutput44);
        retrofit.mime.TypedOutput typedOutput46 = null;
        retrofit.client.Request request47 = new retrofit.client.Request("", "", headerList43, typedOutput46);
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "hi!", headerList43, typedOutput48);
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("", "hi!", headerList43, typedOutput50);
        java.lang.Class<?> wildcardClass52 = headerList43.getClass();
        org.junit.Assert.assertNull(headerList10);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(converter24);
        org.junit.Assert.assertNull(headerList25);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNotNull(requestBuilder41);
        org.junit.Assert.assertNotNull(headerList42);
        org.junit.Assert.assertNotNull(headerList43);
        org.junit.Assert.assertNotNull(wildcardClass52);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.headers;
        retrofit.mime.TypedOutput typedOutput8 = request6.body;
        java.lang.String str9 = request6.getUrl();
        java.lang.String str10 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.lang.String str12 = request6.method;
        java.lang.String str13 = request6.getUrl();
        java.lang.String str14 = request6.getMethod();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.headers;
        java.lang.Object[] objArray16 = new java.lang.Object[] { true, (short) 1, request13, 0 };
        requestBuilder3.args = objArray16;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.headers;
        requestBuilder3.setheaders(headerList25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "hi!", headerList25, typedOutput27);
        java.lang.String str29 = request28.getUrl();
        java.util.List<retrofit.client.Header> headerList30 = request28.getHeaders();
        java.lang.String str31 = request28.method;
        java.util.List<retrofit.client.Header> headerList32 = request28.headers;
        org.junit.Assert.assertNull(headerList4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headerList32);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.headers;
        java.lang.Object[] objArray16 = new java.lang.Object[] { true, (short) 1, request13, 0 };
        requestBuilder3.args = objArray16;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.headers;
        requestBuilder3.setheaders(headerList25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "hi!", headerList25, typedOutput27);
        java.lang.String str29 = request28.getUrl();
        retrofit.mime.TypedOutput typedOutput30 = request28.getBody();
        java.lang.String str31 = request28.url;
        java.util.List<retrofit.client.Header> headerList32 = request28.getHeaders();
        java.lang.Class<?> wildcardClass33 = headerList32.getClass();
        org.junit.Assert.assertNull(headerList4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(typedOutput30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.body;
        java.lang.String str14 = request12.getMethod();
        java.lang.String str15 = request12.getUrl();
        java.lang.String str16 = request12.getMethod();
        java.lang.String str17 = request12.url;
        retrofit.mime.TypedOutput typedOutput18 = request12.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(typedOutput18);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.args;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.lang.String str25 = request24.url;
        java.util.List<retrofit.client.Header> headerList26 = request24.headers;
        retrofit.mime.TypedOutput typedOutput27 = request24.body;
        retrofit.mime.TypedOutput typedOutput28 = request24.body;
        java.util.List<retrofit.client.Header> headerList29 = request24.headers;
        requestBuilder1.setheaders(headerList29);
        requestBuilder1.setapiUrl("hi!");
        retrofit.RequestBuilder requestBuilder34 = requestBuilder1.apiUrl("hi!");
        retrofit.client.Header[] headerArray51 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList52 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList52, headerArray51);
        retrofit.mime.TypedOutput typedOutput54 = null;
        retrofit.client.Request request55 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList52, typedOutput54);
        java.lang.String str56 = request55.url;
        java.util.List<retrofit.client.Header> headerList57 = request55.headers;
        retrofit.mime.TypedOutput typedOutput58 = null;
        retrofit.client.Request request59 = new retrofit.client.Request("", "", headerList57, typedOutput58);
        retrofit.mime.TypedOutput typedOutput60 = request59.body;
        java.util.List<retrofit.client.Header> headerList61 = request59.headers;
        retrofit.mime.TypedOutput typedOutput62 = null;
        retrofit.client.Request request63 = new retrofit.client.Request("hi!", "", headerList61, typedOutput62);
        retrofit.mime.TypedOutput typedOutput64 = null;
        retrofit.client.Request request65 = new retrofit.client.Request("", "hi!", headerList61, typedOutput64);
        retrofit.mime.TypedOutput typedOutput66 = null;
        retrofit.client.Request request67 = new retrofit.client.Request("hi!", "", headerList61, typedOutput66);
        java.lang.String str68 = request67.method;
        java.util.List<retrofit.client.Header> headerList69 = request67.getHeaders();
        retrofit.mime.TypedOutput typedOutput70 = null;
        retrofit.client.Request request71 = new retrofit.client.Request("", "hi!", headerList69, typedOutput70);
        retrofit.mime.TypedOutput typedOutput72 = null;
        retrofit.client.Request request73 = new retrofit.client.Request("hi!", "", headerList69, typedOutput72);
        retrofit.mime.TypedOutput typedOutput74 = null;
        retrofit.client.Request request75 = new retrofit.client.Request("hi!", "hi!", headerList69, typedOutput74);
        requestBuilder1.headers = headerList69;
        retrofit.RequestBuilder requestBuilder78 = requestBuilder1.apiUrl("hi!");
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(requestBuilder34);
        org.junit.Assert.assertNotNull(headerArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertNotNull(headerList57);
        org.junit.Assert.assertNull(typedOutput60);
        org.junit.Assert.assertNotNull(headerList61);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertNotNull(headerList69);
        org.junit.Assert.assertNotNull(requestBuilder78);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.lang.String str16 = request14.getMethod();
        java.util.List<retrofit.client.Header> headerList17 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput20);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headerList17);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.Object[] objArray2 = requestBuilder1.getargs();
        requestBuilder1.setapiUrl("");
        java.lang.String str5 = requestBuilder1.getapiUrl();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request6 = requestBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(objArray2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder1.headers;
        requestBuilder1.apiUrl = "hi!";
        java.lang.Object[] objArray20 = requestBuilder1.getargs();
        retrofit.converter.Converter converter21 = requestBuilder1.getconverter();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request22 = requestBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(headerList17);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNull(converter21);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        requestBuilder1.setapiUrl("");
        java.lang.String str4 = requestBuilder1.getapiUrl();
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        retrofit.converter.Converter converter17 = null;
        retrofit.RequestBuilder requestBuilder18 = new retrofit.RequestBuilder(converter17);
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder18.headers;
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.headers;
        java.lang.Object[] objArray31 = new java.lang.Object[] { true, (short) 1, request28, 0 };
        requestBuilder18.args = objArray31;
        retrofit.client.Header[] headerArray35 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList36 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList36, headerArray35);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList36, typedOutput38);
        java.util.List<retrofit.client.Header> headerList40 = request39.headers;
        requestBuilder18.setheaders(headerList40);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("hi!", "hi!", headerList40, typedOutput42);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("hi!", "", headerList40, typedOutput44);
        requestBuilder1.setheaders(headerList40);
        retrofit.converter.Converter converter47 = requestBuilder1.converter;
        retrofit.converter.Converter converter48 = requestBuilder1.converter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = requestBuilder1.buildRelativeUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(objArray31);
        org.junit.Assert.assertNotNull(headerArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNull(converter47);
        org.junit.Assert.assertNull(converter48);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.headers;
        java.lang.Object[] objArray16 = new java.lang.Object[] { true, (short) 1, request13, 0 };
        requestBuilder3.args = objArray16;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.headers;
        requestBuilder3.setheaders(headerList25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "hi!", headerList25, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.getHeaders();
        java.lang.String str30 = request28.getMethod();
        java.lang.String str31 = request28.getMethod();
        retrofit.mime.TypedOutput typedOutput32 = request28.body;
        java.util.List<retrofit.client.Header> headerList33 = request28.getHeaders();
        retrofit.mime.TypedOutput typedOutput34 = request28.getBody();
        org.junit.Assert.assertNull(headerList4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(typedOutput32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNull(typedOutput34);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.converter.Converter converter20 = requestBuilder5.converter;
        java.util.List<retrofit.client.Header> headerList21 = requestBuilder5.headers;
        java.lang.String str22 = requestBuilder5.getapiUrl();
        retrofit.client.Header[] headerArray25 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList26 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList26, headerArray25);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList26, typedOutput28);
        java.util.List<retrofit.client.Header> headerList30 = request29.headers;
        requestBuilder5.setheaders(headerList30);
        retrofit.converter.Converter converter32 = requestBuilder5.converter;
        retrofit.converter.Converter converter33 = null;
        retrofit.RequestBuilder requestBuilder34 = new retrofit.RequestBuilder(converter33);
        requestBuilder34.setapiUrl("");
        java.lang.String str37 = requestBuilder34.getapiUrl();
        retrofit.client.Header[] headerArray40 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList41 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList41, headerArray40);
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList41, typedOutput43);
        requestBuilder34.setheaders((java.util.List<retrofit.client.Header>) headerList41);
        java.util.List<retrofit.client.Header> headerList46 = requestBuilder34.headers;
        retrofit.converter.Converter converter47 = requestBuilder34.getconverter();
        java.util.List<retrofit.client.Header> headerList48 = requestBuilder34.getheaders();
        requestBuilder5.setheaders(headerList48);
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("hi!", "", headerList48, typedOutput50);
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("", "", headerList48, typedOutput52);
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(headerList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNull(converter32);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(headerArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(headerList46);
        org.junit.Assert.assertNull(converter47);
        org.junit.Assert.assertNotNull(headerList48);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.url;
        java.util.List<retrofit.client.Header> headerList8 = request6.headers;
        retrofit.mime.TypedOutput typedOutput9 = request6.body;
        retrofit.mime.TypedOutput typedOutput10 = request6.body;
        retrofit.mime.TypedOutput typedOutput11 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request6.headers;
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.headers;
        java.lang.Object[] objArray16 = new java.lang.Object[] { true, (short) 1, request13, 0 };
        requestBuilder3.args = objArray16;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.headers;
        requestBuilder3.setheaders(headerList25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "hi!", headerList25, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.headers;
        java.util.List<retrofit.client.Header> headerList30 = request28.headers;
        java.lang.String str31 = request28.getMethod();
        org.junit.Assert.assertNull(headerList4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        retrofit.client.Header[] headerArray18 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList19 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList19, headerArray18);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList19, typedOutput21);
        java.lang.String str23 = request22.url;
        java.util.List<retrofit.client.Header> headerList24 = request22.headers;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = request26.body;
        java.util.List<retrofit.client.Header> headerList28 = request26.headers;
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "", headerList28, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "hi!", headerList28, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "", headerList28, typedOutput33);
        java.lang.String str35 = request34.method;
        java.util.List<retrofit.client.Header> headerList36 = request34.getHeaders();
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("", "hi!", headerList36, typedOutput37);
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("hi!", "", headerList36, typedOutput39);
        java.util.List<retrofit.client.Header> headerList41 = request40.headers;
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("hi!", "hi!", headerList41, typedOutput42);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("", "", headerList41, typedOutput44);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(headerList36);
        org.junit.Assert.assertNotNull(headerList41);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.headers;
        java.lang.String str8 = request6.getMethod();
        java.lang.String str9 = request6.getMethod();
        java.lang.String str10 = request6.getMethod();
        java.lang.String str11 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = request10.body;
        retrofit.mime.TypedOutput typedOutput14 = request10.body;
        java.util.List<retrofit.client.Header> headerList15 = request10.headers;
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput16);
        java.lang.String str18 = request17.url;
        java.lang.String str19 = request17.getMethod();
        retrofit.mime.TypedOutput typedOutput20 = request17.body;
        retrofit.mime.TypedOutput typedOutput21 = request17.getBody();
        java.lang.String str22 = request17.getMethod();
        retrofit.mime.TypedOutput typedOutput23 = request17.body;
        retrofit.mime.TypedOutput typedOutput24 = request17.body;
        java.lang.String str25 = request17.method;
        java.lang.String str26 = request17.url;
        java.util.List<retrofit.client.Header> headerList27 = request17.headers;
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", headerList27, typedOutput28);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(headerList27);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder7.headers;
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        java.util.List<retrofit.client.Header> headerList18 = request17.headers;
        java.lang.Object[] objArray20 = new java.lang.Object[] { true, (short) 1, request17, 0 };
        requestBuilder7.args = objArray20;
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.headers;
        requestBuilder7.setheaders(headerList29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "hi!", headerList29, typedOutput31);
        java.lang.String str33 = request32.method;
        java.lang.String str34 = request32.getMethod();
        java.util.List<retrofit.client.Header> headerList35 = request32.headers;
        java.util.List<retrofit.client.Header> headerList36 = request32.headers;
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("", "hi!", headerList36, typedOutput37);
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "", headerList36, typedOutput39);
        org.junit.Assert.assertNull(headerList8);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNotNull(headerList36);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        java.lang.String str17 = request16.url;
        java.util.List<retrofit.client.Header> headerList18 = request16.headers;
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", headerList18, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.body;
        java.util.List<retrofit.client.Header> headerList22 = request20.headers;
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "", headerList22, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "hi!", headerList22, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "", headerList22, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "hi!", headerList22, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = request30.body;
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNull(typedOutput31);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.lang.String str13 = request12.method;
        java.lang.String str14 = request12.method;
        java.lang.String str15 = request12.url;
        java.lang.String str16 = request12.url;
        retrofit.mime.TypedOutput typedOutput17 = request12.body;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(typedOutput17);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = request10.body;
        retrofit.mime.TypedOutput typedOutput14 = request10.body;
        java.util.List<retrofit.client.Header> headerList15 = request10.headers;
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput16);
        java.lang.String str18 = request17.url;
        java.lang.String str19 = request17.getMethod();
        java.lang.String str20 = request17.method;
        java.util.List<retrofit.client.Header> headerList21 = request17.headers;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", headerList21, typedOutput22);
        java.lang.Class<?> wildcardClass24 = request23.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.Object[] objArray2 = requestBuilder1.getargs();
        retrofit.converter.Converter converter3 = requestBuilder1.getconverter();
        requestBuilder1.apiUrl = "";
        java.lang.Object[] objArray6 = requestBuilder1.getargs();
        java.lang.Object[] objArray7 = requestBuilder1.args;
        java.lang.Object[] objArray8 = null;
        requestBuilder1.args = objArray8;
        java.lang.Object[] objArray10 = requestBuilder1.args;
        org.junit.Assert.assertNull(objArray2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertNull(objArray10);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.converter.Converter converter20 = requestBuilder5.converter;
        java.util.List<retrofit.client.Header> headerList21 = requestBuilder5.headers;
        requestBuilder5.apiUrl = "hi!";
        retrofit.client.Header[] headerArray28 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList29 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList29, headerArray28);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList29, typedOutput31);
        java.lang.String str33 = request32.url;
        java.util.List<retrofit.client.Header> headerList34 = request32.headers;
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "", headerList34, typedOutput35);
        retrofit.RequestBuilder requestBuilder37 = requestBuilder5.headers(headerList34);
        java.util.List<retrofit.client.Header> headerList38 = requestBuilder5.headers;
        java.util.List<retrofit.client.Header> headerList39 = requestBuilder5.headers;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("", "hi!", headerList39, typedOutput40);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("", "hi!", headerList39, typedOutput42);
        java.util.List<retrofit.client.Header> headerList44 = request43.getHeaders();
        java.lang.String str45 = request43.getMethod();
        java.util.List<retrofit.client.Header> headerList46 = request43.getHeaders();
        java.lang.String str47 = request43.method;
        java.util.List<retrofit.client.Header> headerList48 = request43.getHeaders();
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(headerList21);
        org.junit.Assert.assertNotNull(headerArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(headerList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(headerList48);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.headers;
        retrofit.mime.TypedOutput typedOutput10 = request8.body;
        java.util.List<retrofit.client.Header> headerList11 = request8.headers;
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request8.headers;
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.String str17 = request15.method;
        java.lang.String str18 = request15.method;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.args;
        java.lang.Object[] objArray18 = null;
        retrofit.RequestBuilder requestBuilder19 = requestBuilder1.args(objArray18);
        java.lang.Object[] objArray20 = requestBuilder1.getargs();
        java.lang.String str21 = requestBuilder1.getapiUrl();
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.headers;
        retrofit.mime.TypedOutput typedOutput32 = request30.body;
        java.util.List<retrofit.client.Header> headerList33 = request30.headers;
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "hi!", headerList33, typedOutput34);
        requestBuilder1.setheaders(headerList33);
        java.lang.Object[] objArray37 = requestBuilder1.getargs();
        requestBuilder1.apiUrl = "hi!";
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNull(typedOutput32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNull(objArray37);
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        java.util.List<retrofit.client.Header> headerList27 = request26.headers;
        requestBuilder5.setheaders(headerList27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "hi!", headerList27, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.headers;
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "hi!", headerList31, typedOutput32);
        java.lang.String str34 = request33.url;
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        java.lang.String str17 = request16.method;
        java.util.List<retrofit.client.Header> headerList18 = request16.headers;
        java.lang.String str19 = request16.method;
        retrofit.mime.TypedOutput typedOutput20 = request16.getBody();
        java.util.List<retrofit.client.Header> headerList21 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "", headerList21, typedOutput22);
        java.lang.String str24 = request23.getMethod();
        java.lang.String str25 = request23.url;
        java.lang.String str26 = request23.getMethod();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        java.lang.String str15 = request14.url;
        java.util.List<retrofit.client.Header> headerList16 = request14.headers;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", headerList16, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.body;
        java.util.List<retrofit.client.Header> headerList20 = request18.headers;
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", headerList20, typedOutput21);
        requestBuilder3.headers = headerList20;
        retrofit.client.Header[] headerArray30 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList31 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList31, headerArray30);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList31, typedOutput33);
        java.lang.String str35 = request34.url;
        java.util.List<retrofit.client.Header> headerList36 = request34.headers;
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("", "", headerList36, typedOutput37);
        retrofit.mime.TypedOutput typedOutput39 = request38.body;
        retrofit.mime.TypedOutput typedOutput40 = request38.getBody();
        java.util.List<retrofit.client.Header> headerList41 = request38.getHeaders();
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("", "", headerList41, typedOutput42);
        requestBuilder3.headers = headerList41;
        java.util.List<retrofit.client.Header> headerList45 = requestBuilder3.getheaders();
        retrofit.client.Header[] headerArray52 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList53 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList53, headerArray52);
        retrofit.mime.TypedOutput typedOutput55 = null;
        retrofit.client.Request request56 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList53, typedOutput55);
        java.lang.String str57 = request56.url;
        java.util.List<retrofit.client.Header> headerList58 = request56.headers;
        retrofit.mime.TypedOutput typedOutput59 = request56.body;
        retrofit.mime.TypedOutput typedOutput60 = request56.body;
        java.util.List<retrofit.client.Header> headerList61 = request56.headers;
        retrofit.mime.TypedOutput typedOutput62 = null;
        retrofit.client.Request request63 = new retrofit.client.Request("", "hi!", headerList61, typedOutput62);
        java.util.List<retrofit.client.Header> headerList64 = request63.getHeaders();
        retrofit.mime.TypedOutput typedOutput65 = null;
        retrofit.client.Request request66 = new retrofit.client.Request("", "hi!", headerList64, typedOutput65);
        requestBuilder3.headers = headerList64;
        java.util.List<retrofit.client.Header> headerList68 = requestBuilder3.getheaders();
        retrofit.mime.TypedOutput typedOutput69 = null;
        retrofit.client.Request request70 = new retrofit.client.Request("hi!", "", headerList68, typedOutput69);
        java.lang.String str71 = request70.getUrl();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(headerArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(headerList36);
        org.junit.Assert.assertNull(typedOutput39);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNotNull(headerList41);
        org.junit.Assert.assertNotNull(headerList45);
        org.junit.Assert.assertNotNull(headerArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertNotNull(headerList58);
        org.junit.Assert.assertNull(typedOutput59);
        org.junit.Assert.assertNull(typedOutput60);
        org.junit.Assert.assertNotNull(headerList61);
        org.junit.Assert.assertNotNull(headerList64);
        org.junit.Assert.assertNotNull(headerList68);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.headers;
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", headerList12, typedOutput15);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.body;
        retrofit.mime.TypedOutput typedOutput14 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request12.getHeaders();
        java.lang.String str16 = request12.getMethod();
        java.lang.String str17 = request12.getMethod();
        java.lang.String str18 = request12.url;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.lang.Object[] objArray2 = requestBuilder1.getargs();
        retrofit.converter.Converter converter3 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.converter.Converter converter7 = null;
        retrofit.RequestBuilder requestBuilder8 = new retrofit.RequestBuilder(converter7);
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder8.headers;
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.headers;
        java.lang.Object[] objArray21 = new java.lang.Object[] { true, (short) 1, request18, 0 };
        requestBuilder8.args = objArray21;
        requestBuilder5.setargs(objArray21);
        retrofit.RequestBuilder requestBuilder24 = requestBuilder1.args(objArray21);
        java.lang.Object[] objArray25 = requestBuilder1.args;
        java.util.List<retrofit.client.Header> headerList26 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray31 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList32 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList32, headerArray31);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList32, typedOutput34);
        java.lang.String str36 = request35.url;
        java.util.List<retrofit.client.Header> headerList37 = request35.headers;
        retrofit.mime.TypedOutput typedOutput38 = request35.body;
        retrofit.mime.TypedOutput typedOutput39 = request35.body;
        java.util.List<retrofit.client.Header> headerList40 = request35.headers;
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("hi!", "hi!", headerList40, typedOutput41);
        retrofit.mime.TypedOutput typedOutput43 = request42.body;
        java.util.List<retrofit.client.Header> headerList44 = request42.getHeaders();
        retrofit.mime.TypedOutput typedOutput45 = request42.getBody();
        retrofit.mime.TypedOutput typedOutput46 = request42.body;
        java.util.List<retrofit.client.Header> headerList47 = request42.getHeaders();
        retrofit.RequestBuilder requestBuilder48 = requestBuilder1.headers(headerList47);
        java.lang.String str49 = requestBuilder1.getapiUrl();
        org.junit.Assert.assertNull(objArray2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNull(headerList9);
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(objArray25);
        org.junit.Assert.assertNull(headerList26);
        org.junit.Assert.assertNotNull(headerArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNull(typedOutput39);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNull(typedOutput43);
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertNull(typedOutput45);
        org.junit.Assert.assertNull(typedOutput46);
        org.junit.Assert.assertNotNull(headerList47);
        org.junit.Assert.assertNotNull(requestBuilder48);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder7.headers;
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        java.util.List<retrofit.client.Header> headerList18 = request17.headers;
        java.lang.Object[] objArray20 = new java.lang.Object[] { true, (short) 1, request17, 0 };
        requestBuilder7.args = objArray20;
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.headers;
        requestBuilder7.setheaders(headerList29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("hi!", "hi!", headerList29, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "", headerList29, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "", headerList29, typedOutput35);
        org.junit.Assert.assertNull(headerList8);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(headerList29);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.lang.String str16 = request14.method;
        java.lang.String str17 = request14.getMethod();
        java.lang.String str18 = request14.url;
        java.lang.String str19 = request14.url;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.lang.String str13 = request12.url;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        retrofit.mime.TypedOutput typedOutput15 = request12.body;
        retrofit.mime.TypedOutput typedOutput16 = request12.body;
        java.util.List<retrofit.client.Header> headerList17 = request12.headers;
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = request21.body;
        java.util.List<retrofit.client.Header> headerList23 = request21.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "", headerList23, typedOutput24);
        java.lang.String str26 = request25.method;
        retrofit.mime.TypedOutput typedOutput27 = request25.body;
        java.util.List<retrofit.client.Header> headerList28 = request25.headers;
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNotNull(headerList28);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        requestBuilder1.setapiUrl("");
        retrofit.RequestBuilder requestBuilder5 = requestBuilder1.apiUrl("");
        requestBuilder5.apiUrl = "";
        retrofit.converter.Converter converter8 = requestBuilder5.getconverter();
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder5.headers;
        java.lang.Object[] objArray10 = requestBuilder5.getargs();
        java.lang.String str11 = requestBuilder5.getapiUrl();
        retrofit.converter.Converter converter12 = requestBuilder5.getconverter();
        retrofit.converter.Converter converter13 = requestBuilder5.converter;
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(converter8);
        org.junit.Assert.assertNull(headerList9);
        org.junit.Assert.assertNull(objArray10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(converter12);
        org.junit.Assert.assertNull(converter13);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.lang.String str13 = request12.url;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", headerList14, typedOutput15);
        java.lang.String str17 = request16.method;
        java.lang.String str18 = request16.method;
        java.lang.String str19 = request16.url;
        java.util.List<retrofit.client.Header> headerList20 = request16.headers;
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", headerList20, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList24 = request22.headers;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "", headerList24, typedOutput25);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(headerList24);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.body;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        java.lang.String str15 = request12.url;
        java.lang.String str16 = request12.getMethod();
        java.util.List<retrofit.client.Header> headerList17 = request12.headers;
        retrofit.mime.TypedOutput typedOutput18 = request12.getBody();
        java.lang.String str19 = request12.getUrl();
        java.util.List<retrofit.client.Header> headerList20 = request12.headers;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(headerList20);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        java.lang.String str19 = request18.url;
        java.util.List<retrofit.client.Header> headerList20 = request18.headers;
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", headerList20, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.body;
        java.util.List<retrofit.client.Header> headerList24 = request22.headers;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "", headerList24, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "hi!", headerList24, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "", headerList24, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("hi!", "", headerList24, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "hi!", headerList24, typedOutput33);
        java.lang.String str35 = request34.getUrl();
        java.lang.String str36 = request34.url;
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder1.headers;
        requestBuilder1.apiUrl = "hi!";
        retrofit.converter.Converter converter20 = requestBuilder1.converter;
        requestBuilder1.setapiUrl("");
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request23 = requestBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(headerList17);
        org.junit.Assert.assertNull(converter20);
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter19 = null;
        retrofit.RequestBuilder requestBuilder20 = new retrofit.RequestBuilder(converter19);
        java.util.List<retrofit.client.Header> headerList21 = requestBuilder20.headers;
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.headers;
        java.lang.Object[] objArray33 = new java.lang.Object[] { true, (short) 1, request30, 0 };
        requestBuilder20.args = objArray33;
        requestBuilder1.args = objArray33;
        retrofit.client.Header[] headerArray46 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList47 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList47, headerArray46);
        retrofit.mime.TypedOutput typedOutput49 = null;
        retrofit.client.Request request50 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList47, typedOutput49);
        java.lang.String str51 = request50.url;
        java.util.List<retrofit.client.Header> headerList52 = request50.headers;
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("", "", headerList52, typedOutput53);
        retrofit.mime.TypedOutput typedOutput55 = request54.body;
        java.util.List<retrofit.client.Header> headerList56 = request54.headers;
        retrofit.mime.TypedOutput typedOutput57 = null;
        retrofit.client.Request request58 = new retrofit.client.Request("hi!", "", headerList56, typedOutput57);
        retrofit.mime.TypedOutput typedOutput59 = null;
        retrofit.client.Request request60 = new retrofit.client.Request("hi!", "", headerList56, typedOutput59);
        retrofit.mime.TypedOutput typedOutput61 = null;
        retrofit.client.Request request62 = new retrofit.client.Request("", "", headerList56, typedOutput61);
        retrofit.RequestBuilder requestBuilder63 = requestBuilder1.headers(headerList56);
        retrofit.client.Header[] headerArray72 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList73 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean74 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList73, headerArray72);
        retrofit.mime.TypedOutput typedOutput75 = null;
        retrofit.client.Request request76 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList73, typedOutput75);
        java.lang.String str77 = request76.url;
        java.util.List<retrofit.client.Header> headerList78 = request76.headers;
        retrofit.mime.TypedOutput typedOutput79 = request76.body;
        retrofit.mime.TypedOutput typedOutput80 = request76.body;
        java.util.List<retrofit.client.Header> headerList81 = request76.headers;
        retrofit.mime.TypedOutput typedOutput82 = null;
        retrofit.client.Request request83 = new retrofit.client.Request("hi!", "hi!", headerList81, typedOutput82);
        java.lang.String str84 = request83.url;
        java.lang.String str85 = request83.getMethod();
        retrofit.mime.TypedOutput typedOutput86 = request83.body;
        java.util.List<retrofit.client.Header> headerList87 = request83.headers;
        retrofit.mime.TypedOutput typedOutput88 = null;
        retrofit.client.Request request89 = new retrofit.client.Request("", "", headerList87, typedOutput88);
        java.lang.String str90 = request89.method;
        retrofit.mime.TypedOutput typedOutput91 = request89.body;
        java.util.List<retrofit.client.Header> headerList92 = request89.headers;
        retrofit.mime.TypedOutput typedOutput93 = null;
        retrofit.client.Request request94 = new retrofit.client.Request("hi!", "", headerList92, typedOutput93);
        retrofit.RequestBuilder requestBuilder95 = requestBuilder63.headers(headerList92);
        retrofit.converter.Converter converter96 = requestBuilder63.converter;
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(headerList21);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNotNull(objArray33);
        org.junit.Assert.assertNotNull(headerArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(headerList52);
        org.junit.Assert.assertNull(typedOutput55);
        org.junit.Assert.assertNotNull(headerList56);
        org.junit.Assert.assertNotNull(requestBuilder63);
        org.junit.Assert.assertNotNull(headerArray72);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertNotNull(headerList78);
        org.junit.Assert.assertNull(typedOutput79);
        org.junit.Assert.assertNull(typedOutput80);
        org.junit.Assert.assertNotNull(headerList81);
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertNull(typedOutput86);
        org.junit.Assert.assertNotNull(headerList87);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertNull(typedOutput91);
        org.junit.Assert.assertNotNull(headerList92);
        org.junit.Assert.assertNotNull(requestBuilder95);
        org.junit.Assert.assertNull(converter96);
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        java.lang.Object[] objArray16 = requestBuilder1.args;
        retrofit.converter.Converter converter21 = null;
        retrofit.RequestBuilder requestBuilder22 = new retrofit.RequestBuilder(converter21);
        retrofit.client.Header[] headerArray29 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList30 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList30, headerArray29);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList30, typedOutput32);
        java.lang.String str34 = request33.url;
        java.util.List<retrofit.client.Header> headerList35 = request33.headers;
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "", headerList35, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = request37.body;
        java.util.List<retrofit.client.Header> headerList39 = request37.headers;
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("hi!", "", headerList39, typedOutput40);
        requestBuilder22.headers = headerList39;
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("", "", headerList39, typedOutput43);
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("hi!", "hi!", headerList39, typedOutput45);
        java.util.List<retrofit.client.Header> headerList47 = request46.headers;
        requestBuilder1.headers = headerList47;
        retrofit.converter.Converter converter49 = requestBuilder1.getconverter();
        java.lang.String str50 = requestBuilder1.getapiUrl();
        requestBuilder1.setapiUrl("");
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(headerArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNull(typedOutput38);
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNotNull(headerList47);
        org.junit.Assert.assertNull(converter49);
        org.junit.Assert.assertNull(str50);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.converter;
        java.lang.Object[] objArray3 = requestBuilder1.args;
        java.lang.String str4 = requestBuilder1.getapiUrl();
        retrofit.converter.Converter converter5 = requestBuilder1.converter;
        requestBuilder1.setapiUrl("");
        retrofit.converter.Converter converter8 = requestBuilder1.getconverter();
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(objArray3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNull(converter8);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.args;
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder19.headers;
        retrofit.client.Header[] headerArray25 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList26 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList26, headerArray25);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList26, typedOutput28);
        java.util.List<retrofit.client.Header> headerList30 = request29.headers;
        java.lang.Object[] objArray32 = new java.lang.Object[] { true, (short) 1, request29, 0 };
        requestBuilder19.args = objArray32;
        retrofit.converter.Converter converter34 = requestBuilder19.converter;
        java.lang.Object[] objArray35 = requestBuilder19.args;
        requestBuilder1.setargs(objArray35);
        java.util.List<retrofit.client.Header> headerList37 = requestBuilder1.headers;
        retrofit.RequestBuilder requestBuilder39 = requestBuilder1.apiUrl("hi!");
        java.lang.String str40 = requestBuilder39.getapiUrl();
        java.util.List<retrofit.client.Header> headerList41 = requestBuilder39.getheaders();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request42 = requestBuilder39.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(headerList20);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNull(converter34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNull(headerList37);
        org.junit.Assert.assertNotNull(requestBuilder39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNull(headerList41);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = request10.body;
        retrofit.mime.TypedOutput typedOutput14 = request10.body;
        java.util.List<retrofit.client.Header> headerList15 = request10.headers;
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = request17.body;
        java.util.List<retrofit.client.Header> headerList19 = request17.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "hi!", headerList19, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.headers;
        java.lang.String str23 = request21.getUrl();
        retrofit.mime.TypedOutput typedOutput24 = request21.body;
        java.lang.String str25 = request21.url;
        java.lang.String str26 = request21.getUrl();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.lang.String str13 = request12.url;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        retrofit.mime.TypedOutput typedOutput15 = request12.body;
        retrofit.mime.TypedOutput typedOutput16 = request12.body;
        retrofit.mime.TypedOutput typedOutput17 = request12.getBody();
        retrofit.mime.TypedOutput typedOutput18 = request12.body;
        java.util.List<retrofit.client.Header> headerList19 = request12.getHeaders();
        java.util.List<retrofit.client.Header> headerList20 = request12.getHeaders();
        java.util.List<retrofit.client.Header> headerList21 = request12.getHeaders();
        java.util.List<retrofit.client.Header> headerList22 = request12.headers;
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", headerList22, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "hi!", headerList22, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "", headerList22, typedOutput27);
        java.util.List<retrofit.client.Header> headerList29 = request28.getHeaders();
        java.util.List<retrofit.client.Header> headerList30 = request28.getHeaders();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(headerList30);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.args;
        java.lang.Object[] objArray18 = null;
        retrofit.RequestBuilder requestBuilder19 = requestBuilder1.args(objArray18);
        retrofit.converter.Converter converter20 = null;
        retrofit.RequestBuilder requestBuilder21 = new retrofit.RequestBuilder(converter20);
        java.util.List<retrofit.client.Header> headerList22 = requestBuilder21.headers;
        retrofit.converter.Converter converter23 = requestBuilder21.getconverter();
        retrofit.RequestBuilder requestBuilder25 = requestBuilder21.apiUrl("hi!");
        java.lang.Object[] objArray26 = requestBuilder21.args;
        requestBuilder21.setapiUrl("hi!");
        retrofit.converter.Converter converter29 = null;
        retrofit.RequestBuilder requestBuilder30 = new retrofit.RequestBuilder(converter29);
        requestBuilder30.setapiUrl("");
        java.lang.String str33 = requestBuilder30.getapiUrl();
        requestBuilder30.setapiUrl("hi!");
        retrofit.RequestBuilder requestBuilder37 = requestBuilder30.apiUrl("");
        retrofit.converter.Converter converter38 = null;
        retrofit.RequestBuilder requestBuilder39 = new retrofit.RequestBuilder(converter38);
        java.lang.Object[] objArray40 = requestBuilder39.getargs();
        retrofit.converter.Converter converter41 = requestBuilder39.getconverter();
        retrofit.converter.Converter converter42 = null;
        retrofit.RequestBuilder requestBuilder43 = new retrofit.RequestBuilder(converter42);
        java.util.List<retrofit.client.Header> headerList44 = requestBuilder43.headers;
        retrofit.converter.Converter converter45 = null;
        retrofit.RequestBuilder requestBuilder46 = new retrofit.RequestBuilder(converter45);
        java.util.List<retrofit.client.Header> headerList47 = requestBuilder46.headers;
        retrofit.client.Header[] headerArray52 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList53 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList53, headerArray52);
        retrofit.mime.TypedOutput typedOutput55 = null;
        retrofit.client.Request request56 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList53, typedOutput55);
        java.util.List<retrofit.client.Header> headerList57 = request56.headers;
        java.lang.Object[] objArray59 = new java.lang.Object[] { true, (short) 1, request56, 0 };
        requestBuilder46.args = objArray59;
        requestBuilder43.setargs(objArray59);
        retrofit.RequestBuilder requestBuilder62 = requestBuilder39.args(objArray59);
        java.lang.Object[] objArray63 = requestBuilder39.args;
        requestBuilder30.args = objArray63;
        retrofit.RequestBuilder requestBuilder65 = requestBuilder21.args(objArray63);
        retrofit.converter.Converter converter66 = null;
        retrofit.RequestBuilder requestBuilder67 = new retrofit.RequestBuilder(converter66);
        java.util.List<retrofit.client.Header> headerList68 = requestBuilder67.headers;
        retrofit.client.Header[] headerArray73 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList74 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList74, headerArray73);
        retrofit.mime.TypedOutput typedOutput76 = null;
        retrofit.client.Request request77 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList74, typedOutput76);
        java.util.List<retrofit.client.Header> headerList78 = request77.headers;
        java.lang.Object[] objArray80 = new java.lang.Object[] { true, (short) 1, request77, 0 };
        requestBuilder67.args = objArray80;
        retrofit.client.Header[] headerArray84 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList85 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList85, headerArray84);
        retrofit.mime.TypedOutput typedOutput87 = null;
        retrofit.client.Request request88 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList85, typedOutput87);
        java.util.List<retrofit.client.Header> headerList89 = request88.headers;
        requestBuilder67.setheaders(headerList89);
        java.lang.Object[] objArray91 = requestBuilder67.getargs();
        requestBuilder65.setargs(objArray91);
        retrofit.RequestBuilder requestBuilder93 = requestBuilder19.args(objArray91);
        java.lang.Object[] objArray94 = requestBuilder19.args;
        java.lang.String str95 = requestBuilder19.getapiUrl();
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNull(headerList22);
        org.junit.Assert.assertNull(converter23);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNull(objArray26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(requestBuilder37);
        org.junit.Assert.assertNull(objArray40);
        org.junit.Assert.assertNull(converter41);
        org.junit.Assert.assertNull(headerList44);
        org.junit.Assert.assertNull(headerList47);
        org.junit.Assert.assertNotNull(headerArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(headerList57);
        org.junit.Assert.assertNotNull(objArray59);
        org.junit.Assert.assertNotNull(requestBuilder62);
        org.junit.Assert.assertNotNull(objArray63);
        org.junit.Assert.assertNotNull(requestBuilder65);
        org.junit.Assert.assertNull(headerList68);
        org.junit.Assert.assertNotNull(headerArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(headerList78);
        org.junit.Assert.assertNotNull(objArray80);
        org.junit.Assert.assertNotNull(headerArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(headerList89);
        org.junit.Assert.assertNotNull(objArray91);
        org.junit.Assert.assertNotNull(requestBuilder93);
        org.junit.Assert.assertNotNull(objArray94);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.url;
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.lang.String str9 = request6.getMethod();
        java.lang.String str10 = request6.method;
        java.lang.String str11 = request6.url;
        retrofit.mime.TypedOutput typedOutput12 = request6.body;
        java.lang.String str13 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput14 = request6.getBody();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(typedOutput14);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.headers;
        java.lang.Object[] objArray16 = new java.lang.Object[] { true, (short) 1, request13, 0 };
        requestBuilder3.args = objArray16;
        retrofit.converter.Converter converter18 = requestBuilder3.converter;
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder3.headers;
        requestBuilder3.apiUrl = "hi!";
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        java.lang.String str31 = request30.url;
        java.util.List<retrofit.client.Header> headerList32 = request30.headers;
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "", headerList32, typedOutput33);
        retrofit.RequestBuilder requestBuilder35 = requestBuilder3.headers(headerList32);
        java.lang.Object[] objArray36 = requestBuilder3.getargs();
        java.util.List<retrofit.client.Header> headerList37 = requestBuilder3.getheaders();
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("hi!", "", headerList37, typedOutput38);
        java.lang.String str40 = request39.getMethod();
        org.junit.Assert.assertNull(headerList4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        java.util.List<retrofit.client.Header> headerList27 = request26.headers;
        requestBuilder5.setheaders(headerList27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "hi!", headerList27, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.headers;
        java.util.List<retrofit.client.Header> headerList32 = request30.headers;
        retrofit.mime.TypedOutput typedOutput33 = request30.getBody();
        java.util.List<retrofit.client.Header> headerList34 = request30.headers;
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "hi!", headerList34, typedOutput35);
        java.util.List<retrofit.client.Header> headerList37 = request36.headers;
        java.lang.String str38 = request36.url;
        java.lang.String str39 = request36.getMethod();
        java.lang.String str40 = request36.getMethod();
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNull(typedOutput33);
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.converter.Converter converter20 = requestBuilder5.converter;
        java.util.List<retrofit.client.Header> headerList21 = requestBuilder5.headers;
        java.util.List<retrofit.client.Header> headerList22 = requestBuilder5.headers;
        retrofit.RequestBuilder requestBuilder24 = requestBuilder5.apiUrl("");
        retrofit.client.Header[] headerArray29 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList30 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList30, headerArray29);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList30, typedOutput32);
        java.lang.String str34 = request33.url;
        java.util.List<retrofit.client.Header> headerList35 = request33.headers;
        retrofit.mime.TypedOutput typedOutput36 = request33.body;
        retrofit.mime.TypedOutput typedOutput37 = request33.body;
        java.util.List<retrofit.client.Header> headerList38 = request33.headers;
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("hi!", "hi!", headerList38, typedOutput39);
        java.util.List<retrofit.client.Header> headerList41 = request40.getHeaders();
        retrofit.RequestBuilder requestBuilder42 = requestBuilder5.headers(headerList41);
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("", "hi!", headerList41, typedOutput43);
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("", "hi!", headerList41, typedOutput45);
        java.lang.String str47 = request46.method;
        retrofit.mime.TypedOutput typedOutput48 = request46.body;
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(headerList21);
        org.junit.Assert.assertNull(headerList22);
        org.junit.Assert.assertNotNull(requestBuilder24);
        org.junit.Assert.assertNotNull(headerArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNull(typedOutput36);
        org.junit.Assert.assertNull(typedOutput37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNotNull(headerList41);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNull(typedOutput48);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.url;
        java.lang.String str8 = request6.method;
        java.util.List<retrofit.client.Header> headerList9 = request6.headers;
        java.lang.String str10 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request6.headers;
        java.lang.String str12 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.converter.Converter converter3 = requestBuilder1.getconverter();
        retrofit.RequestBuilder requestBuilder5 = requestBuilder1.apiUrl("hi!");
        java.lang.Object[] objArray6 = requestBuilder1.args;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter9 = null;
        retrofit.RequestBuilder requestBuilder10 = new retrofit.RequestBuilder(converter9);
        requestBuilder10.setapiUrl("");
        java.lang.String str13 = requestBuilder10.getapiUrl();
        requestBuilder10.setapiUrl("hi!");
        retrofit.RequestBuilder requestBuilder17 = requestBuilder10.apiUrl("");
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        java.lang.Object[] objArray20 = requestBuilder19.getargs();
        retrofit.converter.Converter converter21 = requestBuilder19.getconverter();
        retrofit.converter.Converter converter22 = null;
        retrofit.RequestBuilder requestBuilder23 = new retrofit.RequestBuilder(converter22);
        java.util.List<retrofit.client.Header> headerList24 = requestBuilder23.headers;
        retrofit.converter.Converter converter25 = null;
        retrofit.RequestBuilder requestBuilder26 = new retrofit.RequestBuilder(converter25);
        java.util.List<retrofit.client.Header> headerList27 = requestBuilder26.headers;
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
        java.util.List<retrofit.client.Header> headerList37 = request36.headers;
        java.lang.Object[] objArray39 = new java.lang.Object[] { true, (short) 1, request36, 0 };
        requestBuilder26.args = objArray39;
        requestBuilder23.setargs(objArray39);
        retrofit.RequestBuilder requestBuilder42 = requestBuilder19.args(objArray39);
        java.lang.Object[] objArray43 = requestBuilder19.args;
        requestBuilder10.args = objArray43;
        retrofit.RequestBuilder requestBuilder45 = requestBuilder1.args(objArray43);
        retrofit.converter.Converter converter46 = requestBuilder45.converter;
        java.util.List<retrofit.client.Header> headerList47 = requestBuilder45.headers;
        java.util.List<retrofit.client.Header> headerList48 = requestBuilder45.headers;
        java.lang.Object[] objArray49 = requestBuilder45.args;
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNull(headerList24);
        org.junit.Assert.assertNull(headerList27);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(requestBuilder45);
        org.junit.Assert.assertNull(converter46);
        org.junit.Assert.assertNull(headerList47);
        org.junit.Assert.assertNull(headerList48);
        org.junit.Assert.assertNotNull(objArray49);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        requestBuilder1.setapiUrl("");
        retrofit.RequestBuilder requestBuilder5 = requestBuilder1.apiUrl("");
        java.lang.Object[] objArray6 = requestBuilder5.getargs();
        requestBuilder5.apiUrl = "hi!";
        retrofit.converter.Converter converter9 = requestBuilder5.converter;
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNull(converter9);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = request8.body;
        retrofit.mime.TypedOutput typedOutput12 = request8.body;
        java.util.List<retrofit.client.Header> headerList13 = request8.headers;
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = request15.body;
        java.util.List<retrofit.client.Header> headerList17 = request15.headers;
        retrofit.mime.TypedOutput typedOutput18 = request15.getBody();
        java.lang.String str19 = request15.getUrl();
        java.util.List<retrofit.client.Header> headerList20 = request15.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = request15.getBody();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNull(typedOutput21);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.url;
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.url;
        java.lang.String str11 = request6.url;
        java.lang.String str12 = request6.url;
        java.lang.String str13 = request6.method;
        java.util.List<retrofit.client.Header> headerList14 = request6.headers;
        java.lang.String str15 = request6.method;
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        requestBuilder1.setapiUrl("");
        java.lang.String str4 = requestBuilder1.getapiUrl();
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        java.lang.String str13 = requestBuilder1.getapiUrl();
        java.lang.Object[] objArray14 = requestBuilder1.getargs();
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        java.util.List<retrofit.client.Header> headerList26 = request25.headers;
        java.util.List<retrofit.client.Header> headerList27 = request25.headers;
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", headerList27, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "hi!", headerList27, typedOutput30);
        requestBuilder1.headers = headerList27;
        java.util.List<retrofit.client.Header> headerList33 = null;
        requestBuilder1.headers = headerList33;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(objArray14);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(headerList27);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.lang.String str13 = request12.url;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        retrofit.mime.TypedOutput typedOutput15 = request12.body;
        retrofit.mime.TypedOutput typedOutput16 = request12.body;
        java.util.List<retrofit.client.Header> headerList17 = request12.headers;
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = request19.body;
        java.util.List<retrofit.client.Header> headerList21 = request19.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", headerList21, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.headers;
        java.lang.String str25 = request23.getUrl();
        java.lang.String str26 = request23.getUrl();
        java.util.List<retrofit.client.Header> headerList27 = request23.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "hi!", headerList27, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = request29.body;
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNull(typedOutput30);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.method;
        java.lang.String str16 = request14.getUrl();
        java.util.List<retrofit.client.Header> headerList17 = request14.getHeaders();
        java.lang.String str18 = request14.method;
        java.util.List<retrofit.client.Header> headerList19 = request14.headers;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        java.lang.String str17 = request16.url;
        java.util.List<retrofit.client.Header> headerList18 = request16.headers;
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", headerList18, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.body;
        java.util.List<retrofit.client.Header> headerList22 = request20.headers;
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "", headerList22, typedOutput23);
        requestBuilder5.headers = headerList22;
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
        java.lang.String str37 = request36.url;
        java.util.List<retrofit.client.Header> headerList38 = request36.headers;
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "", headerList38, typedOutput39);
        retrofit.mime.TypedOutput typedOutput41 = request40.body;
        retrofit.mime.TypedOutput typedOutput42 = request40.getBody();
        java.util.List<retrofit.client.Header> headerList43 = request40.getHeaders();
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("", "", headerList43, typedOutput44);
        requestBuilder5.headers = headerList43;
        java.util.List<retrofit.client.Header> headerList47 = requestBuilder5.getheaders();
        retrofit.client.Header[] headerArray54 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList55 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList55, headerArray54);
        retrofit.mime.TypedOutput typedOutput57 = null;
        retrofit.client.Request request58 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList55, typedOutput57);
        java.lang.String str59 = request58.url;
        java.util.List<retrofit.client.Header> headerList60 = request58.headers;
        retrofit.mime.TypedOutput typedOutput61 = request58.body;
        retrofit.mime.TypedOutput typedOutput62 = request58.body;
        java.util.List<retrofit.client.Header> headerList63 = request58.headers;
        retrofit.mime.TypedOutput typedOutput64 = null;
        retrofit.client.Request request65 = new retrofit.client.Request("", "hi!", headerList63, typedOutput64);
        java.util.List<retrofit.client.Header> headerList66 = request65.getHeaders();
        retrofit.mime.TypedOutput typedOutput67 = null;
        retrofit.client.Request request68 = new retrofit.client.Request("", "hi!", headerList66, typedOutput67);
        requestBuilder5.headers = headerList66;
        retrofit.client.Header[] headerArray74 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList75 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList75, headerArray74);
        retrofit.mime.TypedOutput typedOutput77 = null;
        retrofit.client.Request request78 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList75, typedOutput77);
        java.util.List<retrofit.client.Header> headerList79 = request78.headers;
        java.util.List<retrofit.client.Header> headerList80 = request78.headers;
        retrofit.mime.TypedOutput typedOutput81 = null;
        retrofit.client.Request request82 = new retrofit.client.Request("", "", headerList80, typedOutput81);
        retrofit.RequestBuilder requestBuilder83 = requestBuilder5.headers(headerList80);
        java.util.List<retrofit.client.Header> headerList84 = requestBuilder83.getheaders();
        retrofit.mime.TypedOutput typedOutput85 = null;
        retrofit.client.Request request86 = new retrofit.client.Request("hi!", "", headerList84, typedOutput85);
        retrofit.mime.TypedOutput typedOutput87 = null;
        retrofit.client.Request request88 = new retrofit.client.Request("hi!", "", headerList84, typedOutput87);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNull(typedOutput41);
        org.junit.Assert.assertNull(typedOutput42);
        org.junit.Assert.assertNotNull(headerList43);
        org.junit.Assert.assertNotNull(headerList47);
        org.junit.Assert.assertNotNull(headerArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(headerList60);
        org.junit.Assert.assertNull(typedOutput61);
        org.junit.Assert.assertNull(typedOutput62);
        org.junit.Assert.assertNotNull(headerList63);
        org.junit.Assert.assertNotNull(headerList66);
        org.junit.Assert.assertNotNull(headerArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(headerList79);
        org.junit.Assert.assertNotNull(headerList80);
        org.junit.Assert.assertNotNull(requestBuilder83);
        org.junit.Assert.assertNotNull(headerList84);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.args;
        java.lang.Object[] objArray18 = null;
        retrofit.RequestBuilder requestBuilder19 = requestBuilder1.args(objArray18);
        retrofit.converter.Converter converter20 = requestBuilder19.getconverter();
        retrofit.RequestBuilder requestBuilder22 = requestBuilder19.apiUrl("");
        retrofit.converter.Converter converter23 = requestBuilder19.converter;
        java.lang.String str24 = requestBuilder19.apiUrl;
        java.util.List<retrofit.client.Header> headerList25 = requestBuilder19.headers;
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNull(converter23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(headerList25);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        requestBuilder1.setapiUrl("");
        java.lang.String str4 = requestBuilder1.getapiUrl();
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        java.lang.String str13 = requestBuilder1.getapiUrl();
        java.lang.Object[] objArray14 = requestBuilder1.args;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(objArray14);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        requestBuilder3.setapiUrl("");
        java.lang.String str6 = requestBuilder3.getapiUrl();
        java.util.List<retrofit.client.Header> headerList7 = requestBuilder3.getheaders();
        retrofit.client.Header[] headerArray18 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList19 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList19, headerArray18);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList19, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList19, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList19, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList19, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList19, typedOutput29);
        requestBuilder3.headers = headerList19;
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList19, typedOutput32);
        java.util.List<retrofit.client.Header> headerList34 = request33.getHeaders();
        java.util.List<retrofit.client.Header> headerList35 = request33.getHeaders();
        java.lang.String str36 = request33.getMethod();
        retrofit.mime.TypedOutput typedOutput37 = request33.getBody();
        java.util.List<retrofit.client.Header> headerList38 = request33.getHeaders();
        java.lang.String str39 = request33.getMethod();
        retrofit.mime.TypedOutput typedOutput40 = request33.body;
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(headerList7);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNull(typedOutput37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(typedOutput40);
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        java.lang.String str19 = request18.getMethod();
        java.util.List<retrofit.client.Header> headerList20 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", headerList20, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", headerList20, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.headers;
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(headerList25);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.method;
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.headers;
        java.lang.String str12 = request8.url;
        java.util.List<retrofit.client.Header> headerList13 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "", headerList13, typedOutput14);
        java.lang.String str16 = request15.getUrl();
        java.lang.String str17 = request15.getUrl();
        java.util.List<retrofit.client.Header> headerList18 = request15.headers;
        retrofit.mime.TypedOutput typedOutput19 = request15.body;
        java.lang.String str20 = request15.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.args;
        java.lang.Object[] objArray18 = null;
        retrofit.RequestBuilder requestBuilder19 = requestBuilder1.args(objArray18);
        retrofit.converter.Converter converter20 = requestBuilder1.converter;
        requestBuilder1.setapiUrl("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = requestBuilder1.buildRelativeUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNull(converter20);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = request10.body;
        retrofit.mime.TypedOutput typedOutput14 = request10.body;
        java.util.List<retrofit.client.Header> headerList15 = request10.headers;
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = request17.body;
        java.util.List<retrofit.client.Header> headerList19 = request17.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "hi!", headerList19, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.headers;
        java.lang.String str23 = request21.url;
        java.lang.String str24 = request21.getUrl();
        retrofit.mime.TypedOutput typedOutput25 = request21.body;
        retrofit.mime.TypedOutput typedOutput26 = request21.body;
        java.lang.String str27 = request21.getMethod();
        java.lang.String str28 = request21.getUrl();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.body;
        java.util.List<retrofit.client.Header> headerList16 = request14.headers;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", headerList16, typedOutput17);
        java.lang.String str19 = request18.url;
        java.lang.String str20 = request18.url;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        java.util.List<retrofit.client.Header> headerList20 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", headerList20, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", headerList20, typedOutput23);
        java.lang.String str25 = request24.getMethod();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.headers;
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.converter.Converter converter20 = requestBuilder5.converter;
        java.lang.Object[] objArray21 = requestBuilder5.args;
        retrofit.converter.Converter converter22 = null;
        retrofit.RequestBuilder requestBuilder23 = new retrofit.RequestBuilder(converter22);
        java.util.List<retrofit.client.Header> headerList24 = requestBuilder23.headers;
        retrofit.client.Header[] headerArray29 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList30 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList30, headerArray29);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList30, typedOutput32);
        java.util.List<retrofit.client.Header> headerList34 = request33.headers;
        java.lang.Object[] objArray36 = new java.lang.Object[] { true, (short) 1, request33, 0 };
        requestBuilder23.args = objArray36;
        retrofit.converter.Converter converter38 = requestBuilder23.converter;
        java.lang.Object[] objArray39 = requestBuilder23.args;
        requestBuilder5.setargs(objArray39);
        retrofit.client.Header[] headerArray45 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList46 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList46, headerArray45);
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList46, typedOutput48);
        java.lang.String str50 = request49.url;
        java.util.List<retrofit.client.Header> headerList51 = request49.headers;
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("", "", headerList51, typedOutput52);
        retrofit.mime.TypedOutput typedOutput54 = request53.body;
        java.util.List<retrofit.client.Header> headerList55 = request53.headers;
        java.util.List<retrofit.client.Header> headerList56 = request53.getHeaders();
        retrofit.RequestBuilder requestBuilder57 = requestBuilder5.headers(headerList56);
        retrofit.mime.TypedOutput typedOutput58 = null;
        retrofit.client.Request request59 = new retrofit.client.Request("", "hi!", headerList56, typedOutput58);
        java.lang.String str60 = request59.url;
        java.util.List<retrofit.client.Header> headerList61 = request59.getHeaders();
        retrofit.mime.TypedOutput typedOutput62 = null;
        retrofit.client.Request request63 = new retrofit.client.Request("hi!", "", headerList61, typedOutput62);
        retrofit.mime.TypedOutput typedOutput64 = request63.getBody();
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNull(headerList24);
        org.junit.Assert.assertNotNull(headerArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNull(converter38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(headerArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(headerList51);
        org.junit.Assert.assertNull(typedOutput54);
        org.junit.Assert.assertNotNull(headerList55);
        org.junit.Assert.assertNotNull(headerList56);
        org.junit.Assert.assertNotNull(requestBuilder57);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
        org.junit.Assert.assertNotNull(headerList61);
        org.junit.Assert.assertNull(typedOutput64);
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = request8.body;
        retrofit.mime.TypedOutput typedOutput12 = request8.body;
        java.util.List<retrofit.client.Header> headerList13 = request8.headers;
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = request15.body;
        java.util.List<retrofit.client.Header> headerList17 = request15.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = request15.body;
        java.util.List<retrofit.client.Header> headerList19 = request15.headers;
        retrofit.mime.TypedOutput typedOutput20 = request15.body;
        java.lang.String str21 = request15.method;
        java.util.List<retrofit.client.Header> headerList22 = request15.headers;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(headerList22);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", headerList19, typedOutput22);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList19);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.String str11 = request10.getMethod();
        java.lang.String str12 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request10.headers;
        java.util.List<retrofit.client.Header> headerList14 = request10.headers;
        java.util.List<retrofit.client.Header> headerList15 = request10.headers;
        java.lang.String str16 = request10.getUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        java.lang.String str13 = request12.getUrl();
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "hi!", headerList14, typedOutput15);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(headerList14);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.body;
        java.lang.String str14 = request12.getMethod();
        java.lang.String str15 = request12.getUrl();
        java.lang.String str16 = request12.getMethod();
        java.lang.String str17 = request12.url;
        java.lang.String str18 = request12.getUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        java.lang.String str27 = request26.url;
        java.util.List<retrofit.client.Header> headerList28 = request26.headers;
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", headerList28, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = request30.body;
        java.util.List<retrofit.client.Header> headerList32 = request30.headers;
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "", headerList32, typedOutput33);
        requestBuilder1.headers = headerList32;
        retrofit.converter.Converter converter36 = requestBuilder1.getconverter();
        retrofit.RequestBuilder requestBuilder38 = requestBuilder1.apiUrl("");
        retrofit.converter.Converter converter39 = requestBuilder38.getconverter();
        java.lang.String str40 = requestBuilder38.apiUrl;
        java.lang.Object[] objArray41 = requestBuilder38.args;
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNull(typedOutput31);
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNull(converter36);
        org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNull(converter39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(objArray41);
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        retrofit.converter.Converter converter14 = null;
        retrofit.RequestBuilder requestBuilder15 = new retrofit.RequestBuilder(converter14);
        java.util.List<retrofit.client.Header> headerList16 = requestBuilder15.headers;
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        java.util.List<retrofit.client.Header> headerList26 = request25.headers;
        java.lang.Object[] objArray28 = new java.lang.Object[] { true, (short) 1, request25, 0 };
        requestBuilder15.args = objArray28;
        retrofit.converter.Converter converter30 = requestBuilder15.converter;
        java.util.List<retrofit.client.Header> headerList31 = requestBuilder15.headers;
        requestBuilder15.apiUrl = "hi!";
        retrofit.client.Header[] headerArray38 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList39 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList39, headerArray38);
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList39, typedOutput41);
        java.lang.String str43 = request42.url;
        java.util.List<retrofit.client.Header> headerList44 = request42.headers;
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("", "", headerList44, typedOutput45);
        retrofit.RequestBuilder requestBuilder47 = requestBuilder15.headers(headerList44);
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "hi!", headerList44, typedOutput48);
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("hi!", "", headerList44, typedOutput50);
        retrofit.mime.TypedOutput typedOutput52 = null;
        retrofit.client.Request request53 = new retrofit.client.Request("", "hi!", headerList44, typedOutput52);
        retrofit.mime.TypedOutput typedOutput54 = null;
        retrofit.client.Request request55 = new retrofit.client.Request("hi!", "hi!", headerList44, typedOutput54);
        retrofit.mime.TypedOutput typedOutput56 = null;
        retrofit.client.Request request57 = new retrofit.client.Request("", "", headerList44, typedOutput56);
        retrofit.mime.TypedOutput typedOutput58 = null;
        retrofit.client.Request request59 = new retrofit.client.Request("hi!", "", headerList44, typedOutput58);
        retrofit.mime.TypedOutput typedOutput60 = null;
        retrofit.client.Request request61 = new retrofit.client.Request("", "hi!", headerList44, typedOutput60);
        org.junit.Assert.assertNull(headerList16);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(objArray28);
        org.junit.Assert.assertNull(converter30);
        org.junit.Assert.assertNull(headerList31);
        org.junit.Assert.assertNotNull(headerArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertNotNull(requestBuilder47);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        java.lang.String str15 = request14.url;
        java.util.List<retrofit.client.Header> headerList16 = request14.headers;
        retrofit.mime.TypedOutput typedOutput17 = request14.body;
        retrofit.mime.TypedOutput typedOutput18 = request14.body;
        java.util.List<retrofit.client.Header> headerList19 = request14.headers;
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "hi!", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = request23.body;
        java.util.List<retrofit.client.Header> headerList25 = request23.headers;
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "hi!", headerList25, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "hi!", headerList25, typedOutput28);
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertNotNull(headerList25);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.method;
        java.lang.String str7 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.headers;
        java.lang.Object[] objArray16 = new java.lang.Object[] { true, (short) 1, request13, 0 };
        requestBuilder3.args = objArray16;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.headers;
        requestBuilder3.setheaders(headerList25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "hi!", headerList25, typedOutput27);
        retrofit.mime.TypedOutput typedOutput29 = request28.getBody();
        java.util.List<retrofit.client.Header> headerList30 = request28.getHeaders();
        java.lang.String str31 = request28.method;
        org.junit.Assert.assertNull(headerList4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNull(typedOutput29);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        requestBuilder1.setapiUrl("");
        java.lang.String str4 = requestBuilder1.getapiUrl();
        java.lang.String str5 = requestBuilder1.apiUrl;
        retrofit.RequestBuilder requestBuilder7 = requestBuilder1.apiUrl("hi!");
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder7.getheaders();
        java.util.List<retrofit.client.Header> headerList9 = requestBuilder7.getheaders();
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.headers;
        retrofit.mime.TypedOutput typedOutput18 = request16.body;
        java.util.List<retrofit.client.Header> headerList19 = request16.headers;
        java.util.List<retrofit.client.Header> headerList20 = request16.getHeaders();
        java.util.List<retrofit.client.Header> headerList21 = request16.headers;
        retrofit.RequestBuilder requestBuilder22 = requestBuilder7.headers(headerList21);
        java.lang.String str23 = requestBuilder22.getapiUrl();
        java.lang.Object[] objArray24 = requestBuilder22.getargs();
        java.util.List<retrofit.client.Header> headerList25 = requestBuilder22.headers;
        retrofit.converter.Converter converter26 = requestBuilder22.converter;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNull(headerList8);
        org.junit.Assert.assertNull(headerList9);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(objArray24);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNull(converter26);
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder1.headers;
        java.lang.String str18 = requestBuilder1.getapiUrl();
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        java.util.List<retrofit.client.Header> headerList26 = request25.headers;
        requestBuilder1.setheaders(headerList26);
        retrofit.converter.Converter converter28 = requestBuilder1.converter;
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder1.getheaders();
        java.util.List<retrofit.client.Header> headerList30 = requestBuilder1.headers;
        retrofit.RequestBuilder requestBuilder32 = requestBuilder1.apiUrl("");
        java.lang.Object[] objArray33 = requestBuilder32.args;
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(headerList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(converter28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNotNull(requestBuilder32);
        org.junit.Assert.assertNotNull(objArray33);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.lang.String str19 = request18.method;
        java.util.List<retrofit.client.Header> headerList20 = request18.headers;
        java.lang.Class<?> wildcardClass21 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.converter.Converter converter3 = requestBuilder1.getconverter();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, 100.0d };
        retrofit.RequestBuilder requestBuilder7 = requestBuilder1.args(objArray6);
        requestBuilder7.setapiUrl("hi!");
        requestBuilder7.setapiUrl("hi!");
        requestBuilder7.setapiUrl("hi!");
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.lang.String str25 = request24.url;
        java.util.List<retrofit.client.Header> headerList26 = request24.headers;
        retrofit.mime.TypedOutput typedOutput27 = request24.body;
        retrofit.mime.TypedOutput typedOutput28 = request24.body;
        java.util.List<retrofit.client.Header> headerList29 = request24.headers;
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("hi!", "hi!", headerList29, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = request31.body;
        java.util.List<retrofit.client.Header> headerList33 = request31.getHeaders();
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "hi!", headerList33, typedOutput34);
        requestBuilder7.setheaders(headerList33);
        java.lang.Object[] objArray37 = requestBuilder7.getargs();
        java.lang.String str38 = requestBuilder7.apiUrl;
        java.util.List<retrofit.client.Header> headerList39 = requestBuilder7.getheaders();
        retrofit.converter.Converter converter40 = requestBuilder7.getconverter();
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNull(typedOutput32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray37), "[0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray37), "[0.0, 100.0]");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNull(converter40);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.converter.Converter converter3 = requestBuilder1.getconverter();
        retrofit.RequestBuilder requestBuilder5 = requestBuilder1.apiUrl("hi!");
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        java.lang.Object[] objArray8 = requestBuilder7.getargs();
        retrofit.converter.Converter converter9 = requestBuilder7.getconverter();
        retrofit.converter.Converter converter10 = null;
        retrofit.RequestBuilder requestBuilder11 = new retrofit.RequestBuilder(converter10);
        java.util.List<retrofit.client.Header> headerList12 = requestBuilder11.headers;
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        java.util.List<retrofit.client.Header> headerList15 = requestBuilder14.headers;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.headers;
        java.lang.Object[] objArray27 = new java.lang.Object[] { true, (short) 1, request24, 0 };
        requestBuilder14.args = objArray27;
        requestBuilder11.setargs(objArray27);
        retrofit.RequestBuilder requestBuilder30 = requestBuilder7.args(objArray27);
        retrofit.RequestBuilder requestBuilder31 = requestBuilder5.args(objArray27);
        retrofit.converter.Converter converter32 = requestBuilder31.converter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = requestBuilder31.buildRelativeUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray8);
        org.junit.Assert.assertNull(converter9);
        org.junit.Assert.assertNull(headerList12);
        org.junit.Assert.assertNull(headerList15);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(requestBuilder30);
        org.junit.Assert.assertNotNull(requestBuilder31);
        org.junit.Assert.assertNull(converter32);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder1.headers;
        java.lang.String str18 = requestBuilder1.getapiUrl();
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder1.headers;
        retrofit.converter.Converter converter20 = requestBuilder1.getconverter();
        java.lang.Class<?> wildcardClass21 = requestBuilder1.getClass();
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(headerList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.headers;
        java.lang.Object[] objArray16 = new java.lang.Object[] { true, (short) 1, request13, 0 };
        requestBuilder3.args = objArray16;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.headers;
        requestBuilder3.setheaders(headerList25);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "hi!", headerList25, typedOutput27);
        java.lang.String str29 = request28.getUrl();
        retrofit.mime.TypedOutput typedOutput30 = request28.body;
        java.lang.String str31 = request28.method;
        java.lang.String str32 = request28.getUrl();
        java.util.List<retrofit.client.Header> headerList33 = request28.headers;
        java.lang.String str34 = request28.method;
        org.junit.Assert.assertNull(headerList4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNull(typedOutput30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.url;
        java.util.List<retrofit.client.Header> headerList8 = request6.headers;
        retrofit.mime.TypedOutput typedOutput9 = request6.body;
        retrofit.mime.TypedOutput typedOutput10 = request6.body;
        retrofit.mime.TypedOutput typedOutput11 = request6.getBody();
        java.lang.String str12 = request6.url;
        java.lang.String str13 = request6.method;
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.url;
        java.util.List<retrofit.client.Header> headerList8 = request6.headers;
        retrofit.mime.TypedOutput typedOutput9 = request6.body;
        retrofit.mime.TypedOutput typedOutput10 = request6.body;
        java.util.List<retrofit.client.Header> headerList11 = request6.headers;
        java.lang.String str12 = request6.url;
        java.lang.String str13 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList14 = request6.headers;
        java.util.List<retrofit.client.Header> headerList15 = request6.headers;
        java.util.List<retrofit.client.Header> headerList16 = request6.headers;
        retrofit.mime.TypedOutput typedOutput17 = request6.body;
        java.lang.String str18 = request6.method;
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        java.lang.String str15 = request14.url;
        java.util.List<retrofit.client.Header> headerList16 = request14.headers;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", headerList16, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.body;
        java.util.List<retrofit.client.Header> headerList20 = request18.headers;
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", headerList20, typedOutput21);
        requestBuilder3.headers = headerList20;
        requestBuilder3.setapiUrl("");
        requestBuilder3.apiUrl = "";
        java.util.List<retrofit.client.Header> headerList28 = requestBuilder3.getheaders();
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "hi!", headerList28, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = request30.getBody();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNull(typedOutput31);
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.headers;
        retrofit.mime.TypedOutput typedOutput10 = request8.body;
        java.util.List<retrofit.client.Header> headerList11 = request8.headers;
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request8.headers;
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = request15.body;
        java.lang.String str17 = request15.method;
        retrofit.mime.TypedOutput typedOutput18 = request15.getBody();
        java.lang.String str19 = request15.getUrl();
        retrofit.mime.TypedOutput typedOutput20 = request15.body;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(typedOutput20);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.args;
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        java.util.List<retrofit.client.Header> headerList20 = requestBuilder19.headers;
        retrofit.client.Header[] headerArray25 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList26 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList26, headerArray25);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList26, typedOutput28);
        java.util.List<retrofit.client.Header> headerList30 = request29.headers;
        java.lang.Object[] objArray32 = new java.lang.Object[] { true, (short) 1, request29, 0 };
        requestBuilder19.args = objArray32;
        retrofit.converter.Converter converter34 = requestBuilder19.converter;
        java.lang.Object[] objArray35 = requestBuilder19.args;
        requestBuilder1.setargs(objArray35);
        java.util.List<retrofit.client.Header> headerList37 = requestBuilder1.headers;
        java.util.List<retrofit.client.Header> headerList38 = requestBuilder1.getheaders();
        java.lang.Object[] objArray39 = requestBuilder1.getargs();
        java.lang.Object[] objArray40 = requestBuilder1.args;
        retrofit.converter.Converter converter41 = requestBuilder1.converter;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str42 = requestBuilder1.buildRelativeUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNull(headerList20);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNotNull(objArray32);
        org.junit.Assert.assertNull(converter34);
        org.junit.Assert.assertNotNull(objArray35);
        org.junit.Assert.assertNull(headerList37);
        org.junit.Assert.assertNull(headerList38);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(objArray40);
        org.junit.Assert.assertNull(converter41);
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        java.lang.String str17 = request16.url;
        java.util.List<retrofit.client.Header> headerList18 = request16.headers;
        retrofit.mime.TypedOutput typedOutput19 = request16.body;
        retrofit.mime.TypedOutput typedOutput20 = request16.body;
        java.util.List<retrofit.client.Header> headerList21 = request16.headers;
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "hi!", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = request23.body;
        java.util.List<retrofit.client.Header> headerList25 = request23.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "hi!", headerList25, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "hi!", headerList25, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = request29.getBody();
        java.util.List<retrofit.client.Header> headerList31 = request29.getHeaders();
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "hi!", headerList31, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("hi!", "", headerList31, typedOutput34);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNull(typedOutput30);
        org.junit.Assert.assertNotNull(headerList31);
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        java.lang.String str19 = request18.method;
        java.util.List<retrofit.client.Header> headerList20 = request18.headers;
        java.lang.String str21 = request18.method;
        retrofit.mime.TypedOutput typedOutput22 = request18.getBody();
        java.util.List<retrofit.client.Header> headerList23 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "", headerList23, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "hi!", headerList23, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = request27.getBody();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNull(typedOutput28);
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        retrofit.converter.Converter converter2 = requestBuilder1.converter;
        java.lang.Object[] objArray3 = requestBuilder1.args;
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.converter.Converter converter20 = requestBuilder5.converter;
        java.util.List<retrofit.client.Header> headerList21 = requestBuilder5.headers;
        requestBuilder5.apiUrl = "hi!";
        java.lang.Object[] objArray24 = requestBuilder5.getargs();
        retrofit.RequestBuilder requestBuilder25 = requestBuilder1.args(objArray24);
        requestBuilder25.setapiUrl("");
        retrofit.converter.Converter converter28 = null;
        retrofit.RequestBuilder requestBuilder29 = new retrofit.RequestBuilder(converter28);
        requestBuilder29.setapiUrl("hi!");
        java.lang.Object[] objArray32 = requestBuilder29.args;
        retrofit.client.Header[] headerArray35 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList36 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList36, headerArray35);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList36, typedOutput38);
        java.lang.String str40 = request39.getUrl();
        java.util.List<retrofit.client.Header> headerList41 = request39.getHeaders();
        retrofit.RequestBuilder requestBuilder42 = requestBuilder29.headers(headerList41);
        retrofit.RequestBuilder requestBuilder43 = requestBuilder25.headers(headerList41);
        retrofit.converter.Converter converter44 = requestBuilder43.getconverter();
        org.junit.Assert.assertNull(converter2);
        org.junit.Assert.assertNull(objArray3);
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNull(headerList21);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNotNull(requestBuilder25);
        org.junit.Assert.assertNull(objArray32);
        org.junit.Assert.assertNotNull(headerArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(headerList41);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNull(converter44);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.headers;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "hi!", headerList12, typedOutput15);
        java.lang.String str17 = request16.getUrl();
        retrofit.mime.TypedOutput typedOutput18 = request16.body;
        retrofit.mime.TypedOutput typedOutput19 = request16.body;
        retrofit.mime.TypedOutput typedOutput20 = request16.body;
        java.util.List<retrofit.client.Header> headerList21 = request16.headers;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNotNull(headerList21);
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.body;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        java.lang.String str15 = request12.getMethod();
        java.util.List<retrofit.client.Header> headerList16 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = request12.body;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedOutput17);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.url;
        java.util.List<retrofit.client.Header> headerList8 = request6.headers;
        retrofit.mime.TypedOutput typedOutput9 = request6.body;
        retrofit.mime.TypedOutput typedOutput10 = request6.body;
        java.util.List<retrofit.client.Header> headerList11 = request6.headers;
        java.lang.String str12 = request6.url;
        retrofit.mime.TypedOutput typedOutput13 = request6.body;
        java.util.List<retrofit.client.Header> headerList14 = request6.getHeaders();
        java.lang.String str15 = request6.getMethod();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = request8.body;
        retrofit.mime.TypedOutput typedOutput12 = request8.body;
        java.util.List<retrofit.client.Header> headerList13 = request8.headers;
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = request15.body;
        java.util.List<retrofit.client.Header> headerList17 = request15.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = request15.body;
        java.lang.String str19 = request15.getUrl();
        java.util.List<retrofit.client.Header> headerList20 = request15.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = request15.getBody();
        java.util.List<retrofit.client.Header> headerList22 = request15.getHeaders();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNotNull(headerList22);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        requestBuilder7.setapiUrl("");
        java.lang.String str10 = requestBuilder7.getapiUrl();
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        requestBuilder7.setheaders((java.util.List<retrofit.client.Header>) headerList14);
        retrofit.converter.Converter converter23 = null;
        retrofit.RequestBuilder requestBuilder24 = new retrofit.RequestBuilder(converter23);
        java.util.List<retrofit.client.Header> headerList25 = requestBuilder24.headers;
        retrofit.client.Header[] headerArray30 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList31 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList31, headerArray30);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList31, typedOutput33);
        java.util.List<retrofit.client.Header> headerList35 = request34.headers;
        java.lang.Object[] objArray37 = new java.lang.Object[] { true, (short) 1, request34, 0 };
        requestBuilder24.args = objArray37;
        retrofit.client.Header[] headerArray41 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList42 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList42, headerArray41);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList42, typedOutput44);
        java.util.List<retrofit.client.Header> headerList46 = request45.headers;
        requestBuilder24.setheaders(headerList46);
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("hi!", "hi!", headerList46, typedOutput48);
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("hi!", "", headerList46, typedOutput50);
        requestBuilder7.setheaders(headerList46);
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("", "hi!", headerList46, typedOutput53);
        retrofit.mime.TypedOutput typedOutput55 = null;
        retrofit.client.Request request56 = new retrofit.client.Request("hi!", "", headerList46, typedOutput55);
        java.util.List<retrofit.client.Header> headerList57 = request56.getHeaders();
        retrofit.mime.TypedOutput typedOutput58 = null;
        retrofit.client.Request request59 = new retrofit.client.Request("", "", headerList57, typedOutput58);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(headerList25);
        org.junit.Assert.assertNotNull(headerArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNotNull(objArray37);
        org.junit.Assert.assertNotNull(headerArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(headerList46);
        org.junit.Assert.assertNotNull(headerList57);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.converter.Converter converter20 = requestBuilder5.converter;
        java.lang.Object[] objArray21 = requestBuilder5.args;
        retrofit.client.Header[] headerArray24 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList25 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList25, headerArray24);
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList25, typedOutput27);
        java.lang.String str29 = request28.url;
        java.util.List<retrofit.client.Header> headerList30 = request28.headers;
        retrofit.mime.TypedOutput typedOutput31 = request28.body;
        retrofit.mime.TypedOutput typedOutput32 = request28.body;
        java.util.List<retrofit.client.Header> headerList33 = request28.headers;
        requestBuilder5.setheaders(headerList33);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "hi!", headerList33, typedOutput35);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("", "", headerList33, typedOutput37);
        java.util.List<retrofit.client.Header> headerList39 = request38.getHeaders();
        java.lang.String str40 = request38.method;
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertNotNull(headerArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNull(typedOutput31);
        org.junit.Assert.assertNull(typedOutput32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.converter.Converter converter3 = requestBuilder1.getconverter();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, 100.0d };
        retrofit.RequestBuilder requestBuilder7 = requestBuilder1.args(objArray6);
        requestBuilder7.setapiUrl("hi!");
        requestBuilder7.setapiUrl("hi!");
        requestBuilder7.setapiUrl("hi!");
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.lang.String str25 = request24.url;
        java.util.List<retrofit.client.Header> headerList26 = request24.headers;
        retrofit.mime.TypedOutput typedOutput27 = request24.body;
        retrofit.mime.TypedOutput typedOutput28 = request24.body;
        java.util.List<retrofit.client.Header> headerList29 = request24.headers;
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("hi!", "hi!", headerList29, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = request31.body;
        java.util.List<retrofit.client.Header> headerList33 = request31.getHeaders();
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "hi!", headerList33, typedOutput34);
        requestBuilder7.setheaders(headerList33);
        java.lang.String str37 = requestBuilder7.apiUrl;
        java.lang.String str38 = requestBuilder7.getapiUrl();
        java.lang.String str39 = requestBuilder7.apiUrl;
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNull(typedOutput32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.args;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.lang.String str25 = request24.url;
        java.util.List<retrofit.client.Header> headerList26 = request24.headers;
        retrofit.mime.TypedOutput typedOutput27 = request24.body;
        retrofit.mime.TypedOutput typedOutput28 = request24.body;
        java.util.List<retrofit.client.Header> headerList29 = request24.headers;
        requestBuilder1.setheaders(headerList29);
        java.lang.String str31 = requestBuilder1.getapiUrl();
        requestBuilder1.apiUrl = "";
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.args;
        java.lang.Object[] objArray18 = null;
        retrofit.RequestBuilder requestBuilder19 = requestBuilder1.args(objArray18);
        retrofit.converter.Converter converter20 = requestBuilder19.getconverter();
        retrofit.RequestBuilder requestBuilder22 = requestBuilder19.apiUrl("");
        requestBuilder19.apiUrl = "";
        retrofit.RequestBuilder requestBuilder26 = requestBuilder19.apiUrl("hi!");
        java.lang.Object[] objArray27 = requestBuilder26.getargs();
        retrofit.converter.Converter converter28 = requestBuilder26.getconverter();
        java.lang.Object[] objArray29 = requestBuilder26.getargs();
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNull(converter20);
        org.junit.Assert.assertNotNull(requestBuilder22);
        org.junit.Assert.assertNotNull(requestBuilder26);
        org.junit.Assert.assertNull(objArray27);
        org.junit.Assert.assertNull(converter28);
        org.junit.Assert.assertNull(objArray29);
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.headers;
        retrofit.mime.TypedOutput typedOutput8 = request6.body;
        java.lang.String str9 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.String str7 = request6.url;
        java.util.List<retrofit.client.Header> headerList8 = request6.headers;
        retrofit.mime.TypedOutput typedOutput9 = request6.body;
        java.lang.String str10 = request6.method;
        java.lang.String str11 = request6.method;
        retrofit.mime.TypedOutput typedOutput12 = request6.body;
        java.lang.String str13 = request6.method;
        retrofit.mime.TypedOutput typedOutput14 = request6.body;
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(typedOutput14);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        java.util.List<retrofit.client.Header> headerList27 = request26.headers;
        requestBuilder5.setheaders(headerList27);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "hi!", headerList27, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.headers;
        java.util.List<retrofit.client.Header> headerList32 = request30.getHeaders();
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "hi!", headerList32, typedOutput33);
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNotNull(headerList32);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        requestBuilder1.setapiUrl("");
        java.lang.String str4 = requestBuilder1.getapiUrl();
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        requestBuilder1.setheaders((java.util.List<retrofit.client.Header>) headerList8);
        retrofit.client.Header[] headerArray19 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList20 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList20, headerArray19);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList20, typedOutput22);
        java.lang.String str24 = request23.method;
        java.lang.String str25 = request23.getMethod();
        java.util.List<retrofit.client.Header> headerList26 = request23.headers;
        java.lang.String str27 = request23.url;
        java.util.List<retrofit.client.Header> headerList28 = request23.getHeaders();
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "hi!", headerList28, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "hi!", headerList28, typedOutput31);
        retrofit.RequestBuilder requestBuilder33 = requestBuilder1.headers(headerList28);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(requestBuilder33);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = request10.body;
        retrofit.mime.TypedOutput typedOutput14 = request10.body;
        java.util.List<retrofit.client.Header> headerList15 = request10.headers;
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "", headerList15, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = request19.body;
        java.util.List<retrofit.client.Header> headerList21 = request19.headers;
        java.lang.String str22 = request19.url;
        java.lang.String str23 = request19.getUrl();
        java.lang.String str24 = request19.url;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = request8.body;
        retrofit.mime.TypedOutput typedOutput12 = request8.body;
        retrofit.mime.TypedOutput typedOutput13 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput14 = request8.body;
        java.util.List<retrofit.client.Header> headerList15 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "hi!", headerList15, typedOutput16);
        java.lang.String str18 = request17.getUrl();
        java.lang.String str19 = request17.url;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder1.headers;
        java.lang.String str18 = requestBuilder1.getapiUrl();
        retrofit.client.Header[] headerArray21 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList22 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList22, headerArray21);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList22, typedOutput24);
        java.util.List<retrofit.client.Header> headerList26 = request25.headers;
        requestBuilder1.setheaders(headerList26);
        retrofit.converter.Converter converter28 = requestBuilder1.converter;
        java.util.List<retrofit.client.Header> headerList29 = requestBuilder1.getheaders();
        requestBuilder1.apiUrl = "hi!";
        retrofit.RequestBuilder requestBuilder33 = requestBuilder1.apiUrl("");
        java.lang.String str34 = requestBuilder1.apiUrl;
        retrofit.client.Header[] headerArray41 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList42 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList42, headerArray41);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList42, typedOutput44);
        java.lang.String str46 = request45.url;
        java.util.List<retrofit.client.Header> headerList47 = request45.headers;
        retrofit.mime.TypedOutput typedOutput48 = request45.body;
        retrofit.mime.TypedOutput typedOutput49 = request45.body;
        retrofit.mime.TypedOutput typedOutput50 = request45.getBody();
        retrofit.mime.TypedOutput typedOutput51 = request45.body;
        java.util.List<retrofit.client.Header> headerList52 = request45.getHeaders();
        java.util.List<retrofit.client.Header> headerList53 = request45.getHeaders();
        retrofit.mime.TypedOutput typedOutput54 = null;
        retrofit.client.Request request55 = new retrofit.client.Request("hi!", "", headerList53, typedOutput54);
        retrofit.mime.TypedOutput typedOutput56 = null;
        retrofit.client.Request request57 = new retrofit.client.Request("", "", headerList53, typedOutput56);
        retrofit.RequestBuilder requestBuilder58 = requestBuilder1.headers(headerList53);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str59 = requestBuilder58.buildRelativeUrl();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(headerList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(headerArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(converter28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(requestBuilder33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(headerArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(headerList47);
        org.junit.Assert.assertNull(typedOutput48);
        org.junit.Assert.assertNull(typedOutput49);
        org.junit.Assert.assertNull(typedOutput50);
        org.junit.Assert.assertNull(typedOutput51);
        org.junit.Assert.assertNotNull(headerList52);
        org.junit.Assert.assertNotNull(headerList53);
        org.junit.Assert.assertNotNull(requestBuilder58);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        retrofit.converter.Converter converter10 = null;
        retrofit.RequestBuilder requestBuilder11 = new retrofit.RequestBuilder(converter10);
        java.util.List<retrofit.client.Header> headerList12 = requestBuilder11.headers;
        retrofit.client.Header[] headerArray17 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList18 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList18, headerArray17);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList18, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.headers;
        java.lang.Object[] objArray24 = new java.lang.Object[] { true, (short) 1, request21, 0 };
        requestBuilder11.args = objArray24;
        retrofit.converter.Converter converter26 = requestBuilder11.converter;
        java.util.List<retrofit.client.Header> headerList27 = requestBuilder11.headers;
        requestBuilder11.apiUrl = "hi!";
        retrofit.client.Header[] headerArray34 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList35 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList35, headerArray34);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList35, typedOutput37);
        java.lang.String str39 = request38.url;
        java.util.List<retrofit.client.Header> headerList40 = request38.headers;
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("", "", headerList40, typedOutput41);
        retrofit.RequestBuilder requestBuilder43 = requestBuilder11.headers(headerList40);
        java.util.List<retrofit.client.Header> headerList44 = requestBuilder11.headers;
        retrofit.mime.TypedOutput typedOutput45 = null;
        retrofit.client.Request request46 = new retrofit.client.Request("hi!", "", headerList44, typedOutput45);
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("", "", headerList44, typedOutput47);
        java.lang.String str49 = request48.method;
        java.util.List<retrofit.client.Header> headerList50 = request48.getHeaders();
        retrofit.mime.TypedOutput typedOutput51 = null;
        retrofit.client.Request request52 = new retrofit.client.Request("hi!", "hi!", headerList50, typedOutput51);
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("", "hi!", headerList50, typedOutput53);
        retrofit.mime.TypedOutput typedOutput55 = null;
        retrofit.client.Request request56 = new retrofit.client.Request("", "hi!", headerList50, typedOutput55);
        java.lang.String str57 = request56.getMethod();
        java.lang.String str58 = request56.getMethod();
        java.lang.String str59 = request56.getUrl();
        org.junit.Assert.assertNull(headerList12);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(converter26);
        org.junit.Assert.assertNull(headerList27);
        org.junit.Assert.assertNotNull(headerArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(headerList50);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.body;
        java.util.List<retrofit.client.Header> headerList16 = request14.headers;
        java.lang.String str17 = request14.url;
        java.lang.String str18 = request14.url;
        java.util.List<retrofit.client.Header> headerList19 = request14.headers;
        java.lang.String str20 = request14.method;
        java.lang.String str21 = request14.url;
        java.util.List<retrofit.client.Header> headerList22 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", headerList22, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.getHeaders();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(headerList25);
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        retrofit.converter.Converter converter4 = null;
        retrofit.RequestBuilder requestBuilder5 = new retrofit.RequestBuilder(converter4);
        java.util.List<retrofit.client.Header> headerList6 = requestBuilder5.headers;
        retrofit.client.Header[] headerArray11 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList12 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList12, headerArray11);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList12, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.headers;
        java.lang.Object[] objArray18 = new java.lang.Object[] { true, (short) 1, request15, 0 };
        requestBuilder5.args = objArray18;
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        java.lang.String str31 = request30.url;
        java.util.List<retrofit.client.Header> headerList32 = request30.headers;
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "", headerList32, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = request34.body;
        java.util.List<retrofit.client.Header> headerList36 = request34.headers;
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("hi!", "", headerList36, typedOutput37);
        requestBuilder5.headers = headerList36;
        java.util.List<retrofit.client.Header> headerList40 = requestBuilder5.getheaders();
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("hi!", "", headerList40, typedOutput41);
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("hi!", "", headerList40, typedOutput43);
        java.lang.String str45 = request44.method;
        java.lang.String str46 = request44.method;
        org.junit.Assert.assertNull(headerList6);
        org.junit.Assert.assertNotNull(headerArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(objArray18);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNull(typedOutput35);
        org.junit.Assert.assertNotNull(headerList36);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = request10.body;
        java.lang.String str15 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList16 = request10.headers;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", headerList16, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", headerList16, typedOutput19);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.headers;
        retrofit.mime.TypedOutput typedOutput14 = request12.body;
        java.lang.String str15 = request12.method;
        java.util.List<retrofit.client.Header> headerList16 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", headerList16, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", headerList16, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "hi!", headerList16, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.headers;
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(headerList23);
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", headerList10, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.headers;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList13);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        retrofit.converter.Converter converter16 = null;
        retrofit.RequestBuilder requestBuilder17 = new retrofit.RequestBuilder(converter16);
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder17.headers;
        retrofit.client.Header[] headerArray23 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList24 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList24, headerArray23);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList24, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.headers;
        java.lang.Object[] objArray30 = new java.lang.Object[] { true, (short) 1, request27, 0 };
        requestBuilder17.args = objArray30;
        retrofit.converter.Converter converter32 = requestBuilder17.converter;
        java.util.List<retrofit.client.Header> headerList33 = requestBuilder17.headers;
        requestBuilder17.apiUrl = "hi!";
        retrofit.client.Header[] headerArray40 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList41 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList41, headerArray40);
        retrofit.mime.TypedOutput typedOutput43 = null;
        retrofit.client.Request request44 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList41, typedOutput43);
        java.lang.String str45 = request44.url;
        java.util.List<retrofit.client.Header> headerList46 = request44.headers;
        retrofit.mime.TypedOutput typedOutput47 = null;
        retrofit.client.Request request48 = new retrofit.client.Request("", "", headerList46, typedOutput47);
        retrofit.RequestBuilder requestBuilder49 = requestBuilder17.headers(headerList46);
        java.util.List<retrofit.client.Header> headerList50 = requestBuilder17.headers;
        retrofit.mime.TypedOutput typedOutput51 = null;
        retrofit.client.Request request52 = new retrofit.client.Request("hi!", "", headerList50, typedOutput51);
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("", "", headerList50, typedOutput53);
        java.lang.String str55 = request54.method;
        java.util.List<retrofit.client.Header> headerList56 = request54.getHeaders();
        retrofit.mime.TypedOutput typedOutput57 = null;
        retrofit.client.Request request58 = new retrofit.client.Request("hi!", "hi!", headerList56, typedOutput57);
        retrofit.mime.TypedOutput typedOutput59 = null;
        retrofit.client.Request request60 = new retrofit.client.Request("", "hi!", headerList56, typedOutput59);
        retrofit.mime.TypedOutput typedOutput61 = null;
        retrofit.client.Request request62 = new retrofit.client.Request("", "", headerList56, typedOutput61);
        retrofit.mime.TypedOutput typedOutput63 = null;
        retrofit.client.Request request64 = new retrofit.client.Request("", "", headerList56, typedOutput63);
        retrofit.mime.TypedOutput typedOutput65 = null;
        retrofit.client.Request request66 = new retrofit.client.Request("", "hi!", headerList56, typedOutput65);
        retrofit.mime.TypedOutput typedOutput67 = null;
        retrofit.client.Request request68 = new retrofit.client.Request("", "hi!", headerList56, typedOutput67);
        retrofit.mime.TypedOutput typedOutput69 = request68.body;
        java.lang.String str70 = request68.method;
        java.lang.String str71 = request68.getMethod();
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertNotNull(headerArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertNull(converter32);
        org.junit.Assert.assertNull(headerList33);
        org.junit.Assert.assertNotNull(headerArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertNotNull(headerList46);
        org.junit.Assert.assertNotNull(requestBuilder49);
        org.junit.Assert.assertNotNull(headerList50);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(headerList56);
        org.junit.Assert.assertNull(typedOutput69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.args;
        java.lang.Object[] objArray18 = null;
        retrofit.RequestBuilder requestBuilder19 = requestBuilder1.args(objArray18);
        java.lang.String str20 = requestBuilder1.getapiUrl();
        requestBuilder1.apiUrl = "";
        retrofit.RequestBuilder requestBuilder24 = requestBuilder1.apiUrl("");
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(requestBuilder24);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.body;
        java.util.List<retrofit.client.Header> headerList16 = request14.headers;
        java.util.List<retrofit.client.Header> headerList17 = request14.headers;
        java.util.List<retrofit.client.Header> headerList18 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", headerList18, typedOutput19);
        java.lang.String str21 = request20.url;
        java.lang.String str22 = request20.getMethod();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.client.Header[] headerArray22 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList23 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList23, headerArray22);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList23, typedOutput25);
        java.lang.String str27 = request26.url;
        java.util.List<retrofit.client.Header> headerList28 = request26.headers;
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", headerList28, typedOutput29);
        retrofit.mime.TypedOutput typedOutput31 = request30.body;
        java.util.List<retrofit.client.Header> headerList32 = request30.headers;
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "", headerList32, typedOutput33);
        requestBuilder1.headers = headerList32;
        retrofit.converter.Converter converter36 = requestBuilder1.getconverter();
        retrofit.converter.Converter converter37 = requestBuilder1.converter;
        retrofit.converter.Converter converter38 = requestBuilder1.converter;
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNotNull(headerArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNull(typedOutput31);
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNull(converter36);
        org.junit.Assert.assertNull(converter37);
        org.junit.Assert.assertNull(converter38);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        retrofit.converter.Converter converter10 = null;
        retrofit.RequestBuilder requestBuilder11 = new retrofit.RequestBuilder(converter10);
        retrofit.client.Header[] headerArray18 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList19 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList19, headerArray18);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList19, typedOutput21);
        java.lang.String str23 = request22.url;
        java.util.List<retrofit.client.Header> headerList24 = request22.headers;
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = request26.body;
        java.util.List<retrofit.client.Header> headerList28 = request26.headers;
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "", headerList28, typedOutput29);
        requestBuilder11.headers = headerList28;
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("", "", headerList28, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("hi!", "hi!", headerList28, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("hi!", "hi!", headerList28, typedOutput36);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "hi!", headerList28, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = request39.body;
        java.util.List<retrofit.client.Header> headerList41 = request39.headers;
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("", "hi!", headerList41, typedOutput42);
        org.junit.Assert.assertNotNull(headerArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNull(typedOutput40);
        org.junit.Assert.assertNotNull(headerList41);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.converter.Converter converter3 = requestBuilder1.getconverter();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, 100.0d };
        retrofit.RequestBuilder requestBuilder7 = requestBuilder1.args(objArray6);
        java.lang.Object[] objArray8 = requestBuilder1.args;
        java.lang.String str9 = requestBuilder1.apiUrl;
        java.lang.String str10 = requestBuilder1.getapiUrl();
        // The following exception was thrown during execution in test generation
        try {
            retrofit.mime.TypedOutput typedOutput11 = requestBuilder1.buildBody();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(objArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray8), "[0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray8), "[0.0, 100.0]");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        retrofit.converter.Converter converter8 = null;
        retrofit.RequestBuilder requestBuilder9 = new retrofit.RequestBuilder(converter8);
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        java.lang.String str21 = request20.url;
        java.util.List<retrofit.client.Header> headerList22 = request20.headers;
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", headerList22, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.body;
        java.util.List<retrofit.client.Header> headerList26 = request24.headers;
        retrofit.mime.TypedOutput typedOutput27 = null;
        retrofit.client.Request request28 = new retrofit.client.Request("hi!", "", headerList26, typedOutput27);
        requestBuilder9.headers = headerList26;
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", headerList26, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "hi!", headerList26, typedOutput32);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("hi!", "hi!", headerList26, typedOutput34);
        retrofit.mime.TypedOutput typedOutput36 = null;
        retrofit.client.Request request37 = new retrofit.client.Request("", "hi!", headerList26, typedOutput36);
        java.util.List<retrofit.client.Header> headerList38 = request37.headers;
        java.util.List<retrofit.client.Header> headerList39 = request37.headers;
        java.util.List<retrofit.client.Header> headerList40 = request37.headers;
        java.lang.String str41 = request37.url;
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNotNull(headerList39);
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        java.lang.String str13 = request12.url;
        java.util.List<retrofit.client.Header> headerList14 = request12.headers;
        retrofit.mime.TypedOutput typedOutput15 = request12.body;
        retrofit.mime.TypedOutput typedOutput16 = request12.body;
        java.util.List<retrofit.client.Header> headerList17 = request12.headers;
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = request19.body;
        java.util.List<retrofit.client.Header> headerList21 = request19.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = request19.getBody();
        java.lang.String str23 = request19.url;
        java.util.List<retrofit.client.Header> headerList24 = request19.getHeaders();
        java.util.List<retrofit.client.Header> headerList25 = request19.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "", headerList25, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "hi!", headerList25, typedOutput28);
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(headerList25);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.String str11 = request10.getMethod();
        java.lang.String str12 = request10.getMethod();
        retrofit.mime.TypedOutput typedOutput13 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList14 = request10.headers;
        java.lang.String str15 = request10.url;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.converter.Converter converter3 = requestBuilder1.getconverter();
        java.lang.Object[] objArray6 = new java.lang.Object[] { 0.0f, 100.0d };
        retrofit.RequestBuilder requestBuilder7 = requestBuilder1.args(objArray6);
        requestBuilder7.setapiUrl("hi!");
        requestBuilder7.setapiUrl("hi!");
        requestBuilder7.setapiUrl("hi!");
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.lang.String str25 = request24.url;
        java.util.List<retrofit.client.Header> headerList26 = request24.headers;
        retrofit.mime.TypedOutput typedOutput27 = request24.body;
        retrofit.mime.TypedOutput typedOutput28 = request24.body;
        java.util.List<retrofit.client.Header> headerList29 = request24.headers;
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("hi!", "hi!", headerList29, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = request31.body;
        java.util.List<retrofit.client.Header> headerList33 = request31.getHeaders();
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "hi!", headerList33, typedOutput34);
        requestBuilder7.setheaders(headerList33);
        java.lang.String str37 = requestBuilder7.apiUrl;
        requestBuilder7.apiUrl = "hi!";
        retrofit.converter.Converter converter46 = null;
        retrofit.RequestBuilder requestBuilder47 = new retrofit.RequestBuilder(converter46);
        java.util.List<retrofit.client.Header> headerList48 = requestBuilder47.headers;
        retrofit.client.Header[] headerArray53 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList54 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList54, headerArray53);
        retrofit.mime.TypedOutput typedOutput56 = null;
        retrofit.client.Request request57 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList54, typedOutput56);
        java.util.List<retrofit.client.Header> headerList58 = request57.headers;
        java.lang.Object[] objArray60 = new java.lang.Object[] { true, (short) 1, request57, 0 };
        requestBuilder47.args = objArray60;
        retrofit.client.Header[] headerArray68 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList69 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean70 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList69, headerArray68);
        retrofit.mime.TypedOutput typedOutput71 = null;
        retrofit.client.Request request72 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList69, typedOutput71);
        java.lang.String str73 = request72.url;
        java.util.List<retrofit.client.Header> headerList74 = request72.headers;
        retrofit.mime.TypedOutput typedOutput75 = null;
        retrofit.client.Request request76 = new retrofit.client.Request("", "", headerList74, typedOutput75);
        retrofit.mime.TypedOutput typedOutput77 = request76.body;
        java.util.List<retrofit.client.Header> headerList78 = request76.headers;
        retrofit.mime.TypedOutput typedOutput79 = null;
        retrofit.client.Request request80 = new retrofit.client.Request("hi!", "", headerList78, typedOutput79);
        requestBuilder47.headers = headerList78;
        retrofit.mime.TypedOutput typedOutput82 = null;
        retrofit.client.Request request83 = new retrofit.client.Request("", "hi!", headerList78, typedOutput82);
        retrofit.mime.TypedOutput typedOutput84 = null;
        retrofit.client.Request request85 = new retrofit.client.Request("", "hi!", headerList78, typedOutput84);
        java.lang.String str86 = request85.getMethod();
        java.util.List<retrofit.client.Header> headerList87 = request85.getHeaders();
        retrofit.mime.TypedOutput typedOutput88 = null;
        retrofit.client.Request request89 = new retrofit.client.Request("hi!", "", headerList87, typedOutput88);
        retrofit.RequestBuilder requestBuilder90 = requestBuilder7.headers(headerList87);
        java.lang.String str91 = requestBuilder7.apiUrl;
        java.lang.Object[] objArray92 = requestBuilder7.args;
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(objArray6);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray6), "[0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray6), "[0.0, 100.0]");
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNull(typedOutput32);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNull(headerList48);
        org.junit.Assert.assertNotNull(headerArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(headerList58);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertNotNull(headerArray68);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(headerList74);
        org.junit.Assert.assertNull(typedOutput77);
        org.junit.Assert.assertNotNull(headerList78);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertNotNull(headerList87);
        org.junit.Assert.assertNotNull(requestBuilder90);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertNotNull(objArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray92), "[0.0, 100.0]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray92), "[0.0, 100.0]");
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = request10.body;
        retrofit.mime.TypedOutput typedOutput14 = request10.body;
        java.util.List<retrofit.client.Header> headerList15 = request10.headers;
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "hi!", headerList15, typedOutput16);
        java.lang.String str18 = request17.method;
        java.lang.String str19 = request17.getMethod();
        java.util.List<retrofit.client.Header> headerList20 = request17.getHeaders();
        java.util.List<retrofit.client.Header> headerList21 = request17.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(headerList21);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
        retrofit.client.Header[] headerArray9 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList10 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList10, headerArray9);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList10, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.headers;
        java.lang.Object[] objArray16 = new java.lang.Object[] { true, (short) 1, request13, 0 };
        requestBuilder3.args = objArray16;
        retrofit.converter.Converter converter18 = requestBuilder3.converter;
        java.util.List<retrofit.client.Header> headerList19 = requestBuilder3.headers;
        requestBuilder3.apiUrl = "hi!";
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        java.lang.String str31 = request30.url;
        java.util.List<retrofit.client.Header> headerList32 = request30.headers;
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "", headerList32, typedOutput33);
        retrofit.RequestBuilder requestBuilder35 = requestBuilder3.headers(headerList32);
        java.lang.Object[] objArray36 = requestBuilder3.getargs();
        java.util.List<retrofit.client.Header> headerList37 = requestBuilder3.getheaders();
        java.util.List<retrofit.client.Header> headerList38 = requestBuilder3.getheaders();
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "", headerList38, typedOutput39);
        java.lang.String str41 = request40.getMethod();
        org.junit.Assert.assertNull(headerList4);
        org.junit.Assert.assertNotNull(headerArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(objArray16);
        org.junit.Assert.assertNull(converter18);
        org.junit.Assert.assertNull(headerList19);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNotNull(requestBuilder35);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        java.util.List<retrofit.client.Header> headerList12 = request10.headers;
        retrofit.mime.TypedOutput typedOutput13 = request10.body;
        retrofit.mime.TypedOutput typedOutput14 = request10.body;
        java.util.List<retrofit.client.Header> headerList15 = request10.headers;
        java.util.List<retrofit.client.Header> headerList16 = request10.headers;
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", headerList16, typedOutput17);
        java.lang.String str19 = request18.getUrl();
        java.util.List<retrofit.client.Header> headerList20 = request18.headers;
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", headerList20, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.body;
        java.util.List<retrofit.client.Header> headerList24 = request22.headers;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(headerList24);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.args;
        java.lang.Object[] objArray18 = null;
        retrofit.RequestBuilder requestBuilder19 = requestBuilder1.args(objArray18);
        java.lang.Object[] objArray20 = requestBuilder1.getargs();
        java.lang.String str21 = requestBuilder1.getapiUrl();
        retrofit.converter.Converter converter22 = requestBuilder1.converter;
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(requestBuilder19);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(converter22);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.lang.String str9 = request8.url;
        java.util.List<retrofit.client.Header> headerList10 = request8.headers;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.body;
        java.lang.String str14 = request12.getUrl();
        java.lang.String str15 = request12.url;
        java.util.List<retrofit.client.Header> headerList16 = request12.headers;
        retrofit.mime.TypedOutput typedOutput17 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList18 = request12.getHeaders();
        java.lang.String str19 = request12.getMethod();
        java.lang.String str20 = request12.getUrl();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.method;
        java.lang.String str12 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request10.headers;
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", headerList13, typedOutput14);
        java.lang.String str16 = request15.getUrl();
        java.lang.String str17 = request15.url;
        java.lang.String str18 = request15.method;
        java.util.List<retrofit.client.Header> headerList19 = request15.headers;
        java.util.List<retrofit.client.Header> headerList20 = request15.headers;
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "hi!", headerList20, typedOutput21);
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(headerList20);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        retrofit.converter.Converter converter6 = null;
        retrofit.RequestBuilder requestBuilder7 = new retrofit.RequestBuilder(converter6);
        java.util.List<retrofit.client.Header> headerList8 = requestBuilder7.headers;
        retrofit.client.Header[] headerArray13 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList14 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList14, headerArray13);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList14, typedOutput16);
        java.util.List<retrofit.client.Header> headerList18 = request17.headers;
        java.lang.Object[] objArray20 = new java.lang.Object[] { true, (short) 1, request17, 0 };
        requestBuilder7.args = objArray20;
        retrofit.converter.Converter converter22 = requestBuilder7.converter;
        java.lang.Object[] objArray23 = requestBuilder7.args;
        retrofit.client.Header[] headerArray26 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList27 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList27, headerArray26);
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList27, typedOutput29);
        java.lang.String str31 = request30.url;
        java.util.List<retrofit.client.Header> headerList32 = request30.headers;
        retrofit.mime.TypedOutput typedOutput33 = request30.body;
        retrofit.mime.TypedOutput typedOutput34 = request30.body;
        java.util.List<retrofit.client.Header> headerList35 = request30.headers;
        requestBuilder7.setheaders(headerList35);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("hi!", "hi!", headerList35, typedOutput37);
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "", headerList35, typedOutput39);
        java.util.List<retrofit.client.Header> headerList41 = request40.getHeaders();
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("", "hi!", headerList41, typedOutput42);
        java.lang.String str44 = request43.method;
        java.lang.Class<?> wildcardClass45 = request43.getClass();
        org.junit.Assert.assertNull(headerList8);
        org.junit.Assert.assertNotNull(headerArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(objArray20);
        org.junit.Assert.assertNull(converter22);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertNotNull(headerArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNull(typedOutput33);
        org.junit.Assert.assertNull(typedOutput34);
        org.junit.Assert.assertNotNull(headerList35);
        org.junit.Assert.assertNotNull(headerList41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(wildcardClass45);
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.util.List<retrofit.client.Header> headerList17 = requestBuilder1.headers;
        java.util.List<retrofit.client.Header> headerList18 = requestBuilder1.headers;
        retrofit.RequestBuilder requestBuilder20 = requestBuilder1.apiUrl("");
        retrofit.client.Header[] headerArray25 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList26 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList26, headerArray25);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList26, typedOutput28);
        java.lang.String str30 = request29.url;
        java.util.List<retrofit.client.Header> headerList31 = request29.headers;
        retrofit.mime.TypedOutput typedOutput32 = request29.body;
        retrofit.mime.TypedOutput typedOutput33 = request29.body;
        java.util.List<retrofit.client.Header> headerList34 = request29.headers;
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("hi!", "hi!", headerList34, typedOutput35);
        java.util.List<retrofit.client.Header> headerList37 = request36.getHeaders();
        retrofit.RequestBuilder requestBuilder38 = requestBuilder1.headers(headerList37);
        retrofit.client.Header[] headerArray43 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList44 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList44, headerArray43);
        retrofit.mime.TypedOutput typedOutput46 = null;
        retrofit.client.Request request47 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList44, typedOutput46);
        java.lang.String str48 = request47.url;
        java.util.List<retrofit.client.Header> headerList49 = request47.headers;
        retrofit.mime.TypedOutput typedOutput50 = request47.body;
        retrofit.mime.TypedOutput typedOutput51 = request47.body;
        java.util.List<retrofit.client.Header> headerList52 = request47.headers;
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("hi!", "hi!", headerList52, typedOutput53);
        requestBuilder1.setheaders(headerList52);
        retrofit.converter.Converter converter56 = requestBuilder1.getconverter();
        retrofit.RequestBuilder requestBuilder58 = requestBuilder1.apiUrl("");
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request59 = requestBuilder58.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNull(headerList17);
        org.junit.Assert.assertNull(headerList18);
        org.junit.Assert.assertNotNull(requestBuilder20);
        org.junit.Assert.assertNotNull(headerArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNull(typedOutput32);
        org.junit.Assert.assertNull(typedOutput33);
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNotNull(requestBuilder38);
        org.junit.Assert.assertNotNull(headerArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(headerList49);
        org.junit.Assert.assertNull(typedOutput50);
        org.junit.Assert.assertNull(typedOutput51);
        org.junit.Assert.assertNotNull(headerList52);
        org.junit.Assert.assertNull(converter56);
        org.junit.Assert.assertNotNull(requestBuilder58);
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        retrofit.converter.Converter converter8 = null;
        retrofit.RequestBuilder requestBuilder9 = new retrofit.RequestBuilder(converter8);
        java.util.List<retrofit.client.Header> headerList10 = requestBuilder9.headers;
        retrofit.client.Header[] headerArray15 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList16 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList16, headerArray15);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList16, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.headers;
        java.lang.Object[] objArray22 = new java.lang.Object[] { true, (short) 1, request19, 0 };
        requestBuilder9.args = objArray22;
        retrofit.converter.Converter converter24 = requestBuilder9.converter;
        java.util.List<retrofit.client.Header> headerList25 = requestBuilder9.headers;
        requestBuilder9.apiUrl = "hi!";
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
        java.lang.String str37 = request36.url;
        java.util.List<retrofit.client.Header> headerList38 = request36.headers;
        retrofit.mime.TypedOutput typedOutput39 = null;
        retrofit.client.Request request40 = new retrofit.client.Request("", "", headerList38, typedOutput39);
        retrofit.RequestBuilder requestBuilder41 = requestBuilder9.headers(headerList38);
        retrofit.mime.TypedOutput typedOutput42 = null;
        retrofit.client.Request request43 = new retrofit.client.Request("", "hi!", headerList38, typedOutput42);
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("", "", headerList38, typedOutput44);
        java.lang.String str46 = request45.method;
        java.util.List<retrofit.client.Header> headerList47 = request45.getHeaders();
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "", headerList47, typedOutput48);
        retrofit.mime.TypedOutput typedOutput50 = null;
        retrofit.client.Request request51 = new retrofit.client.Request("", "hi!", headerList47, typedOutput50);
        org.junit.Assert.assertNull(headerList10);
        org.junit.Assert.assertNotNull(headerArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(objArray22);
        org.junit.Assert.assertNull(converter24);
        org.junit.Assert.assertNull(headerList25);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(headerList38);
        org.junit.Assert.assertNotNull(requestBuilder41);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(headerList47);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        java.lang.String str11 = request10.url;
        retrofit.mime.TypedOutput typedOutput12 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = request10.body;
        java.util.List<retrofit.client.Header> headerList15 = request10.headers;
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "hi!", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.getHeaders();
        java.util.List<retrofit.client.Header> headerList21 = request19.headers;
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(headerList21);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        java.util.List<retrofit.client.Header> headerList4 = requestBuilder3.headers;
        retrofit.converter.Converter converter5 = requestBuilder3.getconverter();
        retrofit.RequestBuilder requestBuilder7 = requestBuilder3.apiUrl("hi!");
        java.lang.String str8 = requestBuilder7.getapiUrl();
        retrofit.converter.Converter converter13 = null;
        retrofit.RequestBuilder requestBuilder14 = new retrofit.RequestBuilder(converter13);
        java.util.List<retrofit.client.Header> headerList15 = requestBuilder14.headers;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.headers;
        java.lang.Object[] objArray27 = new java.lang.Object[] { true, (short) 1, request24, 0 };
        requestBuilder14.args = objArray27;
        retrofit.client.Header[] headerArray31 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList32 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList32, headerArray31);
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList32, typedOutput34);
        java.util.List<retrofit.client.Header> headerList36 = request35.headers;
        requestBuilder14.setheaders(headerList36);
        retrofit.mime.TypedOutput typedOutput38 = null;
        retrofit.client.Request request39 = new retrofit.client.Request("", "hi!", headerList36, typedOutput38);
        retrofit.mime.TypedOutput typedOutput40 = null;
        retrofit.client.Request request41 = new retrofit.client.Request("hi!", "", headerList36, typedOutput40);
        java.util.List<retrofit.client.Header> headerList42 = request41.getHeaders();
        requestBuilder7.headers = headerList42;
        retrofit.mime.TypedOutput typedOutput44 = null;
        retrofit.client.Request request45 = new retrofit.client.Request("", "hi!", headerList42, typedOutput44);
        org.junit.Assert.assertNull(headerList4);
        org.junit.Assert.assertNull(converter5);
        org.junit.Assert.assertNotNull(requestBuilder7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(headerList15);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertNotNull(headerArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(headerList36);
        org.junit.Assert.assertNotNull(headerList42);
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        retrofit.converter.Converter converter2 = null;
        retrofit.RequestBuilder requestBuilder3 = new retrofit.RequestBuilder(converter2);
        requestBuilder3.setapiUrl("hi!");
        java.lang.Object[] objArray6 = requestBuilder3.args;
        java.lang.Object[] objArray7 = requestBuilder3.args;
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        java.lang.String str17 = request16.url;
        java.util.List<retrofit.client.Header> headerList18 = request16.headers;
        retrofit.mime.TypedOutput typedOutput19 = request16.body;
        retrofit.mime.TypedOutput typedOutput20 = request16.body;
        retrofit.mime.TypedOutput typedOutput21 = request16.getBody();
        retrofit.mime.TypedOutput typedOutput22 = request16.body;
        java.util.List<retrofit.client.Header> headerList23 = request16.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        requestBuilder3.headers = headerList24;
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "hi!", headerList24, typedOutput28);
        java.util.List<retrofit.client.Header> headerList30 = request29.headers;
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertNull(objArray7);
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(headerList30);
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.converter.Converter converter3 = requestBuilder1.getconverter();
        retrofit.RequestBuilder requestBuilder5 = requestBuilder1.apiUrl("hi!");
        java.lang.Object[] objArray6 = requestBuilder1.args;
        requestBuilder1.setapiUrl("hi!");
        retrofit.converter.Converter converter9 = null;
        retrofit.RequestBuilder requestBuilder10 = new retrofit.RequestBuilder(converter9);
        requestBuilder10.setapiUrl("");
        java.lang.String str13 = requestBuilder10.getapiUrl();
        requestBuilder10.setapiUrl("hi!");
        retrofit.RequestBuilder requestBuilder17 = requestBuilder10.apiUrl("");
        retrofit.converter.Converter converter18 = null;
        retrofit.RequestBuilder requestBuilder19 = new retrofit.RequestBuilder(converter18);
        java.lang.Object[] objArray20 = requestBuilder19.getargs();
        retrofit.converter.Converter converter21 = requestBuilder19.getconverter();
        retrofit.converter.Converter converter22 = null;
        retrofit.RequestBuilder requestBuilder23 = new retrofit.RequestBuilder(converter22);
        java.util.List<retrofit.client.Header> headerList24 = requestBuilder23.headers;
        retrofit.converter.Converter converter25 = null;
        retrofit.RequestBuilder requestBuilder26 = new retrofit.RequestBuilder(converter25);
        java.util.List<retrofit.client.Header> headerList27 = requestBuilder26.headers;
        retrofit.client.Header[] headerArray32 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList33 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList33, headerArray32);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList33, typedOutput35);
        java.util.List<retrofit.client.Header> headerList37 = request36.headers;
        java.lang.Object[] objArray39 = new java.lang.Object[] { true, (short) 1, request36, 0 };
        requestBuilder26.args = objArray39;
        requestBuilder23.setargs(objArray39);
        retrofit.RequestBuilder requestBuilder42 = requestBuilder19.args(objArray39);
        java.lang.Object[] objArray43 = requestBuilder19.args;
        requestBuilder10.args = objArray43;
        retrofit.RequestBuilder requestBuilder45 = requestBuilder1.args(objArray43);
        java.lang.Object[] objArray46 = requestBuilder45.getargs();
        java.util.List<retrofit.client.Header> headerList47 = null;
        requestBuilder45.headers = headerList47;
        requestBuilder45.apiUrl = "";
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNull(converter3);
        org.junit.Assert.assertNotNull(requestBuilder5);
        org.junit.Assert.assertNull(objArray6);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(requestBuilder17);
        org.junit.Assert.assertNull(objArray20);
        org.junit.Assert.assertNull(converter21);
        org.junit.Assert.assertNull(headerList24);
        org.junit.Assert.assertNull(headerList27);
        org.junit.Assert.assertNotNull(headerArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(headerList37);
        org.junit.Assert.assertNotNull(objArray39);
        org.junit.Assert.assertNotNull(requestBuilder42);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertNotNull(requestBuilder45);
        org.junit.Assert.assertNotNull(objArray46);
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        retrofit.converter.Converter converter10 = null;
        retrofit.RequestBuilder requestBuilder11 = new retrofit.RequestBuilder(converter10);
        java.util.List<retrofit.client.Header> headerList12 = requestBuilder11.headers;
        retrofit.client.Header[] headerArray17 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList18 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList18, headerArray17);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList18, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.headers;
        java.lang.Object[] objArray24 = new java.lang.Object[] { true, (short) 1, request21, 0 };
        requestBuilder11.args = objArray24;
        retrofit.converter.Converter converter26 = requestBuilder11.converter;
        java.util.List<retrofit.client.Header> headerList27 = requestBuilder11.headers;
        requestBuilder11.apiUrl = "hi!";
        retrofit.client.Header[] headerArray34 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList35 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList35, headerArray34);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList35, typedOutput37);
        java.lang.String str39 = request38.url;
        java.util.List<retrofit.client.Header> headerList40 = request38.headers;
        retrofit.mime.TypedOutput typedOutput41 = null;
        retrofit.client.Request request42 = new retrofit.client.Request("", "", headerList40, typedOutput41);
        retrofit.RequestBuilder requestBuilder43 = requestBuilder11.headers(headerList40);
        java.util.List<retrofit.client.Header> headerList44 = requestBuilder11.headers;
        java.util.List<retrofit.client.Header> headerList45 = requestBuilder11.headers;
        retrofit.mime.TypedOutput typedOutput46 = null;
        retrofit.client.Request request47 = new retrofit.client.Request("", "hi!", headerList45, typedOutput46);
        retrofit.mime.TypedOutput typedOutput48 = null;
        retrofit.client.Request request49 = new retrofit.client.Request("", "hi!", headerList45, typedOutput48);
        java.util.List<retrofit.client.Header> headerList50 = request49.getHeaders();
        java.lang.String str51 = request49.getMethod();
        java.util.List<retrofit.client.Header> headerList52 = request49.getHeaders();
        retrofit.mime.TypedOutput typedOutput53 = null;
        retrofit.client.Request request54 = new retrofit.client.Request("hi!", "", headerList52, typedOutput53);
        retrofit.mime.TypedOutput typedOutput55 = null;
        retrofit.client.Request request56 = new retrofit.client.Request("hi!", "hi!", headerList52, typedOutput55);
        retrofit.mime.TypedOutput typedOutput57 = null;
        retrofit.client.Request request58 = new retrofit.client.Request("hi!", "hi!", headerList52, typedOutput57);
        java.lang.String str59 = request58.getMethod();
        org.junit.Assert.assertNull(headerList12);
        org.junit.Assert.assertNotNull(headerArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(objArray24);
        org.junit.Assert.assertNull(converter26);
        org.junit.Assert.assertNull(headerList27);
        org.junit.Assert.assertNotNull(headerArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(headerList40);
        org.junit.Assert.assertNotNull(requestBuilder43);
        org.junit.Assert.assertNotNull(headerList44);
        org.junit.Assert.assertNotNull(headerList45);
        org.junit.Assert.assertNotNull(headerList50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(headerList52);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        retrofit.converter.Converter converter0 = null;
        retrofit.RequestBuilder requestBuilder1 = new retrofit.RequestBuilder(converter0);
        java.util.List<retrofit.client.Header> headerList2 = requestBuilder1.headers;
        retrofit.client.Header[] headerArray7 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList8 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList8, headerArray7);
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList8, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.headers;
        java.lang.Object[] objArray14 = new java.lang.Object[] { true, (short) 1, request11, 0 };
        requestBuilder1.args = objArray14;
        retrofit.converter.Converter converter16 = requestBuilder1.converter;
        java.lang.Object[] objArray17 = requestBuilder1.args;
        retrofit.client.Header[] headerArray20 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList21 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList21, headerArray20);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList21, typedOutput23);
        java.lang.String str25 = request24.url;
        java.util.List<retrofit.client.Header> headerList26 = request24.headers;
        retrofit.mime.TypedOutput typedOutput27 = request24.body;
        retrofit.mime.TypedOutput typedOutput28 = request24.body;
        java.util.List<retrofit.client.Header> headerList29 = request24.headers;
        requestBuilder1.setheaders(headerList29);
        requestBuilder1.setapiUrl("hi!");
        retrofit.RequestBuilder requestBuilder34 = requestBuilder1.apiUrl("hi!");
        requestBuilder1.apiUrl = "";
        // The following exception was thrown during execution in test generation
        try {
            retrofit.client.Request request37 = requestBuilder1.build();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(headerList2);
        org.junit.Assert.assertNotNull(headerArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertNull(converter16);
        org.junit.Assert.assertNotNull(objArray17);
        org.junit.Assert.assertNotNull(headerArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(requestBuilder34);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.headers;
        retrofit.mime.TypedOutput typedOutput10 = request8.body;
        java.lang.String str11 = request8.method;
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        java.lang.String str16 = request14.url;
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }
}

