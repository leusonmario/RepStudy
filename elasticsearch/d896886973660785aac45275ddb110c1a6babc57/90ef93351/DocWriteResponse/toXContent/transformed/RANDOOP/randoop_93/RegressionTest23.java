import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest23 {

    public static boolean debug = false;

    @Test
    public void test11501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11501");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
    }

    @Test
    public void test11502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11502");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test11503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11503");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_index", "_version", "_shard_id", "_id" };
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
    public void test11504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11504");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
    }

    @Test
    public void test11505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11505");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11506");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test11507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11507");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "", "_id", "hi!" };
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
    public void test11508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11508");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "_index", "hi!" };
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
    public void test11509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11509");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test11510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11510");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "_id", "_id", "_type", "_shard_id", "_seq_no" };
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
    public void test11511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11511");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_index", "_seq_no", "", "", "_version", "_id" };
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
    public void test11512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11512");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
    }

    @Test
    public void test11513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11513");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "_shard_id", "", "hi!", "_index" };
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
    public void test11514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11514");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test11515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11515");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
    }

    @Test
    public void test11516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11516");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test11517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11517");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "_seq_no", "_type", "" };
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
    public void test11518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11518");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test11519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11519");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test11520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11520");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_version", "", "_type" };
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
    public void test11521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11521");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_seq_no", "_shard_id", "_shard_id", "_index", "_index" };
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
    public void test11522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11522");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test11523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11523");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test11524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11524");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
    }

    @Test
    public void test11525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11525");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test11526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11526");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
    }

    @Test
    public void test11527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11527");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test11528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11528");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
    }

    @Test
    public void test11529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11529");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
    }

    @Test
    public void test11530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11530");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test11531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11531");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
    }

    @Test
    public void test11532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11532");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "_shard_id", "", "_seq_no", "_id", "_type" };
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
    public void test11533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11533");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test11534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11534");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_id", "_seq_no", "" };
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
    public void test11535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11535");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "_type", "_shard_id", "_type", "_seq_no", "hi!" };
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
    public void test11536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11536");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_id", "hi!", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test11537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11537");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11538");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
    }

    @Test
    public void test11539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11539");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "hi!", "_type", "_shard_id", "_type", "_version" };
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
    public void test11540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11540");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test11541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11541");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11542");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "_type", "hi!", "_shard_id" };
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
    public void test11543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11543");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_SHARD_ID();
        java.lang.String str16 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_shard_id" + "'", str15, "_shard_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
    }

    @Test
    public void test11544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11544");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test11545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11545");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test11546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11546");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test11547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11547");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
    }

    @Test
    public void test11548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11548");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
    }

    @Test
    public void test11549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11549");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test11550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11550");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
    }

    @Test
    public void test11551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11551");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test11552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11552");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test11553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11553");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test11554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11554");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_SEQ_NO();
        java.lang.String str17 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_seq_no" + "'", str16, "_seq_no");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_id" + "'", str17, "_id");
    }

    @Test
    public void test11555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11555");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
    }

    @Test
    public void test11556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11556");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
    }

    @Test
    public void test11557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11557");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_type", "_id", "_seq_no", "hi!", "_type", "" };
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
    public void test11558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11558");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_version", "_version", "hi!", "_index" };
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
    public void test11559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11559");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "_seq_no", "_type" };
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
    public void test11560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11560");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "_version", "", "" };
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
    public void test11561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11561");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test11562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11562");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
    }

    @Test
    public void test11563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11563");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test11564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11564");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
    }

    @Test
    public void test11565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11565");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "_seq_no", "_shard_id", "_id", "hi!", "_version" };
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
    public void test11566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11566");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11567");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
    }

    @Test
    public void test11568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11568");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_shard_id", "_type", "_version", "hi!", "_shard_id" };
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
    public void test11569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11569");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test11570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11570");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test11571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11571");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
    }

    @Test
    public void test11572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11572");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
    }

    @Test
    public void test11573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11573");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_version", "_id", "", "_seq_no" };
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
    public void test11574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11574");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
    }

    @Test
    public void test11575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11575");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test11576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11576");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
    }

    @Test
    public void test11577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11577");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test11578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11578");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
    }

    @Test
    public void test11579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11579");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
    }

    @Test
    public void test11580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11580");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test11581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11581");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_seq_no", "_seq_no", "" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test11582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11582");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
    }

    @Test
    public void test11583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11583");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_seq_no", "_id", "", "_id" };
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
    public void test11584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11584");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_shard_id" + "'", str15, "_shard_id");
    }

    @Test
    public void test11585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11585");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test11586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11586");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_SEQ_NO();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_ID();
        java.lang.String str17 = fields0.get_ID();
        java.lang.String str18 = fields0.get_SHARD_ID();
        java.lang.String str19 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_id" + "'", str17, "_id");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_shard_id" + "'", str18, "_shard_id");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_seq_no" + "'", str19, "_seq_no");
    }

    @Test
    public void test11587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11587");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_shard_id", "_version", "_seq_no" };
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
    public void test11588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11588");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "_version", "_version", "_seq_no", "_id" };
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
    public void test11589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11589");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test11590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11590");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
    }

    @Test
    public void test11591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11591");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test11592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11592");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "_index", "_version", "_type" };
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
    public void test11593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11593");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test11594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11594");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_SHARD_ID();
        java.lang.String str15 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
    }

    @Test
    public void test11595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11595");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_id", "_index", "_index", "_shard_id" };
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
    public void test11596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11596");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_type", "_seq_no", "_index", "_shard_id", "_seq_no", "_index" };
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
    public void test11597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11597");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SEQ_NO();
        java.lang.String str14 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
    }

    @Test
    public void test11598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11598");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test11599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11599");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test11600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11600");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test11601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11601");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
    }

    @Test
    public void test11602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11602");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
    }

    @Test
    public void test11603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11603");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test11604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11604");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test11605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11605");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_SEQ_NO();
        java.lang.String str14 = fields0.get_SHARD_ID();
        java.lang.String str15 = fields0.get_SHARD_ID();
        java.lang.String str16 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_shard_id" + "'", str15, "_shard_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
    }

    @Test
    public void test11606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11606");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
    }

    @Test
    public void test11607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11607");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test11608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11608");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "_seq_no", "hi!", "_index" };
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
    public void test11609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11609");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "_type", "_index", "_type" };
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
    public void test11610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11610");
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
    public void test11611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11611");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "_shard_id", "hi!" };
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
    public void test11612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11612");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
    }

    @Test
    public void test11613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11613");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
    }

    @Test
    public void test11614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11614");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_version", "_shard_id", "hi!" };
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
    public void test11615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11615");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test11616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11616");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test11617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11617");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11618");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11619");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test11620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11620");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "_index", "_shard_id", "_type" };
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
    public void test11621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11621");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_shard_id", "_id", "_index", "_seq_no" };
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
    public void test11622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11622");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
    }

    @Test
    public void test11623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11623");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test11624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11624");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_index", "_version", "_index", "_shard_id" };
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
    public void test11625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11625");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_seq_no", "_index", "hi!", "_type", "", "_type" };
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
    public void test11626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11626");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_seq_no", "_index", "_shard_id", "_type", "_version" };
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
    public void test11627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11627");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test11628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11628");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_seq_no", "_shard_id", "_index", "_shard_id" };
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
    public void test11629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11629");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test11630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11630");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test11631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11631");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11632");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test11633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11633");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "_id", "_id", "_shard_id", "_shard_id" };
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
    public void test11634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11634");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "_version" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
    }

    @Test
    public void test11635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11635");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test11636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11636");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test11637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11637");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test11638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11638");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test11639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11639");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_seq_no", "_version", "_type", "_version" };
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
    public void test11640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11640");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test11641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11641");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_SEQ_NO();
        java.lang.String str16 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_seq_no" + "'", str15, "_seq_no");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_seq_no" + "'", str16, "_seq_no");
    }

    @Test
    public void test11642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11642");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test11643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11643");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11644");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test11645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11645");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test11646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11646");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_ID();
        java.lang.String str16 = fields0.get_SHARD_ID();
        java.lang.String str17 = fields0.get_VERSION();
        java.lang.String str18 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_shard_id" + "'", str16, "_shard_id");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_version" + "'", str17, "_version");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_shard_id" + "'", str18, "_shard_id");
    }

    @Test
    public void test11647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11647");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "", "_id", "_type" };
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
    public void test11648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11648");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_seq_no", "_version", "_index", "_shard_id", "_version", "_shard_id" };
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
    public void test11649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11649");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11650");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_id", "_index", "_type", "hi!", "_type", "hi!" };
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
    public void test11651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11651");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "", "", "_id" };
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
    public void test11652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11652");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "", "", "_version", "_type" };
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
    public void test11653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11653");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
    }

    @Test
    public void test11654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11654");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
    }

    @Test
    public void test11655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11655");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test11656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11656");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test11657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11657");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test11658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11658");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
    }

    @Test
    public void test11659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11659");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_seq_no", "", "_shard_id", "_shard_id", "hi!", "hi!" };
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
    public void test11660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11660");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test11661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11661");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "", "", "hi!" };
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
    public void test11662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11662");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "_version", "_id", "_seq_no", "_version" };
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
    public void test11663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11663");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11664");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_SEQ_NO();
        java.lang.String str15 = fields0.get_ID();
        java.lang.String str16 = fields0.get_SEQ_NO();
        java.lang.String str17 = fields0.get_INDEX();
        java.lang.String str18 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_seq_no" + "'", str16, "_seq_no");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_index" + "'", str17, "_index");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_type" + "'", str18, "_type");
    }

    @Test
    public void test11665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11665");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
    }

    @Test
    public void test11666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11666");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11667");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test11668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11668");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11669");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test11670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11670");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test11671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11671");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test11672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11672");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
    }

    @Test
    public void test11673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11673");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_index", "", "_type", "_version", "hi!", "_index" };
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
    public void test11674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11674");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test11675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11675");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
    }

    @Test
    public void test11676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11676");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test11677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11677");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "_type", "hi!", "_shard_id" };
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
    public void test11678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11678");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_version", "_type", "_type", "_index", "_seq_no" };
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
    public void test11679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11679");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_shard_id", "_shard_id", "_shard_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test11680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11680");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
    }

    @Test
    public void test11681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11681");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11682");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "_version", "_shard_id", "_shard_id", "_version", "_seq_no" };
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
    public void test11683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11683");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test11684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11684");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_SEQ_NO();
        java.lang.String str15 = fields0.get_SEQ_NO();
        java.lang.String str16 = fields0.get_TYPE();
        java.lang.String str17 = fields0.get_VERSION();
        java.lang.String str18 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_seq_no" + "'", str15, "_seq_no");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_type" + "'", str16, "_type");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_version" + "'", str17, "_version");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_shard_id" + "'", str18, "_shard_id");
    }

    @Test
    public void test11685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11685");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_id", "", "hi!", "_shard_id" };
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
    public void test11686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11686");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
    }

    @Test
    public void test11687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11687");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test11688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11688");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
    }

    @Test
    public void test11689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11689");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11690");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test11691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11691");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11692");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11693");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_shard_id", "_id", "_type", "_version" };
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
    public void test11694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11694");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test11695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11695");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_shard_id", "_shard_id", "_shard_id", "hi!", "_shard_id", "hi!" };
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
    public void test11696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11696");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "_seq_no", "_version", "_id", "hi!", "hi!" };
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
    public void test11697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11697");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test11698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11698");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test11699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11699");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test11700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11700");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test11701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11701");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test11702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11702");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_seq_no", "_seq_no", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test11703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11703");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
    }

    @Test
    public void test11704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11704");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11705");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11706");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass6 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11707");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test11708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11708");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "_shard_id", "_index", "_id", "", "_id" };
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
    public void test11709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11709");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11710");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_version", "_index", "_shard_id", "_seq_no", "", "_type" };
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
    public void test11711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11711");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test11712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11712");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11713");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test11714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11714");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test11715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11715");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11716");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test11717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11717");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
    }

    @Test
    public void test11718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11718");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11719");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test11720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11720");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_version", "_seq_no", "_type", "_version" };
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
    public void test11721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11721");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_seq_no", "_index", "_shard_id", "_index" };
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
    public void test11722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11722");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "hi!", "_index", "_id", "" };
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
    public void test11723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11723");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
    }

    @Test
    public void test11724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11724");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test11725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11725");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "_version", "_index", "_index", "_shard_id" };
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
    public void test11726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11726");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "hi!", "hi!", "_type", "_seq_no", "hi!" };
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
    public void test11727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11727");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
    }

    @Test
    public void test11728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11728");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test11729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11729");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_SEQ_NO();
        java.lang.String str14 = fields0.get_SHARD_ID();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_seq_no" + "'", str16, "_seq_no");
    }

    @Test
    public void test11730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11730");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass7 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11731");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "_shard_id", "_seq_no", "", "" };
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
    public void test11732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11732");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
    }

    @Test
    public void test11733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11733");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11734");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "_version", "", "_id", "_index" };
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
    public void test11735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11735");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test11736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11736");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test11737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11737");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test11738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11738");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test11739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11739");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
    }

    @Test
    public void test11740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11740");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test11741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11741");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "_id", "_id", "_id", "_version", "_type" };
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
    public void test11742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11742");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_type", "_type", "_type" };
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
    public void test11743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11743");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
    }

    @Test
    public void test11744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11744");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
    }

    @Test
    public void test11745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11745");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
    }

    @Test
    public void test11746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11746");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11747");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
    }

    @Test
    public void test11748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11748");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test11749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11749");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "_id", "_seq_no", "_index", "hi!" };
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
    public void test11750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11750");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test11751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11751");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_ID();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11752");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
    }

    @Test
    public void test11753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11753");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "_version", "_type", "_seq_no", "_version", "_shard_id" };
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
    public void test11754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11754");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_seq_no", "hi!", "_shard_id", "_seq_no" };
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
    public void test11755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11755");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test11756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11756");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_version", "", "_version", "_seq_no", "_version", "_type" };
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
    public void test11757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11757");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11758");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "_id", "_seq_no", "" };
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
    public void test11759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11759");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "_index", "hi!", "_index", "hi!" };
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
    public void test11760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11760");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "", "", "hi!" };
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
    public void test11761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11761");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11762");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test11763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11763");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test11764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11764");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test11765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11765");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
    }

    @Test
    public void test11766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11766");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test11767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11767");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11768");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
    }

    @Test
    public void test11769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11769");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test11770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11770");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "_id", "_index", "_seq_no" };
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
    public void test11771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11771");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test11772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11772");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11773");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
    }

    @Test
    public void test11774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11774");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
    }

    @Test
    public void test11775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11775");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
    }

    @Test
    public void test11776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11776");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_type", "_version", "_seq_no", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test11777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11777");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
    }

    @Test
    public void test11778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11778");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
    }

    @Test
    public void test11779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11779");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
    }

    @Test
    public void test11780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11780");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test11781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11781");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass15 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11782");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "_index", "_id", "_index", "_seq_no", "hi!" };
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
    public void test11783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11783");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass16 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_seq_no" + "'", str15, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test11784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11784");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass5 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test11785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11785");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test11786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11786");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test11787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11787");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
    }

    @Test
    public void test11788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11788");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_SEQ_NO();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.String str16 = fields0.get_SHARD_ID();
        java.lang.String str17 = fields0.get_ID();
        java.lang.String str18 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_shard_id" + "'", str16, "_shard_id");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_id" + "'", str17, "_id");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_version" + "'", str18, "_version");
    }

    @Test
    public void test11789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11789");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test11790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11790");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_seq_no", "hi!", "_version", "_id", "_index" };
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
    public void test11791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11791");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
    }

    @Test
    public void test11792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11792");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_seq_no", "_seq_no", "_id", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test11793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11793");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_index", "_shard_id", "_type", "_index", "_shard_id", "_seq_no" };
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
    public void test11794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11794");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_version", "_shard_id", "_type", "_type", "_shard_id" };
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
    public void test11795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11795");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "_type", "_id" };
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
    public void test11796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11796");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_SEQ_NO();
        java.lang.String str14 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
    }

    @Test
    public void test11797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11797");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test11798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11798");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test11799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11799");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11800");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11801");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11802");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_index", "_type", "_seq_no", "_type", "_version" };
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
    public void test11803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11803");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test11804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11804");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "_id", "_seq_no", "_version", "_shard_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test11805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11805");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test11806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11806");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
    }

    @Test
    public void test11807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11807");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_SHARD_ID();
        java.lang.String str16 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_shard_id" + "'", str15, "_shard_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
    }

    @Test
    public void test11808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11808");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test11809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11809");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test11810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11810");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_id", "_index", "_type" };
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
    public void test11811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11811");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test11812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11812");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_shard_id", "_type", "_index", "_version" };
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
    public void test11813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11813");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SEQ_NO();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
    }

    @Test
    public void test11814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11814");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "_id", "_version", "hi!" };
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
    public void test11815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11815");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
    }

    @Test
    public void test11816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11816");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test11817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11817");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test11818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11818");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_index", "hi!", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test11819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11819");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test11820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11820");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test11821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11821");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "_type", "", "_seq_no", "_id" };
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
    public void test11822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11822");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass6 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11823");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test11824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11824");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_shard_id", "_shard_id", "_type", "" };
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
    public void test11825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11825");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11826");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11827");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "_index", "hi!", "hi!", "_version" };
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
    public void test11828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11828");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
    }

    @Test
    public void test11829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11829");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "hi!", "hi!", "_shard_id" };
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
    public void test11830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11830");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
    }

    @Test
    public void test11831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11831");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11832");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test11833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11833");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
    }

    @Test
    public void test11834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11834");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test11835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11835");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_SEQ_NO();
        java.lang.String str14 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
    }

    @Test
    public void test11836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11836");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
    }

    @Test
    public void test11837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11837");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
    }

    @Test
    public void test11838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11838");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11839");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test11840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11840");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "_shard_id", "", "_shard_id" };
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
    public void test11841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11841");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test11842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11842");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
    }

    @Test
    public void test11843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11843");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
    }

    @Test
    public void test11844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11844");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test11845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11845");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass7 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11846");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11847");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
    }

    @Test
    public void test11848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11848");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "_seq_no", "", "", "_seq_no", "_id" };
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
    public void test11849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11849");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test11850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11850");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "_type", "_type", "hi!", "_version", "_type" };
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
    public void test11851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11851");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "hi!", "_type", "_version", "_shard_id" };
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
    public void test11852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11852");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SEQ_NO();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
    }

    @Test
    public void test11853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11853");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "_type", "_shard_id", "_version" };
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
    public void test11854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11854");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11855");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test11856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11856");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
    }

    @Test
    public void test11857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11857");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_id", "_seq_no", "_id", "_index", "", "_seq_no" };
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
    public void test11858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11858");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
    }

    @Test
    public void test11859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11859");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "_id", "_shard_id", "_index", "_id", "" };
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
    public void test11860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11860");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "_type", "", "hi!", "", "_id" };
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
    public void test11861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11861");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test11862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11862");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "_shard_id", "_version", "_shard_id", "_index" };
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
    public void test11863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11863");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test11864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11864");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "_id", "", "_type" };
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
    public void test11865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11865");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
    }

    @Test
    public void test11866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11866");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test11867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11867");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test11868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11868");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass6 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test11869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11869");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
    }

    @Test
    public void test11870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11870");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test11871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11871");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test11872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11872");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_seq_no", "_seq_no", "", "_type", "_shard_id" };
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
    public void test11873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11873");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "_seq_no", "_index", "_id", "" };
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
    public void test11874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11874");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "", "_index", "_type", "", "_index" };
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
    public void test11875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11875");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
    }

    @Test
    public void test11876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11876");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_seq_no", "_index", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder7 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test11877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11877");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
    }

    @Test
    public void test11878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11878");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_seq_no", "_version", "_index", "", "_version", "_seq_no" };
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
    public void test11879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11879");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
    }

    @Test
    public void test11880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11880");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_index", "_id", "_seq_no" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test11881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11881");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "_shard_id", "_index", "", "hi!" };
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
    public void test11882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11882");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
    }

    @Test
    public void test11883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11883");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
    }

    @Test
    public void test11884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11884");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_version", "hi!", "", "_version" };
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
    public void test11885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11885");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11886");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
    }

    @Test
    public void test11887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11887");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
    }

    @Test
    public void test11888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11888");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_seq_no", "_id", "_version", "", "_seq_no" };
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
    public void test11889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11889");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test11890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11890");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test11891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11891");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_type" + "'", str16, "_type");
    }

    @Test
    public void test11892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11892");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
    }

    @Test
    public void test11893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11893");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11894");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "", "", "_type" };
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
    public void test11895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11895");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test11896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11896");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
    }

    @Test
    public void test11897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11897");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test11898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11898");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test11899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11899");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_version", "_type", "_type", "" };
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
    public void test11900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11900");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test11901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11901");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test11902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11902");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "_shard_id", "_id", "_seq_no", "_version", "" };
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
    public void test11903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11903");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_version", "_version", "_type", "_index", "_id", "_seq_no" };
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
    public void test11904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11904");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test11905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11905");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "_index", "_id", "_type", "_version" };
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
    public void test11906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11906");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
    }

    @Test
    public void test11907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11907");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "_version", "_type", "_seq_no", "hi!" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test11908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11908");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test11909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11909");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_seq_no", "_shard_id", "", "_seq_no", "_type", "_shard_id" };
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
    public void test11910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11910");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11911");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
    }

    @Test
    public void test11912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11912");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "_id", "_shard_id", "_type", "_shard_id" };
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
    public void test11913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11913");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_seq_no", "_index", "_version", "hi!", "hi!", "_type" };
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
    public void test11914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11914");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test11915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11915");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11916");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test11917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11917");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test11918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11918");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test11919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11919");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_seq_no" + "'", str16, "_seq_no");
    }

    @Test
    public void test11920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11920");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test11921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11921");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test11922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11922");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
    }

    @Test
    public void test11923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11923");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_id", "", "_index", "_version" };
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
    public void test11924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11924");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "_id", "_shard_id", "_type", "_id" };
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
    public void test11925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11925");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
    }

    @Test
    public void test11926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11926");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
    }

    @Test
    public void test11927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11927");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test11928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11928");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_SEQ_NO();
        java.lang.String str15 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_shard_id" + "'", str15, "_shard_id");
    }

    @Test
    public void test11929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11929");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "hi!", "_version", "hi!", "_version", "_seq_no" };
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
    public void test11930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11930");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test11931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11931");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test11932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11932");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_id", "_type", "_shard_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder6 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
    }

    @Test
    public void test11933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11933");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
    }

    @Test
    public void test11934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11934");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test11935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11935");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test11936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11936");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
    }

    @Test
    public void test11937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11937");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test11938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11938");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_ID();
        java.lang.String str16 = fields0.get_ID();
        java.lang.String str17 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_id" + "'", str16, "_id");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_shard_id" + "'", str17, "_shard_id");
    }

    @Test
    public void test11939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11939");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass15 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test11940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11940");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test11941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11941");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
    }

    @Test
    public void test11942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11942");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test11943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11943");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_type", "_version", "_shard_id", "_index", "_seq_no", "_type" };
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
    public void test11944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11944");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_seq_no" + "'", str16, "_seq_no");
    }

    @Test
    public void test11945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11945");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
    }

    @Test
    public void test11946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11946");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
    }

    @Test
    public void test11947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11947");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test11948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11948");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test11949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11949");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "_shard_id", "_id", "" };
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
    public void test11950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11950");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_seq_no", "_shard_id", "_id", "", "_version", "_seq_no" };
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
    public void test11951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11951");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "_id", "_version", "" };
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
    public void test11952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11952");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_id", "_shard_id", "_seq_no", "_version", "_shard_id", "_type" };
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
    public void test11953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11953");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test11954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11954");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test11955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11955");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test11956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11956");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_SHARD_ID();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_seq_no" + "'", str16, "_seq_no");
    }

    @Test
    public void test11957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11957");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test11958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11958");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
    }

    @Test
    public void test11959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11959");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
    }

    @Test
    public void test11960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11960");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_ID();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11961");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test11962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11962");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
    }

    @Test
    public void test11963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11963");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "_id", "_index", "_version" };
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
    public void test11964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11964");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
    }

    @Test
    public void test11965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11965");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test11966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11966");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "_seq_no", "_version", "_version", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test11967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11967");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_SEQ_NO();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
    }

    @Test
    public void test11968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11968");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
    }

    @Test
    public void test11969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11969");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
    }

    @Test
    public void test11970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11970");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
    }

    @Test
    public void test11971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11971");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_shard_id", "_index", "_shard_id", "_version" };
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
    public void test11972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11972");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_shard_id", "_shard_id", "_seq_no", "_shard_id", "_version", "hi!" };
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
    public void test11973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11973");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_shard_id" + "'", str16, "_shard_id");
    }

    @Test
    public void test11974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11974");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test11975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11975");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_type", "_shard_id", "_version", "_id" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder9 = new org.elasticsearch.common.xcontent.XContentBuilder(xContent0, outputStream1, strArray7, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
    }

    @Test
    public void test11976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11976");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test11977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11977");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test11978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11978");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test11979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11979");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test11980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11980");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test11981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11981");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
    }

    @Test
    public void test11982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11982");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.Class<?> wildcardClass7 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test11983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11983");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
    }

    @Test
    public void test11984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11984");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "_id", "_index", "hi!", "_shard_id" };
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
    public void test11985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11985");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test11986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11986");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
    }

    @Test
    public void test11987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11987");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test11988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11988");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test11989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11989");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_SEQ_NO();
        java.lang.String str14 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
    }

    @Test
    public void test11990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11990");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test11991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11991");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test11992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11992");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test11993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11993");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
    }

    @Test
    public void test11994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11994");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_SEQ_NO();
        java.lang.String str15 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_seq_no" + "'", str15, "_seq_no");
    }

    @Test
    public void test11995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11995");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_version", "hi!", "_id", "_type" };
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
    public void test11996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11996");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test11997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11997");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
    }

    @Test
    public void test11998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11998");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_type", "", "_version", "hi!" };
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
    public void test11999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test11999");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test12000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest23.test12000");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }
}

