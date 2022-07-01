import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest32 {

    public static boolean debug = false;

    @Test
    public void test16001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16001");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery11 = null;
        multiMatchQueryBuilder10.setzeroTermsQuery(zeroTermsQuery11);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder14 = multiMatchQueryBuilder10.useDisMax(true);
        java.lang.Object obj15 = multiMatchQueryBuilder10.gettext();
        java.lang.Float float16 = multiMatchQueryBuilder10.getboost();
        java.lang.String str17 = multiMatchQueryBuilder10.analyzer;
        java.lang.String str18 = null; // flaky: multiMatchQueryBuilder10.toString();
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator19 = multiMatchQueryBuilder10.getoperator();
        multiMatchQueryBuilder10.maxExpansions = 0;
        multiMatchQueryBuilder10.useDisMax = true;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery24 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder10.zeroTermsQuery(zeroTermsQuery24);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder14);
        org.junit.Assert.assertEquals("'" + obj15 + "' != '" + '#' + "'", obj15, '#');
        org.junit.Assert.assertNull(float16);
        org.junit.Assert.assertNull(str17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"useDisMax\" : true\n  }\n}" + "'", str18, "{\n  \"multiMatch\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"useDisMax\" : true\n  }\n}");
        org.junit.Assert.assertNull(operator19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
    }

    @Test
    public void test16002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16002");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.slop((int) ' ');
        multiMatchQueryBuilder8.setslop((java.lang.Integer) (-1));
        java.lang.String[] strArray22 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray22);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = multiMatchQueryBuilder23.useDisMax(false);
        multiMatchQueryBuilder25.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : false\n  }\n}");
        java.lang.String str28 = null; // flaky: multiMatchQueryBuilder25.toString();
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type29 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float30 = type29.tieBreaker();
        float float31 = type29.tieBreaker();
        float float32 = type29.tieBreaker();
        multiMatchQueryBuilder25.settype(type29);
        float float34 = type29.tieBreaker();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder8.type(type29);
        java.lang.Float float36 = multiMatchQueryBuilder35.getcutoffFrequency();
        multiMatchQueryBuilder35.settieBreaker((java.lang.Float) 1.0f);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery39 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder40 = multiMatchQueryBuilder35.zeroTermsQuery(zeroTermsQuery39);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder25);
