import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test001");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.common.bytes.BytesReference bytesReference9 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference9.equals(null)", !bytesReference9.equals(null));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        java.lang.String str19 = multiMatchQueryBuilder18.queryName();
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.maxExpansions((int) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        java.lang.String str15 = multiMatchQueryBuilder12.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder12.tieBreaker((float) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference13.equals(null)", !bytesReference13.equals(null));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.cutoffFrequency((float) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.boost((float) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder14.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.type(type20);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.maxExpansions((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.prefixLength((int) '4');
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.queryName("");
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.prefixLength((int) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.useDisMax(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.tieBreaker((float) (short) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        float float19 = multiMatchQueryBuilder18.boost();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray27);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type33 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float34 = type33.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder30.type(type33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder30.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder30.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type40 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type41 = type40.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder30.type(type40);
        org.elasticsearch.index.search.MatchQuery.Type type43 = type40.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder18.type(type40);
        org.elasticsearch.common.bytes.BytesReference bytesReference45 = multiMatchQueryBuilder44.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference45.equals(null)", !bytesReference45.equals(null));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type36 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float37 = type36.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder33.type(type36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder33.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder33.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type43 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type44 = type43.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder33.type(type43);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder22.type(type43);
        org.elasticsearch.common.bytes.BytesReference bytesReference47 = multiMatchQueryBuilder46.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference47.equals(null)", !bytesReference47.equals(null));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str11 = multiMatchQueryBuilder8.toString();
        java.lang.String str12 = multiMatchQueryBuilder8.getName();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference13.equals(null)", !bytesReference13.equals(null));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder14.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str18 = multiMatchQueryBuilder10.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.tieBreaker(10.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.QueryValidationException queryValidationException23 = multiMatchQueryBuilder18.validate();
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.cutoffFrequency((float) (-1L));
        java.lang.String str21 = multiMatchQueryBuilder20.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder20.prefixLength((int) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.cutoffFrequency((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.lang.String[] strArray2 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder3 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (short) 100, strArray2);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder5 = multiMatchQueryBuilder3.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = multiMatchQueryBuilder3.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference8 = multiMatchQueryBuilder3.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference8.equals(null)", !bytesReference8.equals(null));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str19 = multiMatchQueryBuilder18.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder24.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder34.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.useDisMax(true);
        java.lang.String str21 = multiMatchQueryBuilder18.getName();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.fuzzyRewrite("hi!");
        java.lang.String str35 = multiMatchQueryBuilder32.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type36 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder32.type(type36);
        org.elasticsearch.index.search.MatchQuery.Type type38 = type36.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder18.type(type36);
        org.elasticsearch.common.bytes.BytesReference bytesReference40 = multiMatchQueryBuilder39.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference40.equals(null)", !bytesReference40.equals(null));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.tieBreaker(0.0f);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        java.lang.String str30 = multiMatchQueryBuilder27.getName();
        float float31 = multiMatchQueryBuilder27.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder27.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder27.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder27.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder27.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder27.cutoffFrequency((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder27.cutoffFrequency((float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder27.slop((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder14.fuzziness((java.lang.Object) multiMatchQueryBuilder45);
        org.elasticsearch.common.bytes.BytesReference bytesReference47 = multiMatchQueryBuilder46.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference47.equals(null)", !bytesReference47.equals(null));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type36 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float37 = type36.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder33.type(type36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder33.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder33.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type43 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type44 = type43.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder33.type(type43);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder22.type(type43);
        org.elasticsearch.common.bytes.BytesReference bytesReference47 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference47.equals(null)", !bytesReference47.equals(null));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.useDisMax(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference13.equals(null)", !bytesReference13.equals(null));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder26.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : 100,\n    \"rewrite\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}", (float) 100L);
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.maxExpansions(10);
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.cutoffFrequency(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.field("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder18.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"boost\" : 1.0\n  }\n}", (float) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        boolean boolean21 = multiMatchQueryBuilder16.equals((java.lang.Object) type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder16.tieBreaker((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder16.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimumShouldMatch\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.useDisMax(false);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.minimumShouldMatch("multi_match");
        boolean boolean40 = multiMatchQueryBuilder10.equals((java.lang.Object) "multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder10.cutoffFrequency((float) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference43 = multiMatchQueryBuilder42.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference43.equals(null)", !bytesReference43.equals(null));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.boost((float) 10L);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.prefixLength((int) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.boost((float) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        java.lang.String str16 = multiMatchQueryBuilder10.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray34);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder39.field("", 1.0f);
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray52);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder55.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder57.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder59.rewrite("multi_match");
        java.lang.String str62 = multiMatchQueryBuilder61.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder61.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder64.lenient(false);
        java.lang.String str67 = multiMatchQueryBuilder66.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder66.prefixLength((int) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = multiMatchQueryBuilder39.fuzziness((java.lang.Object) multiMatchQueryBuilder66);
        boolean boolean71 = multiMatchQueryBuilder26.equals((java.lang.Object) multiMatchQueryBuilder66);
        org.elasticsearch.common.bytes.BytesReference bytesReference72 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference72.equals(null)", !bytesReference72.equals(null));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.prefixLength(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.type(type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"type\" : \"phrase_prefix\",\n    \"minimum_should_match\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        java.lang.String str11 = multiMatchQueryBuilder10.getWriteableName();
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference12.equals(null)", !bytesReference12.equals(null));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.maxExpansions((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder20.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"maxExpansions\" : 1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 0.0,\n    \"boost\" : 0.0\n  }\n}", (float) (-1));
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder14.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.fuzzyRewrite("hi!");
        java.lang.String str42 = multiMatchQueryBuilder39.getName();
        float float43 = multiMatchQueryBuilder39.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder39.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder39.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder39.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder24.fuzziness((java.lang.Object) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder50.boost((float) (-1));
        org.elasticsearch.common.bytes.BytesReference bytesReference55 = multiMatchQueryBuilder54.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference55.equals(null)", !bytesReference55.equals(null));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.fuzzyRewrite("hi!");
        java.lang.String str42 = multiMatchQueryBuilder39.getName();
        float float43 = multiMatchQueryBuilder39.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder39.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder39.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder39.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder24.fuzziness((java.lang.Object) (-1L));
        float float51 = multiMatchQueryBuilder24.boost();
        org.elasticsearch.common.bytes.BytesReference bytesReference52 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference52.equals(null)", !bytesReference52.equals(null));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder10.slop(100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder10.rewrite("");
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.minimumShouldMatch("");
        java.lang.String str22 = multiMatchQueryBuilder19.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.tieBreaker((float) '#');
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.boost((float) 10L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder14.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\" ],\n    \"fuzzyRewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}", (float) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type21 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type22 = type21.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder18.type(type21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.prefixLength((int) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"max_expansions\\\" : 10,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 0.0,\\n    \\\"cutoff_frequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}^1.0\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : false,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float21 = type20.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (short) -1);
        java.lang.String str25 = multiMatchQueryBuilder22.getName();
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.prefixLength((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.prefixLength(1);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.field("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type32 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float33 = type32.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder29.type(type32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder29.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder29.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder38.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder10.fuzziness((java.lang.Object) multiMatchQueryBuilder38);
        org.elasticsearch.common.bytes.BytesReference bytesReference43 = multiMatchQueryBuilder38.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference43.equals(null)", !bytesReference43.equals(null));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.fuzzyRewrite("hi!");
        java.lang.String str26 = multiMatchQueryBuilder23.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder23.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder23.prefixLength((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.tieBreaker(0.0f);
        boolean boolean33 = multiMatchQueryBuilder12.equals((java.lang.Object) multiMatchQueryBuilder32);
        org.elasticsearch.common.bytes.BytesReference bytesReference34 = multiMatchQueryBuilder32.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference34.equals(null)", !bytesReference34.equals(null));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.cutoffFrequency((float) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.fuzzyRewrite("hi!");
        java.lang.String str42 = multiMatchQueryBuilder39.getName();
        float float43 = multiMatchQueryBuilder39.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder39.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder39.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder39.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder24.fuzziness((java.lang.Object) (-1L));
        float float51 = multiMatchQueryBuilder50.boost();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray59);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder60.prefixLength(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder50.fuzziness((java.lang.Object) multiMatchQueryBuilder60);
        org.elasticsearch.common.bytes.BytesReference bytesReference66 = multiMatchQueryBuilder60.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference66.equals(null)", !bytesReference66.equals(null));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.field("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type32 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float33 = type32.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder29.type(type32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder29.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder29.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder38.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder10.fuzziness((java.lang.Object) multiMatchQueryBuilder38);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.maxExpansions(0);
        java.lang.String str45 = multiMatchQueryBuilder44.getWriteableName();
        java.lang.String str46 = multiMatchQueryBuilder44.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder44.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\" ],\n    \"fuzzyRewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference49 = multiMatchQueryBuilder44.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference49.equals(null)", !bytesReference49.equals(null));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type24 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.common.ParseField parseField25 = type24.parseField();
        boolean boolean26 = multiMatchQueryBuilder21.equals((java.lang.Object) parseField25);
        java.lang.String str27 = multiMatchQueryBuilder21.getName();
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.String[] strArray2 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder3 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (short) 100, strArray2);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray11);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder3, strArray11);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder13.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}", 0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        float float27 = multiMatchQueryBuilder26.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder26.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.useDisMax(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.tieBreaker((float) '4');
        java.lang.String str18 = multiMatchQueryBuilder17.getName();
        java.lang.String str19 = multiMatchQueryBuilder17.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        java.lang.String str15 = multiMatchQueryBuilder12.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder12.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder14.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}", (float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"cutoff_frequency\" : 1.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder15.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\" ],\n    \"fuzzyRewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}", (float) ' ');
        java.lang.String str23 = multiMatchQueryBuilder15.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder15.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.cutoffFrequency((float) 100);
        java.lang.String str13 = multiMatchQueryBuilder12.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type14 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type15 = type14.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type16 = type14.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder12.type(type14);
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str11 = multiMatchQueryBuilder8.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.boost((float) (short) 1);
        java.lang.String str14 = multiMatchQueryBuilder13.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder13.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"multi_match^0.0\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder13.slop((int) '#');
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 1,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"\",\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        java.lang.String str31 = multiMatchQueryBuilder28.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder28.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference34 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference34.equals(null)", !bytesReference34.equals(null));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.boost(10.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder18.slop((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder18.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\" ],\n    \"fuzzyRewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.prefixLength((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.tieBreaker((float) 10L);
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.fuzzyRewrite("hi!");
        java.lang.String str42 = multiMatchQueryBuilder39.getName();
        float float43 = multiMatchQueryBuilder39.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder39.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder39.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder39.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder24.fuzziness((java.lang.Object) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder50.minimumShouldMatch("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder50.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference57 = multiMatchQueryBuilder50.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference57.equals(null)", !bytesReference57.equals(null));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.tieBreaker((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.prefixLength((int) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.useDisMax(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder24.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"prefix_length\" : 100,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference37 = multiMatchQueryBuilder36.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference37.equals(null)", !bytesReference37.equals(null));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException17 = multiMatchQueryBuilder16.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type18 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.type((java.lang.Object) type18);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.lenient(false);
        java.lang.String str19 = multiMatchQueryBuilder14.queryName();
        org.elasticsearch.index.query.QueryValidationException queryValidationException20 = multiMatchQueryBuilder14.validate();
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.useDisMax(false);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.minimumShouldMatch("multi_match");
        boolean boolean40 = multiMatchQueryBuilder10.equals((java.lang.Object) "multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder10.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray50);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type56 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float57 = type56.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder53.type(type56);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder53.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder53.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type63 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type64 = type63.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder53.type(type63);
        org.elasticsearch.common.ParseField parseField66 = type63.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder10.type(type63);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = multiMatchQueryBuilder10.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder74 = multiMatchQueryBuilder10.cutoffFrequency(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference75 = multiMatchQueryBuilder74.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference75.equals(null)", !bytesReference75.equals(null));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        java.lang.String str15 = multiMatchQueryBuilder12.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder12.tieBreaker((float) 'a');
        float float18 = multiMatchQueryBuilder12.boost();
        org.elasticsearch.index.query.QueryValidationException queryValidationException19 = multiMatchQueryBuilder12.validate();
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.boost((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder18.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.cutoffFrequency((float) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("hi!");
        java.lang.String str37 = multiMatchQueryBuilder34.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder34.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.cutoffFrequency((float) (short) 1);
        java.lang.String str42 = multiMatchQueryBuilder39.getWriteableName();
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray50);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.QueryValidationException queryValidationException56 = multiMatchQueryBuilder53.validate();
        java.lang.String[] strArray64 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder65.fuzzyRewrite("");
        java.lang.String[] strArray75 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray75);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder76.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = multiMatchQueryBuilder78.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type81 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float82 = type81.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder83 = multiMatchQueryBuilder78.type(type81);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder85 = multiMatchQueryBuilder78.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder87 = multiMatchQueryBuilder78.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type88 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type89 = type88.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder90 = multiMatchQueryBuilder78.type(type88);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder91 = multiMatchQueryBuilder65.fuzziness((java.lang.Object) type88);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder92 = multiMatchQueryBuilder53.type(type88);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder93 = multiMatchQueryBuilder39.type(type88);
        org.elasticsearch.index.search.MatchQuery.Type type94 = type88.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder95 = multiMatchQueryBuilder23.type(type88);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder97 = multiMatchQueryBuilder23.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"boost\" : 0.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference98 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference98.equals(null)", !bytesReference98.equals(null));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.lenient(false);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        boolean boolean40 = multiMatchQueryBuilder22.equals((java.lang.Object) multiMatchQueryBuilder39);
        org.elasticsearch.common.bytes.BytesReference bytesReference41 = multiMatchQueryBuilder39.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference41.equals(null)", !bytesReference41.equals(null));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"prefix_length\" : -1,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"multi_match^0.0\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 0.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder30.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.minimumShouldMatch("");
        float float22 = multiMatchQueryBuilder21.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}", (float) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 1,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"\",\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        java.lang.String str31 = multiMatchQueryBuilder28.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder28.maxExpansions((int) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference34 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference34.equals(null)", !bytesReference34.equals(null));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.useDisMax(false);
        java.lang.String str25 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.cutoffFrequency((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        float float27 = multiMatchQueryBuilder26.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder26.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder26.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.boost((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder16.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder16.cutoffFrequency((float) 10L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder16.boost((float) (byte) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.QueryValidationException queryValidationException13 = multiMatchQueryBuilder10.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 52.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.boost((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"analyzer\" : \"multi_match\",\n    \"fuzziness\" : \"{\\n  \\\"MULTI_MATCH\\\" : {\\n    \\\"QUERY\\\" : 0.0,\\n    \\\"FIELDS\\\" : [ \\\"HI!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"FUZZY_REWRITE\\\" : \\\"\\\",\\n    \\\"CUTOFF_FREQUENCY\\\" : 100.0,\\n    \\\"BOOST\\\" : 52.0\\n  }\\n}\",\n    \"prefix_length\" : 97,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"cutoff_frequency\" : 1.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float21 = type20.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.boost(10.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.cutoffFrequency((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) 0);
        float float26 = multiMatchQueryBuilder25.boost();
        java.lang.String str27 = multiMatchQueryBuilder25.queryName();
        float float28 = multiMatchQueryBuilder25.boost();
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.useDisMax(true);
        java.lang.Class<?> wildcardClass43 = multiMatchQueryBuilder40.getClass();
        boolean boolean44 = multiMatchQueryBuilder23.equals((java.lang.Object) multiMatchQueryBuilder40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder23.prefixLength((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder23.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference51 = multiMatchQueryBuilder50.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference51.equals(null)", !bytesReference51.equals(null));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type21 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type22 = type21.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder18.type(type21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.prefixLength((int) 'a');
        java.lang.String str26 = multiMatchQueryBuilder25.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder25.slop((int) '4');
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.prefixLength(0);
        java.lang.String str22 = multiMatchQueryBuilder10.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.maxExpansions(1);
        org.elasticsearch.index.query.QueryValidationException queryValidationException15 = multiMatchQueryBuilder14.validate();
        java.lang.String str16 = multiMatchQueryBuilder14.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder14.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"cutoff_frequency\" : 1.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder14.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : 32,\n    \"prefix_length\" : 0,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type30 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float31 = type30.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder27.type(type30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder27.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder27.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type37 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type38 = type37.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder27.type(type37);
        org.elasticsearch.index.search.MatchQuery.Type type40 = type37.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder14.type(type37);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder14.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder14.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : 100,\n    \"rewrite\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str48 = multiMatchQueryBuilder45.getName();
        org.elasticsearch.common.bytes.BytesReference bytesReference49 = multiMatchQueryBuilder45.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference49.equals(null)", !bytesReference49.equals(null));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder16.slop(100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder16.cutoffFrequency((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : 0,\n    \"prefix_length\" : 0,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder25.lenient(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.useDisMax(false);
        java.lang.String str25 = multiMatchQueryBuilder10.getWriteableName();
        java.lang.String str26 = multiMatchQueryBuilder10.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder$Type\",\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference13.equals(null)", !bytesReference13.equals(null));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        java.lang.String str15 = multiMatchQueryBuilder12.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder12.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.lenient(false);
        java.lang.String str20 = multiMatchQueryBuilder17.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.prefixLength((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.maxExpansions((int) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.field("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.cutoffFrequency(1.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"hi!\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"multi_match^0.0\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"prefix_length\\\" : 97,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.maxExpansions((int) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder24.tieBreaker((float) (-1));
        org.elasticsearch.common.bytes.BytesReference bytesReference33 = multiMatchQueryBuilder32.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference33.equals(null)", !bytesReference33.equals(null));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.field("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.boost((float) (short) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.maxExpansions((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder20.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"maxExpansions\" : 1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 0.0,\n    \"boost\" : 0.0\n  }\n}", (float) (-1));
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.tieBreaker((float) '4');
        org.elasticsearch.index.query.QueryValidationException queryValidationException18 = multiMatchQueryBuilder17.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.boost((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.rewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"Name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.QueryValidationException queryValidationException25 = multiMatchQueryBuilder22.validate();
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        float float27 = multiMatchQueryBuilder26.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder26.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str30 = multiMatchQueryBuilder29.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder29.cutoffFrequency((float) (short) 10);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder43.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder43.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder43.prefixLength((int) (short) 10);
        boolean boolean52 = multiMatchQueryBuilder29.equals((java.lang.Object) multiMatchQueryBuilder43);
        org.elasticsearch.common.bytes.BytesReference bytesReference53 = multiMatchQueryBuilder43.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference53.equals(null)", !bytesReference53.equals(null));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.cutoffFrequency((float) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder12.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"multi_match^0.0\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder12.type(type19);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.lenient(false);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        boolean boolean40 = multiMatchQueryBuilder22.equals((java.lang.Object) multiMatchQueryBuilder39);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder39.prefixLength((int) '4');
        org.elasticsearch.common.bytes.BytesReference bytesReference43 = multiMatchQueryBuilder42.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference43.equals(null)", !bytesReference43.equals(null));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.lang.String[] strArray2 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder3 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (short) 100, strArray2);
        org.elasticsearch.common.bytes.BytesReference bytesReference4 = multiMatchQueryBuilder3.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference4.equals(null)", !bytesReference4.equals(null));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.maxExpansions(1);
        org.elasticsearch.index.query.QueryValidationException queryValidationException15 = multiMatchQueryBuilder14.validate();
        java.lang.String str16 = multiMatchQueryBuilder14.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.QueryValidationException queryValidationException19 = multiMatchQueryBuilder14.validate();
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray27);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.cutoffFrequency((float) 100);
        java.lang.String str33 = multiMatchQueryBuilder32.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type34 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type35 = type34.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type36 = type34.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder32.type(type34);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder14.type(type34);
        org.elasticsearch.common.bytes.BytesReference bytesReference39 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference39.equals(null)", !bytesReference39.equals(null));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.tieBreaker((float) '4');
        org.elasticsearch.index.query.QueryValidationException queryValidationException18 = multiMatchQueryBuilder17.validate();
        java.lang.String str19 = multiMatchQueryBuilder17.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"prefix_length\" : -1,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"multi_match^0.0\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 0.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.QueryValidationException queryValidationException13 = multiMatchQueryBuilder10.validate();
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("");
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type38 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float39 = type38.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.type(type38);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder35.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder35.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type45 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type46 = type45.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder35.type(type45);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder22.fuzziness((java.lang.Object) type45);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder10.type(type45);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference52 = multiMatchQueryBuilder51.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference52.equals(null)", !bytesReference52.equals(null));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder14.prefixLength((int) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}^1.0\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"cutoffFrequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder20.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) (-1));
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type21 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type22 = type21.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder18.type(type21);
        java.lang.String str24 = multiMatchQueryBuilder18.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type30 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float31 = type30.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder27.type(type30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder27.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder27.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type37 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type38 = type37.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder27.type(type37);
        org.elasticsearch.index.search.MatchQuery.Type type40 = type37.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder14.type(type37);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder14.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.boost((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder43.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference48 = multiMatchQueryBuilder43.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference48.equals(null)", !bytesReference48.equals(null));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.tieBreaker((float) '4');
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.cutoffFrequency((float) 100);
        java.lang.String[] strArray15 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (short) 100, strArray15);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder16, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder12, strArray24);
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.useDisMax(false);
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.minimumShouldMatch("multi_match");
        boolean boolean40 = multiMatchQueryBuilder10.equals((java.lang.Object) "multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder10.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray50);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type56 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float57 = type56.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder53.type(type56);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder53.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder53.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type63 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type64 = type63.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder53.type(type63);
        org.elasticsearch.common.ParseField parseField66 = type63.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder10.type(type63);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference70 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference70.equals(null)", !bytesReference70.equals(null));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.fuzzyRewrite("hi!");
        java.lang.String str42 = multiMatchQueryBuilder39.getName();
        float float43 = multiMatchQueryBuilder39.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder39.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder39.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder39.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder24.fuzziness((java.lang.Object) (-1L));
        float float51 = multiMatchQueryBuilder50.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder50.cutoffFrequency((float) 1L);
        org.elasticsearch.common.bytes.BytesReference bytesReference54 = multiMatchQueryBuilder50.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference54.equals(null)", !bytesReference54.equals(null));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        java.lang.String str20 = multiMatchQueryBuilder19.queryName();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray28);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.fuzzyRewrite("hi!");
        java.lang.String str34 = multiMatchQueryBuilder31.getName();
        float float35 = multiMatchQueryBuilder31.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder31.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder31.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type40 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type41 = type40.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type42 = type40.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder31.type(type40);
        org.elasticsearch.common.ParseField parseField44 = type40.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder19.fuzziness((java.lang.Object) parseField44);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder19.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.prefixLength(0);
        org.elasticsearch.common.bytes.BytesReference bytesReference52 = multiMatchQueryBuilder51.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference52.equals(null)", !bytesReference52.equals(null));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.useDisMax(true);
        float float15 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder$Type\",\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"use_dis_max\" : false,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzziness\" : \"BEST_FIELDS\",\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder17.prefixLength((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"minimum_should_match\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0,\n    \"cutoff_frequency\" : 1.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.slop((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.tieBreaker((float) 10L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.lenient(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}", (float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"^0.0\", \"^0.0\", \"^0.0\", \"^0.0\", \"^0.0\" ],\n    \"analyzer\" : \"\",\n    \"max_expansions\" : 32,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"PHRASE_PREFIX\\\",\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzziness\\\" : \\\"10\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"multi_match^0.0\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"prefix_length\\\" : 97,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 0.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder29.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"type\" : \"phrase_prefix\",\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 52.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder35.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.cutoffFrequency((float) (short) 1);
        java.lang.String str18 = multiMatchQueryBuilder15.getWriteableName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.QueryValidationException queryValidationException32 = multiMatchQueryBuilder29.validate();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.fuzzyRewrite("");
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray51);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type57 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float58 = type57.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder54.type(type57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder54.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder54.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type64 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type65 = type64.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder54.type(type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder41.fuzziness((java.lang.Object) type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder29.type(type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder15.type(type64);
        org.elasticsearch.common.bytes.BytesReference bytesReference70 = multiMatchQueryBuilder69.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference70.equals(null)", !bytesReference70.equals(null));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.maxExpansions((int) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.tieBreaker((float) 0L);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type24 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.common.ParseField parseField25 = type24.parseField();
        boolean boolean26 = multiMatchQueryBuilder21.equals((java.lang.Object) parseField25);
        java.lang.String str27 = multiMatchQueryBuilder21.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.slop((-1));
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.tieBreaker((float) (short) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder15.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\" ],\n    \"fuzzyRewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder15.tieBreaker(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        java.lang.String str15 = multiMatchQueryBuilder10.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.analyzer("");
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.prefixLength((int) (byte) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.queryName("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder10, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder28.field("", (float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder28.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference34 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference34.equals(null)", !bytesReference34.equals(null));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str28 = multiMatchQueryBuilder27.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder27.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"rewrite\\\" : \\\"multi_match\\\",\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : false,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.lenient(false);
        org.elasticsearch.index.query.QueryValidationException queryValidationException23 = multiMatchQueryBuilder20.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder20.slop((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder25.field("{\n  \"multi_match\" : {\n    \"query\" : \"PHRASE_PREFIX\",\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzziness\" : \"10\",\n    \"boost\" : 1.0\n  }\n}", 100.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str11 = multiMatchQueryBuilder8.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.boost((float) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference14.equals(null)", !bytesReference14.equals(null));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        java.lang.String str22 = multiMatchQueryBuilder21.getWriteableName();
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str18 = multiMatchQueryBuilder10.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.tieBreaker(10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"boost\" : 0.0\n  }\n}", (float) 'a');
        org.elasticsearch.index.query.QueryValidationException queryValidationException24 = multiMatchQueryBuilder10.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder10.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzziness\" : \"{\\n  \\\"MULTIMATCH\\\" : {\\n    \\\"QUERY\\\" : 0.0,\\n    \\\"FIELDS\\\" : [ \\\"HI!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"FUZZYREWRITE\\\" : \\\"\\\",\\n    \\\"BOOST\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}", (float) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.cutoffFrequency((float) (-1L));
        java.lang.String str21 = multiMatchQueryBuilder20.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder20.prefixLength((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"Name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.cutoffFrequency((float) (byte) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type30 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float31 = type30.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder27.type(type30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder27.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder27.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type37 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type38 = type37.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder27.type(type37);
        org.elasticsearch.index.search.MatchQuery.Type type40 = type37.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder14.type(type37);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder14.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder14.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference50 = multiMatchQueryBuilder47.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference50.equals(null)", !bytesReference50.equals(null));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.maxExpansions(1);
        boolean boolean16 = multiMatchQueryBuilder12.equals((java.lang.Object) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder12.boost((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.boost((float) (short) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.cutoffFrequency((float) (short) 1);
        java.lang.String str18 = multiMatchQueryBuilder15.getWriteableName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.QueryValidationException queryValidationException32 = multiMatchQueryBuilder29.validate();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.fuzzyRewrite("");
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray51);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type57 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float58 = type57.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder54.type(type57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder54.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder54.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type64 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type65 = type64.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder54.type(type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder41.fuzziness((java.lang.Object) type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder29.type(type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder15.type(type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.prefixLength((int) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder69.fuzziness((java.lang.Object) "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 52.0\n  }\n}");
        java.lang.String str74 = multiMatchQueryBuilder73.getWriteableName();
        java.lang.String str75 = multiMatchQueryBuilder73.toString();
        java.lang.String str76 = multiMatchQueryBuilder73.getWriteableName();
        org.elasticsearch.common.bytes.BytesReference bytesReference77 = multiMatchQueryBuilder73.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference77.equals(null)", !bytesReference77.equals(null));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        java.lang.String str22 = multiMatchQueryBuilder21.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.prefixLength((int) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.cutoffFrequency(100.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder24.cutoffFrequency((float) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference33 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference33.equals(null)", !bytesReference33.equals(null));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.field("", (float) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.prefixLength(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder8.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder12.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"multi_match^0.0\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder12.prefixLength((int) (byte) -1);
        java.lang.String str21 = multiMatchQueryBuilder20.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder20.tieBreaker((float) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder14.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder14.maxExpansions((int) (short) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.tieBreaker((float) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder10.prefixLength((int) (short) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.cutoffFrequency((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.maxExpansions((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder26.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"Name\" : \"hi!\"\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.slop((int) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.prefixLength((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.boost((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder16.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder$Type\",\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"use_dis_max\" : false,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.queryName("multi_match");
        java.lang.String str20 = multiMatchQueryBuilder10.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.boost((float) 0L);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.tieBreaker((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder24.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"cutoff_frequency\" : -1.0,\n    \"boost\" : 1.0\n  }\n}", 1.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder18.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder18.cutoffFrequency((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.prefixLength((int) '4');
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.maxExpansions(1);
        org.elasticsearch.index.query.QueryValidationException queryValidationException15 = multiMatchQueryBuilder14.validate();
        java.lang.String str16 = multiMatchQueryBuilder14.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder14.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"cutoff_frequency\" : 1.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder14.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : 32,\n    \"prefix_length\" : 0,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        java.lang.String str11 = multiMatchQueryBuilder10.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}", (float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.cutoffFrequency((float) 100L);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.slop((int) (short) -1);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder34.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder34.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        boolean boolean40 = multiMatchQueryBuilder10.equals((java.lang.Object) multiMatchQueryBuilder34);
        org.elasticsearch.common.bytes.BytesReference bytesReference41 = multiMatchQueryBuilder34.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference41.equals(null)", !bytesReference41.equals(null));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        java.lang.String[] strArray2 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder3 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (short) 100, strArray2);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray11);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder3, strArray11);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder3.boost((float) 'a');
        float float16 = multiMatchQueryBuilder15.boost();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.maxExpansions((int) (short) 1);
        java.lang.String str21 = multiMatchQueryBuilder20.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder20.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.boost((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"fuzzy_rewrite\" : \"\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 0.0,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder29.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"analyzer\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : true,\n    \"boost\" : 0.0\n  }\n}", (float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder29.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}", 0.0f);
        java.lang.String str36 = multiMatchQueryBuilder29.queryName();
        org.elasticsearch.common.bytes.BytesReference bytesReference37 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference37.equals(null)", !bytesReference37.equals(null));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder34.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder34.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder42.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) (byte) 10);
        boolean boolean46 = multiMatchQueryBuilder21.equals((java.lang.Object) multiMatchQueryBuilder42);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder21.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.lenient(true);
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray58);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder59.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder61.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder61.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder61.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder67.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder69.cutoffFrequency((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder69.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) 0);
        float float77 = multiMatchQueryBuilder76.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder79 = multiMatchQueryBuilder76.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        boolean boolean80 = multiMatchQueryBuilder50.equals((java.lang.Object) multiMatchQueryBuilder79);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder82 = multiMatchQueryBuilder79.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"max_expansions\" : -1,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference83 = multiMatchQueryBuilder79.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference83.equals(null)", !bytesReference83.equals(null));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        float float29 = multiMatchQueryBuilder24.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder24.slop((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder24.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 1,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"\",\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        java.lang.String str34 = multiMatchQueryBuilder33.queryName();
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder33.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder16.slop(100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder16.lenient(false);
        java.lang.String str24 = multiMatchQueryBuilder23.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder23.tieBreaker((float) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder14.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}", (float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"slop\" : -1,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"{\\\\n  \\\\\\\"multi_match\\\\\\\" : {\\\\n    \\\\\\\"query\\\\\\\" : 0.0,\\\\n    \\\\\\\"fields\\\\\\\" : [ \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\n    \\\\\\\"slop\\\\\\\" : -1,\\\\n    \\\\\\\"fuzzy_rewrite\\\\\\\" : \\\\\\\"hi!\\\\\\\",\\\\n    \\\\\\\"lenient\\\\\\\" : true,\\\\n    \\\\\\\"boost\\\\\\\" : 1.0\\\\n  }\\\\n}\\\",\\n    \\\"boost\\\" : 1.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder15.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\" ],\n    \"fuzzyRewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.cutoffFrequency((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.maxExpansions(0);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.cutoffFrequency((float) (short) 1);
        java.lang.String str18 = multiMatchQueryBuilder15.getWriteableName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.QueryValidationException queryValidationException32 = multiMatchQueryBuilder29.validate();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.fuzzyRewrite("");
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray51);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type57 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float58 = type57.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder54.type(type57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder54.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder54.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type64 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type65 = type64.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder54.type(type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder41.fuzziness((java.lang.Object) type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder29.type(type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder15.type(type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.prefixLength((int) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder69.fuzziness((java.lang.Object) "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 52.0\n  }\n}");
        java.lang.String str74 = multiMatchQueryBuilder73.getWriteableName();
        java.lang.String str75 = multiMatchQueryBuilder73.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder73.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : true,\n    \"tieBreaker\" : 35.0,\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}", (float) (byte) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference79 = multiMatchQueryBuilder73.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference79.equals(null)", !bytesReference79.equals(null));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.maxExpansions(1);
        org.elasticsearch.index.query.QueryValidationException queryValidationException15 = multiMatchQueryBuilder14.validate();
        java.lang.String str16 = multiMatchQueryBuilder14.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.maxExpansions((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.fuzzyRewrite("hi!");
        java.lang.String str39 = multiMatchQueryBuilder36.getName();
        float float40 = multiMatchQueryBuilder36.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder36.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder36.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type45 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type46 = type45.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type47 = type45.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder36.type(type45);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder36.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder50.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder50.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.boost((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder56.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.cutoffFrequency((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder60.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        boolean boolean65 = multiMatchQueryBuilder23.equals((java.lang.Object) multiMatchQueryBuilder64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder64.prefixLength((int) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference68 = multiMatchQueryBuilder67.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference68.equals(null)", !bytesReference68.equals(null));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.fuzzyRewrite("hi!");
        java.lang.String str42 = multiMatchQueryBuilder39.getName();
        float float43 = multiMatchQueryBuilder39.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder39.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder39.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder39.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder24.fuzziness((java.lang.Object) (-1L));
        float float51 = multiMatchQueryBuilder50.boost();
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray59);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder60.prefixLength(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder50.fuzziness((java.lang.Object) multiMatchQueryBuilder60);
        org.elasticsearch.common.bytes.BytesReference bytesReference66 = multiMatchQueryBuilder50.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference66.equals(null)", !bytesReference66.equals(null));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder15.field("multi_match", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.prefixLength((int) 'a');
        java.lang.String str21 = multiMatchQueryBuilder20.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder20.prefixLength((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"max_expansions\\\" : 10,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 0.0,\\n    \\\"cutoff_frequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : true,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.tieBreaker((float) '4');
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder30.prefixLength((int) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder30.rewrite("");
        java.lang.String str37 = multiMatchQueryBuilder36.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder36.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder17.fuzziness((java.lang.Object) multiMatchQueryBuilder39);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder39.slop(0);
        org.elasticsearch.common.bytes.BytesReference bytesReference43 = multiMatchQueryBuilder42.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference43.equals(null)", !bytesReference43.equals(null));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        java.lang.String str15 = multiMatchQueryBuilder12.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder12.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder12.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder12.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"rewrite\\\" : \\\"multi_match\\\",\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : false,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.cutoffFrequency((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"max_expansions\\\" : 10,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 0.0,\\n    \\\"cutoff_frequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : -1,\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : true,\n    \"cutoffFrequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.prefixLength((int) (byte) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.useDisMax(false);
        java.lang.String str25 = multiMatchQueryBuilder10.getWriteableName();
        java.lang.String str26 = multiMatchQueryBuilder10.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder$Type\",\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.maxExpansions((-1));
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder32.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.tieBreaker((float) 10L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.field("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.cutoffFrequency(1.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"hi!\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"multi_match^0.0\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"prefix_length\\\" : 97,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.prefixLength((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.lenient(false);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray28);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder31.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type42 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type43 = type42.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder39.type(type42);
        org.elasticsearch.index.search.MatchQuery.Type type45 = type42.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder16.type(type42);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder16.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^10.0\", \"^10.0\", \"^10.0\", \"^10.0\", \"^10.0\", \"^10.0\" ],\n    \"type\" : \"phrase_prefix\",\n    \"slop\" : -1,\n    \"prefix_length\" : 35,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 10.0,\n    \"_name\" : \"multi_match\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference49 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference49.equals(null)", !bytesReference49.equals(null));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        boolean boolean21 = multiMatchQueryBuilder16.equals((java.lang.Object) type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder16.boost((float) (-1L));
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.tieBreaker((float) '4');
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type31 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float32 = type31.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder28.type(type31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder10.type(type31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder10.maxExpansions((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"max_expansions\\\" : 10,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 0.0,\\n    \\\"cutoff_frequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}^1.0\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : false,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference39 = multiMatchQueryBuilder38.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference39.equals(null)", !bytesReference39.equals(null));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        float float27 = multiMatchQueryBuilder26.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder26.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.field("{\n  \"multiMatch\" : {\n    \"query\" : \"PHRASE_PREFIX\",\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzziness\" : \"10\",\n    \"boost\" : 1.0\n  }\n}", 100.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.cutoffFrequency((float) (short) 1);
        java.lang.String str18 = multiMatchQueryBuilder15.getWriteableName();
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.QueryValidationException queryValidationException32 = multiMatchQueryBuilder29.validate();
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.fuzzyRewrite("");
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray51);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type57 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float58 = type57.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder54.type(type57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder54.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder54.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type64 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type65 = type64.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder54.type(type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder41.fuzziness((java.lang.Object) type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder29.type(type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder15.type(type64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.prefixLength((int) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference72 = multiMatchQueryBuilder71.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference72.equals(null)", !bytesReference72.equals(null));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        java.lang.String str16 = multiMatchQueryBuilder15.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder15.maxExpansions(100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder15.prefixLength(10);
        org.elasticsearch.index.query.QueryValidationException queryValidationException21 = multiMatchQueryBuilder15.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder15.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder15.cutoffFrequency((float) (byte) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"maxExpansions\" : -1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : true,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"analyzer\" : \"multi_match\",\n    \"maxExpansions\" : 1,\n    \"rewrite\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"maxExpansions\\\" : -1,\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"useDisMax\\\" : true,\\n    \\\"boost\\\" : 0.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        float float27 = multiMatchQueryBuilder26.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder26.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str30 = multiMatchQueryBuilder29.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder29.cutoffFrequency((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.boost((float) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder34.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.cutoffFrequency((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder20.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.queryName("");
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.maxExpansions(10);
        org.elasticsearch.index.query.QueryValidationException queryValidationException17 = multiMatchQueryBuilder12.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder12.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^0.0\" ],\n    \"prefix_length\" : 32,\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        java.lang.String[] strArray27 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray27);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.fuzzyRewrite("hi!");
        java.lang.String str33 = multiMatchQueryBuilder30.getName();
        float float34 = multiMatchQueryBuilder30.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder30.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder30.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type39 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type40 = type39.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type41 = type39.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder30.type(type39);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder19.type(type39);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder19.prefixLength((int) 'a');
        float float46 = multiMatchQueryBuilder19.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder19.maxExpansions((int) (short) 1);
        java.lang.String str49 = multiMatchQueryBuilder19.getName();
        org.elasticsearch.common.bytes.BytesReference bytesReference50 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference50.equals(null)", !bytesReference50.equals(null));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.tieBreaker((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder24.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"tie_breaker\" : 35.0,\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}", (float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder24.tieBreaker((float) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference34 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference34.equals(null)", !bytesReference34.equals(null));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder16.slop(100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder16.cutoffFrequency((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : 0,\n    \"prefix_length\" : 0,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type30 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float31 = type30.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder27.type(type30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder27.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder27.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type37 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type38 = type37.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder27.type(type37);
        org.elasticsearch.index.search.MatchQuery.Type type40 = type37.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder14.type(type37);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder14.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.slop((int) (byte) 0);
        java.lang.String str46 = multiMatchQueryBuilder45.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder45.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference49 = multiMatchQueryBuilder48.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference49.equals(null)", !bytesReference49.equals(null));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str11 = multiMatchQueryBuilder8.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.boost((float) (short) 1);
        java.lang.String str14 = multiMatchQueryBuilder13.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder13.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"cutoff_frequency\" : -1.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.queryName("");
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.tieBreaker((float) '4');
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type31 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float32 = type31.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder28.type(type31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder10.type(type31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference37 = multiMatchQueryBuilder36.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference37.equals(null)", !bytesReference37.equals(null));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.boost((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder18.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.cutoffFrequency((float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.useDisMax(false);
        org.elasticsearch.index.query.QueryValidationException queryValidationException26 = multiMatchQueryBuilder21.validate();
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.field("hi!", 0.0f);
        java.lang.String str25 = multiMatchQueryBuilder24.queryName();
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.prefixLength(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder8.fuzziness((java.lang.Object) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"prefixLength\" : 10,\n    \"maxExpansions\" : 1,\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"rewrite\\\" : \\\"multi_match\\\",\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : false,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.prefixLength((int) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.prefixLength(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.type(type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"type\" : \"phrase_prefix\",\n    \"minimum_should_match\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.queryName("");
        float float28 = multiMatchQueryBuilder27.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder27.cutoffFrequency((float) 100L);
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker((float) (byte) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference13.equals(null)", !bytesReference13.equals(null));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.maxExpansions(1);
        boolean boolean16 = multiMatchQueryBuilder12.equals((java.lang.Object) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder12.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.tieBreaker((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type17 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.type(type17);
        java.lang.String str19 = multiMatchQueryBuilder18.toString();
        java.lang.String str20 = multiMatchQueryBuilder18.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.maxExpansions((int) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.lang.String[] strArray2 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder3 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (short) 100, strArray2);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder5 = multiMatchQueryBuilder3.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = multiMatchQueryBuilder3.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder3.tieBreaker((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder3.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"Name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder3.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"prefix_length\" : 0,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        boolean boolean15 = multiMatchQueryBuilder13.equals((java.lang.Object) "{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"type\" : \"phrase_prefix\",\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 52.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder30.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder34.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder34.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder42.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) (byte) 10);
        boolean boolean46 = multiMatchQueryBuilder21.equals((java.lang.Object) multiMatchQueryBuilder42);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder21.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder21.prefixLength(100);
        org.elasticsearch.common.bytes.BytesReference bytesReference51 = multiMatchQueryBuilder50.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference51.equals(null)", !bytesReference51.equals(null));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.fuzzyRewrite("hi!");
        java.lang.String str42 = multiMatchQueryBuilder39.getName();
        float float43 = multiMatchQueryBuilder39.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder39.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder39.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder39.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder24.fuzziness((java.lang.Object) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder50.boost((float) (-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder50.lenient(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference57 = multiMatchQueryBuilder56.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference57.equals(null)", !bytesReference57.equals(null));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : 100,\n    \"rewrite\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.prefixLength((int) (byte) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.field("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.cutoffFrequency((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.tieBreaker((float) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str11 = multiMatchQueryBuilder8.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.boost((float) (short) 1);
        java.lang.String str14 = multiMatchQueryBuilder13.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder13.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder13.prefixLength((int) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder13.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder13.cutoffFrequency(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 10.0f, strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.analyzer("");
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference13.equals(null)", !bytesReference13.equals(null));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder34.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder34.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder42.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) (byte) 10);
        boolean boolean46 = multiMatchQueryBuilder21.equals((java.lang.Object) multiMatchQueryBuilder42);
        org.elasticsearch.common.bytes.BytesReference bytesReference47 = multiMatchQueryBuilder42.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference47.equals(null)", !bytesReference47.equals(null));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.cutoffFrequency((float) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        java.lang.String str16 = multiMatchQueryBuilder10.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.prefixLength((int) 'a');
        float float21 = multiMatchQueryBuilder20.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder20.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder20.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 10.0,\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str26 = multiMatchQueryBuilder20.queryName();
        float float27 = multiMatchQueryBuilder20.boost();
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop((int) (short) 1);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("hi!");
        java.lang.String str37 = multiMatchQueryBuilder34.getName();
        float float38 = multiMatchQueryBuilder34.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder34.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder34.queryName("");
        java.lang.String[] strArray50 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray50);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder34, strArray50);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder23.fuzziness((java.lang.Object) multiMatchQueryBuilder52);
        org.elasticsearch.index.query.QueryValidationException queryValidationException54 = multiMatchQueryBuilder23.validate();
        org.elasticsearch.common.bytes.BytesReference bytesReference55 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference55.equals(null)", !bytesReference55.equals(null));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.cutoffFrequency((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.field("", (float) 1);
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.tieBreaker((float) '#');
        java.lang.String str38 = multiMatchQueryBuilder35.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.tieBreaker((float) 'a');
        boolean boolean41 = multiMatchQueryBuilder19.equals((java.lang.Object) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder19.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"maxExpansions\" : 1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 0.0,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference44 = multiMatchQueryBuilder43.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference44.equals(null)", !bytesReference44.equals(null));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.field("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type32 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float33 = type32.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder29.type(type32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder29.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder29.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder38.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder10.fuzziness((java.lang.Object) multiMatchQueryBuilder38);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder42.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder46.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^10.0\", \"^10.0\", \"^10.0\", \"^10.0\", \"^10.0\", \"^10.0\" ],\n    \"type\" : \"phrase_prefix\",\n    \"slop\" : -1,\n    \"prefix_length\" : 35,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 10.0,\n    \"_name\" : \"multi_match\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder46.cutoffFrequency((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference53 = multiMatchQueryBuilder52.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference53.equals(null)", !bytesReference53.equals(null));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type24 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.common.ParseField parseField25 = type24.parseField();
        boolean boolean26 = multiMatchQueryBuilder21.equals((java.lang.Object) parseField25);
        java.lang.String str27 = multiMatchQueryBuilder21.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : true,\n    \"tieBreaker\" : 35.0,\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder21.prefixLength((int) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        java.lang.String str20 = multiMatchQueryBuilder19.queryName();
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray28);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.fuzzyRewrite("hi!");
        java.lang.String str34 = multiMatchQueryBuilder31.getName();
        float float35 = multiMatchQueryBuilder31.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder31.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder31.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type40 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type41 = type40.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type42 = type40.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder31.type(type40);
        org.elasticsearch.common.ParseField parseField44 = type40.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder19.fuzziness((java.lang.Object) parseField44);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray53);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.fuzzyRewrite("hi!");
        java.lang.String str59 = multiMatchQueryBuilder56.getName();
        float float60 = multiMatchQueryBuilder56.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder56.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder56.slop((int) (short) -1);
        java.lang.String str65 = multiMatchQueryBuilder56.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder56.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder56.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        boolean boolean70 = multiMatchQueryBuilder19.equals((java.lang.Object) multiMatchQueryBuilder69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = multiMatchQueryBuilder69.maxExpansions(100);
        org.elasticsearch.common.bytes.BytesReference bytesReference73 = multiMatchQueryBuilder69.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference73.equals(null)", !bytesReference73.equals(null));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"{\\\\n  \\\\\\\"multi_match\\\\\\\" : {\\\\n    \\\\\\\"query\\\\\\\" : 0.0,\\\\n    \\\\\\\"fields\\\\\\\" : [ \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\n    \\\\\\\"slop\\\\\\\" : -1,\\\\n    \\\\\\\"fuzzy_rewrite\\\\\\\" : \\\\\\\"hi!\\\\\\\",\\\\n    \\\\\\\"lenient\\\\\\\" : true,\\\\n    \\\\\\\"boost\\\\\\\" : 1.0\\\\n  }\\\\n}\\\",\\n    \\\"boost\\\" : 1.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : true,\n    \"boost\" : 1.0\n  }\n}", 100.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.minimumShouldMatch("");
        float float22 = multiMatchQueryBuilder21.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}", (float) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.maxExpansions((int) (short) 1);
        java.lang.String str21 = multiMatchQueryBuilder20.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder20.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.boost((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"fuzzy_rewrite\" : \"\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 0.0,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder29.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"analyzer\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : true,\n    \"boost\" : 0.0\n  }\n}", (float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder29.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"\",\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        java.lang.String[] strArray45 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray45);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder46.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.fuzzyRewrite("hi!");
        java.lang.String str51 = multiMatchQueryBuilder48.getName();
        float float52 = multiMatchQueryBuilder48.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder48.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder48.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type57 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type58 = type57.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type59 = type57.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder48.type(type57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder62.cutoffFrequency((float) '#');
        java.lang.String str65 = multiMatchQueryBuilder62.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder62.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type68 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type69 = type68.matchQueryType();
        float float70 = type68.tieBreaker();
        org.elasticsearch.common.ParseField parseField71 = type68.parseField();
        float float72 = type68.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder62.type(type68);
        float float74 = type68.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder75 = multiMatchQueryBuilder35.type(type68);
        org.elasticsearch.common.bytes.BytesReference bytesReference76 = multiMatchQueryBuilder75.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference76.equals(null)", !bytesReference76.equals(null));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.cutoffFrequency((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder15.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str33 = multiMatchQueryBuilder30.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder30.boost((float) (short) 1);
        java.lang.String str36 = multiMatchQueryBuilder35.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        java.lang.String str38 = multiMatchQueryBuilder15.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder15.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 32.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference41 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference41.equals(null)", !bytesReference41.equals(null));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder10.prefixLength((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.useDisMax(false);
        java.lang.String str19 = multiMatchQueryBuilder18.getName();
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.cutoffFrequency((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) 0);
        java.lang.String str26 = multiMatchQueryBuilder25.queryName();
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.tieBreaker((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.slop(0);
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.useDisMax(true);
        java.lang.String str21 = multiMatchQueryBuilder18.getName();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.fuzzyRewrite("hi!");
        java.lang.String str35 = multiMatchQueryBuilder32.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type36 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder32.type(type36);
        org.elasticsearch.index.search.MatchQuery.Type type38 = type36.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder18.type(type36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder18.slop((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder18.cutoffFrequency((float) 0L);
        org.elasticsearch.common.bytes.BytesReference bytesReference44 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference44.equals(null)", !bytesReference44.equals(null));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.useDisMax(true);
        java.lang.Class<?> wildcardClass43 = multiMatchQueryBuilder40.getClass();
        boolean boolean44 = multiMatchQueryBuilder23.equals((java.lang.Object) multiMatchQueryBuilder40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder23.prefixLength((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder23.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.boost((float) '#');
        org.elasticsearch.common.bytes.BytesReference bytesReference53 = multiMatchQueryBuilder52.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference53.equals(null)", !bytesReference53.equals(null));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.boost((float) ' ');
        java.lang.String str20 = multiMatchQueryBuilder19.queryName();
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.cutoffFrequency((float) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder10.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : 0,\n    \"prefixLength\" : 0,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder16.slop(100);
        org.elasticsearch.index.query.QueryValidationException queryValidationException22 = multiMatchQueryBuilder21.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"use_dis_max\" : false,\n    \"cutoff_frequency\" : -1.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}", (float) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.prefixLength((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.boost((float) 10L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"max_expansions\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"boost\" : 0.0\n  }\n}");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder33.minimumShouldMatch("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder33.slop((int) (short) -1);
        boolean boolean40 = multiMatchQueryBuilder22.equals((java.lang.Object) multiMatchQueryBuilder33);
        java.lang.String str41 = multiMatchQueryBuilder33.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder33.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"maxExpansions\" : 35,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 0.0,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder33.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder45.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) 1L);
        org.elasticsearch.common.bytes.BytesReference bytesReference49 = multiMatchQueryBuilder48.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference49.equals(null)", !bytesReference49.equals(null));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.cutoffFrequency((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.cutoffFrequency((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder10.cutoffFrequency((float) (byte) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException15 = multiMatchQueryBuilder14.validate();
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray23);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder26.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder32.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}", (float) 1L);
        java.lang.String str38 = multiMatchQueryBuilder32.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder14.fuzziness((java.lang.Object) multiMatchQueryBuilder32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder14.boost((float) 1);
        java.lang.String str42 = multiMatchQueryBuilder41.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder41.tieBreaker((-1.0f));
        org.elasticsearch.common.bytes.BytesReference bytesReference45 = multiMatchQueryBuilder44.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference45.equals(null)", !bytesReference45.equals(null));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.tieBreaker((-1.0f));
        org.elasticsearch.index.query.QueryValidationException queryValidationException20 = multiMatchQueryBuilder16.validate();
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        java.lang.String[] strArray2 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder3 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (short) 100, strArray2);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray11);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder3, strArray11);
        float float14 = multiMatchQueryBuilder13.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder13.useDisMax(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.prefixLength((int) (short) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.tieBreaker((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder26.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"{\\\\n  \\\\\\\"multi_match\\\\\\\" : {\\\\n    \\\\\\\"query\\\\\\\" : 0.0,\\\\n    \\\\\\\"fields\\\\\\\" : [ \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\n    \\\\\\\"slop\\\\\\\" : -1,\\\\n    \\\\\\\"fuzzy_rewrite\\\\\\\" : \\\\\\\"hi!\\\\\\\",\\\\n    \\\\\\\"lenient\\\\\\\" : true,\\\\n    \\\\\\\"boost\\\\\\\" : 1.0\\\\n  }\\\\n}\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        float float29 = multiMatchQueryBuilder24.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder24.slop((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder24.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 1,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"\",\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference34 = multiMatchQueryBuilder33.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference34.equals(null)", !bytesReference34.equals(null));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str32 = multiMatchQueryBuilder27.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder27.prefixLength((int) (byte) 1);
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray42);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder47.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder47.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"multi_match^0.0\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type54 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        org.elasticsearch.index.search.MatchQuery.Type type55 = type54.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder47.type(type54);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder34.type(type54);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder57.slop((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder59.slop((int) '#');
        org.elasticsearch.common.bytes.BytesReference bytesReference62 = multiMatchQueryBuilder61.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference62.equals(null)", !bytesReference62.equals(null));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        java.lang.String str22 = multiMatchQueryBuilder21.getWriteableName();
        float float23 = multiMatchQueryBuilder21.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.tieBreaker(10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"prefix_length\" : 100,\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^10.0\", \"^10.0\", \"^10.0\", \"^10.0\", \"^10.0\", \"^10.0\" ],\n    \"type\" : \"phrase_prefix\",\n    \"slop\" : -1,\n    \"prefixLength\" : 35,\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 10.0,\n    \"Name\" : \"multi_match\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"fuzzy_rewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.field("{\n  \"multiMatch\" : {\n    \"query\" : \"PHRASE_PREFIX\",\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzziness\" : \"10\",\n    \"boost\" : 1.0\n  }\n}", 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder21.cutoffFrequency(100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder21.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 10.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder30.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.cutoffFrequency((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.prefixLength((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.rewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.prefixLength((int) 'a');
        java.lang.String str25 = multiMatchQueryBuilder24.getWriteableName();
        float float26 = multiMatchQueryBuilder24.boost();
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder24.cutoffFrequency((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.boost((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder32.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder32.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\" ],\n    \"fuzzyRewrite\" : \"\",\n    \"boost\" : 1.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}", (-1.0f));
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder52.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder52.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"multi_match^0.0\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.lenient(false);
        java.lang.Class<?> wildcardClass63 = multiMatchQueryBuilder60.getClass();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder39.fuzziness((java.lang.Object) multiMatchQueryBuilder60);
        org.elasticsearch.common.bytes.BytesReference bytesReference65 = multiMatchQueryBuilder39.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference65.equals(null)", !bytesReference65.equals(null));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder14.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder14.maxExpansions((int) (short) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "hi!", strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder21, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"maxExpansions\" : -1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : true,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder26.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"slop\" : -1,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}", (float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.boost((float) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference34 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference34.equals(null)", !bytesReference34.equals(null));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.useDisMax(false);
        java.lang.String str25 = multiMatchQueryBuilder10.getWriteableName();
        java.lang.String str26 = multiMatchQueryBuilder10.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder$Type\",\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.lenient(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference33 = multiMatchQueryBuilder32.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference33.equals(null)", !bytesReference33.equals(null));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        java.lang.String str20 = multiMatchQueryBuilder19.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : true,\n    \"cutoff_frequency\" : 1.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.slop(100);
        java.lang.String str15 = multiMatchQueryBuilder14.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.boost((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder16.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"\",\n    \"lenient\" : false,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        java.lang.String str23 = multiMatchQueryBuilder16.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder16.prefixLength(1);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder15.field("multi_match", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.prefixLength((int) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.prefixLength(10);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder14.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder14.maxExpansions((int) (short) 10);
        java.lang.String[] strArray24 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "hi!", strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder21, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"maxExpansions\" : -1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : true,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder26.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"slop\" : -1,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}", (float) (short) -1);
        java.lang.String str32 = multiMatchQueryBuilder26.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder26.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"cutoff_frequency\" : -1.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder18.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder18.cutoffFrequency((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"phrase_prefix\\\",\\n    \\\"maxExpansions\\\" : 10,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"tieBreaker\\\" : 0.0,\\n    \\\"cutoffFrequency\\\" : 0.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"cutoff_frequency\" : -1.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.cutoffFrequency((float) '#');
        java.lang.String str27 = multiMatchQueryBuilder24.queryName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder24.cutoffFrequency((float) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.field("");
        java.lang.String str19 = multiMatchQueryBuilder10.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^10.0\", \"^10.0\", \"^10.0\", \"^10.0\", \"^10.0\", \"^10.0\" ],\n    \"type\" : \"phrase_prefix\",\n    \"slop\" : -1,\n    \"prefix_length\" : 35,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 10.0,\n    \"_name\" : \"multi_match\"\n  }\n}", 1.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.lenient(false);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder16.fuzziness((java.lang.Object) multiMatchQueryBuilder33);
        java.lang.String str35 = multiMatchQueryBuilder16.getName();
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder14.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\", \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzziness\\\" : \\\"PHRASE_PREFIX\\\",\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder14.slop((int) '#');
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.maxExpansions(1);
        boolean boolean16 = multiMatchQueryBuilder12.equals((java.lang.Object) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder12.boost((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"rewrite\\\" : \\\"multi_match\\\",\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : false,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder18.tieBreaker((float) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder18.cutoffFrequency((float) 100);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder38.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder38.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\", \"\", \"\", \"multi_match^0.0\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str47 = multiMatchQueryBuilder44.queryName();
        boolean boolean48 = multiMatchQueryBuilder25.equals((java.lang.Object) str47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder25.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzziness\" : \"{\\n  \\\"MULTIMATCH\\\" : {\\n    \\\"QUERY\\\" : 0.0,\\n    \\\"FIELDS\\\" : [ \\\"HI!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"FUZZYREWRITE\\\" : \\\"\\\",\\n    \\\"BOOST\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"multi_match\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.boost((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\", \"^32.0\" ],\n    \"prefixLength\" : -1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"Name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference55 = multiMatchQueryBuilder54.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference55.equals(null)", !bytesReference55.equals(null));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.useDisMax(true);
        java.lang.String str21 = multiMatchQueryBuilder18.getWriteableName();
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        float float27 = multiMatchQueryBuilder26.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder26.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder26.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.maxExpansions(10);
        java.lang.String str17 = multiMatchQueryBuilder12.getWriteableName();
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str19 = multiMatchQueryBuilder18.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder18.cutoffFrequency((float) (short) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder10.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder26.field("", (float) 10L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.boost((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.tieBreaker((float) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder35.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        java.lang.String str13 = multiMatchQueryBuilder10.getName();
        float float14 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type20 = type19.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.type(type19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.rewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.tieBreaker((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.maxExpansions((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.slop(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.cutoffFrequency(1.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference33 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference33.equals(null)", !bytesReference33.equals(null));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.queryName("multi_match");
        float float20 = multiMatchQueryBuilder10.boost();
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.slop((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 52.0,\n    \"boost\" : 1.0\n  }\n}", (float) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.cutoffFrequency((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder25.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"slop\" : -1,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder25.tieBreaker(52.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.cutoffFrequency((float) (short) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder32.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder12.field("", 1.0f);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.fuzzyRewrite("hi!");
        java.lang.String str31 = multiMatchQueryBuilder28.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder28.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.cutoffFrequency((float) (short) 1);
        java.lang.String str36 = multiMatchQueryBuilder33.getWriteableName();
        java.lang.String[] strArray44 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray44);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.QueryValidationException queryValidationException50 = multiMatchQueryBuilder47.validate();
        java.lang.String[] strArray58 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray58);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder59.fuzzyRewrite("");
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = multiMatchQueryBuilder70.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder74 = multiMatchQueryBuilder72.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type75 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float76 = type75.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder77 = multiMatchQueryBuilder72.type(type75);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder79 = multiMatchQueryBuilder72.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder81 = multiMatchQueryBuilder72.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type82 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type83 = type82.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder84 = multiMatchQueryBuilder72.type(type82);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder85 = multiMatchQueryBuilder59.fuzziness((java.lang.Object) type82);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder86 = multiMatchQueryBuilder47.type(type82);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder87 = multiMatchQueryBuilder33.type(type82);
        org.elasticsearch.index.search.MatchQuery.Type type88 = type82.matchQueryType();
        float float89 = type82.tieBreaker();
        org.elasticsearch.common.ParseField parseField90 = type82.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type91 = type82.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder92 = multiMatchQueryBuilder17.type(type82);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder94 = multiMatchQueryBuilder92.tieBreaker((float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder96 = multiMatchQueryBuilder92.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"slop\" : -1,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference97 = multiMatchQueryBuilder96.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference97.equals(null)", !bytesReference97.equals(null));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference11.equals(null)", !bytesReference11.equals(null));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder34.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder34.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder42.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}", (float) (byte) 10);
        boolean boolean46 = multiMatchQueryBuilder21.equals((java.lang.Object) multiMatchQueryBuilder42);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder21.boost((float) 10L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder21.prefixLength((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder21.prefixLength((int) (byte) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference53 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference53.equals(null)", !bytesReference53.equals(null));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        java.lang.String[] strArray2 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder3 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (short) 100, strArray2);
        java.lang.String[] strArray11 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray11);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder3, strArray11);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder13.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"slop\\\" : -1,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder13.tieBreaker((float) 1L);
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        float float14 = type13.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.type(type13);
        java.lang.String str16 = multiMatchQueryBuilder15.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder15.maxExpansions(100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"slop\" : -1,\n    \"max_expansions\" : 32,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true,\n    \"boost\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"multi_match\\\",\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "", "", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0f, strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.field("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder18.field("{\n  \"multiMatch\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"fuzzyRewrite\" : \"\",\n    \"tieBreaker\" : 0.0,\n    \"boost\" : 1.0\n  }\n}", (float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"rewrite\\\" : \\\"multi_match\\\",\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : false,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }
}

