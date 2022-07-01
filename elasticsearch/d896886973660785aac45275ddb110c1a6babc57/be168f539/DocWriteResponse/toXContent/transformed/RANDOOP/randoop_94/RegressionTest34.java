import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest34 {

    public static boolean debug = false;

    @Test
    public void test17001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17001");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "", "_index", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17002");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
    }

    @Test
    public void test17003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17003");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
    }

    @Test
    public void test17004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17004");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
    }

    @Test
    public void test17005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17005");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_TYPE();
        java.lang.String str17 = fields0.get_VERSION();
        java.lang.String str18 = fields0.get_VERSION();
        java.lang.String str19 = fields0.get_INDEX();
        java.lang.String str20 = fields0.get_INDEX();
        java.lang.String str21 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_type" + "'", str16, "_type");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_version" + "'", str17, "_version");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_version" + "'", str18, "_version");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_index" + "'", str19, "_index");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_index" + "'", str20, "_index");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "_version" + "'", str21, "_version");
    }

    @Test
    public void test17006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17006");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "", "_id", "_type", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17007");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test17008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17008");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_id", "hi!", "_version", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test17009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17009");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test17010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17010");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "_index", "_id", "_version", "_type", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17011");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_ID();
        java.lang.String str17 = fields0.get_INDEX();
        java.lang.String str18 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass19 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_index" + "'", str17, "_index");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_type" + "'", str18, "_type");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test17012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17012");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
    }

    @Test
    public void test17013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17013");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test17014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17014");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test17015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17015");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "_id", "_version", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17016");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test17017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17017");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test17018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17018");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "_id", "_version", "_type", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17019");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "hi!", "_type", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17020");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
    }

    @Test
    public void test17021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17021");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
    }

    @Test
    public void test17022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17022");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test17023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17023");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_INDEX();
        java.lang.String str17 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_id" + "'", str17, "_id");
    }

    @Test
    public void test17024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17024");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_index", "_id", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test17025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17025");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_version", "_id", "_type", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17026");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test17027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17027");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
    }

    @Test
    public void test17028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17028");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test17029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17029");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
    }

    @Test
    public void test17030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17030");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test17031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17031");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "_id", "_index", "_version", "_version", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17032");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "", "_index", "_version", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17033");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_INDEX();
        java.lang.String str17 = fields0.get_ID();
        java.lang.String str18 = fields0.get_TYPE();
        java.lang.String str19 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_id" + "'", str17, "_id");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_type" + "'", str18, "_type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_id" + "'", str19, "_id");
    }

    @Test
    public void test17034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17034");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_ID();
        java.lang.String str17 = fields0.get_ID();
        java.lang.String str18 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_id" + "'", str17, "_id");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_version" + "'", str18, "_version");
    }

    @Test
    public void test17035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17035");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass17 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_version" + "'", str16, "_version");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17036");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_type" + "'", str16, "_type");
    }

    @Test
    public void test17037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17037");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "", "_index", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test17038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17038");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test17039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17039");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
    }

    @Test
    public void test17040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17040");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_version", "_index", "_id", "", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17041");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
    }

    @Test
    public void test17042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17042");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test17043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17043");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_ID();
        java.lang.String str16 = fields0.get_ID();
        java.lang.Class<?> wildcardClass17 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17044");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_version", "", "_version", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17045");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test17046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17046");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test17047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17047");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_id", "_id", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test17048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17048");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test17049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17049");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_type" + "'", str16, "_type");
    }

    @Test
    public void test17050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17050");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test17051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17051");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test17052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17052");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test17053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17053");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
    }

    @Test
    public void test17054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17054");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test17055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17055");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test17056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17056");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test17057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17057");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test17058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17058");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_version", "", "_version", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17059");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
    }

    @Test
    public void test17060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17060");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
    }

    @Test
    public void test17061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17061");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
    }

    @Test
    public void test17062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17062");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_ID();
        java.lang.String str17 = fields0.get_TYPE();
        java.lang.String str18 = fields0.get_TYPE();
        java.lang.String str19 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_type" + "'", str17, "_type");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_type" + "'", str18, "_type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_id" + "'", str19, "_id");
    }

    @Test
    public void test17063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17063");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test17064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17064");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test17065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17065");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
    }

    @Test
    public void test17066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17066");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_VERSION();
        java.lang.String str17 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_version" + "'", str16, "_version");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_type" + "'", str17, "_type");
    }

    @Test
    public void test17067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17067");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "", "_type", "_version", "_type", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17068");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_type", "", "", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17069");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test17070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17070");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test17071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17071");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
    }

    @Test
    public void test17072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17072");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
    }

    @Test
    public void test17073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17073");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test17074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17074");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "_index", "_version", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17075");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test17076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17076");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
    }

    @Test
    public void test17077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17077");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test17078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17078");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
    }

    @Test
    public void test17079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17079");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_version", "hi!", "_id", "_id", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17080");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
    }

    @Test
    public void test17081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17081");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "_version", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17082");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "_id", "_index", "hi!", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17083");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_id", "_type", "_index", "_index", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17084");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_version" + "'", str16, "_version");
    }

    @Test
    public void test17085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17085");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_ID();
        java.lang.String str17 = fields0.get_TYPE();
        java.lang.String str18 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_type" + "'", str17, "_type");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_type" + "'", str18, "_type");
    }

    @Test
    public void test17086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17086");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_type", "", "", "_type", "hi!", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17087");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass15 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17088");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
    }

    @Test
    public void test17089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17089");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
    }

    @Test
    public void test17090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17090");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test17091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17091");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
    }

    @Test
    public void test17092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17092");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "hi!", "_index", "_id", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17093");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "_index", "", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17094");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test17095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17095");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test17096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17096");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_version", "_type", "_id", "hi!", "_id", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17097");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test17098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17098");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test17099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17099");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test17100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17100");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test17101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17101");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "hi!", "", "_index", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17102");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
    }

    @Test
    public void test17103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17103");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
    }

    @Test
    public void test17104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17104");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test17105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17105");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test17106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17106");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_version", "_index", "hi!", "_version", "_index", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17107");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test17108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17108");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_type", "", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray4, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test17109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17109");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_INDEX();
        java.lang.String str17 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass18 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_index" + "'", str17, "_index");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test17110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17110");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test17111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17111");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_index", "", "_id", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test17112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17112");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "_id", "_index", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test17113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17113");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
    }

    @Test
    public void test17114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17114");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
    }

    @Test
    public void test17115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17115");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
    }

    @Test
    public void test17116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17116");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
    }

    @Test
    public void test17117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17117");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "_type", "_id", "_index", "_version", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17118");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test17119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17119");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test17120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17120");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
    }

    @Test
    public void test17121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17121");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass16 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test17122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17122");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test17123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17123");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "_index", "hi!", "hi!", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17124");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test17125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17125");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "", "_version", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test17126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17126");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
    }

    @Test
    public void test17127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17127");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_ID();
        java.lang.String str16 = fields0.get_ID();
        java.lang.String str17 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_type" + "'", str17, "_type");
    }

    @Test
    public void test17128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17128");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
    }

    @Test
    public void test17129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17129");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_ID();
        java.lang.String str16 = fields0.get_TYPE();
        java.lang.String str17 = fields0.get_VERSION();
        java.lang.String str18 = fields0.get_INDEX();
        java.lang.String str19 = fields0.get_ID();
        java.lang.Class<?> wildcardClass20 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_type" + "'", str16, "_type");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_version" + "'", str17, "_version");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_index" + "'", str18, "_index");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_id" + "'", str19, "_id");
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test17130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17130");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "hi!", "_index", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17131");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test17132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17132");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "_id", "_index", "_version", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17133");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test17134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17134");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test17135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17135");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
    }

    @Test
    public void test17136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17136");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass16 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test17137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17137");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
    }

    @Test
    public void test17138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17138");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass17 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17139");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "_index", "_id", "", "_id", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17140");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test17141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17141");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_INDEX();
        java.lang.String str17 = fields0.get_TYPE();
        java.lang.String str18 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_type" + "'", str17, "_type");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_type" + "'", str18, "_type");
    }

    @Test
    public void test17142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17142");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_version" + "'", str16, "_version");
    }

    @Test
    public void test17143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17143");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass15 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17144");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test17145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17145");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
    }

    @Test
    public void test17146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17146");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "hi!", "", "_version", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17147");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
    }

    @Test
    public void test17148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17148");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test17149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17149");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_id", "_version", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test17150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17150");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "_index", "_id", "_index", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17151");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test17152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17152");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
    }

    @Test
    public void test17153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17153");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test17154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17154");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test17155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17155");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test17156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17156");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test17157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17157");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test17158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17158");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
    }

    @Test
    public void test17159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17159");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_ID();
        java.lang.String str17 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass18 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_version" + "'", str17, "_version");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test17160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17160");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
    }

    @Test
    public void test17161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17161");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_type", "", "_version", "hi!", "_index", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17162");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test17163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17163");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test17164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17164");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "_index", "_id", "_id", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17165");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_INDEX();
        java.lang.String str17 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_version" + "'", str17, "_version");
    }

    @Test
    public void test17166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17166");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass15 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17167");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_id", "_type", "", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17168");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
    }

    @Test
    public void test17169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17169");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
    }

    @Test
    public void test17170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17170");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "", "_id", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test17171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17171");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "_index", "_index", "", "hi!", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17172");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass15 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17173");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_ID();
        java.lang.String str17 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_version" + "'", str17, "_version");
    }

    @Test
    public void test17174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17174");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_ID();
        java.lang.String str16 = fields0.get_VERSION();
        java.lang.String str17 = fields0.get_TYPE();
        java.lang.String str18 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_version" + "'", str16, "_version");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_type" + "'", str17, "_type");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_version" + "'", str18, "_version");
    }

    @Test
    public void test17175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17175");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_INDEX();
        java.lang.String str17 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_type" + "'", str17, "_type");
    }

    @Test
    public void test17176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17176");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test17177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17177");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
    }

    @Test
    public void test17178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17178");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "_type", "hi!", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17179");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_id", "hi!", "hi!", "hi!", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17180");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "_id", "_id", "_id", "_version", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17181");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
    }

    @Test
    public void test17182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17182");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
    }

    @Test
    public void test17183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17183");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass15 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17184");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.Class<?> wildcardClass7 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17185");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test17186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17186");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test17187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17187");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
    }

    @Test
    public void test17188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17188");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test17189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17189");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "", "_version", "_version", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17190");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test17191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17191");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
    }

    @Test
    public void test17192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17192");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_index", "_type", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17193");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
    }

    @Test
    public void test17194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17194");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "_index", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test17195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17195");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass17 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_version" + "'", str16, "_version");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test17196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17196");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_INDEX();
        java.lang.String str17 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass18 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_version" + "'", str17, "_version");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test17197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17197");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_index", "_index", "", "_id", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17198");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
    }

    @Test
    public void test17199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17199");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test17200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17200");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test17201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17201");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test17202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17202");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test17203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17203");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test17204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17204");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "_id", "", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17205");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test17206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17206");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass5 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test17207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17207");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
    }

    @Test
    public void test17208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17208");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test17209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17209");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test17210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17210");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test17211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17211");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test17212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17212");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_TYPE();
        java.lang.String str17 = fields0.get_INDEX();
        java.lang.String str18 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_type" + "'", str16, "_type");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_index" + "'", str17, "_index");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_type" + "'", str18, "_type");
    }

    @Test
    public void test17213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17213");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "hi!", "hi!", "_type", "_version", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17214");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_type", "hi!", "_version", "_index", "_id", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17215");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test17216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17216");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_TYPE();
        java.lang.String str17 = fields0.get_INDEX();
        java.lang.String str18 = fields0.get_ID();
        java.lang.String str19 = fields0.get_VERSION();
        java.lang.String str20 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_type" + "'", str16, "_type");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_index" + "'", str17, "_index");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_id" + "'", str18, "_id");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_version" + "'", str19, "_version");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_version" + "'", str20, "_version");
    }

    @Test
    public void test17217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17217");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test17218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17218");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_id", "_index", "_type", "_id", "_id", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17219");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test17220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17220");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test17221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17221");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test17222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17222");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_VERSION();
        java.lang.String str17 = fields0.get_VERSION();
        java.lang.String str18 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_version" + "'", str16, "_version");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_version" + "'", str17, "_version");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_version" + "'", str18, "_version");
    }

    @Test
    public void test17223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17223");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_version", "_version", "hi!", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17224");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test17225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17225");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_VERSION();
        java.lang.String str17 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass18 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_version" + "'", str16, "_version");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_version" + "'", str17, "_version");
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test17226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17226");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test17227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17227");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "hi!", "_type", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17228");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_type" + "'", str16, "_type");
    }

    @Test
    public void test17229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17229");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test17230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17230");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_version", "_type", "_type", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17231");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test17232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17232");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
    }

    @Test
    public void test17233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17233");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
    }

    @Test
    public void test17234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17234");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
    }

    @Test
    public void test17235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17235");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
    }

    @Test
    public void test17236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17236");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test17237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17237");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test17238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17238");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test17239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17239");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_id", "hi!", "hi!", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17240");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
    }

    @Test
    public void test17241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17241");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_version", "", "_id", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17242");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
    }

    @Test
    public void test17243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17243");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test17244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17244");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "", "_type", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test17245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17245");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test17246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17246");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test17247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17247");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_ID();
        java.lang.String str16 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
    }

    @Test
    public void test17248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17248");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
    }

    @Test
    public void test17249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17249");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_id", "hi!", "_version", "", "_type", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17250");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass7 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test17251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17251");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "_id", "hi!", "_id", "_version", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17252");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_index", "_index", "", "_index", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17253");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test17254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17254");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test17255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17255");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
    }

    @Test
    public void test17256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17256");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
    }

    @Test
    public void test17257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17257");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
    }

    @Test
    public void test17258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17258");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
    }

    @Test
    public void test17259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17259");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_index", "hi!", "_index", "", "_type", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder10 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17260");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass15 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17261");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test17262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17262");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test17263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17263");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
    }

    @Test
    public void test17264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17264");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test17265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17265");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_type", "hi!", "_id", "_id", "hi!", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
    }

    @Test
    public void test17266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17266");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
    }

    @Test
    public void test17267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17267");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test17268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17268");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
    }

    @Test
    public void test17269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17269");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass6 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test17270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17270");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test17271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17271");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test17272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17272");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test17273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17273");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "_version", "_type", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test17274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17274");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "", "_id", "_index", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder8 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray6, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17275");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass15 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17276");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
    }

    @Test
    public void test17277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17277");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "_type", "hi!", "_version", "_id", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test17278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17278");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test17279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17279");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
    }

    @Test
    public void test17280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17280");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "_version", "_index", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17281");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test17282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17282");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass16 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test17283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17283");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test17284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17284");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test17285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17285");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_ID();
        java.lang.Class<?> wildcardClass15 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test17286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17286");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_index", "_version", "", "_index" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test17287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17287");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_index", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
    }

    @Test
    public void test17288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17288");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
    }

    @Test
    public void test17289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest34.test17289");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
    }
}

