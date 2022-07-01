import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest27 {

    public static boolean debug = false;

    @Test
    public void test13501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13501");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setfuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type10 = multiMatchQueryBuilder4.gettype();
        multiMatchQueryBuilder4.setslop((java.lang.Integer) (-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder4.getPROTOTYPE();
        org.elasticsearch.index.query.Operator operator20 = multiMatchQueryBuilder19.getoperator();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.getPROTOTYPE();
        multiMatchQueryBuilder19.prefixLength = (-1);
        multiMatchQueryBuilder19.analyzer = "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 1.0,\n    \"boost\" : 1.0\n  }\n}";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNull(operator20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
    }

    @Test
    public void test13502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13502");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.String str7 = multiMatchQueryBuilder4.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness8 = multiMatchQueryBuilder4.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.tieBreaker((float) (short) 0);
        multiMatchQueryBuilder10.setlenient((java.lang.Boolean) true);
        java.lang.Integer int13 = multiMatchQueryBuilder10.slop;
        multiMatchQueryBuilder10.slop = 10;
        multiMatchQueryBuilder10.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}";
        multiMatchQueryBuilder10.tieBreaker = 52.0f;
        java.lang.Float float20 = multiMatchQueryBuilder10.cutoffFrequency;
        java.lang.Object obj21 = multiMatchQueryBuilder10.gettext();
        java.lang.String str22 = multiMatchQueryBuilder10.fuzzyRewrite;
        java.lang.Integer int23 = multiMatchQueryBuilder10.getmaxExpansions();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multi_match" + "'", str7, "multi_match");
        org.junit.Assert.assertNull(fuzziness8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNull(float20);
        org.junit.Assert.assertEquals("'" + obj21 + "' != '" + "multi_match" + "'", obj21, "multi_match");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(int23);
    }

    @Test
    public void test13503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13503");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery12 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.zeroTermsQuery(zeroTermsQuery12);
        multiMatchQueryBuilder13.prefixLength = 10;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap20 = multiMatchQueryBuilder13.fieldsBoosts;
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap21 = multiMatchQueryBuilder13.fieldsBoosts;
        java.lang.String str22 = multiMatchQueryBuilder13.getName();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNull(strObjectFloatHashMap20);
        org.junit.Assert.assertNull(strObjectFloatHashMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "multi_match" + "'", str22, "multi_match");
    }

    @Test
    public void test13504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13504");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        multiMatchQueryBuilder4.setuseDisMax((java.lang.Boolean) false);
        java.lang.String str15 = multiMatchQueryBuilder4.fuzzyRewrite;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder4.setuseDisMax((java.lang.Boolean) true);
        org.elasticsearch.index.query.Operator operator20 = null;
        multiMatchQueryBuilder4.operator = operator20;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
    }

    @Test
    public void test13505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13505");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery10 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.lenient(false);
        multiMatchQueryBuilder8.setmaxExpansions((java.lang.Integer) 1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery16 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery16);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder8.boost((float) 10L);
        java.lang.Integer int20 = multiMatchQueryBuilder19.getprefixLength();
        org.elasticsearch.index.query.Operator operator21 = multiMatchQueryBuilder19.operator;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(operator21);
    }

    @Test
    public void test13506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13506");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.Operator operator7 = null;
        multiMatchQueryBuilder4.operator = operator7;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.fuzzyRewrite("multi_match");
        java.lang.Object obj11 = multiMatchQueryBuilder10.gettext();
        multiMatchQueryBuilder10.analyzer = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}";
        org.elasticsearch.common.unit.Fuzziness fuzziness14 = multiMatchQueryBuilder10.fuzziness;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertEquals("'" + obj11 + "' != '" + "multi_match" + "'", obj11, "multi_match");
        org.junit.Assert.assertNull(fuzziness14);
    }

    @Test
    public void test13507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13507");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery10 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.lenient(false);
        multiMatchQueryBuilder8.setmaxExpansions((java.lang.Integer) 1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery16 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery16);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.cutoffFrequency((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.boost((float) (short) 0);
        java.lang.Object obj22 = multiMatchQueryBuilder21.text;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.field("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) 10);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery26 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.zeroTermsQuery(zeroTermsQuery26);
        multiMatchQueryBuilder27.analyzer = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimumShouldMatch\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"slop\" : 0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}";
        org.elasticsearch.index.query.Operator operator30 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.operator(operator30);
        multiMatchQueryBuilder31.setcutoffFrequency((java.lang.Float) 100.0f);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertEquals("'" + obj22 + "' != '" + "multi_match" + "'", obj22, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
    }

    @Test
    public void test13508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13508");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzziness((java.lang.Object) 10);
        java.lang.Boolean boolean11 = multiMatchQueryBuilder8.useDisMax;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.boost((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator16 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.operator(operator16);
        java.lang.String[] strArray21 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray21);
        org.elasticsearch.index.query.Operator operator23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.operator(operator23);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException27 = multiMatchQueryBuilder22.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder22.cutoffFrequency((float) (byte) 100);
        java.lang.Object obj30 = multiMatchQueryBuilder22.text;
        multiMatchQueryBuilder22.setrewrite("");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery33 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder22.zeroTermsQuery(zeroTermsQuery33);
        boolean boolean35 = multiMatchQueryBuilder17.equals((java.lang.Object) multiMatchQueryBuilder22);
        multiMatchQueryBuilder22.lenient = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type38 = multiMatchQueryBuilder22.type;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery39 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder22.zeroTermsQuery(zeroTermsQuery39);
        multiMatchQueryBuilder40.setmaxExpansions((java.lang.Integer) 10);
        java.lang.String[] strArray46 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray46);
        org.elasticsearch.index.query.Operator operator48 = null;
        multiMatchQueryBuilder47.operator = operator48;
        org.elasticsearch.common.unit.Fuzziness fuzziness50 = multiMatchQueryBuilder47.getfuzziness();
        multiMatchQueryBuilder47.setuseDisMax((java.lang.Boolean) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder47.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) (byte) 10);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap56 = null;
        multiMatchQueryBuilder47.fieldsBoosts = strObjectFloatHashMap56;
        multiMatchQueryBuilder47.cutoffFrequency = (-1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery60 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder47.zeroTermsQuery(zeroTermsQuery60);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder47.rewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap64 = multiMatchQueryBuilder63.fieldsBoosts;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder63.maxExpansions((int) (short) 0);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery67 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder66.zeroTermsQuery(zeroTermsQuery67);
        boolean boolean69 = multiMatchQueryBuilder40.equals((java.lang.Object) multiMatchQueryBuilder68);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNull(queryValidationException27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertEquals("'" + obj30 + "' != '" + "multi_match" + "'", obj30, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(type38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertNull(fuzziness50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
        org.junit.Assert.assertNull(strObjectFloatHashMap64);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder66);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test13509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13509");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        java.lang.Integer int10 = multiMatchQueryBuilder4.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery11 = multiMatchQueryBuilder4.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.boost((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder4.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str21 = multiMatchQueryBuilder4.minimumShouldMatch;
        java.lang.String str22 = multiMatchQueryBuilder4.getminimumShouldMatch();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder4.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"useDisMax\" : true,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder24.setuseDisMax((java.lang.Boolean) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder24.getPROTOTYPE();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery28 = multiMatchQueryBuilder24.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.tieBreaker((float) 97);
        java.lang.String str31 = multiMatchQueryBuilder24.getNAME();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(zeroTermsQuery11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(zeroTermsQuery28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "multi_match" + "'", str31, "multi_match");
    }

    @Test
    public void test13510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13510");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setfuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type10 = multiMatchQueryBuilder4.gettype();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder4.cutoffFrequency = 100.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"{\\n  \\\"MULTI_MATCH\\\" : {\\n    \\\"QUERY\\\" : \\\"MULTI_MATCH\\\",\\n    \\\"FIELDS\\\" : [ \\\"MULTI_MATCH\\\", \\\"HI!\\\" ],\\n    \\\"ANALYZER\\\" : \\\"{\\\\N  \\\\\\\"MULTI_MATCH\\\\\\\" : {\\\\N    \\\\\\\"QUERY\\\\\\\" : \\\\\\\"MULTI_MATCH\\\\\\\",\\\\N    \\\\\\\"FIELDS\\\\\\\" : [ \\\\\\\"MULTI_MATCH\\\\\\\", \\\\\\\"HI!\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\N    \\\\\\\"SLOP\\\\\\\" : 0,\\\\N    \\\\\\\"FUZZY_REWRITE\\\\\\\" : \\\\\\\"HI!\\\\\\\",\\\\N    \\\\\\\"TIE_BREAKER\\\\\\\" : 100.0,\\\\N    \\\\\\\"CUTOFF_FREQUENCY\\\\\\\" : 100.0,\\\\N    \\\\\\\"BOOST\\\\\\\" : 1.0\\\\N  }\\\\N}\\\",\\n    \\\"MAX_EXPANSIONS\\\" : 100,\\n    \\\"USE_DIS_MAX\\\" : TRUE,\\n    \\\"TIE_BREAKER\\\" : -1.0,\\n    \\\"CUTOFF_FREQUENCY\\\" : 0.0,\\n    \\\"BOOST\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"minimumShouldMatch\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"useDisMax\" : false,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery19 = multiMatchQueryBuilder4.zeroTermsQuery;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder4.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        float float22 = multiMatchQueryBuilder4.boost();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNull(zeroTermsQuery19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
    }

    @Test
    public void test13511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13511");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.Operator operator7 = null;
        multiMatchQueryBuilder4.operator = operator7;
        java.util.List<java.lang.String> strList9 = multiMatchQueryBuilder4.fields;
        multiMatchQueryBuilder4.cutoffFrequency = 0.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder4.useDisMax(true);
        java.lang.Boolean boolean14 = multiMatchQueryBuilder13.getuseDisMax();
        java.lang.String[] strArray18 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray18);
        org.elasticsearch.index.query.Operator operator20 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.operator(operator20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException24 = multiMatchQueryBuilder19.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder19.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery27 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.zeroTermsQuery(zeroTermsQuery27);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.maxExpansions((-1));
        java.lang.String str31 = multiMatchQueryBuilder30.getNAME();
        java.lang.String[] strArray35 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray35);
        org.elasticsearch.index.query.Operator operator37 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.operator(operator37);
        java.lang.Boolean boolean39 = multiMatchQueryBuilder36.getlenient();
        multiMatchQueryBuilder36.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder36.cutoffFrequency(0.0f);
        java.lang.String str44 = multiMatchQueryBuilder43.minimumShouldMatch;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder43.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder43.maxExpansions = 100;
        java.lang.String[] strArray52 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray52);
        org.elasticsearch.index.query.Operator operator54 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.operator(operator54);
        multiMatchQueryBuilder53.setrewrite("");
        java.util.List<java.lang.String> strList58 = multiMatchQueryBuilder53.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type59 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.common.ParseField parseField60 = type59.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type61 = type59.matchQueryType();
        multiMatchQueryBuilder53.type = type59;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder43.type(type59);
        multiMatchQueryBuilder30.type = type59;
        float float65 = type59.tieBreaker();
        org.elasticsearch.index.search.MatchQuery.Type type66 = type59.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type67 = type59.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder13.type(type59);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = multiMatchQueryBuilder13.tieBreaker((float) 1L);
        multiMatchQueryBuilder13.setprefixLength((java.lang.Integer) 35);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNull(queryValidationException24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "multi_match" + "'", str31, "multi_match");
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNull(boolean39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertTrue("'" + type59 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type59.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(parseField60);
        org.junit.Assert.assertTrue("'" + type61 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type61.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
        org.junit.Assert.assertTrue("'" + float65 + "' != '" + 1.0f + "'", float65 == 1.0f);
        org.junit.Assert.assertTrue("'" + type66 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type66.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + type67 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type67.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder68);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder70);
    }

    @Test
    public void test13512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13512");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setfuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type10 = multiMatchQueryBuilder4.gettype();
        multiMatchQueryBuilder4.setslop((java.lang.Integer) (-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.minimumShouldMatch("");
        multiMatchQueryBuilder16.setmaxExpansions((java.lang.Integer) (-1));
        multiMatchQueryBuilder16.setfuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : false,\n    \"cutoffFrequency\" : 1.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder16.tieBreaker((float) 0L);
        java.lang.String str23 = multiMatchQueryBuilder16.getWriteableName();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "multi_match" + "'", str23, "multi_match");
    }

    @Test
    public void test13513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13513");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.common.unit.Fuzziness fuzziness9 = multiMatchQueryBuilder8.fuzziness;
        java.util.List<java.lang.String> strList10 = multiMatchQueryBuilder8.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type11 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.fuzziness((java.lang.Object) type11);
        org.elasticsearch.index.query.Operator operator13 = null;
        multiMatchQueryBuilder12.operator = operator13;
        java.lang.String str15 = multiMatchQueryBuilder12.rewrite;
        org.elasticsearch.index.query.QueryShardContext queryShardContext16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.lucene.search.Query query17 = multiMatchQueryBuilder12.toFilter(queryShardContext16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(fuzziness9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type11.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13514");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery10 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery10);
        multiMatchQueryBuilder8.prefixLength = 1;
        java.lang.Integer int14 = multiMatchQueryBuilder8.getslop();
        java.lang.Boolean boolean15 = multiMatchQueryBuilder8.useDisMax;
        java.lang.String str16 = multiMatchQueryBuilder8.getName();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "multi_match" + "'", str16, "multi_match");
    }

    @Test
    public void test13515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13515");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        multiMatchQueryBuilder4.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder4.setminimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder4.useDisMax = false;
        multiMatchQueryBuilder4.analyzer = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}";
        java.lang.Integer int22 = multiMatchQueryBuilder4.slop;
        float float23 = multiMatchQueryBuilder4.boost();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(int22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test13516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13516");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery10 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.lenient(false);
        multiMatchQueryBuilder8.setmaxExpansions((java.lang.Integer) 1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery16 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery16);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder8.boost((float) 10L);
        java.lang.Integer int20 = multiMatchQueryBuilder19.getslop();
        java.lang.String str21 = multiMatchQueryBuilder19.queryName();
        java.lang.String str22 = multiMatchQueryBuilder19.getrewrite();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test13517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13517");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        java.lang.Integer int10 = multiMatchQueryBuilder4.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery11 = multiMatchQueryBuilder4.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        float float15 = multiMatchQueryBuilder14.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder14.slop((int) (short) 10);
        java.lang.String[] strArray21 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray21);
        org.elasticsearch.index.query.Operator operator23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.operator(operator23);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException27 = multiMatchQueryBuilder22.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder22.cutoffFrequency((float) (byte) 100);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap30 = multiMatchQueryBuilder29.getfieldsBoosts();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap31 = null;
        multiMatchQueryBuilder29.fieldsBoosts = strObjectFloatHashMap31;
        java.lang.Boolean boolean33 = multiMatchQueryBuilder29.getuseDisMax();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type34 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder29.settype(type34);
        multiMatchQueryBuilder17.type = type34;
        java.lang.String str37 = multiMatchQueryBuilder17.getfuzzyRewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder17.useDisMax(true);
        org.elasticsearch.common.unit.Fuzziness fuzziness40 = multiMatchQueryBuilder17.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type41 = multiMatchQueryBuilder17.gettype();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(zeroTermsQuery11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNull(queryValidationException27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNull(strObjectFloatHashMap30);
        org.junit.Assert.assertNull(boolean33);
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type34.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNull(fuzziness40);
        org.junit.Assert.assertTrue("'" + type41 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type41.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
    }

    @Test
    public void test13518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13518");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder4.tieBreaker((float) (-1));
        multiMatchQueryBuilder4.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.useDisMax(true);
        multiMatchQueryBuilder17.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray23 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray23);
        org.elasticsearch.index.query.Operator operator25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.operator(operator25);
        java.lang.String str27 = multiMatchQueryBuilder24.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness28 = multiMatchQueryBuilder24.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.tieBreaker((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type31 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder24.settype(type31);
        multiMatchQueryBuilder17.settype(type31);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery34 = multiMatchQueryBuilder17.zeroTermsQuery;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder17.slop((int) (byte) 0);
        multiMatchQueryBuilder17.setmaxExpansions((java.lang.Integer) (-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"cutoff_frequency\" : -1.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray44 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray44);
        org.elasticsearch.index.query.Operator operator46 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.operator(operator46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder45.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException50 = multiMatchQueryBuilder45.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder45.cutoffFrequency((float) (byte) 100);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap53 = multiMatchQueryBuilder52.getfieldsBoosts();
        java.lang.String[] strArray57 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray57);
        org.elasticsearch.index.query.Operator operator59 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.operator(operator59);
        java.lang.String str61 = multiMatchQueryBuilder58.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness62 = multiMatchQueryBuilder58.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder58.tieBreaker((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type65 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder58.settype(type65);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder52.type(type65);
        org.elasticsearch.index.search.MatchQuery.Type type68 = type65.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type69 = type65.matchQueryType();
        float float70 = type65.tieBreaker();
        org.elasticsearch.index.search.MatchQuery.Type type71 = type65.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = multiMatchQueryBuilder40.type(type65);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery73 = multiMatchQueryBuilder40.zeroTermsQuery;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "multi_match" + "'", str27, "multi_match");
        org.junit.Assert.assertNull(fuzziness28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type31.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNull(zeroTermsQuery34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNull(queryValidationException50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
        org.junit.Assert.assertNull(strObjectFloatHashMap53);
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "multi_match" + "'", str61, "multi_match");
        org.junit.Assert.assertNull(fuzziness62);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder64);
        org.junit.Assert.assertTrue("'" + type65 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type65.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
        org.junit.Assert.assertTrue("'" + type68 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type68.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + type69 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type69.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float70 + "' != '" + 1.0f + "'", float70 == 1.0f);
        org.junit.Assert.assertTrue("'" + type71 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type71.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder72);
        org.junit.Assert.assertNull(zeroTermsQuery73);
    }

    @Test
    public void test13519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13519");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap12 = multiMatchQueryBuilder11.getfieldsBoosts();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap13 = null;
        multiMatchQueryBuilder11.fieldsBoosts = strObjectFloatHashMap13;
        java.lang.Boolean boolean15 = multiMatchQueryBuilder11.getuseDisMax();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type16 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder11.settype(type16);
        multiMatchQueryBuilder11.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder11.setslop((java.lang.Integer) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder11.getPROTOTYPE();
        java.util.List<java.lang.String> strList23 = multiMatchQueryBuilder22.fields;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(strObjectFloatHashMap12);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type16.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test13520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13520");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        float float12 = multiMatchQueryBuilder4.boost();
        multiMatchQueryBuilder4.setanalyzer("");
        java.lang.Boolean boolean15 = multiMatchQueryBuilder4.getuseDisMax();
        java.lang.String str16 = multiMatchQueryBuilder4.getrewrite();
        java.lang.Boolean boolean17 = multiMatchQueryBuilder4.getlenient();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type18 = multiMatchQueryBuilder4.type;
        java.lang.String str19 = multiMatchQueryBuilder4.minimumShouldMatch;
        java.util.List<java.lang.String> strList20 = multiMatchQueryBuilder4.fields;
        org.elasticsearch.index.query.Operator operator21 = multiMatchQueryBuilder4.operator;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder4.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder4.field("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"useDisMax\" : false,\n    \"cutoffFrequency\" : -1.0,\n    \"boost\" : 1.0\n  }\n}", 32.0f);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(boolean17);
        org.junit.Assert.assertNull(type18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNull(operator21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
    }

    @Test
    public void test13521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13521");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery12 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.zeroTermsQuery(zeroTermsQuery12);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.getPROTOTYPE();
        multiMatchQueryBuilder11.cutoffFrequency = 0.0f;
        java.lang.String str17 = multiMatchQueryBuilder11.fuzzyRewrite;
        java.lang.String[] strArray21 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray21);
        org.elasticsearch.index.query.Operator operator23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.operator(operator23);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.lenient(false);
        java.lang.Integer int27 = multiMatchQueryBuilder26.slop;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder26.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str30 = multiMatchQueryBuilder26.minimumShouldMatch;
        java.lang.String[] strArray34 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray34);
        org.elasticsearch.index.query.Operator operator36 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.operator(operator36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException40 = multiMatchQueryBuilder35.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder35.cutoffFrequency((float) (byte) 100);
        java.lang.String str43 = multiMatchQueryBuilder35.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder35.queryName("");
        org.elasticsearch.common.unit.Fuzziness fuzziness46 = multiMatchQueryBuilder35.getfuzziness();
        org.elasticsearch.common.unit.Fuzziness fuzziness47 = null;
        multiMatchQueryBuilder35.fuzziness = fuzziness47;
        java.lang.Integer int49 = multiMatchQueryBuilder35.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery50 = multiMatchQueryBuilder35.zeroTermsQuery;
        boolean boolean51 = multiMatchQueryBuilder26.equals((java.lang.Object) zeroTermsQuery50);
        java.lang.String[] strArray56 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray56);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (byte) 0, strArray56);
        java.lang.String[] strArray62 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray62);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) strArray56, strArray62);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) boolean51, strArray56);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) str17, strArray56);
        org.elasticsearch.index.query.Operator operator67 = multiMatchQueryBuilder66.operator;
        java.lang.String str68 = multiMatchQueryBuilder66.toString();
        java.lang.Integer int69 = multiMatchQueryBuilder66.maxExpansions;
        java.lang.Object obj70 = multiMatchQueryBuilder66.gettext();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = multiMatchQueryBuilder66.queryName("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0,\\n    \\\"_name\\\" : \\\"\\\"\\n  }\\n}\" ],\n    \"fuzziness\" : \"1\",\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNull(queryValidationException40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNull(fuzziness46);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(zeroTermsQuery50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(strArray56);
        org.junit.Assert.assertNotNull(strArray62);
        org.junit.Assert.assertNull(operator67);
// flaky:         org.junit.Assert.assertEquals("'" + str68 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : null,\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 1.0\n  }\n}" + "'", str68, "{\n  \"multiMatch\" : {\n    \"query\" : null,\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNull(int69);
        org.junit.Assert.assertNull(obj70);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder72);
    }

    @Test
    public void test13522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13522");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery12 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.zeroTermsQuery(zeroTermsQuery12);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.maxExpansions((-1));
        java.util.List<java.lang.String> strList16 = multiMatchQueryBuilder11.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = org.elasticsearch.index.query.MultiMatchQueryBuilder.PROTOTYPE;
        java.lang.Object obj18 = multiMatchQueryBuilder17.text;
        java.lang.String[] strArray22 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray22);
        org.elasticsearch.index.query.Operator operator24 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.operator(operator24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException28 = multiMatchQueryBuilder23.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder23.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder23.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder23.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type35 = multiMatchQueryBuilder23.type;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type36 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.common.ParseField parseField37 = type36.parseField();
        multiMatchQueryBuilder23.type = type36;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder17.type(type36);
        org.elasticsearch.index.search.MatchQuery.Type type40 = type36.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder11.type(type36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.Operator operator44 = multiMatchQueryBuilder11.operator;
        java.lang.String str45 = multiMatchQueryBuilder11.getanalyzer();
        java.lang.String str46 = multiMatchQueryBuilder11.rewrite;
        java.lang.String[] strArray50 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray50);
        org.elasticsearch.index.query.Operator operator52 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.operator(operator52);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder51.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException56 = multiMatchQueryBuilder51.validate();
        java.lang.Integer int57 = multiMatchQueryBuilder51.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery58 = multiMatchQueryBuilder51.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder51.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        float float62 = multiMatchQueryBuilder61.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder61.slop((int) (short) 10);
        java.lang.String[] strArray68 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray68);
        org.elasticsearch.index.query.Operator operator70 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.operator(operator70);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder69.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException74 = multiMatchQueryBuilder69.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder69.cutoffFrequency((float) (byte) 100);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap77 = multiMatchQueryBuilder76.getfieldsBoosts();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap78 = null;
        multiMatchQueryBuilder76.fieldsBoosts = strObjectFloatHashMap78;
        java.lang.Boolean boolean80 = multiMatchQueryBuilder76.getuseDisMax();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type81 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder76.settype(type81);
        multiMatchQueryBuilder64.type = type81;
        multiMatchQueryBuilder64.setmaxExpansions((java.lang.Integer) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder86 = multiMatchQueryBuilder11.fuzziness((java.lang.Object) multiMatchQueryBuilder64);
        multiMatchQueryBuilder64.useDisMax = false;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(queryValidationException28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNull(type35);
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type36.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(parseField37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertTrue("'" + type40 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type40.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNull(operator44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNull(queryValidationException56);
        org.junit.Assert.assertNull(int57);
        org.junit.Assert.assertNull(zeroTermsQuery58);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 1.0f + "'", float62 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder64);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertNull(queryValidationException74);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder76);
        org.junit.Assert.assertNull(strObjectFloatHashMap77);
        org.junit.Assert.assertNull(boolean80);
        org.junit.Assert.assertTrue("'" + type81 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type81.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder86);
    }

    @Test
    public void test13523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13523");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.Operator operator7 = null;
        multiMatchQueryBuilder4.operator = operator7;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.fuzzyRewrite("multi_match");
        java.lang.String[] strArray14 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray14);
        org.elasticsearch.index.query.Operator operator16 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.operator(operator16);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException20 = multiMatchQueryBuilder15.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder15.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.zeroTermsQuery(zeroTermsQuery23);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.maxExpansions((-1));
        multiMatchQueryBuilder22.maxExpansions = 100;
        multiMatchQueryBuilder22.setslop((java.lang.Integer) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.fuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"analyzer\" : \"\",\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery34 = multiMatchQueryBuilder33.zeroTermsQuery;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNull(queryValidationException20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNull(zeroTermsQuery34);
    }

    @Test
    public void test13524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13524");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.String str7 = multiMatchQueryBuilder4.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness8 = multiMatchQueryBuilder4.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.tieBreaker((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type11 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder4.settype(type11);
        multiMatchQueryBuilder4.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray18 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray18);
        org.elasticsearch.index.query.Operator operator20 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.operator(operator20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException24 = multiMatchQueryBuilder19.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder19.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder19.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder19.fuzzyRewrite("hi!");
        org.elasticsearch.common.unit.Fuzziness fuzziness31 = multiMatchQueryBuilder19.getfuzziness();
        java.lang.Object obj32 = multiMatchQueryBuilder19.text;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery33 = multiMatchQueryBuilder19.zeroTermsQuery;
        java.lang.String[] strArray37 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray37);
        org.elasticsearch.index.query.Operator operator39 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.operator(operator39);
        java.lang.Boolean boolean41 = multiMatchQueryBuilder38.getlenient();
        multiMatchQueryBuilder38.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder38.cutoffFrequency(0.0f);
        org.elasticsearch.common.unit.Fuzziness fuzziness46 = multiMatchQueryBuilder45.fuzziness;
        multiMatchQueryBuilder45.setcutoffFrequency((java.lang.Float) 10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder45.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery51 = multiMatchQueryBuilder50.zeroTermsQuery;
        java.lang.String[] strArray55 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray55);
        org.elasticsearch.index.query.Operator operator57 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.operator(operator57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder56.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException61 = multiMatchQueryBuilder56.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder56.cutoffFrequency((float) (byte) 100);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap64 = multiMatchQueryBuilder63.getfieldsBoosts();
        java.lang.String[] strArray68 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray68);
        org.elasticsearch.index.query.Operator operator70 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.operator(operator70);
        java.lang.String str72 = multiMatchQueryBuilder69.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness73 = multiMatchQueryBuilder69.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder75 = multiMatchQueryBuilder69.tieBreaker((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type76 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder69.settype(type76);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder63.type(type76);
        org.elasticsearch.index.search.MatchQuery.Type type79 = type76.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type80 = type76.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder81 = multiMatchQueryBuilder50.type(type76);
        multiMatchQueryBuilder19.settype(type76);
        multiMatchQueryBuilder4.settype(type76);
        multiMatchQueryBuilder4.prefixLength = 0;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multi_match" + "'", str7, "multi_match");
        org.junit.Assert.assertNull(fuzziness8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type11.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNull(queryValidationException24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNull(fuzziness31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + "multi_match" + "'", obj32, "multi_match");
        org.junit.Assert.assertNull(zeroTermsQuery33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNull(boolean41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNull(fuzziness46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNull(zeroTermsQuery51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder58);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder60);
        org.junit.Assert.assertNull(queryValidationException61);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
        org.junit.Assert.assertNull(strObjectFloatHashMap64);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "multi_match" + "'", str72, "multi_match");
        org.junit.Assert.assertNull(fuzziness73);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder75);
        org.junit.Assert.assertTrue("'" + type76 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type76.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder78);
        org.junit.Assert.assertTrue("'" + type79 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type79.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + type80 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type80.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder81);
    }

    @Test
    public void test13525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13525");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery12 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.zeroTermsQuery(zeroTermsQuery12);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.Operator operator18 = null;
        multiMatchQueryBuilder15.operator = operator18;
        java.lang.String str20 = multiMatchQueryBuilder15.rewrite;
        java.lang.String str21 = multiMatchQueryBuilder15.fuzzyRewrite;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = multiMatchQueryBuilder15.gettype();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder15.boost((float) 1L);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertNull(type22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
    }

    @Test
    public void test13526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13526");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder4.setminimumShouldMatch("multi_match");
        multiMatchQueryBuilder4.setprefixLength((java.lang.Integer) 0);
        multiMatchQueryBuilder4.lenient = false;
        multiMatchQueryBuilder4.prefixLength = 1;
        java.lang.String[] strArray28 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray28);
        org.elasticsearch.index.query.Operator operator30 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.operator(operator30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException34 = multiMatchQueryBuilder29.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder29.cutoffFrequency((float) (byte) 100);
        java.lang.String str37 = multiMatchQueryBuilder29.getanalyzer();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery38 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder29.zeroTermsQuery(zeroTermsQuery38);
        multiMatchQueryBuilder29.cutoffFrequency = 100.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder29.rewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder29.tieBreaker((float) 100);
        multiMatchQueryBuilder29.fuzzyRewrite = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}";
        java.lang.String str48 = multiMatchQueryBuilder29.getfuzzyRewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) str48);
        multiMatchQueryBuilder4.setanalyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder4.useDisMax = false;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNull(queryValidationException34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}" + "'", str48, "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
    }

    @Test
    public void test13527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13527");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.tieBreaker((-1.0f));
        multiMatchQueryBuilder16.setlenient((java.lang.Boolean) false);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery19 = null;
        multiMatchQueryBuilder16.zeroTermsQuery = zeroTermsQuery19;
        multiMatchQueryBuilder16.prefixLength = 0;
        java.lang.Boolean boolean23 = multiMatchQueryBuilder16.lenient;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder16.field("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 0.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        java.lang.String str26 = multiMatchQueryBuilder16.rewrite;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertEquals("'" + boolean23 + "' != '" + false + "'", boolean23, false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test13528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13528");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        multiMatchQueryBuilder4.minimumShouldMatch = "hi!";
        java.lang.Float float11 = multiMatchQueryBuilder4.tieBreaker;
        java.lang.Float float12 = multiMatchQueryBuilder4.tieBreaker;
        java.lang.Boolean boolean13 = multiMatchQueryBuilder4.getuseDisMax();
        java.lang.Float float14 = multiMatchQueryBuilder4.getcutoffFrequency();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap15 = multiMatchQueryBuilder4.fieldsBoosts;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(float11);
        org.junit.Assert.assertNull(float12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(float14);
        org.junit.Assert.assertNull(strObjectFloatHashMap15);
    }

    @Test
    public void test13529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13529");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        java.lang.Integer int8 = multiMatchQueryBuilder4.getmaxExpansions();
        multiMatchQueryBuilder4.useDisMax = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.queryName("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str13 = multiMatchQueryBuilder4.getName();
        java.lang.Boolean boolean14 = multiMatchQueryBuilder4.getlenient();
        java.lang.Object obj15 = multiMatchQueryBuilder4.gettext();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.queryName("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str18 = multiMatchQueryBuilder4.queryName();
        java.lang.String[] strArray22 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray22);
        org.elasticsearch.index.query.Operator operator24 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.operator(operator24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException28 = multiMatchQueryBuilder23.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder23.cutoffFrequency((float) (byte) 100);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap31 = multiMatchQueryBuilder30.getfieldsBoosts();
        java.lang.String[] strArray35 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray35);
        org.elasticsearch.index.query.Operator operator37 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.operator(operator37);
        java.lang.String str39 = multiMatchQueryBuilder36.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness40 = multiMatchQueryBuilder36.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder36.tieBreaker((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type43 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder36.settype(type43);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder30.type(type43);
        multiMatchQueryBuilder4.type = type43;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertNull(boolean14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "multi_match" + "'", obj15, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}" + "'", str18, "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(queryValidationException28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNull(strObjectFloatHashMap31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "multi_match" + "'", str39, "multi_match");
        org.junit.Assert.assertNull(fuzziness40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertTrue("'" + type43 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type43.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
    }

    @Test
    public void test13530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13530");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        multiMatchQueryBuilder4.setrewrite("");
        java.lang.Integer int9 = multiMatchQueryBuilder4.getmaxExpansions();
        java.lang.Integer int10 = multiMatchQueryBuilder4.getslop();
        org.elasticsearch.common.io.stream.StreamInput streamInput11 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.readFrom(streamInput11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNull(int10);
    }

    @Test
    public void test13531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13531");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        org.elasticsearch.common.unit.Fuzziness fuzziness8 = multiMatchQueryBuilder4.getfuzziness();
        java.lang.String str9 = multiMatchQueryBuilder4.getWriteableName();
        multiMatchQueryBuilder4.maxExpansions = 100;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery12 = null;
        multiMatchQueryBuilder4.zeroTermsQuery = zeroTermsQuery12;
        multiMatchQueryBuilder4.setcutoffFrequency((java.lang.Float) 1.0f);
        java.lang.String str16 = multiMatchQueryBuilder4.getrewrite();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(fuzziness8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "multi_match" + "'", str9, "multi_match");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13532");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        float float12 = multiMatchQueryBuilder4.boost();
        multiMatchQueryBuilder4.setanalyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getfuzzyRewrite();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap18 = null;
        multiMatchQueryBuilder16.fieldsBoosts = strObjectFloatHashMap18;
        java.util.List<java.lang.String> strList20 = multiMatchQueryBuilder16.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type21 = multiMatchQueryBuilder16.type;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder16.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"cutoff_frequency\" : -1.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder16.tieBreaker((float) (byte) -1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder16.tieBreaker((float) (short) 1);
        java.lang.Boolean boolean28 = multiMatchQueryBuilder27.getuseDisMax();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder27.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.Integer int31 = multiMatchQueryBuilder30.prefixLength;
        multiMatchQueryBuilder30.setfuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}^35.0\" ],\n    \"fuzziness\" : \"BEST_FIELDS\",\n    \"tieBreaker\" : 0.0,\n    \"boost\" : 0.0\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery34 = null;
        multiMatchQueryBuilder30.zeroTermsQuery = zeroTermsQuery34;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNull(type21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNull(int31);
    }

    @Test
    public void test13533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13533");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency(0.0f);
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder11.fuzziness;
        multiMatchQueryBuilder11.setcutoffFrequency((java.lang.Float) 10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder11.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str17 = multiMatchQueryBuilder11.getminimumShouldMatch();
        multiMatchQueryBuilder11.setuseDisMax((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(fuzziness12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}" + "'", str17, "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
    }

    @Test
    public void test13534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13534");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.zeroTermsQuery(zeroTermsQuery13);
        java.lang.Object obj15 = multiMatchQueryBuilder4.gettext();
        java.lang.Object obj16 = multiMatchQueryBuilder4.text;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.boost((float) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type19 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.common.ParseField parseField20 = type19.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type21 = type19.matchQueryType();
        org.elasticsearch.common.ParseField parseField22 = type19.parseField();
        float float23 = type19.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder4.type((java.lang.Object) type19);
        java.lang.Integer int25 = multiMatchQueryBuilder4.getmaxExpansions();
        multiMatchQueryBuilder4.useDisMax = false;
        java.lang.Integer int28 = multiMatchQueryBuilder4.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder4.field("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}^35.0\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzziness\" : \"FALSE\",\n    \"useDisMax\" : true,\n    \"boost\" : 0.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + "multi_match" + "'", obj15, "multi_match");
        org.junit.Assert.assertEquals("'" + obj16 + "' != '" + "multi_match" + "'", obj16, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertTrue("'" + type19 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type19.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(parseField20);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type21.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(parseField22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNull(int25);
        org.junit.Assert.assertNull(int28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
    }

    @Test
    public void test13535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13535");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        float float12 = multiMatchQueryBuilder4.boost();
        multiMatchQueryBuilder4.setanalyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.rewrite("multi_match");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap17 = null;
        multiMatchQueryBuilder16.fieldsBoosts = strObjectFloatHashMap17;
        org.elasticsearch.index.query.Operator operator19 = null;
        multiMatchQueryBuilder16.setoperator(operator19);
        java.lang.String[] strArray24 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray24);
        org.elasticsearch.index.query.Operator operator26 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.operator(operator26);
        java.lang.Boolean boolean28 = multiMatchQueryBuilder25.getlenient();
        java.lang.String str29 = multiMatchQueryBuilder25.getfuzzyRewrite();
        multiMatchQueryBuilder25.lenient = true;
        boolean boolean32 = multiMatchQueryBuilder16.equals((java.lang.Object) multiMatchQueryBuilder25);
        java.lang.String str33 = multiMatchQueryBuilder25.rewrite;
        multiMatchQueryBuilder25.rewrite = "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"slop\" : 1,\n    \"maxExpansions\" : 100,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}";
        multiMatchQueryBuilder25.prefixLength = 1;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test13536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13536");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.String str7 = multiMatchQueryBuilder6.getminimumShouldMatch();
        org.elasticsearch.index.query.QueryValidationException queryValidationException8 = multiMatchQueryBuilder6.validate();
        java.lang.String str9 = multiMatchQueryBuilder6.getminimumShouldMatch();
        java.lang.Boolean boolean10 = multiMatchQueryBuilder6.lenient;
        multiMatchQueryBuilder6.lenient = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder6.useDisMax(true);
        java.lang.Float float15 = multiMatchQueryBuilder14.gettieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder14.cutoffFrequency((float) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(queryValidationException8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNull(float15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
    }

    @Test
    public void test13537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13537");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        java.lang.String[] strArray12 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray12);
        org.elasticsearch.index.query.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.operator(operator14);
        java.lang.Boolean boolean16 = multiMatchQueryBuilder13.getlenient();
        multiMatchQueryBuilder13.analyzer = "multi_match";
        boolean boolean19 = multiMatchQueryBuilder8.equals((java.lang.Object) multiMatchQueryBuilder13);
        java.util.List<java.lang.String> strList20 = multiMatchQueryBuilder8.fields;
        multiMatchQueryBuilder8.setrewrite("");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery23);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNull(boolean16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
    }

    @Test
    public void test13538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13538");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setfuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type10 = multiMatchQueryBuilder4.gettype();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder4.cutoffFrequency = 100.0f;
        multiMatchQueryBuilder4.setfuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray20 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray20);
        org.elasticsearch.index.query.Operator operator22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.operator(operator22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.field("");
        multiMatchQueryBuilder21.minimumShouldMatch = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.lenient(true);
        java.lang.String[] strArray33 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray33);
        org.elasticsearch.index.query.Operator operator35 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.operator(operator35);
        java.lang.Boolean boolean37 = multiMatchQueryBuilder34.getlenient();
        org.elasticsearch.common.unit.Fuzziness fuzziness38 = multiMatchQueryBuilder34.getfuzziness();
        java.lang.String str39 = multiMatchQueryBuilder34.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder34.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray45 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray45);
        org.elasticsearch.index.query.Operator operator47 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder46.operator(operator47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder46.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.fuzziness((java.lang.Object) 10);
        multiMatchQueryBuilder50.setanalyzer("multi_match");
        org.elasticsearch.index.query.QueryValidationException queryValidationException55 = multiMatchQueryBuilder50.validate();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery56 = multiMatchQueryBuilder50.zeroTermsQuery;
        java.lang.String str57 = multiMatchQueryBuilder50.getrewrite();
        multiMatchQueryBuilder50.lenient = true;
        java.lang.String[] strArray63 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray63);
        org.elasticsearch.index.query.Operator operator65 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder64.operator(operator65);
        java.lang.String str67 = multiMatchQueryBuilder64.getWriteableName();
        java.lang.Boolean boolean68 = multiMatchQueryBuilder64.useDisMax;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder64.getPROTOTYPE();
        multiMatchQueryBuilder64.analyzer = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"{\\n  \\\"MULTI_MATCH\\\" : {\\n    \\\"QUERY\\\" : \\\"MULTI_MATCH\\\",\\n    \\\"FIELDS\\\" : [ \\\"MULTI_MATCH\\\", \\\"HI!\\\" ],\\n    \\\"ANALYZER\\\" : \\\"{\\\\N  \\\\\\\"MULTI_MATCH\\\\\\\" : {\\\\N    \\\\\\\"QUERY\\\\\\\" : \\\\\\\"MULTI_MATCH\\\\\\\",\\\\N    \\\\\\\"FIELDS\\\\\\\" : [ \\\\\\\"MULTI_MATCH\\\\\\\", \\\\\\\"HI!\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\N    \\\\\\\"SLOP\\\\\\\" : 0,\\\\N    \\\\\\\"FUZZY_REWRITE\\\\\\\" : \\\\\\\"HI!\\\\\\\",\\\\N    \\\\\\\"TIE_BREAKER\\\\\\\" : 100.0,\\\\N    \\\\\\\"CUTOFF_FREQUENCY\\\\\\\" : 100.0,\\\\N    \\\\\\\"BOOST\\\\\\\" : 1.0\\\\N  }\\\\N}\\\",\\n    \\\"MAX_EXPANSIONS\\\" : 100,\\n    \\\"USE_DIS_MAX\\\" : TRUE,\\n    \\\"TIE_BREAKER\\\" : -1.0,\\n    \\\"CUTOFF_FREQUENCY\\\" : 0.0,\\n    \\\"BOOST\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}";
        java.lang.String[] strArray75 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray75);
        org.elasticsearch.index.query.Operator operator77 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder76.operator(operator77);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = multiMatchQueryBuilder76.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException81 = multiMatchQueryBuilder76.validate();
        java.lang.Integer int82 = multiMatchQueryBuilder76.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery83 = multiMatchQueryBuilder76.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder86 = multiMatchQueryBuilder76.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder88 = multiMatchQueryBuilder76.fuzziness((java.lang.Object) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder90 = multiMatchQueryBuilder76.boost((float) 0);
        java.lang.String str91 = multiMatchQueryBuilder76.fuzzyRewrite;
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap92 = multiMatchQueryBuilder76.fieldsBoosts;
        multiMatchQueryBuilder64.fieldsBoosts = strObjectFloatHashMap92;
        multiMatchQueryBuilder50.fieldsBoosts = strObjectFloatHashMap92;
        multiMatchQueryBuilder41.fieldsBoosts = strObjectFloatHashMap92;
        multiMatchQueryBuilder21.fieldsBoosts = strObjectFloatHashMap92;
        multiMatchQueryBuilder4.setfieldsBoosts(strObjectFloatHashMap92);
        multiMatchQueryBuilder4.tieBreaker = 32.0f;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNull(boolean37);
        org.junit.Assert.assertNull(fuzziness38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "multi_match" + "'", str39, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
        org.junit.Assert.assertNull(queryValidationException55);
        org.junit.Assert.assertNull(zeroTermsQuery56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "multi_match" + "'", str67, "multi_match");
        org.junit.Assert.assertNull(boolean68);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder78);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder80);
        org.junit.Assert.assertNull(queryValidationException81);
        org.junit.Assert.assertNull(int82);
        org.junit.Assert.assertNull(zeroTermsQuery83);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder86);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder88);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder90);
        org.junit.Assert.assertNull(str91);
        org.junit.Assert.assertNotNull(strObjectFloatHashMap92);
    }

    @Test
    public void test13539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13539");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        java.lang.Integer int10 = multiMatchQueryBuilder4.slop;
        org.elasticsearch.common.unit.Fuzziness fuzziness11 = multiMatchQueryBuilder4.getfuzziness();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery12 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder4.zeroTermsQuery(zeroTermsQuery12);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.useDisMax(false);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(fuzziness11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
    }

    @Test
    public void test13540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13540");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        multiMatchQueryBuilder4.minimumShouldMatch = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.lenient(true);
        java.lang.String str13 = multiMatchQueryBuilder12.toString();
        java.lang.String str14 = multiMatchQueryBuilder12.getfuzzyRewrite();
        java.lang.String[] strArray18 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray18);
        org.elasticsearch.index.query.Operator operator20 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.operator(operator20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.field("");
        multiMatchQueryBuilder19.minimumShouldMatch = "hi!";
        java.lang.Float float26 = multiMatchQueryBuilder19.tieBreaker;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type27 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type28 = type27.matchQueryType();
        float float29 = type27.tieBreaker();
        multiMatchQueryBuilder19.type = type27;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder12.type(type27);
        multiMatchQueryBuilder12.analyzer = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}";
        java.lang.String[] strArray37 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray37);
        org.elasticsearch.index.query.Operator operator39 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.operator(operator39);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder38.field("");
        multiMatchQueryBuilder38.minimumShouldMatch = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder38.lenient(true);
        java.lang.String str47 = multiMatchQueryBuilder46.toString();
        java.lang.String str48 = multiMatchQueryBuilder46.getfuzzyRewrite();
        java.lang.String[] strArray52 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray52);
        org.elasticsearch.index.query.Operator operator54 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder53.operator(operator54);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder53.field("");
        multiMatchQueryBuilder53.minimumShouldMatch = "hi!";
        java.lang.Float float60 = multiMatchQueryBuilder53.tieBreaker;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type61 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type62 = type61.matchQueryType();
        float float63 = type61.tieBreaker();
        multiMatchQueryBuilder53.type = type61;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder46.type(type61);
        multiMatchQueryBuilder65.maxExpansions = 100;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder65.prefixLength((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type70 = multiMatchQueryBuilder69.gettype();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder12.type(type70);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery72 = null;
        multiMatchQueryBuilder71.setzeroTermsQuery(zeroTermsQuery72);
        org.elasticsearch.index.query.Operator operator74 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder75 = multiMatchQueryBuilder71.operator(operator74);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}" + "'", str13, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNull(float26);
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type27.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type28.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}" + "'", str47, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNull(float60);
        org.junit.Assert.assertTrue("'" + type61 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type61.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type62 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type62.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 0.0f + "'", float63 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder65);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertTrue("'" + type70 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type70.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder75);
    }

    @Test
    public void test13541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13541");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        multiMatchQueryBuilder4.operator = operator5;
        org.elasticsearch.common.unit.Fuzziness fuzziness7 = multiMatchQueryBuilder4.getfuzziness();
        multiMatchQueryBuilder4.setuseDisMax((java.lang.Boolean) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) (byte) 10);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap13 = null;
        multiMatchQueryBuilder4.fieldsBoosts = strObjectFloatHashMap13;
        multiMatchQueryBuilder4.cutoffFrequency = (-1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery17 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.zeroTermsQuery(zeroTermsQuery17);
        org.elasticsearch.common.unit.Fuzziness fuzziness19 = null;
        multiMatchQueryBuilder18.fuzziness = fuzziness19;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery21 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.zeroTermsQuery(zeroTermsQuery21);
        java.lang.String[] strArray26 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray26);
        org.elasticsearch.index.query.Operator operator28 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.operator(operator28);
        java.lang.Boolean boolean30 = multiMatchQueryBuilder27.getlenient();
        multiMatchQueryBuilder27.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder27.cutoffFrequency(0.0f);
        org.elasticsearch.common.unit.Fuzziness fuzziness35 = multiMatchQueryBuilder34.fuzziness;
        java.lang.Integer int36 = multiMatchQueryBuilder34.slop;
        multiMatchQueryBuilder34.setfuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder34.prefixLength((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder18.fuzziness((java.lang.Object) multiMatchQueryBuilder40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type42 = multiMatchQueryBuilder18.gettype();
        java.lang.Object obj43 = multiMatchQueryBuilder18.text;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(fuzziness7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNull(fuzziness35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNull(type42);
        org.junit.Assert.assertEquals("'" + obj43 + "' != '" + "multi_match" + "'", obj43, "multi_match");
    }

    @Test
    public void test13542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13542");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery10 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.lenient(false);
        multiMatchQueryBuilder8.setmaxExpansions((java.lang.Integer) 1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery16 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery16);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.cutoffFrequency((float) 10);
        java.lang.String str20 = multiMatchQueryBuilder17.toString();
        java.lang.String[] strArray24 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray24);
        org.elasticsearch.index.query.Operator operator26 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.operator(operator26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder25.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException30 = multiMatchQueryBuilder25.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder25.cutoffFrequency((float) (byte) 100);
        java.lang.String str33 = multiMatchQueryBuilder25.getanalyzer();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery34 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder25.zeroTermsQuery(zeroTermsQuery34);
        multiMatchQueryBuilder25.cutoffFrequency = 100.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder25.rewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder25.tieBreaker((float) 100);
        java.lang.Object obj42 = multiMatchQueryBuilder25.text;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery43 = null;
        multiMatchQueryBuilder25.setzeroTermsQuery(zeroTermsQuery43);
        org.elasticsearch.index.query.Operator operator45 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder25.operator(operator45);
        java.lang.String[] strArray50 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray50);
        org.elasticsearch.index.query.Operator operator52 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.operator(operator52);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder51.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException56 = multiMatchQueryBuilder51.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder51.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder51.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder51.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type63 = multiMatchQueryBuilder51.type;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type64 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.common.ParseField parseField65 = type64.parseField();
        multiMatchQueryBuilder51.type = type64;
        float float67 = type64.tieBreaker();
        multiMatchQueryBuilder46.settype(type64);
        org.elasticsearch.common.ParseField parseField69 = type64.parseField();
        multiMatchQueryBuilder17.type = type64;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"lenient\" : false,\n    \"cutoffFrequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}" + "'", str20, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"lenient\" : false,\n    \"cutoffFrequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNull(queryValidationException30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + "multi_match" + "'", obj42, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNull(queryValidationException56);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder58);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder62);
        org.junit.Assert.assertNull(type63);
        org.junit.Assert.assertTrue("'" + type64 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type64.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(parseField65);
        org.junit.Assert.assertTrue("'" + float67 + "' != '" + 1.0f + "'", float67 == 1.0f);
        org.junit.Assert.assertNotNull(parseField69);
    }

    @Test
    public void test13543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13543");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.Object obj12 = multiMatchQueryBuilder4.text;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.prefixLength(0);
        java.util.List<java.lang.String> strList15 = multiMatchQueryBuilder4.fields;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "multi_match" + "'", obj12, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test13544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13544");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        java.lang.Integer int8 = multiMatchQueryBuilder4.getmaxExpansions();
        multiMatchQueryBuilder4.useDisMax = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.queryName("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str13 = multiMatchQueryBuilder4.getminimumShouldMatch();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap14 = multiMatchQueryBuilder4.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.slop((-1));
        multiMatchQueryBuilder4.prefixLength = 10;
        java.lang.String str19 = multiMatchQueryBuilder4.fuzzyRewrite;
        java.lang.Boolean boolean20 = multiMatchQueryBuilder4.lenient;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(int8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(strObjectFloatHashMap14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(boolean20);
    }

    @Test
    public void test13545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13545");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        float float12 = multiMatchQueryBuilder4.boost();
        multiMatchQueryBuilder4.setanalyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type15 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type16 = type15.matchQueryType();
        float float17 = type15.tieBreaker();
        float float18 = type15.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) type15);
        float float20 = type15.tieBreaker();
        float float21 = type15.tieBreaker();
        float float22 = type15.tieBreaker();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertTrue("'" + type15 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type15.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type16.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float17 + "' != '" + 0.0f + "'", float17 == 0.0f);
        org.junit.Assert.assertTrue("'" + float18 + "' != '" + 0.0f + "'", float18 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 0.0f + "'", float20 == 0.0f);
        org.junit.Assert.assertTrue("'" + float21 + "' != '" + 0.0f + "'", float21 == 0.0f);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
    }

    @Test
    public void test13546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13546");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.common.unit.Fuzziness fuzziness9 = multiMatchQueryBuilder8.fuzziness;
        java.util.List<java.lang.String> strList10 = multiMatchQueryBuilder8.getfields();
        multiMatchQueryBuilder8.setslop((java.lang.Integer) 10);
        org.elasticsearch.index.query.Operator operator13 = null;
        multiMatchQueryBuilder8.setoperator(operator13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type15 = multiMatchQueryBuilder8.gettype();
        org.elasticsearch.index.query.Operator operator16 = null;
        multiMatchQueryBuilder8.setoperator(operator16);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(fuzziness9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(type15);
    }

    @Test
    public void test13547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13547");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.minimumShouldMatch("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("multi_match");
        java.lang.String str14 = multiMatchQueryBuilder11.toString();
        java.lang.String str15 = multiMatchQueryBuilder11.getrewrite();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery16 = multiMatchQueryBuilder11.getzeroTermsQuery();
        java.lang.String[] strArray20 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray20);
        org.elasticsearch.index.query.Operator operator22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.operator(operator22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException26 = multiMatchQueryBuilder21.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder21.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder21.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder21.fuzzyRewrite("hi!");
        org.elasticsearch.common.unit.Fuzziness fuzziness33 = multiMatchQueryBuilder21.getfuzziness();
        java.lang.Object obj34 = multiMatchQueryBuilder21.text;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder21.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery37 = multiMatchQueryBuilder36.zeroTermsQuery;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder11.fuzziness((java.lang.Object) multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0,\n    \"Name\" : \"multi_match\"\n  }\n}" + "'", str14, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0,\n    \"Name\" : \"multi_match\"\n  }\n}");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(zeroTermsQuery16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNull(queryValidationException26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNull(fuzziness33);
        org.junit.Assert.assertEquals("'" + obj34 + "' != '" + "multi_match" + "'", obj34, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNull(zeroTermsQuery37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
    }

    @Test
    public void test13548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13548");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery10 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.lenient(false);
        java.lang.Object obj14 = multiMatchQueryBuilder13.gettext();
        java.lang.Integer int15 = multiMatchQueryBuilder13.getslop();
        multiMatchQueryBuilder13.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str20 = multiMatchQueryBuilder19.fuzzyRewrite;
        java.lang.String str21 = multiMatchQueryBuilder19.fuzzyRewrite;
        multiMatchQueryBuilder19.prefixLength = 10;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.getPROTOTYPE();
        multiMatchQueryBuilder24.setuseDisMax((java.lang.Boolean) false);
        java.util.List<java.lang.String> strList27 = multiMatchQueryBuilder24.getfields();
        multiMatchQueryBuilder24.minimumShouldMatch = "{\n  \"multiMatch\" : {\n    \"query\" : {\n      \"multiMatch\" : {\n        \"query\" : \"multi_match\",\n        \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n        \"minimumShouldMatch\" : \"multi_match\",\n        \"lenient\" : true,\n        \"boost\" : 1.0,\n        \"Name\" : \"multi_match\"\n      }\n    },\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 1.0\n  }\n}";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "multi_match" + "'", obj14, "multi_match");
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test13549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13549");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        java.lang.Integer int10 = multiMatchQueryBuilder4.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery11 = multiMatchQueryBuilder4.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        float float15 = multiMatchQueryBuilder14.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder14.slop((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.lenient(true);
        java.lang.String str20 = multiMatchQueryBuilder19.getrewrite();
        multiMatchQueryBuilder19.settieBreaker((java.lang.Float) 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder19.field("", (float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery26 = null;
        multiMatchQueryBuilder19.setzeroTermsQuery(zeroTermsQuery26);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(zeroTermsQuery11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
    }

    @Test
    public void test13550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13550");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        java.lang.String str9 = multiMatchQueryBuilder4.getrewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type10 = multiMatchQueryBuilder4.type;
        org.elasticsearch.index.query.Operator operator11 = null;
        multiMatchQueryBuilder4.setoperator(operator11);
        java.lang.String str13 = multiMatchQueryBuilder4.toString();
        multiMatchQueryBuilder4.cutoffFrequency = 10.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"{\\n  \\\"MULTI_MATCH\\\" : {\\n    \\\"QUERY\\\" : \\\"MULTI_MATCH\\\",\\n    \\\"FIELDS\\\" : [ \\\"MULTI_MATCH\\\", \\\"HI!\\\" ],\\n    \\\"ANALYZER\\\" : \\\"{\\\\N  \\\\\\\"MULTI_MATCH\\\\\\\" : {\\\\N    \\\\\\\"QUERY\\\\\\\" : \\\\\\\"MULTI_MATCH\\\\\\\",\\\\N    \\\\\\\"FIELDS\\\\\\\" : [ \\\\\\\"MULTI_MATCH\\\\\\\", \\\\\\\"HI!\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\N    \\\\\\\"SLOP\\\\\\\" : 0,\\\\N    \\\\\\\"FUZZY_REWRITE\\\\\\\" : \\\\\\\"HI!\\\\\\\",\\\\N    \\\\\\\"TIE_BREAKER\\\\\\\" : 100.0,\\\\N    \\\\\\\"CUTOFF_FREQUENCY\\\\\\\" : 100.0,\\\\N    \\\\\\\"BOOST\\\\\\\" : 1.0\\\\N  }\\\\N}\\\",\\n    \\\"MAX_EXPANSIONS\\\" : 100,\\n    \\\"USE_DIS_MAX\\\" : TRUE,\\n    \\\"TIE_BREAKER\\\" : -1.0,\\n    \\\"CUTOFF_FREQUENCY\\\" : 0.0,\\n    \\\"BOOST\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.Boolean boolean18 = multiMatchQueryBuilder17.getuseDisMax();
        java.lang.String[] strArray22 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray22);
        org.elasticsearch.index.query.Operator operator24 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.operator(operator24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap28 = multiMatchQueryBuilder27.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery29 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder27.zeroTermsQuery(zeroTermsQuery29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder27.useDisMax(false);
        multiMatchQueryBuilder27.setprefixLength((java.lang.Integer) 1);
        java.lang.String str35 = multiMatchQueryBuilder27.fuzzyRewrite;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type36 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE;
        float float37 = type36.tieBreaker();
        float float38 = type36.tieBreaker();
        multiMatchQueryBuilder27.type = type36;
        multiMatchQueryBuilder17.type = type36;
        org.elasticsearch.common.ParseField parseField41 = type36.parseField();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(type10);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}" + "'", str13, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(strObjectFloatHashMap28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE + "'", type36.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE));
        org.junit.Assert.assertTrue("'" + float37 + "' != '" + 0.0f + "'", float37 == 0.0f);
        org.junit.Assert.assertTrue("'" + float38 + "' != '" + 0.0f + "'", float38 == 0.0f);
        org.junit.Assert.assertNotNull(parseField41);
    }

    @Test
    public void test13551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13551");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzziness((java.lang.Object) 10);
        java.lang.Boolean boolean11 = multiMatchQueryBuilder8.useDisMax;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.boost((float) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator16 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.operator(operator16);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.rewrite("hi!");
        java.util.List<java.lang.String> strList20 = multiMatchQueryBuilder19.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.queryName("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"cutoffFrequency\" : -1.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.Boolean boolean23 = multiMatchQueryBuilder19.useDisMax;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNull(boolean23);
    }

    @Test
    public void test13552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13552");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder0 = org.elasticsearch.index.query.MultiMatchQueryBuilder.PROTOTYPE;
        java.lang.String str1 = multiMatchQueryBuilder0.getminimumShouldMatch();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery2 = multiMatchQueryBuilder0.zeroTermsQuery;
        multiMatchQueryBuilder0.setuseDisMax((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = multiMatchQueryBuilder0.getuseDisMax();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = multiMatchQueryBuilder0.boost((float) 52);
        java.lang.Boolean boolean8 = multiMatchQueryBuilder0.lenient;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder0.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) (byte) -1);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : {\n      \"multiMatch\" : {\n        \"query\" : \"multi_match\",\n        \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n        \"minimumShouldMatch\" : \"multi_match\",\n        \"lenient\" : true,\n        \"boost\" : 1.0,\n        \"Name\" : \"multi_match\"\n      }\n    },\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 1.0\n  }\n}" + "'", str1, "{\n  \"multiMatch\" : {\n    \"query\" : {\n      \"multiMatch\" : {\n        \"query\" : \"multi_match\",\n        \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n        \"minimumShouldMatch\" : \"multi_match\",\n        \"lenient\" : true,\n        \"boost\" : 1.0,\n        \"Name\" : \"multi_match\"\n      }\n    },\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNull(zeroTermsQuery2);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder7);
// flaky:         org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
    }

    @Test
    public void test13553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13553");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.Operator operator9 = null;
        multiMatchQueryBuilder4.setoperator(operator9);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery11 = null;
        multiMatchQueryBuilder4.zeroTermsQuery = zeroTermsQuery11;
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        java.lang.String str15 = multiMatchQueryBuilder4.queryName();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery16 = null;
        multiMatchQueryBuilder4.zeroTermsQuery = zeroTermsQuery16;
        multiMatchQueryBuilder4.setuseDisMax((java.lang.Boolean) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder4.field("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"10\",\n    \"minimumShouldMatch\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"hi!\",\n    \"boost\" : 10.0\n  }\n}", (float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.prefixLength(10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
    }

    @Test
    public void test13554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13554");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzziness((java.lang.Object) 10);
        multiMatchQueryBuilder8.setanalyzer("multi_match");
        org.elasticsearch.common.unit.Fuzziness fuzziness13 = null;
        multiMatchQueryBuilder8.setfuzziness(fuzziness13);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery15 = multiMatchQueryBuilder8.zeroTermsQuery;
        multiMatchQueryBuilder8.lenient = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder8.tieBreaker((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder8.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : false,\n    \"cutoffFrequency\" : 1.0,\n    \"boost\" : 1.0\n  }\n}");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap22 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder8.boost((-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.slop((int) (short) -1);
        org.elasticsearch.index.query.Operator operator27 = null;
        multiMatchQueryBuilder24.setoperator(operator27);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(zeroTermsQuery15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNull(strObjectFloatHashMap22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
    }

    @Test
    public void test13555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13555");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        java.lang.String str9 = multiMatchQueryBuilder4.getrewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type10 = multiMatchQueryBuilder4.type;
        org.elasticsearch.index.query.Operator operator11 = null;
        multiMatchQueryBuilder4.setoperator(operator11);
        org.elasticsearch.index.query.Operator operator13 = null;
        multiMatchQueryBuilder4.operator = operator13;
        java.lang.String str15 = multiMatchQueryBuilder4.getfuzzyRewrite();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13556");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.minimumShouldMatch("multi_match");
        org.elasticsearch.index.query.Operator operator12 = null;
        multiMatchQueryBuilder11.operator = operator12;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery14 = null;
        multiMatchQueryBuilder11.zeroTermsQuery = zeroTermsQuery14;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.prefixLength((int) (short) 0);
        java.lang.String[] strArray21 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray21);
        org.elasticsearch.index.query.Operator operator23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.operator(operator23);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.field("");
        org.elasticsearch.common.unit.Fuzziness fuzziness27 = multiMatchQueryBuilder26.fuzziness;
        java.util.List<java.lang.String> strList28 = multiMatchQueryBuilder26.getfields();
        multiMatchQueryBuilder26.setslop((java.lang.Integer) 10);
        java.lang.String[] strArray34 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray34);
        org.elasticsearch.index.query.Operator operator36 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.operator(operator36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException40 = multiMatchQueryBuilder35.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder35.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder35.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder35.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type47 = multiMatchQueryBuilder35.type;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type48 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.common.ParseField parseField49 = type48.parseField();
        multiMatchQueryBuilder35.type = type48;
        float float51 = type48.tieBreaker();
        multiMatchQueryBuilder26.settype(type48);
        org.elasticsearch.common.ParseField parseField53 = type48.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder11.type(type48);
        float float55 = type48.tieBreaker();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNull(fuzziness27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNull(queryValidationException40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNull(type47);
        org.junit.Assert.assertTrue("'" + type48 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type48.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(parseField49);
        org.junit.Assert.assertTrue("'" + float51 + "' != '" + 1.0f + "'", float51 == 1.0f);
        org.junit.Assert.assertNotNull(parseField53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertTrue("'" + float55 + "' != '" + 1.0f + "'", float55 == 1.0f);
    }

    @Test
    public void test13557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13557");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.Operator operator7 = null;
        multiMatchQueryBuilder4.operator = operator7;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.fuzzyRewrite("multi_match");
        multiMatchQueryBuilder4.maxExpansions = 1;
        java.lang.String[] strArray16 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray16);
        org.elasticsearch.index.query.Operator operator18 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.operator(operator18);
        java.lang.Boolean boolean20 = multiMatchQueryBuilder17.getlenient();
        multiMatchQueryBuilder17.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) 100);
        multiMatchQueryBuilder23.setanalyzer("hi!");
        java.util.List<java.lang.String> strList26 = multiMatchQueryBuilder23.getfields();
        multiMatchQueryBuilder23.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"analyzer\" : \"\",\n    \"rewrite\" : \"multi_match\",\n    \"tie_breaker\" : -1.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(strList26);
    }

    @Test
    public void test13558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13558");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.Operator operator7 = null;
        multiMatchQueryBuilder4.operator = operator7;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.fuzzyRewrite("multi_match");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery11 = multiMatchQueryBuilder4.zeroTermsQuery;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type12 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.common.ParseField parseField13 = type12.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type14 = type12.matchQueryType();
        org.elasticsearch.common.ParseField parseField15 = type12.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.type(type12);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(zeroTermsQuery11);
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type12.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(parseField13);
        org.junit.Assert.assertTrue("'" + type14 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type14.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(parseField15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
    }

    @Test
    public void test13559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13559");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        float float12 = multiMatchQueryBuilder4.boost();
        multiMatchQueryBuilder4.setanalyzer("");
        java.lang.Boolean boolean15 = multiMatchQueryBuilder4.getuseDisMax();
        multiMatchQueryBuilder4.setminimumShouldMatch("");
        java.lang.String str18 = multiMatchQueryBuilder4.rewrite;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder4.useDisMax(true);
        org.elasticsearch.index.query.Operator operator21 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder4.operator(operator21);
        multiMatchQueryBuilder22.cutoffFrequency = 0.0f;
        java.lang.String str25 = multiMatchQueryBuilder22.minimumShouldMatch;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test13560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13560");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        multiMatchQueryBuilder4.fuzzyRewrite = "hi!";
        java.lang.String str9 = multiMatchQueryBuilder4.rewrite;
        java.lang.String str10 = multiMatchQueryBuilder4.getfuzzyRewrite();
        java.lang.Boolean boolean11 = multiMatchQueryBuilder4.getuseDisMax();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 35);
        org.elasticsearch.index.query.Operator operator14 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.operator(operator14);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
    }

    @Test
    public void test13561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13561");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.zeroTermsQuery(zeroTermsQuery13);
        multiMatchQueryBuilder4.cutoffFrequency = 100.0f;
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 10);
        java.lang.Integer int19 = multiMatchQueryBuilder4.slop;
        multiMatchQueryBuilder4.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder4.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}";
        multiMatchQueryBuilder4.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder4.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.Float float28 = multiMatchQueryBuilder4.tieBreaker;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder4.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"maxExpansions\" : 1,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNull(int19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(float28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
    }

    @Test
    public void test13562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13562");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        java.lang.String str10 = multiMatchQueryBuilder4.analyzer;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.slop((int) (short) 10);
        multiMatchQueryBuilder4.tieBreaker = 97.0f;
        org.elasticsearch.common.xcontent.XContentType xContentType15 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.bytes.BytesReference bytesReference16 = multiMatchQueryBuilder4.buildAsBytes(xContentType15);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchException; message: Failed to build ToXContent");
        } catch (org.elasticsearch.ElasticsearchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
    }

    @Test
    public void test13563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13563");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery10 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.lenient(false);
        java.lang.Object obj14 = multiMatchQueryBuilder13.gettext();
        java.lang.Integer int15 = multiMatchQueryBuilder13.getslop();
        multiMatchQueryBuilder13.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder13.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder13.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder13.rewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery24 = null;
        multiMatchQueryBuilder23.setzeroTermsQuery(zeroTermsQuery24);
        java.lang.Integer int26 = multiMatchQueryBuilder23.slop;
        multiMatchQueryBuilder23.slop = (-1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "multi_match" + "'", obj14, "multi_match");
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNull(int26);
    }

    @Test
    public void test13564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13564");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.minimumShouldMatch("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.minimumShouldMatch("multi_match");
        java.lang.String[] strArray19 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray19);
        org.elasticsearch.index.query.Operator operator21 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.operator(operator21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException25 = multiMatchQueryBuilder20.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder20.cutoffFrequency((float) (byte) 100);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap28 = multiMatchQueryBuilder27.getfieldsBoosts();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap29 = null;
        multiMatchQueryBuilder27.fieldsBoosts = strObjectFloatHashMap29;
        java.lang.Boolean boolean31 = multiMatchQueryBuilder27.getuseDisMax();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type32 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder27.settype(type32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder13.type(type32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder34.getPROTOTYPE();
        multiMatchQueryBuilder34.maxExpansions = (-1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder34.prefixLength((int) (byte) -1);
        java.lang.Float float40 = multiMatchQueryBuilder34.cutoffFrequency;
        java.lang.Integer int41 = multiMatchQueryBuilder34.getslop();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNull(queryValidationException25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(strObjectFloatHashMap28);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type32.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNull(float40);
        org.junit.Assert.assertNull(int41);
    }

    @Test
    public void test13565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13565");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray20 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray20);
        org.elasticsearch.index.query.Operator operator22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.operator(operator22);
        org.elasticsearch.index.query.Operator operator24 = null;
        multiMatchQueryBuilder21.operator = operator24;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.fuzzyRewrite("multi_match");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery28 = multiMatchQueryBuilder21.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type29 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        multiMatchQueryBuilder21.type = type29;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder16.type(type29);
        float float32 = type29.tieBreaker();
        float float33 = type29.tieBreaker();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(zeroTermsQuery28);
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS + "'", type29.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 0.0f + "'", float33 == 0.0f);
    }

    @Test
    public void test13566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13566");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzziness((java.lang.Object) 10);
        multiMatchQueryBuilder8.setanalyzer("multi_match");
        org.elasticsearch.index.query.QueryValidationException queryValidationException13 = multiMatchQueryBuilder8.validate();
        multiMatchQueryBuilder8.setslop((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder8.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"{\\n  \\\"MULTI_MATCH\\\" : {\\n    \\\"QUERY\\\" : \\\"MULTI_MATCH\\\",\\n    \\\"FIELDS\\\" : [ \\\"MULTI_MATCH\\\", \\\"HI!\\\" ],\\n    \\\"ANALYZER\\\" : \\\"{\\\\N  \\\\\\\"MULTI_MATCH\\\\\\\" : {\\\\N    \\\\\\\"QUERY\\\\\\\" : \\\\\\\"MULTI_MATCH\\\\\\\",\\\\N    \\\\\\\"FIELDS\\\\\\\" : [ \\\\\\\"MULTI_MATCH\\\\\\\", \\\\\\\"HI!\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\N    \\\\\\\"SLOP\\\\\\\" : 0,\\\\N    \\\\\\\"FUZZY_REWRITE\\\\\\\" : \\\\\\\"HI!\\\\\\\",\\\\N    \\\\\\\"TIE_BREAKER\\\\\\\" : 100.0,\\\\N    \\\\\\\"CUTOFF_FREQUENCY\\\\\\\" : 100.0,\\\\N    \\\\\\\"BOOST\\\\\\\" : 1.0\\\\N  }\\\\N}\\\",\\n    \\\"MAX_EXPANSIONS\\\" : 100,\\n    \\\"USE_DIS_MAX\\\" : TRUE,\\n    \\\"TIE_BREAKER\\\" : -1.0,\\n    \\\"CUTOFF_FREQUENCY\\\" : 0.0,\\n    \\\"BOOST\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.unit.Fuzziness fuzziness18 = multiMatchQueryBuilder8.fuzziness;
        java.lang.Boolean boolean19 = multiMatchQueryBuilder8.getuseDisMax();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput20 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiMatchQueryBuilder8.writeTo(streamOutput20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(queryValidationException13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(fuzziness18);
        org.junit.Assert.assertNull(boolean19);
    }

    @Test
    public void test13567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13567");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.fuzzyRewrite("hi!");
        multiMatchQueryBuilder4.analyzer = "hi!";
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery18 = null;
        multiMatchQueryBuilder4.zeroTermsQuery = zeroTermsQuery18;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder4.useDisMax(true);
        java.lang.Boolean boolean22 = multiMatchQueryBuilder21.getuseDisMax();
        org.elasticsearch.index.query.Operator operator23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.operator(operator23);
        multiMatchQueryBuilder24.setuseDisMax((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertEquals("'" + boolean22 + "' != '" + true + "'", boolean22, true);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
    }

    @Test
    public void test13568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13568");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.String str7 = multiMatchQueryBuilder4.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness8 = multiMatchQueryBuilder4.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.tieBreaker((float) (short) 0);
        multiMatchQueryBuilder10.setlenient((java.lang.Boolean) true);
        java.lang.Integer int13 = multiMatchQueryBuilder10.slop;
        java.lang.Boolean boolean14 = multiMatchQueryBuilder10.lenient;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.useDisMax(true);
        java.lang.Float float17 = multiMatchQueryBuilder10.getcutoffFrequency();
        java.lang.String str18 = multiMatchQueryBuilder10.rewrite;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder10.boost((float) (short) 0);
        multiMatchQueryBuilder10.slop = 52;
        java.lang.Integer int23 = multiMatchQueryBuilder10.getprefixLength();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multi_match" + "'", str7, "multi_match");
        org.junit.Assert.assertNull(fuzziness8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertEquals("'" + boolean14 + "' != '" + true + "'", boolean14, true);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNull(float17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNull(int23);
    }

    @Test
    public void test13569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13569");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder4.tieBreaker((float) (-1));
        multiMatchQueryBuilder4.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.getPROTOTYPE();
        java.lang.String[] strArray20 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray20);
        org.elasticsearch.index.query.Operator operator22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.operator(operator22);
        java.lang.String str24 = multiMatchQueryBuilder21.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness25 = multiMatchQueryBuilder21.fuzziness;
        multiMatchQueryBuilder21.setlenient((java.lang.Boolean) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.boost((float) (short) 1);
        multiMatchQueryBuilder21.fuzzyRewrite = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}";
        java.lang.String[] strArray35 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray35);
        org.elasticsearch.index.query.Operator operator37 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.operator(operator37);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder36.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.fuzziness((java.lang.Object) 10);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap43 = multiMatchQueryBuilder40.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder40.boost((float) (byte) 0);
        org.elasticsearch.common.unit.Fuzziness fuzziness46 = multiMatchQueryBuilder40.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder40.queryName("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.Float float49 = multiMatchQueryBuilder40.cutoffFrequency;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder40.lenient(false);
        org.elasticsearch.common.unit.Fuzziness fuzziness52 = multiMatchQueryBuilder40.fuzziness;
        multiMatchQueryBuilder21.fuzziness = fuzziness52;
        multiMatchQueryBuilder16.fuzziness = fuzziness52;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "multi_match" + "'", str24, "multi_match");
        org.junit.Assert.assertNull(fuzziness25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNull(strObjectFloatHashMap43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(fuzziness46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertNull(float49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(fuzziness52);
    }

    @Test
    public void test13570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13570");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.minimumShouldMatch("multi_match");
        java.lang.String str12 = multiMatchQueryBuilder11.toString();
        java.lang.String[] strArray16 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray16);
        org.elasticsearch.index.query.Operator operator18 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.operator(operator18);
        java.lang.String str20 = multiMatchQueryBuilder17.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness21 = multiMatchQueryBuilder17.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder17.tieBreaker((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.cutoffFrequency((float) '4');
        boolean boolean26 = multiMatchQueryBuilder11.equals((java.lang.Object) multiMatchQueryBuilder23);
        multiMatchQueryBuilder23.maxExpansions = (-1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery29 = null;
        multiMatchQueryBuilder23.setzeroTermsQuery(zeroTermsQuery29);
        org.elasticsearch.index.query.Operator operator31 = multiMatchQueryBuilder23.getoperator();
        java.lang.String[] strArray35 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray35);
        org.elasticsearch.index.query.Operator operator37 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.operator(operator37);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder36.field("");
        java.lang.String str41 = multiMatchQueryBuilder36.getrewrite();
        org.elasticsearch.common.unit.Fuzziness fuzziness42 = null;
        multiMatchQueryBuilder36.fuzziness = fuzziness42;
        java.lang.Object obj44 = multiMatchQueryBuilder36.gettext();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type45 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float46 = type45.tieBreaker();
        org.elasticsearch.common.ParseField parseField47 = type45.parseField();
        float float48 = type45.tieBreaker();
        multiMatchQueryBuilder36.settype(type45);
        float float50 = type45.tieBreaker();
        multiMatchQueryBuilder23.settype(type45);
        float float52 = type45.tieBreaker();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}" + "'", str12, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "multi_match" + "'", str20, "multi_match");
        org.junit.Assert.assertNull(fuzziness21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(operator31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertEquals("'" + obj44 + "' != '" + "multi_match" + "'", obj44, "multi_match");
        org.junit.Assert.assertTrue("'" + type45 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type45.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + float46 + "' != '" + 0.0f + "'", float46 == 0.0f);
        org.junit.Assert.assertNotNull(parseField47);
        org.junit.Assert.assertTrue("'" + float48 + "' != '" + 0.0f + "'", float48 == 0.0f);
        org.junit.Assert.assertTrue("'" + float50 + "' != '" + 0.0f + "'", float50 == 0.0f);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 0.0f + "'", float52 == 0.0f);
    }

    @Test
    public void test13571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13571");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery12 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.zeroTermsQuery(zeroTermsQuery12);
        multiMatchQueryBuilder13.prefixLength = 10;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder13.analyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.prefixLength((int) (short) 100);
        java.lang.Boolean boolean20 = multiMatchQueryBuilder17.useDisMax;
        java.lang.String str21 = multiMatchQueryBuilder17.getWriteableName();
        org.elasticsearch.index.query.Operator operator22 = null;
        multiMatchQueryBuilder17.operator = operator22;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "multi_match" + "'", str21, "multi_match");
    }

    @Test
    public void test13572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13572");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.String str7 = multiMatchQueryBuilder4.getWriteableName();
        java.lang.Boolean boolean8 = multiMatchQueryBuilder4.useDisMax;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.boost((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.queryName("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder12.useDisMax = false;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery15 = multiMatchQueryBuilder12.getzeroTermsQuery();
        java.lang.String str16 = multiMatchQueryBuilder12.fuzzyRewrite;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multi_match" + "'", str7, "multi_match");
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNull(zeroTermsQuery15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test13573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13573");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        java.lang.String str9 = multiMatchQueryBuilder4.getrewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.field("hi!", (float) (byte) 0);
        multiMatchQueryBuilder4.cutoffFrequency = 1.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.maxExpansions(0);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery19 = null;
        multiMatchQueryBuilder4.zeroTermsQuery = zeroTermsQuery19;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
    }

    @Test
    public void test13574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13574");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.fuzzyRewrite("hi!");
        org.elasticsearch.common.unit.Fuzziness fuzziness16 = multiMatchQueryBuilder4.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.slop((int) (short) 0);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap19 = multiMatchQueryBuilder18.fieldsBoosts;
        multiMatchQueryBuilder18.rewrite = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder18.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"useDisMax\" : false,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.util.List<java.lang.String> strList24 = multiMatchQueryBuilder23.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder23.slop((int) '4');
        java.lang.String str27 = multiMatchQueryBuilder23.getrewrite();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNull(fuzziness16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNull(strObjectFloatHashMap19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}" + "'", str27, "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}");
    }

    @Test
    public void test13575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13575");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        multiMatchQueryBuilder4.minimumShouldMatch = "hi!";
        java.lang.Float float11 = multiMatchQueryBuilder4.tieBreaker;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type12 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type13 = type12.matchQueryType();
        float float14 = type12.tieBreaker();
        multiMatchQueryBuilder4.type = type12;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.queryName("");
        java.util.List<java.lang.String> strList18 = multiMatchQueryBuilder4.fields;
        float float19 = multiMatchQueryBuilder4.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder4.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"cutoff_frequency\" : -1.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder4.useDisMax(true);
        org.elasticsearch.index.query.Operator operator24 = multiMatchQueryBuilder23.getoperator();
        multiMatchQueryBuilder23.lenient = true;
        java.lang.String[] strArray30 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray30);
        org.elasticsearch.index.query.Operator operator32 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.operator(operator32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.fuzziness((java.lang.Object) 10);
        java.lang.Boolean boolean38 = multiMatchQueryBuilder35.useDisMax;
        java.lang.String str39 = multiMatchQueryBuilder35.queryName();
        org.elasticsearch.common.unit.Fuzziness fuzziness40 = multiMatchQueryBuilder35.getfuzziness();
        multiMatchQueryBuilder23.fuzziness = fuzziness40;
        java.lang.Float float42 = multiMatchQueryBuilder23.gettieBreaker();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(float11);
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type12.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type13.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + float19 + "' != '" + 1.0f + "'", float19 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNull(operator24);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNull(boolean38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(fuzziness40);
        org.junit.Assert.assertNull(float42);
    }

    @Test
    public void test13576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13576");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery12 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.zeroTermsQuery(zeroTermsQuery12);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.maxExpansions((-1));
        java.lang.String str16 = multiMatchQueryBuilder15.getNAME();
        java.lang.String str17 = multiMatchQueryBuilder15.fuzzyRewrite;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.boost((float) 0L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder15.boost((float) 1L);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap22 = multiMatchQueryBuilder15.fieldsBoosts;
        org.elasticsearch.common.xcontent.XContentType xContentType23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.bytes.BytesReference bytesReference24 = multiMatchQueryBuilder15.buildAsBytes(xContentType23);
            org.junit.Assert.fail("Expected exception of type org.elasticsearch.ElasticsearchException; message: Failed to build ToXContent");
        } catch (org.elasticsearch.ElasticsearchException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "multi_match" + "'", str16, "multi_match");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNull(strObjectFloatHashMap22);
    }

    @Test
    public void test13577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13577");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery10 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery10);
        multiMatchQueryBuilder8.setrewrite("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder8.prefixLength(1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery16 = null;
        multiMatchQueryBuilder15.setzeroTermsQuery(zeroTermsQuery16);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
    }

    @Test
    public void test13578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13578");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency(0.0f);
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder11.getfuzziness();
        org.elasticsearch.index.query.Operator operator13 = null;
        multiMatchQueryBuilder11.setoperator(operator13);
        java.lang.String str15 = multiMatchQueryBuilder11.getfuzzyRewrite();
        multiMatchQueryBuilder11.rewrite = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}";
        java.lang.String[] strArray21 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray21);
        org.elasticsearch.index.query.Operator operator23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.operator(operator23);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException27 = multiMatchQueryBuilder22.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder22.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder22.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.Operator operator32 = null;
        multiMatchQueryBuilder22.setoperator(operator32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type34 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type35 = type34.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder22.type(type34);
        multiMatchQueryBuilder11.settype(type34);
        multiMatchQueryBuilder11.setmaxExpansions((java.lang.Integer) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder11.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"maxExpansions\" : 100,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.io.stream.StreamOutput streamOutput42 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiMatchQueryBuilder11.writeTo(streamOutput42);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(fuzziness12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNull(queryValidationException27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type34.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type35.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
    }

    @Test
    public void test13579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13579");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        java.lang.Integer int10 = multiMatchQueryBuilder4.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery11 = multiMatchQueryBuilder4.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.boost((float) 0);
        java.lang.String str19 = multiMatchQueryBuilder4.fuzzyRewrite;
        java.lang.String[] strArray23 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray23);
        org.elasticsearch.index.query.Operator operator25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.operator(operator25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap29 = multiMatchQueryBuilder28.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery30 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder28.zeroTermsQuery(zeroTermsQuery30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder28.lenient(false);
        multiMatchQueryBuilder28.setmaxExpansions((java.lang.Integer) 1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery36 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder28.zeroTermsQuery(zeroTermsQuery36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.cutoffFrequency((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type40 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        multiMatchQueryBuilder37.settype(type40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) type40);
        java.lang.String str43 = multiMatchQueryBuilder42.getfuzzyRewrite();
        java.lang.String str44 = multiMatchQueryBuilder42.fuzzyRewrite;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery45 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder42.zeroTermsQuery(zeroTermsQuery45);
        multiMatchQueryBuilder42.setuseDisMax((java.lang.Boolean) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder42.prefixLength((int) (short) 100);
        org.elasticsearch.index.query.Operator operator51 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.operator(operator51);
        java.lang.String str53 = multiMatchQueryBuilder52.getanalyzer();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(zeroTermsQuery11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNull(strObjectFloatHashMap29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertTrue("'" + type40 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type40.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test13580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13580");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.minimumShouldMatch("multi_match");
        multiMatchQueryBuilder8.setminimumShouldMatch("multi_match");
        multiMatchQueryBuilder8.setcutoffFrequency((java.lang.Float) (-1.0f));
        java.lang.Float float16 = multiMatchQueryBuilder8.gettieBreaker();
        java.lang.Integer int17 = multiMatchQueryBuilder8.slop;
        java.lang.String[] strArray21 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray21);
        org.elasticsearch.index.query.Operator operator23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.operator(operator23);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder22.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException27 = multiMatchQueryBuilder22.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder22.cutoffFrequency((float) (byte) 100);
        float float30 = multiMatchQueryBuilder22.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type31 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type32 = type31.matchQueryType();
        multiMatchQueryBuilder22.settype(type31);
        org.elasticsearch.common.ParseField parseField34 = type31.parseField();
        multiMatchQueryBuilder8.type = type31;
        java.lang.Float float36 = multiMatchQueryBuilder8.gettieBreaker();
        multiMatchQueryBuilder8.lenient = false;
        java.lang.Integer int39 = multiMatchQueryBuilder8.getslop();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(float16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNull(queryValidationException27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 1.0f + "'", float30 == 1.0f);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS + "'", type31.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS));
        org.junit.Assert.assertTrue("'" + type32 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type32.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(parseField34);
        org.junit.Assert.assertNull(float36);
        org.junit.Assert.assertNull(int39);
    }

    @Test
    public void test13581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13581");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.minimumShouldMatch("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("multi_match");
        java.lang.String str14 = multiMatchQueryBuilder11.toString();
        java.util.List<java.lang.String> strList15 = multiMatchQueryBuilder11.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("");
        java.lang.String[] strArray21 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray21);
        org.elasticsearch.index.query.Operator operator23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.operator(operator23);
        java.lang.Boolean boolean25 = multiMatchQueryBuilder22.getlenient();
        multiMatchQueryBuilder22.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder22.cutoffFrequency(0.0f);
        org.elasticsearch.common.unit.Fuzziness fuzziness30 = multiMatchQueryBuilder29.fuzziness;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery31 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder29.zeroTermsQuery(zeroTermsQuery31);
        java.lang.Boolean boolean33 = multiMatchQueryBuilder29.lenient;
        java.lang.String[] strArray37 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray37);
        org.elasticsearch.index.query.Operator operator39 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder38.operator(operator39);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder38.field("");
        java.lang.String str43 = multiMatchQueryBuilder38.getrewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder38.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder38.field("hi!", (float) (byte) 0);
        boolean boolean49 = multiMatchQueryBuilder29.equals((java.lang.Object) multiMatchQueryBuilder48);
        java.lang.String[] strArray53 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray53);
        org.elasticsearch.index.query.Operator operator55 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder54.operator(operator55);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder54.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException59 = multiMatchQueryBuilder54.validate();
        java.lang.Integer int60 = multiMatchQueryBuilder54.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery61 = multiMatchQueryBuilder54.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder54.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder54.fuzziness((java.lang.Object) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder54.boost((float) 0);
        java.lang.String str69 = multiMatchQueryBuilder54.fuzzyRewrite;
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap70 = multiMatchQueryBuilder54.fieldsBoosts;
        multiMatchQueryBuilder48.setfieldsBoosts(strObjectFloatHashMap70);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type72 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.common.ParseField parseField73 = type72.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type74 = type72.matchQueryType();
        multiMatchQueryBuilder48.settype(type72);
        multiMatchQueryBuilder17.settype(type72);
        java.lang.String str77 = multiMatchQueryBuilder17.rewrite;
        java.lang.Integer int78 = multiMatchQueryBuilder17.maxExpansions;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0,\n    \"Name\" : \"multi_match\"\n  }\n}" + "'", str14, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0,\n    \"Name\" : \"multi_match\"\n  }\n}");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNull(boolean25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNull(fuzziness30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNull(boolean33);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder56);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder58);
        org.junit.Assert.assertNull(queryValidationException59);
        org.junit.Assert.assertNull(int60);
        org.junit.Assert.assertNull(zeroTermsQuery61);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder64);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder66);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder68);
        org.junit.Assert.assertNull(str69);
        org.junit.Assert.assertNotNull(strObjectFloatHashMap70);
        org.junit.Assert.assertTrue("'" + type72 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type72.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(parseField73);
        org.junit.Assert.assertTrue("'" + type74 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type74.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNull(int78);
    }

    @Test
    public void test13582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13582");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzziness((java.lang.Object) 10);
        java.lang.Boolean boolean11 = multiMatchQueryBuilder8.useDisMax;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.boost((float) (short) 10);
        java.lang.String str14 = multiMatchQueryBuilder8.toString();
        java.lang.String str15 = multiMatchQueryBuilder8.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type16 = multiMatchQueryBuilder8.type;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"10\",\n    \"boost\" : 10.0\n  }\n}" + "'", str14, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"10\",\n    \"boost\" : 10.0\n  }\n}");
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"10\",\n    \"boost\" : 10.0\n  }\n}" + "'", str15, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"10\",\n    \"boost\" : 10.0\n  }\n}");
        org.junit.Assert.assertNull(type16);
    }

    @Test
    public void test13583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13583");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder0 = org.elasticsearch.index.query.MultiMatchQueryBuilder.PROTOTYPE;
        java.lang.String str1 = multiMatchQueryBuilder0.getminimumShouldMatch();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery2 = multiMatchQueryBuilder0.zeroTermsQuery;
        multiMatchQueryBuilder0.setuseDisMax((java.lang.Boolean) false);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder0.zeroTermsQuery(zeroTermsQuery5);
        org.elasticsearch.common.unit.Fuzziness fuzziness7 = null;
        multiMatchQueryBuilder0.setfuzziness(fuzziness7);
        java.lang.String str9 = multiMatchQueryBuilder0.queryName();
        multiMatchQueryBuilder0.minimumShouldMatch = "{\n  \"multiMatch\" : {\n    \"query\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 1.0\n  }\n}";
        java.lang.Boolean boolean12 = multiMatchQueryBuilder0.getuseDisMax();
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : {\n      \"multiMatch\" : {\n        \"query\" : \"multi_match\",\n        \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n        \"minimumShouldMatch\" : \"multi_match\",\n        \"lenient\" : true,\n        \"boost\" : 1.0,\n        \"Name\" : \"multi_match\"\n      }\n    },\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 1.0\n  }\n}" + "'", str1, "{\n  \"multiMatch\" : {\n    \"query\" : {\n      \"multiMatch\" : {\n        \"query\" : \"multi_match\",\n        \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n        \"minimumShouldMatch\" : \"multi_match\",\n        \"lenient\" : true,\n        \"boost\" : 1.0,\n        \"Name\" : \"multi_match\"\n      }\n    },\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNull(zeroTermsQuery2);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}" + "'", str9, "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}");
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
    }

    @Test
    public void test13584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13584");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.minimumShouldMatch("multi_match");
        multiMatchQueryBuilder8.setminimumShouldMatch("multi_match");
        java.lang.Float float14 = multiMatchQueryBuilder8.getcutoffFrequency();
        org.elasticsearch.index.query.Operator operator15 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder8.operator(operator15);
        java.lang.String str17 = multiMatchQueryBuilder8.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder8.slop((int) ' ');
        multiMatchQueryBuilder19.rewrite = "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"analyzer\" : \"\",\n    \"minimumShouldMatch\" : \"hi!\",\n    \"boost\" : 1.0\n  }\n}";
        java.lang.String[] strArray26 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (byte) 0, strArray26);
        java.lang.String[] strArray32 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) strArray26, strArray32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder19, strArray32);
        multiMatchQueryBuilder35.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder35.queryName("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"slop\" : 0,\n    \"useDisMax\" : false,\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray43 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray43);
        org.elasticsearch.index.query.Operator operator45 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.operator(operator45);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder44.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException49 = multiMatchQueryBuilder44.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder44.cutoffFrequency((float) (byte) 100);
        float float52 = multiMatchQueryBuilder44.boost();
        multiMatchQueryBuilder44.setanalyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder44.rewrite("multi_match");
        java.lang.String str57 = multiMatchQueryBuilder56.getfuzzyRewrite();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap58 = null;
        multiMatchQueryBuilder56.fieldsBoosts = strObjectFloatHashMap58;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder56.queryName("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder61.slop((int) (short) 1);
        multiMatchQueryBuilder63.lenient = false;
        java.lang.String str66 = multiMatchQueryBuilder63.getNAME();
        java.lang.String[] strArray70 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray70);
        org.elasticsearch.index.query.Operator operator72 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder71.operator(operator72);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder75 = multiMatchQueryBuilder71.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap76 = multiMatchQueryBuilder75.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery77 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder75.zeroTermsQuery(zeroTermsQuery77);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = multiMatchQueryBuilder75.lenient(false);
        multiMatchQueryBuilder75.setmaxExpansions((java.lang.Integer) 1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery83 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder84 = multiMatchQueryBuilder75.zeroTermsQuery(zeroTermsQuery83);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder86 = multiMatchQueryBuilder84.cutoffFrequency((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type87 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        multiMatchQueryBuilder84.settype(type87);
        float float89 = type87.tieBreaker();
        multiMatchQueryBuilder63.type = type87;
        org.elasticsearch.common.ParseField parseField91 = type87.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder92 = multiMatchQueryBuilder39.type(type87);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(float14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "multi_match" + "'", str17, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertNull(queryValidationException49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertTrue("'" + float52 + "' != '" + 1.0f + "'", float52 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "multi_match" + "'", str66, "multi_match");
        org.junit.Assert.assertNotNull(strArray70);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder75);
        org.junit.Assert.assertNull(strObjectFloatHashMap76);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder78);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder80);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder84);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder86);
        org.junit.Assert.assertTrue("'" + type87 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type87.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + float89 + "' != '" + 0.0f + "'", float89 == 0.0f);
        org.junit.Assert.assertNotNull(parseField91);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder92);
    }

    @Test
    public void test13585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13585");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        multiMatchQueryBuilder4.minimumShouldMatch = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.lenient(true);
        java.lang.String str13 = multiMatchQueryBuilder12.toString();
        java.lang.String str14 = multiMatchQueryBuilder12.getfuzzyRewrite();
        java.lang.String[] strArray18 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray18);
        org.elasticsearch.index.query.Operator operator20 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.operator(operator20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.field("");
        multiMatchQueryBuilder19.minimumShouldMatch = "hi!";
        java.lang.Float float26 = multiMatchQueryBuilder19.tieBreaker;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type27 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type28 = type27.matchQueryType();
        float float29 = type27.tieBreaker();
        multiMatchQueryBuilder19.type = type27;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder12.type(type27);
        multiMatchQueryBuilder31.maxExpansions = 100;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery34 = multiMatchQueryBuilder31.getzeroTermsQuery();
        multiMatchQueryBuilder31.settieBreaker((java.lang.Float) 1.0f);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}" + "'", str13, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNull(float26);
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type27.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type28.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNull(zeroTermsQuery34);
    }

    @Test
    public void test13586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13586");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        java.lang.Integer int10 = multiMatchQueryBuilder4.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery11 = multiMatchQueryBuilder4.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        float float15 = multiMatchQueryBuilder14.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder14.slop((int) (short) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.lenient(true);
        java.lang.Float float20 = multiMatchQueryBuilder17.getcutoffFrequency();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery21 = null;
        multiMatchQueryBuilder17.zeroTermsQuery = zeroTermsQuery21;
        java.lang.String str23 = multiMatchQueryBuilder17.toString();
        java.lang.String[] strArray27 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray27);
        org.elasticsearch.index.query.Operator operator29 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.operator(operator29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException33 = multiMatchQueryBuilder28.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder28.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder28.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder28.fuzzyRewrite("hi!");
        java.lang.String[] strArray43 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray43);
        org.elasticsearch.index.query.Operator operator45 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder44.operator(operator45);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder44.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder48.fuzziness((java.lang.Object) 10);
        multiMatchQueryBuilder48.setanalyzer("multi_match");
        org.elasticsearch.common.unit.Fuzziness fuzziness53 = multiMatchQueryBuilder48.getfuzziness();
        multiMatchQueryBuilder28.setfuzziness(fuzziness53);
        multiMatchQueryBuilder17.setfuzziness(fuzziness53);
        java.lang.String str56 = multiMatchQueryBuilder17.analyzer;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(zeroTermsQuery11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertTrue("'" + float15 + "' != '" + 1.0f + "'", float15 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNull(float20);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}^35.0\" ],\n    \"slop\" : 10,\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}" + "'", str23, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}^35.0\" ],\n    \"slop\" : 10,\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNull(queryValidationException33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNotNull(fuzziness53);
        org.junit.Assert.assertNull(str56);
    }

    @Test
    public void test13587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13587");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        multiMatchQueryBuilder4.fuzzyRewrite = "hi!";
        java.lang.String str9 = multiMatchQueryBuilder4.rewrite;
        java.lang.String[] strArray13 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray13);
        org.elasticsearch.index.query.Operator operator15 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder14.operator(operator15);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException19 = multiMatchQueryBuilder14.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder14.cutoffFrequency((float) (byte) 100);
        float float22 = multiMatchQueryBuilder14.boost();
        multiMatchQueryBuilder14.setanalyzer("");
        multiMatchQueryBuilder14.setcutoffFrequency((java.lang.Float) 0.0f);
        boolean boolean27 = multiMatchQueryBuilder4.equals((java.lang.Object) multiMatchQueryBuilder14);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery28 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder14.zeroTermsQuery(zeroTermsQuery28);
        java.lang.Boolean boolean30 = multiMatchQueryBuilder29.getlenient();
        java.lang.String str31 = multiMatchQueryBuilder29.getminimumShouldMatch();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder29.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder35.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"maxExpansions\" : 100,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.field("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder39.minimumShouldMatch = "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"slop\" : 97,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNull(queryValidationException19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 1.0f + "'", float22 == 1.0f);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNull(boolean30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
    }

    @Test
    public void test13588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13588");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder4.tieBreaker((float) (-1));
        multiMatchQueryBuilder4.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.useDisMax(true);
        multiMatchQueryBuilder17.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray23 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray23);
        org.elasticsearch.index.query.Operator operator25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.operator(operator25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException29 = multiMatchQueryBuilder24.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder24.cutoffFrequency((float) (byte) 100);
        float float32 = multiMatchQueryBuilder24.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type33 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type34 = type33.matchQueryType();
        multiMatchQueryBuilder24.settype(type33);
        org.elasticsearch.index.search.MatchQuery.Type type36 = type33.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder17.type(type33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder17.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder17.getPROTOTYPE();
        java.lang.String str41 = multiMatchQueryBuilder40.getWriteableName();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNull(queryValidationException29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertTrue("'" + type33 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS + "'", type33.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS));
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type34.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type36.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "multi_match" + "'", str41, "multi_match");
    }

    @Test
    public void test13589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13589");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.useDisMax(false);
        multiMatchQueryBuilder14.tieBreaker = 52.0f;
        java.lang.Object obj17 = multiMatchQueryBuilder14.text;
        java.lang.String str18 = multiMatchQueryBuilder14.fuzzyRewrite;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "multi_match" + "'", str12, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "multi_match" + "'", obj17, "multi_match");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test13590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13590");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.useDisMax(false);
        multiMatchQueryBuilder14.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 0.0,\n    \"_name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "multi_match" + "'", str12, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
    }

    @Test
    public void test13591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13591");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        multiMatchQueryBuilder4.minimumShouldMatch = "hi!";
        java.lang.Float float11 = multiMatchQueryBuilder4.tieBreaker;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type12 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type13 = type12.matchQueryType();
        float float14 = type12.tieBreaker();
        multiMatchQueryBuilder4.type = type12;
        multiMatchQueryBuilder4.fuzzyRewrite = "multi_match";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder4.maxExpansions(100);
        java.lang.String[] strArray23 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray23);
        org.elasticsearch.index.query.Operator operator25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.operator(operator25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.field("");
        org.elasticsearch.index.query.Operator operator29 = null;
        multiMatchQueryBuilder24.setoperator(operator29);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery31 = null;
        multiMatchQueryBuilder24.zeroTermsQuery = zeroTermsQuery31;
        multiMatchQueryBuilder24.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder24.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) multiMatchQueryBuilder24);
        multiMatchQueryBuilder37.maxExpansions = 0;
        java.lang.Boolean boolean40 = multiMatchQueryBuilder37.lenient;
        java.lang.String[] strArray44 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray44);
        org.elasticsearch.index.query.Operator operator46 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.operator(operator46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder45.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap50 = multiMatchQueryBuilder49.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder49.minimumShouldMatch("multi_match");
        java.lang.String str53 = multiMatchQueryBuilder52.toString();
        java.lang.String[] strArray57 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray57);
        org.elasticsearch.index.query.Operator operator59 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.operator(operator59);
        java.lang.String str61 = multiMatchQueryBuilder58.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness62 = multiMatchQueryBuilder58.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder58.tieBreaker((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder64.cutoffFrequency((float) '4');
        boolean boolean67 = multiMatchQueryBuilder52.equals((java.lang.Object) multiMatchQueryBuilder64);
        multiMatchQueryBuilder64.setmaxExpansions((java.lang.Integer) (-1));
        multiMatchQueryBuilder64.setprefixLength((java.lang.Integer) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = multiMatchQueryBuilder37.fuzziness((java.lang.Object) multiMatchQueryBuilder64);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder74 = multiMatchQueryBuilder37.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"analyzer\" : \"\",\n    \"fuzziness\" : \"BEST_FIELDS\",\n    \"cutoff_frequency\" : -1.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.Integer int75 = multiMatchQueryBuilder74.getprefixLength();
        org.elasticsearch.common.io.stream.StreamOutput streamOutput76 = null;
        // The following exception was thrown during execution in test generation
        try {
            multiMatchQueryBuilder74.writeTo(streamOutput76);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(float11);
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type12.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type13.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNull(boolean40);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNull(strObjectFloatHashMap50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}" + "'", str53, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "multi_match" + "'", str61, "multi_match");
        org.junit.Assert.assertNull(fuzziness62);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder64);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder72);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder74);
        org.junit.Assert.assertNull(int75);
    }

    @Test
    public void test13592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13592");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzziness((java.lang.Object) 10);
        multiMatchQueryBuilder8.setmaxExpansions((java.lang.Integer) 0);
        multiMatchQueryBuilder8.rewrite = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}";
        java.lang.String str15 = multiMatchQueryBuilder8.getminimumShouldMatch();
        multiMatchQueryBuilder8.lenient = false;
        multiMatchQueryBuilder8.fuzzyRewrite = "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 1,\n    \"maxExpansions\" : -1,\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test13593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13593");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.zeroTermsQuery(zeroTermsQuery13);
        multiMatchQueryBuilder4.cutoffFrequency = 100.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.rewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder18.setlenient((java.lang.Boolean) false);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery21 = multiMatchQueryBuilder18.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder18.queryName("{\n  \"multiMatch\" : {\n    \"query\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder18.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"minimumShouldMatch\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"useDisMax\" : false,\n    \"lenient\" : false,\n    \"cutoffFrequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder25.maxExpansions = 1;
        org.elasticsearch.index.query.Operator operator28 = null;
        multiMatchQueryBuilder25.setoperator(operator28);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder25.maxExpansions((int) 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNull(zeroTermsQuery21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
    }

    @Test
    public void test13594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13594");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        multiMatchQueryBuilder4.operator = operator5;
        float float7 = multiMatchQueryBuilder4.boost();
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 1.0f);
        java.util.List<java.lang.String> strList10 = multiMatchQueryBuilder4.getfields();
        java.lang.Integer int11 = multiMatchQueryBuilder4.getslop();
        multiMatchQueryBuilder4.setminimumShouldMatch("");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertTrue("'" + float7 + "' != '" + 1.0f + "'", float7 == 1.0f);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNull(int11);
    }

    @Test
    public void test13595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13595");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder6.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type9 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type10 = type9.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder6.type(type9);
        org.elasticsearch.common.ParseField parseField12 = type9.parseField();
        java.lang.String[] strArray17 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray17);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (byte) 0, strArray17);
        java.lang.String[] strArray23 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray23);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) strArray17, strArray23);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) parseField12, strArray23);
        multiMatchQueryBuilder26.fuzzyRewrite = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}";
        java.lang.String[] strArray32 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray32);
        org.elasticsearch.index.query.Operator operator34 = null;
        multiMatchQueryBuilder33.operator = operator34;
        java.lang.String str36 = multiMatchQueryBuilder33.rewrite;
        org.elasticsearch.index.query.Operator operator37 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder33.operator(operator37);
        java.lang.String[] strArray42 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray42);
        org.elasticsearch.index.query.Operator operator44 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.operator(operator44);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder43.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException48 = multiMatchQueryBuilder43.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder43.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery51 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.zeroTermsQuery(zeroTermsQuery51);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder50.maxExpansions((-1));
        java.util.List<java.lang.String> strList55 = multiMatchQueryBuilder50.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = org.elasticsearch.index.query.MultiMatchQueryBuilder.PROTOTYPE;
        java.lang.Object obj57 = multiMatchQueryBuilder56.text;
        java.lang.String[] strArray61 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray61);
        org.elasticsearch.index.query.Operator operator63 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder62.operator(operator63);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder62.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException67 = multiMatchQueryBuilder62.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder62.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder62.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder62.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type74 = multiMatchQueryBuilder62.type;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type75 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.common.ParseField parseField76 = type75.parseField();
        multiMatchQueryBuilder62.type = type75;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder56.type(type75);
        org.elasticsearch.index.search.MatchQuery.Type type79 = type75.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = multiMatchQueryBuilder50.type(type75);
        org.elasticsearch.common.ParseField parseField81 = type75.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type82 = type75.matchQueryType();
        boolean boolean83 = multiMatchQueryBuilder33.equals((java.lang.Object) type75);
        org.elasticsearch.index.search.MatchQuery.Type type84 = type75.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type85 = type75.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder86 = multiMatchQueryBuilder26.type(type75);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type9.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type10.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(parseField12);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(strArray42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNull(queryValidationException48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder56);
        org.junit.Assert.assertNull(obj57);
        org.junit.Assert.assertNotNull(strArray61);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder64);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder66);
        org.junit.Assert.assertNull(queryValidationException67);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertNull(type74);
        org.junit.Assert.assertTrue("'" + type75 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type75.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(parseField76);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder78);
        org.junit.Assert.assertTrue("'" + type79 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type79.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder80);
        org.junit.Assert.assertNotNull(parseField81);
        org.junit.Assert.assertTrue("'" + type82 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type82.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + type84 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type84.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + type85 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type85.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder86);
    }

    @Test
    public void test13596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13596");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        java.lang.Integer int10 = multiMatchQueryBuilder4.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery11 = multiMatchQueryBuilder4.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.boost((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder4.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.Boolean boolean21 = multiMatchQueryBuilder20.useDisMax;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder20.fuzzyRewrite("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder20.useDisMax(true);
        java.lang.Float float26 = multiMatchQueryBuilder20.gettieBreaker();
        java.lang.String[] strArray30 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray30);
        org.elasticsearch.index.query.Operator operator32 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.operator(operator32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder31.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap36 = multiMatchQueryBuilder35.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery37 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder35.zeroTermsQuery(zeroTermsQuery37);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.lenient(false);
        multiMatchQueryBuilder35.setmaxExpansions((java.lang.Integer) 1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery43 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder35.zeroTermsQuery(zeroTermsQuery43);
        multiMatchQueryBuilder35.tieBreaker = 10.0f;
        java.lang.String[] strArray50 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray50);
        org.elasticsearch.index.query.Operator operator52 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder51.operator(operator52);
        multiMatchQueryBuilder51.fuzzyRewrite = "hi!";
        org.elasticsearch.index.query.Operator operator56 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder51.operator(operator56);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder57.maxExpansions((int) (short) 10);
        java.lang.String[] strArray63 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray63);
        org.elasticsearch.index.query.Operator operator65 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder64.operator(operator65);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder64.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = multiMatchQueryBuilder68.fuzziness((java.lang.Object) 10);
        multiMatchQueryBuilder68.setanalyzer("multi_match");
        org.elasticsearch.common.unit.Fuzziness fuzziness73 = multiMatchQueryBuilder68.getfuzziness();
        multiMatchQueryBuilder57.fuzziness = fuzziness73;
        multiMatchQueryBuilder35.setfuzziness(fuzziness73);
        multiMatchQueryBuilder20.fuzziness = fuzziness73;
        multiMatchQueryBuilder20.prefixLength = 0;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(zeroTermsQuery11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNull(float26);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNull(strObjectFloatHashMap36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNotNull(strArray50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertNotNull(strArray63);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder66);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder68);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder70);
        org.junit.Assert.assertNotNull(fuzziness73);
    }

    @Test
    public void test13597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13597");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setfuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type10 = multiMatchQueryBuilder4.gettype();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder4.cutoffFrequency = 100.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"{\\n  \\\"MULTI_MATCH\\\" : {\\n    \\\"QUERY\\\" : \\\"MULTI_MATCH\\\",\\n    \\\"FIELDS\\\" : [ \\\"MULTI_MATCH\\\", \\\"HI!\\\" ],\\n    \\\"ANALYZER\\\" : \\\"{\\\\N  \\\\\\\"MULTI_MATCH\\\\\\\" : {\\\\N    \\\\\\\"QUERY\\\\\\\" : \\\\\\\"MULTI_MATCH\\\\\\\",\\\\N    \\\\\\\"FIELDS\\\\\\\" : [ \\\\\\\"MULTI_MATCH\\\\\\\", \\\\\\\"HI!\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\N    \\\\\\\"SLOP\\\\\\\" : 0,\\\\N    \\\\\\\"FUZZY_REWRITE\\\\\\\" : \\\\\\\"HI!\\\\\\\",\\\\N    \\\\\\\"TIE_BREAKER\\\\\\\" : 100.0,\\\\N    \\\\\\\"CUTOFF_FREQUENCY\\\\\\\" : 100.0,\\\\N    \\\\\\\"BOOST\\\\\\\" : 1.0\\\\N  }\\\\N}\\\",\\n    \\\"MAX_EXPANSIONS\\\" : 100,\\n    \\\"USE_DIS_MAX\\\" : TRUE,\\n    \\\"TIE_BREAKER\\\" : -1.0,\\n    \\\"CUTOFF_FREQUENCY\\\" : 0.0,\\n    \\\"BOOST\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray20 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray20);
        org.elasticsearch.index.query.Operator operator22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.operator(operator22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.field("");
        java.lang.String str26 = multiMatchQueryBuilder21.getrewrite();
        java.lang.Object obj27 = multiMatchQueryBuilder21.text;
        float float28 = multiMatchQueryBuilder21.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder21.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.Float float31 = multiMatchQueryBuilder21.gettieBreaker();
        java.lang.String[] strArray35 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray35);
        org.elasticsearch.index.query.Operator operator37 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder38 = multiMatchQueryBuilder36.operator(operator37);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder36.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException41 = multiMatchQueryBuilder36.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder36.cutoffFrequency((float) (byte) 100);
        float float44 = multiMatchQueryBuilder36.boost();
        multiMatchQueryBuilder36.setanalyzer("");
        java.lang.Boolean boolean47 = multiMatchQueryBuilder36.getuseDisMax();
        java.lang.String str48 = multiMatchQueryBuilder36.getrewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder36.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray54 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray54);
        org.elasticsearch.index.query.Operator operator56 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder55.operator(operator56);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder55.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder59.fuzziness((java.lang.Object) 10);
        multiMatchQueryBuilder59.setanalyzer("multi_match");
        org.elasticsearch.common.unit.Fuzziness fuzziness64 = multiMatchQueryBuilder59.getfuzziness();
        multiMatchQueryBuilder50.fuzziness = fuzziness64;
        multiMatchQueryBuilder21.setfuzziness(fuzziness64);
        multiMatchQueryBuilder16.fuzziness = fuzziness64;
        org.elasticsearch.index.query.Operator operator68 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = multiMatchQueryBuilder16.operator(operator68);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap70 = multiMatchQueryBuilder69.getfieldsBoosts();
        java.util.List<java.lang.String> strList71 = multiMatchQueryBuilder69.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder69.boost((float) 1);
        java.lang.String str74 = multiMatchQueryBuilder69.getminimumShouldMatch();
        org.elasticsearch.index.query.Operator operator75 = null;
        multiMatchQueryBuilder69.operator = operator75;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "multi_match" + "'", obj27, "multi_match");
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 1.0f + "'", float28 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNull(float31);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNull(queryValidationException41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 1.0f + "'", float44 == 1.0f);
        org.junit.Assert.assertNull(boolean47);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNotNull(strArray54);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertNotNull(fuzziness64);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder69);
        org.junit.Assert.assertNull(strObjectFloatHashMap70);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertNull(str74);
    }

    @Test
    public void test13598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13598");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        multiMatchQueryBuilder4.operator = operator5;
        java.lang.String str7 = multiMatchQueryBuilder4.rewrite;
        org.elasticsearch.index.query.Operator operator8 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder4.operator(operator8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.queryName("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"prefixLength\" : 10,\n    \"maxExpansions\" : -1,\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str12 = multiMatchQueryBuilder11.getminimumShouldMatch();
        java.lang.String[] strArray16 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray16);
        org.elasticsearch.index.query.Operator operator18 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.operator(operator18);
        java.lang.Boolean boolean20 = multiMatchQueryBuilder17.getlenient();
        multiMatchQueryBuilder17.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder17.cutoffFrequency(0.0f);
        org.elasticsearch.common.unit.Fuzziness fuzziness25 = multiMatchQueryBuilder24.fuzziness;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery26 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder24.zeroTermsQuery(zeroTermsQuery26);
        java.lang.Boolean boolean28 = multiMatchQueryBuilder24.lenient;
        java.lang.String[] strArray32 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray32);
        org.elasticsearch.index.query.Operator operator34 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.operator(operator34);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder33.field("");
        java.lang.String str38 = multiMatchQueryBuilder33.getrewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder33.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder33.field("hi!", (float) (byte) 0);
        boolean boolean44 = multiMatchQueryBuilder24.equals((java.lang.Object) multiMatchQueryBuilder43);
        java.lang.String[] strArray48 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray48);
        org.elasticsearch.index.query.Operator operator50 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder49.operator(operator50);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder49.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException54 = multiMatchQueryBuilder49.validate();
        java.lang.Integer int55 = multiMatchQueryBuilder49.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery56 = multiMatchQueryBuilder49.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder49.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder49.fuzziness((java.lang.Object) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder49.boost((float) 0);
        java.lang.String str64 = multiMatchQueryBuilder49.fuzzyRewrite;
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap65 = multiMatchQueryBuilder49.fieldsBoosts;
        multiMatchQueryBuilder43.setfieldsBoosts(strObjectFloatHashMap65);
        multiMatchQueryBuilder11.fieldsBoosts = strObjectFloatHashMap65;
        multiMatchQueryBuilder11.setanalyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"{\\n  \\\"MULTIMATCH\\\" : {\\n    \\\"QUERY\\\" : \\\"MULTI_MATCH\\\",\\n    \\\"FIELDS\\\" : [ \\\"MULTI_MATCH\\\", \\\"HI!\\\" ],\\n    \\\"MAXEXPANSIONS\\\" : 10,\\n    \\\"FUZZYREWRITE\\\" : \\\"HI!\\\",\\n    \\\"BOOST\\\" : 1.0\\n  }\\n}\",\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator70 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder11.operator(operator70);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNull(boolean20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNull(fuzziness25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(boolean28);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNull(queryValidationException54);
        org.junit.Assert.assertNull(int55);
        org.junit.Assert.assertNull(zeroTermsQuery56);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
        org.junit.Assert.assertNull(str64);
        org.junit.Assert.assertNotNull(strObjectFloatHashMap65);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
    }

    @Test
    public void test13599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13599");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap12 = multiMatchQueryBuilder11.getfieldsBoosts();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap13 = null;
        multiMatchQueryBuilder11.fieldsBoosts = strObjectFloatHashMap13;
        org.elasticsearch.common.unit.Fuzziness fuzziness15 = multiMatchQueryBuilder11.getfuzziness();
        org.elasticsearch.common.unit.Fuzziness fuzziness16 = multiMatchQueryBuilder11.fuzziness;
        multiMatchQueryBuilder11.setanalyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder11.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"10.0\",\n    \"minimumShouldMatch\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"tieBreaker\\\" : -1.0,\\n    \\\"cutoffFrequency\\\" : 1.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(strObjectFloatHashMap12);
        org.junit.Assert.assertNull(fuzziness15);
        org.junit.Assert.assertNull(fuzziness16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
    }

    @Test
    public void test13600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13600");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        multiMatchQueryBuilder4.fuzzyRewrite = "hi!";
        org.elasticsearch.index.query.Operator operator9 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.operator(operator9);
        org.elasticsearch.index.query.QueryValidationException queryValidationException11 = multiMatchQueryBuilder10.validate();
        java.lang.String str12 = multiMatchQueryBuilder10.getminimumShouldMatch();
        java.lang.String[] strArray16 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray16);
        org.elasticsearch.index.query.Operator operator18 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.operator(operator18);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException22 = multiMatchQueryBuilder17.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder17.cutoffFrequency((float) (byte) 100);
        java.lang.Object obj25 = multiMatchQueryBuilder17.text;
        java.lang.String str26 = multiMatchQueryBuilder17.getName();
        java.lang.Object obj27 = multiMatchQueryBuilder17.text;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type28 = multiMatchQueryBuilder17.gettype();
        multiMatchQueryBuilder17.fuzzyRewrite = "";
        multiMatchQueryBuilder17.maxExpansions = 0;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder17.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder34.slop(32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder10.fuzziness((java.lang.Object) multiMatchQueryBuilder36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder10.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"slop\" : 97,\n    \"fuzziness\" : \"{\\n  \\\"MULTIMATCH\\\" : {\\n    \\\"QUERY\\\" : \\\"MULTI_MATCH\\\",\\n    \\\"FIELDS\\\" : [ \\\"MULTI_MATCH\\\", \\\"HI!\\\", \\\"\\\" ],\\n    \\\"FUZZYREWRITE\\\" : \\\"HI!\\\",\\n    \\\"TIEBREAKER\\\" : 100.0,\\n    \\\"LENIENT\\\" : TRUE,\\n    \\\"CUTOFFFREQUENCY\\\" : 0.0,\\n    \\\"BOOST\\\" : 1.0\\n  }\\n}\",\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"multi_match\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        java.lang.String str40 = multiMatchQueryBuilder10.queryName();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(queryValidationException11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNull(queryValidationException22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "multi_match" + "'", obj25, "multi_match");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "multi_match" + "'", str26, "multi_match");
        org.junit.Assert.assertEquals("'" + obj27 + "' != '" + "multi_match" + "'", obj27, "multi_match");
        org.junit.Assert.assertNull(type28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test13601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13601");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.Object obj12 = multiMatchQueryBuilder4.text;
        java.lang.String str13 = multiMatchQueryBuilder4.getName();
        java.lang.Object obj14 = multiMatchQueryBuilder4.text;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery15 = multiMatchQueryBuilder4.getzeroTermsQuery();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "multi_match" + "'", obj12, "multi_match");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "multi_match" + "'", obj14, "multi_match");
        org.junit.Assert.assertNull(zeroTermsQuery15);
    }

    @Test
    public void test13602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13602");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        multiMatchQueryBuilder4.setrewrite("");
        java.util.List<java.lang.String> strList9 = multiMatchQueryBuilder4.getfields();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery10 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.zeroTermsQuery(zeroTermsQuery10);
        multiMatchQueryBuilder11.maxExpansions = 10;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"useDisMax\" : true,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str16 = multiMatchQueryBuilder15.getminimumShouldMatch();
        java.lang.Object obj17 = multiMatchQueryBuilder15.gettext();
        java.lang.Boolean boolean18 = multiMatchQueryBuilder15.getuseDisMax();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap19 = multiMatchQueryBuilder15.getfieldsBoosts();
        java.lang.String str20 = multiMatchQueryBuilder15.analyzer;
        java.lang.String[] strArray24 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray24);
        org.elasticsearch.index.query.Operator operator26 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.operator(operator26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder25.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap30 = multiMatchQueryBuilder29.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder29.minimumShouldMatch("multi_match");
        java.lang.Float float33 = multiMatchQueryBuilder29.getcutoffFrequency();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder29.getPROTOTYPE();
        java.lang.String[] strArray38 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray38);
        org.elasticsearch.index.query.Operator operator40 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.operator(operator40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder39.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder43.fuzziness((java.lang.Object) 10);
        java.lang.Boolean boolean46 = multiMatchQueryBuilder43.useDisMax;
        java.lang.String str47 = multiMatchQueryBuilder43.queryName();
        org.elasticsearch.common.unit.Fuzziness fuzziness48 = multiMatchQueryBuilder43.getfuzziness();
        multiMatchQueryBuilder29.fuzziness = fuzziness48;
        multiMatchQueryBuilder15.setfuzziness(fuzziness48);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + "multi_match" + "'", obj17, "multi_match");
        org.junit.Assert.assertNull(boolean18);
        org.junit.Assert.assertNull(strObjectFloatHashMap19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNull(strObjectFloatHashMap30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNull(float33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNull(boolean46);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertNotNull(fuzziness48);
    }

    @Test
    public void test13603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13603");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        multiMatchQueryBuilder4.fuzzyRewrite = "hi!";
        org.elasticsearch.index.query.Operator operator9 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.operator(operator9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder10.maxExpansions((int) (short) 10);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = multiMatchQueryBuilder10.zeroTermsQuery;
        java.lang.Float float14 = multiMatchQueryBuilder10.gettieBreaker();
        java.lang.String str15 = multiMatchQueryBuilder10.getNAME();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type16 = multiMatchQueryBuilder10.type;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNull(zeroTermsQuery13);
        org.junit.Assert.assertNull(float14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "multi_match" + "'", str15, "multi_match");
        org.junit.Assert.assertNull(type16);
    }

    @Test
    public void test13604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13604");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        java.lang.String str14 = multiMatchQueryBuilder4.getrewrite();
        multiMatchQueryBuilder4.setlenient((java.lang.Boolean) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.prefixLength((int) ' ');
        java.lang.Boolean boolean19 = multiMatchQueryBuilder18.getuseDisMax();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder18.maxExpansions(10);
        org.elasticsearch.common.unit.Fuzziness fuzziness22 = multiMatchQueryBuilder21.fuzziness;
        float float23 = multiMatchQueryBuilder21.boost();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNull(fuzziness22);
        org.junit.Assert.assertTrue("'" + float23 + "' != '" + 1.0f + "'", float23 == 1.0f);
    }

    @Test
    public void test13605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13605");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder4.tieBreaker((float) (-1));
        multiMatchQueryBuilder4.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.useDisMax(true);
        multiMatchQueryBuilder17.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray23 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray23);
        org.elasticsearch.index.query.Operator operator25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.operator(operator25);
        java.lang.String str27 = multiMatchQueryBuilder24.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness28 = multiMatchQueryBuilder24.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.tieBreaker((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type31 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder24.settype(type31);
        multiMatchQueryBuilder17.settype(type31);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery34 = multiMatchQueryBuilder17.zeroTermsQuery;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder17.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder36.slop = 1;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder36.maxExpansions(1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "multi_match" + "'", str27, "multi_match");
        org.junit.Assert.assertNull(fuzziness28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type31.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNull(zeroTermsQuery34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
    }

    @Test
    public void test13606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13606");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.String str7 = multiMatchQueryBuilder4.getWriteableName();
        java.lang.Boolean boolean8 = multiMatchQueryBuilder4.useDisMax;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.boost((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.queryName("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        multiMatchQueryBuilder12.setzeroTermsQuery(zeroTermsQuery13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.lenient(true);
        multiMatchQueryBuilder16.setfuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"{\\n  \\\"MULTIMATCH\\\" : {\\n    \\\"QUERY\\\" : \\\"MULTI_MATCH\\\",\\n    \\\"FIELDS\\\" : [ \\\"MULTI_MATCH\\\", \\\"HI!\\\" ],\\n    \\\"ANALYZER\\\" : \\\"{\\\\N  \\\\\\\"MULTI_MATCH\\\\\\\" : {\\\\N    \\\\\\\"QUERY\\\\\\\" : \\\\\\\"MULTI_MATCH\\\\\\\",\\\\N    \\\\\\\"FIELDS\\\\\\\" : [ \\\\\\\"MULTI_MATCH\\\\\\\", \\\\\\\"HI!\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\N    \\\\\\\"SLOP\\\\\\\" : 0,\\\\N    \\\\\\\"FUZZY_REWRITE\\\\\\\" : \\\\\\\"HI!\\\\\\\",\\\\N    \\\\\\\"TIE_BREAKER\\\\\\\" : 100.0,\\\\N    \\\\\\\"CUTOFF_FREQUENCY\\\\\\\" : 100.0,\\\\N    \\\\\\\"BOOST\\\\\\\" : 1.0\\\\N  }\\\\N}\\\",\\n    \\\"MAXEXPANSIONS\\\" : 100,\\n    \\\"USEDISMAX\\\" : TRUE,\\n    \\\"TIEBREAKER\\\" : -1.0,\\n    \\\"CUTOFFFREQUENCY\\\" : 0.0,\\n    \\\"BOOST\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.Object obj19 = multiMatchQueryBuilder16.text;
        java.lang.String[] strArray23 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray23);
        org.elasticsearch.index.query.Operator operator25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.operator(operator25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException29 = multiMatchQueryBuilder24.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder24.cutoffFrequency((float) (byte) 100);
        java.lang.String str32 = multiMatchQueryBuilder24.getanalyzer();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery33 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder24.zeroTermsQuery(zeroTermsQuery33);
        multiMatchQueryBuilder24.cutoffFrequency = 100.0f;
        multiMatchQueryBuilder24.setmaxExpansions((java.lang.Integer) 10);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery39 = null;
        multiMatchQueryBuilder24.zeroTermsQuery = zeroTermsQuery39;
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap41 = multiMatchQueryBuilder24.fieldsBoosts;
        java.lang.String[] strArray45 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray45);
        org.elasticsearch.index.query.Operator operator47 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder46.operator(operator47);
        java.lang.Boolean boolean49 = multiMatchQueryBuilder46.getlenient();
        multiMatchQueryBuilder46.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder46.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder46.tieBreaker((float) (-1));
        multiMatchQueryBuilder46.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder46.getPROTOTYPE();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap59 = multiMatchQueryBuilder46.getfieldsBoosts();
        multiMatchQueryBuilder46.setslop((java.lang.Integer) (-1));
        java.lang.String[] strArray65 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray65);
        org.elasticsearch.index.query.Operator operator67 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder66.operator(operator67);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = multiMatchQueryBuilder66.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException71 = multiMatchQueryBuilder66.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder66.cutoffFrequency((float) (byte) 100);
        java.lang.Object obj74 = multiMatchQueryBuilder66.text;
        multiMatchQueryBuilder66.setrewrite("");
        java.lang.String str77 = multiMatchQueryBuilder66.fuzzyRewrite;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder79 = multiMatchQueryBuilder66.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder80 = multiMatchQueryBuilder66.getPROTOTYPE();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder82 = multiMatchQueryBuilder80.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.util.List<java.lang.String> strList83 = multiMatchQueryBuilder80.fields;
        multiMatchQueryBuilder80.useDisMax = false;
        multiMatchQueryBuilder80.setminimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"slop\" : 97,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.unit.Fuzziness fuzziness88 = multiMatchQueryBuilder80.getfuzziness();
        multiMatchQueryBuilder46.fuzziness = fuzziness88;
        multiMatchQueryBuilder24.setfuzziness(fuzziness88);
        multiMatchQueryBuilder16.setfuzziness(fuzziness88);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multi_match" + "'", str7, "multi_match");
        org.junit.Assert.assertNull(boolean8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "multi_match" + "'", obj19, "multi_match");
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNull(queryValidationException29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNull(strObjectFloatHashMap41);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertNull(boolean49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder58);
        org.junit.Assert.assertNull(strObjectFloatHashMap59);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder68);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder70);
        org.junit.Assert.assertNull(queryValidationException71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertEquals("'" + obj74 + "' != '" + "multi_match" + "'", obj74, "multi_match");
        org.junit.Assert.assertNull(str77);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder79);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder80);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder82);
        org.junit.Assert.assertNotNull(strList83);
        org.junit.Assert.assertNull(fuzziness88);
    }

    @Test
    public void test13607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13607");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.rewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder16.tieBreaker((float) 1L);
        multiMatchQueryBuilder18.setslop((java.lang.Integer) (-1));
        multiMatchQueryBuilder18.setcutoffFrequency((java.lang.Float) 35.0f);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
    }

    @Test
    public void test13608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13608");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder0 = org.elasticsearch.index.query.MultiMatchQueryBuilder.PROTOTYPE;
        java.lang.String str1 = multiMatchQueryBuilder0.getminimumShouldMatch();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery2 = multiMatchQueryBuilder0.zeroTermsQuery;
        multiMatchQueryBuilder0.setuseDisMax((java.lang.Boolean) false);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder0.zeroTermsQuery(zeroTermsQuery5);
        org.elasticsearch.common.unit.Fuzziness fuzziness7 = null;
        multiMatchQueryBuilder0.setfuzziness(fuzziness7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder0.slop(0);
        java.lang.String[] strArray14 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray14);
        org.elasticsearch.index.query.Operator operator16 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder15.operator(operator16);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap20 = multiMatchQueryBuilder19.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery21 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder19.zeroTermsQuery(zeroTermsQuery21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder19.lenient(false);
        java.lang.Object obj25 = multiMatchQueryBuilder24.gettext();
        java.lang.Integer int26 = multiMatchQueryBuilder24.getslop();
        multiMatchQueryBuilder24.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str31 = multiMatchQueryBuilder30.fuzzyRewrite;
        java.lang.String str32 = multiMatchQueryBuilder30.fuzzyRewrite;
        multiMatchQueryBuilder30.prefixLength = 10;
        multiMatchQueryBuilder30.rewrite = "";
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery37 = multiMatchQueryBuilder30.zeroTermsQuery;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder30.boost((float) (short) 0);
        java.lang.Object obj40 = multiMatchQueryBuilder39.gettext();
        java.lang.String[] strArray44 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray44);
        org.elasticsearch.index.query.Operator operator46 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.operator(operator46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder45.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap50 = multiMatchQueryBuilder49.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery51 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder49.zeroTermsQuery(zeroTermsQuery51);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder49.lenient(false);
        multiMatchQueryBuilder49.setcutoffFrequency((java.lang.Float) 1.0f);
        org.elasticsearch.index.query.QueryValidationException queryValidationException57 = multiMatchQueryBuilder49.validate();
        multiMatchQueryBuilder49.setrewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimumShouldMatch\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"slop\" : 0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder49.lenient = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder49.lenient(false);
        java.lang.Integer int64 = multiMatchQueryBuilder63.slop;
        java.lang.String[] strArray68 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder69 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray68);
        org.elasticsearch.index.query.Operator operator70 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder69.operator(operator70);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder69.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException74 = multiMatchQueryBuilder69.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = multiMatchQueryBuilder69.cutoffFrequency((float) (byte) 100);
        float float77 = multiMatchQueryBuilder69.boost();
        multiMatchQueryBuilder69.setanalyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type80 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type81 = type80.matchQueryType();
        float float82 = type80.tieBreaker();
        float float83 = type80.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder84 = multiMatchQueryBuilder69.fuzziness((java.lang.Object) type80);
        float float85 = type80.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder86 = multiMatchQueryBuilder63.type(type80);
        float float87 = type80.tieBreaker();
        multiMatchQueryBuilder39.settype(type80);
        multiMatchQueryBuilder0.settype(type80);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"slop\" : 97,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}" + "'", str1, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"type\" : \"most_fields\",\n    \"slop\" : 97,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNull(zeroTermsQuery2);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNull(strObjectFloatHashMap20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertEquals("'" + obj25 + "' != '" + "multi_match" + "'", obj25, "multi_match");
        org.junit.Assert.assertNull(int26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(zeroTermsQuery37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertEquals("'" + obj40 + "' != '" + "multi_match" + "'", obj40, "multi_match");
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNull(strObjectFloatHashMap50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertNull(queryValidationException57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
        org.junit.Assert.assertNull(int64);
        org.junit.Assert.assertNotNull(strArray68);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertNull(queryValidationException74);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder76);
        org.junit.Assert.assertTrue("'" + float77 + "' != '" + 1.0f + "'", float77 == 1.0f);
        org.junit.Assert.assertTrue("'" + type80 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type80.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type81 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type81.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float82 + "' != '" + 0.0f + "'", float82 == 0.0f);
        org.junit.Assert.assertTrue("'" + float83 + "' != '" + 0.0f + "'", float83 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder84);
        org.junit.Assert.assertTrue("'" + float85 + "' != '" + 0.0f + "'", float85 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder86);
        org.junit.Assert.assertTrue("'" + float87 + "' != '" + 0.0f + "'", float87 == 0.0f);
    }

    @Test
    public void test13609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13609");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.common.unit.Fuzziness fuzziness9 = multiMatchQueryBuilder8.fuzziness;
        java.util.List<java.lang.String> strList10 = multiMatchQueryBuilder8.getfields();
        multiMatchQueryBuilder8.setslop((java.lang.Integer) 10);
        multiMatchQueryBuilder8.cutoffFrequency = 10.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder8.rewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}");
        multiMatchQueryBuilder8.tieBreaker = 97.0f;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(fuzziness9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
    }

    @Test
    public void test13610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13610");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.String str7 = multiMatchQueryBuilder6.getminimumShouldMatch();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery8 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder6.zeroTermsQuery(zeroTermsQuery8);
        multiMatchQueryBuilder9.analyzer = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.tieBreaker((float) (short) 1);
        multiMatchQueryBuilder13.prefixLength = 0;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type16 = multiMatchQueryBuilder13.type;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder13.maxExpansions(100);
        multiMatchQueryBuilder13.slop = 32;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNull(type16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
    }

    @Test
    public void test13611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13611");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        multiMatchQueryBuilder4.setuseDisMax((java.lang.Boolean) false);
        java.lang.String str15 = multiMatchQueryBuilder4.fuzzyRewrite;
        java.lang.Integer int16 = multiMatchQueryBuilder4.slop;
        multiMatchQueryBuilder4.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}";
        org.elasticsearch.index.query.QueryValidationException queryValidationException19 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder4.maxExpansions((int) (byte) 1);
        java.lang.String str22 = multiMatchQueryBuilder4.toString();
        java.lang.String[] strArray26 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray26);
        org.elasticsearch.index.query.Operator operator28 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.operator(operator28);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap32 = multiMatchQueryBuilder31.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery33 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder31.zeroTermsQuery(zeroTermsQuery33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder31.lenient(false);
        java.lang.Object obj37 = multiMatchQueryBuilder36.gettext();
        java.lang.Integer int38 = multiMatchQueryBuilder36.getslop();
        multiMatchQueryBuilder36.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder36.boost(100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder36.slop((int) ' ');
        java.lang.Float float45 = multiMatchQueryBuilder36.gettieBreaker();
        java.lang.String[] strArray49 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray49);
        org.elasticsearch.index.query.Operator operator51 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder50.operator(operator51);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder50.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap55 = multiMatchQueryBuilder54.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery56 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder54.zeroTermsQuery(zeroTermsQuery56);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder54.lenient(false);
        multiMatchQueryBuilder54.setmaxExpansions((java.lang.Integer) 1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery62 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder63 = multiMatchQueryBuilder54.zeroTermsQuery(zeroTermsQuery62);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder63.cutoffFrequency((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder67 = multiMatchQueryBuilder65.boost((float) (short) 0);
        java.lang.Object obj68 = multiMatchQueryBuilder67.text;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder71 = multiMatchQueryBuilder67.field("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) 10);
        java.lang.String[] strArray75 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder76 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray75);
        org.elasticsearch.index.query.Operator operator77 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder78 = multiMatchQueryBuilder76.operator(operator77);
        multiMatchQueryBuilder76.fuzzyRewrite = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder82 = multiMatchQueryBuilder76.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder84 = multiMatchQueryBuilder76.maxExpansions((int) (short) 10);
        java.lang.Object obj85 = multiMatchQueryBuilder84.text;
        boolean boolean86 = multiMatchQueryBuilder67.equals((java.lang.Object) multiMatchQueryBuilder84);
        multiMatchQueryBuilder67.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}";
        java.lang.String str89 = multiMatchQueryBuilder67.getrewrite();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap90 = multiMatchQueryBuilder67.fieldsBoosts;
        multiMatchQueryBuilder36.setfieldsBoosts(strObjectFloatHashMap90);
        multiMatchQueryBuilder4.setfieldsBoosts(strObjectFloatHashMap90);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(queryValidationException19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
// flaky:         org.junit.Assert.assertEquals("'" + str22 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"minimumShouldMatch\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"useDisMax\" : false,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}" + "'", str22, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"minimumShouldMatch\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"useDisMax\" : false,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNull(strObjectFloatHashMap32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertEquals("'" + obj37 + "' != '" + "multi_match" + "'", obj37, "multi_match");
        org.junit.Assert.assertNull(int38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
        org.junit.Assert.assertNull(float45);
        org.junit.Assert.assertNotNull(strArray49);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertNull(strObjectFloatHashMap55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder63);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder65);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder67);
        org.junit.Assert.assertEquals("'" + obj68 + "' != '" + "multi_match" + "'", obj68, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder71);
        org.junit.Assert.assertNotNull(strArray75);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder78);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder82);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder84);
        org.junit.Assert.assertEquals("'" + obj85 + "' != '" + "multi_match" + "'", obj85, "multi_match");
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNull(str89);
        org.junit.Assert.assertNotNull(strObjectFloatHashMap90);
    }

    @Test
    public void test13612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13612");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        float float12 = multiMatchQueryBuilder4.boost();
        org.elasticsearch.common.unit.Fuzziness fuzziness13 = multiMatchQueryBuilder4.fuzziness;
        multiMatchQueryBuilder4.setslop((java.lang.Integer) 100);
        java.lang.String[] strArray19 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray19);
        org.elasticsearch.index.query.Operator operator21 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.operator(operator21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException25 = multiMatchQueryBuilder20.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder20.cutoffFrequency((float) (byte) 100);
        java.lang.String str28 = multiMatchQueryBuilder20.getanalyzer();
        multiMatchQueryBuilder20.setuseDisMax((java.lang.Boolean) false);
        java.lang.String str31 = multiMatchQueryBuilder20.fuzzyRewrite;
        java.lang.Integer int32 = multiMatchQueryBuilder20.slop;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder20.boost((float) (short) 1);
        java.lang.String[] strArray38 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray38);
        org.elasticsearch.index.query.Operator operator40 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder39.operator(operator40);
        java.lang.Boolean boolean42 = multiMatchQueryBuilder39.getlenient();
        multiMatchQueryBuilder39.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder39.cutoffFrequency(0.0f);
        org.elasticsearch.common.unit.Fuzziness fuzziness47 = multiMatchQueryBuilder46.fuzziness;
        multiMatchQueryBuilder46.setcutoffFrequency((java.lang.Float) 10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder46.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray55 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray55);
        org.elasticsearch.index.query.Operator operator57 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = multiMatchQueryBuilder56.operator(operator57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder56.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder60.fuzziness((java.lang.Object) 10);
        multiMatchQueryBuilder60.setanalyzer("multi_match");
        org.elasticsearch.common.unit.Fuzziness fuzziness65 = multiMatchQueryBuilder60.getfuzziness();
        multiMatchQueryBuilder46.fuzziness = fuzziness65;
        multiMatchQueryBuilder34.setfuzziness(fuzziness65);
        multiMatchQueryBuilder4.fuzziness = fuzziness65;
        java.lang.Boolean boolean69 = multiMatchQueryBuilder4.getuseDisMax();
        multiMatchQueryBuilder4.setanalyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}^35.0\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzziness\" : \"FALSE\",\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 0.0\n  }\n}");
        java.lang.String str72 = multiMatchQueryBuilder4.getNAME();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNull(fuzziness13);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNull(queryValidationException25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(int32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNull(boolean42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
        org.junit.Assert.assertNull(fuzziness47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder58);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder60);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder62);
        org.junit.Assert.assertNotNull(fuzziness65);
        org.junit.Assert.assertNull(boolean69);
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "multi_match" + "'", str72, "multi_match");
    }

    @Test
    public void test13613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13613");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.Object obj12 = multiMatchQueryBuilder4.gettext();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.queryName("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"minimumShouldMatch\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"useDisMax\" : false,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str15 = multiMatchQueryBuilder14.fuzzyRewrite;
        org.elasticsearch.common.unit.Fuzziness fuzziness16 = multiMatchQueryBuilder14.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder14.maxExpansions((int) (byte) 10);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "multi_match" + "'", obj12, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(fuzziness16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
    }

    @Test
    public void test13614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13614");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.fuzzyRewrite("hi!");
        org.elasticsearch.common.unit.Fuzziness fuzziness16 = multiMatchQueryBuilder4.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.slop((int) (short) 0);
        java.lang.Boolean boolean19 = multiMatchQueryBuilder4.lenient;
        java.lang.String str20 = multiMatchQueryBuilder4.rewrite;
        java.lang.String str21 = multiMatchQueryBuilder4.minimumShouldMatch;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type22 = multiMatchQueryBuilder4.gettype();
        java.util.List<java.lang.String> strList23 = multiMatchQueryBuilder4.fields;
        java.util.List<java.lang.String> strList24 = multiMatchQueryBuilder4.fields;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNull(fuzziness16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNull(boolean19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(type22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test13615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13615");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap12 = multiMatchQueryBuilder11.getfieldsBoosts();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap13 = null;
        multiMatchQueryBuilder11.fieldsBoosts = strObjectFloatHashMap13;
        java.lang.Boolean boolean15 = multiMatchQueryBuilder11.getuseDisMax();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type16 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder11.settype(type16);
        multiMatchQueryBuilder11.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder11.setslop((java.lang.Integer) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder11.getPROTOTYPE();
        org.elasticsearch.index.query.QueryValidationException queryValidationException23 = multiMatchQueryBuilder11.validate();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(strObjectFloatHashMap12);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type16.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNull(queryValidationException23);
    }

    @Test
    public void test13616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13616");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        float float12 = multiMatchQueryBuilder4.boost();
        multiMatchQueryBuilder4.setanalyzer("");
        java.lang.Boolean boolean15 = multiMatchQueryBuilder4.getuseDisMax();
        java.lang.String str16 = multiMatchQueryBuilder4.analyzer;
        org.elasticsearch.common.unit.Fuzziness fuzziness17 = multiMatchQueryBuilder4.getfuzziness();
        multiMatchQueryBuilder4.lenient = false;
        float float20 = multiMatchQueryBuilder4.boost();
        multiMatchQueryBuilder4.minimumShouldMatch = "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}";
        multiMatchQueryBuilder4.slop = 100;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(fuzziness17);
        org.junit.Assert.assertTrue("'" + float20 + "' != '" + 1.0f + "'", float20 == 1.0f);
    }

    @Test
    public void test13617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13617");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        java.lang.Integer int10 = multiMatchQueryBuilder4.slop;
        multiMatchQueryBuilder4.prefixLength = 10;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.fuzzyRewrite("");
        multiMatchQueryBuilder4.setlenient((java.lang.Boolean) true);
        multiMatchQueryBuilder4.rewrite = "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"slop\" : 10,\n    \"maxExpansions\" : 1,\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"multi_match\\\",\\n    \\\"boost\\\" : 1.0,\\n    \\\"_name\\\" : \\\"multi_match\\\"\\n  }\\n}\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}";
        java.lang.String str19 = multiMatchQueryBuilder4.getName();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "multi_match" + "'", str19, "multi_match");
    }

    @Test
    public void test13618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13618");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        float float12 = multiMatchQueryBuilder4.boost();
        multiMatchQueryBuilder4.setanalyzer("");
        java.lang.Boolean boolean15 = multiMatchQueryBuilder4.getuseDisMax();
        multiMatchQueryBuilder4.setminimumShouldMatch("");
        java.lang.String str18 = multiMatchQueryBuilder4.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder4.tieBreaker((float) 100);
        java.lang.Boolean boolean21 = multiMatchQueryBuilder20.getlenient();
        java.lang.String str22 = multiMatchQueryBuilder20.getminimumShouldMatch();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap23 = multiMatchQueryBuilder20.fieldsBoosts;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder20.field("{\n  \"multiMatch\" : {\n    \"query\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 1.0\n  }\n}", (float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder20.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(strObjectFloatHashMap23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
    }

    @Test
    public void test13619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13619");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery12 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.zeroTermsQuery(zeroTermsQuery12);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder11.getPROTOTYPE();
        multiMatchQueryBuilder14.settieBreaker((java.lang.Float) 0.0f);
        multiMatchQueryBuilder14.lenient = false;
        org.elasticsearch.index.query.Operator operator19 = null;
        multiMatchQueryBuilder14.operator = operator19;
        multiMatchQueryBuilder14.cutoffFrequency = 1.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder14.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}^35.0\" ],\n    \"slop\" : 10,\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray28 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray28);
        org.elasticsearch.index.query.Operator operator30 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder29.operator(operator30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder29.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException34 = multiMatchQueryBuilder29.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder29.cutoffFrequency((float) (byte) 100);
        java.lang.String str37 = multiMatchQueryBuilder29.getanalyzer();
        multiMatchQueryBuilder29.setuseDisMax((java.lang.Boolean) false);
        java.lang.String str40 = multiMatchQueryBuilder29.fuzzyRewrite;
        java.lang.Integer int41 = multiMatchQueryBuilder29.slop;
        multiMatchQueryBuilder29.minimumShouldMatch = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}";
        org.elasticsearch.index.query.QueryValidationException queryValidationException44 = multiMatchQueryBuilder29.validate();
        org.elasticsearch.index.query.Operator operator45 = multiMatchQueryBuilder29.operator;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder29.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}", (float) 1L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = multiMatchQueryBuilder29.field("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"tieBreaker\" : -1.0,\n    \"cutoffFrequency\" : 1.0,\n    \"boost\" : 1.0\n  }\n}", (float) (short) 100);
        java.lang.Integer int52 = multiMatchQueryBuilder51.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder51.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"max_expansions\" : -1,\n    \"tie_breaker\" : 0.0,\n    \"cutoff_frequency\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap55 = multiMatchQueryBuilder54.getfieldsBoosts();
        multiMatchQueryBuilder24.setfieldsBoosts(strObjectFloatHashMap55);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNull(queryValidationException34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertNull(queryValidationException44);
        org.junit.Assert.assertNull(operator45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder51);
        org.junit.Assert.assertNull(int52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertNotNull(strObjectFloatHashMap55);
    }

    @Test
    public void test13620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13620");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.fuzzyRewrite("hi!");
        org.elasticsearch.common.unit.Fuzziness fuzziness16 = multiMatchQueryBuilder4.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.slop((int) (short) 0);
        multiMatchQueryBuilder4.setslop((java.lang.Integer) 100);
        java.lang.String[] strArray24 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray24);
        org.elasticsearch.index.query.Operator operator26 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.operator(operator26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder25.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException30 = multiMatchQueryBuilder25.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder25.cutoffFrequency((float) (byte) 100);
        float float33 = multiMatchQueryBuilder25.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type34 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type35 = type34.matchQueryType();
        multiMatchQueryBuilder25.settype(type34);
        multiMatchQueryBuilder4.type = type34;
        java.lang.String str38 = multiMatchQueryBuilder4.getrewrite();
        org.elasticsearch.index.query.Operator operator39 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder4.operator(operator39);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder4.getPROTOTYPE();
        multiMatchQueryBuilder41.rewrite = "{\n  \"multiMatch\" : {\n    \"query\" : {\n      \"multiMatch\" : {\n        \"query\" : \"multi_match\",\n        \"fields\" : [ \"multi_match\", \"hi!\" ],\n        \"slop\" : -1,\n        \"minimumShouldMatch\" : \"\",\n        \"fuzzyRewrite\" : \"hi!\",\n        \"boost\" : 1.0\n      }\n    },\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"multi_match\\\",\\n    \\\"cutoff_frequency\\\" : -1.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}";
        java.lang.Object obj44 = multiMatchQueryBuilder41.text;
        multiMatchQueryBuilder41.settieBreaker((java.lang.Float) 10.0f);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNull(fuzziness16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertNull(queryValidationException30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertTrue("'" + float33 + "' != '" + 1.0f + "'", float33 == 1.0f);
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS + "'", type34.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS));
        org.junit.Assert.assertTrue("'" + type35 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type35.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test13621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13621");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzziness((java.lang.Object) 10);
        multiMatchQueryBuilder8.setanalyzer("multi_match");
        org.elasticsearch.common.unit.Fuzziness fuzziness13 = null;
        multiMatchQueryBuilder8.setfuzziness(fuzziness13);
        multiMatchQueryBuilder8.setminimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}");
        multiMatchQueryBuilder8.cutoffFrequency = 100.0f;
        multiMatchQueryBuilder8.tieBreaker = 97.0f;
        java.lang.String str21 = multiMatchQueryBuilder8.queryName();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test13622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13622");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.String str7 = multiMatchQueryBuilder6.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type8 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type9 = type8.matchQueryType();
        float float10 = type8.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder6.type(type8);
        multiMatchQueryBuilder11.useDisMax = false;
        multiMatchQueryBuilder11.useDisMax = false;
        java.lang.String str16 = multiMatchQueryBuilder11.getNAME();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.prefixLength((int) 'a');
        multiMatchQueryBuilder11.setminimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multi_match" + "'", str7, "multi_match");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type8.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type9.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "multi_match" + "'", str16, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
    }

    @Test
    public void test13623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13623");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.fuzzyRewrite("hi!");
        multiMatchQueryBuilder4.analyzer = "hi!";
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery18 = null;
        multiMatchQueryBuilder4.zeroTermsQuery = zeroTermsQuery18;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder4.slop((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.prefixLength((-1));
        multiMatchQueryBuilder23.fuzzyRewrite = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}";
        multiMatchQueryBuilder23.cutoffFrequency = (-1.0f);
        org.elasticsearch.index.query.QueryValidationException queryValidationException28 = multiMatchQueryBuilder23.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder23.useDisMax(true);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNull(queryValidationException28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
    }

    @Test
    public void test13624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13624");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzziness((java.lang.Object) 10);
        java.lang.Boolean boolean11 = multiMatchQueryBuilder8.useDisMax;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.boost((float) (short) 10);
        java.util.List<java.lang.String> strList14 = multiMatchQueryBuilder13.fields;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(boolean11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(strList14);
    }

    @Test
    public void test13625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13625");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzziness((java.lang.Object) 10);
        multiMatchQueryBuilder8.setanalyzer("multi_match");
        org.elasticsearch.common.unit.Fuzziness fuzziness13 = null;
        multiMatchQueryBuilder8.setfuzziness(fuzziness13);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery15 = multiMatchQueryBuilder8.zeroTermsQuery;
        multiMatchQueryBuilder8.lenient = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder8.tieBreaker((float) (short) 100);
        multiMatchQueryBuilder19.setlenient((java.lang.Boolean) false);
        java.lang.String[] strArray25 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray25);
        org.elasticsearch.index.query.Operator operator27 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder26.operator(operator27);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder26.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException31 = multiMatchQueryBuilder26.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder26.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery34 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.zeroTermsQuery(zeroTermsQuery34);
        multiMatchQueryBuilder35.prefixLength = 10;
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap38 = multiMatchQueryBuilder35.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.cutoffFrequency((float) (short) 0);
        java.lang.String[] strArray44 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray44);
        org.elasticsearch.index.query.Operator operator46 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.operator(operator46);
        java.lang.Boolean boolean48 = multiMatchQueryBuilder45.getlenient();
        java.lang.Integer int49 = multiMatchQueryBuilder45.getmaxExpansions();
        multiMatchQueryBuilder45.useDisMax = false;
        java.lang.Integer int52 = multiMatchQueryBuilder45.slop;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder45.tieBreaker(0.0f);
        multiMatchQueryBuilder54.lenient = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type57 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.common.ParseField parseField58 = type57.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type59 = type57.matchQueryType();
        float float60 = type57.tieBreaker();
        multiMatchQueryBuilder54.settype(type57);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder62 = multiMatchQueryBuilder35.type(type57);
        float float63 = type57.tieBreaker();
        multiMatchQueryBuilder19.type = type57;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder19.maxExpansions(10);
        java.util.List<java.lang.String> strList67 = multiMatchQueryBuilder66.getfields();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(zeroTermsQuery15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNull(queryValidationException31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNull(strObjectFloatHashMap38);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNull(boolean48);
        org.junit.Assert.assertNull(int49);
        org.junit.Assert.assertNull(int52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertTrue("'" + type57 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type57.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(parseField58);
        org.junit.Assert.assertTrue("'" + type59 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type59.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float60 + "' != '" + 1.0f + "'", float60 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder62);
        org.junit.Assert.assertTrue("'" + float63 + "' != '" + 1.0f + "'", float63 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder66);
        org.junit.Assert.assertNotNull(strList67);
    }

    @Test
    public void test13626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13626");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.fuzzyRewrite("hi!");
        multiMatchQueryBuilder4.analyzer = "hi!";
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery18 = null;
        multiMatchQueryBuilder4.zeroTermsQuery = zeroTermsQuery18;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder4.slop((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.prefixLength((-1));
        multiMatchQueryBuilder23.fuzzyRewrite = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}";
        org.elasticsearch.index.query.Operator operator26 = null;
        multiMatchQueryBuilder23.operator = operator26;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder23.field("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}", (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder23.tieBreaker((float) (byte) 100);
        multiMatchQueryBuilder32.analyzer = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"analyzer\" : \"\",\n    \"fuzziness\" : \"BEST_FIELDS\",\n    \"cutoff_frequency\" : -1.0,\n    \"boost\" : 1.0\n  }\n}";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder32.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 1.0\\n  }\\n}^0.0\" ],\n    \"analyzer\" : \"\",\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder32.minimumShouldMatch = "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"prefixLength\" : 100,\n    \"maxExpansions\" : 100,\n    \"rewrite\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"cutoffFrequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"tieBreaker\" : -1.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
    }

    @Test
    public void test13627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13627");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.zeroTermsQuery(zeroTermsQuery13);
        multiMatchQueryBuilder4.cutoffFrequency = 100.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.rewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.useDisMax(false);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery21 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.zeroTermsQuery(zeroTermsQuery21);
        java.lang.String str23 = multiMatchQueryBuilder22.getName();
        multiMatchQueryBuilder22.slop = 0;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "multi_match" + "'", str23, "multi_match");
    }

    @Test
    public void test13628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13628");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery10 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.lenient(false);
        java.lang.Object obj14 = multiMatchQueryBuilder13.gettext();
        java.lang.Integer int15 = multiMatchQueryBuilder13.getslop();
        multiMatchQueryBuilder13.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder13.rewrite = "multi_match";
        java.lang.Integer int20 = multiMatchQueryBuilder13.maxExpansions;
        multiMatchQueryBuilder13.slop = 10;
        multiMatchQueryBuilder13.setslop((java.lang.Integer) (-1));
        java.lang.Integer int25 = multiMatchQueryBuilder13.getprefixLength();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertEquals("'" + obj14 + "' != '" + "multi_match" + "'", obj14, "multi_match");
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNull(int20);
        org.junit.Assert.assertNull(int25);
    }

    @Test
    public void test13629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13629");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder4.tieBreaker((float) (-1));
        multiMatchQueryBuilder4.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type18 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.common.ParseField parseField19 = type18.parseField();
        org.elasticsearch.common.ParseField parseField20 = type18.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.type(type18);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder21.setmaxExpansions((java.lang.Integer) 32);
        org.elasticsearch.index.query.Operator operator26 = null;
        multiMatchQueryBuilder21.operator = operator26;
        org.elasticsearch.common.io.stream.StreamInput streamInput28 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder21.readFrom(streamInput28);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS + "'", type18.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS));
        org.junit.Assert.assertNotNull(parseField19);
        org.junit.Assert.assertNotNull(parseField20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
    }

    @Test
    public void test13630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13630");
        org.elasticsearch.common.xcontent.XContentBuilder.FieldCaseConversion fieldCaseConversion0 = org.elasticsearch.common.xcontent.XContentBuilder.FieldCaseConversion.NONE;
        java.lang.Class<?> wildcardClass1 = fieldCaseConversion0.getClass();
        java.lang.String[] strArray5 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray5);
        org.elasticsearch.index.query.Operator operator7 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder6.operator(operator7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder6.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException11 = multiMatchQueryBuilder6.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder6.cutoffFrequency((float) (byte) 100);
        java.lang.String str14 = multiMatchQueryBuilder6.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder6.queryName("");
        org.elasticsearch.common.unit.Fuzziness fuzziness17 = multiMatchQueryBuilder6.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder6.getPROTOTYPE();
        java.lang.String[] strArray22 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) multiMatchQueryBuilder18, strArray22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) wildcardClass1, strArray22);
        java.lang.Float float26 = multiMatchQueryBuilder25.getcutoffFrequency();
        multiMatchQueryBuilder25.setuseDisMax((java.lang.Boolean) false);
        org.elasticsearch.index.query.Operator operator29 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder25.operator(operator29);
        java.lang.Object obj31 = multiMatchQueryBuilder25.text;
        java.lang.String str32 = multiMatchQueryBuilder25.queryName();
        org.junit.Assert.assertTrue("'" + fieldCaseConversion0 + "' != '" + org.elasticsearch.common.xcontent.XContentBuilder.FieldCaseConversion.NONE + "'", fieldCaseConversion0.equals(org.elasticsearch.common.xcontent.XContentBuilder.FieldCaseConversion.NONE));
        org.junit.Assert.assertNotNull(wildcardClass1);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(queryValidationException11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNull(fuzziness17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNull(float26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(obj31);
        org.junit.Assert.assertEquals(obj31.toString(), "class org.elasticsearch.common.xcontent.XContentBuilder$FieldCaseConversion");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj31), "class org.elasticsearch.common.xcontent.XContentBuilder$FieldCaseConversion");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj31), "class org.elasticsearch.common.xcontent.XContentBuilder$FieldCaseConversion");
        org.junit.Assert.assertNull(str32);
    }

    @Test
    public void test13631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13631");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery12 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.zeroTermsQuery(zeroTermsQuery12);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.maxExpansions((-1));
        java.util.List<java.lang.String> strList16 = multiMatchQueryBuilder11.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = org.elasticsearch.index.query.MultiMatchQueryBuilder.PROTOTYPE;
        java.lang.Object obj18 = multiMatchQueryBuilder17.text;
        java.lang.String[] strArray22 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray22);
        org.elasticsearch.index.query.Operator operator24 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.operator(operator24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder23.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException28 = multiMatchQueryBuilder23.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder23.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder23.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder23.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type35 = multiMatchQueryBuilder23.type;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type36 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.common.ParseField parseField37 = type36.parseField();
        multiMatchQueryBuilder23.type = type36;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder17.type(type36);
        org.elasticsearch.index.search.MatchQuery.Type type40 = type36.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder11.type(type36);
        org.elasticsearch.common.ParseField parseField42 = type36.parseField();
        org.elasticsearch.index.search.MatchQuery.Type type43 = type36.matchQueryType();
        org.elasticsearch.index.search.MatchQuery.Type type44 = type36.matchQueryType();
        float float45 = type36.tieBreaker();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNull(obj18);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(queryValidationException28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNull(type35);
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type36.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(parseField37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertTrue("'" + type40 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type40.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(parseField42);
        org.junit.Assert.assertTrue("'" + type43 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type43.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + type44 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type44.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 1.0f + "'", float45 == 1.0f);
    }

    @Test
    public void test13632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13632");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        float float12 = multiMatchQueryBuilder4.boost();
        multiMatchQueryBuilder4.setanalyzer("");
        java.lang.Boolean boolean15 = multiMatchQueryBuilder4.getuseDisMax();
        multiMatchQueryBuilder4.setminimumShouldMatch("");
        java.lang.Integer int18 = multiMatchQueryBuilder4.getmaxExpansions();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test13633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13633");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        multiMatchQueryBuilder4.operator = operator5;
        java.lang.String str7 = multiMatchQueryBuilder4.rewrite;
        org.elasticsearch.index.query.Operator operator8 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder4.operator(operator8);
        java.lang.Float float10 = multiMatchQueryBuilder9.tieBreaker;
        java.lang.String str11 = multiMatchQueryBuilder9.getminimumShouldMatch();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNull(float10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13634");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder4.tieBreaker((float) (-1));
        multiMatchQueryBuilder4.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.useDisMax(true);
        multiMatchQueryBuilder17.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray23 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray23);
        org.elasticsearch.index.query.Operator operator25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.operator(operator25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException29 = multiMatchQueryBuilder24.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder24.cutoffFrequency((float) (byte) 100);
        float float32 = multiMatchQueryBuilder24.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type33 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type34 = type33.matchQueryType();
        multiMatchQueryBuilder24.settype(type33);
        org.elasticsearch.index.search.MatchQuery.Type type36 = type33.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder17.type(type33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder17.lenient(false);
        multiMatchQueryBuilder39.slop = 1;
        java.lang.String str42 = multiMatchQueryBuilder39.getminimumShouldMatch();
        java.util.List<java.lang.String> strList43 = multiMatchQueryBuilder39.getfields();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNull(queryValidationException29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 1.0f + "'", float32 == 1.0f);
        org.junit.Assert.assertTrue("'" + type33 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS + "'", type33.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.CROSS_FIELDS));
        org.junit.Assert.assertTrue("'" + type34 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type34.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type36.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test13635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13635");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.String str7 = multiMatchQueryBuilder6.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type8 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type9 = type8.matchQueryType();
        float float10 = type8.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder6.type(type8);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery12 = multiMatchQueryBuilder11.zeroTermsQuery;
        java.lang.Boolean boolean13 = multiMatchQueryBuilder11.useDisMax;
        java.lang.String str14 = multiMatchQueryBuilder11.rewrite;
        multiMatchQueryBuilder11.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        java.lang.Float float17 = multiMatchQueryBuilder11.gettieBreaker();
        org.elasticsearch.index.query.Operator operator18 = null;
        multiMatchQueryBuilder11.operator = operator18;
        java.lang.String str20 = multiMatchQueryBuilder11.analyzer;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multi_match" + "'", str7, "multi_match");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type8.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type9.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(zeroTermsQuery12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(float17);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test13636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13636");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        multiMatchQueryBuilder4.minimumShouldMatch = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.lenient(true);
        java.lang.String str13 = multiMatchQueryBuilder12.toString();
        java.lang.String str14 = multiMatchQueryBuilder12.getfuzzyRewrite();
        java.lang.String[] strArray18 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray18);
        org.elasticsearch.index.query.Operator operator20 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.operator(operator20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.field("");
        multiMatchQueryBuilder19.minimumShouldMatch = "hi!";
        java.lang.Float float26 = multiMatchQueryBuilder19.tieBreaker;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type27 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type28 = type27.matchQueryType();
        float float29 = type27.tieBreaker();
        multiMatchQueryBuilder19.type = type27;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder12.type(type27);
        multiMatchQueryBuilder31.setminimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator34 = null;
        multiMatchQueryBuilder31.operator = operator34;
        multiMatchQueryBuilder31.tieBreaker = (-1.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder31.prefixLength((int) '4');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = multiMatchQueryBuilder31.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"slop\" : 10,\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"multi_match\\\",\\n    \\\"boost\\\" : 1.0,\\n    \\\"_name\\\" : \\\"multi_match\\\"\\n  }\\n}\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.maxExpansions(35);
        java.lang.Boolean boolean44 = multiMatchQueryBuilder41.useDisMax;
        multiMatchQueryBuilder41.setanalyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"type\" : \"best_fields\",\n    \"analyzer\" : \"multi_match\",\n    \"minimumShouldMatch\" : \"hi!\",\n    \"fuzzyRewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}" + "'", str13, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNull(float26);
        org.junit.Assert.assertTrue("'" + type27 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type27.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type28 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type28.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder41);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNull(boolean44);
    }

    @Test
    public void test13637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13637");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.fuzzyRewrite("hi!");
        org.elasticsearch.common.unit.Fuzziness fuzziness16 = multiMatchQueryBuilder4.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.slop((int) (short) 0);
        java.lang.String str19 = multiMatchQueryBuilder18.toString();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery20 = null;
        multiMatchQueryBuilder18.zeroTermsQuery = zeroTermsQuery20;
        multiMatchQueryBuilder18.setprefixLength((java.lang.Integer) 100);
        org.elasticsearch.common.unit.Fuzziness fuzziness24 = multiMatchQueryBuilder18.getfuzziness();
        multiMatchQueryBuilder18.slop = 97;
        org.elasticsearch.index.query.Operator operator27 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder18.operator(operator27);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNull(fuzziness16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}" + "'", str19, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNull(fuzziness24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
    }

    @Test
    public void test13638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13638");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        java.lang.Integer int10 = multiMatchQueryBuilder4.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery11 = multiMatchQueryBuilder4.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.boost((float) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder4.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.Boolean boolean21 = multiMatchQueryBuilder20.useDisMax;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder20.boost((float) 1);
        java.lang.Boolean boolean24 = multiMatchQueryBuilder23.getlenient();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type25 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type26 = type25.matchQueryType();
        float float27 = type25.tieBreaker();
        float float28 = type25.tieBreaker();
        float float29 = type25.tieBreaker();
        org.elasticsearch.common.ParseField parseField30 = type25.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder23.type(type25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder31.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder31.setlenient((java.lang.Boolean) true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder31.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"maxExpansions\" : 100,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder37.rewrite = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"slop\" : 1,\n    \"max_expansions\" : 10,\n    \"rewrite\" : \"\",\n    \"boost\" : 1.0\n  }\n}";
        java.lang.Float float40 = multiMatchQueryBuilder37.tieBreaker;
        java.lang.Integer int41 = multiMatchQueryBuilder37.getslop();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type42 = multiMatchQueryBuilder37.gettype();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(zeroTermsQuery11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNull(boolean21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNull(boolean24);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type25.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type26 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type26.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 0.0f + "'", float27 == 0.0f);
        org.junit.Assert.assertTrue("'" + float28 + "' != '" + 0.0f + "'", float28 == 0.0f);
        org.junit.Assert.assertTrue("'" + float29 + "' != '" + 0.0f + "'", float29 == 0.0f);
        org.junit.Assert.assertNotNull(parseField30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNull(float40);
        org.junit.Assert.assertNull(int41);
        org.junit.Assert.assertTrue("'" + type42 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type42.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
    }

    @Test
    public void test13639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13639");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.queryName("");
        org.elasticsearch.common.unit.Fuzziness fuzziness15 = multiMatchQueryBuilder4.getfuzziness();
        org.elasticsearch.common.unit.Fuzziness fuzziness16 = null;
        multiMatchQueryBuilder4.fuzziness = fuzziness16;
        java.lang.Integer int18 = multiMatchQueryBuilder4.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery19 = multiMatchQueryBuilder4.zeroTermsQuery;
        org.elasticsearch.common.unit.Fuzziness fuzziness20 = multiMatchQueryBuilder4.getfuzziness();
        java.lang.String str21 = multiMatchQueryBuilder4.getName();
        multiMatchQueryBuilder4.setlenient((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNull(fuzziness15);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(zeroTermsQuery19);
        org.junit.Assert.assertNull(fuzziness20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "multi_match" + "'", str21, "multi_match");
    }

    @Test
    public void test13640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13640");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.minimumShouldMatch("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("multi_match");
        java.lang.String str14 = multiMatchQueryBuilder11.toString();
        java.util.List<java.lang.String> strList15 = multiMatchQueryBuilder11.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder11.field("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0,\n    \"Name\" : \"multi_match\"\n  }\n}" + "'", str14, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0,\n    \"Name\" : \"multi_match\"\n  }\n}");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
    }

    @Test
    public void test13641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13641");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        multiMatchQueryBuilder4.minimumShouldMatch = "hi!";
        java.lang.Float float11 = multiMatchQueryBuilder4.tieBreaker;
        java.lang.Object obj12 = multiMatchQueryBuilder4.text;
        java.lang.Float float13 = multiMatchQueryBuilder4.getcutoffFrequency();
        multiMatchQueryBuilder4.prefixLength = 100;
        multiMatchQueryBuilder4.setlenient((java.lang.Boolean) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder4.slop((int) 'a');
        multiMatchQueryBuilder19.slop = 1;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery22 = null;
        multiMatchQueryBuilder19.setzeroTermsQuery(zeroTermsQuery22);
        multiMatchQueryBuilder19.setprefixLength((java.lang.Integer) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(float11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "multi_match" + "'", obj12, "multi_match");
        org.junit.Assert.assertNull(float13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
    }

    @Test
    public void test13642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13642");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery10 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery10);
        multiMatchQueryBuilder8.setanalyzer("hi!");
        java.lang.Integer int14 = multiMatchQueryBuilder8.getprefixLength();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder8.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder16.getPROTOTYPE();
        org.elasticsearch.common.io.stream.StreamInput streamInput18 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder16.readFrom(streamInput18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(int14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
    }

    @Test
    public void test13643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13643");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.minimumShouldMatch("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.minimumShouldMatch("multi_match");
        org.elasticsearch.index.query.Operator operator16 = multiMatchQueryBuilder15.operator;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type17 = multiMatchQueryBuilder15.gettype();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder15.boost(0.0f);
        java.lang.String str20 = multiMatchQueryBuilder15.fuzzyRewrite;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNull(operator16);
        org.junit.Assert.assertNull(type17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test13644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13644");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        java.lang.Integer int10 = multiMatchQueryBuilder4.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery11 = multiMatchQueryBuilder4.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.boost((float) 0);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery19 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.zeroTermsQuery(zeroTermsQuery19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.boost((float) 52);
        multiMatchQueryBuilder22.useDisMax = true;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(zeroTermsQuery11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
    }

    @Test
    public void test13645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13645");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        java.lang.Object obj5 = multiMatchQueryBuilder4.text;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = multiMatchQueryBuilder4.tieBreaker((float) (byte) 10);
        java.lang.String str8 = multiMatchQueryBuilder4.minimumShouldMatch;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"slop\" : 10,\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"multi_match\\\",\\n    \\\"boost\\\" : 1.0,\\n    \\\"_name\\\" : \\\"multi_match\\\"\\n  }\\n}\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder11 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params12 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder13 = multiMatchQueryBuilder4.toXContent(xContentBuilder11, params12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + obj5 + "' != '" + "multi_match" + "'", obj5, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(params12);
    }

    @Test
    public void test13646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13646");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        org.elasticsearch.common.unit.Fuzziness fuzziness8 = multiMatchQueryBuilder4.getfuzziness();
        java.lang.String str9 = multiMatchQueryBuilder4.getWriteableName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder4.tieBreaker((float) (byte) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.field("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 0.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.elasticsearch.index.query.Operator operator16 = multiMatchQueryBuilder4.getoperator();
        java.lang.String[] strArray20 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray20);
        org.elasticsearch.index.query.Operator operator22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.operator(operator22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.field("");
        multiMatchQueryBuilder21.minimumShouldMatch = "hi!";
        java.lang.Float float28 = multiMatchQueryBuilder21.tieBreaker;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type29 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type30 = type29.matchQueryType();
        float float31 = type29.tieBreaker();
        multiMatchQueryBuilder21.type = type29;
        multiMatchQueryBuilder21.fuzzyRewrite = "multi_match";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder21.maxExpansions(100);
        java.lang.String[] strArray40 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder41 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray40);
        org.elasticsearch.index.query.Operator operator42 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder41.operator(operator42);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder41.field("");
        org.elasticsearch.index.query.Operator operator46 = null;
        multiMatchQueryBuilder41.setoperator(operator46);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery48 = null;
        multiMatchQueryBuilder41.zeroTermsQuery = zeroTermsQuery48;
        multiMatchQueryBuilder41.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder41.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder21.fuzziness((java.lang.Object) multiMatchQueryBuilder41);
        multiMatchQueryBuilder54.maxExpansions = 0;
        java.lang.Boolean boolean57 = multiMatchQueryBuilder54.lenient;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder54.tieBreaker((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder61 = multiMatchQueryBuilder59.useDisMax(true);
        boolean boolean62 = multiMatchQueryBuilder4.equals((java.lang.Object) multiMatchQueryBuilder61);
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder4.cutoffFrequency((float) (short) -1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(fuzziness8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "multi_match" + "'", str9, "multi_match");
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNull(operator16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNull(float28);
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type29.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type30.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertNull(boolean57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder66);
    }

    @Test
    public void test13647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13647");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.String str7 = multiMatchQueryBuilder6.getminimumShouldMatch();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery8 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder6.zeroTermsQuery(zeroTermsQuery8);
        multiMatchQueryBuilder9.analyzer = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0,\n    \"_name\" : \"multi_match\"\n  }\n}";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder9.tieBreaker((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder9.boost((float) 32);
        java.lang.String str16 = multiMatchQueryBuilder9.getrewrite();
        java.lang.String str17 = multiMatchQueryBuilder9.getNAME();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "multi_match" + "'", str17, "multi_match");
    }

    @Test
    public void test13648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13648");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        multiMatchQueryBuilder4.minimumShouldMatch = "hi!";
        java.lang.Float float11 = multiMatchQueryBuilder4.tieBreaker;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type12 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type13 = type12.matchQueryType();
        float float14 = type12.tieBreaker();
        multiMatchQueryBuilder4.type = type12;
        multiMatchQueryBuilder4.fuzzyRewrite = "multi_match";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder4.maxExpansions(100);
        java.lang.String[] strArray23 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray23);
        org.elasticsearch.index.query.Operator operator25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.operator(operator25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.field("");
        org.elasticsearch.index.query.Operator operator29 = null;
        multiMatchQueryBuilder24.setoperator(operator29);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery31 = null;
        multiMatchQueryBuilder24.zeroTermsQuery = zeroTermsQuery31;
        multiMatchQueryBuilder24.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder24.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) multiMatchQueryBuilder24);
        multiMatchQueryBuilder37.maxExpansions = 0;
        java.lang.Boolean boolean40 = multiMatchQueryBuilder37.lenient;
        java.lang.String[] strArray44 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray44);
        org.elasticsearch.index.query.Operator operator46 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.operator(operator46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder45.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap50 = multiMatchQueryBuilder49.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = multiMatchQueryBuilder49.minimumShouldMatch("multi_match");
        java.lang.String str53 = multiMatchQueryBuilder52.toString();
        java.lang.String[] strArray57 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder58 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray57);
        org.elasticsearch.index.query.Operator operator59 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder60 = multiMatchQueryBuilder58.operator(operator59);
        java.lang.String str61 = multiMatchQueryBuilder58.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness62 = multiMatchQueryBuilder58.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder64 = multiMatchQueryBuilder58.tieBreaker((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = multiMatchQueryBuilder64.cutoffFrequency((float) '4');
        boolean boolean67 = multiMatchQueryBuilder52.equals((java.lang.Object) multiMatchQueryBuilder64);
        multiMatchQueryBuilder64.setmaxExpansions((java.lang.Integer) (-1));
        multiMatchQueryBuilder64.setprefixLength((java.lang.Integer) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder72 = multiMatchQueryBuilder37.fuzziness((java.lang.Object) multiMatchQueryBuilder64);
        org.elasticsearch.index.query.Operator operator73 = null;
        multiMatchQueryBuilder37.operator = operator73;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder77 = multiMatchQueryBuilder37.field("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"maxExpansions\" : 100,\n    \"boost\" : 1.0\n  }\n}", (float) 'a');
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery78 = null;
        multiMatchQueryBuilder37.setzeroTermsQuery(zeroTermsQuery78);
        float float80 = multiMatchQueryBuilder37.boost();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder81 = multiMatchQueryBuilder37.getPROTOTYPE();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(float11);
        org.junit.Assert.assertTrue("'" + type12 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type12.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type13 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type13.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float14 + "' != '" + 0.0f + "'", float14 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNull(boolean40);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNull(strObjectFloatHashMap50);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder52);
// flaky:         org.junit.Assert.assertEquals("'" + str53 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}" + "'", str53, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "multi_match" + "'", str61, "multi_match");
        org.junit.Assert.assertNull(fuzziness62);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder64);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder72);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder77);
        org.junit.Assert.assertTrue("'" + float80 + "' != '" + 1.0f + "'", float80 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder81);
    }

    @Test
    public void test13649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13649");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.fuzzyRewrite("hi!");
        org.elasticsearch.common.unit.Fuzziness fuzziness16 = multiMatchQueryBuilder4.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type17 = multiMatchQueryBuilder4.gettype();
        java.lang.Integer int18 = multiMatchQueryBuilder4.slop;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder4.rewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"10\",\n    \"boost\" : 10.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder4.boost((float) 10L);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery23 = multiMatchQueryBuilder22.zeroTermsQuery;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNull(fuzziness16);
        org.junit.Assert.assertNull(type17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNull(zeroTermsQuery23);
    }

    @Test
    public void test13650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13650");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder4.tieBreaker((float) (-1));
        multiMatchQueryBuilder4.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.useDisMax(true);
        multiMatchQueryBuilder17.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray23 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray23);
        org.elasticsearch.index.query.Operator operator25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.operator(operator25);
        java.lang.String str27 = multiMatchQueryBuilder24.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness28 = multiMatchQueryBuilder24.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.tieBreaker((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type31 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder24.settype(type31);
        multiMatchQueryBuilder17.settype(type31);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery34 = multiMatchQueryBuilder17.zeroTermsQuery;
        java.lang.String str35 = multiMatchQueryBuilder17.getName();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery36 = null;
        multiMatchQueryBuilder17.zeroTermsQuery = zeroTermsQuery36;
        java.util.List<java.lang.String> strList38 = multiMatchQueryBuilder17.getfields();
        multiMatchQueryBuilder17.tieBreaker = (-1.0f);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "multi_match" + "'", str27, "multi_match");
        org.junit.Assert.assertNull(fuzziness28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type31.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNull(zeroTermsQuery34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "multi_match" + "'", str35, "multi_match");
        org.junit.Assert.assertNotNull(strList38);
    }

    @Test
    public void test13651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13651");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.queryName("");
        org.elasticsearch.common.unit.Fuzziness fuzziness15 = multiMatchQueryBuilder4.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.getPROTOTYPE();
        java.lang.String[] strArray20 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray20);
        org.elasticsearch.index.query.Operator operator22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.operator(operator22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap26 = multiMatchQueryBuilder25.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery27 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder25.zeroTermsQuery(zeroTermsQuery27);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder25.lenient(false);
        multiMatchQueryBuilder25.setmaxExpansions((java.lang.Integer) 1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery33 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder25.zeroTermsQuery(zeroTermsQuery33);
        multiMatchQueryBuilder25.tieBreaker = 10.0f;
        java.util.List<java.lang.String> strList37 = multiMatchQueryBuilder25.getfields();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder25.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"10\",\n    \"minimum_should_match\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"hi!\",\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 10.0\n  }\n}", (float) 0L);
        java.lang.String[] strArray44 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray44);
        org.elasticsearch.index.query.Operator operator46 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = multiMatchQueryBuilder45.operator(operator46);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = multiMatchQueryBuilder45.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException50 = multiMatchQueryBuilder45.validate();
        java.lang.Integer int51 = multiMatchQueryBuilder45.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery52 = multiMatchQueryBuilder45.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder55 = multiMatchQueryBuilder45.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        multiMatchQueryBuilder45.maxExpansions = 100;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery58 = multiMatchQueryBuilder45.getzeroTermsQuery();
        java.lang.Boolean boolean59 = multiMatchQueryBuilder45.useDisMax;
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap60 = multiMatchQueryBuilder45.fieldsBoosts;
        multiMatchQueryBuilder40.setfieldsBoosts(strObjectFloatHashMap60);
        multiMatchQueryBuilder40.setfuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"prefixLength\" : 10,\n    \"maxExpansions\" : -1,\n    \"tieBreaker\" : 0.0,\n    \"cutoffFrequency\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.Boolean boolean64 = multiMatchQueryBuilder40.getuseDisMax();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder65 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) multiMatchQueryBuilder40);
        java.lang.String str66 = multiMatchQueryBuilder4.getWriteableName();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNull(fuzziness15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNull(strObjectFloatHashMap26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertNotNull(strArray44);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder47);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder49);
        org.junit.Assert.assertNull(queryValidationException50);
        org.junit.Assert.assertNull(int51);
        org.junit.Assert.assertNull(zeroTermsQuery52);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder55);
        org.junit.Assert.assertNull(zeroTermsQuery58);
        org.junit.Assert.assertNull(boolean59);
        org.junit.Assert.assertNotNull(strObjectFloatHashMap60);
        org.junit.Assert.assertNull(boolean64);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "multi_match" + "'", str66, "multi_match");
    }

    @Test
    public void test13652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13652");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.minimumShouldMatch("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder11.queryName("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.minimumShouldMatch("multi_match");
        java.lang.Float float16 = multiMatchQueryBuilder15.cutoffFrequency;
        multiMatchQueryBuilder15.analyzer = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}";
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery19 = null;
        multiMatchQueryBuilder15.zeroTermsQuery = zeroTermsQuery19;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder15.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 1,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.Operator operator23 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder22.operator(operator23);
        java.lang.Float float25 = multiMatchQueryBuilder22.tieBreaker;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNull(float16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNull(float25);
    }

    @Test
    public void test13653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13653");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder0 = org.elasticsearch.index.query.MultiMatchQueryBuilder.PROTOTYPE;
        java.lang.String str1 = multiMatchQueryBuilder0.getminimumShouldMatch();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery2 = multiMatchQueryBuilder0.zeroTermsQuery;
        multiMatchQueryBuilder0.setuseDisMax((java.lang.Boolean) false);
        java.lang.Boolean boolean5 = multiMatchQueryBuilder0.getuseDisMax();
        java.lang.Boolean boolean6 = multiMatchQueryBuilder0.getuseDisMax();
        org.elasticsearch.common.unit.Fuzziness fuzziness7 = multiMatchQueryBuilder0.getfuzziness();
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder0);
// flaky:         org.junit.Assert.assertEquals("'" + str1 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}" + "'", str1, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNull(zeroTermsQuery2);
        org.junit.Assert.assertEquals("'" + boolean5 + "' != '" + false + "'", boolean5, false);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
// flaky:         org.junit.Assert.assertNotNull(fuzziness7);
    }

    @Test
    public void test13654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13654");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        java.lang.String str8 = multiMatchQueryBuilder4.getfuzzyRewrite();
        multiMatchQueryBuilder4.lenient = true;
        java.lang.String str11 = multiMatchQueryBuilder4.analyzer;
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder4.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"slop\" : -1,\n    \"maxExpansions\" : 100,\n    \"useDisMax\" : true,\n    \"cutoffFrequency\" : 52.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder4.slop = 1;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type17 = multiMatchQueryBuilder4.type;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(fuzziness12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNull(type17);
    }

    @Test
    public void test13655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13655");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        java.lang.String str14 = multiMatchQueryBuilder4.getrewrite();
        multiMatchQueryBuilder4.setlenient((java.lang.Boolean) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.cutoffFrequency((float) (short) 100);
        java.lang.Object obj19 = multiMatchQueryBuilder18.gettext();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type20 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type21 = type20.matchQueryType();
        float float22 = type20.tieBreaker();
        org.elasticsearch.common.ParseField parseField23 = type20.parseField();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder18.type(type20);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertEquals("'" + obj19 + "' != '" + "multi_match" + "'", obj19, "multi_match");
        org.junit.Assert.assertTrue("'" + type20 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type20.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type21.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float22 + "' != '" + 0.0f + "'", float22 == 0.0f);
        org.junit.Assert.assertNotNull(parseField23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
    }

    @Test
    public void test13656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13656");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.fuzzyRewrite("hi!");
        multiMatchQueryBuilder4.analyzer = "hi!";
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery18 = null;
        multiMatchQueryBuilder4.zeroTermsQuery = zeroTermsQuery18;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder4.slop((int) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.prefixLength((-1));
        multiMatchQueryBuilder23.fuzzyRewrite = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}";
        multiMatchQueryBuilder23.cutoffFrequency = (-1.0f);
        org.elasticsearch.index.query.QueryValidationException queryValidationException28 = multiMatchQueryBuilder23.validate();
        org.elasticsearch.index.query.Operator operator29 = null;
        multiMatchQueryBuilder23.operator = operator29;
        java.lang.Boolean boolean31 = multiMatchQueryBuilder23.getlenient();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder23.boost((float) 0L);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNull(queryValidationException28);
        org.junit.Assert.assertNull(boolean31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
    }

    @Test
    public void test13657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13657");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        float float12 = multiMatchQueryBuilder4.boost();
        multiMatchQueryBuilder4.setanalyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.rewrite("multi_match");
        java.lang.String str17 = multiMatchQueryBuilder16.getfuzzyRewrite();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap18 = null;
        multiMatchQueryBuilder16.fieldsBoosts = strObjectFloatHashMap18;
        java.util.List<java.lang.String> strList20 = multiMatchQueryBuilder16.getfields();
        java.lang.String str21 = multiMatchQueryBuilder16.minimumShouldMatch;
        java.lang.Integer int22 = multiMatchQueryBuilder16.maxExpansions;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(int22);
    }

    @Test
    public void test13658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13658");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setfuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type10 = multiMatchQueryBuilder4.gettype();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder4.cutoffFrequency = 100.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.fuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"fuzziness\" : \"{\\n  \\\"MULTI_MATCH\\\" : {\\n    \\\"QUERY\\\" : \\\"MULTI_MATCH\\\",\\n    \\\"FIELDS\\\" : [ \\\"MULTI_MATCH\\\", \\\"HI!\\\" ],\\n    \\\"ANALYZER\\\" : \\\"{\\\\N  \\\\\\\"MULTI_MATCH\\\\\\\" : {\\\\N    \\\\\\\"QUERY\\\\\\\" : \\\\\\\"MULTI_MATCH\\\\\\\",\\\\N    \\\\\\\"FIELDS\\\\\\\" : [ \\\\\\\"MULTI_MATCH\\\\\\\", \\\\\\\"HI!\\\\\\\", \\\\\\\"\\\\\\\" ],\\\\N    \\\\\\\"SLOP\\\\\\\" : 0,\\\\N    \\\\\\\"FUZZY_REWRITE\\\\\\\" : \\\\\\\"HI!\\\\\\\",\\\\N    \\\\\\\"TIE_BREAKER\\\\\\\" : 100.0,\\\\N    \\\\\\\"CUTOFF_FREQUENCY\\\\\\\" : 100.0,\\\\N    \\\\\\\"BOOST\\\\\\\" : 1.0\\\\N  }\\\\N}\\\",\\n    \\\"MAX_EXPANSIONS\\\" : 100,\\n    \\\"USE_DIS_MAX\\\" : TRUE,\\n    \\\"TIE_BREAKER\\\" : -1.0,\\n    \\\"CUTOFF_FREQUENCY\\\" : 0.0,\\n    \\\"BOOST\\\" : 1.0\\n  }\\n}\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"maxExpansions\" : 1,\n    \"minimumShouldMatch\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"useDisMax\" : false,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder4.setcutoffFrequency((java.lang.Float) 1.0f);
        multiMatchQueryBuilder4.maxExpansions = 0;
        multiMatchQueryBuilder4.setlenient((java.lang.Boolean) true);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNull(type10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
    }

    @Test
    public void test13659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13659");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        java.lang.String str9 = multiMatchQueryBuilder4.getrewrite();
        java.lang.String str10 = multiMatchQueryBuilder4.fuzzyRewrite;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.useDisMax(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.cutoffFrequency((float) 'a');
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
    }

    @Test
    public void test13660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13660");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.fuzzyRewrite("hi!");
        multiMatchQueryBuilder4.analyzer = "hi!";
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery18 = null;
        multiMatchQueryBuilder4.zeroTermsQuery = zeroTermsQuery18;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder4.useDisMax(true);
        multiMatchQueryBuilder4.tieBreaker = 52.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder4.minimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder4.slop((int) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type28 = multiMatchQueryBuilder4.type;
        java.lang.Object obj29 = multiMatchQueryBuilder4.gettext();
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder30 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params31 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder32 = multiMatchQueryBuilder4.toXContent(xContentBuilder30, params31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(type28);
        org.junit.Assert.assertEquals("'" + obj29 + "' != '" + "multi_match" + "'", obj29, "multi_match");
        org.junit.Assert.assertNotNull(params31);
    }

    @Test
    public void test13661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13661");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        java.lang.Integer int10 = multiMatchQueryBuilder4.slop;
        multiMatchQueryBuilder4.prefixLength = 10;
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap13 = null;
        multiMatchQueryBuilder4.setfieldsBoosts(strObjectFloatHashMap13);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.field("", (float) (byte) 100);
        java.lang.String str18 = multiMatchQueryBuilder17.getminimumShouldMatch();
        org.elasticsearch.index.query.Operator operator19 = multiMatchQueryBuilder17.getoperator();
        java.lang.Float float20 = multiMatchQueryBuilder17.getcutoffFrequency();
        java.lang.String str21 = multiMatchQueryBuilder17.rewrite;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(operator19);
        org.junit.Assert.assertNull(float20);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test13662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13662");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.minimumShouldMatch("multi_match");
        java.util.List<java.lang.String> strList12 = multiMatchQueryBuilder8.fields;
        java.lang.Object obj13 = multiMatchQueryBuilder8.gettext();
        java.util.List<java.lang.String> strList14 = multiMatchQueryBuilder8.fields;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery15 = multiMatchQueryBuilder8.zeroTermsQuery;
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        java.lang.Integer int18 = multiMatchQueryBuilder8.getprefixLength();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + obj13 + "' != '" + "multi_match" + "'", obj13, "multi_match");
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNull(zeroTermsQuery15);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test13663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13663");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.Object obj12 = multiMatchQueryBuilder4.text;
        multiMatchQueryBuilder4.setrewrite("");
        java.util.List<java.lang.String> strList15 = multiMatchQueryBuilder4.fields;
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap16 = multiMatchQueryBuilder4.fieldsBoosts;
        multiMatchQueryBuilder4.setslop((java.lang.Integer) 100);
        multiMatchQueryBuilder4.setrewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}^35.0\" ],\n    \"analyzer\" : \"multi_match\",\n    \"fuzziness\" : \"FALSE\",\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 0.0\n  }\n}");
        multiMatchQueryBuilder4.setanalyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"max_expansions\\\" : 1,\\n    \\\"lenient\\\" : false,\\n    \\\"cutoff_frequency\\\" : 10.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"slop\" : -1,\n    \"minimumShouldMatch\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"multi_match\\\",\\n    \\\"boost\\\" : 1.0,\\n    \\\"_name\\\" : \\\"multi_match\\\"\\n  }\\n}\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertEquals("'" + obj12 + "' != '" + "multi_match" + "'", obj12, "multi_match");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNull(strObjectFloatHashMap16);
    }

    @Test
    public void test13664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13664");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.String str7 = multiMatchQueryBuilder6.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type8 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type9 = type8.matchQueryType();
        float float10 = type8.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder6.type(type8);
        multiMatchQueryBuilder11.useDisMax = false;
        multiMatchQueryBuilder11.useDisMax = false;
        org.elasticsearch.index.query.QueryValidationException queryValidationException16 = multiMatchQueryBuilder11.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder11.lenient(false);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery19 = null;
        multiMatchQueryBuilder18.setzeroTermsQuery(zeroTermsQuery19);
        java.lang.String[] strArray24 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray24);
        org.elasticsearch.index.query.Operator operator26 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.operator(operator26);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder27.lenient(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type30 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type31 = type30.matchQueryType();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder27.type(type30);
        org.elasticsearch.common.ParseField parseField33 = type30.parseField();
        java.lang.String[] strArray38 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray38);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (byte) 0, strArray38);
        java.lang.String[] strArray44 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray44);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) strArray38, strArray44);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder47 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) parseField33, strArray44);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) zeroTermsQuery19, strArray44);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multi_match" + "'", str7, "multi_match");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type8.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type9.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(queryValidationException16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type30.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type31.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNotNull(parseField33);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertNotNull(strArray44);
    }

    @Test
    public void test13665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13665");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery10 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.lenient(false);
        multiMatchQueryBuilder8.setmaxExpansions((java.lang.Integer) 1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery16 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery16);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder8.boost((float) 10L);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder8.rewrite("multi_match");
        org.elasticsearch.common.unit.Fuzziness fuzziness22 = multiMatchQueryBuilder8.getfuzziness();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder8.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"type\" : \"phrase_prefix\",\n    \"slop\" : 10,\n    \"max_expansions\" : 1,\n    \"fuzzy_rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"multi_match\\\",\\n    \\\"boost\\\" : 1.0,\\n    \\\"_name\\\" : \\\"multi_match\\\"\\n  }\\n}\",\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}", 0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder8.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder29.analyzer = "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"rewrite\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"multi_match\\\",\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"useDisMax\" : false,\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}";
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNull(fuzziness22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
    }

    @Test
    public void test13666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13666");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        multiMatchQueryBuilder4.fuzzyRewrite = "hi!";
        org.elasticsearch.index.query.Operator operator9 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.operator(operator9);
        multiMatchQueryBuilder10.analyzer = "{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}";
        java.lang.String[] strArray16 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray16);
        org.elasticsearch.index.query.Operator operator18 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.operator(operator18);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException22 = multiMatchQueryBuilder17.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder17.cutoffFrequency((float) (byte) 100);
        java.lang.String str25 = multiMatchQueryBuilder17.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder17.cutoffFrequency((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder29 = multiMatchQueryBuilder17.rewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type30 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        float float31 = type30.tieBreaker();
        multiMatchQueryBuilder17.settype(type30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder10.type(type30);
        java.lang.String str34 = multiMatchQueryBuilder10.getrewrite();
        multiMatchQueryBuilder10.setminimumShouldMatch("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str37 = multiMatchQueryBuilder10.getrewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder10.boost((float) (short) -1);
        multiMatchQueryBuilder39.setfuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"type\" : \"most_fields\",\n    \"tieBreaker\" : 100.0,\n    \"boost\" : 0.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimum_should_match\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNull(queryValidationException22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder29);
        org.junit.Assert.assertTrue("'" + type30 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type30.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 1.0f + "'", float31 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
    }

    @Test
    public void test13667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13667");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        java.lang.Integer int10 = multiMatchQueryBuilder4.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery11 = multiMatchQueryBuilder4.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.boost((float) 0);
        java.lang.String str19 = multiMatchQueryBuilder4.fuzzyRewrite;
        java.lang.String[] strArray23 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray23);
        org.elasticsearch.index.query.Operator operator25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.operator(operator25);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = multiMatchQueryBuilder24.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap29 = multiMatchQueryBuilder28.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery30 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder28.zeroTermsQuery(zeroTermsQuery30);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder28.lenient(false);
        multiMatchQueryBuilder28.setmaxExpansions((java.lang.Integer) 1);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery36 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder28.zeroTermsQuery(zeroTermsQuery36);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder37.cutoffFrequency((float) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type40 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        multiMatchQueryBuilder37.settype(type40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder4.fuzziness((java.lang.Object) type40);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type43 = multiMatchQueryBuilder42.type;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder42.prefixLength((-1));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = multiMatchQueryBuilder42.getPROTOTYPE();
        java.lang.String str47 = multiMatchQueryBuilder46.fuzzyRewrite;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNull(int10);
        org.junit.Assert.assertNull(zeroTermsQuery11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
        org.junit.Assert.assertNull(strObjectFloatHashMap29);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertTrue("'" + type40 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type40.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNull(type43);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder46);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"prefixLength\" : 10,\n    \"useDisMax\" : false,\n    \"boost\" : 1.0\n  }\n}" + "'", str47, "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"prefixLength\" : 10,\n    \"useDisMax\" : false,\n    \"boost\" : 1.0\n  }\n}");
    }

    @Test
    public void test13668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13668");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        multiMatchQueryBuilder4.fuzzyRewrite = "hi!";
        org.elasticsearch.index.query.Operator operator9 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.operator(operator9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.fuzzyRewrite("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.rewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray18 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray18);
        org.elasticsearch.index.query.Operator operator20 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder19.operator(operator20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder19.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException24 = multiMatchQueryBuilder19.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder19.cutoffFrequency((float) (byte) 100);
        float float27 = multiMatchQueryBuilder19.boost();
        multiMatchQueryBuilder19.setanalyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder19.rewrite("multi_match");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap32 = null;
        multiMatchQueryBuilder31.fieldsBoosts = strObjectFloatHashMap32;
        org.elasticsearch.index.query.Operator operator34 = null;
        multiMatchQueryBuilder31.setoperator(operator34);
        java.lang.String[] strArray39 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray39);
        org.elasticsearch.index.query.Operator operator41 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder40.operator(operator41);
        java.lang.Boolean boolean43 = multiMatchQueryBuilder40.getlenient();
        java.lang.String str44 = multiMatchQueryBuilder40.getfuzzyRewrite();
        multiMatchQueryBuilder40.lenient = true;
        boolean boolean47 = multiMatchQueryBuilder31.equals((java.lang.Object) multiMatchQueryBuilder40);
        java.lang.String[] strArray51 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray51);
        org.elasticsearch.index.query.Operator operator53 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder54 = multiMatchQueryBuilder52.operator(operator53);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = multiMatchQueryBuilder52.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException57 = multiMatchQueryBuilder52.validate();
        java.lang.Integer int58 = multiMatchQueryBuilder52.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery59 = multiMatchQueryBuilder52.getzeroTermsQuery();
        org.elasticsearch.index.query.QueryValidationException queryValidationException60 = multiMatchQueryBuilder52.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type61 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type62 = type61.matchQueryType();
        multiMatchQueryBuilder52.settype(type61);
        multiMatchQueryBuilder31.type = type61;
        multiMatchQueryBuilder14.settype(type61);
        java.lang.Integer int66 = multiMatchQueryBuilder14.getprefixLength();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNull(queryValidationException24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertTrue("'" + float27 + "' != '" + 1.0f + "'", float27 == 1.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(strArray39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNull(boolean43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(strArray51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder54);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder56);
        org.junit.Assert.assertNull(queryValidationException57);
        org.junit.Assert.assertNull(int58);
        org.junit.Assert.assertNull(zeroTermsQuery59);
        org.junit.Assert.assertNull(queryValidationException60);
        org.junit.Assert.assertTrue("'" + type61 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type61.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type62 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type62.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertNull(int66);
    }

    @Test
    public void test13669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13669");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.minimumShouldMatch("multi_match");
        java.lang.String str12 = multiMatchQueryBuilder8.minimumShouldMatch;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "multi_match" + "'", str12, "multi_match");
    }

    @Test
    public void test13670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13670");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.rewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"hi!\",\n    \"lenient\" : true,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        java.util.List<java.lang.String> strList18 = multiMatchQueryBuilder4.fields;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder4.prefixLength((int) ' ');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.boost(0.0f);
        java.lang.Integer int23 = multiMatchQueryBuilder22.getslop();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNull(int23);
    }

    @Test
    public void test13671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13671");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.fuzziness((java.lang.Object) 10);
        multiMatchQueryBuilder8.setanalyzer("multi_match");
        org.elasticsearch.index.query.QueryValidationException queryValidationException13 = multiMatchQueryBuilder8.validate();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery14 = multiMatchQueryBuilder8.zeroTermsQuery;
        java.lang.Integer int15 = multiMatchQueryBuilder8.getmaxExpansions();
        multiMatchQueryBuilder8.setlenient((java.lang.Boolean) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder8.useDisMax(true);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(queryValidationException13);
        org.junit.Assert.assertNull(zeroTermsQuery14);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
    }

    @Test
    public void test13672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13672");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.queryName("");
        multiMatchQueryBuilder14.setrewrite("");
        java.lang.String[] strArray20 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray20);
        org.elasticsearch.index.query.Operator operator22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.operator(operator22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder21.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException26 = multiMatchQueryBuilder21.validate();
        java.lang.Integer int27 = multiMatchQueryBuilder21.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery28 = multiMatchQueryBuilder21.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}", (float) '#');
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = multiMatchQueryBuilder21.fuzziness((java.lang.Object) false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder21.boost((float) 0);
        java.lang.String str36 = multiMatchQueryBuilder21.fuzzyRewrite;
        multiMatchQueryBuilder21.setanalyzer("multi_match");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder21.lenient(true);
        boolean boolean41 = multiMatchQueryBuilder14.equals((java.lang.Object) multiMatchQueryBuilder40);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery42 = multiMatchQueryBuilder14.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder44 = multiMatchQueryBuilder14.slop(1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNull(queryValidationException26);
        org.junit.Assert.assertNull(int27);
        org.junit.Assert.assertNull(zeroTermsQuery28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(zeroTermsQuery42);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder44);
    }

    @Test
    public void test13673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13673");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder4.tieBreaker((float) (-1));
        multiMatchQueryBuilder4.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.useDisMax(true);
        multiMatchQueryBuilder17.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimum_should_match\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String[] strArray23 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray23);
        org.elasticsearch.index.query.Operator operator25 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.operator(operator25);
        java.lang.String str27 = multiMatchQueryBuilder24.getWriteableName();
        org.elasticsearch.common.unit.Fuzziness fuzziness28 = multiMatchQueryBuilder24.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder24.tieBreaker((float) (short) 0);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type31 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        multiMatchQueryBuilder24.settype(type31);
        multiMatchQueryBuilder17.settype(type31);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery34 = multiMatchQueryBuilder17.zeroTermsQuery;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder17.slop((int) (byte) 0);
        org.elasticsearch.index.query.Operator operator37 = null;
        multiMatchQueryBuilder36.setoperator(operator37);
        multiMatchQueryBuilder36.setfuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzyRewrite\" : \"hi!\",\n    \"tieBreaker\" : 100.0,\n    \"cutoffFrequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder36.prefixLength = 0;
        java.lang.String str43 = multiMatchQueryBuilder36.getWriteableName();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "multi_match" + "'", str27, "multi_match");
        org.junit.Assert.assertNull(fuzziness28);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type31.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNull(zeroTermsQuery34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "multi_match" + "'", str43, "multi_match");
    }

    @Test
    public void test13674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13674");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder6.lenient(false);
        java.lang.Integer int9 = multiMatchQueryBuilder8.slop;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.analyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"cutoff_frequency\" : 10.0,\n    \"boost\" : 1.0\n  }\n}");
        java.lang.String str12 = multiMatchQueryBuilder8.minimumShouldMatch;
        multiMatchQueryBuilder8.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0,\n    \"_name\" : \"\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder8.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder8.setuseDisMax((java.lang.Boolean) true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder8.tieBreaker((float) 100L);
        java.lang.String str21 = multiMatchQueryBuilder8.getrewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder8.lenient(false);
        multiMatchQueryBuilder23.prefixLength = 0;
        java.lang.Boolean boolean26 = multiMatchQueryBuilder23.lenient;
        java.lang.Boolean boolean27 = multiMatchQueryBuilder23.useDisMax;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery28 = null;
        multiMatchQueryBuilder23.zeroTermsQuery = zeroTermsQuery28;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertEquals("'" + boolean26 + "' != '" + false + "'", boolean26, false);
        org.junit.Assert.assertEquals("'" + boolean27 + "' != '" + true + "'", boolean27, true);
    }

    @Test
    public void test13675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13675");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.util.List<java.lang.String> strList12 = multiMatchQueryBuilder4.fields;
        java.lang.String str13 = multiMatchQueryBuilder4.getNAME();
        java.lang.String str14 = multiMatchQueryBuilder4.getrewrite();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "multi_match" + "'", str13, "multi_match");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test13676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13676");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency(0.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder4.tieBreaker((float) (-1));
        multiMatchQueryBuilder4.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder4.useDisMax(true);
        java.lang.Integer int18 = multiMatchQueryBuilder17.getslop();
        org.elasticsearch.common.unit.Fuzziness fuzziness19 = multiMatchQueryBuilder17.fuzziness;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder17.tieBreaker((float) (byte) 0);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNull(int18);
        org.junit.Assert.assertNull(fuzziness19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
    }

    @Test
    public void test13677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13677");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap9 = multiMatchQueryBuilder8.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery10 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.zeroTermsQuery(zeroTermsQuery10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.lenient(false);
        multiMatchQueryBuilder8.setcutoffFrequency((java.lang.Float) 1.0f);
        org.elasticsearch.index.query.QueryValidationException queryValidationException16 = multiMatchQueryBuilder8.validate();
        multiMatchQueryBuilder8.setrewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimumShouldMatch\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"slop\" : 0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder8.lenient = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder8.lenient(false);
        java.lang.Integer int23 = multiMatchQueryBuilder22.slop;
        java.lang.String[] strArray27 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray27);
        org.elasticsearch.index.query.Operator operator29 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder30 = multiMatchQueryBuilder28.operator(operator29);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = multiMatchQueryBuilder28.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException33 = multiMatchQueryBuilder28.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder28.cutoffFrequency((float) (byte) 100);
        float float36 = multiMatchQueryBuilder28.boost();
        multiMatchQueryBuilder28.setanalyzer("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type39 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type40 = type39.matchQueryType();
        float float41 = type39.tieBreaker();
        float float42 = type39.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder28.fuzziness((java.lang.Object) type39);
        float float44 = type39.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder45 = multiMatchQueryBuilder22.type(type39);
        java.lang.String str46 = multiMatchQueryBuilder22.getWriteableName();
        java.lang.String str47 = multiMatchQueryBuilder22.getfuzzyRewrite();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(strObjectFloatHashMap9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNull(queryValidationException16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNull(int23);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder30);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder32);
        org.junit.Assert.assertNull(queryValidationException33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertTrue("'" + float36 + "' != '" + 1.0f + "'", float36 == 1.0f);
        org.junit.Assert.assertTrue("'" + type39 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type39.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type40 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type40.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float41 + "' != '" + 0.0f + "'", float41 == 0.0f);
        org.junit.Assert.assertTrue("'" + float42 + "' != '" + 0.0f + "'", float42 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "multi_match" + "'", str46, "multi_match");
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test13678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13678");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.Boolean boolean7 = multiMatchQueryBuilder4.getlenient();
        multiMatchQueryBuilder4.setmaxExpansions((java.lang.Integer) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency(0.0f);
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder11.fuzziness;
        java.lang.Integer int13 = multiMatchQueryBuilder11.slop;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder11.tieBreaker((float) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder11.getPROTOTYPE();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(boolean7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(fuzziness12);
        org.junit.Assert.assertNull(int13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
    }

    @Test
    public void test13679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13679");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        multiMatchQueryBuilder4.fuzzyRewrite = "hi!";
        java.lang.String str9 = multiMatchQueryBuilder4.rewrite;
        java.lang.Boolean boolean10 = multiMatchQueryBuilder4.getlenient();
        java.lang.String str11 = multiMatchQueryBuilder4.minimumShouldMatch;
        multiMatchQueryBuilder4.setslop((java.lang.Integer) 32);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.slop((int) (byte) 1);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(boolean10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
    }

    @Test
    public void test13680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13680");
        java.lang.Object obj0 = null;
        java.lang.String[] strArray4 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder5 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray4);
        org.elasticsearch.index.query.Operator operator6 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder7 = multiMatchQueryBuilder5.operator(operator6);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = multiMatchQueryBuilder5.field("");
        java.lang.String str10 = multiMatchQueryBuilder5.getrewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder5.minimumShouldMatch("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder5.field("hi!", (float) (byte) 0);
        java.lang.String[] strArray19 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray19);
        org.elasticsearch.index.query.Operator operator21 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder20.operator(operator21);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder20.field("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder24.fuzziness((java.lang.Object) 10);
        java.lang.Boolean boolean27 = multiMatchQueryBuilder24.useDisMax;
        java.lang.String[] strArray31 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray31);
        org.elasticsearch.index.query.Operator operator33 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder32.operator(operator33);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder36 = multiMatchQueryBuilder32.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException37 = multiMatchQueryBuilder32.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder39 = multiMatchQueryBuilder32.cutoffFrequency((float) (byte) 100);
        java.lang.String str40 = multiMatchQueryBuilder32.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder42 = multiMatchQueryBuilder32.queryName("");
        multiMatchQueryBuilder42.setslop((java.lang.Integer) 0);
        java.lang.String[] strArray48 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder49 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray48);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0, strArray48);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder51 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) boolean27, strArray48);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder52 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "hi!", strArray48);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = new org.elasticsearch.index.query.MultiMatchQueryBuilder(obj0, strArray48);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(strArray19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNull(boolean27);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder36);
        org.junit.Assert.assertNull(queryValidationException37);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder39);
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder42);
        org.junit.Assert.assertNotNull(strArray48);
    }

    @Test
    public void test13681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13681");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        java.lang.String str7 = multiMatchQueryBuilder6.getName();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type8 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        org.elasticsearch.index.search.MatchQuery.Type type9 = type8.matchQueryType();
        float float10 = type8.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder6.type(type8);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery12 = multiMatchQueryBuilder11.zeroTermsQuery;
        java.lang.Boolean boolean13 = multiMatchQueryBuilder11.useDisMax;
        java.lang.String str14 = multiMatchQueryBuilder11.rewrite;
        multiMatchQueryBuilder11.setfuzzyRewrite("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"boost\" : 1.0\n  }\n}");
        java.lang.Float float17 = multiMatchQueryBuilder11.gettieBreaker();
        org.elasticsearch.index.query.Operator operator18 = null;
        multiMatchQueryBuilder11.operator = operator18;
        multiMatchQueryBuilder11.settieBreaker((java.lang.Float) (-1.0f));
        multiMatchQueryBuilder11.minimumShouldMatch = "{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"slop\\\" : 0,\\n    \\\"fuzzy_rewrite\\\" : \\\"hi!\\\",\\n    \\\"tie_breaker\\\" : 100.0,\\n    \\\"cutoff_frequency\\\" : 100.0,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\",\n    \"prefixLength\" : -1,\n    \"maxExpansions\" : 100,\n    \"tieBreaker\" : -1.0,\n    \"cutoffFrequency\" : 0.0,\n    \"boost\" : 1.0\n  }\n}";
        multiMatchQueryBuilder11.setlenient((java.lang.Boolean) false);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "multi_match" + "'", str7, "multi_match");
        org.junit.Assert.assertTrue("'" + type8 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type8.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + type9 + "' != '" + org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN + "'", type9.equals(org.elasticsearch.index.search.MatchQuery.Type.BOOLEAN));
        org.junit.Assert.assertTrue("'" + float10 + "' != '" + 0.0f + "'", float10 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(zeroTermsQuery12);
        org.junit.Assert.assertNull(boolean13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(float17);
    }

    @Test
    public void test13682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13682");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        java.lang.String str12 = multiMatchQueryBuilder4.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.queryName("");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder4.tieBreaker((float) '4');
        java.lang.String str17 = multiMatchQueryBuilder4.fuzzyRewrite;
        java.lang.Integer int18 = multiMatchQueryBuilder4.slop;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery19 = null;
        multiMatchQueryBuilder4.setzeroTermsQuery(zeroTermsQuery19);
        multiMatchQueryBuilder4.slop = 32;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test13683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13683");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder4.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder4.fuzzyRewrite("hi!");
        multiMatchQueryBuilder4.analyzer = "hi!";
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery18 = null;
        multiMatchQueryBuilder4.zeroTermsQuery = zeroTermsQuery18;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder4.slop((int) (short) 0);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery22 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder4.zeroTermsQuery(zeroTermsQuery22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"minimumShouldMatch\" : \"multi_match\",\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder25.cutoffFrequency((float) '4');
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery28 = null;
        multiMatchQueryBuilder27.setzeroTermsQuery(zeroTermsQuery28);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap30 = multiMatchQueryBuilder27.fieldsBoosts;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNull(strObjectFloatHashMap30);
    }

    @Test
    public void test13684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13684");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException9 = multiMatchQueryBuilder4.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder4.cutoffFrequency((float) (byte) 100);
        float float12 = multiMatchQueryBuilder4.boost();
        multiMatchQueryBuilder4.setanalyzer("");
        java.lang.Boolean boolean15 = multiMatchQueryBuilder4.getuseDisMax();
        java.lang.String str16 = multiMatchQueryBuilder4.getrewrite();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder4.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"slop\" : 0,\n    \"fuzzy_rewrite\" : \"hi!\",\n    \"tie_breaker\" : 100.0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder18.fuzzyRewrite = "hi!";
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.field("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\", \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"minimumShouldMatch\\\" : \\\"hi!\\\",\\n    \\\"lenient\\\" : true,\\n    \\\"boost\\\" : 1.0\\n  }\\n}\" ],\n    \"slop\" : 0,\n    \"cutoff_frequency\" : 100.0,\n    \"boost\" : 1.0\n  }\n}");
        multiMatchQueryBuilder22.setmaxExpansions((java.lang.Integer) 52);
        multiMatchQueryBuilder22.setfuzzyRewrite("{\n  \"multiMatch\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\" ],\n    \"slop\" : 0,\n    \"useDisMax\" : false,\n    \"boost\" : 1.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : \\\"multi_match\\\",\\n    \\\"fields\\\" : [ \\\"multi_match\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 1.0\\n  }\\n}\"\n  }\n}");
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNull(queryValidationException9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertTrue("'" + float12 + "' != '" + 1.0f + "'", float12 == 1.0f);
        org.junit.Assert.assertNull(boolean15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
    }

    @Test
    public void test13685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13685");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = multiMatchQueryBuilder4.field("");
        org.elasticsearch.index.query.Operator operator9 = null;
        multiMatchQueryBuilder4.setoperator(operator9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder4.queryName("{\n  \"multi_match\" : {\n    \"query\" : \"multi_match\",\n    \"fields\" : [ \"multi_match\", \"hi!\", \"\" ],\n    \"max_expansions\" : 1,\n    \"lenient\" : false,\n    \"boost\" : 1.0\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder4.prefixLength(0);
        org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder15 = null;
        org.elasticsearch.common.xcontent.ToXContent.Params params16 = org.elasticsearch.common.xcontent.ToXContent.EMPTY_PARAMS;
        // The following exception was thrown during execution in test generation
        try {
            org.elasticsearch.common.xcontent.XContentBuilder xContentBuilder17 = multiMatchQueryBuilder4.toXContent(xContentBuilder15, params16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
        // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertNotNull(params16);
    }

    @Test
    public void test13686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest27.test13686");
        java.lang.String[] strArray3 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder4 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray3);
        org.elasticsearch.index.query.Operator operator5 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder6 = multiMatchQueryBuilder4.operator(operator5);
        org.elasticsearch.index.query.Operator operator7 = null;
        multiMatchQueryBuilder4.operator = operator7;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder4.fuzzyRewrite("multi_match");
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery11 = multiMatchQueryBuilder4.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder4.prefixLength((int) (byte) 10);
        java.lang.String[] strArray17 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray17);
        org.elasticsearch.index.query.Operator operator19 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder20 = multiMatchQueryBuilder18.operator(operator19);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder22 = multiMatchQueryBuilder18.field("");
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap23 = multiMatchQueryBuilder22.getfieldsBoosts();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery24 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder22.zeroTermsQuery(zeroTermsQuery24);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder22.useDisMax(false);
        java.lang.Object obj28 = multiMatchQueryBuilder27.text;
        java.lang.String[] strArray32 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray32);
        org.elasticsearch.index.query.Operator operator34 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder33.operator(operator34);
        java.lang.Boolean boolean36 = multiMatchQueryBuilder33.getlenient();
        multiMatchQueryBuilder33.setfuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type39 = multiMatchQueryBuilder33.gettype();
        multiMatchQueryBuilder33.setslop((java.lang.Integer) (-1));
        java.lang.String[] strArray45 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder46 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray45);
        org.elasticsearch.index.query.Operator operator47 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder48 = multiMatchQueryBuilder46.operator(operator47);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder50 = multiMatchQueryBuilder46.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException51 = multiMatchQueryBuilder46.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder53 = multiMatchQueryBuilder46.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder46.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder57 = multiMatchQueryBuilder46.fuzzyRewrite("hi!");
        org.elasticsearch.common.unit.Fuzziness fuzziness58 = multiMatchQueryBuilder46.getfuzziness();
        java.lang.Boolean boolean59 = multiMatchQueryBuilder46.getuseDisMax();
        org.elasticsearch.index.query.Operator operator60 = null;
        multiMatchQueryBuilder46.operator = operator60;
        java.lang.String[] strArray65 = new java.lang.String[] { "multi_match", "hi!" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder66 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) "multi_match", strArray65);
        org.elasticsearch.index.query.Operator operator67 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder68 = multiMatchQueryBuilder66.operator(operator67);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder70 = multiMatchQueryBuilder66.field("");
        org.elasticsearch.index.query.QueryValidationException queryValidationException71 = multiMatchQueryBuilder66.validate();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder73 = multiMatchQueryBuilder66.cutoffFrequency((float) (byte) 100);
        multiMatchQueryBuilder66.settieBreaker((java.lang.Float) 100.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder77 = multiMatchQueryBuilder66.fuzzyRewrite("hi!");
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type78 = multiMatchQueryBuilder66.type;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type79 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.common.ParseField parseField80 = type79.parseField();
        multiMatchQueryBuilder66.type = type79;
        multiMatchQueryBuilder46.settype(type79);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder83 = multiMatchQueryBuilder33.type(type79);
        multiMatchQueryBuilder27.type = type79;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder85 = multiMatchQueryBuilder4.type(type79);
        java.lang.String str86 = multiMatchQueryBuilder4.rewrite;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder88 = multiMatchQueryBuilder4.field("");
        java.lang.Object obj89 = multiMatchQueryBuilder4.gettext();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap90 = multiMatchQueryBuilder4.fieldsBoosts;
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder6);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(zeroTermsQuery11);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder22);
        org.junit.Assert.assertNull(strObjectFloatHashMap23);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertEquals("'" + obj28 + "' != '" + "multi_match" + "'", obj28, "multi_match");
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNull(boolean36);
        org.junit.Assert.assertNull(type39);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder48);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder50);
        org.junit.Assert.assertNull(queryValidationException51);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder53);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder57);
        org.junit.Assert.assertNull(fuzziness58);
        org.junit.Assert.assertNull(boolean59);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder68);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder70);
        org.junit.Assert.assertNull(queryValidationException71);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder73);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder77);
        org.junit.Assert.assertNull(type78);
        org.junit.Assert.assertTrue("'" + type79 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type79.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(parseField80);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder83);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder85);
        org.junit.Assert.assertNull(str86);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder88);
        org.junit.Assert.assertEquals("'" + obj89 + "' != '" + "multi_match" + "'", obj89, "multi_match");
        org.junit.Assert.assertNull(strObjectFloatHashMap90);
    }
}