// flaky:         org.junit.Assert.assertEquals("'" + str28 + "' != '" + "{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}\",\n    \"useDisMax\" : false\n  }\n}" + "'", str28, "{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}\",\n    \"useDisMax\" : false\n  }\n}");
        org.junit.Assert.assertTrue("'" + type29 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type29.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + float30 + "' != '" + 0.0f + "'", float30 == 0.0f);
        org.junit.Assert.assertTrue("'" + float31 + "' != '" + 0.0f + "'", float31 == 0.0f);
        org.junit.Assert.assertTrue("'" + float32 + "' != '" + 0.0f + "'", float32 == 0.0f);
        org.junit.Assert.assertTrue("'" + float34 + "' != '" + 0.0f + "'", float34 == 0.0f);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNull(float36);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder40);
    }

    @Test
    public void test16003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16003");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = multiMatchQueryBuilder8.boost((float) (short) 100);
        java.lang.Integer int12 = multiMatchQueryBuilder8.getmaxExpansions();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        multiMatchQueryBuilder8.zeroTermsQuery = zeroTermsQuery13;
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator15 = multiMatchQueryBuilder8.operator;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder8.fuzzyRewrite("");
        multiMatchQueryBuilder17.prefixLength = 0;
        multiMatchQueryBuilder17.fuzzyRewrite = "{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"use_dis_max\" : true,\n    \"cutoff_frequency\" : 100.0\n  }\n}";
        multiMatchQueryBuilder17.useDisMax = false;
        java.util.List<java.lang.String> strList24 = multiMatchQueryBuilder17.fields;
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(zeroTermsQuery9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder11);
        org.junit.Assert.assertNull(int12);
        org.junit.Assert.assertNull(operator15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(strList24);
    }

    @Test
    public void test16004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16004");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        java.lang.String str13 = multiMatchQueryBuilder10.getqueryName();
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery14 = null;
        multiMatchQueryBuilder10.zeroTermsQuery = zeroTermsQuery14;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery16 = null;
        multiMatchQueryBuilder10.setzeroTermsQuery(zeroTermsQuery16);
        multiMatchQueryBuilder10.lenient = false;
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator20 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder10.operator(operator20);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder24 = multiMatchQueryBuilder21.field("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"boost\" : 100.0\n  }\n}", (float) (byte) 10);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder26 = multiMatchQueryBuilder21.lenient(false);
        multiMatchQueryBuilder21.setlenient((java.lang.Boolean) false);
        multiMatchQueryBuilder21.settieBreaker((java.lang.Float) 10.0f);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type31 = multiMatchQueryBuilder21.type;
        multiMatchQueryBuilder21.settieBreaker((java.lang.Float) 0.0f);
        multiMatchQueryBuilder21.lenient = false;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder21.boost(0.0f);
        java.lang.Boolean boolean38 = multiMatchQueryBuilder21.getuseDisMax();
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(fuzziness12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder24);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder26);
        org.junit.Assert.assertNull(type31);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertEquals("'" + boolean38 + "' != '" + false + "'", boolean38, false);
    }

    @Test
    public void test16005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16005");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery9 = multiMatchQueryBuilder8.getzeroTermsQuery();
        multiMatchQueryBuilder8.cutoffFrequency = 0.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder13 = multiMatchQueryBuilder8.prefixLength((int) (short) 1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder15 = multiMatchQueryBuilder13.useDisMax(false);
        java.lang.Boolean boolean16 = multiMatchQueryBuilder15.getuseDisMax();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder18 = multiMatchQueryBuilder15.minimumShouldMatch("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"use_dis_max\\\" : false\\n  }\\n}\",\n    \"use_dis_max\" : false\n  }\n}");
        java.lang.String str19 = multiMatchQueryBuilder15.getanalyzer();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder15.lenient(true);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder21.cutoffFrequency((float) (short) 10);
        java.lang.String[] strArray31 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder32 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray31);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery33 = multiMatchQueryBuilder32.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder35 = multiMatchQueryBuilder32.boost((float) (short) 100);
        java.lang.Integer int36 = multiMatchQueryBuilder32.getmaxExpansions();
        multiMatchQueryBuilder32.setcutoffFrequency((java.lang.Float) 10.0f);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap39 = multiMatchQueryBuilder32.fieldsBoosts;
        org.elasticsearch.common.unit.Fuzziness fuzziness40 = null;
        multiMatchQueryBuilder32.fuzziness = fuzziness40;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder43 = multiMatchQueryBuilder32.maxExpansions((int) (byte) 0);
        java.lang.String str44 = multiMatchQueryBuilder32.getminimumShouldMatch();
        java.lang.String str45 = multiMatchQueryBuilder32.getanalyzer();
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator46 = null;
        multiMatchQueryBuilder32.setoperator(operator46);
        java.lang.String[] strArray55 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder56 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray55);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery57 = multiMatchQueryBuilder56.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder59 = multiMatchQueryBuilder56.boost((float) (short) 100);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type60 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX;
        multiMatchQueryBuilder59.settype(type60);
        float float62 = type60.tieBreaker();
        org.elasticsearch.common.ParseField parseField63 = type60.parseField();
        multiMatchQueryBuilder32.type = type60;
        multiMatchQueryBuilder21.type = type60;
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNull(zeroTermsQuery9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder13);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder15);
        org.junit.Assert.assertEquals("'" + boolean16 + "' != '" + false + "'", boolean16, false);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNotNull(strArray31);
        org.junit.Assert.assertNull(zeroTermsQuery33);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder35);
        org.junit.Assert.assertNull(int36);
        org.junit.Assert.assertNull(strObjectFloatHashMap39);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder43);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertNotNull(strArray55);
        org.junit.Assert.assertNull(zeroTermsQuery57);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder59);
        org.junit.Assert.assertTrue("'" + type60 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX + "'", type60.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.PHRASE_PREFIX));
        org.junit.Assert.assertTrue("'" + float62 + "' != '" + 0.0f + "'", float62 == 0.0f);
        org.junit.Assert.assertNotNull(parseField63);
    }

    @Test
    public void test16006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16006");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        multiMatchQueryBuilder8.setmaxExpansions((java.lang.Integer) 100);
        java.lang.String[] strArray18 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray18);
        java.lang.String str20 = multiMatchQueryBuilder19.analyzer;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder21 = multiMatchQueryBuilder8.type((java.lang.Object) str20);
        multiMatchQueryBuilder21.tieBreaker = 10.0f;
        multiMatchQueryBuilder21.setanalyzer("{\n  \"multi_match\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"hi!\"\n  }\n}");
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder27 = multiMatchQueryBuilder21.analyzer("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"analyzer\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"prefixLength\\\" : 1,\\n    \\\"useDisMax\\\" : false,\\n    \\\"cutoffFrequency\\\" : 0.0\\n  }\\n}\",\n    \"boost\" : 100.0,\n    \"slop\" : 10,\n    \"maxExpansions\" : 100,\n    \"minimumShouldMatch\" : \"{\\n  \\\"multiMatch\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ],\\n    \\\"boost\\\" : 100.0,\\n    \\\"maxExpansions\\\" : 0,\\n    \\\"cutoffFrequency\\\" : 10.0\\n  }\\n}\",\n    \"lenient\" : true\n  }\n}");
        multiMatchQueryBuilder27.lenient = true;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = multiMatchQueryBuilder27.queryName("{\n  \"multiMatch\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"slop\" : 10,\n    \"maxExpansions\" : 100,\n    \"useDisMax\" : false,\n    \"tieBreaker\" : 10.0,\n    \"Name\" : \"{\\n  \\\"multi_match\\\" : {\\n    \\\"query\\\" : -1.0,\\n    \\\"fields\\\" : [ \\\"hi!\\\", \\\"\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"hi!\\\", \\\"\\\" ]\\n  }\\n}\"\n  }\n}");
        java.lang.Object obj32 = multiMatchQueryBuilder31.text;
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder21);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder27);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder31);
        org.junit.Assert.assertEquals("'" + obj32 + "' != '" + (-1.0f) + "'", obj32, (-1.0f));
    }

    @Test
    public void test16007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16007");
        java.lang.String[] strArray9 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder11 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray9);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) 0.0d, strArray9);
        multiMatchQueryBuilder12.maxExpansions = (-1);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder12.prefixLength((int) (byte) 0);
        java.lang.Object obj17 = multiMatchQueryBuilder16.gettext();
        multiMatchQueryBuilder16.setprefixLength((java.lang.Integer) 32);
        multiMatchQueryBuilder16.setcutoffFrequency((java.lang.Float) (-1.0f));
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder23 = multiMatchQueryBuilder16.boost(0.0f);
        java.lang.String str24 = multiMatchQueryBuilder16.getqueryName();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertEquals("'" + obj17 + "' != '" + 0.0d + "'", obj17, 0.0d);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test16008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16008");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type11 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder12 = multiMatchQueryBuilder8.type(type11);
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap13 = multiMatchQueryBuilder12.getfieldsBoosts();
        multiMatchQueryBuilder12.setcutoffFrequency((java.lang.Float) (-1.0f));
        java.lang.Integer int16 = multiMatchQueryBuilder12.getslop();
        java.lang.Integer int17 = multiMatchQueryBuilder12.slop;
        java.lang.Integer int18 = multiMatchQueryBuilder12.prefixLength;
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertTrue("'" + type11 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS + "'", type11.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.MOST_FIELDS));
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder12);
        org.junit.Assert.assertNull(strObjectFloatHashMap13);
        org.junit.Assert.assertNull(int16);
        org.junit.Assert.assertNull(int17);
        org.junit.Assert.assertNull(int18);
    }

    @Test
    public void test16009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16009");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        multiMatchQueryBuilder10.zeroTermsQuery = zeroTermsQuery13;
        java.lang.Integer int15 = multiMatchQueryBuilder10.getmaxExpansions();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.maxExpansions((int) (short) 0);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery18 = null;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder19 = multiMatchQueryBuilder17.zeroTermsQuery(zeroTermsQuery18);
        java.lang.Boolean boolean20 = multiMatchQueryBuilder17.getuseDisMax();
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap21 = multiMatchQueryBuilder17.fieldsBoosts;
        multiMatchQueryBuilder17.setuseDisMax((java.lang.Boolean) false);
        java.lang.Integer int24 = multiMatchQueryBuilder17.slop;
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(fuzziness12);
        org.junit.Assert.assertNull(int15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder19);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
        org.junit.Assert.assertNull(strObjectFloatHashMap21);
        org.junit.Assert.assertNull(int24);
    }

    @Test
    public void test16010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16010");
        java.lang.String[] strArray8 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder9 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray8);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) '#', strArray8);
        java.lang.Integer int11 = multiMatchQueryBuilder10.maxExpansions;
        com.carrotsearch.hppc.ObjectFloatHashMap<java.lang.String> strObjectFloatHashMap12 = multiMatchQueryBuilder10.fieldsBoosts;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        multiMatchQueryBuilder10.zeroTermsQuery = zeroTermsQuery13;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder16 = multiMatchQueryBuilder10.maxExpansions((int) 'a');
        java.lang.String[] strArray24 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder25 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray24);
        multiMatchQueryBuilder25.maxExpansions = 0;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder28 = null; // flaky: multiMatchQueryBuilder10.fuzziness((java.lang.Object) multiMatchQueryBuilder25);
        java.util.List<java.lang.String> strList29 = null; // flaky: multiMatchQueryBuilder28.getfields();
