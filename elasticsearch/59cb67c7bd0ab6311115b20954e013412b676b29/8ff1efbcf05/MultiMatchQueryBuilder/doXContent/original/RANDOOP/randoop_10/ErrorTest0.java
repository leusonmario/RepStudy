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
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.boost(1.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference14.equals(null)", !bytesReference14.equals(null));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference14.equals(null)", !bytesReference14.equals(null));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.minimumShouldMatch("");
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference12.equals(null)", !bytesReference12.equals(null));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.analyzer("");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.cutoffFrequency((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("hi!", (float) 0L);
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = multiMatchQueryBuilder7.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference10.equals(null)", !bytesReference10.equals(null));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.slop((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder9.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder12.prefixLength((int) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float21 = type20.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.cutoffFrequency((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.boost((float) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference14.equals(null)", !bytesReference14.equals(null));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.slop((int) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder13.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.boost((float) (-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.cutoffFrequency(1.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder16.field("hi!", (float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.boost((float) 1L);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.type(type22);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.tieBreaker((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.lenient(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder13.field("hi!", (float) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.minimumShouldMatch("hi!");
        org.elasticsearch.common.bytes.BytesReference bytesReference10 = multiMatchQueryBuilder9.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference10.equals(null)", !bytesReference10.equals(null));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.prefixLength(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.cutoffFrequency(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.analyzer("hi!");
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder7.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", 1.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = multiMatchQueryBuilder7.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference11.equals(null)", !bytesReference11.equals(null));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.cutoffFrequency((float) 0L);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.prefixLength((int) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.cutoffFrequency((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("hi!", (float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}", (float) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type30 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        float float31 = type30.tieBreaker();
        float float32 = type30.tieBreaker();
        org.elasticsearch.common.ParseField parseField33 = type30.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder29.type((java.lang.Object) type30);
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.prefixLength(100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.prefixLength((int) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference14.equals(null)", !bytesReference14.equals(null));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.tieBreaker((float) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder22.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefixLength\" : 0,\n    \"maxExpansions\" : 0,\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 97.0,\n    \"Name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^0.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference43 = multiMatchQueryBuilder42.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference43.equals(null)", !bytesReference43.equals(null));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.minimumShouldMatch("hi!");
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        java.lang.String str23 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.minimumShouldMatch("hi!");
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.boost(1.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.slop((int) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder25.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"fuzziness\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0\n  }\n}", 0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = multiMatchQueryBuilder7.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference12.equals(null)", !bytesReference12.equals(null));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.tieBreaker((float) 0);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.maxExpansions((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type36 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type37 = type36.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type38 = type36.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder33.fuzziness((java.lang.Object) type36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder21.type(type36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder11.fuzziness((java.lang.Object) multiMatchQueryBuilder40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder11.boost((float) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference44 = multiMatchQueryBuilder43.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference44.equals(null)", !bytesReference44.equals(null));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.type(type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.prefixLength(100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.maxExpansions((int) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.boost((float) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.prefixLength((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder15.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float21 = type20.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.cutoffFrequency((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.slop((int) (byte) 1);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder37.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder17.fuzziness((java.lang.Object) multiMatchQueryBuilder37);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray49);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder54.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder54.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder54.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type63 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type64 = type63.matchQueryType();
        org.elasticsearch.common.ParseField parseField65 = type63.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder62.type((java.lang.Object) parseField65);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder37.fuzziness((java.lang.Object) multiMatchQueryBuilder66);
        org.elasticsearch.common.bytes.BytesReference bytesReference68 = multiMatchQueryBuilder37.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference68.equals(null)", !bytesReference68.equals(null));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.slop((int) (byte) 1);
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder37.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder17.fuzziness((java.lang.Object) multiMatchQueryBuilder37);
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray49);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder54.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder54.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder54.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type63 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type64 = type63.matchQueryType();
        org.elasticsearch.common.ParseField parseField65 = type63.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder62.type((java.lang.Object) parseField65);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder37.fuzziness((java.lang.Object) multiMatchQueryBuilder66);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder37.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"^1.0\", \"hi!^10.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"hi!^10.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference72 = multiMatchQueryBuilder71.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference72.equals(null)", !bytesReference72.equals(null));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.fuzzyRewrite("");
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.maxExpansions((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.maxExpansions(0);
        java.lang.String[] strArray46 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder53.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder57.field("");
        java.lang.String[] strArray66 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray66);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder57, strArray66);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder39, strArray66);
        org.elasticsearch.common.bytes.BytesReference bytesReference70 = multiMatchQueryBuilder39.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference70.equals(null)", !bytesReference70.equals(null));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.type(type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.boost((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\"\\n  }\\n}^32.0\" ],\n    \"boost\" : 10.0,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 0.0,\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder36.field("hi!", (float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder19.fuzziness((java.lang.Object) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.boost((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.prefixLength(0);
        org.elasticsearch.common.bytes.BytesReference bytesReference45 = multiMatchQueryBuilder42.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference45.equals(null)", !bytesReference45.equals(null));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.tieBreaker((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.cutoffFrequency((float) (byte) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder22.slop((int) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.fuzzyRewrite("");
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}", (float) (-1));
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float21 = type20.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.cutoffFrequency((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.cutoffFrequency((float) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.boost(10.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder30.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.common.ParseField parseField22 = type20.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.type((java.lang.Object) parseField22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.boost(1.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.slop((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : -1.0,\n    \"prefix_length\" : 1,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.boost((float) 100L);
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.type(type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.boost((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder7.prefixLength((int) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference14.equals(null)", !bytesReference14.equals(null));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder36.field("hi!", (float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder19.fuzziness((java.lang.Object) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.boost((-1.0f));
        org.elasticsearch.common.bytes.BytesReference bytesReference43 = multiMatchQueryBuilder40.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference43.equals(null)", !bytesReference43.equals(null));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.tieBreaker((float) 0);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.maxExpansions((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type36 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type37 = type36.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type38 = type36.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder33.fuzziness((java.lang.Object) type36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder21.type(type36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder11.fuzziness((java.lang.Object) multiMatchQueryBuilder40);
        org.elasticsearch.common.bytes.BytesReference bytesReference42 = multiMatchQueryBuilder40.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference42.equals(null)", !bytesReference42.equals(null));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.analyzer("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : false,\n    \"tieBreaker\" : 10.0,\n    \"cutoffFrequency\" : -1.0\n  }\n}");
        java.lang.Class<?> wildcardClass42 = multiMatchQueryBuilder39.getClass();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray49);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder56.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.field("");
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder60, strArray69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder39, strArray69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "hi!", strArray69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder73.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true,\n    \"_name\" : \"hi!\"\n  }\n}", (float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder79 = multiMatchQueryBuilder73.field("hi!", (float) 10L);
        org.elasticsearch.common.bytes.BytesReference bytesReference80 = multiMatchQueryBuilder79.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference80.equals(null)", !bytesReference80.equals(null));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.slop((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 10,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.cutoffFrequency(100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.slop((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.slop((int) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference47 = multiMatchQueryBuilder46.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference47.equals(null)", !bytesReference47.equals(null));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float21 = type20.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.cutoffFrequency((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.boost((float) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.boost((float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder19.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"^1.0\", \"hi!^10.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"hi!^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ]\\n  }\\n}^1.0\" ],\n    \"slop\" : 100,\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float23 = type22.tieBreaker();
        org.elasticsearch.common.ParseField parseField24 = type22.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.type(type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder19.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type29 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        float float30 = type29.tieBreaker();
        float float31 = type29.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.type(type29);
        org.elasticsearch.common.bytes.BytesReference bytesReference33 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference33.equals(null)", !bytesReference33.equals(null));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.prefixLength((int) (byte) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.slop((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.boost((float) (-1));
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.cutoffFrequency(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 0.0,\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"lenient\\\" : false,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.slop((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.cutoffFrequency((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ]\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.maxExpansions((-1));
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.prefixLength((int) (byte) 0);
        java.lang.String str32 = multiMatchQueryBuilder31.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}", (float) (short) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : {\\n      \\\"multi_match\\\" : {\\n        \\\"query\\\" : 0,\\n        \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n        \\\"analyzer\\\" : \\\"hi!\\\",\\n        \\\"max_expansions\\\" : 0,\\n        \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n        \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n        \\\"tie_breaker\\\" : 97.0,\\n        \\\"_name\\\" : \\\"hi!\\\"\\n      }\\n    },\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}^1.0\", \"^0.0\" ],\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.cutoffFrequency((float) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder11.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"slop\" : 10,\n    \"prefix_length\" : 97,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder19.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.maxExpansions((-1));
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder25.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"fuzziness\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.prefixLength((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"boost\" : -1.0,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder28.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder28.prefixLength(100);
        org.elasticsearch.common.bytes.BytesReference bytesReference37 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference37.equals(null)", !bytesReference37.equals(null));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.tieBreaker((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.slop((int) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type30 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float31 = type30.tieBreaker();
        float float32 = type30.tieBreaker();
        org.elasticsearch.index.search.MatchQuery.Type type33 = type30.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type34 = type30.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder29.type((java.lang.Object) type34);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"slop\" : 35,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : -1.0,\n    \"lenient\" : true,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference38 = multiMatchQueryBuilder37.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference38.equals(null)", !bytesReference38.equals(null));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type23 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type24 = type23.matchQueryType();
        org.elasticsearch.common.ParseField parseField25 = type23.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder19.type(type23);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.tieBreaker((float) (byte) 100);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder35.fuzziness((java.lang.Object) "hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder35.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder65.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder67.tieBreaker((float) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference70 = multiMatchQueryBuilder69.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference70.equals(null)", !bytesReference70.equals(null));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder15.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.cutoffFrequency((float) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference43 = multiMatchQueryBuilder42.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference43.equals(null)", !bytesReference43.equals(null));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder17.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder17.maxExpansions((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder17.tieBreaker((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^0.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.cutoffFrequency((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder29.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 100.0\n  }\n}", (float) 0L);
        org.elasticsearch.common.bytes.BytesReference bytesReference37 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference37.equals(null)", !bytesReference37.equals(null));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.slop((int) (byte) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        java.lang.String str12 = multiMatchQueryBuilder7.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder7.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 97.0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.prefixLength((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.cutoffFrequency((float) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder9.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder9.prefixLength((int) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder22.fuzziness((java.lang.Object) multiMatchQueryBuilder30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder30.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder30.maxExpansions((int) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference38 = multiMatchQueryBuilder30.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference38.equals(null)", !bytesReference38.equals(null));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.boost((float) 0L);
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.tieBreaker((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.boost((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.maxExpansions((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"{\\\\n  \\\\\\\"multi_match\\\\\\\" : {\\\\n    \\\\\\\"query\\\\\\\" : 0,\\\\n    \\\\\\\"fields\\\\\\\" : [ \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\n    \\\\\\\"fuzzy_rewrite\\\\\\\" : \\\\\\\"\\\\\\\"\\\\n  }\\\\n}\\\" ],\\n    \\\"analyzer\\\" : \\\"\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0,\\n    \\\"lenient\\\" : true\\n  }\\n}\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.prefixLength((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^52.0\", \"hi!\", \"^52.0\", \"^52.0\", \"^52.0\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder41.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 100,\n    \"fuzziness\" : \"10\",\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 0.0\\n  }\\n}\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference46 = multiMatchQueryBuilder41.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference46.equals(null)", !bytesReference46.equals(null));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.maxExpansions((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 97.0,\n    \"max_expansions\" : -1,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0\n  }\n}", (float) 0L);
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float21 = type20.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.prefixLength((int) '4');
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.cutoffFrequency((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"phrase\",\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 0.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"\",\n    \"lenient\" : true,\n    \"cutoff_frequency\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference46 = multiMatchQueryBuilder45.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference46.equals(null)", !bytesReference46.equals(null));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder17.lenient(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.tieBreaker((float) (byte) 100);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder35.fuzziness((java.lang.Object) "hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder35.lenient(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference66 = multiMatchQueryBuilder65.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference66.equals(null)", !bytesReference66.equals(null));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : null,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"hi!\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\" ]\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.tieBreaker(100.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"prefix_length\" : -1,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 0.0,\n    \"lenient\" : false\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder15.slop((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.prefixLength((int) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.cutoffFrequency((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("hi!", (float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}", (float) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 0.0,\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : false,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.tieBreaker((float) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.prefixLength((int) '#');
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.cutoffFrequency((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.cutoffFrequency(1.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"boost\" : 0.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0,\n    \"lenient\" : true,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ]\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference34 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference34.equals(null)", !bytesReference34.equals(null));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) (byte) 0);
        java.lang.String str24 = multiMatchQueryBuilder23.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder23.boost((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder23.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"boost\" : -1.0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}", (float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder23.analyzer("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.tieBreaker((float) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.maxExpansions((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"boost\" : -1.0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.slop((int) 'a');
        java.lang.String str16 = multiMatchQueryBuilder15.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder11.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.prefixLength((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 97,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 100.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^52.0\", \"hi!\", \"^52.0\", \"^52.0\", \"^52.0\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.boost((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.prefixLength((int) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!^10.0\\\", \\\"^1.0\\\", \\\"hi!^10.0\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"hi!^10.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 10.0,\\n    \\\"_name\\\" : \\\"\\\"\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.slop(100);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray28);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder39.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray53);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder46, strArray53);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder21, strArray53);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference59 = multiMatchQueryBuilder58.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference59.equals(null)", !bytesReference59.equals(null));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.cutoffFrequency((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("hi!", (float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}", (float) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder21.cutoffFrequency((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder21.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder21.tieBreaker((float) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder35.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder9.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder9.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder9.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.cutoffFrequency((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type42 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type43 = type42.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type44 = type42.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type45 = type42.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder39.type(type42);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type47 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        org.elasticsearch.index.search.MatchQuery.Type type48 = type47.matchQueryType();
        org.elasticsearch.common.ParseField parseField49 = type47.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder39.type((java.lang.Object) type47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder39.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder39.cutoffFrequency((float) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference55 = multiMatchQueryBuilder54.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference55.equals(null)", !bytesReference55.equals(null));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.tieBreaker((float) (byte) 100);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder35.fuzziness((java.lang.Object) "hi!");
        org.elasticsearch.common.bytes.BytesReference bytesReference64 = multiMatchQueryBuilder35.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference64.equals(null)", !bytesReference64.equals(null));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : -1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.tieBreaker((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.prefixLength(0);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder25.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"fuzziness\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.slop(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.cutoffFrequency((float) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference33 = multiMatchQueryBuilder30.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference33.equals(null)", !bytesReference33.equals(null));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.tieBreaker((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder15.boost((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder15.tieBreaker((float) (-1));
        java.lang.String str24 = multiMatchQueryBuilder15.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder15.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\", \\\"{\\\\n  \\\\\\\"multi_match\\\\\\\" : {\\\\n    \\\\\\\"query\\\\\\\" : 0,\\\\n    \\\\\\\"fields\\\\\\\" : [ \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\" ]\\\\n  }\\\\n}^1.0\\\" ],\\n    \\\"type\\\" : \\\"best_fields\\\",\\n    \\\"boost\\\" : 1.0,\\n    \\\"prefix_length\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"\",\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^0.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"prefix_length\" : 52,\n    \"use_dis_max\" : false\n  }\n}");
        java.lang.String[] strArray20 = new java.lang.String[] {};
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder19, strArray20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.cutoffFrequency((float) (byte) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.prefixLength((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : -1.0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : false,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        java.lang.String str36 = multiMatchQueryBuilder35.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder35.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"useDisMax\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder38.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"^1.0\", \"hi!^10.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"hi!^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ]\\n  }\\n}^1.0\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"slop\" : 100,\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference43 = multiMatchQueryBuilder42.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference43.equals(null)", !bytesReference43.equals(null));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.lenient(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference33 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference33.equals(null)", !bytesReference33.equals(null));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.common.ParseField parseField22 = type20.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.type((java.lang.Object) parseField22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.useDisMax(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder22.fuzziness((java.lang.Object) multiMatchQueryBuilder30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder30.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder35.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.cutoffFrequency((float) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ]\\n  }\\n}^1.0\" ],\n    \"type\" : \"best_fields\",\n    \"boost\" : 1.0,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 10.0,\n    \"Name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 100,\n    \"fuzziness\" : \"10\",\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 0.0\\n  }\\n}\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.cutoffFrequency((float) 1L);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.maxExpansions((int) (byte) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions(10);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder22.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefixLength\" : 0,\n    \"maxExpansions\" : 0,\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 97.0,\n    \"Name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder22.cutoffFrequency((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder22.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"max_expansions\" : 1,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"prefixLength\" : 97,\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : false,\n    \"tieBreaker\" : 10.0,\n    \"lenient\" : false,\n    \"Name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder33.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 10.0\n  }\n}", 10.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference37 = multiMatchQueryBuilder36.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference37.equals(null)", !bytesReference37.equals(null));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder25.maxExpansions((int) (byte) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) (byte) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.cutoffFrequency((float) (byte) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.cutoffFrequency((-1.0f));
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.cutoffFrequency((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type42 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type43 = type42.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type44 = type42.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type45 = type42.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder39.type(type42);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type47 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        org.elasticsearch.index.search.MatchQuery.Type type48 = type47.matchQueryType();
        org.elasticsearch.common.ParseField parseField49 = type47.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder39.type((java.lang.Object) type47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder39.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder39.cutoffFrequency((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 100,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder54.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 0.0\\n  }\\n}^100.0\" ],\n    \"type\" : \"cross_fields\",\n    \"boost\" : 1.0,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"cutoff_frequency\" : 100.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference59 = multiMatchQueryBuilder58.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference59.equals(null)", !bytesReference59.equals(null));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 100,\n    \"fuzziness\" : \"most_fields\",\n    \"prefix_length\" : 97,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"\", \"hi!^10.0\", \"\", \"\", \"hi!^10.0\" ],\n    \"boost\" : 10.0,\n    \"slop\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        java.lang.String str20 = multiMatchQueryBuilder17.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.cutoffFrequency((-1.0f));
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder11.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.prefixLength((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 97,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 100.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^52.0\", \"hi!\", \"^52.0\", \"^52.0\", \"^52.0\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.boost((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.prefixLength((int) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : -1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference33 = multiMatchQueryBuilder32.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference33.equals(null)", !bytesReference33.equals(null));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.maxExpansions((int) (byte) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.maxExpansions(10);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test156");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder31.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 10.0\n  }\n}", (float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder31.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference37 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference37.equals(null)", !bytesReference37.equals(null));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test157");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.slop((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.cutoffFrequency((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ]\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.maxExpansions((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^-1.0\", \"\", \"hi!^-1.0\", \"\", \"\", \"hi!^-1.0\" ],\n    \"type\" : \"best_fields\",\n    \"boost\" : 0.0,\n    \"prefix_length\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test158");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder7.prefixLength((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder7.prefixLength(0);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test159");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.cutoffFrequency(100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.slop((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder40.minimumShouldMatch("");
        org.elasticsearch.common.bytes.BytesReference bytesReference45 = multiMatchQueryBuilder40.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference45.equals(null)", !bytesReference45.equals(null));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test160");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test161");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.boost((float) (-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.slop(1);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test162");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}", (float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.cutoffFrequency((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.tieBreaker((float) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test163");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray28);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder39.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray53);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder46, strArray53);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder55.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder57.maxExpansions((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder59.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder62.maxExpansions((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder17.fuzziness((java.lang.Object) (byte) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference66 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference66.equals(null)", !bytesReference66.equals(null));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test164");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray16);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.maxExpansions((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type23 = type22.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type24 = type22.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.fuzziness((java.lang.Object) type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder7.type(type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder7.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 97,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 100.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder7.field("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"prefix_length\" : 100,\n    \"use_dis_max\" : false,\n    \"lenient\" : true,\n    \"cutoff_frequency\" : 0.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder7.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test165");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.type(type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.boost((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test166");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.tieBreaker((float) (byte) 100);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder35.fuzziness((java.lang.Object) "hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder35.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder65.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder65.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder65.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 0.0,\\n    \\\"slop\\\" : 100,\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\" ],\n    \"type\" : \"phrase_prefix\",\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"10\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"tie_breaker\" : 35.0,\n    \"cutoff_frequency\" : 100.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference72 = multiMatchQueryBuilder71.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference72.equals(null)", !bytesReference72.equals(null));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test167");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder15.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"slop\" : 0,\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder15.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 10,\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder15.cutoffFrequency(10.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference45 = multiMatchQueryBuilder44.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference45.equals(null)", !bytesReference45.equals(null));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test168");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.lenient(true);
        java.lang.String str20 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test169");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder23.field("", (float) 1);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder46.tieBreaker((float) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type49 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float50 = type49.tieBreaker();
        org.elasticsearch.common.ParseField parseField51 = type49.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder46.type(type49);
        org.elasticsearch.common.ParseField parseField53 = type49.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder23.fuzziness((java.lang.Object) type49);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.maxExpansions((int) (byte) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference59 = multiMatchQueryBuilder58.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference59.equals(null)", !bytesReference59.equals(null));
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test170");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.cutoffFrequency((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type42 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type43 = type42.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type44 = type42.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type45 = type42.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder39.type(type42);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder46.useDisMax(false);
        java.lang.String str49 = multiMatchQueryBuilder46.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference50 = multiMatchQueryBuilder46.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference50.equals(null)", !bytesReference50.equals(null));
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test171");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.prefixLength((int) '4');
        java.lang.String str12 = multiMatchQueryBuilder11.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder11.prefixLength((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.maxExpansions((-1));
        java.lang.String str19 = multiMatchQueryBuilder16.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test172");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder11.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.prefixLength((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 97,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 100.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test173");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type29 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        float float30 = type29.tieBreaker();
        float float31 = type29.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.type(type29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.boost((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder34.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 0.0,\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : false,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference39 = multiMatchQueryBuilder34.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference39.equals(null)", !bytesReference39.equals(null));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test174");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.tieBreaker((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.slop((int) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder27.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}", (float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder27.prefixLength((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder27.cutoffFrequency((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder27.tieBreaker((float) 100L);
        org.elasticsearch.common.bytes.BytesReference bytesReference39 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference39.equals(null)", !bytesReference39.equals(null));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test175");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"slop\" : 10,\n    \"prefix_length\" : 97,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder19.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.maxExpansions((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.lenient(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test176");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.slop((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder13.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^0.0\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0\n  }\n}", 0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test177");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float21 = type20.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.cutoffFrequency((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.boost((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder30.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test178");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : false,\n    \"tieBreaker\" : 10.0,\n    \"cutoffFrequency\" : -1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}", (float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder21.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^1.0\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder30.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test179");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false,\n    \"lenient\" : false\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test180");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder15.slop((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.prefixLength((int) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test181");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test182");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.tieBreaker((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.boost((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.boost((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.lenient(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference34 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference34.equals(null)", !bytesReference34.equals(null));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test183");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.tieBreaker((float) (byte) 100);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder35.fuzziness((java.lang.Object) "hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder35.maxExpansions((int) (byte) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference66 = multiMatchQueryBuilder35.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference66.equals(null)", !bytesReference66.equals(null));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test184");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder22.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder22.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"max_expansions\" : 1,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.tieBreaker((float) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder34.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test185");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder7.maxExpansions((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder7.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"cutoff_frequency\" : -1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test186");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.cutoffFrequency((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("hi!", (float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}", (float) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder21.cutoffFrequency((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder21.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder21.tieBreaker((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 100.0,\n    \"prefix_length\" : -1,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 0.0,\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"lenient\\\" : false,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference38 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference38.equals(null)", !bytesReference38.equals(null));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test187");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.useDisMax(false);
        java.lang.String str30 = multiMatchQueryBuilder29.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test188");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.boost((float) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test189");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder11.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder11.tieBreaker((float) 100L);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test190");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.maxExpansions((int) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test191");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.prefixLength((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^52.0\", \"hi!\", \"^52.0\", \"^52.0\", \"^52.0\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.maxExpansions(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.boost(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference46 = multiMatchQueryBuilder45.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference46.equals(null)", !bytesReference46.equals(null));
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test192");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.boost((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.boost((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : {\\n      \\\"multi_match\\\" : {\\n        \\\"query\\\" : 0,\\n        \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n        \\\"analyzer\\\" : \\\"hi!\\\",\\n        \\\"max_expansions\\\" : 0,\\n        \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n        \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n        \\\"tie_breaker\\\" : 97.0,\\n        \\\"_name\\\" : \\\"hi!\\\"\\n      }\\n    },\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}^1.0\", \"^0.0\" ],\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test193");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.maxExpansions((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder35.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder35.prefixLength((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.prefixLength(1);
        org.elasticsearch.common.bytes.BytesReference bytesReference46 = multiMatchQueryBuilder43.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference46.equals(null)", !bytesReference46.equals(null));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test194");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.field("", (float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"boost\" : -1.0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : false,\n    \"tieBreaker\" : 10.0,\n    \"cutoffFrequency\" : -1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test195");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder7.maxExpansions((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder7.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\" ],\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"cutoff_frequency\" : -1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.maxExpansions((int) '#');
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test196");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.tieBreaker((float) (byte) 100);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder35.fuzziness((java.lang.Object) "hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder35.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder65.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"^1.0\", \"hi!^10.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"hi!^10.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder65.boost((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference72 = multiMatchQueryBuilder71.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference72.equals(null)", !bytesReference72.equals(null));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test197");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.tieBreaker((float) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.useDisMax(false);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder44.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder48.tieBreaker((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder52.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder26.fuzziness((java.lang.Object) "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder57.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"slop\" : 100,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference60 = multiMatchQueryBuilder57.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference60.equals(null)", !bytesReference60.equals(null));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test198");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test199");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.tieBreaker((-1.0f));
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test200");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.prefixLength((int) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.tieBreaker((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.slop((int) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test201");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test202");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.slop((int) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test203");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.boost((float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"UNDERSCORE\",\n    \"prefix_length\" : 97,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 32.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 10.0,\n    \"fuzziness\" : \"10\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.prefixLength((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0,\\n    \\\"cutoff_frequency\\\" : 100.0\\n  }\\n}^32.0\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test204");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ]\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.lenient(false);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.slop((int) (byte) 100);
        java.lang.String[] strArray46 = new java.lang.String[] { "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", "", "hi!", "{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (byte) 100, strArray46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder26, strArray46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.boost((float) '4');
        org.elasticsearch.common.bytes.BytesReference bytesReference51 = multiMatchQueryBuilder48.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference51.equals(null)", !bytesReference51.equals(null));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test205");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.slop((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder29.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder29.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"slop\" : -1,\n    \"prefix_length\" : 97,\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : false,\n    \"_name\" : \"\"\n  }\n}", (float) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder29.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder29.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"max_expansions\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"cutoff_frequency\" : 100.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference43 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference43.equals(null)", !bytesReference43.equals(null));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test206");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.prefixLength((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 10.0,\n    \"slop\" : 10,\n    \"fuzziness\" : \"10\",\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 0.0,\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : -1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test207");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.tieBreaker((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test208");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"UNDERSCORE\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 32.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test209");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder17.fuzziness((java.lang.Object) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder17.boost(10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder32.maxExpansions((int) (short) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference37 = multiMatchQueryBuilder36.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference37.equals(null)", !bytesReference37.equals(null));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test210");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.cutoffFrequency((float) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test211");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.analyzer("");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test212");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"\", \"hi!^10.0\", \"\", \"\", \"hi!^10.0\" ],\n    \"boost\" : 10.0,\n    \"slop\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder37.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder43.field("", (float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder17.fuzziness((java.lang.Object) multiMatchQueryBuilder43);
        org.elasticsearch.common.bytes.BytesReference bytesReference48 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference48.equals(null)", !bytesReference48.equals(null));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test213");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.cutoffFrequency((float) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder35.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test214");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test215");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"prefix_length\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 0.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test216");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.slop(100);
        java.lang.String[] strArray28 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray28);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder39.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray53);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder46, strArray53);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder21, strArray53);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 0.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.maxExpansions((int) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference63 = multiMatchQueryBuilder62.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference63.equals(null)", !bytesReference63.equals(null));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test217");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder17.fuzziness((java.lang.Object) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder17.boost(10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.prefixLength(0);
        java.lang.String str35 = multiMatchQueryBuilder32.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type36 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type37 = type36.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type38 = type36.matchQueryType();
        float float39 = type36.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder32.type(type36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder32.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder32.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 100.0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference45 = multiMatchQueryBuilder44.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference45.equals(null)", !bytesReference45.equals(null));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test218");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.queryName("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test219");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder7.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", 1.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : -1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference13.equals(null)", !bytesReference13.equals(null));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test220");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}");
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.maxExpansions((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type46 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type47 = type46.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type48 = type46.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder43.fuzziness((java.lang.Object) type46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder31.type(type46);
        org.elasticsearch.common.ParseField parseField51 = type46.parseField();
        org.elasticsearch.common.ParseField parseField52 = type46.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type53 = type46.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type54 = type46.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder19.type(type46);
        org.elasticsearch.common.bytes.BytesReference bytesReference56 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference56.equals(null)", !bytesReference56.equals(null));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test221");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.fuzzyRewrite("");
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test222");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.tieBreaker((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.boost((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.boost((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder27.cutoffFrequency((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder27.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder27.prefixLength((int) (short) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference38 = multiMatchQueryBuilder37.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference38.equals(null)", !bytesReference38.equals(null));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test223");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.tieBreaker((float) 0);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.lenient(true);
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder29.fuzziness((java.lang.Object) multiMatchQueryBuilder49);
        java.lang.String str53 = multiMatchQueryBuilder49.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder49.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder11.fuzziness((java.lang.Object) multiMatchQueryBuilder49);
        org.elasticsearch.common.bytes.BytesReference bytesReference57 = multiMatchQueryBuilder56.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference57.equals(null)", !bytesReference57.equals(null));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test224");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.boost((float) 1L);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test225");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder13.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.boost((float) (-1));
        java.lang.String str19 = multiMatchQueryBuilder18.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder18.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : null,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"hi!\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\" ]\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test226");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) (byte) 0);
        java.lang.String str24 = multiMatchQueryBuilder23.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder23.boost((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder23.maxExpansions(10);
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test227");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder25.boost((float) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test228");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.maxExpansions((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.boost((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.prefixLength((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test229");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) (byte) 0);
        java.lang.String str24 = multiMatchQueryBuilder23.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder23.boost((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder23.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"boost\" : -1.0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}", (float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder23.slop((int) (short) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test230");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder11.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type21 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        float float22 = type21.tieBreaker();
        float float23 = type21.tieBreaker();
        org.elasticsearch.common.ParseField parseField24 = type21.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder20.type(type21);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test231");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.prefixLength((int) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 0.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.slop((int) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test232");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 32.0,\n    \"prefixLength\" : 0,\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : true,\n    \"tieBreaker\" : 10.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test233");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder9.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder9.prefixLength((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder9.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.useDisMax(false);
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder36.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type42 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float43 = type42.tieBreaker();
        float float44 = type42.tieBreaker();
        org.elasticsearch.index.search.MatchQuery.Type type45 = type42.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder39.type(type42);
        java.lang.String[] strArray53 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray53);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder39, strArray53);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder39.boost((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder16.fuzziness((java.lang.Object) multiMatchQueryBuilder57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.boost(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference61 = multiMatchQueryBuilder58.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference61.equals(null)", !bytesReference61.equals(null));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test234");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder40.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 0.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type44 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        float float45 = type44.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder43.type(type44);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder46.prefixLength((int) (short) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference49 = multiMatchQueryBuilder46.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference49.equals(null)", !bytesReference49.equals(null));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test235");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder31.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder31.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder31.slop((int) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference41 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference41.equals(null)", !bytesReference41.equals(null));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test236");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder17.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder17.maxExpansions((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder17.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.slop((int) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder35.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test237");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder13.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.boost((float) (-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder16.cutoffFrequency(1.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder16.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder16.queryName("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"prefix_length\" : 100,\n    \"use_dis_max\" : false,\n    \"lenient\" : true,\n    \"cutoff_frequency\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : false,\n    \"tieBreaker\" : 10.0,\n    \"cutoffFrequency\" : -1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.boost((float) (-1L));
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test238");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.maxExpansions((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"boost\" : -1.0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference14.equals(null)", !bytesReference14.equals(null));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test239");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray16);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.maxExpansions((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type23 = type22.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type24 = type22.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.fuzziness((java.lang.Object) type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder7.type(type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder7.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 97,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 100.0,\n    \"_name\" : \"\"\n  }\n}");
        java.lang.String str29 = multiMatchQueryBuilder28.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder28.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 100.0\n  }\n}");
        java.lang.String str32 = multiMatchQueryBuilder31.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference33 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference33.equals(null)", !bytesReference33.equals(null));
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test240");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference41 = multiMatchQueryBuilder40.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference41.equals(null)", !bytesReference41.equals(null));
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test241");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder31.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder37.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder19.fuzziness((java.lang.Object) multiMatchQueryBuilder37);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder19.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference47 = multiMatchQueryBuilder44.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference47.equals(null)", !bytesReference47.equals(null));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test242");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) (byte) 0);
        java.lang.String str24 = multiMatchQueryBuilder23.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder23.boost((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder23.boost((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"use_dis_max\\\" : false,\\n    \\\"tie_breaker\\\" : 100.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"slop\" : 97,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : -1.0,\n    \"lenient\" : true,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder34.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test243");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test244");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type16 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float17 = type16.tieBreaker();
        org.elasticsearch.common.ParseField parseField18 = type16.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type19 = type16.matchQueryType();
        float float20 = type16.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder13.type(type16);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.cutoffFrequency((float) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"prefixLength\" : 97,\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : false,\n    \"tieBreaker\" : 10.0,\n    \"lenient\" : false,\n    \"Name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test245");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder25.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"fuzziness\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.prefixLength((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"boost\" : -1.0,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder28.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"max_expansions\" : 1,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.maxExpansions(100);
        org.elasticsearch.common.bytes.BytesReference bytesReference41 = multiMatchQueryBuilder40.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference41.equals(null)", !bytesReference41.equals(null));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test246");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.tieBreaker((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder13.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.boost((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^-1.0\", \"\", \"hi!^-1.0\", \"\", \"\", \"hi!^-1.0\" ],\n    \"type\" : \"cross_fields\",\n    \"boost\" : 0.0,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"boost\\\" : -1.0,\\n    \\\"minimumShouldMatch\\\" : \\\"hi!\\\",\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"tieBreaker\\\" : 10.0,\\n    \\\"lenient\\\" : false,\\n    \\\"Name\\\" : \\\"\\\"\\n  }\\n}\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : -1.0,\n    \"cutoff_frequency\" : 1.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 0.0,\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test247");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.tieBreaker(100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"max_expansions\" : 97,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test248");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}", (float) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder17.tieBreaker((float) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"^1.0\", \"hi!^10.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"hi!^10.0\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 0.0,\\n    \\\"slop\\\" : 100,\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\" ],\n    \"type\" : \"phrase_prefix\",\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"10\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"tie_breaker\" : 35.0,\n    \"cutoff_frequency\" : 100.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test249");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.cutoffFrequency((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.cutoffFrequency((float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^0.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ]\\n  }\\n}\" ],\n    \"boost\" : 1.0,\n    \"prefix_length\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 0.0\\n  }\\n}\"\n  }\n}", (float) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test250");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test251");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.tieBreaker((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.slop((int) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.useDisMax(false);
        java.lang.String[] strArray38 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray38);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder45.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.tieBreaker((float) 1L);
        java.lang.String str54 = multiMatchQueryBuilder51.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder51.tieBreaker((float) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder31.fuzziness((java.lang.Object) multiMatchQueryBuilder58);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder59.cutoffFrequency((float) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference62 = multiMatchQueryBuilder61.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference62.equals(null)", !bytesReference62.equals(null));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test252");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.prefixLength((int) (short) 0);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.prefixLength((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^1.0\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\"\n  }\n}", (float) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder19.analyzer("");
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test253");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.maxExpansions((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder35.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder35.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder35.queryName("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"prefix_length\" : 0,\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"\", \"hi!\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\" ]\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference46 = multiMatchQueryBuilder45.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference46.equals(null)", !bytesReference46.equals(null));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test254");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.prefixLength((int) '4');
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = multiMatchQueryBuilder9.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference12.equals(null)", !bytesReference12.equals(null));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test255");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.useDisMax(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference34 = multiMatchQueryBuilder33.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference34.equals(null)", !bytesReference34.equals(null));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test256");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.boost((float) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test257");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        java.lang.String[] strArray29 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder22.fuzziness((java.lang.Object) multiMatchQueryBuilder30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder30.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder30.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test258");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder15.slop((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder15.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"use_dis_max\\\" : false,\\n    \\\"tie_breaker\\\" : 10.0,\\n    \\\"cutoff_frequency\\\" : -1.0\\n  }\\n}\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test259");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ]\\n  }\\n}\", \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"tieBreaker\\\" : 10.0\\n  }\\n}\" ],\n    \"boost\" : 100.0,\n    \"prefix_length\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test260");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.tieBreaker((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.boost((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 0.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 0.0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"use_dis_max\\\" : true,\\n    \\\"tie_breaker\\\" : 10.0,\\n    \\\"lenient\\\" : true,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"boost\" : -1.0,\n    \"fuzziness\" : \"0\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test261");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.boost((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.prefixLength((int) (byte) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test262");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.cutoffFrequency((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.cutoffFrequency((float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^0.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions((int) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"slop\" : 0,\n    \"fuzziness\" : \"MOST_FIELDS\",\n    \"max_expansions\" : -1,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0,\n    \"cutoff_frequency\" : 10.0\n  }\n}");
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder43.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder43.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder43.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder43.maxExpansions((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder43.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type56 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        org.elasticsearch.common.ParseField parseField57 = type56.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder55.type(type56);
        org.elasticsearch.index.search.MatchQuery.Type type59 = type56.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder25.type(type56);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.prefixLength((int) (byte) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference63 = multiMatchQueryBuilder62.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference63.equals(null)", !bytesReference63.equals(null));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test263");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.type(type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.slop((int) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test264");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder9.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder9.prefixLength((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder14.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder14.cutoffFrequency((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        float float22 = type20.tieBreaker();
        float float23 = type20.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder14.type(type20);
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test265");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.tieBreaker((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder13.prefixLength(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^0.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}", (float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 0.0,\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : false,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 10.0,\n    \"fuzziness\" : \"10\",\n    \"prefixLength\" : 0,\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder30.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test266");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.boost((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"max_expansions\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"cutoff_frequency\" : 100.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test267");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder9.field("", (float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder9.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"boost\\\" : -1.0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}^52.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test268");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder31.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder37.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder19.fuzziness((java.lang.Object) multiMatchQueryBuilder37);
        org.elasticsearch.common.bytes.BytesReference bytesReference43 = multiMatchQueryBuilder42.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference43.equals(null)", !bytesReference43.equals(null));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test269");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.cutoffFrequency((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.cutoffFrequency((float) 1L);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test270");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder17.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder17.maxExpansions((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder17.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!^10.0\\\", \\\"^1.0\\\", \\\"hi!^10.0\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"hi!^10.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 10.0,\\n    \\\"_name\\\" : \\\"\\\"\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\",\n    \"boost\" : 1.0,\n    \"slop\" : 35,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : -1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.maxExpansions(10);
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder33.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test271");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder22.slop((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"max_expansions\" : -1,\n    \"fuzzy_rewrite\" : \"\",\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test272");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.tieBreaker((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder23.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"^1.0\", \"hi!^10.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"hi!^10.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ]\\n  }\\n}^1.0\" ],\n    \"slop\" : 100,\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}", (float) '#');
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test273");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) (byte) 0);
        java.lang.String str24 = multiMatchQueryBuilder23.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder23.boost((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder23.boost((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.cutoffFrequency((float) (-1L));
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder30.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test274");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.slop((int) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test275");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.prefixLength((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder13.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder13.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}", 100.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test276");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^32.0\", \"hi!\", \"^32.0\", \"^32.0\", \"^32.0\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 0.0,\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 100,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 32.0,\n    \"cutoff_frequency\" : 97.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 1.0,\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"tieBreaker\\\" : 10.0\\n  }\\n}^100.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"type\\\" : \\\"most_fields\\\",\\n    \\\"analyzer\\\" : \\\"\\\",\\n    \\\"boost\\\" : -1.0,\\n    \\\"prefix_length\\\" : 100,\\n    \\\"max_expansions\\\" : 52,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test277");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float21 = type20.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.cutoffFrequency((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.boost((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder26.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : {\\n      \\\"multi_match\\\" : {\\n        \\\"query\\\" : 0,\\n        \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n        \\\"analyzer\\\" : \\\"hi!\\\",\\n        \\\"max_expansions\\\" : 0,\\n        \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n        \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n        \\\"tie_breaker\\\" : 97.0,\\n        \\\"_name\\\" : \\\"hi!\\\"\\n      }\\n    },\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}^1.0\", \"^0.0\" ],\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}", (float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder26.lenient(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder35.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test278");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!^10.0\\\", \\\"^1.0\\\", \\\"hi!^10.0\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"hi!^10.0\\\", \\\"{\\\\n  \\\\\\\"multi_match\\\\\\\" : {\\\\n    \\\\\\\"query\\\\\\\" : 0,\\\\n    \\\\\\\"fields\\\\\\\" : [ \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"\\\\\\\" ]\\\\n  }\\\\n}^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"max_expansions\\\" : 1,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"tie_breaker\\\" : 10.0,\\n    \\\"_name\\\" : \\\"\\\"\\n  }\\n}\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder7.tieBreaker((float) '#');
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = multiMatchQueryBuilder7.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference14.equals(null)", !bytesReference14.equals(null));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test279");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) (byte) 0);
        java.lang.String str24 = multiMatchQueryBuilder23.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder23.boost((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder23.boost((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.useDisMax(true);
        java.lang.String str31 = multiMatchQueryBuilder30.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder30.slop(10);
        java.lang.String str34 = multiMatchQueryBuilder30.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder30.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test280");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.tieBreaker((float) (byte) 100);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder35.fuzziness((java.lang.Object) "hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder35.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder65.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"^1.0\", \"hi!^10.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"hi!^10.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder65.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : -1.0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : false,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.cutoffFrequency((float) (short) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference72 = multiMatchQueryBuilder71.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference72.equals(null)", !bytesReference72.equals(null));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test281");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder17.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder17.maxExpansions((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder17.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"\", \"hi!^10.0\", \"\", \"\", \"hi!^10.0\" ],\n    \"boost\" : 10.0,\n    \"slop\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder33.cutoffFrequency((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder33.tieBreaker((float) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference40 = multiMatchQueryBuilder39.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference40.equals(null)", !bytesReference40.equals(null));
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test282");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder28.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder31.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 10.0\n  }\n}", (float) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test283");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.tieBreaker((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float21 = type20.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.type(type20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.cutoffFrequency(10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder19.prefixLength((int) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test284");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.slop((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.cutoffFrequency((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.tieBreaker((float) (byte) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test285");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^0.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.maxExpansions((int) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test286");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.cutoffFrequency((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("hi!", (float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.maxExpansions(0);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test287");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.prefixLength(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.prefixLength((int) (byte) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test288");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder24.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 100.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder27.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"prefixLength\" : 97,\n    \"maxExpansions\" : 10,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : false,\n    \"tieBreaker\" : 10.0,\n    \"lenient\" : false,\n    \"Name\" : \"\"\n  }\n}", (float) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test289");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.tieBreaker((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.prefixLength((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.lenient(false);
        java.lang.String str18 = multiMatchQueryBuilder11.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test290");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}");
        java.lang.String[] strArray16 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray16);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.maxExpansions((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type23 = type22.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type24 = type22.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.fuzziness((java.lang.Object) type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder7.type(type22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder7.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 97,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 100.0,\n    \"_name\" : \"\"\n  }\n}");
        java.lang.String str29 = multiMatchQueryBuilder28.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder28.prefixLength(0);
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test291");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.maxExpansions((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder25.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"fuzziness\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.slop(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.cutoffFrequency((float) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference33 = multiMatchQueryBuilder32.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference33.equals(null)", !bytesReference33.equals(null));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test292");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.cutoffFrequency((float) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.prefixLength((int) (short) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test293");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}");
        java.lang.String[] strArray40 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.maxExpansions((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type46 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type47 = type46.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type48 = type46.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder43.fuzziness((java.lang.Object) type46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder31.type(type46);
        org.elasticsearch.common.ParseField parseField51 = type46.parseField();
        org.elasticsearch.common.ParseField parseField52 = type46.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type53 = type46.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type54 = type46.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder19.type(type46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder19.maxExpansions((int) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference58 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference58.equals(null)", !bytesReference58.equals(null));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test294");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.prefixLength((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.slop((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.boost((float) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test295");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder22.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefixLength\" : 0,\n    \"maxExpansions\" : 0,\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 97.0,\n    \"Name\" : \"hi!\"\n  }\n}");
        java.lang.String[] strArray34 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray34);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder45.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray59 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray59);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder52, strArray59);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder27, strArray59);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder27.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\"\\n  }\\n}^32.0\" ],\n    \"boost\" : 10.0,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 0.0,\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference65 = multiMatchQueryBuilder64.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference65.equals(null)", !bytesReference65.equals(null));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test296");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        java.lang.String str18 = multiMatchQueryBuilder17.toString();
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type35 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float36 = type35.tieBreaker();
        org.elasticsearch.common.ParseField parseField37 = type35.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type38 = type35.matchQueryType();
        float float39 = type35.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder32.type(type35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder17.fuzziness((java.lang.Object) type35);
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray48);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder55.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder57.slop((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder57.cutoffFrequency((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder61.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder63.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ]\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder63.maxExpansions((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type68 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type69 = type68.matchQueryType();
        org.elasticsearch.common.ParseField parseField70 = type68.parseField();
        org.elasticsearch.common.ParseField parseField71 = type68.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type72 = type68.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type73 = type68.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder74 = multiMatchQueryBuilder67.type((java.lang.Object) type68);
        org.elasticsearch.common.ParseField parseField75 = type68.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder17.type(type68);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder79 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true,\n    \"_name\" : \"\"\n  }\n}", (float) 1L);
        org.elasticsearch.common.bytes.BytesReference bytesReference80 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference80.equals(null)", !bytesReference80.equals(null));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test297");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^0.0\", \"\", \"hi!^0.0\", \"\", \"\", \"hi!^0.0\" ],\n    \"analyzer\" : \"\",\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 97.0,\\n    \\\"max_expansions\\\" : -1,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0\\n  }\\n}\",\n    \"tieBreaker\" : 10.0,\n    \"cutoffFrequency\" : -1.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference12 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference12.equals(null)", !bytesReference12.equals(null));
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test298");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : null,\n    \"fields\" : [ \"hi!\", \"\", \"\", \"hi!\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\" ]\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.tieBreaker(100.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test299");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.cutoffFrequency((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("hi!", (float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder21.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"use_dis_max\\\" : false,\\n    \\\"tie_breaker\\\" : 100.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^0.0\", \"\", \"hi!^0.0\", \"\", \"\", \"hi!^0.0\" ],\n    \"analyzer\" : \"\",\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"boost\\\" : 97.0,\\n    \\\"max_expansions\\\" : -1,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0\\n  }\\n}\",\n    \"tieBreaker\" : 10.0,\n    \"cutoffFrequency\" : -1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.boost((-1.0f));
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder32.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test300");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.field("", (float) 100);
        java.lang.String str23 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0,\n    \"_name\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"useDisMax\\\" : false,\\n    \\\"tieBreaker\\\" : 10.0,\\n    \\\"cutoffFrequency\\\" : -1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test301");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder17.tieBreaker((float) (byte) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test302");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.tieBreaker((float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder13.prefixLength(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^0.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}", (float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.tieBreaker((float) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test303");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder7.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", 1.0f);
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray17);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder7.fuzziness((java.lang.Object) multiMatchQueryBuilder30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.cutoffFrequency((float) '#');
        org.elasticsearch.common.bytes.BytesReference bytesReference38 = multiMatchQueryBuilder35.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference38.equals(null)", !bytesReference38.equals(null));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test304");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker(0.0f);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder43.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder49.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder49.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.tieBreaker((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder27.fuzziness((java.lang.Object) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder59.maxExpansions((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder61.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder63.cutoffFrequency((float) (short) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference66 = multiMatchQueryBuilder63.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference66.equals(null)", !bytesReference66.equals(null));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test305");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.prefixLength(100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder39.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference44 = multiMatchQueryBuilder39.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference44.equals(null)", !bytesReference44.equals(null));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test306");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.slop((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^1.0\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.queryName("");
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test307");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.boost((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.boost((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : {\\n      \\\"multi_match\\\" : {\\n        \\\"query\\\" : 0,\\n        \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n        \\\"analyzer\\\" : \\\"hi!\\\",\\n        \\\"max_expansions\\\" : 0,\\n        \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n        \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n        \\\"tie_breaker\\\" : 97.0,\\n        \\\"_name\\\" : \\\"hi!\\\"\\n      }\\n    },\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}^1.0\", \"^0.0\" ],\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 35.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.prefixLength(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.slop((int) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference31 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference31.equals(null)", !bytesReference31.equals(null));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test308");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test309");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.tieBreaker((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.slop((int) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.analyzer("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder27.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.slop((int) (byte) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference38 = multiMatchQueryBuilder37.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference38.equals(null)", !bytesReference38.equals(null));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test310");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.cutoffFrequency((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}^-1.0\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 0.0\\n  }\\n}\",\n    \"boost\" : -1.0,\n    \"slop\" : 97,\n    \"prefix_length\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder13.boost((float) (byte) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test311");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder33.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"prefix_length\" : 52,\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder33.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference40 = multiMatchQueryBuilder33.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference40.equals(null)", !bytesReference40.equals(null));
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test312");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"slop\" : 1,\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"lenient\\\" : true,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test313");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.slop(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.boost((float) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder25.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"prefix_length\" : -1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"cutoff_frequency\" : -1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.lenient(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test314");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.tieBreaker((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder15.boost((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder15.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 10.0,\n    \"fuzziness\" : \"10\",\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 0.0,\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder15.prefixLength((int) (short) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test315");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.slop(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.prefixLength((int) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder30.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"analyzer\" : \"\",\n    \"boost\" : -1.0,\n    \"prefix_length\" : 100,\n    \"max_expansions\" : 52,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : -1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"type\" : \"cross_fields\",\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 35.0,\n    \"cutoff_frequency\" : 100.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder32.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test316");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        java.lang.String str22 = multiMatchQueryBuilder19.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.prefixLength((int) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test317");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        org.elasticsearch.common.ParseField parseField22 = type20.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.type((java.lang.Object) parseField22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.boost(1.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker(100.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test318");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.cutoffFrequency((float) ' ');
        org.elasticsearch.common.bytes.BytesReference bytesReference33 = multiMatchQueryBuilder28.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference33.equals(null)", !bytesReference33.equals(null));
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test319");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder37.tieBreaker((float) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference42 = multiMatchQueryBuilder37.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference42.equals(null)", !bytesReference42.equals(null));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test320");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.maxExpansions((int) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test321");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder17.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder17.maxExpansions((int) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder17.maxExpansions((int) (byte) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test322");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.analyzer("hi!");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : false,\n    \"tieBreaker\" : 10.0,\n    \"cutoffFrequency\" : -1.0\n  }\n}");
        java.lang.Class<?> wildcardClass42 = multiMatchQueryBuilder39.getClass();
        java.lang.String[] strArray49 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray49);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder56.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.field("");
        java.lang.String[] strArray69 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder60, strArray69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder39, strArray69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "hi!", strArray69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder73.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true,\n    \"_name\" : \"hi!\"\n  }\n}", (float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder79 = multiMatchQueryBuilder73.field("hi!", (float) 10L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder81 = multiMatchQueryBuilder73.cutoffFrequency((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder83 = multiMatchQueryBuilder81.boost((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder85 = multiMatchQueryBuilder81.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder87 = multiMatchQueryBuilder85.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference88 = multiMatchQueryBuilder85.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference88.equals(null)", !bytesReference88.equals(null));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test323");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"analyzer\" : \"\",\n    \"prefixLength\" : 100,\n    \"maxExpansions\" : 52,\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^-1.0\", \"\", \"hi!^-1.0\", \"\", \"\", \"hi!^-1.0\" ],\n    \"boost\" : 0.0,\n    \"max_expansions\" : 0,\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test324");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"^1.0\", \"hi!^10.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"hi!^10.0\" ],\n    \"type\" : \"cross_fields\",\n    \"slop\" : 100,\n    \"minimum_should_match\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"useDisMax\\\" : false,\\n    \\\"tieBreaker\\\" : 10.0,\\n    \\\"cutoffFrequency\\\" : -1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.useDisMax(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test325");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        java.lang.String str36 = multiMatchQueryBuilder35.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder35.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"useDisMax\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.boost((float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder40.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\"\\n  }\\n}^32.0\" ],\n    \"boost\" : 10.0,\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0,\\n    \\\"_name\\\" : \\\"\\\"\\n  }\\n}\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference45 = multiMatchQueryBuilder44.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference45.equals(null)", !bytesReference45.equals(null));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test326");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder24, strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 0.0,\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : false,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.slop((int) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference44 = multiMatchQueryBuilder41.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference44.equals(null)", !bytesReference44.equals(null));
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test327");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder17.fuzziness((java.lang.Object) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder17.boost(10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.prefixLength(0);
        java.lang.String str35 = multiMatchQueryBuilder32.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder32.tieBreaker((float) 10L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder32.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"prefix_length\" : 0,\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"\", \"hi!\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}\" ]\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference40 = multiMatchQueryBuilder39.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference40.equals(null)", !bytesReference40.equals(null));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test328");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^-1.0\", \"\", \"hi!^-1.0\", \"\", \"\", \"hi!^-1.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"use_dis_max\\\" : false,\\n    \\\"tie_breaker\\\" : 100.0\\n  }\\n}^97.0\" ],\n    \"type\" : \"cross_fields\",\n    \"boost\" : 1.0,\n    \"prefix_length\" : 52,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 32.0,\n    \"lenient\" : true\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test329");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"boost\" : 1.0,\n    \"fuzziness\" : \"UNDERSCORE\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 32.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test330");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.cutoffFrequency((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.field("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : 0,\n        \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n        \"analyzer\" : \"hi!\",\n        \"max_expansions\" : 0,\n        \"minimum_should_match\" : \"hi!\",\n        \"fuzzy_rewrite\" : \"hi!\",\n        \"tie_breaker\" : 97.0,\n        \"_name\" : \"hi!\"\n      }\n    },\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 1.0,\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference34 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference34.equals(null)", !bytesReference34.equals(null));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test331");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^0.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.boost((float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.boost((float) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder44.prefixLength((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.prefixLength((int) (short) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference53 = multiMatchQueryBuilder50.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference53.equals(null)", !bytesReference53.equals(null));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test332");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.field("hi!", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 10.0,\n    \"fuzziness\" : \"10\",\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test333");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder7.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder7.tieBreaker((float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder7.analyzer("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"boost\" : -1.0,\n    \"slop\" : 35,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : 0.0,\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"lenient\\\" : false,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test334");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"cutoff_frequency\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"\", \"hi!^10.0\", \"\", \"\", \"hi!^10.0\" ],\n    \"boost\" : 10.0,\n    \"slop\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test335");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.prefixLength(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.tieBreaker(0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test336");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"^1.0\", \"hi!^10.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"hi!^10.0\" ],\n    \"type\" : \"cross_fields\",\n    \"slop\" : 100,\n    \"minimum_should_match\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzyRewrite\\\" : \\\"hi!\\\",\\n    \\\"useDisMax\\\" : false,\\n    \\\"tieBreaker\\\" : 10.0,\\n    \\\"cutoffFrequency\\\" : -1.0\\n  }\\n}\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.prefixLength((int) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^1.0\\\", \\\"hi!\\\", \\\"^1.0\\\", \\\"^1.0\\\", \\\"^1.0\\\" ],\\n    \\\"slop\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"boost\\\" : -1.0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 10.0\\n  }\\n}^52.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : true,\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test337");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder17.fuzziness((java.lang.Object) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder17.boost(10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.prefixLength(0);
        java.lang.String str35 = multiMatchQueryBuilder32.toString();
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder32.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test338");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.lenient(true);
        java.lang.String[] strArray26 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder15.fuzziness((java.lang.Object) multiMatchQueryBuilder35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.tieBreaker((float) (byte) 100);
        java.lang.String[] strArray47 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder35.fuzziness((java.lang.Object) "hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder35.maxExpansions((int) (byte) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder65.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!^10.0\", \"^1.0\", \"hi!^10.0\", \"^1.0\", \"^1.0\", \"^1.0\", \"hi!^10.0\" ],\n    \"slop\" : 100,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder65.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"boost\" : -1.0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : false,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.cutoffFrequency((float) (short) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference72 = multiMatchQueryBuilder69.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference72.equals(null)", !bytesReference72.equals(null));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test339");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.tieBreaker(0.0f);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder43.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder49.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder49.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.tieBreaker((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder27.fuzziness((java.lang.Object) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder27.cutoffFrequency((float) 10L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder27.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : true\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder27.cutoffFrequency((float) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference66 = multiMatchQueryBuilder65.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference66.equals(null)", !bytesReference66.equals(null));
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test340");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.prefixLength((int) '4');
        java.lang.String str12 = multiMatchQueryBuilder11.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder11.prefixLength((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.tieBreaker((float) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.queryName("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^1.0\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"^-1.0\\\", \\\"hi!\\\", \\\"^-1.0\\\", \\\"^-1.0\\\", \\\"^-1.0\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"prefix_length\\\" : 0,\\n    \\\"max_expansions\\\" : 0,\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 97.0,\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.maxExpansions((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.prefixLength(0);
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test341");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker((float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.boost((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.slop((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder29.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder29.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"type\" : \"cross_fields\",\n    \"analyzer\" : \"hi!\",\n    \"boost\" : 1.0,\n    \"slop\" : -1,\n    \"prefix_length\" : 97,\n    \"max_expansions\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0,\n    \"lenient\" : false,\n    \"_name\" : \"\"\n  }\n}", (float) (byte) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference39 = multiMatchQueryBuilder38.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference39.equals(null)", !bytesReference39.equals(null));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test342");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.slop((int) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.boost((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.maxExpansions(1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder23.boost((float) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test343");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^0.0\", \"hi!\", \"^0.0\", \"^0.0\", \"^0.0\", \"^0.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 1.0\\n  }\\n}^0.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"prefix_length\" : 0,\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.prefixLength(100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder23.prefixLength((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder23.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\" ],\n    \"slop\" : 100,\n    \"prefix_length\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test344");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.slop((int) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.boost((float) (short) 0);
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder47.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder47.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.maxExpansions((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder51.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder55.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"fuzziness\" : \"class org.elasticsearch.index.query.MultiMatchQueryBuilder\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"use_dis_max\" : false,\n    \"tie_breaker\" : 10.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.slop(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder58.tieBreaker((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type63 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        float float64 = type63.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder62.type(type63);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder62.field("{\n  \"multiMatch\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"prefixLength\" : 0,\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 10.0,\n    \"Name\" : \"hi!\"\n  }\n}", (float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type69 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        float float70 = type69.tieBreaker();
        org.elasticsearch.index.search.MatchQuery.Type type71 = type69.matchQueryType();
        org.elasticsearch.common.ParseField parseField72 = type69.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type73 = type69.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder74 = multiMatchQueryBuilder62.type(type69);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder75 = multiMatchQueryBuilder27.type(type69);
        org.elasticsearch.common.bytes.BytesReference bytesReference76 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference76.equals(null)", !bytesReference76.equals(null));
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test345");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.tieBreaker((float) 'a');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder17.field("", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.queryName("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type27 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type28 = type27.matchQueryType();
        org.elasticsearch.common.ParseField parseField29 = type27.parseField();
        org.elasticsearch.common.ParseField parseField30 = type27.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type31 = type27.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder22.type(type27);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.slop((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder32.maxExpansions((int) (byte) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference37 = multiMatchQueryBuilder32.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference37.equals(null)", !bytesReference37.equals(null));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test346");
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder7.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder9.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.field("", (float) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^1.0\", \"hi!\", \"^1.0\", \"^1.0\", \"^1.0\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\"\\n  }\\n}^-1.0\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : 0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"\\\", \\\"\\\" ],\\n    \\\"analyzer\\\" : \\\"hi!\\\",\\n    \\\"minimum_should_match\\\" : \\\"\\\",\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 0.0\\n  }\\n}\",\n    \"slop\" : 100,\n    \"prefix_length\" : 10,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder19.cutoffFrequency(1.0f);
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.tieBreaker((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.analyzer("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder42.analyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder44.queryName("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\", \"\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.maxExpansions((int) (short) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder48.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder48.field("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"\", \"\" ],\n    \"analyzer\" : \"\",\n    \"boost\" : 10.0,\n    \"fuzziness\" : \"10\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 10.0\n  }\n}", 100.0f);
        java.lang.String[] strArray62 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray62);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder63.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : 0,\n    \"fields\" : [ \"hi!\", \"^-1.0\", \"hi!\", \"^-1.0\", \"^-1.0\", \"^-1.0\" ],\n    \"analyzer\" : \"hi!\",\n    \"minimum_should_match\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 97.0,\n    \"lenient\" : false,\n    \"_name\" : \"hi!\"\n  }\n}");
        java.lang.String[] strArray72 = new java.lang.String[] { "hi!", "", "hi!", "", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray72);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder75 = multiMatchQueryBuilder73.minimumShouldMatch("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder77 = multiMatchQueryBuilder75.maxExpansions((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type78 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type79 = type78.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type80 = type78.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder81 = multiMatchQueryBuilder75.fuzziness((java.lang.Object) type78);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder82 = multiMatchQueryBuilder63.type(type78);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder83 = multiMatchQueryBuilder48.type(type78);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder84 = multiMatchQueryBuilder19.type(type78);
        org.elasticsearch.common.bytes.BytesReference bytesReference85 = multiMatchQueryBuilder84.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference85.equals(null)", !bytesReference85.equals(null));
    }
}

