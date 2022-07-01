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
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.Class<?> wildcardClass7 = headerList3.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.Class<?> wildcardClass7 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.lang.Class<?> wildcardClass8 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.Class<?> wildcardClass12 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.Class<?> wildcardClass11 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.Class<?> wildcardClass5 = request4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.Class<?> wildcardClass11 = headerList5.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass8 = typedOutput7.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.Class<?> wildcardClass9 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getMethod();
        java.lang.Class<?> wildcardClass9 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.Class<?> wildcardClass12 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.Class<?> wildcardClass24 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.Class<?> wildcardClass7 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        java.lang.Class<?> wildcardClass14 = headerList11.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.lang.Class<?> wildcardClass9 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.Class<?> wildcardClass10 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.Class<?> wildcardClass6 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.lang.String str20 = request18.getUrl();
        java.lang.Class<?> wildcardClass21 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = typedOutput8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.Class<?> wildcardClass15 = headerList7.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.lang.Class<?> wildcardClass9 = headerList8.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.Class<?> wildcardClass8 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.Class<?> wildcardClass15 = headerList7.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        java.lang.String str11 = request6.getUrl();
        java.lang.Class<?> wildcardClass12 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.getUrl();
        java.lang.String str9 = request4.getUrl();
        java.lang.Class<?> wildcardClass10 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.getUrl();
        java.lang.Class<?> wildcardClass9 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList6 = request4.getHeaders();
        java.lang.Class<?> wildcardClass7 = headerList6.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.Class<?> wildcardClass8 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.Class<?> wildcardClass9 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.lang.Class<?> wildcardClass26 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        java.lang.Class<?> wildcardClass20 = headerList19.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.lang.Class<?> wildcardClass12 = headerList11.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput13 = request10.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = typedOutput13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.getMethod();
        java.lang.Class<?> wildcardClass10 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getMethod();
        java.lang.Class<?> wildcardClass7 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", headerList12, typedOutput13);
        java.lang.Class<?> wildcardClass15 = headerList12.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.Class<?> wildcardClass11 = headerList5.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList6 = request4.getHeaders();
        java.lang.Class<?> wildcardClass7 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.lang.Class<?> wildcardClass16 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.lang.String str20 = request18.getUrl();
        retrofit.mime.TypedOutput typedOutput21 = request18.getBody();
        java.lang.String str22 = request18.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request18.getHeaders();
        java.lang.Class<?> wildcardClass24 = headerList23.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.lang.Class<?> wildcardClass24 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.lang.String str19 = request18.getUrl();
        java.lang.Class<?> wildcardClass20 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.lang.String str20 = request18.getMethod();
        java.util.List<retrofit.client.Header> headerList21 = request18.getHeaders();
        java.lang.Class<?> wildcardClass22 = headerList21.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.lang.String str24 = request22.getMethod();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "hi!", headerList25, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "hi!", headerList25, typedOutput28);
        java.lang.Class<?> wildcardClass30 = request29.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.lang.Class<?> wildcardClass19 = headerList9.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.lang.String str19 = request18.getMethod();
        java.lang.Class<?> wildcardClass20 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput16);
        java.lang.Class<?> wildcardClass18 = request17.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getMethod();
        java.lang.Class<?> wildcardClass14 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.lang.String str14 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput15 = request12.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        java.lang.Class<?> wildcardClass20 = request19.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        retrofit.mime.TypedOutput typedOutput20 = request18.getBody();
        java.lang.Class<?> wildcardClass21 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        java.lang.String str13 = request6.getMethod();
        java.lang.Class<?> wildcardClass14 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        java.lang.Class<?> wildcardClass13 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.lang.Class<?> wildcardClass7 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput25);
        java.util.List<retrofit.client.Header> headerList27 = request26.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "hi!", headerList27, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("hi!", "", headerList27, typedOutput30);
        java.lang.Class<?> wildcardClass32 = request31.getClass();
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "hi!", headerList23, typedOutput24);
        java.lang.Class<?> wildcardClass26 = headerList23.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.Class<?> wildcardClass15 = headerList7.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.Class<?> wildcardClass11 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.Class<?> wildcardClass8 = headerList7.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.lang.String str8 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typedOutput9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(typedOutput9);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.Class<?> wildcardClass10 = headerList9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList26 = request22.getHeaders();
        java.lang.Class<?> wildcardClass27 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        java.lang.Class<?> wildcardClass16 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.getMethod();
        java.lang.Class<?> wildcardClass7 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        java.lang.Class<?> wildcardClass13 = headerList12.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
        java.lang.Class<?> wildcardClass26 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput13 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList14 = request10.getHeaders();
        java.lang.Class<?> wildcardClass15 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.Class<?> wildcardClass10 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.lang.String str26 = request22.getMethod();
        java.lang.Class<?> wildcardClass27 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.Class<?> wildcardClass8 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.lang.String str10 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        java.lang.Class<?> wildcardClass12 = headerList11.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getUrl();
        java.lang.Class<?> wildcardClass10 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.Class<?> wildcardClass11 = headerList5.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        java.lang.String str14 = request13.getUrl();
        java.lang.String str15 = request13.getMethod();
        java.lang.Class<?> wildcardClass16 = request13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.getHeaders();
        java.lang.Class<?> wildcardClass15 = headerList14.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getUrl();
        java.util.List<retrofit.client.Header> headerList16 = request14.getHeaders();
        java.lang.Class<?> wildcardClass17 = headerList16.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        java.lang.String str14 = request13.getUrl();
        java.lang.String str15 = request13.getUrl();
        java.lang.Class<?> wildcardClass16 = request13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.lang.String str14 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput15 = request12.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "", headerList17, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.getHeaders();
        java.lang.Class<?> wildcardClass21 = request19.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        java.lang.Class<?> wildcardClass25 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.Class<?> wildcardClass10 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.lang.Class<?> wildcardClass19 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = request15.getBody();
        java.lang.Class<?> wildcardClass17 = request15.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request22.getHeaders();
        java.lang.Class<?> wildcardClass25 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getMethod();
        java.lang.String str11 = request6.getMethod();
        java.lang.Class<?> wildcardClass12 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        java.lang.Class<?> wildcardClass12 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "hi!", headerList11, typedOutput14);
        java.lang.Class<?> wildcardClass16 = request15.getClass();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        java.util.List<retrofit.client.Header> headerList16 = request14.getHeaders();
        java.lang.Class<?> wildcardClass17 = headerList16.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList14 = request12.getHeaders();
        java.util.List<retrofit.client.Header> headerList15 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput16);
        java.lang.Class<?> wildcardClass18 = request17.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.String str12 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput13 = request10.getBody();
        java.lang.Class<?> wildcardClass14 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", headerList8, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        java.lang.String str14 = request10.getUrl();
        java.lang.String str15 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList16 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", headerList16, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", headerList16, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", headerList21, typedOutput22);
        java.lang.Class<?> wildcardClass24 = request23.getClass();
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getMethod();
        java.lang.Class<?> wildcardClass14 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.lang.Class<?> wildcardClass23 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.lang.String str14 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput15 = request12.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "", headerList17, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.getHeaders();
        java.lang.Class<?> wildcardClass21 = headerList20.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        retrofit.mime.TypedOutput typedOutput20 = request18.getBody();
        java.lang.String str21 = request18.getMethod();
        java.lang.Class<?> wildcardClass22 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.String str11 = request10.getMethod();
        java.lang.String str12 = request10.getMethod();
        java.lang.String str13 = request10.getUrl();
        java.lang.Class<?> wildcardClass14 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.util.List<retrofit.client.Header> headerList16 = request14.getHeaders();
        java.lang.Class<?> wildcardClass17 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        java.lang.String str16 = request14.getUrl();
        retrofit.mime.TypedOutput typedOutput17 = request14.getBody();
        retrofit.mime.TypedOutput typedOutput18 = request14.getBody();
        java.util.List<retrofit.client.Header> headerList19 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList19, typedOutput22);
        java.lang.Class<?> wildcardClass24 = headerList19.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.lang.String str9 = request4.getUrl();
        java.lang.Class<?> wildcardClass10 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.lang.Class<?> wildcardClass23 = headerList11.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.lang.String str10 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typedOutput11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(typedOutput11);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList26 = request22.getHeaders();
        java.lang.Class<?> wildcardClass27 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.Class<?> wildcardClass10 = headerList9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.Class<?> wildcardClass15 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.lang.String str14 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput15 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList16 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", headerList16, typedOutput17);
        java.lang.Class<?> wildcardClass19 = headerList16.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.getMethod();
        java.lang.String str10 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        java.lang.Class<?> wildcardClass12 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.Class<?> wildcardClass16 = headerList15.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.lang.Class<?> wildcardClass28 = request26.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.lang.Class<?> wildcardClass19 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.lang.Class<?> wildcardClass19 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.lang.Class<?> wildcardClass24 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        java.lang.String str14 = request13.getUrl();
        java.lang.String str15 = request13.getUrl();
        java.lang.String str16 = request13.getMethod();
        java.lang.Class<?> wildcardClass17 = request13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getUrl();
        java.lang.Class<?> wildcardClass25 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.lang.String str26 = request22.getMethod();
        java.util.List<retrofit.client.Header> headerList27 = request22.getHeaders();
        java.lang.Class<?> wildcardClass28 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.lang.String str8 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass10 = typedOutput9.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(typedOutput9);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.lang.String str10 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        java.lang.Class<?> wildcardClass12 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = request13.getBody();
        java.lang.String str15 = request13.getUrl();
        java.lang.Class<?> wildcardClass16 = request13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.String str10 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        java.lang.Class<?> wildcardClass12 = headerList11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getUrl();
        java.lang.String str11 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", headerList12, typedOutput13);
        java.lang.Class<?> wildcardClass15 = headerList12.getClass();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.Class<?> wildcardClass11 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getUrl();
        java.lang.String str16 = request14.getUrl();
        java.util.List<retrofit.client.Header> headerList17 = request14.getHeaders();
        java.lang.Class<?> wildcardClass18 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.getUrl();
        java.lang.String str10 = request4.getMethod();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.Class<?> wildcardClass6 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList10, typedOutput13);
        java.lang.Class<?> wildcardClass15 = request14.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getUrl();
        java.lang.String str11 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList12, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.lang.Class<?> wildcardClass16 = request14.getClass();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getMethod();
        java.lang.String str9 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        java.lang.Class<?> wildcardClass11 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.lang.String str20 = request18.getMethod();
        java.util.List<retrofit.client.Header> headerList21 = request18.getHeaders();
        java.lang.String str22 = request18.getUrl();
        retrofit.mime.TypedOutput typedOutput23 = request18.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request18.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = typedOutput24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "", headerList11, typedOutput14);
        java.lang.Class<?> wildcardClass16 = headerList11.getClass();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.lang.String str24 = request22.getMethod();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
        java.lang.Class<?> wildcardClass26 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.lang.String str9 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        java.lang.Class<?> wildcardClass11 = headerList10.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.String str10 = request4.getUrl();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.lang.String str23 = request22.getMethod();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        java.lang.String str25 = request22.getMethod();
        java.lang.Class<?> wildcardClass26 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getMethod();
        java.lang.String str10 = request8.getUrl();
        java.lang.String str11 = request8.getMethod();
        retrofit.mime.TypedOutput typedOutput12 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "", headerList13, typedOutput16);
        java.lang.Class<?> wildcardClass18 = headerList13.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.String str10 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        java.lang.Class<?> wildcardClass12 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getMethod();
        java.lang.String str7 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.lang.Class<?> wildcardClass9 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        java.lang.String str20 = request18.getMethod();
        java.lang.String str21 = request18.getUrl();
        java.lang.Class<?> wildcardClass22 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "", headerList9, typedOutput10);
        java.lang.Class<?> wildcardClass12 = request11.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput8 = null;
        retrofit.client.Request request9 = new retrofit.client.Request("hi!", "hi!", headerList7, typedOutput8);
        java.lang.Class<?> wildcardClass10 = request9.getClass();
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", headerList8, typedOutput9);
        java.lang.Class<?> wildcardClass11 = headerList8.getClass();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = request6.getBody();
        java.lang.String str12 = request6.getMethod();
        java.lang.Class<?> wildcardClass13 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.lang.Class<?> wildcardClass12 = headerList11.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.lang.String str20 = request18.getUrl();
        retrofit.mime.TypedOutput typedOutput21 = request18.getBody();
        java.util.List<retrofit.client.Header> headerList22 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput23 = request18.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = typedOutput23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNull(typedOutput23);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.Class<?> wildcardClass10 = headerList9.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList19, typedOutput22);
        java.lang.Class<?> wildcardClass24 = headerList19.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.lang.String str7 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.getMethod();
        java.lang.Class<?> wildcardClass10 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getUrl();
        java.lang.String str11 = request6.getMethod();
        java.lang.String str12 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.lang.String str12 = request6.getMethod();
        java.lang.Class<?> wildcardClass13 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        java.lang.Class<?> wildcardClass11 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.Class<?> wildcardClass16 = headerList15.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList24 = request22.getHeaders();
        java.lang.Class<?> wildcardClass25 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.Class<?> wildcardClass24 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "", headerList11, typedOutput12);
        java.lang.Class<?> wildcardClass14 = request13.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        java.lang.Class<?> wildcardClass20 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        java.lang.String str20 = request18.getMethod();
        java.lang.Class<?> wildcardClass21 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.getUrl();
        java.lang.String str9 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.lang.String str20 = request18.getMethod();
        java.util.List<retrofit.client.Header> headerList21 = request18.getHeaders();
        java.lang.String str22 = request18.getUrl();
        retrofit.mime.TypedOutput typedOutput23 = request18.getBody();
        java.lang.String str24 = request18.getMethod();
        java.lang.Class<?> wildcardClass25 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getUrl();
        java.lang.String str25 = request22.getUrl();
        retrofit.mime.TypedOutput typedOutput26 = request22.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = typedOutput26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(typedOutput26);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = request13.getBody();
        java.lang.String str15 = request13.getUrl();
        java.lang.String str16 = request13.getUrl();
        java.util.List<retrofit.client.Header> headerList17 = request13.getHeaders();
        java.lang.Class<?> wildcardClass18 = headerList17.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        retrofit.mime.TypedOutput typedOutput20 = request18.getBody();
        retrofit.mime.TypedOutput typedOutput21 = request18.getBody();
        java.util.List<retrofit.client.Header> headerList22 = request18.getHeaders();
        java.lang.Class<?> wildcardClass23 = headerList22.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.lang.String str26 = request22.getUrl();
        java.lang.Class<?> wildcardClass27 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getUrl();
        java.lang.String str25 = request22.getMethod();
        java.lang.Class<?> wildcardClass26 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.lang.String str24 = request22.getMethod();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "hi!", headerList25, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "hi!", headerList28, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.getHeaders();
        java.lang.Class<?> wildcardClass32 = headerList31.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.getUrl();
        java.lang.Class<?> wildcardClass9 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        java.lang.Class<?> wildcardClass20 = headerList19.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.Class<?> wildcardClass11 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.Class<?> wildcardClass8 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.lang.Class<?> wildcardClass12 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.lang.String str12 = request8.getUrl();
        java.lang.String str13 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList14 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", headerList14, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", headerList14, typedOutput17);
        java.lang.Class<?> wildcardClass19 = request18.getClass();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "", headerList10, typedOutput11);
        java.lang.Class<?> wildcardClass13 = headerList10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "", headerList24, typedOutput25);
        java.lang.Class<?> wildcardClass27 = request26.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "", headerList8, typedOutput9);
        java.lang.Class<?> wildcardClass11 = request10.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = request13.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = typedOutput14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput14);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList12, typedOutput13);
        java.lang.Class<?> wildcardClass15 = headerList12.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", headerList10, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass16 = typedOutput15.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput15);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        java.lang.String str16 = request14.getUrl();
        retrofit.mime.TypedOutput typedOutput17 = request14.getBody();
        retrofit.mime.TypedOutput typedOutput18 = request14.getBody();
        java.util.List<retrofit.client.Header> headerList19 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", headerList19, typedOutput22);
        java.lang.Class<?> wildcardClass24 = headerList19.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getUrl();
        java.lang.String str11 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList12, typedOutput13);
        java.lang.Class<?> wildcardClass15 = headerList12.getClass();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.util.List<retrofit.client.Header> headerList16 = request14.getHeaders();
        java.lang.Class<?> wildcardClass17 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        java.lang.String str25 = request22.getMethod();
        java.lang.Class<?> wildcardClass26 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getUrl();
        java.lang.String str11 = request6.getMethod();
        java.lang.Class<?> wildcardClass12 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.Class<?> wildcardClass15 = headerList7.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getMethod();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request10.getHeaders();
        java.lang.Class<?> wildcardClass18 = headerList17.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getMethod();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request10.getHeaders();
        java.lang.Class<?> wildcardClass18 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.Class<?> wildcardClass11 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.getHeaders();
        java.util.List<retrofit.client.Header> headerList26 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput27 = request24.getBody();
        java.lang.String str28 = request24.getMethod();
        java.util.List<retrofit.client.Header> headerList29 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "hi!", headerList29, typedOutput30);
        java.lang.Class<?> wildcardClass32 = request31.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.Class<?> wildcardClass15 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.Class<?> wildcardClass24 = headerList23.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getUrl();
        java.lang.String str16 = request14.getUrl();
        java.util.List<retrofit.client.Header> headerList17 = request14.getHeaders();
        java.util.List<retrofit.client.Header> headerList18 = request14.getHeaders();
        java.lang.Class<?> wildcardClass19 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        java.lang.String str11 = request6.getUrl();
        java.lang.Class<?> wildcardClass12 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        java.lang.Class<?> wildcardClass14 = headerList11.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.lang.String str20 = request18.getMethod();
        java.util.List<retrofit.client.Header> headerList21 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = request18.getBody();
        java.lang.Class<?> wildcardClass23 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.lang.String str14 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput15 = request12.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "", headerList17, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = request19.getBody();
        java.lang.Class<?> wildcardClass22 = request19.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList10, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.Class<?> wildcardClass16 = headerList15.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        java.lang.String str13 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput14 = request6.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = typedOutput14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(typedOutput14);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("", "hi!", headerList9, typedOutput10);
        java.lang.Class<?> wildcardClass12 = headerList9.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        java.lang.String str10 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput11 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList12, typedOutput13);
        java.lang.Class<?> wildcardClass15 = request14.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList6 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.Class<?> wildcardClass8 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput13 = request10.getBody();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        java.lang.Class<?> wildcardClass16 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = typedOutput24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.Class<?> wildcardClass16 = headerList15.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = typedOutput8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList19, typedOutput22);
        java.lang.String str24 = request23.getMethod();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        java.lang.String str16 = request10.getMethod();
        java.lang.Class<?> wildcardClass17 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getMethod();
        java.lang.String str11 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList12, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.lang.Class<?> wildcardClass16 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.util.List<retrofit.client.Header> headerList5 = request4.getHeaders();
        java.lang.Class<?> wildcardClass6 = request4.getClass();
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.lang.String str26 = request22.getUrl();
        java.util.List<retrofit.client.Header> headerList27 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList28 = request22.getHeaders();
        java.lang.String str29 = request22.getUrl();
        java.lang.Class<?> wildcardClass30 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getUrl();
        java.lang.String str25 = request22.getUrl();
        retrofit.mime.TypedOutput typedOutput26 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput27 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList28 = request22.getHeaders();
        java.lang.Class<?> wildcardClass29 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", headerList12, typedOutput15);
        java.lang.Class<?> wildcardClass17 = request16.getClass();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        java.lang.String str11 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput12 = request6.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = typedOutput12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        java.lang.String str14 = request13.getUrl();
        java.lang.String str15 = request13.getUrl();
        java.lang.String str16 = request13.getMethod();
        java.util.List<retrofit.client.Header> headerList17 = request13.getHeaders();
        java.lang.Class<?> wildcardClass18 = headerList17.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        java.util.List<retrofit.client.Header> headerList26 = request24.getHeaders();
        java.util.List<retrofit.client.Header> headerList27 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "hi!", headerList27, typedOutput28);
        java.lang.Class<?> wildcardClass30 = request29.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.lang.String str13 = request12.getMethod();
        java.lang.String str14 = request12.getUrl();
        java.lang.String str15 = request12.getMethod();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", headerList17, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput24);
        java.lang.Class<?> wildcardClass26 = request25.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.Class<?> wildcardClass24 = headerList23.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getUrl();
        java.lang.String str16 = request14.getUrl();
        java.lang.Class<?> wildcardClass17 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getUrl();
        java.lang.String str11 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList12, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.lang.String str16 = request14.getUrl();
        java.lang.Class<?> wildcardClass17 = request14.getClass();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", headerList8, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", headerList12, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", headerList12, typedOutput17);
        java.lang.Class<?> wildcardClass19 = request18.getClass();
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = request13.getBody();
        java.lang.String str15 = request13.getUrl();
        java.lang.String str16 = request13.getUrl();
        java.util.List<retrofit.client.Header> headerList17 = request13.getHeaders();
        java.lang.Class<?> wildcardClass18 = request13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList15, typedOutput18);
        java.lang.Class<?> wildcardClass20 = headerList15.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.lang.String str14 = request12.getUrl();
        java.util.List<retrofit.client.Header> headerList15 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList15, typedOutput20);
        java.lang.Class<?> wildcardClass22 = request21.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput13 = request10.getBody();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = request10.getBody();
        java.lang.String str17 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList18 = request10.getHeaders();
        java.lang.Class<?> wildcardClass19 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.String str11 = request10.getMethod();
        java.lang.String str12 = request10.getMethod();
        java.lang.String str13 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.lang.Class<?> wildcardClass15 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.lang.String str20 = request18.getMethod();
        java.util.List<retrofit.client.Header> headerList21 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = request18.getBody();
        java.util.List<retrofit.client.Header> headerList23 = request18.getHeaders();
        java.lang.Class<?> wildcardClass24 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.getHeaders();
        java.lang.Class<?> wildcardClass15 = headerList14.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getMethod();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.lang.Class<?> wildcardClass15 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        java.lang.Class<?> wildcardClass27 = request26.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.lang.String str13 = request12.getMethod();
        java.lang.String str14 = request12.getUrl();
        java.lang.String str15 = request12.getMethod();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", headerList17, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput24);
        java.util.List<retrofit.client.Header> headerList26 = request25.getHeaders();
        java.lang.Class<?> wildcardClass27 = headerList26.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.lang.Class<?> wildcardClass26 = request25.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getUrl();
        java.lang.String str16 = request14.getMethod();
        java.lang.Class<?> wildcardClass17 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "hi!", headerList25, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
        java.lang.Class<?> wildcardClass29 = headerList28.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.util.List<retrofit.client.Header> headerList5 = request4.getHeaders();
        java.lang.Class<?> wildcardClass6 = headerList5.getClass();
        org.junit.Assert.assertNotNull(headerList5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.String str11 = request10.getMethod();
        java.lang.String str12 = request10.getMethod();
        java.lang.String str13 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        java.lang.Class<?> wildcardClass16 = headerList15.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.getMethod();
        java.lang.String str7 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.lang.Class<?> wildcardClass9 = headerList8.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.String str11 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput12 = request10.getBody();
        retrofit.mime.TypedOutput typedOutput13 = request10.getBody();
        java.lang.Class<?> wildcardClass14 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.lang.String str26 = request22.getMethod();
        java.util.List<retrofit.client.Header> headerList27 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList28 = request22.getHeaders();
        java.lang.Class<?> wildcardClass29 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        java.util.List<retrofit.client.Header> headerList26 = request24.getHeaders();
        java.util.List<retrofit.client.Header> headerList27 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "hi!", headerList27, typedOutput28);
        java.lang.Class<?> wildcardClass30 = headerList27.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList6 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.Class<?> wildcardClass10 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertNotNull(headerList6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.lang.String str12 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", headerList14, typedOutput15);
        java.lang.Class<?> wildcardClass17 = request16.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.getMethod();
        java.lang.String str7 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.Class<?> wildcardClass10 = headerList9.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput8 = null;
        retrofit.client.Request request9 = new retrofit.client.Request("hi!", "", headerList7, typedOutput8);
        java.lang.Class<?> wildcardClass10 = request9.getClass();
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.lang.String str8 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        java.lang.String str14 = request13.getUrl();
        java.lang.String str15 = request13.getMethod();
        java.lang.String str16 = request13.getMethod();
        java.lang.Class<?> wildcardClass17 = request13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.lang.String str14 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput15 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList16 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", headerList16, typedOutput17);
        java.lang.Class<?> wildcardClass19 = headerList16.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request14.getBody();
        java.lang.String str17 = request14.getMethod();
        java.util.List<retrofit.client.Header> headerList18 = request14.getHeaders();
        java.lang.Class<?> wildcardClass19 = headerList18.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.getUrl();
        java.lang.String str9 = request4.getUrl();
        java.lang.String str10 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typedOutput11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(typedOutput11);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", headerList12, typedOutput13);
        java.lang.Class<?> wildcardClass15 = headerList12.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = request26.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass28 = typedOutput27.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNull(typedOutput27);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = request17.getBody();
        java.util.List<retrofit.client.Header> headerList19 = request17.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "hi!", headerList19, typedOutput20);
        java.lang.Class<?> wildcardClass22 = headerList19.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getUrl();
        java.lang.String str16 = request14.getUrl();
        java.util.List<retrofit.client.Header> headerList17 = request14.getHeaders();
        java.lang.Class<?> wildcardClass18 = headerList17.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", headerList10, typedOutput11);
        java.lang.Class<?> wildcardClass13 = request12.getClass();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = request13.getBody();
        java.lang.String str15 = request13.getUrl();
        java.util.List<retrofit.client.Header> headerList16 = request13.getHeaders();
        java.lang.Class<?> wildcardClass17 = headerList16.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList26 = request22.getHeaders();
        java.lang.String str27 = request22.getMethod();
        java.util.List<retrofit.client.Header> headerList28 = request22.getHeaders();
        java.lang.Class<?> wildcardClass29 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.Class<?> wildcardClass5 = request4.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.Class<?> wildcardClass24 = headerList23.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.lang.String str12 = request8.getUrl();
        java.lang.String str13 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList14 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "hi!", headerList14, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", headerList14, typedOutput17);
        java.lang.String str19 = request18.getUrl();
        java.util.List<retrofit.client.Header> headerList20 = request18.getHeaders();
        java.lang.Class<?> wildcardClass21 = headerList20.getClass();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        java.lang.String str11 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        java.lang.String str13 = request6.getMethod();
        java.lang.String str14 = request6.getMethod();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        retrofit.mime.TypedOutput typedOutput14 = request12.getBody();
        java.lang.String str15 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = typedOutput16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(typedOutput16);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        java.lang.Class<?> wildcardClass12 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        java.lang.String str16 = request14.getUrl();
        retrofit.mime.TypedOutput typedOutput17 = request14.getBody();
        retrofit.mime.TypedOutput typedOutput18 = request14.getBody();
        java.util.List<retrofit.client.Header> headerList19 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = request23.getBody();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNull(typedOutput24);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.getUrl();
        java.lang.String str10 = request4.getMethod();
        java.lang.String str11 = request4.getMethod();
        java.lang.Class<?> wildcardClass12 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getUrl();
        java.lang.Class<?> wildcardClass7 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getUrl();
        java.lang.Class<?> wildcardClass9 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        java.lang.String str13 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList14 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", headerList14, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        java.lang.Class<?> wildcardClass18 = headerList17.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        java.lang.String str24 = request20.getUrl();
        retrofit.mime.TypedOutput typedOutput25 = request20.getBody();
        java.lang.String str26 = request20.getUrl();
        java.util.List<retrofit.client.Header> headerList27 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "hi!", headerList27, typedOutput28);
        java.util.List<retrofit.client.Header> headerList30 = request29.getHeaders();
        java.lang.String str31 = request29.getUrl();
        java.lang.Class<?> wildcardClass32 = request29.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", headerList8, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getMethod();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.Class<?> wildcardClass15 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.lang.String str14 = request12.getUrl();
        java.util.List<retrofit.client.Header> headerList15 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList15, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList15, typedOutput20);
        java.lang.Class<?> wildcardClass22 = request21.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = request13.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request13.getHeaders();
        java.lang.String str16 = request13.getUrl();
        java.lang.String str17 = request13.getUrl();
        java.lang.Class<?> wildcardClass18 = request13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getUrl();
        java.lang.String str25 = request22.getUrl();
        retrofit.mime.TypedOutput typedOutput26 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput27 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput28 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList29 = request22.getHeaders();
        java.lang.Class<?> wildcardClass30 = headerList29.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.getMethod();
        java.lang.Class<?> wildcardClass10 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = request13.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request13.getHeaders();
        java.lang.Class<?> wildcardClass16 = request13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.util.List<retrofit.client.Header> headerList14 = null;
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", headerList14, typedOutput15);
        java.lang.String str17 = request16.getMethod();
        java.lang.String str18 = request16.getUrl();
        java.lang.String str19 = request16.getMethod();
        retrofit.mime.TypedOutput typedOutput20 = request16.getBody();
        java.util.List<retrofit.client.Header> headerList21 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "", headerList21, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "hi!", headerList21, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "hi!", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", headerList21, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "", headerList21, typedOutput32);
        java.lang.Class<?> wildcardClass34 = headerList21.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", headerList8, typedOutput9);
        java.lang.String str11 = request10.getMethod();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getMethod();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "", headerList15, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "hi!", headerList15, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.getHeaders();
        java.lang.String str23 = request21.getUrl();
        java.util.List<retrofit.client.Header> headerList24 = request21.getHeaders();
        java.lang.Class<?> wildcardClass25 = request21.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.lang.Class<?> wildcardClass10 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.lang.String str24 = request22.getMethod();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "hi!", headerList25, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "", headerList25, typedOutput28);
        java.util.List<retrofit.client.Header> headerList30 = request29.getHeaders();
        java.lang.Class<?> wildcardClass31 = request29.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", headerList12, typedOutput13);
        java.lang.Class<?> wildcardClass15 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        java.lang.Class<?> wildcardClass20 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        java.lang.String str25 = request22.getMethod();
        retrofit.mime.TypedOutput typedOutput26 = request22.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = typedOutput26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(typedOutput26);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        java.lang.String str16 = request14.getUrl();
        retrofit.mime.TypedOutput typedOutput17 = request14.getBody();
        java.util.List<retrofit.client.Header> headerList18 = request14.getHeaders();
        java.lang.String str19 = request14.getUrl();
        java.lang.String str20 = request14.getUrl();
        java.util.List<retrofit.client.Header> headerList21 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "hi!", headerList21, typedOutput24);
        java.lang.Class<?> wildcardClass26 = headerList21.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getMethod();
        java.lang.String str10 = request8.getUrl();
        java.lang.String str11 = request8.getMethod();
        retrofit.mime.TypedOutput typedOutput12 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "", headerList13, typedOutput16);
        java.lang.Class<?> wildcardClass18 = headerList13.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput13 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList14 = request10.getHeaders();
        java.lang.String str15 = request10.getUrl();
        java.lang.String str16 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList17 = request10.getHeaders();
        java.lang.String str18 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput19 = request10.getBody();
        java.lang.Class<?> wildcardClass20 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.lang.String str12 = request8.getUrl();
        retrofit.mime.TypedOutput typedOutput13 = request8.getBody();
        java.lang.String str14 = request8.getUrl();
        retrofit.mime.TypedOutput typedOutput15 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList16 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", headerList16, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", headerList16, typedOutput19);
        java.lang.Class<?> wildcardClass21 = request20.getClass();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        retrofit.mime.TypedOutput typedOutput22 = request20.getBody();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.util.List<retrofit.client.Header> headerList26 = request25.getHeaders();
        retrofit.mime.TypedOutput typedOutput27 = request25.getBody();
        java.lang.String str28 = request25.getUrl();
        java.lang.Class<?> wildcardClass29 = request25.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        java.lang.Class<?> wildcardClass19 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = request6.getBody();
        java.lang.String str14 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList15 = request6.getHeaders();
        java.lang.Class<?> wildcardClass16 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getUrl();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList26 = request22.getHeaders();
        java.lang.Class<?> wildcardClass27 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.lang.Class<?> wildcardClass9 = headerList8.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.lang.String str8 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput12 = request4.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = typedOutput12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.getMethod();
        java.lang.String str10 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        java.lang.String str12 = request4.getMethod();
        java.lang.Class<?> wildcardClass13 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        java.lang.String str11 = request4.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", headerList8, typedOutput9);
        java.lang.Class<?> wildcardClass11 = request10.getClass();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        java.lang.Class<?> wildcardClass8 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", headerList8, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "", headerList13, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput18);
        java.lang.String str20 = request19.getMethod();
        java.lang.Class<?> wildcardClass21 = request19.getClass();
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = request15.getBody();
        java.lang.String str17 = request15.getUrl();
        java.lang.String str18 = request15.getUrl();
        java.util.List<retrofit.client.Header> headerList19 = request15.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "hi!", headerList19, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.getHeaders();
        java.lang.Class<?> wildcardClass23 = request21.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getMethod();
        java.lang.String str10 = request8.getUrl();
        java.lang.String str11 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "", headerList13, typedOutput16);
        java.lang.Class<?> wildcardClass18 = request17.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.Class<?> wildcardClass16 = headerList15.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        retrofit.mime.TypedOutput typedOutput22 = request20.getBody();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "", headerList24, typedOutput25);
        java.lang.Class<?> wildcardClass27 = headerList24.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.getUrl();
        java.lang.String str9 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        java.lang.Class<?> wildcardClass11 = headerList10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        java.util.List<retrofit.client.Header> headerList16 = request14.getHeaders();
        java.lang.String str17 = request14.getUrl();
        java.lang.Class<?> wildcardClass18 = request14.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.String str11 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        java.lang.Class<?> wildcardClass13 = headerList12.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", headerList8, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", headerList14, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", headerList14, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", headerList14, typedOutput19);
        java.util.List<retrofit.client.Header> headerList21 = request20.getHeaders();
        java.lang.Class<?> wildcardClass22 = request20.getClass();
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList26 = request22.getHeaders();
        java.lang.Class<?> wildcardClass27 = headerList26.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.Class<?> wildcardClass16 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = request10.getBody();
        java.lang.String str13 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = typedOutput14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(typedOutput14);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = request12.getBody();
        java.lang.String str15 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        java.lang.Class<?> wildcardClass20 = request19.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getUrl();
        java.lang.String str25 = request22.getUrl();
        retrofit.mime.TypedOutput typedOutput26 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput27 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList28 = request22.getHeaders();
        java.lang.Class<?> wildcardClass29 = headerList28.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.String str11 = request10.getMethod();
        java.lang.String str12 = request10.getMethod();
        java.lang.String str13 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList14 = request10.getHeaders();
        java.lang.Class<?> wildcardClass15 = headerList14.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList26 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList27 = request22.getHeaders();
        java.lang.String str28 = request22.getMethod();
        java.lang.String str29 = request22.getMethod();
        java.lang.String str30 = request22.getMethod();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.lang.String str8 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        java.lang.Class<?> wildcardClass11 = headerList10.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.util.List<retrofit.client.Header> headerList26 = request25.getHeaders();
        java.lang.Class<?> wildcardClass27 = request25.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request6.getHeaders();
        java.lang.Class<?> wildcardClass14 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        java.lang.String str16 = request14.getUrl();
        java.util.List<retrofit.client.Header> headerList17 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList17, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "", headerList17, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.lang.Class<?> wildcardClass27 = request25.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.getHeaders();
        java.lang.String str15 = request13.getMethod();
        retrofit.mime.TypedOutput typedOutput16 = request13.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = typedOutput16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(typedOutput16);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.getUrl();
        java.lang.String str9 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        java.lang.String str25 = request22.getUrl();
        java.lang.Class<?> wildcardClass26 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.lang.String str20 = request18.getUrl();
        java.util.List<retrofit.client.Header> headerList21 = request18.getHeaders();
        java.lang.String str22 = request18.getUrl();
        java.lang.Class<?> wildcardClass23 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.getUrl();
        java.lang.String str9 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        java.lang.Class<?> wildcardClass11 = headerList10.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", headerList10, typedOutput11);
        java.lang.Class<?> wildcardClass13 = request12.getClass();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "hi!", headerList11, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = request15.getBody();
        java.lang.Class<?> wildcardClass17 = request15.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "", headerList11, typedOutput14);
        java.lang.Class<?> wildcardClass16 = request15.getClass();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.String str16 = request14.getUrl();
        java.lang.String str17 = request14.getMethod();
        retrofit.mime.TypedOutput typedOutput18 = request14.getBody();
        java.util.List<retrofit.client.Header> headerList19 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "hi!", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", headerList19, typedOutput22);
        java.lang.Class<?> wildcardClass24 = headerList19.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.lang.String str20 = request18.getMethod();
        java.util.List<retrofit.client.Header> headerList21 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = request18.getBody();
        java.util.List<retrofit.client.Header> headerList23 = request18.getHeaders();
        java.lang.String str24 = request18.getMethod();
        retrofit.mime.TypedOutput typedOutput25 = request18.getBody();
        java.lang.Class<?> wildcardClass26 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        java.lang.String str12 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput13 = request10.getBody();
        java.lang.String str14 = request10.getUrl();
        java.lang.String str15 = request10.getUrl();
        java.lang.Class<?> wildcardClass16 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getMethod();
        java.lang.String str10 = request8.getUrl();
        java.lang.String str11 = request8.getMethod();
        retrofit.mime.TypedOutput typedOutput12 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "hi!", headerList14, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", headerList14, typedOutput17);
        java.lang.Class<?> wildcardClass19 = headerList14.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        retrofit.mime.TypedOutput typedOutput26 = request24.getBody();
        retrofit.mime.TypedOutput typedOutput27 = request24.getBody();
        java.lang.String str28 = request24.getUrl();
        java.util.List<retrofit.client.Header> headerList29 = request24.getHeaders();
        java.util.List<retrofit.client.Header> headerList30 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("hi!", "hi!", headerList30, typedOutput31);
        java.lang.String str33 = request32.getUrl();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.lang.String str14 = request12.getUrl();
        java.lang.String str15 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "", headerList17, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = request23.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = typedOutput24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNull(typedOutput24);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.lang.String str13 = request12.getMethod();
        java.lang.String str14 = request12.getUrl();
        java.lang.String str15 = request12.getMethod();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", headerList17, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "hi!", headerList17, typedOutput24);
        java.util.List<retrofit.client.Header> headerList26 = request25.getHeaders();
        java.lang.Class<?> wildcardClass27 = request25.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getMethod();
        java.lang.String str10 = request8.getUrl();
        java.lang.String str11 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList12, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", headerList12, typedOutput15);
        java.lang.Class<?> wildcardClass17 = headerList12.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getMethod();
        java.lang.Class<?> wildcardClass25 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getUrl();
        java.lang.String str10 = request6.getUrl();
        java.lang.String str11 = request6.getUrl();
        java.lang.Class<?> wildcardClass12 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.lang.Class<?> wildcardClass23 = headerList11.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput16);
        java.lang.Class<?> wildcardClass18 = headerList13.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        java.lang.String str12 = request4.getUrl();
        java.lang.String str13 = request4.getMethod();
        java.lang.Class<?> wildcardClass14 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.getMethod();
        java.lang.String str7 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.String str10 = request4.getMethod();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        java.lang.String str24 = request20.getUrl();
        retrofit.mime.TypedOutput typedOutput25 = request20.getBody();
        java.lang.String str26 = request20.getUrl();
        java.util.List<retrofit.client.Header> headerList27 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "hi!", headerList27, typedOutput28);
        java.lang.Class<?> wildcardClass30 = request29.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.util.List<retrofit.client.Header> headerList20 = request18.getHeaders();
        java.lang.Class<?> wildcardClass21 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.getHeaders();
        java.lang.String str15 = request13.getMethod();
        retrofit.mime.TypedOutput typedOutput16 = request13.getBody();
        java.lang.Class<?> wildcardClass17 = request13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getUrl();
        java.lang.String str11 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList12, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.lang.String str16 = request14.getUrl();
        java.lang.String str17 = request14.getUrl();
        java.util.List<retrofit.client.Header> headerList18 = request14.getHeaders();
        java.lang.Class<?> wildcardClass19 = request14.getClass();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.lang.String str9 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.lang.String str11 = request8.getUrl();
        retrofit.mime.TypedOutput typedOutput12 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList16 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", headerList16, typedOutput17);
        java.util.List<retrofit.client.Header> headerList19 = request18.getHeaders();
        java.lang.Class<?> wildcardClass20 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.Class<?> wildcardClass8 = headerList7.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        java.lang.String str13 = request12.getUrl();
        java.util.List<retrofit.client.Header> headerList14 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", headerList14, typedOutput15);
        java.lang.Class<?> wildcardClass17 = request16.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.lang.String str13 = request12.getMethod();
        java.lang.String str14 = request12.getUrl();
        java.lang.String str15 = request12.getMethod();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("hi!", "", headerList17, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", headerList17, typedOutput22);
        java.util.List<retrofit.client.Header> headerList24 = request23.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "", headerList24, typedOutput25);
        java.lang.Class<?> wildcardClass27 = headerList24.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput11 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput12 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput16);
        java.lang.Class<?> wildcardClass18 = headerList13.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.lang.String str24 = request22.getMethod();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "hi!", headerList25, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "hi!", headerList28, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.getHeaders();
        retrofit.mime.TypedOutput typedOutput32 = request30.getBody();
        java.lang.String str33 = request30.getMethod();
        java.lang.Class<?> wildcardClass34 = request30.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNull(typedOutput32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(wildcardClass34);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.Class<?> wildcardClass15 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.lang.String str24 = request22.getMethod();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList26 = request22.getHeaders();
        java.lang.Class<?> wildcardClass27 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.Class<?> wildcardClass11 = headerList5.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.lang.String str12 = request8.getUrl();
        java.lang.String str13 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList14 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "hi!", headerList14, typedOutput15);
        java.lang.String str17 = request16.getMethod();
        java.util.List<retrofit.client.Header> headerList18 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", headerList18, typedOutput19);
        java.lang.String str21 = request20.getMethod();
        java.lang.Class<?> wildcardClass22 = request20.getClass();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        java.lang.String str25 = request22.getMethod();
        retrofit.mime.TypedOutput typedOutput26 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList27 = request22.getHeaders();
        java.lang.Class<?> wildcardClass28 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.util.List<retrofit.client.Header> headerList20 = request18.getHeaders();
        java.lang.Class<?> wildcardClass21 = headerList20.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        retrofit.mime.TypedOutput typedOutput26 = request24.getBody();
        retrofit.mime.TypedOutput typedOutput27 = request24.getBody();
        java.lang.String str28 = request24.getUrl();
        java.util.List<retrofit.client.Header> headerList29 = request24.getHeaders();
        java.util.List<retrofit.client.Header> headerList30 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "hi!", headerList30, typedOutput31);
        java.lang.String str33 = request32.getUrl();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        java.lang.Class<?> wildcardClass14 = request13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", headerList12, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.util.List<retrofit.client.Header> headerList16 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", headerList16, typedOutput17);
        java.lang.Class<?> wildcardClass19 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.lang.String str24 = request22.getMethod();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "hi!", headerList25, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", headerList28, typedOutput29);
        java.util.List<retrofit.client.Header> headerList31 = request30.getHeaders();
        java.lang.Class<?> wildcardClass32 = request30.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.lang.String str11 = request6.getMethod();
        java.lang.String str12 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList13 = request6.getHeaders();
        java.lang.Class<?> wildcardClass14 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.getMethod();
        java.lang.String str7 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typedOutput10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = request16.getBody();
        retrofit.mime.TypedOutput typedOutput18 = request16.getBody();
        java.lang.String str19 = request16.getMethod();
        java.util.List<retrofit.client.Header> headerList20 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", headerList20, typedOutput21);
        java.lang.Class<?> wildcardClass23 = headerList20.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getUrl();
        java.lang.String str16 = request14.getMethod();
        java.lang.String str17 = request14.getUrl();
        java.lang.Class<?> wildcardClass18 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        java.lang.String str8 = request4.getMethod();
        java.lang.String str9 = request4.getMethod();
        java.lang.Class<?> wildcardClass10 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.lang.String str14 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput15 = request12.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        java.lang.String str20 = request19.getUrl();
        retrofit.mime.TypedOutput typedOutput21 = request19.getBody();
        retrofit.mime.TypedOutput typedOutput22 = request19.getBody();
        java.lang.String str23 = request19.getMethod();
        retrofit.mime.TypedOutput typedOutput24 = request19.getBody();
        java.lang.Class<?> wildcardClass25 = request19.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request14.getBody();
        java.lang.String str17 = request14.getUrl();
        java.lang.String str18 = request14.getMethod();
        java.lang.Class<?> wildcardClass19 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getUrl();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.lang.String str11 = request6.getMethod();
        java.lang.String str12 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList13 = request6.getHeaders();
        java.lang.Class<?> wildcardClass14 = headerList13.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        retrofit.mime.TypedOutput typedOutput26 = request24.getBody();
        retrofit.mime.TypedOutput typedOutput27 = request24.getBody();
        java.util.List<retrofit.client.Header> headerList28 = request24.getHeaders();
        java.util.List<retrofit.client.Header> headerList29 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "hi!", headerList29, typedOutput30);
        java.lang.Class<?> wildcardClass32 = headerList29.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getUrl();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput26 = request22.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = typedOutput26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNull(typedOutput26);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        java.util.List<retrofit.client.Header> headerList18 = request16.getHeaders();
        java.util.List<retrofit.client.Header> headerList19 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList19, typedOutput20);
        java.lang.Class<?> wildcardClass22 = request21.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        java.lang.String str17 = request16.getMethod();
        java.util.List<retrofit.client.Header> headerList18 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", headerList18, typedOutput19);
        java.lang.Class<?> wildcardClass21 = request20.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        java.util.List<retrofit.client.Header> headerList9 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "", headerList9, typedOutput10);
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "", headerList9, typedOutput12);
        java.lang.Class<?> wildcardClass14 = headerList9.getClass();
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        java.lang.Class<?> wildcardClass14 = headerList13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getMethod();
        java.lang.String str11 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList12, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.lang.String str16 = request14.getUrl();
        java.util.List<retrofit.client.Header> headerList17 = request14.getHeaders();
        java.lang.Class<?> wildcardClass18 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getUrl();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList26 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput27 = request22.getBody();
        java.lang.String str28 = request22.getUrl();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        retrofit.mime.TypedOutput typedOutput22 = request20.getBody();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getMethod();
        java.lang.Class<?> wildcardClass28 = request26.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.lang.String str12 = request8.getUrl();
        java.lang.String str13 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList14 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", headerList14, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", headerList14, typedOutput17);
        java.lang.String str19 = request18.getUrl();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", headerList8, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "", headerList13, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput18);
        java.lang.Class<?> wildcardClass20 = headerList13.getClass();
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        retrofit.mime.TypedOutput typedOutput12 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "", headerList13, typedOutput16);
        java.lang.Class<?> wildcardClass18 = headerList13.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.getMethod();
        java.lang.String str10 = request4.getMethod();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.lang.String str23 = request22.getUrl();
        java.lang.String str24 = request22.getMethod();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.getUrl();
        java.lang.String str9 = request4.getMethod();
        java.lang.String str10 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        java.lang.Class<?> wildcardClass12 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.lang.String str23 = request22.getMethod();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        java.lang.String str25 = request22.getMethod();
        retrofit.mime.TypedOutput typedOutput26 = request22.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass27 = typedOutput26.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(typedOutput26);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = null;
        retrofit.client.Request request11 = new retrofit.client.Request("hi!", "hi!", headerList9, typedOutput10);
        java.util.List<retrofit.client.Header> headerList12 = request11.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = request11.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = typedOutput13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNull(typedOutput13);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = request10.getBody();
        java.lang.String str13 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.lang.String str15 = request10.getMethod();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        java.lang.String str26 = request24.getMethod();
        java.util.List<retrofit.client.Header> headerList27 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "hi!", headerList27, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("hi!", "hi!", headerList27, typedOutput30);
        java.util.List<retrofit.client.Header> headerList32 = request31.getHeaders();
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "", headerList32, typedOutput33);
        java.lang.String str35 = request34.getMethod();
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.getUrl();
        java.lang.String str10 = request4.getMethod();
        java.lang.String str11 = request4.getUrl();
        java.lang.Class<?> wildcardClass12 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", headerList8, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", headerList14, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", headerList14, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", headerList14, typedOutput19);
        java.lang.String str21 = request20.getMethod();
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.lang.String str13 = request12.getMethod();
        java.lang.String str14 = request12.getUrl();
        java.lang.String str15 = request12.getMethod();
        java.util.List<retrofit.client.Header> headerList16 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", headerList16, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", headerList16, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", headerList16, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "", headerList16, typedOutput23);
        java.lang.Class<?> wildcardClass25 = request24.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typedOutput11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.Class<?> wildcardClass16 = headerList15.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        java.util.List<retrofit.client.Header> headerList26 = request24.getHeaders();
        java.util.List<retrofit.client.Header> headerList27 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", headerList27, typedOutput28);
        java.lang.Class<?> wildcardClass30 = request29.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        retrofit.mime.TypedOutput typedOutput26 = request24.getBody();
        retrofit.mime.TypedOutput typedOutput27 = request24.getBody();
        java.lang.String str28 = request24.getUrl();
        java.util.List<retrofit.client.Header> headerList29 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", headerList29, typedOutput30);
        java.lang.Class<?> wildcardClass32 = headerList29.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.getMethod();
        java.lang.String str7 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass11 = typedOutput10.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput6 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput7 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.String str10 = request4.getMethod();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(typedOutput6);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        java.util.List<retrofit.client.Header> headerList12 = null;
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", headerList12, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.lang.String str16 = request14.getUrl();
        java.lang.String str17 = request14.getMethod();
        retrofit.mime.TypedOutput typedOutput18 = request14.getBody();
        java.util.List<retrofit.client.Header> headerList19 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList19, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("hi!", "", headerList19, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "hi!", headerList19, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "hi!", headerList19, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", headerList19, typedOutput28);
        java.lang.Class<?> wildcardClass30 = request29.getClass();
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(headerList19);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getUrl();
        java.lang.String str25 = request22.getUrl();
        retrofit.mime.TypedOutput typedOutput26 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput27 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput28 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput29 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput30 = request22.getBody();
        java.lang.String str31 = request22.getUrl();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertNull(typedOutput29);
        org.junit.Assert.assertNull(typedOutput30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", headerList8, typedOutput9);
        java.lang.String str11 = request10.getMethod();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getMethod();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "", headerList15, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList15, typedOutput20);
        java.lang.String str22 = request21.getUrl();
        java.lang.Class<?> wildcardClass23 = request21.getClass();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.getHeaders();
        java.util.List<retrofit.client.Header> headerList26 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput27 = request24.getBody();
        java.lang.String str28 = request24.getMethod();
        java.util.List<retrofit.client.Header> headerList29 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "hi!", headerList29, typedOutput30);
        java.util.List<retrofit.client.Header> headerList32 = request31.getHeaders();
        java.lang.Class<?> wildcardClass33 = request31.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        java.util.List<retrofit.client.Header> headerList7 = request6.getHeaders();
        java.lang.String str8 = request6.getUrl();
        java.lang.String str9 = request6.getMethod();
        java.lang.String str10 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        java.lang.String str14 = request13.getUrl();
        java.lang.String str15 = request13.getUrl();
        java.lang.String str16 = request13.getUrl();
        java.lang.String str17 = request13.getUrl();
        java.lang.Class<?> wildcardClass18 = request13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        retrofit.mime.TypedOutput typedOutput10 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        retrofit.mime.TypedOutput typedOutput12 = request4.getBody();
        java.lang.String str13 = request4.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        java.lang.String str24 = request20.getUrl();
        retrofit.mime.TypedOutput typedOutput25 = request20.getBody();
        java.lang.String str26 = request20.getUrl();
        java.util.List<retrofit.client.Header> headerList27 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "hi!", headerList27, typedOutput28);
        java.util.List<retrofit.client.Header> headerList30 = request29.getHeaders();
        java.lang.Class<?> wildcardClass31 = request29.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.lang.String str9 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.lang.Class<?> wildcardClass11 = request6.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList10, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.String str16 = request14.getMethod();
        java.lang.Class<?> wildcardClass17 = request14.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.lang.String str8 = request4.getMethod();
        java.lang.Class<?> wildcardClass9 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.lang.String str14 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput15 = request12.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        java.lang.String str20 = request19.getUrl();
        retrofit.mime.TypedOutput typedOutput21 = request19.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass22 = typedOutput21.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(typedOutput21);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        retrofit.mime.TypedOutput typedOutput26 = request24.getBody();
        java.util.List<retrofit.client.Header> headerList27 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", headerList27, typedOutput28);
        java.util.List<retrofit.client.Header> headerList30 = request29.getHeaders();
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("hi!", "hi!", headerList30, typedOutput31);
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("", "", headerList30, typedOutput33);
        java.lang.Class<?> wildcardClass35 = request34.getClass();
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.getHeaders();
        java.lang.String str26 = request24.getUrl();
        java.util.List<retrofit.client.Header> headerList27 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "hi!", headerList27, typedOutput28);
        java.lang.Class<?> wildcardClass30 = request29.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput13 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList14 = request10.getHeaders();
        java.lang.String str15 = request10.getUrl();
        java.lang.String str16 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList17 = request10.getHeaders();
        java.lang.Class<?> wildcardClass18 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        java.lang.String str14 = request12.getUrl();
        java.lang.String str15 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        java.lang.Class<?> wildcardClass20 = headerList17.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.util.List<retrofit.client.Header> headerList16 = request14.getHeaders();
        java.lang.Class<?> wildcardClass17 = headerList16.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.lang.String str24 = request22.getMethod();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("", "", headerList25, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = request29.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass31 = typedOutput30.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNull(typedOutput30);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList10, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        java.lang.Class<?> wildcardClass16 = request14.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getUrl();
        java.lang.String str25 = request22.getUrl();
        retrofit.mime.TypedOutput typedOutput26 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput27 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput28 = request22.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass29 = typedOutput28.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNull(typedOutput28);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = typedOutput23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.lang.String str14 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput15 = request12.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "", headerList17, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = request19.getBody();
        retrofit.mime.TypedOutput typedOutput22 = request19.getBody();
        retrofit.mime.TypedOutput typedOutput23 = request19.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = typedOutput23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertNull(typedOutput23);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.lang.Class<?> wildcardClass23 = headerList11.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.lang.String str8 = request4.getMethod();
        java.lang.Class<?> wildcardClass9 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.lang.String str8 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput9 = request4.getBody();
        java.lang.String str10 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typedOutput11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(typedOutput11);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        java.lang.String str9 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", headerList10, typedOutput13);
        java.lang.Class<?> wildcardClass15 = headerList10.getClass();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        retrofit.mime.TypedOutput typedOutput20 = request18.getBody();
        retrofit.mime.TypedOutput typedOutput21 = request18.getBody();
        java.util.List<retrofit.client.Header> headerList22 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput23 = request18.getBody();
        java.lang.String str24 = request18.getMethod();
        java.lang.Class<?> wildcardClass25 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request14.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass17 = typedOutput16.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.getMethod();
        java.lang.String str7 = request4.getUrl();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        java.lang.Class<?> wildcardClass12 = headerList11.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = request15.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request15.getHeaders();
        java.lang.Class<?> wildcardClass18 = request15.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.getUrl();
        java.lang.String str10 = request4.getMethod();
        java.lang.String str11 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput12 = request4.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass13 = typedOutput12.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(typedOutput12);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", headerList8, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", headerList14, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", headerList14, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", headerList14, typedOutput19);
        java.lang.Class<?> wildcardClass21 = headerList14.getClass();
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "", headerList24, typedOutput25);
        java.lang.String str27 = request26.getUrl();
        java.lang.String str28 = request26.getMethod();
        java.util.List<retrofit.client.Header> headerList29 = request26.getHeaders();
        java.lang.Class<?> wildcardClass30 = request26.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.lang.String str26 = request22.getUrl();
        java.util.List<retrofit.client.Header> headerList27 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList28 = request22.getHeaders();
        java.lang.String str29 = request22.getUrl();
        java.lang.String str30 = request22.getUrl();
        java.lang.String str31 = request22.getUrl();
        java.lang.Class<?> wildcardClass32 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.lang.String str12 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", headerList14, typedOutput15);
        java.util.List<retrofit.client.Header> headerList17 = request16.getHeaders();
        java.lang.Class<?> wildcardClass18 = headerList17.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.lang.String str12 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", headerList14, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = request16.getBody();
        java.lang.String str18 = request16.getMethod();
        java.lang.Class<?> wildcardClass19 = request16.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", headerList4, typedOutput5);
        java.lang.String str7 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput9 = request6.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        java.lang.Class<?> wildcardClass14 = request13.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.Class<?> wildcardClass15 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        java.lang.String str14 = request12.getUrl();
        java.lang.String str15 = request12.getUrl();
        retrofit.mime.TypedOutput typedOutput16 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "", headerList17, typedOutput18);
        java.util.List<retrofit.client.Header> headerList20 = request19.getHeaders();
        java.lang.String str21 = request19.getMethod();
        retrofit.mime.TypedOutput typedOutput22 = request19.getBody();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(typedOutput22);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.lang.String str9 = request4.getMethod();
        java.lang.String str10 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput11 = request4.getBody();
        java.lang.String str12 = request4.getMethod();
        java.lang.String str13 = request4.getMethod();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput25 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList26 = request22.getHeaders();
        java.util.List<retrofit.client.Header> headerList27 = request22.getHeaders();
        java.lang.Class<?> wildcardClass28 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        java.lang.String str8 = request6.getMethod();
        java.lang.String str9 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        java.util.List<retrofit.client.Header> headerList14 = request13.getHeaders();
        java.lang.Class<?> wildcardClass15 = request13.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        retrofit.mime.TypedOutput typedOutput20 = request18.getBody();
        retrofit.mime.TypedOutput typedOutput21 = request18.getBody();
        java.lang.String str22 = request18.getMethod();
        java.lang.Class<?> wildcardClass23 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "hi!", headerList11, typedOutput12);
        java.lang.String str14 = request13.getMethod();
        java.lang.String str15 = request13.getMethod();
        retrofit.mime.TypedOutput typedOutput16 = request13.getBody();
        java.lang.Class<?> wildcardClass17 = request13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.util.List<retrofit.client.Header> headerList14 = null;
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", headerList14, typedOutput15);
        java.lang.String str17 = request16.getMethod();
        java.lang.String str18 = request16.getUrl();
        java.lang.String str19 = request16.getMethod();
        retrofit.mime.TypedOutput typedOutput20 = request16.getBody();
        java.util.List<retrofit.client.Header> headerList21 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "", headerList21, typedOutput22);
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "", headerList21, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "hi!", headerList21, typedOutput26);
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "hi!", headerList21, typedOutput28);
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", headerList21, typedOutput30);
        retrofit.mime.TypedOutput typedOutput32 = null;
        retrofit.client.Request request33 = new retrofit.client.Request("hi!", "", headerList21, typedOutput32);
        java.util.List<retrofit.client.Header> headerList34 = request33.getHeaders();
        java.lang.Class<?> wildcardClass35 = headerList34.getClass();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(headerList34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.lang.String str16 = request14.getMethod();
        java.lang.Class<?> wildcardClass17 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = request16.getBody();
        retrofit.mime.TypedOutput typedOutput18 = request16.getBody();
        java.lang.String str19 = request16.getMethod();
        java.util.List<retrofit.client.Header> headerList20 = request16.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", headerList20, typedOutput21);
        java.lang.String str23 = request22.getMethod();
        java.lang.String str24 = request22.getMethod();
        java.lang.Class<?> wildcardClass25 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput25);
        java.lang.String str27 = request26.getMethod();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        retrofit.mime.TypedOutput typedOutput12 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "hi!", headerList13, typedOutput14);
        java.util.List<retrofit.client.Header> headerList16 = request15.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", headerList16, typedOutput17);
        java.lang.Class<?> wildcardClass19 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", headerList8, typedOutput9);
        java.lang.String str11 = request10.getMethod();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getMethod();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "", headerList15, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "hi!", headerList15, typedOutput20);
        java.util.List<retrofit.client.Header> headerList22 = request21.getHeaders();
        java.lang.String str23 = request21.getUrl();
        retrofit.mime.TypedOutput typedOutput24 = request21.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass25 = typedOutput24.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNull(typedOutput24);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList10 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "hi!", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", headerList10, typedOutput13);
        java.lang.String str15 = request14.getUrl();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.lang.String str12 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList14 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", headerList14, typedOutput15);
        java.lang.String str17 = request16.getMethod();
        java.lang.Class<?> wildcardClass18 = request16.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        retrofit.client.Header[] headerArray16 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList17 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList17, headerArray16);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList17, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList17, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList17, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList17, typedOutput25);
        retrofit.mime.TypedOutput typedOutput27 = request26.getBody();
        retrofit.mime.TypedOutput typedOutput28 = request26.getBody();
        java.util.List<retrofit.client.Header> headerList29 = request26.getHeaders();
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", headerList29, typedOutput30);
        java.util.List<retrofit.client.Header> headerList32 = request31.getHeaders();
        retrofit.mime.TypedOutput typedOutput33 = null;
        retrofit.client.Request request34 = new retrofit.client.Request("hi!", "hi!", headerList32, typedOutput33);
        retrofit.mime.TypedOutput typedOutput35 = null;
        retrofit.client.Request request36 = new retrofit.client.Request("", "", headerList32, typedOutput35);
        retrofit.mime.TypedOutput typedOutput37 = null;
        retrofit.client.Request request38 = new retrofit.client.Request("", "", headerList32, typedOutput37);
        java.lang.Class<?> wildcardClass39 = headerList32.getClass();
        org.junit.Assert.assertNotNull(headerArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNotNull(wildcardClass39);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.util.List<retrofit.client.Header> headerList20 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput21 = request18.getBody();
        java.lang.String str22 = request18.getUrl();
        java.util.List<retrofit.client.Header> headerList23 = request18.getHeaders();
        java.lang.Class<?> wildcardClass24 = headerList23.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNotNull(headerList20);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getMethod();
        java.lang.String str11 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList12, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.lang.String str16 = request14.getUrl();
        java.util.List<retrofit.client.Header> headerList17 = request14.getHeaders();
        java.lang.String str18 = request14.getUrl();
        java.lang.String str19 = request14.getMethod();
        java.lang.Class<?> wildcardClass20 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.lang.String str11 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList12 = request10.getHeaders();
        java.lang.Class<?> wildcardClass13 = headerList12.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "hi!", headerList11, typedOutput14);
        java.lang.Class<?> wildcardClass16 = headerList11.getClass();
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        java.util.List<retrofit.client.Header> headerList13 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "", headerList13, typedOutput14);
        java.lang.Class<?> wildcardClass16 = headerList13.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request14.getBody();
        java.lang.Class<?> wildcardClass17 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = request14.getBody();
        java.util.List<retrofit.client.Header> headerList17 = request14.getHeaders();
        java.lang.Class<?> wildcardClass18 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertNotNull(headerList17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        java.lang.String str13 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request10.getHeaders();
        java.util.List<retrofit.client.Header> headerList16 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList18 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "", headerList18, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", headerList18, typedOutput21);
        java.lang.Class<?> wildcardClass23 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedOutput17);
        org.junit.Assert.assertNotNull(headerList18);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = request14.getBody();
        retrofit.mime.TypedOutput typedOutput16 = request14.getBody();
        java.lang.String str17 = request14.getUrl();
        retrofit.mime.TypedOutput typedOutput18 = request14.getBody();
        java.lang.Class<?> wildcardClass19 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(typedOutput15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(typedOutput18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass14 = typedOutput13.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput13);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", headerList6, typedOutput7);
        java.lang.String str9 = request8.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request8.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("hi!", "", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "hi!", headerList11, typedOutput14);
        java.lang.String str16 = request15.getUrl();
        java.lang.String str17 = request15.getUrl();
        retrofit.mime.TypedOutput typedOutput18 = request15.getBody();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNull(typedOutput18);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        retrofit.mime.TypedOutput typedOutput8 = request4.getBody();
        java.util.List<retrofit.client.Header> headerList9 = request4.getHeaders();
        java.lang.String str10 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        java.lang.Class<?> wildcardClass12 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(typedOutput8);
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        retrofit.mime.TypedOutput typedOutput24 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "hi!", headerList28, typedOutput29);
        java.lang.Class<?> wildcardClass31 = request30.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNull(typedOutput24);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = request12.getBody();
        java.lang.Class<?> wildcardClass14 = request12.getClass();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "", headerList12, typedOutput13);
        java.lang.Class<?> wildcardClass15 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.util.List<retrofit.client.Header> headerList10 = null;
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", headerList10, typedOutput11);
        java.lang.String str13 = request12.getMethod();
        retrofit.mime.TypedOutput typedOutput14 = request12.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request12.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "", headerList15, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("", "hi!", headerList15, typedOutput18);
        retrofit.mime.TypedOutput typedOutput20 = null;
        retrofit.client.Request request21 = new retrofit.client.Request("", "", headerList15, typedOutput20);
        retrofit.mime.TypedOutput typedOutput22 = null;
        retrofit.client.Request request23 = new retrofit.client.Request("", "hi!", headerList15, typedOutput22);
        java.lang.Class<?> wildcardClass24 = headerList15.getClass();
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", headerList8, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        java.lang.String str14 = request10.getUrl();
        java.lang.String str15 = request10.getUrl();
        java.util.List<retrofit.client.Header> headerList16 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", headerList16, typedOutput17);
        java.lang.String str19 = request18.getMethod();
        java.lang.String str20 = request18.getUrl();
        retrofit.mime.TypedOutput typedOutput21 = request18.getBody();
        java.util.List<retrofit.client.Header> headerList22 = request18.getHeaders();
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "", headerList22, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "hi!", headerList22, typedOutput25);
        java.lang.Class<?> wildcardClass27 = headerList22.getClass();
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.String str24 = request22.getUrl();
        java.lang.Class<?> wildcardClass25 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        java.util.List<retrofit.client.Header> headerList24 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput25 = null;
        retrofit.client.Request request26 = new retrofit.client.Request("", "", headerList24, typedOutput25);
        java.lang.Class<?> wildcardClass27 = headerList24.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        java.lang.String str9 = request6.getMethod();
        retrofit.mime.TypedOutput typedOutput10 = request6.getBody();
        java.util.List<retrofit.client.Header> headerList11 = request6.getHeaders();
        java.lang.Class<?> wildcardClass12 = headerList11.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(typedOutput10);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.util.List<retrofit.client.Header> headerList24 = request22.getHeaders();
        java.lang.Class<?> wildcardClass25 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertNotNull(headerList24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        retrofit.client.Header[] headerArray6 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList7 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList7, headerArray6);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList7, typedOutput13);
        java.util.List<retrofit.client.Header> headerList15 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput16 = request14.getBody();
        java.lang.String str17 = request14.getUrl();
        java.lang.Class<?> wildcardClass18 = request14.getClass();
        org.junit.Assert.assertNotNull(headerArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNull(typedOutput16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.util.List<retrofit.client.Header> headerList6 = null;
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("hi!", "hi!", headerList6, typedOutput7);
        java.lang.String str9 = request8.getUrl();
        java.lang.String str10 = request8.getMethod();
        java.lang.String str11 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request8.getHeaders();
        java.util.List<retrofit.client.Header> headerList13 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("", "hi!", headerList13, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = request17.getBody();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNull(typedOutput18);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.lang.String str20 = request18.getUrl();
        retrofit.mime.TypedOutput typedOutput21 = request18.getBody();
        java.util.List<retrofit.client.Header> headerList22 = request18.getHeaders();
        java.lang.Class<?> wildcardClass23 = headerList22.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass24 = typedOutput23.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "", headerList23, typedOutput24);
        java.util.List<retrofit.client.Header> headerList26 = request25.getHeaders();
        java.lang.Class<?> wildcardClass27 = headerList26.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        retrofit.mime.TypedOutput typedOutput20 = request18.getBody();
        java.lang.String str21 = request18.getMethod();
        retrofit.mime.TypedOutput typedOutput22 = request18.getBody();
        java.lang.Class<?> wildcardClass23 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertNull(typedOutput20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(typedOutput22);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getUrl();
        retrofit.mime.TypedOutput typedOutput13 = request10.getBody();
        retrofit.mime.TypedOutput typedOutput14 = request10.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass15 = typedOutput14.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(typedOutput13);
        org.junit.Assert.assertNull(typedOutput14);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.getMethod();
        java.lang.String str9 = request4.getUrl();
        java.lang.String str10 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList11 = request4.getHeaders();
        java.lang.Class<?> wildcardClass12 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass12 = typedOutput11.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput11);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getMethod();
        java.lang.String str8 = request4.getUrl();
        java.lang.Class<?> wildcardClass9 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "hi!", headerList23, typedOutput24);
        java.util.List<retrofit.client.Header> headerList26 = request25.getHeaders();
        java.lang.Class<?> wildcardClass27 = request25.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        java.lang.String str15 = request14.getUrl();
        java.util.List<retrofit.client.Header> headerList16 = request14.getHeaders();
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", headerList16, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", headerList16, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNull(typedOutput21);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("hi!", "hi!", headerList23, typedOutput24);
        retrofit.mime.TypedOutput typedOutput26 = request25.getBody();
        java.lang.String str27 = request25.getMethod();
        retrofit.mime.TypedOutput typedOutput28 = request25.getBody();
        java.util.List<retrofit.client.Header> headerList29 = request25.getHeaders();
        java.lang.Class<?> wildcardClass30 = request25.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNull(typedOutput26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(wildcardClass30);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList5, typedOutput9);
        java.util.List<retrofit.client.Header> headerList11 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = request10.getBody();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        java.lang.Class<?> wildcardClass14 = request10.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput12);
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        java.util.List<retrofit.client.Header> headerList23 = request22.getHeaders();
        java.lang.Class<?> wildcardClass24 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.util.List<retrofit.client.Header> headerList8 = null;
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "hi!", headerList8, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.String str12 = request10.getMethod();
        java.util.List<retrofit.client.Header> headerList13 = request10.getHeaders();
        retrofit.mime.TypedOutput typedOutput14 = null;
        retrofit.client.Request request15 = new retrofit.client.Request("", "hi!", headerList13, typedOutput14);
        retrofit.mime.TypedOutput typedOutput16 = null;
        retrofit.client.Request request17 = new retrofit.client.Request("hi!", "", headerList13, typedOutput16);
        retrofit.mime.TypedOutput typedOutput18 = null;
        retrofit.client.Request request19 = new retrofit.client.Request("hi!", "hi!", headerList13, typedOutput18);
        java.lang.String str20 = request19.getUrl();
        java.lang.Class<?> wildcardClass21 = request19.getClass();
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(headerList13);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getUrl();
        java.lang.String str11 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "hi!", headerList12, typedOutput13);
        java.lang.String str15 = request14.getMethod();
        java.util.List<retrofit.client.Header> headerList16 = request14.getHeaders();
        java.lang.Class<?> wildcardClass17 = headerList16.getClass();
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(headerList16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        java.util.List<retrofit.client.Header> headerList26 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput27 = request24.getBody();
        retrofit.mime.TypedOutput typedOutput28 = request24.getBody();
        java.util.List<retrofit.client.Header> headerList29 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput30 = null;
        retrofit.client.Request request31 = new retrofit.client.Request("", "", headerList29, typedOutput30);
        java.util.List<retrofit.client.Header> headerList32 = request31.getHeaders();
        java.lang.Class<?> wildcardClass33 = headerList32.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertNotNull(headerList26);
        org.junit.Assert.assertNull(typedOutput27);
        org.junit.Assert.assertNull(typedOutput28);
        org.junit.Assert.assertNotNull(headerList29);
        org.junit.Assert.assertNotNull(headerList32);
        org.junit.Assert.assertNotNull(wildcardClass33);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getMethod();
        java.lang.String str6 = request4.getUrl();
        java.lang.String str7 = request4.getUrl();
        java.lang.String str8 = request4.getUrl();
        java.lang.String str9 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList10 = request4.getHeaders();
        java.lang.Class<?> wildcardClass11 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getUrl();
        retrofit.mime.TypedOutput typedOutput23 = request20.getBody();
        java.lang.String str24 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList25 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("", "", headerList25, typedOutput26);
        java.lang.Class<?> wildcardClass28 = headerList25.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(wildcardClass28);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        java.lang.String str26 = request24.getMethod();
        java.util.List<retrofit.client.Header> headerList27 = request24.getHeaders();
        java.util.List<retrofit.client.Header> headerList28 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("hi!", "hi!", headerList28, typedOutput29);
        java.lang.Class<?> wildcardClass31 = headerList28.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.lang.String str24 = request22.getMethod();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "hi!", headerList25, typedOutput26);
        java.util.List<retrofit.client.Header> headerList28 = request27.getHeaders();
        retrofit.mime.TypedOutput typedOutput29 = null;
        retrofit.client.Request request30 = new retrofit.client.Request("", "", headerList28, typedOutput29);
        java.lang.String str31 = request30.getUrl();
        java.lang.Class<?> wildcardClass32 = request30.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(headerList28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        retrofit.client.Header[] headerArray4 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList5 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList5, headerArray4);
        retrofit.mime.TypedOutput typedOutput7 = null;
        retrofit.client.Request request8 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList5, typedOutput7);
        retrofit.mime.TypedOutput typedOutput9 = request8.getBody();
        java.lang.String str10 = request8.getUrl();
        java.util.List<retrofit.client.Header> headerList11 = request8.getHeaders();
        retrofit.mime.TypedOutput typedOutput12 = null;
        retrofit.client.Request request13 = new retrofit.client.Request("", "hi!", headerList11, typedOutput12);
        retrofit.mime.TypedOutput typedOutput14 = request13.getBody();
        java.util.List<retrofit.client.Header> headerList15 = request13.getHeaders();
        java.lang.Class<?> wildcardClass16 = request13.getClass();
        org.junit.Assert.assertNotNull(headerArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(typedOutput9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(headerList11);
        org.junit.Assert.assertNull(typedOutput14);
        org.junit.Assert.assertNotNull(headerList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("hi!", "hi!", headerList2, typedOutput3);
        retrofit.mime.TypedOutput typedOutput5 = request4.getBody();
        java.lang.String str6 = request4.getMethod();
        java.util.List<retrofit.client.Header> headerList7 = request4.getHeaders();
        java.util.List<retrofit.client.Header> headerList8 = request4.getHeaders();
        java.lang.Class<?> wildcardClass9 = request4.getClass();
        org.junit.Assert.assertNull(typedOutput5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(headerList7);
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.util.List<retrofit.client.Header> headerList10 = request6.getHeaders();
        java.lang.String str11 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList12 = request6.getHeaders();
        java.lang.String str13 = request6.getMethod();
        java.util.List<retrofit.client.Header> headerList14 = request6.getHeaders();
        java.lang.Class<?> wildcardClass15 = headerList14.getClass();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertNotNull(headerList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headerList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(headerList14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        retrofit.client.Header[] headerArray8 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList9 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList9, headerArray8);
        retrofit.mime.TypedOutput typedOutput11 = null;
        retrofit.client.Request request12 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput11);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList9, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList9, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = request18.getBody();
        java.lang.String str20 = request18.getMethod();
        java.util.List<retrofit.client.Header> headerList21 = request18.getHeaders();
        java.util.List<retrofit.client.Header> headerList22 = request18.getHeaders();
        java.util.List<retrofit.client.Header> headerList23 = request18.getHeaders();
        java.lang.Class<?> wildcardClass24 = request18.getClass();
        org.junit.Assert.assertNotNull(headerArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(typedOutput19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(headerList21);
        org.junit.Assert.assertNotNull(headerList22);
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.util.List<retrofit.client.Header> headerList2 = null;
        retrofit.mime.TypedOutput typedOutput3 = null;
        retrofit.client.Request request4 = new retrofit.client.Request("", "", headerList2, typedOutput3);
        java.lang.String str5 = request4.getUrl();
        java.lang.Class<?> wildcardClass6 = request4.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "hi!", headerList23, typedOutput24);
        java.lang.Class<?> wildcardClass26 = headerList23.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        retrofit.client.Header[] headerArray2 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList3 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList3, headerArray2);
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList3, typedOutput5);
        retrofit.mime.TypedOutput typedOutput7 = request6.getBody();
        java.lang.String str8 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList9 = request6.getHeaders();
        java.lang.String str10 = request6.getMethod();
        java.lang.String str11 = request6.getUrl();
        java.lang.String str12 = request6.getUrl();
        java.lang.String str13 = request6.getUrl();
        java.lang.String str14 = request6.getUrl();
        org.junit.Assert.assertNotNull(headerArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(typedOutput7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(headerList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = request20.getBody();
        java.lang.String str22 = request20.getMethod();
        java.util.List<retrofit.client.Header> headerList23 = request20.getHeaders();
        retrofit.mime.TypedOutput typedOutput24 = null;
        retrofit.client.Request request25 = new retrofit.client.Request("", "hi!", headerList23, typedOutput24);
        java.lang.String str26 = request25.getUrl();
        java.util.List<retrofit.client.Header> headerList27 = request25.getHeaders();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(headerList23);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(headerList27);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        retrofit.client.Header[] headerArray12 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList13 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList13, headerArray12);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList13, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("", "hi!", (java.util.List<retrofit.client.Header>) headerList13, typedOutput23);
        java.util.List<retrofit.client.Header> headerList25 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput26 = null;
        retrofit.client.Request request27 = new retrofit.client.Request("hi!", "", headerList25, typedOutput26);
        java.lang.String str28 = request27.getUrl();
        retrofit.mime.TypedOutput typedOutput29 = request27.getBody();
        retrofit.mime.TypedOutput typedOutput30 = request27.getBody();
        java.util.List<retrofit.client.Header> headerList31 = request27.getHeaders();
        java.lang.Class<?> wildcardClass32 = request27.getClass();
        org.junit.Assert.assertNotNull(headerArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNull(typedOutput29);
        org.junit.Assert.assertNull(typedOutput30);
        org.junit.Assert.assertNotNull(headerList31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        retrofit.client.Header[] headerArray10 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList11 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList11, headerArray10);
        retrofit.mime.TypedOutput typedOutput13 = null;
        retrofit.client.Request request14 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput13);
        retrofit.mime.TypedOutput typedOutput15 = null;
        retrofit.client.Request request16 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList11, typedOutput15);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList11, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = request22.getBody();
        java.lang.String str24 = request22.getMethod();
        java.util.List<retrofit.client.Header> headerList25 = request22.getHeaders();
        java.lang.Class<?> wildcardClass26 = request22.getClass();
        org.junit.Assert.assertNotNull(headerArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(typedOutput23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(headerList25);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.util.List<retrofit.client.Header> headerList4 = null;
        retrofit.mime.TypedOutput typedOutput5 = null;
        retrofit.client.Request request6 = new retrofit.client.Request("hi!", "hi!", headerList4, typedOutput5);
        java.lang.String str7 = request6.getUrl();
        java.util.List<retrofit.client.Header> headerList8 = request6.getHeaders();
        retrofit.mime.TypedOutput typedOutput9 = null;
        retrofit.client.Request request10 = new retrofit.client.Request("hi!", "", headerList8, typedOutput9);
        retrofit.mime.TypedOutput typedOutput11 = request10.getBody();
        java.lang.Class<?> wildcardClass12 = request10.getClass();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(headerList8);
        org.junit.Assert.assertNull(typedOutput11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        retrofit.client.Header[] headerArray14 = new retrofit.client.Header[] {};
        java.util.ArrayList<retrofit.client.Header> headerList15 = new java.util.ArrayList<retrofit.client.Header>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<retrofit.client.Header>) headerList15, headerArray14);
        retrofit.mime.TypedOutput typedOutput17 = null;
        retrofit.client.Request request18 = new retrofit.client.Request("", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput17);
        retrofit.mime.TypedOutput typedOutput19 = null;
        retrofit.client.Request request20 = new retrofit.client.Request("hi!", "hi!", (java.util.List<retrofit.client.Header>) headerList15, typedOutput19);
        retrofit.mime.TypedOutput typedOutput21 = null;
        retrofit.client.Request request22 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput21);
        retrofit.mime.TypedOutput typedOutput23 = null;
        retrofit.client.Request request24 = new retrofit.client.Request("hi!", "", (java.util.List<retrofit.client.Header>) headerList15, typedOutput23);
        retrofit.mime.TypedOutput typedOutput25 = request24.getBody();
        java.lang.String str26 = request24.getMethod();
        java.util.List<retrofit.client.Header> headerList27 = request24.getHeaders();
        retrofit.mime.TypedOutput typedOutput28 = null;
        retrofit.client.Request request29 = new retrofit.client.Request("hi!", "hi!", headerList27, typedOutput28);
        java.util.List<retrofit.client.Header> headerList30 = request29.getHeaders();
        retrofit.mime.TypedOutput typedOutput31 = null;
        retrofit.client.Request request32 = new retrofit.client.Request("", "", headerList30, typedOutput31);
        java.util.List<retrofit.client.Header> headerList33 = request32.getHeaders();
        retrofit.mime.TypedOutput typedOutput34 = null;
        retrofit.client.Request request35 = new retrofit.client.Request("hi!", "", headerList33, typedOutput34);
        java.lang.Class<?> wildcardClass36 = headerList33.getClass();
        org.junit.Assert.assertNotNull(headerArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(typedOutput25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertNotNull(headerList27);
        org.junit.Assert.assertNotNull(headerList30);
        org.junit.Assert.assertNotNull(headerList33);
        org.junit.Assert.assertNotNull(wildcardClass36);
    }
}