// flaky:         multiMatchQueryBuilder28.boost = 32.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder33 = null; // flaky: multiMatchQueryBuilder28.boost((float) (byte) -1);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNull(int11);
        org.junit.Assert.assertNull(strObjectFloatHashMap12);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder16);
        org.junit.Assert.assertNotNull(strArray24);
// flaky:         org.junit.Assert.assertNotNull(multiMatchQueryBuilder28);
// flaky:         org.junit.Assert.assertNotNull(strList29);
// flaky:         org.junit.Assert.assertNotNull(multiMatchQueryBuilder33);
    }

    @Test
    public void test16011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest32.test16011");
        java.lang.String[] strArray7 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder8 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray7);
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder10 = multiMatchQueryBuilder8.useDisMax(false);
        java.lang.String str11 = multiMatchQueryBuilder10.getminimumShouldMatch();
        org.elasticsearch.common.unit.Fuzziness fuzziness12 = multiMatchQueryBuilder10.fuzziness;
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery13 = null;
        multiMatchQueryBuilder10.zeroTermsQuery = zeroTermsQuery13;
        java.lang.Float float15 = multiMatchQueryBuilder10.cutoffFrequency;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder17 = multiMatchQueryBuilder10.field("{\n  \"multi_match\" : {\n    \"query\" : -1.0,\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ]\n  }\n}");
        org.elasticsearch.index.query.MatchQueryBuilder.Operator operator18 = multiMatchQueryBuilder17.getoperator();
        multiMatchQueryBuilder17.useDisMax = false;
        multiMatchQueryBuilder17.analyzer = "{\n  \"multiMatch\" : {\n    \"query\" : \"#\",\n    \"fields\" : [ \"hi!\", \"\", \"hi!\", \"hi!\", \"hi!\", \"\" ],\n    \"useDisMax\" : true\n  }\n}";
        java.lang.String[] strArray30 = new java.lang.String[] { "hi!", "", "hi!", "hi!", "hi!", "" };
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder31 = new org.elasticsearch.index.query.MultiMatchQueryBuilder((java.lang.Object) (-1.0f), strArray30);
        org.elasticsearch.index.query.MatchQueryBuilder.ZeroTermsQuery zeroTermsQuery32 = multiMatchQueryBuilder31.getzeroTermsQuery();
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder34 = multiMatchQueryBuilder31.boost((float) (short) 100);
        java.lang.Integer int35 = multiMatchQueryBuilder34.prefixLength;
        org.elasticsearch.index.query.MultiMatchQueryBuilder multiMatchQueryBuilder37 = multiMatchQueryBuilder34.boost((float) '4');
        multiMatchQueryBuilder34.setfuzzyRewrite("");
        java.lang.String str40 = multiMatchQueryBuilder34.getfuzzyRewrite();
        java.lang.Boolean boolean41 = multiMatchQueryBuilder34.lenient;
        java.lang.Object obj42 = multiMatchQueryBuilder34.text;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type43 = org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS;
        float float44 = type43.tieBreaker();
        float float45 = type43.tieBreaker();
        multiMatchQueryBuilder34.settype(type43);
        org.elasticsearch.common.ParseField parseField47 = type43.parseField();
        multiMatchQueryBuilder17.type = type43;
        multiMatchQueryBuilder17.boost = 100.0f;
        org.elasticsearch.index.query.MultiMatchQueryBuilder.Type type51 = null;
        multiMatchQueryBuilder17.type = type51;
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(fuzziness12);
        org.junit.Assert.assertNull(float15);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder17);
        org.junit.Assert.assertNull(operator18);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNull(zeroTermsQuery32);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder34);
        org.junit.Assert.assertNull(int35);
        org.junit.Assert.assertNotNull(multiMatchQueryBuilder37);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNull(boolean41);
        org.junit.Assert.assertEquals("'" + obj42 + "' != '" + (-1.0f) + "'", obj42, (-1.0f));
        org.junit.Assert.assertTrue("'" + type43 + "' != '" + org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS + "'", type43.equals(org.elasticsearch.index.query.MultiMatchQueryBuilder.Type.BEST_FIELDS));
        org.junit.Assert.assertTrue("'" + float44 + "' != '" + 0.0f + "'", float44 == 0.0f);
        org.junit.Assert.assertTrue("'" + float45 + "' != '" + 0.0f + "'", float45 == 0.0f);
        org.junit.Assert.assertNotNull(parseField47);
    }
}
