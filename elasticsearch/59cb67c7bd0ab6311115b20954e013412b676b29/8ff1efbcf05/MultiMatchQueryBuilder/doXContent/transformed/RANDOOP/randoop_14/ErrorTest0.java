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
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        java.util.List<java.lang.String> strList12 = multiMatchQueryBuilder10.getfields();
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference13.equals(null)", !bytesReference13.equals(null));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test002");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference11.equals(null)", !bytesReference11.equals(null));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test003");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.tieBreaker((float) 100);
        java.lang.String str16 = multiMatchQueryBuilder13.analyzer;
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test004");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.minimumShouldMatch = "hi!";
        java.lang.String str12 = multiMatchQueryBuilder8.fuzzyRewrite;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference13.equals(null)", !bytesReference13.equals(null));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test005");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.boost((float) 100L);
        multiMatchQueryBuilder10.tieBreaker = (-1.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test006");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.slop((int) '#');
        java.lang.String str14 = multiMatchQueryBuilder13.fuzzyRewrite;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test007");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        org.elasticsearch.common.unit.Fuzziness fuzziness15 = multiMatchQueryBuilder10.fuzziness;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test008");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        multiMatchQueryBuilder11.queryName = "hi!";
        java.lang.Integer int14 = multiMatchQueryBuilder11.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type15 = multiMatchQueryBuilder11.gettype();
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator16 = multiMatchQueryBuilder11.operator;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ]\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test009");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder8.lenient(false);
        java.util.List<java.lang.String> strList16 = multiMatchQueryBuilder15.fields;
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test010");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        multiMatchQueryBuilder11.queryName = "hi!";
        java.lang.String str14 = multiMatchQueryBuilder11.getqueryName();
        multiMatchQueryBuilder11.queryName = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.prefixLength((int) (short) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test011");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        java.util.List<java.lang.String> strList12 = multiMatchQueryBuilder10.getfields();
        java.lang.Integer int13 = multiMatchQueryBuilder10.slop;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ]\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.tieBreaker((float) '4');
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test012");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        java.lang.String str15 = multiMatchQueryBuilder14.getanalyzer();
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test013");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.prefixLength((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder8.boost((float) (short) 0);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test014");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Boolean boolean12 = multiMatchQueryBuilder8.useDisMax;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder8.slop((int) '4');
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test015");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        multiMatchQueryBuilder8.setqueryName("hi!");
        java.lang.Integer int14 = multiMatchQueryBuilder8.prefixLength;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test016");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.analyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        java.lang.Float float15 = multiMatchQueryBuilder11.getcutoffFrequency();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.cutoffFrequency((float) 100L);
        multiMatchQueryBuilder11.setslop((java.lang.Integer) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test017");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.field("hi!");
        java.lang.String str14 = multiMatchQueryBuilder13.getanalyzer();
        multiMatchQueryBuilder13.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}";
        multiMatchQueryBuilder13.setcutoffFrequency((java.lang.Float) 0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test018");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        multiMatchQueryBuilder11.setfuzzyRewrite("");
        java.lang.String str17 = multiMatchQueryBuilder11.getfuzzyRewrite();
        java.lang.Boolean boolean18 = multiMatchQueryBuilder11.lenient;
        java.lang.Object obj19 = multiMatchQueryBuilder11.text;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float21 = type20.tieBreaker();
        float float22 = type20.tieBreaker();
        multiMatchQueryBuilder11.settype(type20);
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test019");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.slop((int) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test020");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        java.lang.String[] strArray11 = new java.lang.String[] { "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 0,\n    \"use_dis_max\" : false\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder8, strArray11);
        java.lang.Float float13 = multiMatchQueryBuilder12.getboost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder12.useDisMax(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test021");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        java.lang.Class<?> wildcardClass1 = dateTimeFormatter0.getClass();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) wildcardClass1, strArray9);
        java.lang.String str12 = multiMatchQueryBuilder11.minimumShouldMatch;
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference13.equals(null)", !bytesReference13.equals(null));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test022");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.analyzer("hi!");
        java.lang.String str13 = multiMatchQueryBuilder12.getfuzzyRewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.field("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"minimumShouldMatch\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 100.0\\n  }\\n}\",\n    \"useDisMax\" : false,\n    \"tieBreaker\" : 0.0\n  }\n}", (float) (-1));
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test023");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        multiMatchQueryBuilder8.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.lenient(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference13 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference13.equals(null)", !bytesReference13.equals(null));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test024");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.maxExpansions((int) (byte) 0);
        multiMatchQueryBuilder8.setqueryName("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        multiMatchQueryBuilder8.useDisMax = true;
        java.util.List<java.lang.String> strList18 = multiMatchQueryBuilder8.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float20 = type19.tieBreaker();
        float float21 = type19.tieBreaker();
        org.elasticsearch.common.ParseField parseField22 = type19.parseField();
        float float23 = type19.tieBreaker();
        org.elasticsearch.index.search.MatchQuery.Type type24 = type19.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder8.type(type19);
        java.lang.Integer int26 = multiMatchQueryBuilder8.getslop();
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test025");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        multiMatchQueryBuilder11.setfuzzyRewrite("");
        java.lang.String str17 = multiMatchQueryBuilder11.getfuzzyRewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.tieBreaker(0.0f);
        multiMatchQueryBuilder19.setuseDisMax((java.lang.Boolean) true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\", \"hi!\" ],\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 52.0,\\n    \\\"max_expansions\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        multiMatchQueryBuilder23.fuzzyRewrite = "{\n  \"multiMatch\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"useDisMax\" : true,\n    \"cutoffFrequency\" : 100.0\n  }\n}";
        java.lang.String str26 = multiMatchQueryBuilder23.getminimumShouldMatch();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type27 = multiMatchQueryBuilder23.type;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder23.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type30 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float31 = type30.tieBreaker();
        float float32 = type30.tieBreaker();
        float float33 = type30.tieBreaker();
        multiMatchQueryBuilder23.type = type30;
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test026");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.analyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test027");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        multiMatchQueryBuilder10.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        java.lang.Integer int16 = multiMatchQueryBuilder15.maxExpansions;
        java.lang.String str17 = multiMatchQueryBuilder15.fuzzyRewrite;
        multiMatchQueryBuilder15.tieBreaker = 10.0f;
        org.elasticsearch.common.unit.Fuzziness fuzziness20 = multiMatchQueryBuilder15.getfuzziness();
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test028");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.slop((int) (short) 10);
        multiMatchQueryBuilder10.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test029");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.tieBreaker((float) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator16 = multiMatchQueryBuilder15.getoperator();
        java.lang.Float float17 = multiMatchQueryBuilder15.boost;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.analyzer("hi!");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test030");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.boost((float) 100L);
        multiMatchQueryBuilder10.tieBreaker = (-1.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.slop((int) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test031");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.slop((int) (short) 10);
        multiMatchQueryBuilder10.setqueryName("hi!");
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test032");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = multiMatchQueryBuilder11.zeroTermsQuery;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type14 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type15 = type14.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder11.type(type14);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test033");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        multiMatchQueryBuilder11.queryName = "hi!";
        java.lang.Integer int14 = multiMatchQueryBuilder11.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("hi!", (float) (-1L));
        multiMatchQueryBuilder17.slop = 0;
        java.lang.String str20 = multiMatchQueryBuilder17.analyzer;
        multiMatchQueryBuilder17.setminimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 0\n  }\n}");
        java.lang.Boolean boolean23 = multiMatchQueryBuilder17.getlenient();
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test034");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        multiMatchQueryBuilder10.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}";
        java.lang.Integer int17 = multiMatchQueryBuilder10.getslop();
        java.lang.Float float18 = multiMatchQueryBuilder10.getcutoffFrequency();
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test035");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        multiMatchQueryBuilder10.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}";
        java.lang.Integer int17 = multiMatchQueryBuilder10.getslop();
        java.lang.Float float18 = multiMatchQueryBuilder10.getcutoffFrequency();
        java.lang.String str19 = multiMatchQueryBuilder10.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 0,\n    \"use_dis_max\" : false\n  }\n}");
        java.lang.Float float22 = multiMatchQueryBuilder21.cutoffFrequency;
        multiMatchQueryBuilder21.setlenient((java.lang.Boolean) false);
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test036");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.maxExpansions((int) (byte) 0);
        multiMatchQueryBuilder8.setqueryName("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        org.elasticsearch.common.unit.Fuzziness fuzziness16 = multiMatchQueryBuilder8.getfuzziness();
        multiMatchQueryBuilder8.maxExpansions = 1;
        java.lang.Boolean boolean19 = multiMatchQueryBuilder8.getlenient();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder8.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ]\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test037");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        multiMatchQueryBuilder8.setqueryName("hi!");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray21);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery23 = multiMatchQueryBuilder22.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder22.boost((float) (short) 100);
        java.lang.Integer int26 = multiMatchQueryBuilder25.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder25.boost((float) '4');
        multiMatchQueryBuilder25.setfuzzyRewrite("");
        java.lang.String str31 = multiMatchQueryBuilder25.getfuzzyRewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder25.tieBreaker(0.0f);
        multiMatchQueryBuilder25.boost = 0.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type36 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        multiMatchQueryBuilder25.type = type36;
        float float38 = type36.tieBreaker();
        float float39 = type36.tieBreaker();
        multiMatchQueryBuilder8.settype(type36);
        java.util.List<java.lang.String> strList41 = multiMatchQueryBuilder8.fields;
        java.util.List<java.lang.String> strList42 = multiMatchQueryBuilder8.fields;
        multiMatchQueryBuilder8.tieBreaker = 0.0f;
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray52);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery54 = multiMatchQueryBuilder53.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder53.boost((float) (short) 100);
        multiMatchQueryBuilder56.queryName = "hi!";
        java.lang.Integer int59 = multiMatchQueryBuilder56.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type60 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        multiMatchQueryBuilder56.settype(type60);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder8.type((java.lang.Object) type60);
        org.elasticsearch.common.bytes.BytesReference bytesReference63 = multiMatchQueryBuilder62.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference63.equals(null)", !bytesReference63.equals(null));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test038");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.field("hi!");
        multiMatchQueryBuilder10.settieBreaker((java.lang.Float) 10.0f);
        multiMatchQueryBuilder10.useDisMax = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ]\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test039");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator13 = multiMatchQueryBuilder11.operator;
        multiMatchQueryBuilder11.setslop((java.lang.Integer) 10);
        org.elasticsearch.common.unit.Fuzziness fuzziness16 = multiMatchQueryBuilder11.fuzziness;
        multiMatchQueryBuilder11.analyzer = "{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"prefixLength\" : 1,\n    \"useDisMax\" : false,\n    \"cutoffFrequency\" : 0.0\n  }\n}";
        java.lang.Boolean boolean19 = multiMatchQueryBuilder11.getlenient();
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test040");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        multiMatchQueryBuilder11.setfuzzyRewrite("");
        java.lang.Integer int17 = multiMatchQueryBuilder11.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.boost(10.0f);
        multiMatchQueryBuilder19.minimumShouldMatch = "";
        multiMatchQueryBuilder19.boost = 0.0f;
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator24 = multiMatchQueryBuilder19.operator;
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test041");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.String str12 = multiMatchQueryBuilder8.toString();
        java.lang.Boolean boolean13 = multiMatchQueryBuilder8.lenient;
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap14 = multiMatchQueryBuilder8.fieldsBoosts;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test042");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        multiMatchQueryBuilder10.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}";
        java.lang.Integer int17 = multiMatchQueryBuilder10.getslop();
        java.lang.Float float18 = multiMatchQueryBuilder10.getcutoffFrequency();
        java.lang.String str19 = multiMatchQueryBuilder10.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 0,\n    \"use_dis_max\" : false\n  }\n}");
        java.lang.Float float22 = multiMatchQueryBuilder21.cutoffFrequency;
        multiMatchQueryBuilder21.fuzzyRewrite = "{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"prefixLength\" : 1,\n    \"useDisMax\" : false,\n    \"cutoffFrequency\" : 0.0\n  }\n}";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.boost((float) 'a');
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test043");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        multiMatchQueryBuilder11.setfuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.boost((float) ' ');
        java.lang.Integer int19 = multiMatchQueryBuilder18.slop;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder18.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : true\n  }\n}", (float) (byte) 0);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery25 = multiMatchQueryBuilder18.getzeroTermsQuery();
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test044");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        java.lang.Float float15 = multiMatchQueryBuilder14.getcutoffFrequency();
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test045");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        java.lang.String[] strArray11 = new java.lang.String[] { "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 0,\n    \"use_dis_max\" : false\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder8, strArray11);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = multiMatchQueryBuilder8.type;
        java.lang.String str14 = multiMatchQueryBuilder8.getanalyzer();
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test046");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.slop((int) (short) 10);
        multiMatchQueryBuilder10.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.boost((float) 'a');
        multiMatchQueryBuilder19.useDisMax = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test047");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0d, strArray9);
        multiMatchQueryBuilder12.maxExpansions = (-1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type15 = multiMatchQueryBuilder12.gettype();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type16 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float17 = type16.tieBreaker();
        float float18 = type16.tieBreaker();
        org.elasticsearch.common.ParseField parseField19 = type16.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type20 = type16.matchQueryType();
        org.elasticsearch.common.ParseField parseField21 = type16.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder12.type(type16);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test048");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        multiMatchQueryBuilder11.setfuzzyRewrite("");
        java.lang.Integer int17 = multiMatchQueryBuilder11.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.maxExpansions((int) (byte) 100);
        multiMatchQueryBuilder19.queryName = "{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}\",\n    \"useDisMax\" : false\n  }\n}";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\", \"hi!\" ],\n    \"fuzziness\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 52.0,\\n    \\\"maxExpansions\\\" : 100,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"Name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"tieBreaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test049");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        multiMatchQueryBuilder8.maxExpansions = 0;
        java.lang.Float float11 = multiMatchQueryBuilder8.tieBreaker;
        multiMatchQueryBuilder8.setboost((java.lang.Float) 10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder8.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type16 = multiMatchQueryBuilder15.type;
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test050");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        multiMatchQueryBuilder11.queryName = "hi!";
        java.lang.Integer int14 = multiMatchQueryBuilder11.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type15 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        multiMatchQueryBuilder11.settype(type15);
        java.lang.Boolean boolean17 = multiMatchQueryBuilder11.useDisMax;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.minimumShouldMatch("");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test051");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        multiMatchQueryBuilder10.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        java.lang.Integer int16 = multiMatchQueryBuilder10.prefixLength;
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test052");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.slop((int) (short) 10);
        multiMatchQueryBuilder10.setprefixLength((java.lang.Integer) 10);
        java.lang.Boolean boolean18 = multiMatchQueryBuilder10.getlenient();
        multiMatchQueryBuilder10.setboost((java.lang.Float) (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test053");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.field("hi!");
        multiMatchQueryBuilder10.settieBreaker((java.lang.Float) 10.0f);
        multiMatchQueryBuilder10.useDisMax = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ]\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test054");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        multiMatchQueryBuilder10.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}";
        java.lang.Integer int17 = multiMatchQueryBuilder10.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.maxExpansions((int) '#');
        java.lang.Integer int22 = multiMatchQueryBuilder10.maxExpansions;
        java.lang.Float float23 = multiMatchQueryBuilder10.cutoffFrequency;
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test055");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder8.getmaxExpansions();
        multiMatchQueryBuilder8.setcutoffFrequency((java.lang.Float) 10.0f);
        multiMatchQueryBuilder8.queryName = "hi!";
        java.lang.Float float17 = multiMatchQueryBuilder8.cutoffFrequency;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder8.slop((int) '#');
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator20 = multiMatchQueryBuilder8.operator;
        java.lang.String str21 = multiMatchQueryBuilder8.getqueryName();
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test056");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder8.getmaxExpansions();
        multiMatchQueryBuilder8.setcutoffFrequency((java.lang.Float) 10.0f);
        multiMatchQueryBuilder8.queryName = "hi!";
        java.lang.Float float17 = multiMatchQueryBuilder8.cutoffFrequency;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder8.slop((int) '#');
        java.lang.String str20 = multiMatchQueryBuilder19.analyzer;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.slop((int) (short) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test057");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        multiMatchQueryBuilder10.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test058");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        java.util.List<java.lang.String> strList12 = multiMatchQueryBuilder10.getfields();
        java.lang.String str13 = multiMatchQueryBuilder10.getanalyzer();
        java.lang.Boolean boolean14 = multiMatchQueryBuilder10.lenient;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test059");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type11 = multiMatchQueryBuilder10.type;
        multiMatchQueryBuilder10.slop = 0;
        multiMatchQueryBuilder10.useDisMax = true;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test060");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("");
        java.lang.Float float13 = multiMatchQueryBuilder10.getcutoffFrequency();
        multiMatchQueryBuilder10.setanalyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"useDisMax\" : true,\n    \"cutoffFrequency\" : 100.0\n  }\n}");
        java.lang.Float float16 = multiMatchQueryBuilder10.getboost();
        java.lang.String str17 = multiMatchQueryBuilder10.analyzer;
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test061");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        multiMatchQueryBuilder10.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}";
        java.lang.Integer int17 = multiMatchQueryBuilder10.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.cutoffFrequency(100.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test062");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.field("hi!");
        multiMatchQueryBuilder10.settieBreaker((java.lang.Float) 10.0f);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray23);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery25 = multiMatchQueryBuilder24.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder24.boost((float) (short) 100);
        java.lang.Integer int28 = multiMatchQueryBuilder27.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder27.boost((float) '4');
        multiMatchQueryBuilder27.setfuzzyRewrite("");
        java.lang.Integer int33 = multiMatchQueryBuilder27.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder27.maxExpansions((int) (byte) 100);
        multiMatchQueryBuilder27.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder10.fuzziness((java.lang.Object) multiMatchQueryBuilder27);
        java.lang.String str39 = multiMatchQueryBuilder38.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type40 = multiMatchQueryBuilder38.gettype();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder38.lenient(true);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray51);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray51);
        java.lang.Integer int54 = multiMatchQueryBuilder53.maxExpansions;
        multiMatchQueryBuilder53.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder53.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        org.elasticsearch.common.unit.Fuzziness fuzziness59 = multiMatchQueryBuilder58.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder58.boost((float) 10L);
        java.lang.String[] strArray66 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"useDisMax\" : true,\n    \"cutoffFrequency\" : 100.0\n  }\n}", "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 0,\n    \"use_dis_max\" : false\n  }\n}", "{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 0,\n    \"useDisMax\" : false\n  }\n}", "{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\", \"hi!\" ],\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 52.0,\\n    \\\"max_expansions\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"tie_breaker\" : 10.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder61, strArray66);
        java.lang.String str68 = multiMatchQueryBuilder67.analyzer;
        java.lang.String str69 = multiMatchQueryBuilder67.fuzzyRewrite;
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray79);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder81 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray79);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder82 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0d, strArray79);
        multiMatchQueryBuilder82.maxExpansions = (-1);
        java.lang.Float float85 = multiMatchQueryBuilder82.cutoffFrequency;
        multiMatchQueryBuilder82.analyzer = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder89 = multiMatchQueryBuilder82.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 100.0\\n  }\\n}\",\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder91 = multiMatchQueryBuilder89.analyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 0,\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder92 = multiMatchQueryBuilder67.fuzziness((java.lang.Object) multiMatchQueryBuilder89);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder93 = multiMatchQueryBuilder42.fuzziness((java.lang.Object) multiMatchQueryBuilder92);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder96 = multiMatchQueryBuilder92.field("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0,\n    \"maxExpansions\" : 0,\n    \"cutoffFrequency\" : 10.0\n  }\n}", (float) 10L);
        org.elasticsearch.common.bytes.BytesReference bytesReference97 = multiMatchQueryBuilder92.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference97.equals(null)", !bytesReference97.equals(null));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test063");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = multiMatchQueryBuilder11.zeroTermsQuery;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type14 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type15 = type14.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder11.type(type14);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test064");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        multiMatchQueryBuilder10.analyzer = "{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 100.0\\n  }\\n}\",\n    \"_name\" : \"hi!\"\n  }\n}";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.field("{\n  \"multi_match\" : {\n    \"query\" : {\n      \"multi_match\" : {\n        \"query\" : -1.0,\n        \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ]\n      }\n    },\n    \"fields\" : [ \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 0,\\n    \\\"use_dis_max\\\" : false\\n  }\\n}\" ]\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test065");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder8.lenient(false);
        java.lang.Integer int16 = multiMatchQueryBuilder8.getslop();
        java.lang.Object obj17 = multiMatchQueryBuilder8.gettext();
        multiMatchQueryBuilder8.lenient = false;
        java.lang.String str20 = multiMatchQueryBuilder8.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder8.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 32.0,\n    \"prefix_length\" : 1,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : \\\"#\\\",\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\", \\\"hi!\\\" ],\\n    \\\"fuzziness\\\" : \\\"{\\\\n  \\\\\\\"multiMatch\\\\\\\" : {\\\\n    \\\\\\\"query\\\\\\\" : -1.0,\\\\n    \\\\\\\"fields\\\\\\\" : [ \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\", \\\\\\\"hi!\\\\\\\", \\\\\\\"hi!\\\\\\\", \\\\\\\"hi!\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\n    \\\\\\\"boost\\\\\\\" : 52.0,\\\\n    \\\\\\\"maxExpansions\\\\\\\" : 100,\\\\n    \\\\\\\"fuzzyRewrite\\\\\\\" : \\\\\\\"\\\\\\\",\\\\n    \\\\\\\"Name\\\\\\\" : \\\\\\\"hi!\\\\\\\"\\\\n  }\\\\n}\\\",\\n    \\\"tieBreaker\\\" : 10.0\\n  }\\n}\",\n    \"cutoff_frequency\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.maxExpansions(35);
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test066");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.field("hi!");
        multiMatchQueryBuilder10.settieBreaker((java.lang.Float) 10.0f);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray23);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery25 = multiMatchQueryBuilder24.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder24.boost((float) (short) 100);
        java.lang.Integer int28 = multiMatchQueryBuilder27.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder27.boost((float) '4');
        multiMatchQueryBuilder27.setfuzzyRewrite("");
        java.lang.Integer int33 = multiMatchQueryBuilder27.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder27.maxExpansions((int) (byte) 100);
        multiMatchQueryBuilder27.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder10.fuzziness((java.lang.Object) multiMatchQueryBuilder27);
        java.lang.String str39 = multiMatchQueryBuilder38.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type40 = multiMatchQueryBuilder38.gettype();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder38.lenient(true);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray51);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray51);
        java.lang.Integer int54 = multiMatchQueryBuilder53.maxExpansions;
        multiMatchQueryBuilder53.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder53.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        org.elasticsearch.common.unit.Fuzziness fuzziness59 = multiMatchQueryBuilder58.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder58.boost((float) 10L);
        java.lang.String[] strArray66 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"useDisMax\" : true,\n    \"cutoffFrequency\" : 100.0\n  }\n}", "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 0,\n    \"use_dis_max\" : false\n  }\n}", "{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 0,\n    \"useDisMax\" : false\n  }\n}", "{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\", \"hi!\" ],\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 52.0,\\n    \\\"max_expansions\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"tie_breaker\" : 10.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder61, strArray66);
        java.lang.String str68 = multiMatchQueryBuilder67.analyzer;
        java.lang.String str69 = multiMatchQueryBuilder67.fuzzyRewrite;
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray79);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder81 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray79);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder82 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0d, strArray79);
        multiMatchQueryBuilder82.maxExpansions = (-1);
        java.lang.Float float85 = multiMatchQueryBuilder82.cutoffFrequency;
        multiMatchQueryBuilder82.analyzer = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder89 = multiMatchQueryBuilder82.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 100.0\\n  }\\n}\",\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder91 = multiMatchQueryBuilder89.analyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 0,\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder92 = multiMatchQueryBuilder67.fuzziness((java.lang.Object) multiMatchQueryBuilder89);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder93 = multiMatchQueryBuilder42.fuzziness((java.lang.Object) multiMatchQueryBuilder92);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder96 = multiMatchQueryBuilder92.field("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0,\n    \"maxExpansions\" : 0,\n    \"cutoffFrequency\" : 10.0\n  }\n}", (float) 10L);
        org.elasticsearch.common.bytes.BytesReference bytesReference97 = multiMatchQueryBuilder96.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference97.equals(null)", !bytesReference97.equals(null));
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test067");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        multiMatchQueryBuilder11.setfuzzyRewrite("");
        java.lang.String str17 = multiMatchQueryBuilder11.getfuzzyRewrite();
        java.lang.Boolean boolean18 = multiMatchQueryBuilder11.lenient;
        java.lang.Object obj19 = multiMatchQueryBuilder11.text;
        java.lang.Integer int20 = multiMatchQueryBuilder11.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder11.analyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 100.0\\n  }\\n}\",\n    \"boost\" : 100.0,\n    \"slop\" : 10,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test068");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        multiMatchQueryBuilder8.maxExpansions = 10;
        multiMatchQueryBuilder8.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test069");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        multiMatchQueryBuilder11.setfuzzyRewrite("");
        java.lang.String str17 = multiMatchQueryBuilder11.getfuzzyRewrite();
        java.lang.Boolean boolean18 = multiMatchQueryBuilder11.lenient;
        java.lang.Object obj19 = multiMatchQueryBuilder11.text;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float21 = type20.tieBreaker();
        float float22 = type20.tieBreaker();
        multiMatchQueryBuilder11.settype(type20);
        multiMatchQueryBuilder11.setcutoffFrequency((java.lang.Float) 100.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test070");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = multiMatchQueryBuilder11.zeroTermsQuery;
        multiMatchQueryBuilder11.maxExpansions = (-1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : false,\n    \"lenient\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.tieBreaker(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.prefixLength((int) (byte) 100);
        multiMatchQueryBuilder23.useDisMax = false;
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator26 = multiMatchQueryBuilder23.operator;
        multiMatchQueryBuilder23.prefixLength = 10;
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test071");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.slop((int) '#');
        multiMatchQueryBuilder13.setfuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.lenient(false);
        multiMatchQueryBuilder13.slop = 10;
        multiMatchQueryBuilder13.fuzzyRewrite = "{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}";
        java.lang.String str22 = multiMatchQueryBuilder13.fuzzyRewrite;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type23 = multiMatchQueryBuilder13.type;
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test072");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        multiMatchQueryBuilder8.setqueryName("hi!");
        java.lang.Integer int14 = multiMatchQueryBuilder8.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder8.analyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}\",\n    \"use_dis_max\" : false\n  }\n}");
        multiMatchQueryBuilder16.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test073");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.field("hi!");
        multiMatchQueryBuilder10.settieBreaker((java.lang.Float) 10.0f);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray23);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery25 = multiMatchQueryBuilder24.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder24.boost((float) (short) 100);
        java.lang.Integer int28 = multiMatchQueryBuilder27.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder27.boost((float) '4');
        multiMatchQueryBuilder27.setfuzzyRewrite("");
        java.lang.Integer int33 = multiMatchQueryBuilder27.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder27.maxExpansions((int) (byte) 100);
        multiMatchQueryBuilder27.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder10.fuzziness((java.lang.Object) multiMatchQueryBuilder27);
        org.elasticsearch.common.bytes.BytesReference bytesReference39 = multiMatchQueryBuilder27.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference39.equals(null)", !bytesReference39.equals(null));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test074");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator15 = multiMatchQueryBuilder14.operator;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder14.tieBreaker((float) (short) 100);
        java.lang.String str18 = multiMatchQueryBuilder17.queryName;
        multiMatchQueryBuilder17.settieBreaker((java.lang.Float) 97.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test075");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.slop((int) ' ');
        multiMatchQueryBuilder8.setslop((java.lang.Integer) (-1));
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.useDisMax(false);
        multiMatchQueryBuilder25.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        java.lang.String str28 = multiMatchQueryBuilder25.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type29 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float30 = type29.tieBreaker();
        float float31 = type29.tieBreaker();
        float float32 = type29.tieBreaker();
        multiMatchQueryBuilder25.settype(type29);
        float float34 = type29.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder8.type(type29);
        multiMatchQueryBuilder35.setuseDisMax((java.lang.Boolean) false);
        org.elasticsearch.common.bytes.BytesReference bytesReference38 = multiMatchQueryBuilder35.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference38.equals(null)", !bytesReference38.equals(null));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test076");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.prefixLength((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.useDisMax(false);
        java.lang.Boolean boolean16 = multiMatchQueryBuilder15.getuseDisMax();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder15.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}\",\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator19 = multiMatchQueryBuilder15.operator;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder15.slop(0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 100\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : true\n  }\n}");
        java.lang.Float float26 = multiMatchQueryBuilder25.getboost();
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test077");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        multiMatchQueryBuilder8.setmaxExpansions((java.lang.Integer) 100);
        multiMatchQueryBuilder8.lenient = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder8.minimumShouldMatch("");
        multiMatchQueryBuilder14.maxExpansions = 100;
        java.lang.String str17 = multiMatchQueryBuilder14.getqueryName();
        multiMatchQueryBuilder14.setslop((java.lang.Integer) 35);
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test078");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        multiMatchQueryBuilder10.cutoffFrequency = (-1.0f);
        multiMatchQueryBuilder10.setcutoffFrequency((java.lang.Float) (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.lenient(true);
        multiMatchQueryBuilder20.setcutoffFrequency((java.lang.Float) 0.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder20.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test079");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        multiMatchQueryBuilder10.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}";
        java.lang.Integer int17 = multiMatchQueryBuilder10.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.cutoffFrequency(100.0f);
        java.lang.Boolean boolean22 = multiMatchQueryBuilder19.useDisMax;
        java.lang.Integer int23 = multiMatchQueryBuilder19.getprefixLength();
        java.lang.String str24 = multiMatchQueryBuilder19.analyzer;
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test080");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.analyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder11.slop((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type17 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float18 = type17.tieBreaker();
        float float19 = type17.tieBreaker();
        org.elasticsearch.common.ParseField parseField20 = type17.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder11.type(type17);
        multiMatchQueryBuilder21.setboost((java.lang.Float) 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.boost((float) 97);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery26 = multiMatchQueryBuilder25.zeroTermsQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test081");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str14 = multiMatchQueryBuilder13.minimumShouldMatch;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder13.slop((int) (byte) -1);
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test082");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder8.getmaxExpansions();
        multiMatchQueryBuilder8.setcutoffFrequency((java.lang.Float) 10.0f);
        multiMatchQueryBuilder8.queryName = "hi!";
        java.lang.Float float17 = multiMatchQueryBuilder8.cutoffFrequency;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder8.slop((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.useDisMax(true);
        java.lang.Boolean boolean22 = multiMatchQueryBuilder21.getuseDisMax();
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator23 = multiMatchQueryBuilder21.getoperator();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.lenient(false);
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test083");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.maxExpansions((int) (byte) 0);
        multiMatchQueryBuilder8.setqueryName("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        org.elasticsearch.common.unit.Fuzziness fuzziness16 = multiMatchQueryBuilder8.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder8.lenient(true);
        multiMatchQueryBuilder8.slop = 0;
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test084");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        java.util.List<java.lang.String> strList12 = multiMatchQueryBuilder10.getfields();
        java.lang.Integer int13 = multiMatchQueryBuilder10.slop;
        java.lang.Integer int14 = multiMatchQueryBuilder10.prefixLength;
        multiMatchQueryBuilder10.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.prefixLength((-1));
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test085");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        java.util.List<java.lang.String> strList12 = multiMatchQueryBuilder10.getfields();
        java.lang.Integer int13 = multiMatchQueryBuilder10.slop;
        java.lang.Integer int14 = multiMatchQueryBuilder10.prefixLength;
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray22);
        multiMatchQueryBuilder23.maxExpansions = 0;
        java.lang.String[] strArray33 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray33);
        multiMatchQueryBuilder34.setmaxExpansions((java.lang.Integer) 100);
        multiMatchQueryBuilder34.lenient = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder34.minimumShouldMatch("");
        java.lang.String[] strArray48 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray48);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "", strArray48);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray48);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type52 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type53 = type52.matchQueryType();
        java.lang.String[] strArray61 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray61);
        multiMatchQueryBuilder62.setmaxExpansions((java.lang.Integer) 100);
        multiMatchQueryBuilder62.lenient = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder62.minimumShouldMatch("");
        java.lang.String[] strArray76 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder77 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray76);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "", strArray76);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder79 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) type53, strArray76);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray76);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder81 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder10, strArray76);
        multiMatchQueryBuilder10.settieBreaker((java.lang.Float) 1.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference84 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference84.equals(null)", !bytesReference84.equals(null));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test086");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        multiMatchQueryBuilder10.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}";
        java.lang.Integer int17 = multiMatchQueryBuilder10.getslop();
        java.lang.Float float18 = multiMatchQueryBuilder10.getcutoffFrequency();
        java.lang.Object obj19 = multiMatchQueryBuilder10.gettext();
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test087");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        multiMatchQueryBuilder10.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        java.lang.Integer int16 = multiMatchQueryBuilder10.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.useDisMax(false);
        multiMatchQueryBuilder10.setmaxExpansions((java.lang.Integer) 32);
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test088");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        java.util.List<java.lang.String> strList10 = multiMatchQueryBuilder8.fields;
        org.elasticsearch.common.bytes.BytesReference bytesReference11 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference11.equals(null)", !bytesReference11.equals(null));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test089");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("");
        java.lang.Float float13 = multiMatchQueryBuilder10.getcutoffFrequency();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 100.0\\n  }\\n}\",\n    \"_name\" : \"hi!\"\n  }\n}");
        java.lang.Integer int16 = multiMatchQueryBuilder15.maxExpansions;
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator17 = multiMatchQueryBuilder15.operator;
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test090");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        multiMatchQueryBuilder11.queryName = "hi!";
        java.lang.Integer int14 = multiMatchQueryBuilder11.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type15 = multiMatchQueryBuilder11.gettype();
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator16 = multiMatchQueryBuilder11.operator;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.boost(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ]\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.tieBreaker((float) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type23 = multiMatchQueryBuilder22.gettype();
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test091");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.elasticsearch.common.xcontent.XContentBuilder.defaultDatePrinter;
        java.lang.Class<?> wildcardClass1 = dateTimeFormatter0.getClass();
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) wildcardClass1, strArray9);
        java.lang.String str12 = multiMatchQueryBuilder11.minimumShouldMatch;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) 10);
        org.elasticsearch.common.unit.Fuzziness fuzziness15 = multiMatchQueryBuilder11.fuzziness;
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test092");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        multiMatchQueryBuilder10.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        java.lang.Float float16 = multiMatchQueryBuilder15.tieBreaker;
        java.lang.String str17 = multiMatchQueryBuilder15.analyzer;
        java.lang.String str18 = multiMatchQueryBuilder15.getanalyzer();
        multiMatchQueryBuilder15.useDisMax = true;
        java.lang.String str21 = multiMatchQueryBuilder15.analyzer;
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test093");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type11 = multiMatchQueryBuilder10.type;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.tieBreaker((float) (short) 100);
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.useDisMax(false);
        java.lang.String str25 = multiMatchQueryBuilder24.getminimumShouldMatch();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder24.slop((int) '#');
        java.lang.Object obj28 = multiMatchQueryBuilder27.gettext();
        java.lang.String[] strArray36 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type40 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder37.type(type40);
        org.elasticsearch.common.ParseField parseField42 = type40.parseField();
        multiMatchQueryBuilder27.type = type40;
        multiMatchQueryBuilder13.type = type40;
        java.util.List<java.lang.String> strList45 = multiMatchQueryBuilder13.getfields();
        org.elasticsearch.common.bytes.BytesReference bytesReference46 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference46.equals(null)", !bytesReference46.equals(null));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test094");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.analyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder11.slop((int) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type17 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float18 = type17.tieBreaker();
        float float19 = type17.tieBreaker();
        org.elasticsearch.common.ParseField parseField20 = type17.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder11.type(type17);
        multiMatchQueryBuilder21.setboost((java.lang.Float) 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}\",\n    \"use_dis_max\" : false\n  }\n}", (float) (short) 1);
        java.lang.String str27 = multiMatchQueryBuilder26.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder26.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"use_dis_max\" : true,\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0\n  }\n}");
        multiMatchQueryBuilder29.setcutoffFrequency((java.lang.Float) 52.0f);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap32 = multiMatchQueryBuilder29.getfieldsBoosts();
        java.lang.Float float33 = multiMatchQueryBuilder29.getboost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder29.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder29.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test095");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.analyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.field("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 100.0\\n  }\\n}^10.0\", \"hi!\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 100.0,\\n    \\\"Name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"slop\" : 1,\n    \"useDisMax\" : false,\n    \"lenient\" : false\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test096");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.fuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.boost((float) 100L);
        multiMatchQueryBuilder14.setfuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0,\n    \"minimumShouldMatch\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ]\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test097");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.queryName("{\n  \"multiMatch\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"useDisMax\" : true,\n    \"cutoffFrequency\" : 100.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference14 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference14.equals(null)", !bytesReference14.equals(null));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test098");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.prefixLength((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.prefixLength((int) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.field("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0,\n    \"maxExpansions\" : 0,\n    \"cutoffFrequency\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = multiMatchQueryBuilder16.type;
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder16.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test099");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder8.getmaxExpansions();
        multiMatchQueryBuilder8.setcutoffFrequency((java.lang.Float) 10.0f);
        multiMatchQueryBuilder8.queryName = "hi!";
        multiMatchQueryBuilder8.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}";
        multiMatchQueryBuilder8.boost = 0.0f;
        java.lang.String str21 = multiMatchQueryBuilder8.fuzzyRewrite;
        java.lang.Object obj22 = multiMatchQueryBuilder8.text;
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test100");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type11 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.type(type11);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap13 = multiMatchQueryBuilder12.getfieldsBoosts();
        multiMatchQueryBuilder12.setcutoffFrequency((java.lang.Float) (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder12.boost((float) 100);
        java.lang.Integer int18 = multiMatchQueryBuilder17.getslop();
        java.util.List<java.lang.String> strList19 = multiMatchQueryBuilder17.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.prefixLength((int) '#');
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test101");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.slop((int) '#');
        multiMatchQueryBuilder13.setminimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 52.0,\n    \"fuzzyRewrite\" : \"\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test102");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.field("hi!");
        multiMatchQueryBuilder10.settieBreaker((java.lang.Float) 10.0f);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray23);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery25 = multiMatchQueryBuilder24.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder24.boost((float) (short) 100);
        java.lang.Integer int28 = multiMatchQueryBuilder27.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder27.boost((float) '4');
        multiMatchQueryBuilder27.setfuzzyRewrite("");
        java.lang.Integer int33 = multiMatchQueryBuilder27.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder27.maxExpansions((int) (byte) 100);
        multiMatchQueryBuilder27.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder10.fuzziness((java.lang.Object) multiMatchQueryBuilder27);
        java.lang.String str39 = multiMatchQueryBuilder38.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type40 = multiMatchQueryBuilder38.gettype();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder38.lenient(true);
        java.lang.String[] strArray51 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray51);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray51);
        java.lang.Integer int54 = multiMatchQueryBuilder53.maxExpansions;
        multiMatchQueryBuilder53.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder53.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        org.elasticsearch.common.unit.Fuzziness fuzziness59 = multiMatchQueryBuilder58.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder58.boost((float) 10L);
        java.lang.String[] strArray66 = new java.lang.String[] { "{\n  \"multiMatch\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"useDisMax\" : true,\n    \"cutoffFrequency\" : 100.0\n  }\n}", "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 0,\n    \"use_dis_max\" : false\n  }\n}", "{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 0,\n    \"useDisMax\" : false\n  }\n}", "{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\", \"hi!\" ],\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 52.0,\\n    \\\"max_expansions\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"tie_breaker\" : 10.0\n  }\n}" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder61, strArray66);
        java.lang.String str68 = multiMatchQueryBuilder67.analyzer;
        java.lang.String str69 = multiMatchQueryBuilder67.fuzzyRewrite;
        java.lang.String[] strArray79 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray79);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder81 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray79);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder82 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0d, strArray79);
        multiMatchQueryBuilder82.maxExpansions = (-1);
        java.lang.Float float85 = multiMatchQueryBuilder82.cutoffFrequency;
        multiMatchQueryBuilder82.analyzer = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder89 = multiMatchQueryBuilder82.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 100.0\\n  }\\n}\",\n    \"_name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder91 = multiMatchQueryBuilder89.analyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 0,\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder92 = multiMatchQueryBuilder67.fuzziness((java.lang.Object) multiMatchQueryBuilder89);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder93 = multiMatchQueryBuilder42.fuzziness((java.lang.Object) multiMatchQueryBuilder92);
        org.elasticsearch.common.bytes.BytesReference bytesReference94 = multiMatchQueryBuilder92.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference94.equals(null)", !bytesReference94.equals(null));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test103");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.field("hi!");
        multiMatchQueryBuilder10.settieBreaker((java.lang.Float) 10.0f);
        java.lang.String[] strArray23 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray23);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery25 = multiMatchQueryBuilder24.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder24.boost((float) (short) 100);
        java.lang.Integer int28 = multiMatchQueryBuilder27.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder27.boost((float) '4');
        multiMatchQueryBuilder27.setfuzzyRewrite("");
        java.lang.Integer int33 = multiMatchQueryBuilder27.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder27.maxExpansions((int) (byte) 100);
        multiMatchQueryBuilder27.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder10.fuzziness((java.lang.Object) multiMatchQueryBuilder27);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.boost((float) 1L);
        org.elasticsearch.common.bytes.BytesReference bytesReference41 = multiMatchQueryBuilder38.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference41.equals(null)", !bytesReference41.equals(null));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test104");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.prefixLength((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.prefixLength((int) ' ');
        java.lang.String str16 = multiMatchQueryBuilder15.getminimumShouldMatch();
        multiMatchQueryBuilder15.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}\",\n    \"use_dis_max\" : false\n  }\n}";
        java.lang.String str19 = multiMatchQueryBuilder15.getminimumShouldMatch();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap20 = multiMatchQueryBuilder15.fieldsBoosts;
        java.util.List<java.lang.String> strList21 = multiMatchQueryBuilder15.getfields();
        java.lang.String str22 = multiMatchQueryBuilder15.getanalyzer();
        java.lang.Boolean boolean23 = multiMatchQueryBuilder15.getuseDisMax();
        org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference24.equals(null)", !bytesReference24.equals(null));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test105");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.prefixLength((int) (short) 1);
        java.lang.Boolean boolean14 = multiMatchQueryBuilder8.useDisMax;
        org.elasticsearch.common.bytes.BytesReference bytesReference15 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference15.equals(null)", !bytesReference15.equals(null));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test106");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap12 = multiMatchQueryBuilder10.fieldsBoosts;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.analyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ]\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator15 = multiMatchQueryBuilder10.getoperator();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.tieBreaker((float) (byte) -1);
        java.lang.Boolean boolean18 = multiMatchQueryBuilder10.getlenient();
        java.lang.Float float19 = multiMatchQueryBuilder10.cutoffFrequency;
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test107");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        multiMatchQueryBuilder11.queryName = "hi!";
        java.lang.Integer int14 = multiMatchQueryBuilder11.maxExpansions;
        java.lang.Float float15 = multiMatchQueryBuilder11.tieBreaker;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 100.0\\n  }\\n}\",\n    \"_name\" : \"hi!\"\n  }\n}");
        multiMatchQueryBuilder11.minimumShouldMatch = "{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0,\n    \"minimumShouldMatch\" : \"hi!\",\n    \"lenient\" : true,\n    \"Name\" : \"hi!\"\n  }\n}";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder11.cutoffFrequency((float) (byte) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test108");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type11 = multiMatchQueryBuilder10.type;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.prefixLength(0);
        org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference16.equals(null)", !bytesReference16.equals(null));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test109");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        multiMatchQueryBuilder8.maxExpansions = 0;
        java.lang.Float float11 = multiMatchQueryBuilder8.tieBreaker;
        multiMatchQueryBuilder8.setboost((java.lang.Float) 10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder8.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type16 = multiMatchQueryBuilder15.type;
        java.lang.Boolean boolean17 = multiMatchQueryBuilder15.getlenient();
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test110");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        multiMatchQueryBuilder11.setfuzzyRewrite("");
        java.lang.String str17 = multiMatchQueryBuilder11.getfuzzyRewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.tieBreaker(0.0f);
        multiMatchQueryBuilder19.setuseDisMax((java.lang.Boolean) true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\", \"hi!\" ],\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 52.0,\\n    \\\"max_expansions\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        java.lang.Integer int24 = multiMatchQueryBuilder23.prefixLength;
        multiMatchQueryBuilder23.setuseDisMax((java.lang.Boolean) true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder23.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\", \"hi!\" ],\n    \"tie_breaker\" : 10.0\n  }\n}");
        java.lang.String str29 = multiMatchQueryBuilder23.queryName;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder23.boost(52.0f);
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder31.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test111");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        multiMatchQueryBuilder10.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.common.unit.Fuzziness fuzziness14 = multiMatchQueryBuilder10.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 100.0\\n  }\\n}\",\n    \"_name\" : \"hi!\"\n  }\n}");
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray24);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery26 = multiMatchQueryBuilder25.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder25.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type29 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        multiMatchQueryBuilder28.settype(type29);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery31 = multiMatchQueryBuilder28.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type32 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float33 = type32.tieBreaker();
        float float34 = type32.tieBreaker();
        org.elasticsearch.index.search.MatchQuery.Type type35 = type32.matchQueryType();
        org.elasticsearch.common.ParseField parseField36 = type32.parseField();
        multiMatchQueryBuilder28.type = type32;
        multiMatchQueryBuilder16.type = type32;
        java.lang.Boolean boolean39 = multiMatchQueryBuilder16.useDisMax;
        multiMatchQueryBuilder16.maxExpansions = 10;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder16.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\", \"hi!\" ],\n    \"fuzziness\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 52.0,\\n    \\\"max_expansions\\\" : 100,\\n    \\\"fuzzy_rewrite\\\" : \\\"\\\",\\n    \\\"_name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"tie_breaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference44 = multiMatchQueryBuilder43.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference44.equals(null)", !bytesReference44.equals(null));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test112");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type11 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.type(type11);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap13 = multiMatchQueryBuilder12.getfieldsBoosts();
        java.lang.Float float14 = multiMatchQueryBuilder12.getboost();
        multiMatchQueryBuilder12.setqueryName("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ]\\n  }\\n}\",\n    \"max_expansions\" : 100,\n    \"lenient\" : true\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder12.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test113");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        multiMatchQueryBuilder11.queryName = "hi!";
        java.lang.Integer int14 = multiMatchQueryBuilder11.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("hi!", (float) (-1L));
        multiMatchQueryBuilder17.slop = 0;
        java.lang.Object obj20 = multiMatchQueryBuilder17.text;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.field("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.cutoffFrequency((float) (short) 100);
        java.lang.Integer int25 = multiMatchQueryBuilder24.prefixLength;
        java.lang.Boolean boolean26 = multiMatchQueryBuilder24.lenient;
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test114");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        multiMatchQueryBuilder10.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}";
        java.lang.Integer int17 = multiMatchQueryBuilder10.getslop();
        java.lang.Float float18 = multiMatchQueryBuilder10.getcutoffFrequency();
        java.lang.String str19 = multiMatchQueryBuilder10.getanalyzer();
        java.util.List<java.lang.String> strList20 = multiMatchQueryBuilder10.getfields();
        multiMatchQueryBuilder10.setqueryName("{\n  \"multiMatch\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\", \"hi!\" ],\n    \"tieBreaker\" : 10.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test115");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.prefixLength((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder8.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\", \"hi!\" ],\n    \"fuzziness\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 52.0,\\n    \\\"maxExpansions\\\" : 100,\\n    \\\"fuzzyRewrite\\\" : \\\"\\\",\\n    \\\"Name\\\" : \\\"hi!\\\"\\n  }\\n}\",\n    \"tieBreaker\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.useDisMax(true);
        java.lang.Float float18 = multiMatchQueryBuilder17.tieBreaker;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = multiMatchQueryBuilder17.type;
        multiMatchQueryBuilder17.useDisMax = true;
        java.lang.Boolean boolean22 = multiMatchQueryBuilder17.getuseDisMax();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder17.cutoffFrequency((float) 35);
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test116");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        multiMatchQueryBuilder10.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}";
        java.lang.String str17 = multiMatchQueryBuilder10.queryName;
        java.lang.Float float18 = multiMatchQueryBuilder10.getcutoffFrequency();
        java.lang.Boolean boolean19 = multiMatchQueryBuilder10.useDisMax;
        org.elasticsearch.common.bytes.BytesReference bytesReference20 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference20.equals(null)", !bytesReference20.equals(null));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test117");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery12 = multiMatchQueryBuilder11.getzeroTermsQuery();
        org.elasticsearch.common.unit.Fuzziness fuzziness13 = multiMatchQueryBuilder11.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.field("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : true,\n    \"cutoff_frequency\" : 100.0\n  }\n}");
        java.lang.String str16 = multiMatchQueryBuilder15.minimumShouldMatch;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder15.useDisMax(true);
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test118");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        multiMatchQueryBuilder10.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}";
        java.lang.Integer int17 = multiMatchQueryBuilder10.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.cutoffFrequency(100.0f);
        java.lang.Boolean boolean22 = multiMatchQueryBuilder19.useDisMax;
        java.lang.Integer int23 = multiMatchQueryBuilder19.getprefixLength();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"use_dis_max\" : true,\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference26 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference26.equals(null)", !bytesReference26.equals(null));
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test119");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type12 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        multiMatchQueryBuilder11.settype(type12);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery14 = multiMatchQueryBuilder11.getzeroTermsQuery();
        multiMatchQueryBuilder11.setqueryName("");
        java.lang.Integer int17 = multiMatchQueryBuilder11.getprefixLength();
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test120");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder8.getmaxExpansions();
        multiMatchQueryBuilder8.setcutoffFrequency((java.lang.Float) 10.0f);
        multiMatchQueryBuilder8.queryName = "hi!";
        java.lang.Float float17 = multiMatchQueryBuilder8.cutoffFrequency;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder8.tieBreaker(10.0f);
        java.lang.Object obj20 = multiMatchQueryBuilder19.gettext();
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test121");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        java.lang.String str13 = multiMatchQueryBuilder10.getqueryName();
        multiMatchQueryBuilder10.setcutoffFrequency((java.lang.Float) (-1.0f));
        java.lang.Integer int16 = multiMatchQueryBuilder10.getmaxExpansions();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test122");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.field("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.tieBreaker((float) (short) 1);
        java.util.List<java.lang.String> strList16 = multiMatchQueryBuilder13.getfields();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test123");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        multiMatchQueryBuilder8.maxExpansions = 0;
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator11 = multiMatchQueryBuilder8.getoperator();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.field("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 0,\n    \"useDisMax\" : false\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator14 = multiMatchQueryBuilder8.getoperator();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        org.elasticsearch.common.unit.Fuzziness fuzziness17 = multiMatchQueryBuilder8.getfuzziness();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery18 = multiMatchQueryBuilder8.zeroTermsQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test124");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        multiMatchQueryBuilder11.setfuzzyRewrite("");
        java.lang.String str17 = multiMatchQueryBuilder11.getfuzzyRewrite();
        java.lang.Boolean boolean18 = multiMatchQueryBuilder11.lenient;
        java.lang.Object obj19 = multiMatchQueryBuilder11.text;
        java.lang.Integer int20 = multiMatchQueryBuilder11.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder11.analyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 100.0\\n  }\\n}\",\n    \"boost\" : 100.0,\n    \"slop\" : 10,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}\"\n  }\n}");
        multiMatchQueryBuilder11.setprefixLength((java.lang.Integer) 100);
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test125");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        multiMatchQueryBuilder11.setfuzzyRewrite("");
        java.lang.String str17 = multiMatchQueryBuilder11.getfuzzyRewrite();
        java.lang.Boolean boolean18 = multiMatchQueryBuilder11.lenient;
        java.lang.Object obj19 = multiMatchQueryBuilder11.text;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder11.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : false,\n    \"lenient\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.lenient(false);
        java.lang.String str24 = multiMatchQueryBuilder23.fuzzyRewrite;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery25 = multiMatchQueryBuilder23.zeroTermsQuery;
        java.lang.Float float26 = multiMatchQueryBuilder23.boost;
        java.lang.Float float27 = multiMatchQueryBuilder23.gettieBreaker();
        multiMatchQueryBuilder23.setslop((java.lang.Integer) 52);
        multiMatchQueryBuilder23.minimumShouldMatch = "{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0,\n    \"slop\" : 10,\n    \"Name\" : \"hi!\"\n  }\n}";
        org.elasticsearch.common.bytes.BytesReference bytesReference32 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference32.equals(null)", !bytesReference32.equals(null));
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test126");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        multiMatchQueryBuilder11.queryName = "hi!";
        java.lang.Integer int14 = multiMatchQueryBuilder11.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("hi!", (float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.maxExpansions((int) (short) 0);
        multiMatchQueryBuilder11.queryName = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ]\n  }\n}";
        java.util.List<java.lang.String> strList22 = multiMatchQueryBuilder11.getfields();
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray31);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) strList22, strArray31);
        org.elasticsearch.common.bytes.BytesReference bytesReference35 = multiMatchQueryBuilder34.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference35.equals(null)", !bytesReference35.equals(null));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test127");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.slop((int) ' ');
        multiMatchQueryBuilder8.setslop((java.lang.Integer) (-1));
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.useDisMax(false);
        multiMatchQueryBuilder25.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        java.lang.String str28 = multiMatchQueryBuilder25.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type29 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float30 = type29.tieBreaker();
        float float31 = type29.tieBreaker();
        float float32 = type29.tieBreaker();
        multiMatchQueryBuilder25.settype(type29);
        float float34 = type29.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder8.type(type29);
        org.elasticsearch.common.bytes.BytesReference bytesReference36 = multiMatchQueryBuilder35.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference36.equals(null)", !bytesReference36.equals(null));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test128");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0d, strArray9);
        multiMatchQueryBuilder12.maxExpansions = (-1);
        java.lang.Float float15 = multiMatchQueryBuilder12.cutoffFrequency;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder12.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : 100\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator18 = multiMatchQueryBuilder17.getoperator();
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test129");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type11 = multiMatchQueryBuilder10.type;
        multiMatchQueryBuilder10.slop = 0;
        multiMatchQueryBuilder10.useDisMax = true;
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator16 = multiMatchQueryBuilder10.getoperator();
        multiMatchQueryBuilder10.setqueryName("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        multiMatchQueryBuilder10.boost = 10.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder10.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 97,\n    \"useDisMax\" : false\n  }\n}");
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray30);
        java.lang.String str32 = multiMatchQueryBuilder31.analyzer;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder31.maxExpansions(10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type35 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float36 = type35.tieBreaker();
        float float37 = type35.tieBreaker();
        org.elasticsearch.common.ParseField parseField38 = type35.parseField();
        multiMatchQueryBuilder31.settype(type35);
        float float40 = type35.tieBreaker();
        multiMatchQueryBuilder10.settype(type35);
        org.elasticsearch.common.bytes.BytesReference bytesReference42 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference42.equals(null)", !bytesReference42.equals(null));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test130");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        java.lang.String str15 = multiMatchQueryBuilder14.getanalyzer();
        java.lang.String str16 = multiMatchQueryBuilder14.getqueryName();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder14.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test131");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        multiMatchQueryBuilder10.settieBreaker((java.lang.Float) 100.0f);
        multiMatchQueryBuilder10.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0,\n    \"max_expansions\" : 0,\n    \"lenient\" : false\n  }\n}");
        java.util.List<java.lang.String> strList16 = multiMatchQueryBuilder10.fields;
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test132");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        multiMatchQueryBuilder11.setfuzzyRewrite("");
        java.lang.String str17 = multiMatchQueryBuilder11.getfuzzyRewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.tieBreaker(0.0f);
        java.lang.String str20 = multiMatchQueryBuilder11.getanalyzer();
        java.lang.Float float21 = multiMatchQueryBuilder11.getboost();
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test133");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = multiMatchQueryBuilder11.zeroTermsQuery;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery14 = multiMatchQueryBuilder11.zeroTermsQuery;
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap15 = multiMatchQueryBuilder11.getfieldsBoosts();
        java.lang.Integer int16 = multiMatchQueryBuilder11.getprefixLength();
        org.elasticsearch.common.bytes.BytesReference bytesReference17 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference17.equals(null)", !bytesReference17.equals(null));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test134");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        multiMatchQueryBuilder8.maxExpansions = 0;
        java.lang.Float float11 = multiMatchQueryBuilder8.tieBreaker;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder8.field("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}", (float) (short) 100);
        java.lang.String str15 = multiMatchQueryBuilder8.queryName;
        java.lang.Integer int16 = multiMatchQueryBuilder8.getprefixLength();
        multiMatchQueryBuilder8.tieBreaker = 100.0f;
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test135");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        multiMatchQueryBuilder11.queryName = "hi!";
        java.lang.Integer int14 = multiMatchQueryBuilder11.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("hi!", (float) (-1L));
        java.lang.String str18 = multiMatchQueryBuilder11.queryName;
        java.lang.Boolean boolean19 = multiMatchQueryBuilder11.getuseDisMax();
        multiMatchQueryBuilder11.setprefixLength((java.lang.Integer) (-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder11.slop(0);
        java.lang.Boolean boolean24 = multiMatchQueryBuilder23.lenient;
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder23.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test136");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = multiMatchQueryBuilder11.zeroTermsQuery;
        multiMatchQueryBuilder11.maxExpansions = (-1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("");
        java.lang.Object obj18 = multiMatchQueryBuilder11.text;
        multiMatchQueryBuilder11.tieBreaker = 100.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder11.slop(35);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : 0.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"max_expansions\" : -1\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0,\n    \"useDisMax\" : false\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test137");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        multiMatchQueryBuilder11.queryName = "hi!";
        java.lang.Integer int14 = multiMatchQueryBuilder11.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("hi!", (float) (-1L));
        multiMatchQueryBuilder17.slop = 0;
        java.lang.String str20 = multiMatchQueryBuilder17.analyzer;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : false,\n    \"lenient\" : false\n  }\n}");
        multiMatchQueryBuilder22.maxExpansions = 97;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.cutoffFrequency((float) (byte) 10);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap27 = multiMatchQueryBuilder22.getfieldsBoosts();
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test138");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        multiMatchQueryBuilder8.setqueryName("hi!");
        java.lang.String[] strArray21 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray21);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery23 = multiMatchQueryBuilder22.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder22.boost((float) (short) 100);
        java.lang.Integer int26 = multiMatchQueryBuilder25.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder25.boost((float) '4');
        multiMatchQueryBuilder25.setfuzzyRewrite("");
        java.lang.String str31 = multiMatchQueryBuilder25.getfuzzyRewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder25.tieBreaker(0.0f);
        multiMatchQueryBuilder25.boost = 0.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type36 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        multiMatchQueryBuilder25.type = type36;
        float float38 = type36.tieBreaker();
        float float39 = type36.tieBreaker();
        multiMatchQueryBuilder8.settype(type36);
        java.util.List<java.lang.String> strList41 = multiMatchQueryBuilder8.fields;
        java.util.List<java.lang.String> strList42 = multiMatchQueryBuilder8.fields;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder8.prefixLength(1);
        org.elasticsearch.common.bytes.BytesReference bytesReference45 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference45.equals(null)", !bytesReference45.equals(null));
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test139");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        multiMatchQueryBuilder8.setmaxExpansions((java.lang.Integer) 100);
        multiMatchQueryBuilder8.lenient = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder8.minimumShouldMatch("");
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "", strArray22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.useDisMax(true);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap27 = multiMatchQueryBuilder24.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder24.queryName("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"hi!\",\n    \"useDisMax\" : false\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference30 = multiMatchQueryBuilder24.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference30.equals(null)", !bytesReference30.equals(null));
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test140");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        multiMatchQueryBuilder11.queryName = "hi!";
        java.lang.Integer int14 = multiMatchQueryBuilder11.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("hi!", (float) (-1L));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.maxExpansions((int) (short) 0);
        multiMatchQueryBuilder11.setqueryName("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0,\n    \"maxExpansions\" : 0,\n    \"lenient\" : false\n  }\n}");
        java.lang.Float float22 = multiMatchQueryBuilder11.cutoffFrequency;
        org.elasticsearch.common.bytes.BytesReference bytesReference23 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference23.equals(null)", !bytesReference23.equals(null));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test141");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.minimumShouldMatch = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : true,\n    \"cutoff_frequency\" : 100.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.boost(0.0f);
        multiMatchQueryBuilder13.useDisMax = true;
        java.lang.Float float18 = multiMatchQueryBuilder13.gettieBreaker();
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test142");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        multiMatchQueryBuilder11.queryName = "hi!";
        java.lang.Integer int14 = multiMatchQueryBuilder11.maxExpansions;
        java.lang.String str15 = multiMatchQueryBuilder11.queryName;
        java.lang.Boolean boolean16 = multiMatchQueryBuilder11.lenient;
        java.lang.String str17 = multiMatchQueryBuilder11.analyzer;
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test143");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        multiMatchQueryBuilder10.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        java.lang.Integer int16 = multiMatchQueryBuilder15.maxExpansions;
        java.lang.String str17 = multiMatchQueryBuilder15.fuzzyRewrite;
        multiMatchQueryBuilder15.tieBreaker = 10.0f;
        org.elasticsearch.common.unit.Fuzziness fuzziness20 = multiMatchQueryBuilder15.getfuzziness();
        java.lang.Float float21 = multiMatchQueryBuilder15.tieBreaker;
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder15.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test144");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder10.field("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.tieBreaker((float) (short) 1);
        java.util.List<java.lang.String> strList16 = multiMatchQueryBuilder13.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder13.cutoffFrequency((float) (byte) 1);
        org.elasticsearch.common.bytes.BytesReference bytesReference19 = multiMatchQueryBuilder13.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference19.equals(null)", !bytesReference19.equals(null));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test145");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        multiMatchQueryBuilder11.setfuzzyRewrite("");
        java.lang.Integer int17 = multiMatchQueryBuilder11.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder11.boost(10.0f);
        multiMatchQueryBuilder19.setslop((java.lang.Integer) 1);
        multiMatchQueryBuilder19.lenient = true;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.cutoffFrequency(10.0f);
        java.lang.Float float26 = multiMatchQueryBuilder25.gettieBreaker();
        java.lang.Float float27 = multiMatchQueryBuilder25.cutoffFrequency;
        org.elasticsearch.common.bytes.BytesReference bytesReference28 = multiMatchQueryBuilder25.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference28.equals(null)", !bytesReference28.equals(null));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test146");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type11 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.type(type11);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap13 = multiMatchQueryBuilder12.getfieldsBoosts();
        multiMatchQueryBuilder12.setcutoffFrequency((java.lang.Float) (-1.0f));
        multiMatchQueryBuilder12.lenient = true;
        multiMatchQueryBuilder12.settieBreaker((java.lang.Float) 10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder12.field("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"hi!\"\n  }\n}");
        multiMatchQueryBuilder21.minimumShouldMatch = "{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 0.0,\n    \"slop\" : 35,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"useDisMax\" : false,\n    \"lenient\" : false\n  }\n}";
        java.lang.Integer int24 = multiMatchQueryBuilder21.maxExpansions;
        java.lang.String[] strArray32 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray32);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery34 = multiMatchQueryBuilder33.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder33.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder33.maxExpansions((int) (byte) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder33.lenient(false);
        org.elasticsearch.common.unit.Fuzziness fuzziness41 = multiMatchQueryBuilder40.getfuzziness();
        java.lang.String str42 = multiMatchQueryBuilder40.fuzzyRewrite;
        java.lang.String str43 = multiMatchQueryBuilder40.getanalyzer();
        java.lang.Float float44 = multiMatchQueryBuilder40.boost;
        java.lang.String[] strArray52 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray52);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.useDisMax(false);
        multiMatchQueryBuilder55.setboost((java.lang.Float) 10.0f);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray65);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder66.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type69 = multiMatchQueryBuilder68.type;
        java.lang.Boolean boolean70 = multiMatchQueryBuilder68.getuseDisMax();
        java.lang.Integer int71 = multiMatchQueryBuilder68.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type72 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder68.type = type72;
        float float74 = type72.tieBreaker();
        org.elasticsearch.common.ParseField parseField75 = type72.parseField();
        multiMatchQueryBuilder55.type = type72;
        multiMatchQueryBuilder40.settype(type72);
        multiMatchQueryBuilder21.settype(type72);
        multiMatchQueryBuilder21.analyzer = "{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 0,\\n    \\\"use_dis_max\\\" : false,\\n    \\\"cutoff_frequency\\\" : -1.0\\n  }\\n}\" ],\n    \"prefix_length\" : 10,\n    \"use_dis_max\" : false,\n    \"cutoff_frequency\" : 100.0\n  }\n}";
        org.elasticsearch.common.bytes.BytesReference bytesReference81 = multiMatchQueryBuilder21.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference81.equals(null)", !bytesReference81.equals(null));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test147");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        multiMatchQueryBuilder10.minimumShouldMatch = "hi!";
        multiMatchQueryBuilder10.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}";
        java.lang.Integer int17 = multiMatchQueryBuilder10.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder10.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.cutoffFrequency(100.0f);
        java.lang.Boolean boolean22 = multiMatchQueryBuilder19.useDisMax;
        java.lang.Integer int23 = multiMatchQueryBuilder19.getprefixLength();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"use_dis_max\" : true,\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery26 = multiMatchQueryBuilder19.zeroTermsQuery;
        org.elasticsearch.common.bytes.BytesReference bytesReference27 = multiMatchQueryBuilder19.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference27.equals(null)", !bytesReference27.equals(null));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test148");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type11 = multiMatchQueryBuilder10.type;
        multiMatchQueryBuilder10.slop = 0;
        multiMatchQueryBuilder10.useDisMax = true;
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator16 = multiMatchQueryBuilder10.getoperator();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder10.boost(1.0f);
        java.lang.Boolean boolean19 = multiMatchQueryBuilder18.lenient;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder18.cutoffFrequency((float) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder18.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test149");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.prefixLength((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder8.prefixLength((int) (short) 0);
        multiMatchQueryBuilder8.maxExpansions = 1;
        java.lang.String[] strArray25 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.useDisMax(false);
        java.lang.String str29 = multiMatchQueryBuilder28.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness30 = multiMatchQueryBuilder28.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.prefixLength((int) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type33 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        org.elasticsearch.index.search.MatchQuery.Type type34 = type33.matchQueryType();
        java.lang.String[] strArray42 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray42);
        multiMatchQueryBuilder43.setmaxExpansions((java.lang.Integer) 100);
        multiMatchQueryBuilder43.lenient = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder43.minimumShouldMatch("");
        java.lang.String[] strArray57 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "", strArray57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) type34, strArray57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder28, strArray57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder8, strArray57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str65 = multiMatchQueryBuilder8.toString();
        multiMatchQueryBuilder8.setslop((java.lang.Integer) 100);
        multiMatchQueryBuilder8.boost = 0.0f;
        multiMatchQueryBuilder8.setuseDisMax((java.lang.Boolean) false);
        multiMatchQueryBuilder8.setanalyzer("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"slop\" : 10,\n    \"fuzzyRewrite\" : \"\",\n    \"useDisMax\" : false,\n    \"Name\" : \"hi!\"\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference74 = multiMatchQueryBuilder8.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference74.equals(null)", !bytesReference74.equals(null));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test150");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0d, strArray9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type13 = multiMatchQueryBuilder12.type;
        multiMatchQueryBuilder12.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}\",\n    \"use_dis_max\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder12.boost((float) (short) 10);
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test151");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.boost((float) '4');
        multiMatchQueryBuilder11.setfuzzyRewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.boost((float) ' ');
        java.lang.Integer int19 = multiMatchQueryBuilder18.slop;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder18.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0,\n    \"maxExpansions\" : 0,\n    \"lenient\" : false\n  }\n}", (float) 100L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.maxExpansions(52);
        multiMatchQueryBuilder26.setboost((java.lang.Float) (-1.0f));
        org.elasticsearch.common.bytes.BytesReference bytesReference29 = multiMatchQueryBuilder26.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference29.equals(null)", !bytesReference29.equals(null));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test152");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator13 = multiMatchQueryBuilder11.operator;
        java.lang.Boolean boolean14 = multiMatchQueryBuilder11.getuseDisMax();
        multiMatchQueryBuilder11.setqueryName("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 97,\n    \"useDisMax\" : false\n  }\n}");
        java.lang.String str17 = multiMatchQueryBuilder11.getminimumShouldMatch();
        org.elasticsearch.common.bytes.BytesReference bytesReference18 = multiMatchQueryBuilder11.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference18.equals(null)", !bytesReference18.equals(null));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test153");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.maxExpansions((int) (byte) 0);
        multiMatchQueryBuilder8.setqueryName("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        org.elasticsearch.common.unit.Fuzziness fuzziness16 = multiMatchQueryBuilder8.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder8.useDisMax(false);
        multiMatchQueryBuilder8.cutoffFrequency = 1.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder8.useDisMax(false);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap23 = multiMatchQueryBuilder22.fieldsBoosts;
        java.lang.String str24 = multiMatchQueryBuilder22.getqueryName();
        org.elasticsearch.common.bytes.BytesReference bytesReference25 = multiMatchQueryBuilder22.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference25.equals(null)", !bytesReference25.equals(null));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test154");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        multiMatchQueryBuilder10.queryName = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder10.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}");
        multiMatchQueryBuilder10.queryName = "hi!";
        multiMatchQueryBuilder10.setqueryName("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 52.0,\n    \"fuzzy_rewrite\" : \"\"\n  }\n}");
        java.lang.Boolean boolean20 = multiMatchQueryBuilder10.useDisMax;
        org.elasticsearch.common.bytes.BytesReference bytesReference21 = multiMatchQueryBuilder10.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference21.equals(null)", !bytesReference21.equals(null));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test155");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder11.prefixLength;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = multiMatchQueryBuilder11.zeroTermsQuery;
        multiMatchQueryBuilder11.maxExpansions = (-1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : false,\n    \"lenient\" : false\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 100,\n    \"lenient\" : true\n  }\n}");
        org.elasticsearch.common.bytes.BytesReference bytesReference22 = multiMatchQueryBuilder17.buildAsBytes();
        org.junit.Assert.assertTrue("Contract failed: !bytesReference22.equals(null)", !bytesReference22.equals(null));
    }
}

