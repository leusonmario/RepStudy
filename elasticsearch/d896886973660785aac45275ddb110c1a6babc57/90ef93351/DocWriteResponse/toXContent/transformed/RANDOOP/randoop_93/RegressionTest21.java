import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest21 {

    public static boolean debug = false;

    @Test
    public void test10501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10501");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test10502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10502");
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
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_SEQ_NO();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
    }

    @Test
    public void test10503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10503");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test10504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10504");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test10505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10505");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "_type", "_seq_no", "_shard_id" };
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
    public void test10506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10506");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_seq_no", "_shard_id", "_index", "_version" };
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
    public void test10507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10507");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
    }

    @Test
    public void test10508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10508");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "_type", "", "_seq_no", "_version" };
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
    public void test10509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10509");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "_type", "_shard_id", "_index", "_id" };
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
    public void test10510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10510");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test10511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10511");
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
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_INDEX();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test10512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10512");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_type", "_seq_no", "hi!", "_seq_no", "_type", "_seq_no" };
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
    public void test10513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10513");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10514");
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
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SEQ_NO();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
    }

    @Test
    public void test10515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10515");
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
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_SEQ_NO();
        java.lang.String str16 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass17 = fields0.getClass();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_seq_no" + "'", str15, "_seq_no");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_seq_no" + "'", str16, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test10516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10516");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "", "hi!" };
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
    public void test10517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10517");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "_index", "", "", "_shard_id", "_index" };
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
    public void test10518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10518");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "", "_shard_id", "" };
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
    public void test10519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10519");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_seq_no", "hi!", "", "_seq_no" };
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
    public void test10520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10520");
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
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10521");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "_type", "", "_index", "_shard_id" };
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
    public void test10522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10522");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "_version", "_id", "hi!" };
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
    public void test10523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10523");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_shard_id", "_version", "_index", "_version" };
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
    public void test10524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10524");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_seq_no", "_index", "_seq_no", "_id", "_version", "_type" };
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
    public void test10525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10525");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_version", "_seq_no", "_version", "_version", "_shard_id" };
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
    public void test10526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10526");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_index", "_version", "" };
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
    public void test10527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10527");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_SHARD_ID();
        java.lang.String str16 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_shard_id" + "'", str15, "_shard_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_shard_id" + "'", str16, "_shard_id");
    }

    @Test
    public void test10528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10528");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "_index", "_type", "", "hi!" };
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
    public void test10529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10529");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_seq_no", "hi!", "_id", "_type" };
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
    public void test10530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10530");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_id", "_id", "_version", "_seq_no" };
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
    public void test10531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10531");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_type", "hi!", "_version", "_index" };
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
    public void test10532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10532");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10533");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10534");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10535");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test10536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10536");
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
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test10537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10537");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
    }

    @Test
    public void test10538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10538");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_index", "hi!", "_type" };
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
    public void test10539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10539");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test10540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10540");
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
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_VERSION();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test10541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10541");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_seq_no", "_seq_no", "_type" };
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
    public void test10542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10542");
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
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10543");
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
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_SHARD_ID();
        java.lang.String str16 = fields0.get_VERSION();
        java.lang.String str17 = fields0.get_TYPE();
        java.lang.String str18 = fields0.get_INDEX();
        java.lang.String str19 = fields0.get_SEQ_NO();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_shard_id" + "'", str15, "_shard_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_version" + "'", str16, "_version");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_type" + "'", str17, "_type");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_index" + "'", str18, "_index");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_seq_no" + "'", str19, "_seq_no");
    }

    @Test
    public void test10544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10544");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "", "_index", "" };
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
    public void test10545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10545");
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
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_SEQ_NO();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_seq_no" + "'", str16, "_seq_no");
    }

    @Test
    public void test10546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10546");
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
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_INDEX();
        java.lang.String str17 = fields0.get_SHARD_ID();
        java.lang.String str18 = fields0.get_SHARD_ID();
        java.lang.String str19 = fields0.get_SEQ_NO();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_shard_id" + "'", str17, "_shard_id");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_shard_id" + "'", str18, "_shard_id");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_seq_no" + "'", str19, "_seq_no");
    }

    @Test
    public void test10547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10547");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10548");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test10549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10549");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "hi!", "hi!", "", "_type" };
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
    public void test10550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10550");
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
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10551");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "_type", "_index", "_id" };
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
    public void test10552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10552");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "", "_type", "_seq_no" };
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
    public void test10553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10553");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
    }

    @Test
    public void test10554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10554");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_shard_id", "_index", "_type", "_shard_id" };
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
    public void test10555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10555");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
    }

    @Test
    public void test10556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10556");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_shard_id", "_index", "_id", "", "_version", "_shard_id" };
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
    public void test10557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10557");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "", "", "_index", "" };
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
    public void test10558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10558");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "", "_id", "_index", "_type", "_id" };
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
    public void test10559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10559");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10560");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass5 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test10561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10561");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "_index", "_version", "_index" };
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
    public void test10562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10562");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test10563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10563");
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
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
    }

    @Test
    public void test10564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10564");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_id", "_shard_id", "_id", "_seq_no", "_id", "_version" };
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
    public void test10565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10565");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
    }

    @Test
    public void test10566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10566");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "_shard_id", "_seq_no", "", "_index", "_seq_no" };
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
    public void test10567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10567");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test10568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10568");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "_type", "_shard_id", "_type" };
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
    public void test10569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10569");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_seq_no", "hi!", "_type", "hi!" };
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
    public void test10570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10570");
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
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_SHARD_ID();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
    }

    @Test
    public void test10571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10571");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test10572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10572");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "_type", "_type", "_shard_id", "hi!" };
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
    public void test10573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10573");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_id", "_type", "_shard_id", "hi!", "_id", "_seq_no" };
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
    public void test10574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10574");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test10575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10575");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_seq_no", "_shard_id", "_seq_no", "_version", "_seq_no" };
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
    public void test10576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10576");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "_seq_no", "_type", "_index" };
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
    public void test10577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10577");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass7 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10578");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_seq_no", "hi!", "_seq_no", "hi!", "_type", "hi!" };
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
    public void test10579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10579");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
    }

    @Test
    public void test10580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10580");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10581");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test10582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10582");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test10583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10583");
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
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10584");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
    }

    @Test
    public void test10585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10585");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_shard_id", "hi!", "_seq_no" };
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
    public void test10586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10586");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
    }

    @Test
    public void test10587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10587");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_index", "", "_shard_id", "hi!", "_type" };
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
    public void test10588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10588");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_id", "", "_id", "_index", "hi!" };
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
    public void test10589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10589");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
    }

    @Test
    public void test10590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10590");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
    }

    @Test
    public void test10591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10591");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
    }

    @Test
    public void test10592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10592");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "_version", "", "_version" };
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
    public void test10593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10593");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test10594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10594");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test10595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10595");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_seq_no", "_id", "_shard_id", "hi!", "_seq_no" };
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
    public void test10596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10596");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
    }

    @Test
    public void test10597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10597");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
    }

    @Test
    public void test10598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10598");
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
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test10599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10599");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "hi!", "_version" };
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
    public void test10600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10600");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test10601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10601");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "", "_shard_id" };
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
    public void test10602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10602");
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
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test10603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10603");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test10604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10604");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
    }

    @Test
    public void test10605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10605");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test10606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10606");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_id", "_version", "_shard_id" };
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
    public void test10607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10607");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test10608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10608");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test10609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10609");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test10610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10610");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
    }

    @Test
    public void test10611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10611");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_index", "", "_type" };
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
    public void test10612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10612");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
    }

    @Test
    public void test10613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10613");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_id", "hi!", "_shard_id", "_seq_no" };
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
    public void test10614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10614");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test10615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10615");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_SEQ_NO();
        java.lang.String str15 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
    }

    @Test
    public void test10616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10616");
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
        java.lang.String str14 = fields0.get_SEQ_NO();
        java.lang.String str15 = fields0.get_TYPE();
        java.lang.String str16 = fields0.get_TYPE();
        java.lang.String str17 = fields0.get_TYPE();
        java.lang.String str18 = fields0.get_ID();
        java.lang.String str19 = fields0.get_INDEX();
        java.lang.String str20 = fields0.get_ID();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_type" + "'", str16, "_type");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_type" + "'", str17, "_type");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_id" + "'", str18, "_id");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "_index" + "'", str19, "_index");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "_id" + "'", str20, "_id");
    }

    @Test
    public void test10617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10617");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "", "_index", "_type" };
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
    public void test10618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10618");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "_id", "_index", "_id", "_id" };
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
    public void test10619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10619");
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
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test10620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10620");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test10621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10621");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test10622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10622");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10623");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
    }

    @Test
    public void test10624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10624");
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
        java.lang.String str12 = fields0.get_INDEX();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
    }

    @Test
    public void test10625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10625");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "_shard_id", "_index", "_version", "_type", "_shard_id" };
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
    public void test10626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10626");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "_id", "_type", "_id", "hi!", "_type" };
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
    public void test10627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10627");
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
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10628");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test10629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10629");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_seq_no", "_version", "_id" };
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
    public void test10630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10630");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
    }

    @Test
    public void test10631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10631");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test10632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10632");
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
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10633");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test10634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10634");
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
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_ID();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
    }

    @Test
    public void test10635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10635");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
    }

    @Test
    public void test10636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10636");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test10637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10637");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "_shard_id", "_version", "", "_id" };
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
    public void test10638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10638");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10639");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test10640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10640");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test10641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10641");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_seq_no", "_version", "_seq_no", "_index", "_seq_no" };
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
    public void test10642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10642");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test10643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10643");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_seq_no", "hi!", "_type", "_type" };
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
    public void test10644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10644");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_SEQ_NO();
        java.lang.String str14 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
    }

    @Test
    public void test10645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10645");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_seq_no", "_index", "", "hi!", "hi!", "_version" };
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
    public void test10646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10646");
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
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SEQ_NO();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
    }

    @Test
    public void test10647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10647");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
    }

    @Test
    public void test10648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10648");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10649");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10650");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass6 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10651");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
    }

    @Test
    public void test10652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10652");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_seq_no", "_index", "hi!", "_type", "_version", "_type" };
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
    public void test10653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10653");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_seq_no" + "'", str15, "_seq_no");
    }

    @Test
    public void test10654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10654");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test10655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10655");
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
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_ID();
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10656");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_seq_no", "", "_version", "_shard_id" };
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
    public void test10657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10657");
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
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_ID();
        java.lang.String str16 = fields0.get_SHARD_ID();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_shard_id" + "'", str16, "_shard_id");
    }

    @Test
    public void test10658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10658");
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
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
    }

    @Test
    public void test10659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10659");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
    }

    @Test
    public void test10660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10660");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "_index", "_version", "hi!", "" };
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
    public void test10661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10661");
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
        java.lang.String str13 = fields0.get_VERSION();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test10662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10662");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_id", "_shard_id", "_index", "_index" };
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
    public void test10663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10663");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10664");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test10665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10665");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
    }

    @Test
    public void test10666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10666");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass7 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10667");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "_type", "", "hi!", "_version", "_seq_no" };
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
    public void test10668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10668");
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
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test10669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10669");
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
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_SEQ_NO();
        java.lang.String str15 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
    }

    @Test
    public void test10670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10670");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test10671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10671");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "_id", "_shard_id" };
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
    public void test10672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10672");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass7 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10673");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "_type", "_seq_no", "_index", "_type" };
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
    public void test10674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10674");
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
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10675");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_seq_no", "_shard_id", "_index", "_seq_no", "_id" };
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
    public void test10676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10676");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test10677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10677");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
    }

    @Test
    public void test10678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10678");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_shard_id", "_shard_id", "_type", "_index", "hi!", "_index" };
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
    public void test10679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10679");
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
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test10680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10680");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "_seq_no", "_seq_no", "hi!", "_id" };
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
    public void test10681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10681");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test10682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10682");
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
        java.lang.String str14 = fields0.get_SHARD_ID();
        java.lang.String str15 = fields0.get_SEQ_NO();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_seq_no" + "'", str15, "_seq_no");
    }

    @Test
    public void test10683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10683");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test10684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10684");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10685");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "_version", "_index", "hi!", "hi!", "_index" };
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
    public void test10686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10686");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "", "_version", "_id", "_shard_id" };
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
    public void test10687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10687");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
    }

    @Test
    public void test10688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10688");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
    }

    @Test
    public void test10689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10689");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "_version", "_seq_no", "_seq_no", "" };
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
    public void test10690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10690");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test10691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10691");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_version", "_id", "" };
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
    public void test10692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10692");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_VERSION();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
    }

    @Test
    public void test10693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10693");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "hi!", "_version", "_version", "_version", "_id" };
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
    public void test10694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10694");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10695");
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
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
    }

    @Test
    public void test10696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10696");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test10697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10697");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
    }

    @Test
    public void test10698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10698");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
    }

    @Test
    public void test10699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10699");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_seq_no", "_version", "hi!", "_version", "_index" };
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
    public void test10700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10700");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_index", "_seq_no", "" };
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
    public void test10701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10701");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "_id", "_type", "_type", "_shard_id", "_seq_no" };
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
    public void test10702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10702");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
    }

    @Test
    public void test10703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10703");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "_index", "_index", "_version" };
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
    public void test10704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10704");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
    }

    @Test
    public void test10705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10705");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_id", "", "_type" };
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
    public void test10706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10706");
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
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test10707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10707");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test10708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10708");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "_id", "_type", "_index", "hi!" };
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
    public void test10709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10709");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "_version", "_shard_id", "_seq_no", "_seq_no" };
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
    public void test10710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10710");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
    }

    @Test
    public void test10711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10711");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
    }

    @Test
    public void test10712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10712");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_shard_id", "_shard_id", "_shard_id", "_id" };
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
    public void test10713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10713");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10714");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray3 = new java.lang.String[] { "_shard_id", "_type" };
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder5 = org.elasticsearch.common.xcontent.XContentBuilder.builder(xContent0, strArray3, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
    }

    @Test
    public void test10715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10715");
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
        java.lang.String str14 = fields0.get_SHARD_ID();
        java.lang.String str15 = fields0.get_ID();
        java.lang.String str16 = fields0.get_VERSION();
        java.lang.String str17 = fields0.get_SHARD_ID();
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
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_version" + "'", str16, "_version");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_shard_id" + "'", str17, "_shard_id");
    }

    @Test
    public void test10716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10716");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_version", "_index", "_version", "_id", "hi!" };
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
    public void test10717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10717");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10718");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_id", "_id", "hi!", "" };
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
    public void test10719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10719");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_type", "_type", "_shard_id" };
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
    public void test10720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10720");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
    }

    @Test
    public void test10721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10721");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
    }

    @Test
    public void test10722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10722");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "_id", "_type", "_index" };
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
    public void test10723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10723");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_seq_no" + "'", str16, "_seq_no");
    }

    @Test
    public void test10724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10724");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "_index", "_type", "", "_version", "_index" };
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
    public void test10725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10725");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
    }

    @Test
    public void test10726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10726");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_SHARD_ID();
        java.lang.String str15 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
    }

    @Test
    public void test10727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10727");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_id", "_shard_id", "_version" };
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
    public void test10728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10728");
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
        java.lang.Class<?> wildcardClass15 = fields0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test10729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10729");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "_type", "_seq_no", "_id", "hi!" };
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
    public void test10730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10730");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass7 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10731");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_type", "_shard_id", "_id" };
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
    public void test10732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10732");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test10733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10733");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_SHARD_ID();
        java.lang.String str16 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_shard_id" + "'", str15, "_shard_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_type" + "'", str16, "_type");
    }

    @Test
    public void test10734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10734");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test10735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10735");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_type", "_shard_id", "_index" };
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
    public void test10736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10736");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "_shard_id", "_seq_no", "_index", "_id" };
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
    public void test10737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10737");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "_index", "_version", "_version" };
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
    public void test10738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10738");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test10739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10739");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_id", "_type", "_id", "_type" };
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
    public void test10740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10740");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10741");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "_type", "_index", "_type", "_shard_id" };
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
    public void test10742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10742");
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
        java.lang.String str12 = fields0.get_INDEX();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test10743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10743");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
    }

    @Test
    public void test10744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10744");
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
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10745");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test10746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10746");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
    }

    @Test
    public void test10747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10747");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "_version", "_type", "_type", "_shard_id" };
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
    public void test10748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10748");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_seq_no", "_shard_id", "", "_version" };
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
    public void test10749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10749");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test10750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10750");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_version", "_shard_id", "_index", "hi!" };
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
    public void test10751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10751");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
    }

    @Test
    public void test10752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10752");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
    }

    @Test
    public void test10753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10753");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "_id", "_shard_id", "_index", "_id", "_id" };
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
    public void test10754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10754");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
    }

    @Test
    public void test10755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10755");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
    }

    @Test
    public void test10756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10756");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_version", "_id", "_shard_id", "_index" };
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
    public void test10757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10757");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "hi!", "_id", "_type", "_version" };
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
    public void test10758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10758");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test10759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10759");
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
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10760");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "hi!", "_index", "hi!", "_shard_id" };
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
    public void test10761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10761");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "", "_type", "", "_id" };
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
    public void test10762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10762");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "_index", "_shard_id", "_type", "_shard_id" };
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
    public void test10763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10763");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10764");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "", "_id", "", "_type", "_seq_no" };
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
    public void test10765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10765");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "_shard_id", "_type", "_seq_no" };
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
    public void test10766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10766");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
    }

    @Test
    public void test10767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10767");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test10768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10768");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "_seq_no", "_version", "_seq_no", "" };
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
    public void test10769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10769");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
    }

    @Test
    public void test10770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10770");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
    }

    @Test
    public void test10771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10771");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "_shard_id", "_type", "_index", "_shard_id" };
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
    public void test10772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10772");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test10773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10773");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_ID();
        java.lang.Class<?> wildcardClass6 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10774");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "_version", "_type", "_seq_no", "_id", "_seq_no" };
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
    public void test10775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10775");
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
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
    }

    @Test
    public void test10776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10776");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10777");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "_shard_id", "_index", "_version" };
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
    public void test10778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10778");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_type", "_shard_id", "_index", "hi!", "_id", "_type" };
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
    public void test10779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10779");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_id", "_id", "_version", "_shard_id", "_id", "_index" };
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
    public void test10780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10780");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_type", "_type", "_shard_id" };
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
    public void test10781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10781");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
    }

    @Test
    public void test10782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10782");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
    }

    @Test
    public void test10783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10783");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test10784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10784");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
    }

    @Test
    public void test10785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10785");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "hi!", "hi!" };
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
    public void test10786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10786");
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
        java.lang.String str13 = fields0.get_TYPE();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
    }

    @Test
    public void test10787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10787");
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
        java.lang.String str13 = fields0.get_SEQ_NO();
        java.lang.String str14 = fields0.get_SHARD_ID();
        java.lang.String str15 = fields0.get_VERSION();
        java.lang.String str16 = fields0.get_INDEX();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
    }

    @Test
    public void test10788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10788");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test10789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10789");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
    }

    @Test
    public void test10790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10790");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10791");
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
        java.lang.String str11 = fields0.get_VERSION();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
    }

    @Test
    public void test10792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10792");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "_id", "_id" };
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
    public void test10793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10793");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_index", "_type", "_shard_id", "_seq_no" };
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
    public void test10794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10794");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
    }

    @Test
    public void test10795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10795");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "hi!", "hi!", "", "hi!" };
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
    public void test10796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10796");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
    }

    @Test
    public void test10797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10797");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
    }

    @Test
    public void test10798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10798");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
    }

    @Test
    public void test10799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10799");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_seq_no", "_seq_no", "_version", "_index", "_version" };
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
    public void test10800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10800");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
    }

    @Test
    public void test10801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10801");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
    }

    @Test
    public void test10802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10802");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10803");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "_type", "_id", "_seq_no", "_shard_id", "_index" };
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
    public void test10804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10804");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10805");
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
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test10806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10806");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test10807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10807");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_id", "_type", "_id", "" };
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
    public void test10808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10808");
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
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10809");
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
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_SEQ_NO();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_seq_no" + "'", str15, "_seq_no");
    }

    @Test
    public void test10810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10810");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10811");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test10812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10812");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "hi!", "", "_shard_id", "_index", "_seq_no" };
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
    public void test10813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10813");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
    }

    @Test
    public void test10814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10814");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
    }

    @Test
    public void test10815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10815");
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
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_INDEX();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test10816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10816");
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
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test10817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10817");
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
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SEQ_NO();
        java.lang.String str14 = fields0.get_ID();
        java.lang.String str15 = fields0.get_SHARD_ID();
        java.lang.String str16 = fields0.get_SEQ_NO();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_id" + "'", str14, "_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_shard_id" + "'", str15, "_shard_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_seq_no" + "'", str16, "_seq_no");
    }

    @Test
    public void test10818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10818");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
    }

    @Test
    public void test10819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10819");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test10820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10820");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test10821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10821");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test10822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10822");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
    }

    @Test
    public void test10823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10823");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "_version", "_index", "_index", "_type", "_version" };
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
    public void test10824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10824");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "hi!", "_index", "" };
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
    public void test10825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10825");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
    }

    @Test
    public void test10826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10826");
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
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_SHARD_ID();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
    }

    @Test
    public void test10827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10827");
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
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_SEQ_NO();
        java.lang.String str15 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass16 = fields0.getClass();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_index" + "'", str15, "_index");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test10828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10828");
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
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test10829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10829");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10830");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_version", "_index", "_version", "_shard_id", "", "_shard_id" };
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
    public void test10831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10831");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_seq_no", "_id", "_index", "_id", "_type", "hi!" };
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
    public void test10832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10832");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10833");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_ID();
        java.lang.Class<?> wildcardClass10 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test10834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10834");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_id", "_index", "_version" };
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
    public void test10835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10835");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10836");
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
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test10837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10837");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
    }

    @Test
    public void test10838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10838");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "_id", "hi!", "", "_shard_id", "_id" };
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
    public void test10839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10839");
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
        java.lang.Class<?> wildcardClass14 = fields0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test10840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10840");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_type", "", "", "_index" };
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
    public void test10841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10841");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "_version", "_type", "_shard_id", "_seq_no", "hi!" };
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
    public void test10842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10842");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "_shard_id", "hi!", "_version", "_type", "hi!" };
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
    public void test10843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10843");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "_id", "_id", "_type", "_index", "_type" };
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
    public void test10844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10844");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "_index", "hi!", "_id" };
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
    public void test10845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10845");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "_id", "", "hi!", "_index", "_id" };
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
    public void test10846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10846");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_seq_no", "hi!", "" };
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
    public void test10847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10847");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "_version", "_version", "_type" };
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
    public void test10848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10848");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10849");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass7 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10850");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
    }

    @Test
    public void test10851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10851");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "", "_type", "_index", "hi!", "", "_shard_id" };
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
    public void test10852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10852");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
    }

    @Test
    public void test10853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10853");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_seq_no", "_id", "", "hi!", "_id" };
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
    public void test10854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10854");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "", "_type", "_id" };
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
    public void test10855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10855");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test10856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10856");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10857");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
    }

    @Test
    public void test10858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10858");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test10859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10859");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "", "_type", "_shard_id" };
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
    public void test10860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10860");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_index", "_shard_id", "_id", "_id" };
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
    public void test10861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10861");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test10862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10862");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "_shard_id", "_type", "_version", "", "_shard_id" };
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
    public void test10863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10863");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test10864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10864");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_shard_id", "_shard_id", "hi!", "hi!", "_index", "_id" };
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
    public void test10865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10865");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test10866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10866");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_id", "", "_version", "_index", "_id" };
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
    public void test10867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10867");
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
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test10868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10868");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_version", "_index", "", "_index" };
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
    public void test10869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10869");
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
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_TYPE();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_type" + "'", str15, "_type");
    }

    @Test
    public void test10870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10870");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_seq_no", "_type", "_shard_id" };
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
    public void test10871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10871");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "_index", "_index", "_index" };
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
    public void test10872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10872");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_type", "_id", "_shard_id", "_type" };
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
    public void test10873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10873");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test10874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10874");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
    }

    @Test
    public void test10875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10875");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test10876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10876");
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
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
    }

    @Test
    public void test10877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10877");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
    }

    @Test
    public void test10878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10878");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_id", "_index", "hi!", "_index" };
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
    public void test10879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10879");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
    }

    @Test
    public void test10880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10880");
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
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
    }

    @Test
    public void test10881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10881");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_version", "_seq_no", "", "_index" };
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
    public void test10882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10882");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_seq_no", "_version", "_type", "", "_seq_no" };
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
    public void test10883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10883");
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
        java.lang.String str16 = fields0.get_INDEX();
        java.lang.String str17 = fields0.get_TYPE();
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_type" + "'", str17, "_type");
    }

    @Test
    public void test10884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10884");
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
        java.lang.String str11 = fields0.get_SHARD_ID();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test10885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10885");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10886");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test10887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10887");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test10888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10888");
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
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10889");
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
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
    }

    @Test
    public void test10890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10890");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "_type", "_id", "_id" };
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
    public void test10891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10891");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "_shard_id", "_index", "_id", "hi!", "_id" };
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
    public void test10892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10892");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test10893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10893");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "", "_index", "_version", "_type", "" };
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
    public void test10894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10894");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test10895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10895");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_shard_id", "_version", "_index", "_version", "_type", "_id" };
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
    public void test10896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10896");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test10897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10897");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test10898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10898");
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
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test10899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10899");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test10900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10900");
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
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_INDEX();
        java.lang.String str15 = fields0.get_SHARD_ID();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_shard_id" + "'", str15, "_shard_id");
    }

    @Test
    public void test10901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10901");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
    }

    @Test
    public void test10902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10902");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
    }

    @Test
    public void test10903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10903");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "_type" };
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
    public void test10904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10904");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test10905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10905");
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
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
    }

    @Test
    public void test10906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10906");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test10907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10907");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_type", "_shard_id", "_seq_no", "_type" };
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
    public void test10908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10908");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "_type", "_id", "_version" };
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
    public void test10909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10909");
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
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_index" + "'", str14, "_index");
    }

    @Test
    public void test10910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10910");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_seq_no", "_version", "hi!", "_index" };
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
    public void test10911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10911");
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
        java.lang.String str12 = fields0.get_SHARD_ID();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
    }

    @Test
    public void test10912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10912");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
    }

    @Test
    public void test10913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10913");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "_type", "_version", "", "_index" };
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
    public void test10914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10914");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
    }

    @Test
    public void test10915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10915");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test10916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10916");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_version", "_type", "_shard_id" };
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
    public void test10917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10917");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test10918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10918");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "", "_index", "hi!", "hi!" };
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
    public void test10919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10919");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test10920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10920");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
    }

    @Test
    public void test10921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10921");
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
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test10922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10922");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SHARD_ID();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_shard_id" + "'", str9, "_shard_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test10923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10923");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10924");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test10925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10925");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_version", "_version", "_id", "_version" };
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
    public void test10926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10926");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "_version", "hi!", "hi!", "" };
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
    public void test10927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10927");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
    }

    @Test
    public void test10928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10928");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
    }

    @Test
    public void test10929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10929");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
    }

    @Test
    public void test10930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10930");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_seq_no", "", "_version" };
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
    public void test10931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10931");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_ID();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10932");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10933");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray5 = new java.lang.String[] { "_shard_id", "_id", "" };
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
    public void test10934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10934");
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
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_ID();
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
    }

    @Test
    public void test10935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10935");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
    }

    @Test
    public void test10936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10936");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_shard_id", "_seq_no", "", "", "_index" };
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
    public void test10937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10937");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
    }

    @Test
    public void test10938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10938");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "_seq_no", "hi!", "_seq_no", "_id" };
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
    public void test10939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10939");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_ID();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_id" + "'", str13, "_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test10940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10940");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
    }

    @Test
    public void test10941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10941");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
    }

    @Test
    public void test10942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10942");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_VERSION();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_version" + "'", str2, "_version");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
    }

    @Test
    public void test10943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10943");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_id", "_shard_id", "_type" };
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
    public void test10944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10944");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_ID();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_id" + "'", str11, "_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
    }

    @Test
    public void test10945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10945");
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
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_VERSION();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_version" + "'", str12, "_version");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
    }

    @Test
    public void test10946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10946");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test10947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10947");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
    }

    @Test
    public void test10948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10948");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10949");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_shard_id", "", "hi!", "hi!", "_type" };
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
    public void test10950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10950");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_SHARD_ID();
        java.lang.String str13 = fields0.get_TYPE();
        java.lang.String str14 = fields0.get_TYPE();
        java.lang.String str15 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_shard_id" + "'", str12, "_shard_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_type" + "'", str13, "_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_type" + "'", str14, "_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_version" + "'", str15, "_version");
    }

    @Test
    public void test10951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10951");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test10952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10952");
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
        java.lang.String str10 = fields0.get_SEQ_NO();
        java.lang.String str11 = fields0.get_VERSION();
        java.lang.String str12 = fields0.get_ID();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_seq_no" + "'", str10, "_seq_no");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_version" + "'", str11, "_version");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test10953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10953");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "", "", "_type", "_seq_no", "hi!" };
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
    public void test10954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10954");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
    }

    @Test
    public void test10955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10955");
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
        java.lang.String str12 = fields0.get_ID();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10956");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_shard_id", "_index", "_version", "_id", "_shard_id", "_shard_id" };
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
    public void test10957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10957");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_ID();
        java.lang.String str10 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
    }

    @Test
    public void test10958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10958");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_TYPE();
        java.lang.String str12 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
    }

    @Test
    public void test10959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10959");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_VERSION();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_version" + "'", str4, "_version");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
    }

    @Test
    public void test10960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10960");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.Class<?> wildcardClass7 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test10961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10961");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "_shard_id", "hi!", "_id", "_seq_no" };
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
    public void test10962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10962");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "_version", "_id", "_index", "_shard_id" };
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
    public void test10963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10963");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_SHARD_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass12 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test10964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10964");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "_id", "_shard_id", "_shard_id", "" };
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
    public void test10965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10965");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!", "_shard_id", "_shard_id", "_id" };
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
    public void test10966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10966");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
    }

    @Test
    public void test10967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10967");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.Class<?> wildcardClass8 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test10968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10968");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_SHARD_ID();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SEQ_NO();
        java.lang.String str12 = fields0.get_INDEX();
        java.lang.String str13 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_shard_id" + "'", str3, "_shard_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_index" + "'", str12, "_index");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
    }

    @Test
    public void test10969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10969");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "_seq_no", "_index", "", "hi!" };
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
    public void test10970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10970");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test10971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10971");
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
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_shard_id" + "'", str4, "_shard_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10972");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_index", "_version", "_version", "_id", "hi!" };
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
    public void test10973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10973");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_INDEX();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_VERSION();
        java.lang.String str11 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_version" + "'", str10, "_version");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
    }

    @Test
    public void test10974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10974");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_ID();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_id" + "'", str5, "_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_seq_no" + "'", str11, "_seq_no");
    }

    @Test
    public void test10975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10975");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SEQ_NO();
        java.lang.String str7 = fields0.get_INDEX();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_VERSION();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_INDEX();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_SEQ_NO();
        java.lang.String str14 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_index" + "'", str7, "_index");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_version" + "'", str9, "_version");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_seq_no" + "'", str13, "_seq_no");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_seq_no" + "'", str14, "_seq_no");
    }

    @Test
    public void test10976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10976");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_TYPE();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_ID();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_TYPE();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_ID();
        java.lang.String str11 = fields0.get_TYPE();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_type" + "'", str2, "_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_type" + "'", str8, "_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_type" + "'", str11, "_type");
    }

    @Test
    public void test10977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10977");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_type", "_id", "_version", "", "_version" };
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
    public void test10978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10978");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_SHARD_ID();
        java.lang.String str2 = fields0.get_SEQ_NO();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_shard_id" + "'", str1, "_shard_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_seq_no" + "'", str2, "_seq_no");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
    }

    @Test
    public void test10979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10979");
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
        java.lang.String str10 = fields0.get_INDEX();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_ID();
        java.lang.String str13 = fields0.get_VERSION();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_index" + "'", str4, "_index");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_id" + "'", str6, "_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_id" + "'", str9, "_id");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_id" + "'", str12, "_id");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_version" + "'", str13, "_version");
    }

    @Test
    public void test10980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10980");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_INDEX();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.Class<?> wildcardClass6 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_index" + "'", str3, "_index");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test10981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10981");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "_version", "_index", "", "_id" };
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
    public void test10982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10982");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_VERSION();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_SHARD_ID();
        java.lang.String str11 = fields0.get_SHARD_ID();
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_version" + "'", str8, "_version");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_shard_id" + "'", str10, "_shard_id");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_shard_id" + "'", str11, "_shard_id");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10983");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_shard_id", "", "" };
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
    public void test10984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10984");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray6 = new java.lang.String[] { "_id", "", "_index", "" };
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
    public void test10985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10985");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_TYPE();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_INDEX();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SHARD_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.String str9 = fields0.get_TYPE();
        java.lang.String str10 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_type" + "'", str1, "_type");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_index" + "'", str5, "_index");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_type" + "'", str9, "_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_index" + "'", str10, "_index");
    }

    @Test
    public void test10986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10986");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_INDEX();
        java.lang.String str7 = fields0.get_SHARD_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_index" + "'", str6, "_index");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_shard_id" + "'", str7, "_shard_id");
    }

    @Test
    public void test10987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10987");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_ID();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_ID();
        java.lang.String str8 = fields0.get_INDEX();
        java.lang.Class<?> wildcardClass9 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_id" + "'", str3, "_id");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_id" + "'", str7, "_id");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_index" + "'", str8, "_index");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test10988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10988");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "_index", "", "_id" };
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
    public void test10989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10989");
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
        java.lang.String str12 = fields0.get_TYPE();
        java.lang.String str13 = fields0.get_INDEX();
        java.lang.String str14 = fields0.get_SHARD_ID();
        java.lang.String str15 = fields0.get_SHARD_ID();
        java.lang.String str16 = fields0.get_SEQ_NO();
        java.lang.String str17 = fields0.get_SEQ_NO();
        java.lang.String str18 = fields0.get_TYPE();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_type" + "'", str12, "_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_shard_id" + "'", str14, "_shard_id");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_shard_id" + "'", str15, "_shard_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_seq_no" + "'", str16, "_seq_no");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "_seq_no" + "'", str17, "_seq_no");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "_type" + "'", str18, "_type");
    }

    @Test
    public void test10990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10990");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_TYPE();
        java.lang.String str8 = fields0.get_SHARD_ID();
        java.lang.String str9 = fields0.get_INDEX();
        java.lang.String str10 = fields0.get_TYPE();
        java.lang.String str11 = fields0.get_INDEX();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_type" + "'", str7, "_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_shard_id" + "'", str8, "_shard_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_index" + "'", str9, "_index");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_type" + "'", str10, "_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "_index" + "'", str11, "_index");
    }

    @Test
    public void test10991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10991");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_INDEX();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_VERSION();
        java.lang.String str6 = fields0.get_TYPE();
        java.lang.String str7 = fields0.get_SEQ_NO();
        java.lang.String str8 = fields0.get_ID();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_ID();
        java.lang.Class<?> wildcardClass11 = fields0.getClass();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_index" + "'", str2, "_index");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_version" + "'", str5, "_version");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_type" + "'", str6, "_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_id" + "'", str8, "_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test10992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10992");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.lang.String[] strArray7 = new java.lang.String[] { "_index", "_id", "_shard_id", "_seq_no", "_seq_no", "hi!" };
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
    public void test10993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10993");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_ID();
        java.lang.String str2 = fields0.get_SHARD_ID();
        java.lang.String str3 = fields0.get_TYPE();
        java.lang.String str4 = fields0.get_ID();
        java.lang.String str5 = fields0.get_TYPE();
        java.lang.String str6 = fields0.get_VERSION();
        java.lang.String str7 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_id" + "'", str1, "_id");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_shard_id" + "'", str2, "_shard_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_type" + "'", str3, "_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_id" + "'", str4, "_id");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_type" + "'", str5, "_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_version" + "'", str6, "_version");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_seq_no" + "'", str7, "_seq_no");
    }

    @Test
    public void test10994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10994");
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
        java.lang.String str12 = fields0.get_SEQ_NO();
        java.lang.String str13 = fields0.get_INDEX();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "_seq_no" + "'", str12, "_seq_no");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_index" + "'", str13, "_index");
    }

    @Test
    public void test10995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10995");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "_shard_id", "_type", "hi!", "_index", "_index" };
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
    public void test10996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10996");
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
        java.lang.Class<?> wildcardClass13 = fields0.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test10997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10997");
        org.elasticsearch.common.xcontent.XContent xContent0 = null;
        java.io.OutputStream outputStream1 = null;
        java.lang.String[] strArray8 = new java.lang.String[] { "_shard_id", "_seq_no", "", "_index", "_seq_no", "_index" };
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
    public void test10998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10998");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_INDEX();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_VERSION();
        java.lang.String str4 = fields0.get_SEQ_NO();
        java.lang.String str5 = fields0.get_SEQ_NO();
        java.lang.String str6 = fields0.get_SEQ_NO();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_index" + "'", str1, "_index");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_version" + "'", str3, "_version");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_seq_no" + "'", str4, "_seq_no");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_seq_no" + "'", str5, "_seq_no");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_seq_no" + "'", str6, "_seq_no");
    }

    @Test
    public void test10999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test10999");
        org.elasticsearch.action.DocWriteResponse.Fields fields0 = new org.elasticsearch.action.DocWriteResponse.Fields();
        java.lang.String str1 = fields0.get_VERSION();
        java.lang.String str2 = fields0.get_ID();
        java.lang.String str3 = fields0.get_SEQ_NO();
        java.lang.String str4 = fields0.get_TYPE();
        java.lang.String str5 = fields0.get_SHARD_ID();
        java.lang.String str6 = fields0.get_SHARD_ID();
        java.lang.String str7 = fields0.get_VERSION();
        java.lang.String str8 = fields0.get_SEQ_NO();
        java.lang.String str9 = fields0.get_SEQ_NO();
        java.lang.String str10 = fields0.get_ID();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "_version" + "'", str1, "_version");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "_id" + "'", str2, "_id");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "_seq_no" + "'", str3, "_seq_no");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "_type" + "'", str4, "_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "_shard_id" + "'", str5, "_shard_id");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "_shard_id" + "'", str6, "_shard_id");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "_version" + "'", str7, "_version");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "_seq_no" + "'", str8, "_seq_no");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "_seq_no" + "'", str9, "_seq_no");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "_id" + "'", str10, "_id");
    }

    @Test
    public void test11000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest21.test11000");
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
        java.lang.String str13 = fields0.get_SHARD_ID();
        java.lang.String str14 = fields0.get_VERSION();
        java.lang.String str15 = fields0.get_ID();
        java.lang.String str16 = fields0.get_INDEX();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "_shard_id" + "'", str13, "_shard_id");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "_version" + "'", str14, "_version");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "_id" + "'", str15, "_id");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "_index" + "'", str16, "_index");
    }
}

